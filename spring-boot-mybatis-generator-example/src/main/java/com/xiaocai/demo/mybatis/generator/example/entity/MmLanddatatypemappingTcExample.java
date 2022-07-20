package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.List;

public class MmLanddatatypemappingTcExample {
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
    public MmLanddatatypemappingTcExample() {
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
     * @Table : mm_landdatatypemapping_tc
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

        public Criteria andDatatypeTiIsNull() {
            addCriterion("DATATYPE_TI is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiIsNotNull() {
            addCriterion("DATATYPE_TI is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiEqualTo(String value) {
            addCriterion("DATATYPE_TI =", value, "datatypeTi");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiNotEqualTo(String value) {
            addCriterion("DATATYPE_TI <>", value, "datatypeTi");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiGreaterThan(String value) {
            addCriterion("DATATYPE_TI >", value, "datatypeTi");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE_TI >=", value, "datatypeTi");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiLessThan(String value) {
            addCriterion("DATATYPE_TI <", value, "datatypeTi");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE_TI <=", value, "datatypeTi");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiLike(String value) {
            addCriterion("DATATYPE_TI like", value, "datatypeTi");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiNotLike(String value) {
            addCriterion("DATATYPE_TI not like", value, "datatypeTi");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiIn(List<String> values) {
            addCriterion("DATATYPE_TI in", values, "datatypeTi");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiNotIn(List<String> values) {
            addCriterion("DATATYPE_TI not in", values, "datatypeTi");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiBetween(String value1, String value2) {
            addCriterion("DATATYPE_TI between", value1, value2, "datatypeTi");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiNotBetween(String value1, String value2) {
            addCriterion("DATATYPE_TI not between", value1, value2, "datatypeTi");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescIsNull() {
            addCriterion("DATATYPE_TI_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescIsNotNull() {
            addCriterion("DATATYPE_TI_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescEqualTo(String value) {
            addCriterion("DATATYPE_TI_DESC =", value, "datatypeTiDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescNotEqualTo(String value) {
            addCriterion("DATATYPE_TI_DESC <>", value, "datatypeTiDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescGreaterThan(String value) {
            addCriterion("DATATYPE_TI_DESC >", value, "datatypeTiDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE_TI_DESC >=", value, "datatypeTiDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescLessThan(String value) {
            addCriterion("DATATYPE_TI_DESC <", value, "datatypeTiDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE_TI_DESC <=", value, "datatypeTiDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescLike(String value) {
            addCriterion("DATATYPE_TI_DESC like", value, "datatypeTiDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescNotLike(String value) {
            addCriterion("DATATYPE_TI_DESC not like", value, "datatypeTiDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescIn(List<String> values) {
            addCriterion("DATATYPE_TI_DESC in", values, "datatypeTiDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescNotIn(List<String> values) {
            addCriterion("DATATYPE_TI_DESC not in", values, "datatypeTiDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescBetween(String value1, String value2) {
            addCriterion("DATATYPE_TI_DESC between", value1, value2, "datatypeTiDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypeTiDescNotBetween(String value1, String value2) {
            addCriterion("DATATYPE_TI_DESC not between", value1, value2, "datatypeTiDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayIsNull() {
            addCriterion("DATATYPE_FORCOINPAY is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayIsNotNull() {
            addCriterion("DATATYPE_FORCOINPAY is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayEqualTo(String value) {
            addCriterion("DATATYPE_FORCOINPAY =", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayNotEqualTo(String value) {
            addCriterion("DATATYPE_FORCOINPAY <>", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayGreaterThan(String value) {
            addCriterion("DATATYPE_FORCOINPAY >", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE_FORCOINPAY >=", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayLessThan(String value) {
            addCriterion("DATATYPE_FORCOINPAY <", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE_FORCOINPAY <=", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayLike(String value) {
            addCriterion("DATATYPE_FORCOINPAY like", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayNotLike(String value) {
            addCriterion("DATATYPE_FORCOINPAY not like", value, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayIn(List<String> values) {
            addCriterion("DATATYPE_FORCOINPAY in", values, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayNotIn(List<String> values) {
            addCriterion("DATATYPE_FORCOINPAY not in", values, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayBetween(String value1, String value2) {
            addCriterion("DATATYPE_FORCOINPAY between", value1, value2, "datatypeForcoinpay");
            return (Criteria) this;
        }

        public Criteria andDatatypeForcoinpayNotBetween(String value1, String value2) {
            addCriterion("DATATYPE_FORCOINPAY not between", value1, value2, "datatypeForcoinpay");
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

        public Criteria andSignTiEqualTo(Integer value) {
            addCriterion("SIGN_TI =", value, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiNotEqualTo(Integer value) {
            addCriterion("SIGN_TI <>", value, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiGreaterThan(Integer value) {
            addCriterion("SIGN_TI >", value, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGN_TI >=", value, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiLessThan(Integer value) {
            addCriterion("SIGN_TI <", value, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiLessThanOrEqualTo(Integer value) {
            addCriterion("SIGN_TI <=", value, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiIn(List<Integer> values) {
            addCriterion("SIGN_TI in", values, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiNotIn(List<Integer> values) {
            addCriterion("SIGN_TI not in", values, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_TI between", value1, value2, "signTi");
            return (Criteria) this;
        }

        public Criteria andSignTiNotBetween(Integer value1, Integer value2) {
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

        public Criteria andBusinessattrPolicyIsNull() {
            addCriterion("BUSINESSATTR_POLICY is null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyIsNotNull() {
            addCriterion("BUSINESSATTR_POLICY is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyEqualTo(String value) {
            addCriterion("BUSINESSATTR_POLICY =", value, "businessattrPolicy");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyNotEqualTo(String value) {
            addCriterion("BUSINESSATTR_POLICY <>", value, "businessattrPolicy");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyGreaterThan(String value) {
            addCriterion("BUSINESSATTR_POLICY >", value, "businessattrPolicy");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSATTR_POLICY >=", value, "businessattrPolicy");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyLessThan(String value) {
            addCriterion("BUSINESSATTR_POLICY <", value, "businessattrPolicy");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSATTR_POLICY <=", value, "businessattrPolicy");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyLike(String value) {
            addCriterion("BUSINESSATTR_POLICY like", value, "businessattrPolicy");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyNotLike(String value) {
            addCriterion("BUSINESSATTR_POLICY not like", value, "businessattrPolicy");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyIn(List<String> values) {
            addCriterion("BUSINESSATTR_POLICY in", values, "businessattrPolicy");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyNotIn(List<String> values) {
            addCriterion("BUSINESSATTR_POLICY not in", values, "businessattrPolicy");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyBetween(String value1, String value2) {
            addCriterion("BUSINESSATTR_POLICY between", value1, value2, "businessattrPolicy");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPolicyNotBetween(String value1, String value2) {
            addCriterion("BUSINESSATTR_POLICY not between", value1, value2, "businessattrPolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyIsNull() {
            addCriterion("DATATYPE_POLICY is null");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyIsNotNull() {
            addCriterion("DATATYPE_POLICY is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyEqualTo(String value) {
            addCriterion("DATATYPE_POLICY =", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyNotEqualTo(String value) {
            addCriterion("DATATYPE_POLICY <>", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyGreaterThan(String value) {
            addCriterion("DATATYPE_POLICY >", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE_POLICY >=", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyLessThan(String value) {
            addCriterion("DATATYPE_POLICY <", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE_POLICY <=", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyLike(String value) {
            addCriterion("DATATYPE_POLICY like", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyNotLike(String value) {
            addCriterion("DATATYPE_POLICY not like", value, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyIn(List<String> values) {
            addCriterion("DATATYPE_POLICY in", values, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyNotIn(List<String> values) {
            addCriterion("DATATYPE_POLICY not in", values, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyBetween(String value1, String value2) {
            addCriterion("DATATYPE_POLICY between", value1, value2, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyNotBetween(String value1, String value2) {
            addCriterion("DATATYPE_POLICY not between", value1, value2, "datatypePolicy");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescIsNull() {
            addCriterion("DATATYPE_POLICY_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescIsNotNull() {
            addCriterion("DATATYPE_POLICY_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescEqualTo(String value) {
            addCriterion("DATATYPE_POLICY_DESC =", value, "datatypePolicyDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescNotEqualTo(String value) {
            addCriterion("DATATYPE_POLICY_DESC <>", value, "datatypePolicyDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescGreaterThan(String value) {
            addCriterion("DATATYPE_POLICY_DESC >", value, "datatypePolicyDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE_POLICY_DESC >=", value, "datatypePolicyDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescLessThan(String value) {
            addCriterion("DATATYPE_POLICY_DESC <", value, "datatypePolicyDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE_POLICY_DESC <=", value, "datatypePolicyDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescLike(String value) {
            addCriterion("DATATYPE_POLICY_DESC like", value, "datatypePolicyDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescNotLike(String value) {
            addCriterion("DATATYPE_POLICY_DESC not like", value, "datatypePolicyDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescIn(List<String> values) {
            addCriterion("DATATYPE_POLICY_DESC in", values, "datatypePolicyDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescNotIn(List<String> values) {
            addCriterion("DATATYPE_POLICY_DESC not in", values, "datatypePolicyDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescBetween(String value1, String value2) {
            addCriterion("DATATYPE_POLICY_DESC between", value1, value2, "datatypePolicyDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePolicyDescNotBetween(String value1, String value2) {
            addCriterion("DATATYPE_POLICY_DESC not between", value1, value2, "datatypePolicyDesc");
            return (Criteria) this;
        }

        public Criteria andClaimtypeIsNull() {
            addCriterion("CLAIMTYPE is null");
            return (Criteria) this;
        }

        public Criteria andClaimtypeIsNotNull() {
            addCriterion("CLAIMTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClaimtypeEqualTo(String value) {
            addCriterion("CLAIMTYPE =", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotEqualTo(String value) {
            addCriterion("CLAIMTYPE <>", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeGreaterThan(String value) {
            addCriterion("CLAIMTYPE >", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIMTYPE >=", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeLessThan(String value) {
            addCriterion("CLAIMTYPE <", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeLessThanOrEqualTo(String value) {
            addCriterion("CLAIMTYPE <=", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeLike(String value) {
            addCriterion("CLAIMTYPE like", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotLike(String value) {
            addCriterion("CLAIMTYPE not like", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeIn(List<String> values) {
            addCriterion("CLAIMTYPE in", values, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotIn(List<String> values) {
            addCriterion("CLAIMTYPE not in", values, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeBetween(String value1, String value2) {
            addCriterion("CLAIMTYPE between", value1, value2, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotBetween(String value1, String value2) {
            addCriterion("CLAIMTYPE not between", value1, value2, "claimtype");
            return (Criteria) this;
        }

        public Criteria andFeetypeIsNull() {
            addCriterion("FEETYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeetypeIsNotNull() {
            addCriterion("FEETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeetypeEqualTo(String value) {
            addCriterion("FEETYPE =", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeNotEqualTo(String value) {
            addCriterion("FEETYPE <>", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeGreaterThan(String value) {
            addCriterion("FEETYPE >", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEETYPE >=", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeLessThan(String value) {
            addCriterion("FEETYPE <", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeLessThanOrEqualTo(String value) {
            addCriterion("FEETYPE <=", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeLike(String value) {
            addCriterion("FEETYPE like", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeNotLike(String value) {
            addCriterion("FEETYPE not like", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeIn(List<String> values) {
            addCriterion("FEETYPE in", values, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeNotIn(List<String> values) {
            addCriterion("FEETYPE not in", values, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeBetween(String value1, String value2) {
            addCriterion("FEETYPE between", value1, value2, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeNotBetween(String value1, String value2) {
            addCriterion("FEETYPE not between", value1, value2, "feetype");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableIsNull() {
            addCriterion("BUSINESSATTR_PAYABLE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableIsNotNull() {
            addCriterion("BUSINESSATTR_PAYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableEqualTo(String value) {
            addCriterion("BUSINESSATTR_PAYABLE =", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableNotEqualTo(String value) {
            addCriterion("BUSINESSATTR_PAYABLE <>", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableGreaterThan(String value) {
            addCriterion("BUSINESSATTR_PAYABLE >", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSATTR_PAYABLE >=", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableLessThan(String value) {
            addCriterion("BUSINESSATTR_PAYABLE <", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSATTR_PAYABLE <=", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableLike(String value) {
            addCriterion("BUSINESSATTR_PAYABLE like", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableNotLike(String value) {
            addCriterion("BUSINESSATTR_PAYABLE not like", value, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableIn(List<String> values) {
            addCriterion("BUSINESSATTR_PAYABLE in", values, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableNotIn(List<String> values) {
            addCriterion("BUSINESSATTR_PAYABLE not in", values, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableBetween(String value1, String value2) {
            addCriterion("BUSINESSATTR_PAYABLE between", value1, value2, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andBusinessattrPayableNotBetween(String value1, String value2) {
            addCriterion("BUSINESSATTR_PAYABLE not between", value1, value2, "businessattrPayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableIsNull() {
            addCriterion("SIGN_REVERSE_PAYABLE is null");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableIsNotNull() {
            addCriterion("SIGN_REVERSE_PAYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableEqualTo(Integer value) {
            addCriterion("SIGN_REVERSE_PAYABLE =", value, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableNotEqualTo(Integer value) {
            addCriterion("SIGN_REVERSE_PAYABLE <>", value, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableGreaterThan(Integer value) {
            addCriterion("SIGN_REVERSE_PAYABLE >", value, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGN_REVERSE_PAYABLE >=", value, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableLessThan(Integer value) {
            addCriterion("SIGN_REVERSE_PAYABLE <", value, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableLessThanOrEqualTo(Integer value) {
            addCriterion("SIGN_REVERSE_PAYABLE <=", value, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableIn(List<Integer> values) {
            addCriterion("SIGN_REVERSE_PAYABLE in", values, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableNotIn(List<Integer> values) {
            addCriterion("SIGN_REVERSE_PAYABLE not in", values, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_REVERSE_PAYABLE between", value1, value2, "signReversePayable");
            return (Criteria) this;
        }

        public Criteria andSignReversePayableNotBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_REVERSE_PAYABLE not between", value1, value2, "signReversePayable");
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

        public Criteria andPaytypeDescIsNull() {
            addCriterion("PAYTYPE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescIsNotNull() {
            addCriterion("PAYTYPE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescEqualTo(String value) {
            addCriterion("PAYTYPE_DESC =", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescNotEqualTo(String value) {
            addCriterion("PAYTYPE_DESC <>", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescGreaterThan(String value) {
            addCriterion("PAYTYPE_DESC >", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("PAYTYPE_DESC >=", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescLessThan(String value) {
            addCriterion("PAYTYPE_DESC <", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescLessThanOrEqualTo(String value) {
            addCriterion("PAYTYPE_DESC <=", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescLike(String value) {
            addCriterion("PAYTYPE_DESC like", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescNotLike(String value) {
            addCriterion("PAYTYPE_DESC not like", value, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescIn(List<String> values) {
            addCriterion("PAYTYPE_DESC in", values, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescNotIn(List<String> values) {
            addCriterion("PAYTYPE_DESC not in", values, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescBetween(String value1, String value2) {
            addCriterion("PAYTYPE_DESC between", value1, value2, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andPaytypeDescNotBetween(String value1, String value2) {
            addCriterion("PAYTYPE_DESC not between", value1, value2, "paytypeDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableIsNull() {
            addCriterion("DATATYPE_PAYABLE is null");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableIsNotNull() {
            addCriterion("DATATYPE_PAYABLE is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE =", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableNotEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE <>", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableGreaterThan(String value) {
            addCriterion("DATATYPE_PAYABLE >", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE >=", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableLessThan(String value) {
            addCriterion("DATATYPE_PAYABLE <", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE <=", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableLike(String value) {
            addCriterion("DATATYPE_PAYABLE like", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableNotLike(String value) {
            addCriterion("DATATYPE_PAYABLE not like", value, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableIn(List<String> values) {
            addCriterion("DATATYPE_PAYABLE in", values, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableNotIn(List<String> values) {
            addCriterion("DATATYPE_PAYABLE not in", values, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableBetween(String value1, String value2) {
            addCriterion("DATATYPE_PAYABLE between", value1, value2, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableNotBetween(String value1, String value2) {
            addCriterion("DATATYPE_PAYABLE not between", value1, value2, "datatypePayable");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescIsNull() {
            addCriterion("DATATYPE_PAYABLE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescIsNotNull() {
            addCriterion("DATATYPE_PAYABLE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC =", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescNotEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC <>", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescGreaterThan(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC >", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescGreaterThanOrEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC >=", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescLessThan(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC <", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescLessThanOrEqualTo(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC <=", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescLike(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC like", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescNotLike(String value) {
            addCriterion("DATATYPE_PAYABLE_DESC not like", value, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescIn(List<String> values) {
            addCriterion("DATATYPE_PAYABLE_DESC in", values, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescNotIn(List<String> values) {
            addCriterion("DATATYPE_PAYABLE_DESC not in", values, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescBetween(String value1, String value2) {
            addCriterion("DATATYPE_PAYABLE_DESC between", value1, value2, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andDatatypePayableDescNotBetween(String value1, String value2) {
            addCriterion("DATATYPE_PAYABLE_DESC not between", value1, value2, "datatypePayableDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescIsNull() {
            addCriterion("BUSINESSONE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescIsNotNull() {
            addCriterion("BUSINESSONE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescEqualTo(String value) {
            addCriterion("BUSINESSONE_DESC =", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescNotEqualTo(String value) {
            addCriterion("BUSINESSONE_DESC <>", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescGreaterThan(String value) {
            addCriterion("BUSINESSONE_DESC >", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSONE_DESC >=", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescLessThan(String value) {
            addCriterion("BUSINESSONE_DESC <", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSONE_DESC <=", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescLike(String value) {
            addCriterion("BUSINESSONE_DESC like", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescNotLike(String value) {
            addCriterion("BUSINESSONE_DESC not like", value, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescIn(List<String> values) {
            addCriterion("BUSINESSONE_DESC in", values, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescNotIn(List<String> values) {
            addCriterion("BUSINESSONE_DESC not in", values, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescBetween(String value1, String value2) {
            addCriterion("BUSINESSONE_DESC between", value1, value2, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessoneDescNotBetween(String value1, String value2) {
            addCriterion("BUSINESSONE_DESC not between", value1, value2, "businessoneDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescIsNull() {
            addCriterion("BUSINESSTWO_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescIsNotNull() {
            addCriterion("BUSINESSTWO_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescEqualTo(String value) {
            addCriterion("BUSINESSTWO_DESC =", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescNotEqualTo(String value) {
            addCriterion("BUSINESSTWO_DESC <>", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescGreaterThan(String value) {
            addCriterion("BUSINESSTWO_DESC >", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTWO_DESC >=", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescLessThan(String value) {
            addCriterion("BUSINESSTWO_DESC <", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTWO_DESC <=", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescLike(String value) {
            addCriterion("BUSINESSTWO_DESC like", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescNotLike(String value) {
            addCriterion("BUSINESSTWO_DESC not like", value, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescIn(List<String> values) {
            addCriterion("BUSINESSTWO_DESC in", values, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescNotIn(List<String> values) {
            addCriterion("BUSINESSTWO_DESC not in", values, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescBetween(String value1, String value2) {
            addCriterion("BUSINESSTWO_DESC between", value1, value2, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoDescNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTWO_DESC not between", value1, value2, "businesstwoDesc");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsIsNull() {
            addCriterion("SIGN_REVERSE_POLCYEVENTS is null");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsIsNotNull() {
            addCriterion("SIGN_REVERSE_POLCYEVENTS is not null");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsEqualTo(Integer value) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS =", value, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsNotEqualTo(Integer value) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS <>", value, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsGreaterThan(Integer value) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS >", value, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS >=", value, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsLessThan(Integer value) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS <", value, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsLessThanOrEqualTo(Integer value) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS <=", value, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsIn(List<Integer> values) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS in", values, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsNotIn(List<Integer> values) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS not in", values, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS between", value1, value2, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andSignReversePolcyeventsNotBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_REVERSE_POLCYEVENTS not between", value1, value2, "signReversePolcyevents");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeIsNull() {
            addCriterion("if_taxforapplyfee is null");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeIsNotNull() {
            addCriterion("if_taxforapplyfee is not null");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeEqualTo(String value) {
            addCriterion("if_taxforapplyfee =", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeNotEqualTo(String value) {
            addCriterion("if_taxforapplyfee <>", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeGreaterThan(String value) {
            addCriterion("if_taxforapplyfee >", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeGreaterThanOrEqualTo(String value) {
            addCriterion("if_taxforapplyfee >=", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeLessThan(String value) {
            addCriterion("if_taxforapplyfee <", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeLessThanOrEqualTo(String value) {
            addCriterion("if_taxforapplyfee <=", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeLike(String value) {
            addCriterion("if_taxforapplyfee like", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeNotLike(String value) {
            addCriterion("if_taxforapplyfee not like", value, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeIn(List<String> values) {
            addCriterion("if_taxforapplyfee in", values, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeNotIn(List<String> values) {
            addCriterion("if_taxforapplyfee not in", values, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeBetween(String value1, String value2) {
            addCriterion("if_taxforapplyfee between", value1, value2, "ifTaxforapplyfee");
            return (Criteria) this;
        }

        public Criteria andIfTaxforapplyfeeNotBetween(String value1, String value2) {
            addCriterion("if_taxforapplyfee not between", value1, value2, "ifTaxforapplyfee");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_landdatatypemapping_tc
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
     * @Table : mm_landdatatypemapping_tc
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