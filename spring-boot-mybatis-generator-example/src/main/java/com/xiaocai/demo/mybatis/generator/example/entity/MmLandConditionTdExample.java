package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MmLandConditionTdExample {
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
    public MmLandConditionTdExample() {
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
     * @Table : mm_land_condition_td
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

        public Criteria andCertitypeIsNull() {
            addCriterion("CERTITYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertitypeIsNotNull() {
            addCriterion("CERTITYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertitypeEqualTo(String value) {
            addCriterion("CERTITYPE =", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotEqualTo(String value) {
            addCriterion("CERTITYPE <>", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeGreaterThan(String value) {
            addCriterion("CERTITYPE >", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTITYPE >=", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeLessThan(String value) {
            addCriterion("CERTITYPE <", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeLessThanOrEqualTo(String value) {
            addCriterion("CERTITYPE <=", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeLike(String value) {
            addCriterion("CERTITYPE like", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotLike(String value) {
            addCriterion("CERTITYPE not like", value, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeIn(List<String> values) {
            addCriterion("CERTITYPE in", values, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotIn(List<String> values) {
            addCriterion("CERTITYPE not in", values, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeBetween(String value1, String value2) {
            addCriterion("CERTITYPE between", value1, value2, "certitype");
            return (Criteria) this;
        }

        public Criteria andCertitypeNotBetween(String value1, String value2) {
            addCriterion("CERTITYPE not between", value1, value2, "certitype");
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

        public Criteria andEndorsetypeIsNull() {
            addCriterion("ENDORSETYPE is null");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeIsNotNull() {
            addCriterion("ENDORSETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeEqualTo(String value) {
            addCriterion("ENDORSETYPE =", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotEqualTo(String value) {
            addCriterion("ENDORSETYPE <>", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeGreaterThan(String value) {
            addCriterion("ENDORSETYPE >", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENDORSETYPE >=", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeLessThan(String value) {
            addCriterion("ENDORSETYPE <", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeLessThanOrEqualTo(String value) {
            addCriterion("ENDORSETYPE <=", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeLike(String value) {
            addCriterion("ENDORSETYPE like", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotLike(String value) {
            addCriterion("ENDORSETYPE not like", value, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeIn(List<String> values) {
            addCriterion("ENDORSETYPE in", values, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotIn(List<String> values) {
            addCriterion("ENDORSETYPE not in", values, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeBetween(String value1, String value2) {
            addCriterion("ENDORSETYPE between", value1, value2, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andEndorsetypeNotBetween(String value1, String value2) {
            addCriterion("ENDORSETYPE not between", value1, value2, "endorsetype");
            return (Criteria) this;
        }

        public Criteria andSignTiIsNull() {
            addCriterion("SIGN_TI is null");
            return (Criteria) this;
        }

        public Criteria andSignTiIsNotNull() {
            addCriterion("SIGN_TI is not null");
            return (Criteria) this;
        }

        public Criteria andSignTiEqualTo(BigDecimal value) {
            addCriterion("SIGN_TI =", value, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiNotEqualTo(BigDecimal value) {
            addCriterion("SIGN_TI <>", value, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiGreaterThan(BigDecimal value) {
            addCriterion("SIGN_TI >", value, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGN_TI >=", value, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiLessThan(BigDecimal value) {
            addCriterion("SIGN_TI <", value, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGN_TI <=", value, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiIn(List<BigDecimal> values) {
            addCriterion("SIGN_TI in", values, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiNotIn(List<BigDecimal> values) {
            addCriterion("SIGN_TI not in", values, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGN_TI between", value1, value2, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGN_TI not between", value1, value2, "signTi");
            return (Criteria) this;
        }

        public Criteria andIfstartIsNull() {
            addCriterion("IFSTART is null");
            return (Criteria) this;
        }

        public Criteria andIfstartIsNotNull() {
            addCriterion("IFSTART is not null");
            return (Criteria) this;
        }

        public Criteria andIfstartEqualTo(String value) {
            addCriterion("IFSTART =", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotEqualTo(String value) {
            addCriterion("IFSTART <>", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartGreaterThan(String value) {
            addCriterion("IFSTART >", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartGreaterThanOrEqualTo(String value) {
            addCriterion("IFSTART >=", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartLessThan(String value) {
            addCriterion("IFSTART <", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartLessThanOrEqualTo(String value) {
            addCriterion("IFSTART <=", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartLike(String value) {
            addCriterion("IFSTART like", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotLike(String value) {
            addCriterion("IFSTART not like", value, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartIn(List<String> values) {
            addCriterion("IFSTART in", values, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotIn(List<String> values) {
            addCriterion("IFSTART not in", values, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartBetween(String value1, String value2) {
            addCriterion("IFSTART between", value1, value2, "ifstart");
            return (Criteria) this;
        }

        public Criteria andIfstartNotBetween(String value1, String value2) {
            addCriterion("IFSTART not between", value1, value2, "ifstart");
            return (Criteria) this;
        }

        public Criteria andNoEndorseIsNull() {
            addCriterion("NO_ENDORSE is null");
            return (Criteria) this;
        }

        public Criteria andNoEndorseIsNotNull() {
            addCriterion("NO_ENDORSE is not null");
            return (Criteria) this;
        }

        public Criteria andNoEndorseEqualTo(String value) {
            addCriterion("NO_ENDORSE =", value, "noEndorse");
            return (Criteria) this;
        }

        public Criteria andNoEndorseNotEqualTo(String value) {
            addCriterion("NO_ENDORSE <>", value, "noEndorse");
            return (Criteria) this;
        }

        public Criteria andNoEndorseGreaterThan(String value) {
            addCriterion("NO_ENDORSE >", value, "noEndorse");
            return (Criteria) this;
        }

        public Criteria andNoEndorseGreaterThanOrEqualTo(String value) {
            addCriterion("NO_ENDORSE >=", value, "noEndorse");
            return (Criteria) this;
        }

        public Criteria andNoEndorseLessThan(String value) {
            addCriterion("NO_ENDORSE <", value, "noEndorse");
            return (Criteria) this;
        }

        public Criteria andNoEndorseLessThanOrEqualTo(String value) {
            addCriterion("NO_ENDORSE <=", value, "noEndorse");
            return (Criteria) this;
        }

        public Criteria andNoEndorseLike(String value) {
            addCriterion("NO_ENDORSE like", value, "noEndorse");
            return (Criteria) this;
        }

        public Criteria andNoEndorseNotLike(String value) {
            addCriterion("NO_ENDORSE not like", value, "noEndorse");
            return (Criteria) this;
        }

        public Criteria andNoEndorseIn(List<String> values) {
            addCriterion("NO_ENDORSE in", values, "noEndorse");
            return (Criteria) this;
        }

        public Criteria andNoEndorseNotIn(List<String> values) {
            addCriterion("NO_ENDORSE not in", values, "noEndorse");
            return (Criteria) this;
        }

        public Criteria andNoEndorseBetween(String value1, String value2) {
            addCriterion("NO_ENDORSE between", value1, value2, "noEndorse");
            return (Criteria) this;
        }

        public Criteria andNoEndorseNotBetween(String value1, String value2) {
            addCriterion("NO_ENDORSE not between", value1, value2, "noEndorse");
            return (Criteria) this;
        }

        public Criteria andCoinpayIsNull() {
            addCriterion("COINPAY is null");
            return (Criteria) this;
        }

        public Criteria andCoinpayIsNotNull() {
            addCriterion("COINPAY is not null");
            return (Criteria) this;
        }

        public Criteria andCoinpayEqualTo(String value) {
            addCriterion("COINPAY =", value, "coinpay");
            return (Criteria) this;
        }

        public Criteria andCoinpayNotEqualTo(String value) {
            addCriterion("COINPAY <>", value, "coinpay");
            return (Criteria) this;
        }

        public Criteria andCoinpayGreaterThan(String value) {
            addCriterion("COINPAY >", value, "coinpay");
            return (Criteria) this;
        }

        public Criteria andCoinpayGreaterThanOrEqualTo(String value) {
            addCriterion("COINPAY >=", value, "coinpay");
            return (Criteria) this;
        }

        public Criteria andCoinpayLessThan(String value) {
            addCriterion("COINPAY <", value, "coinpay");
            return (Criteria) this;
        }

        public Criteria andCoinpayLessThanOrEqualTo(String value) {
            addCriterion("COINPAY <=", value, "coinpay");
            return (Criteria) this;
        }

        public Criteria andCoinpayLike(String value) {
            addCriterion("COINPAY like", value, "coinpay");
            return (Criteria) this;
        }

        public Criteria andCoinpayNotLike(String value) {
            addCriterion("COINPAY not like", value, "coinpay");
            return (Criteria) this;
        }

        public Criteria andCoinpayIn(List<String> values) {
            addCriterion("COINPAY in", values, "coinpay");
            return (Criteria) this;
        }

        public Criteria andCoinpayNotIn(List<String> values) {
            addCriterion("COINPAY not in", values, "coinpay");
            return (Criteria) this;
        }

        public Criteria andCoinpayBetween(String value1, String value2) {
            addCriterion("COINPAY between", value1, value2, "coinpay");
            return (Criteria) this;
        }

        public Criteria andCoinpayNotBetween(String value1, String value2) {
            addCriterion("COINPAY not between", value1, value2, "coinpay");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeIsNull() {
            addCriterion("OLDCOINS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeIsNotNull() {
            addCriterion("OLDCOINS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeEqualTo(String value) {
            addCriterion("OLDCOINS_TYPE =", value, "oldcoinsType");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeNotEqualTo(String value) {
            addCriterion("OLDCOINS_TYPE <>", value, "oldcoinsType");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeGreaterThan(String value) {
            addCriterion("OLDCOINS_TYPE >", value, "oldcoinsType");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OLDCOINS_TYPE >=", value, "oldcoinsType");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeLessThan(String value) {
            addCriterion("OLDCOINS_TYPE <", value, "oldcoinsType");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeLessThanOrEqualTo(String value) {
            addCriterion("OLDCOINS_TYPE <=", value, "oldcoinsType");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeLike(String value) {
            addCriterion("OLDCOINS_TYPE like", value, "oldcoinsType");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeNotLike(String value) {
            addCriterion("OLDCOINS_TYPE not like", value, "oldcoinsType");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeIn(List<String> values) {
            addCriterion("OLDCOINS_TYPE in", values, "oldcoinsType");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeNotIn(List<String> values) {
            addCriterion("OLDCOINS_TYPE not in", values, "oldcoinsType");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeBetween(String value1, String value2) {
            addCriterion("OLDCOINS_TYPE between", value1, value2, "oldcoinsType");
            return (Criteria) this;
        }

        public Criteria andOldcoinsTypeNotBetween(String value1, String value2) {
            addCriterion("OLDCOINS_TYPE not between", value1, value2, "oldcoinsType");
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

        public Criteria andDescriptionsIsNull() {
            addCriterion("DESCRIPTIONS is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionsIsNotNull() {
            addCriterion("DESCRIPTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionsEqualTo(String value) {
            addCriterion("DESCRIPTIONS =", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotEqualTo(String value) {
            addCriterion("DESCRIPTIONS <>", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsGreaterThan(String value) {
            addCriterion("DESCRIPTIONS >", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTIONS >=", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsLessThan(String value) {
            addCriterion("DESCRIPTIONS <", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTIONS <=", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsLike(String value) {
            addCriterion("DESCRIPTIONS like", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotLike(String value) {
            addCriterion("DESCRIPTIONS not like", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsIn(List<String> values) {
            addCriterion("DESCRIPTIONS in", values, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotIn(List<String> values) {
            addCriterion("DESCRIPTIONS not in", values, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsBetween(String value1, String value2) {
            addCriterion("DESCRIPTIONS between", value1, value2, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTIONS not between", value1, value2, "descriptions");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagIsNull() {
            addCriterion("TOTALPROTOCOLFLAG is null");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagIsNotNull() {
            addCriterion("TOTALPROTOCOLFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagEqualTo(String value) {
            addCriterion("TOTALPROTOCOLFLAG =", value, "totalprotocolflag");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagNotEqualTo(String value) {
            addCriterion("TOTALPROTOCOLFLAG <>", value, "totalprotocolflag");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagGreaterThan(String value) {
            addCriterion("TOTALPROTOCOLFLAG >", value, "totalprotocolflag");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALPROTOCOLFLAG >=", value, "totalprotocolflag");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagLessThan(String value) {
            addCriterion("TOTALPROTOCOLFLAG <", value, "totalprotocolflag");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagLessThanOrEqualTo(String value) {
            addCriterion("TOTALPROTOCOLFLAG <=", value, "totalprotocolflag");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagLike(String value) {
            addCriterion("TOTALPROTOCOLFLAG like", value, "totalprotocolflag");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagNotLike(String value) {
            addCriterion("TOTALPROTOCOLFLAG not like", value, "totalprotocolflag");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagIn(List<String> values) {
            addCriterion("TOTALPROTOCOLFLAG in", values, "totalprotocolflag");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagNotIn(List<String> values) {
            addCriterion("TOTALPROTOCOLFLAG not in", values, "totalprotocolflag");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagBetween(String value1, String value2) {
            addCriterion("TOTALPROTOCOLFLAG between", value1, value2, "totalprotocolflag");
            return (Criteria) this;
        }

        public Criteria andTotalprotocolflagNotBetween(String value1, String value2) {
            addCriterion("TOTALPROTOCOLFLAG not between", value1, value2, "totalprotocolflag");
            return (Criteria) this;
        }

        public Criteria andIsVatIsNull() {
            addCriterion("IS_VAT is null");
            return (Criteria) this;
        }

        public Criteria andIsVatIsNotNull() {
            addCriterion("IS_VAT is not null");
            return (Criteria) this;
        }

        public Criteria andIsVatEqualTo(String value) {
            addCriterion("IS_VAT =", value, "isVat");
            return (Criteria) this;
        }

        public Criteria andIsVatNotEqualTo(String value) {
            addCriterion("IS_VAT <>", value, "isVat");
            return (Criteria) this;
        }

        public Criteria andIsVatGreaterThan(String value) {
            addCriterion("IS_VAT >", value, "isVat");
            return (Criteria) this;
        }

        public Criteria andIsVatGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VAT >=", value, "isVat");
            return (Criteria) this;
        }

        public Criteria andIsVatLessThan(String value) {
            addCriterion("IS_VAT <", value, "isVat");
            return (Criteria) this;
        }

        public Criteria andIsVatLessThanOrEqualTo(String value) {
            addCriterion("IS_VAT <=", value, "isVat");
            return (Criteria) this;
        }

        public Criteria andIsVatLike(String value) {
            addCriterion("IS_VAT like", value, "isVat");
            return (Criteria) this;
        }

        public Criteria andIsVatNotLike(String value) {
            addCriterion("IS_VAT not like", value, "isVat");
            return (Criteria) this;
        }

        public Criteria andIsVatIn(List<String> values) {
            addCriterion("IS_VAT in", values, "isVat");
            return (Criteria) this;
        }

        public Criteria andIsVatNotIn(List<String> values) {
            addCriterion("IS_VAT not in", values, "isVat");
            return (Criteria) this;
        }

        public Criteria andIsVatBetween(String value1, String value2) {
            addCriterion("IS_VAT between", value1, value2, "isVat");
            return (Criteria) this;
        }

        public Criteria andIsVatNotBetween(String value1, String value2) {
            addCriterion("IS_VAT not between", value1, value2, "isVat");
            return (Criteria) this;
        }

        public Criteria andCountryareaIsNull() {
            addCriterion("COUNTRYAREA is null");
            return (Criteria) this;
        }

        public Criteria andCountryareaIsNotNull() {
            addCriterion("COUNTRYAREA is not null");
            return (Criteria) this;
        }

        public Criteria andCountryareaEqualTo(String value) {
            addCriterion("COUNTRYAREA =", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaNotEqualTo(String value) {
            addCriterion("COUNTRYAREA <>", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaGreaterThan(String value) {
            addCriterion("COUNTRYAREA >", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRYAREA >=", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaLessThan(String value) {
            addCriterion("COUNTRYAREA <", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaLessThanOrEqualTo(String value) {
            addCriterion("COUNTRYAREA <=", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaLike(String value) {
            addCriterion("COUNTRYAREA like", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaNotLike(String value) {
            addCriterion("COUNTRYAREA not like", value, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaIn(List<String> values) {
            addCriterion("COUNTRYAREA in", values, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaNotIn(List<String> values) {
            addCriterion("COUNTRYAREA not in", values, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaBetween(String value1, String value2) {
            addCriterion("COUNTRYAREA between", value1, value2, "countryarea");
            return (Criteria) this;
        }

        public Criteria andCountryareaNotBetween(String value1, String value2) {
            addCriterion("COUNTRYAREA not between", value1, value2, "countryarea");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_land_condition_td
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
     * @Table : mm_land_condition_td
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