package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmTempTaxdetailinfoTdExample {
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
    public MmTempTaxdetailinfoTdExample() {
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
     * @Table : mm_temp_taxdetailinfo_td
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

        public Criteria andSeqpolicyIsNull() {
            addCriterion("seqpolicy is null");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIsNotNull() {
            addCriterion("seqpolicy is not null");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyEqualTo(BigDecimal value) {
            addCriterion("seqpolicy =", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotEqualTo(BigDecimal value) {
            addCriterion("seqpolicy <>", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThan(BigDecimal value) {
            addCriterion("seqpolicy >", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seqpolicy >=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThan(BigDecimal value) {
            addCriterion("seqpolicy <", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seqpolicy <=", value, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyIn(List<BigDecimal> values) {
            addCriterion("seqpolicy in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotIn(List<BigDecimal> values) {
            addCriterion("seqpolicy not in", values, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seqpolicy between", value1, value2, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andSeqpolicyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seqpolicy not between", value1, value2, "seqpolicy");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNull() {
            addCriterion("batchid is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("batchid is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(String value) {
            addCriterion("batchid =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(String value) {
            addCriterion("batchid <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(String value) {
            addCriterion("batchid >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("batchid >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(String value) {
            addCriterion("batchid <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(String value) {
            addCriterion("batchid <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLike(String value) {
            addCriterion("batchid like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotLike(String value) {
            addCriterion("batchid not like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<String> values) {
            addCriterion("batchid in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<String> values) {
            addCriterion("batchid not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(String value1, String value2) {
            addCriterion("batchid between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(String value1, String value2) {
            addCriterion("batchid not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andSeqtaxIsNull() {
            addCriterion("seqtax is null");
            return (Criteria) this;
        }

        public Criteria andSeqtaxIsNotNull() {
            addCriterion("seqtax is not null");
            return (Criteria) this;
        }

        public Criteria andSeqtaxEqualTo(String value) {
            addCriterion("seqtax =", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxNotEqualTo(String value) {
            addCriterion("seqtax <>", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxGreaterThan(String value) {
            addCriterion("seqtax >", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxGreaterThanOrEqualTo(String value) {
            addCriterion("seqtax >=", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxLessThan(String value) {
            addCriterion("seqtax <", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxLessThanOrEqualTo(String value) {
            addCriterion("seqtax <=", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxLike(String value) {
            addCriterion("seqtax like", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxNotLike(String value) {
            addCriterion("seqtax not like", value, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxIn(List<String> values) {
            addCriterion("seqtax in", values, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxNotIn(List<String> values) {
            addCriterion("seqtax not in", values, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxBetween(String value1, String value2) {
            addCriterion("seqtax between", value1, value2, "seqtax");
            return (Criteria) this;
        }

        public Criteria andSeqtaxNotBetween(String value1, String value2) {
            addCriterion("seqtax not between", value1, value2, "seqtax");
            return (Criteria) this;
        }

        public Criteria andVkclassIsNull() {
            addCriterion("vkclass is null");
            return (Criteria) this;
        }

        public Criteria andVkclassIsNotNull() {
            addCriterion("vkclass is not null");
            return (Criteria) this;
        }

        public Criteria andVkclassEqualTo(String value) {
            addCriterion("vkclass =", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassNotEqualTo(String value) {
            addCriterion("vkclass <>", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassGreaterThan(String value) {
            addCriterion("vkclass >", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassGreaterThanOrEqualTo(String value) {
            addCriterion("vkclass >=", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassLessThan(String value) {
            addCriterion("vkclass <", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassLessThanOrEqualTo(String value) {
            addCriterion("vkclass <=", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassLike(String value) {
            addCriterion("vkclass like", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassNotLike(String value) {
            addCriterion("vkclass not like", value, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassIn(List<String> values) {
            addCriterion("vkclass in", values, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassNotIn(List<String> values) {
            addCriterion("vkclass not in", values, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassBetween(String value1, String value2) {
            addCriterion("vkclass between", value1, value2, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVkclassNotBetween(String value1, String value2) {
            addCriterion("vkclass not between", value1, value2, "vkclass");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNull() {
            addCriterion("vehkind is null");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNotNull() {
            addCriterion("vehkind is not null");
            return (Criteria) this;
        }

        public Criteria andVehkindEqualTo(String value) {
            addCriterion("vehkind =", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotEqualTo(String value) {
            addCriterion("vehkind <>", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThan(String value) {
            addCriterion("vehkind >", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThanOrEqualTo(String value) {
            addCriterion("vehkind >=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThan(String value) {
            addCriterion("vehkind <", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThanOrEqualTo(String value) {
            addCriterion("vehkind <=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLike(String value) {
            addCriterion("vehkind like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotLike(String value) {
            addCriterion("vehkind not like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindIn(List<String> values) {
            addCriterion("vehkind in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotIn(List<String> values) {
            addCriterion("vehkind not in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindBetween(String value1, String value2) {
            addCriterion("vehkind between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotBetween(String value1, String value2) {
            addCriterion("vehkind not between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehnameIsNull() {
            addCriterion("vehname is null");
            return (Criteria) this;
        }

        public Criteria andVehnameIsNotNull() {
            addCriterion("vehname is not null");
            return (Criteria) this;
        }

        public Criteria andVehnameEqualTo(String value) {
            addCriterion("vehname =", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameNotEqualTo(String value) {
            addCriterion("vehname <>", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameGreaterThan(String value) {
            addCriterion("vehname >", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameGreaterThanOrEqualTo(String value) {
            addCriterion("vehname >=", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameLessThan(String value) {
            addCriterion("vehname <", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameLessThanOrEqualTo(String value) {
            addCriterion("vehname <=", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameLike(String value) {
            addCriterion("vehname like", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameNotLike(String value) {
            addCriterion("vehname not like", value, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameIn(List<String> values) {
            addCriterion("vehname in", values, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameNotIn(List<String> values) {
            addCriterion("vehname not in", values, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameBetween(String value1, String value2) {
            addCriterion("vehname between", value1, value2, "vehname");
            return (Criteria) this;
        }

        public Criteria andVehnameNotBetween(String value1, String value2) {
            addCriterion("vehname not between", value1, value2, "vehname");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andVehvinIsNull() {
            addCriterion("vehvin is null");
            return (Criteria) this;
        }

        public Criteria andVehvinIsNotNull() {
            addCriterion("vehvin is not null");
            return (Criteria) this;
        }

        public Criteria andVehvinEqualTo(String value) {
            addCriterion("vehvin =", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotEqualTo(String value) {
            addCriterion("vehvin <>", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinGreaterThan(String value) {
            addCriterion("vehvin >", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinGreaterThanOrEqualTo(String value) {
            addCriterion("vehvin >=", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinLessThan(String value) {
            addCriterion("vehvin <", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinLessThanOrEqualTo(String value) {
            addCriterion("vehvin <=", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinLike(String value) {
            addCriterion("vehvin like", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotLike(String value) {
            addCriterion("vehvin not like", value, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinIn(List<String> values) {
            addCriterion("vehvin in", values, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotIn(List<String> values) {
            addCriterion("vehvin not in", values, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinBetween(String value1, String value2) {
            addCriterion("vehvin between", value1, value2, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehvinNotBetween(String value1, String value2) {
            addCriterion("vehvin not between", value1, value2, "vehvin");
            return (Criteria) this;
        }

        public Criteria andVehtypeIsNull() {
            addCriterion("vehtype is null");
            return (Criteria) this;
        }

        public Criteria andVehtypeIsNotNull() {
            addCriterion("vehtype is not null");
            return (Criteria) this;
        }

        public Criteria andVehtypeEqualTo(String value) {
            addCriterion("vehtype =", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotEqualTo(String value) {
            addCriterion("vehtype <>", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeGreaterThan(String value) {
            addCriterion("vehtype >", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeGreaterThanOrEqualTo(String value) {
            addCriterion("vehtype >=", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeLessThan(String value) {
            addCriterion("vehtype <", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeLessThanOrEqualTo(String value) {
            addCriterion("vehtype <=", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeLike(String value) {
            addCriterion("vehtype like", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotLike(String value) {
            addCriterion("vehtype not like", value, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeIn(List<String> values) {
            addCriterion("vehtype in", values, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotIn(List<String> values) {
            addCriterion("vehtype not in", values, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeBetween(String value1, String value2) {
            addCriterion("vehtype between", value1, value2, "vehtype");
            return (Criteria) this;
        }

        public Criteria andVehtypeNotBetween(String value1, String value2) {
            addCriterion("vehtype not between", value1, value2, "vehtype");
            return (Criteria) this;
        }

        public Criteria andGrossweightIsNull() {
            addCriterion("grossweight is null");
            return (Criteria) this;
        }

        public Criteria andGrossweightIsNotNull() {
            addCriterion("grossweight is not null");
            return (Criteria) this;
        }

        public Criteria andGrossweightEqualTo(BigDecimal value) {
            addCriterion("grossweight =", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotEqualTo(BigDecimal value) {
            addCriterion("grossweight <>", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightGreaterThan(BigDecimal value) {
            addCriterion("grossweight >", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grossweight >=", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightLessThan(BigDecimal value) {
            addCriterion("grossweight <", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grossweight <=", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightIn(List<BigDecimal> values) {
            addCriterion("grossweight in", values, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotIn(List<BigDecimal> values) {
            addCriterion("grossweight not in", values, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grossweight between", value1, value2, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grossweight not between", value1, value2, "grossweight");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityIsNull() {
            addCriterion("loadcapacity is null");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityIsNotNull() {
            addCriterion("loadcapacity is not null");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityEqualTo(BigDecimal value) {
            addCriterion("loadcapacity =", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityNotEqualTo(BigDecimal value) {
            addCriterion("loadcapacity <>", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityGreaterThan(BigDecimal value) {
            addCriterion("loadcapacity >", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loadcapacity >=", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityLessThan(BigDecimal value) {
            addCriterion("loadcapacity <", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loadcapacity <=", value, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityIn(List<BigDecimal> values) {
            addCriterion("loadcapacity in", values, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityNotIn(List<BigDecimal> values) {
            addCriterion("loadcapacity not in", values, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loadcapacity between", value1, value2, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andLoadcapacityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loadcapacity not between", value1, value2, "loadcapacity");
            return (Criteria) this;
        }

        public Criteria andSeatIsNull() {
            addCriterion("seat is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("seat is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(BigDecimal value) {
            addCriterion("seat =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(BigDecimal value) {
            addCriterion("seat <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(BigDecimal value) {
            addCriterion("seat >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seat >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(BigDecimal value) {
            addCriterion("seat <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seat <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<BigDecimal> values) {
            addCriterion("seat in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<BigDecimal> values) {
            addCriterion("seat not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seat between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seat not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andCurbweightIsNull() {
            addCriterion("curbweight is null");
            return (Criteria) this;
        }

        public Criteria andCurbweightIsNotNull() {
            addCriterion("curbweight is not null");
            return (Criteria) this;
        }

        public Criteria andCurbweightEqualTo(BigDecimal value) {
            addCriterion("curbweight =", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightNotEqualTo(BigDecimal value) {
            addCriterion("curbweight <>", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightGreaterThan(BigDecimal value) {
            addCriterion("curbweight >", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("curbweight >=", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightLessThan(BigDecimal value) {
            addCriterion("curbweight <", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("curbweight <=", value, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightIn(List<BigDecimal> values) {
            addCriterion("curbweight in", values, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightNotIn(List<BigDecimal> values) {
            addCriterion("curbweight not in", values, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("curbweight between", value1, value2, "curbweight");
            return (Criteria) this;
        }

        public Criteria andCurbweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("curbweight not between", value1, value2, "curbweight");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIsNull() {
            addCriterion("taxpayer is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIsNotNull() {
            addCriterion("taxpayer is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerEqualTo(String value) {
            addCriterion("taxpayer =", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotEqualTo(String value) {
            addCriterion("taxpayer <>", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerGreaterThan(String value) {
            addCriterion("taxpayer >", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer >=", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLessThan(String value) {
            addCriterion("taxpayer <", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLessThanOrEqualTo(String value) {
            addCriterion("taxpayer <=", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerLike(String value) {
            addCriterion("taxpayer like", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotLike(String value) {
            addCriterion("taxpayer not like", value, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIn(List<String> values) {
            addCriterion("taxpayer in", values, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotIn(List<String> values) {
            addCriterion("taxpayer not in", values, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerBetween(String value1, String value2) {
            addCriterion("taxpayer between", value1, value2, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andTaxpayerNotBetween(String value1, String value2) {
            addCriterion("taxpayer not between", value1, value2, "taxpayer");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("id_no is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("id_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("id_no =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("id_no <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("id_no >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_no >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("id_no <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("id_no <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("id_no like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("id_no not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("id_no in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("id_no not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("id_no between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("id_no not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("payer is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("payer is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("payer =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("payer <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("payer >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("payer >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("payer <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("payer <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("payer like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("payer not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("payer in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("payer not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("payer between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("payer not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayeraddressIsNull() {
            addCriterion("payeraddress is null");
            return (Criteria) this;
        }

        public Criteria andPayeraddressIsNotNull() {
            addCriterion("payeraddress is not null");
            return (Criteria) this;
        }

        public Criteria andPayeraddressEqualTo(String value) {
            addCriterion("payeraddress =", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotEqualTo(String value) {
            addCriterion("payeraddress <>", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressGreaterThan(String value) {
            addCriterion("payeraddress >", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("payeraddress >=", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressLessThan(String value) {
            addCriterion("payeraddress <", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressLessThanOrEqualTo(String value) {
            addCriterion("payeraddress <=", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressLike(String value) {
            addCriterion("payeraddress like", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotLike(String value) {
            addCriterion("payeraddress not like", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressIn(List<String> values) {
            addCriterion("payeraddress in", values, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotIn(List<String> values) {
            addCriterion("payeraddress not in", values, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressBetween(String value1, String value2) {
            addCriterion("payeraddress between", value1, value2, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotBetween(String value1, String value2) {
            addCriterion("payeraddress not between", value1, value2, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andBackdatefromIsNull() {
            addCriterion("backdatefrom is null");
            return (Criteria) this;
        }

        public Criteria andBackdatefromIsNotNull() {
            addCriterion("backdatefrom is not null");
            return (Criteria) this;
        }

        public Criteria andBackdatefromEqualTo(Date value) {
            addCriterion("backdatefrom =", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromNotEqualTo(Date value) {
            addCriterion("backdatefrom <>", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromGreaterThan(Date value) {
            addCriterion("backdatefrom >", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromGreaterThanOrEqualTo(Date value) {
            addCriterion("backdatefrom >=", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromLessThan(Date value) {
            addCriterion("backdatefrom <", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromLessThanOrEqualTo(Date value) {
            addCriterion("backdatefrom <=", value, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromIn(List<Date> values) {
            addCriterion("backdatefrom in", values, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromNotIn(List<Date> values) {
            addCriterion("backdatefrom not in", values, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromBetween(Date value1, Date value2) {
            addCriterion("backdatefrom between", value1, value2, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatefromNotBetween(Date value1, Date value2) {
            addCriterion("backdatefrom not between", value1, value2, "backdatefrom");
            return (Criteria) this;
        }

        public Criteria andBackdatetoIsNull() {
            addCriterion("backdateto is null");
            return (Criteria) this;
        }

        public Criteria andBackdatetoIsNotNull() {
            addCriterion("backdateto is not null");
            return (Criteria) this;
        }

        public Criteria andBackdatetoEqualTo(Date value) {
            addCriterion("backdateto =", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoNotEqualTo(Date value) {
            addCriterion("backdateto <>", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoGreaterThan(Date value) {
            addCriterion("backdateto >", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoGreaterThanOrEqualTo(Date value) {
            addCriterion("backdateto >=", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoLessThan(Date value) {
            addCriterion("backdateto <", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoLessThanOrEqualTo(Date value) {
            addCriterion("backdateto <=", value, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoIn(List<Date> values) {
            addCriterion("backdateto in", values, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoNotIn(List<Date> values) {
            addCriterion("backdateto not in", values, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoBetween(Date value1, Date value2) {
            addCriterion("backdateto between", value1, value2, "backdateto");
            return (Criteria) this;
        }

        public Criteria andBackdatetoNotBetween(Date value1, Date value2) {
            addCriterion("backdateto not between", value1, value2, "backdateto");
            return (Criteria) this;
        }

        public Criteria andLatedatefromIsNull() {
            addCriterion("latedatefrom is null");
            return (Criteria) this;
        }

        public Criteria andLatedatefromIsNotNull() {
            addCriterion("latedatefrom is not null");
            return (Criteria) this;
        }

        public Criteria andLatedatefromEqualTo(Date value) {
            addCriterion("latedatefrom =", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromNotEqualTo(Date value) {
            addCriterion("latedatefrom <>", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromGreaterThan(Date value) {
            addCriterion("latedatefrom >", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromGreaterThanOrEqualTo(Date value) {
            addCriterion("latedatefrom >=", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromLessThan(Date value) {
            addCriterion("latedatefrom <", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromLessThanOrEqualTo(Date value) {
            addCriterion("latedatefrom <=", value, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromIn(List<Date> values) {
            addCriterion("latedatefrom in", values, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromNotIn(List<Date> values) {
            addCriterion("latedatefrom not in", values, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromBetween(Date value1, Date value2) {
            addCriterion("latedatefrom between", value1, value2, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatefromNotBetween(Date value1, Date value2) {
            addCriterion("latedatefrom not between", value1, value2, "latedatefrom");
            return (Criteria) this;
        }

        public Criteria andLatedatetoIsNull() {
            addCriterion("latedateto is null");
            return (Criteria) this;
        }

        public Criteria andLatedatetoIsNotNull() {
            addCriterion("latedateto is not null");
            return (Criteria) this;
        }

        public Criteria andLatedatetoEqualTo(Date value) {
            addCriterion("latedateto =", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoNotEqualTo(Date value) {
            addCriterion("latedateto <>", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoGreaterThan(Date value) {
            addCriterion("latedateto >", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoGreaterThanOrEqualTo(Date value) {
            addCriterion("latedateto >=", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoLessThan(Date value) {
            addCriterion("latedateto <", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoLessThanOrEqualTo(Date value) {
            addCriterion("latedateto <=", value, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoIn(List<Date> values) {
            addCriterion("latedateto in", values, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoNotIn(List<Date> values) {
            addCriterion("latedateto not in", values, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoBetween(Date value1, Date value2) {
            addCriterion("latedateto between", value1, value2, "latedateto");
            return (Criteria) this;
        }

        public Criteria andLatedatetoNotBetween(Date value1, Date value2) {
            addCriterion("latedateto not between", value1, value2, "latedateto");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIsNull() {
            addCriterion("taxpayable is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIsNotNull() {
            addCriterion("taxpayable is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayableEqualTo(BigDecimal value) {
            addCriterion("taxpayable =", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotEqualTo(BigDecimal value) {
            addCriterion("taxpayable <>", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableGreaterThan(BigDecimal value) {
            addCriterion("taxpayable >", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxpayable >=", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableLessThan(BigDecimal value) {
            addCriterion("taxpayable <", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxpayable <=", value, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableIn(List<BigDecimal> values) {
            addCriterion("taxpayable in", values, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotIn(List<BigDecimal> values) {
            addCriterion("taxpayable not in", values, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxpayable between", value1, value2, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andTaxpayableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxpayable not between", value1, value2, "taxpayable");
            return (Criteria) this;
        }

        public Criteria andBacktaxIsNull() {
            addCriterion("backtax is null");
            return (Criteria) this;
        }

        public Criteria andBacktaxIsNotNull() {
            addCriterion("backtax is not null");
            return (Criteria) this;
        }

        public Criteria andBacktaxEqualTo(BigDecimal value) {
            addCriterion("backtax =", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotEqualTo(BigDecimal value) {
            addCriterion("backtax <>", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxGreaterThan(BigDecimal value) {
            addCriterion("backtax >", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("backtax >=", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxLessThan(BigDecimal value) {
            addCriterion("backtax <", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("backtax <=", value, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxIn(List<BigDecimal> values) {
            addCriterion("backtax in", values, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotIn(List<BigDecimal> values) {
            addCriterion("backtax not in", values, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("backtax between", value1, value2, "backtax");
            return (Criteria) this;
        }

        public Criteria andBacktaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("backtax not between", value1, value2, "backtax");
            return (Criteria) this;
        }

        public Criteria andLatefeeIsNull() {
            addCriterion("latefee is null");
            return (Criteria) this;
        }

        public Criteria andLatefeeIsNotNull() {
            addCriterion("latefee is not null");
            return (Criteria) this;
        }

        public Criteria andLatefeeEqualTo(BigDecimal value) {
            addCriterion("latefee =", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeNotEqualTo(BigDecimal value) {
            addCriterion("latefee <>", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeGreaterThan(BigDecimal value) {
            addCriterion("latefee >", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latefee >=", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeLessThan(BigDecimal value) {
            addCriterion("latefee <", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latefee <=", value, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeIn(List<BigDecimal> values) {
            addCriterion("latefee in", values, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeNotIn(List<BigDecimal> values) {
            addCriterion("latefee not in", values, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latefee between", value1, value2, "latefee");
            return (Criteria) this;
        }

        public Criteria andLatefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latefee not between", value1, value2, "latefee");
            return (Criteria) this;
        }

        public Criteria andTaxfreeIsNull() {
            addCriterion("taxfree is null");
            return (Criteria) this;
        }

        public Criteria andTaxfreeIsNotNull() {
            addCriterion("taxfree is not null");
            return (Criteria) this;
        }

        public Criteria andTaxfreeEqualTo(BigDecimal value) {
            addCriterion("taxfree =", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeNotEqualTo(BigDecimal value) {
            addCriterion("taxfree <>", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeGreaterThan(BigDecimal value) {
            addCriterion("taxfree >", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxfree >=", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeLessThan(BigDecimal value) {
            addCriterion("taxfree <", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxfree <=", value, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeIn(List<BigDecimal> values) {
            addCriterion("taxfree in", values, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeNotIn(List<BigDecimal> values) {
            addCriterion("taxfree not in", values, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxfree between", value1, value2, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxfreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxfree not between", value1, value2, "taxfree");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIsNull() {
            addCriterion("taxtotal is null");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIsNotNull() {
            addCriterion("taxtotal is not null");
            return (Criteria) this;
        }

        public Criteria andTaxtotalEqualTo(BigDecimal value) {
            addCriterion("taxtotal =", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotEqualTo(BigDecimal value) {
            addCriterion("taxtotal <>", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalGreaterThan(BigDecimal value) {
            addCriterion("taxtotal >", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxtotal >=", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalLessThan(BigDecimal value) {
            addCriterion("taxtotal <", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxtotal <=", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIn(List<BigDecimal> values) {
            addCriterion("taxtotal in", values, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotIn(List<BigDecimal> values) {
            addCriterion("taxtotal not in", values, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxtotal between", value1, value2, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxtotal not between", value1, value2, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoIsNull() {
            addCriterion("taxcertno is null");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoIsNotNull() {
            addCriterion("taxcertno is not null");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoEqualTo(String value) {
            addCriterion("taxcertno =", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotEqualTo(String value) {
            addCriterion("taxcertno <>", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoGreaterThan(String value) {
            addCriterion("taxcertno >", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoGreaterThanOrEqualTo(String value) {
            addCriterion("taxcertno >=", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoLessThan(String value) {
            addCriterion("taxcertno <", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoLessThanOrEqualTo(String value) {
            addCriterion("taxcertno <=", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoLike(String value) {
            addCriterion("taxcertno like", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotLike(String value) {
            addCriterion("taxcertno not like", value, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoIn(List<String> values) {
            addCriterion("taxcertno in", values, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotIn(List<String> values) {
            addCriterion("taxcertno not in", values, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoBetween(String value1, String value2) {
            addCriterion("taxcertno between", value1, value2, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxcertnoNotBetween(String value1, String value2) {
            addCriterion("taxcertno not between", value1, value2, "taxcertno");
            return (Criteria) this;
        }

        public Criteria andTaxofficeIsNull() {
            addCriterion("taxoffice is null");
            return (Criteria) this;
        }

        public Criteria andTaxofficeIsNotNull() {
            addCriterion("taxoffice is not null");
            return (Criteria) this;
        }

        public Criteria andTaxofficeEqualTo(String value) {
            addCriterion("taxoffice =", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeNotEqualTo(String value) {
            addCriterion("taxoffice <>", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeGreaterThan(String value) {
            addCriterion("taxoffice >", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeGreaterThanOrEqualTo(String value) {
            addCriterion("taxoffice >=", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeLessThan(String value) {
            addCriterion("taxoffice <", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeLessThanOrEqualTo(String value) {
            addCriterion("taxoffice <=", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeLike(String value) {
            addCriterion("taxoffice like", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeNotLike(String value) {
            addCriterion("taxoffice not like", value, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeIn(List<String> values) {
            addCriterion("taxoffice in", values, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeNotIn(List<String> values) {
            addCriterion("taxoffice not in", values, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeBetween(String value1, String value2) {
            addCriterion("taxoffice between", value1, value2, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxofficeNotBetween(String value1, String value2) {
            addCriterion("taxoffice not between", value1, value2, "taxoffice");
            return (Criteria) this;
        }

        public Criteria andTaxdayIsNull() {
            addCriterion("taxday is null");
            return (Criteria) this;
        }

        public Criteria andTaxdayIsNotNull() {
            addCriterion("taxday is not null");
            return (Criteria) this;
        }

        public Criteria andTaxdayEqualTo(Date value) {
            addCriterion("taxday =", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayNotEqualTo(Date value) {
            addCriterion("taxday <>", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayGreaterThan(Date value) {
            addCriterion("taxday >", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayGreaterThanOrEqualTo(Date value) {
            addCriterion("taxday >=", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayLessThan(Date value) {
            addCriterion("taxday <", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayLessThanOrEqualTo(Date value) {
            addCriterion("taxday <=", value, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayIn(List<Date> values) {
            addCriterion("taxday in", values, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayNotIn(List<Date> values) {
            addCriterion("taxday not in", values, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayBetween(Date value1, Date value2) {
            addCriterion("taxday between", value1, value2, "taxday");
            return (Criteria) this;
        }

        public Criteria andTaxdayNotBetween(Date value1, Date value2) {
            addCriterion("taxday not between", value1, value2, "taxday");
            return (Criteria) this;
        }

        public Criteria andInsurerIsNull() {
            addCriterion("insurer is null");
            return (Criteria) this;
        }

        public Criteria andInsurerIsNotNull() {
            addCriterion("insurer is not null");
            return (Criteria) this;
        }

        public Criteria andInsurerEqualTo(String value) {
            addCriterion("insurer =", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerNotEqualTo(String value) {
            addCriterion("insurer <>", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerGreaterThan(String value) {
            addCriterion("insurer >", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerGreaterThanOrEqualTo(String value) {
            addCriterion("insurer >=", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerLessThan(String value) {
            addCriterion("insurer <", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerLessThanOrEqualTo(String value) {
            addCriterion("insurer <=", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerLike(String value) {
            addCriterion("insurer like", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerNotLike(String value) {
            addCriterion("insurer not like", value, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerIn(List<String> values) {
            addCriterion("insurer in", values, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerNotIn(List<String> values) {
            addCriterion("insurer not in", values, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerBetween(String value1, String value2) {
            addCriterion("insurer between", value1, value2, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurerNotBetween(String value1, String value2) {
            addCriterion("insurer not between", value1, value2, "insurer");
            return (Criteria) this;
        }

        public Criteria andInsurernoIsNull() {
            addCriterion("insurerno is null");
            return (Criteria) this;
        }

        public Criteria andInsurernoIsNotNull() {
            addCriterion("insurerno is not null");
            return (Criteria) this;
        }

        public Criteria andInsurernoEqualTo(String value) {
            addCriterion("insurerno =", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoNotEqualTo(String value) {
            addCriterion("insurerno <>", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoGreaterThan(String value) {
            addCriterion("insurerno >", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoGreaterThanOrEqualTo(String value) {
            addCriterion("insurerno >=", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoLessThan(String value) {
            addCriterion("insurerno <", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoLessThanOrEqualTo(String value) {
            addCriterion("insurerno <=", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoLike(String value) {
            addCriterion("insurerno like", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoNotLike(String value) {
            addCriterion("insurerno not like", value, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoIn(List<String> values) {
            addCriterion("insurerno in", values, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoNotIn(List<String> values) {
            addCriterion("insurerno not in", values, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoBetween(String value1, String value2) {
            addCriterion("insurerno between", value1, value2, "insurerno");
            return (Criteria) this;
        }

        public Criteria andInsurernoNotBetween(String value1, String value2) {
            addCriterion("insurerno not between", value1, value2, "insurerno");
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

        public Criteria andDatasourceIsNull() {
            addCriterion("datasource is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("datasource is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("datasource =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("datasource <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("datasource >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("datasource >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("datasource <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("datasource <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("datasource like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("datasource not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("datasource in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("datasource not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("datasource between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("datasource not between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNull() {
            addCriterion("lastopdate is null");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNotNull() {
            addCriterion("lastopdate is not null");
            return (Criteria) this;
        }

        public Criteria andLastopdateEqualTo(Date value) {
            addCriterion("lastopdate =", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotEqualTo(Date value) {
            addCriterion("lastopdate <>", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThan(Date value) {
            addCriterion("lastopdate >", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastopdate >=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThan(Date value) {
            addCriterion("lastopdate <", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThanOrEqualTo(Date value) {
            addCriterion("lastopdate <=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateIn(List<Date> values) {
            addCriterion("lastopdate in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotIn(List<Date> values) {
            addCriterion("lastopdate not in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateBetween(Date value1, Date value2) {
            addCriterion("lastopdate between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotBetween(Date value1, Date value2) {
            addCriterion("lastopdate not between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andEngineIsNull() {
            addCriterion("engine is null");
            return (Criteria) this;
        }

        public Criteria andEngineIsNotNull() {
            addCriterion("engine is not null");
            return (Criteria) this;
        }

        public Criteria andEngineEqualTo(String value) {
            addCriterion("engine =", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotEqualTo(String value) {
            addCriterion("engine <>", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThan(String value) {
            addCriterion("engine >", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThanOrEqualTo(String value) {
            addCriterion("engine >=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThan(String value) {
            addCriterion("engine <", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThanOrEqualTo(String value) {
            addCriterion("engine <=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLike(String value) {
            addCriterion("engine like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotLike(String value) {
            addCriterion("engine not like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineIn(List<String> values) {
            addCriterion("engine in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotIn(List<String> values) {
            addCriterion("engine not in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineBetween(String value1, String value2) {
            addCriterion("engine between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotBetween(String value1, String value2) {
            addCriterion("engine not between", value1, value2, "engine");
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

        public Criteria andPolicynoIsNull() {
            addCriterion("policyno is null");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNotNull() {
            addCriterion("policyno is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynoEqualTo(String value) {
            addCriterion("policyno =", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotEqualTo(String value) {
            addCriterion("policyno <>", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThan(String value) {
            addCriterion("policyno >", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("policyno >=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThan(String value) {
            addCriterion("policyno <", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThanOrEqualTo(String value) {
            addCriterion("policyno <=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLike(String value) {
            addCriterion("policyno like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotLike(String value) {
            addCriterion("policyno not like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoIn(List<String> values) {
            addCriterion("policyno in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotIn(List<String> values) {
            addCriterion("policyno not in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoBetween(String value1, String value2) {
            addCriterion("policyno between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotBetween(String value1, String value2) {
            addCriterion("policyno not between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNull() {
            addCriterion("endorseno is null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNotNull() {
            addCriterion("endorseno is not null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoEqualTo(String value) {
            addCriterion("endorseno =", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotEqualTo(String value) {
            addCriterion("endorseno <>", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThan(String value) {
            addCriterion("endorseno >", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThanOrEqualTo(String value) {
            addCriterion("endorseno >=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThan(String value) {
            addCriterion("endorseno <", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThanOrEqualTo(String value) {
            addCriterion("endorseno <=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLike(String value) {
            addCriterion("endorseno like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotLike(String value) {
            addCriterion("endorseno not like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIn(List<String> values) {
            addCriterion("endorseno in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotIn(List<String> values) {
            addCriterion("endorseno not in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoBetween(String value1, String value2) {
            addCriterion("endorseno between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotBetween(String value1, String value2) {
            addCriterion("endorseno not between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNull() {
            addCriterion("baseamount is null");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNotNull() {
            addCriterion("baseamount is not null");
            return (Criteria) this;
        }

        public Criteria andBaseamountEqualTo(BigDecimal value) {
            addCriterion("baseamount =", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotEqualTo(BigDecimal value) {
            addCriterion("baseamount <>", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThan(BigDecimal value) {
            addCriterion("baseamount >", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baseamount >=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThan(BigDecimal value) {
            addCriterion("baseamount <", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baseamount <=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountIn(List<BigDecimal> values) {
            addCriterion("baseamount in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotIn(List<BigDecimal> values) {
            addCriterion("baseamount not in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseamount between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseamount not between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNull() {
            addCriterion("currencycode is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNotNull() {
            addCriterion("currencycode is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeEqualTo(String value) {
            addCriterion("currencycode =", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotEqualTo(String value) {
            addCriterion("currencycode <>", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThan(String value) {
            addCriterion("currencycode >", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("currencycode >=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThan(String value) {
            addCriterion("currencycode <", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("currencycode <=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLike(String value) {
            addCriterion("currencycode like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotLike(String value) {
            addCriterion("currencycode not like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIn(List<String> values) {
            addCriterion("currencycode in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotIn(List<String> values) {
            addCriterion("currencycode not in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeBetween(String value1, String value2) {
            addCriterion("currencycode between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotBetween(String value1, String value2) {
            addCriterion("currencycode not between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andQbrqIsNull() {
            addCriterion("qbrq is null");
            return (Criteria) this;
        }

        public Criteria andQbrqIsNotNull() {
            addCriterion("qbrq is not null");
            return (Criteria) this;
        }

        public Criteria andQbrqEqualTo(Date value) {
            addCriterion("qbrq =", value, "qbrq");
            return (Criteria) this;
        }

        public Criteria andQbrqNotEqualTo(Date value) {
            addCriterion("qbrq <>", value, "qbrq");
            return (Criteria) this;
        }

        public Criteria andQbrqGreaterThan(Date value) {
            addCriterion("qbrq >", value, "qbrq");
            return (Criteria) this;
        }

        public Criteria andQbrqGreaterThanOrEqualTo(Date value) {
            addCriterion("qbrq >=", value, "qbrq");
            return (Criteria) this;
        }

        public Criteria andQbrqLessThan(Date value) {
            addCriterion("qbrq <", value, "qbrq");
            return (Criteria) this;
        }

        public Criteria andQbrqLessThanOrEqualTo(Date value) {
            addCriterion("qbrq <=", value, "qbrq");
            return (Criteria) this;
        }

        public Criteria andQbrqIn(List<Date> values) {
            addCriterion("qbrq in", values, "qbrq");
            return (Criteria) this;
        }

        public Criteria andQbrqNotIn(List<Date> values) {
            addCriterion("qbrq not in", values, "qbrq");
            return (Criteria) this;
        }

        public Criteria andQbrqBetween(Date value1, Date value2) {
            addCriterion("qbrq between", value1, value2, "qbrq");
            return (Criteria) this;
        }

        public Criteria andQbrqNotBetween(Date value1, Date value2) {
            addCriterion("qbrq not between", value1, value2, "qbrq");
            return (Criteria) this;
        }

        public Criteria andZhzhrqIsNull() {
            addCriterion("zhzhrq is null");
            return (Criteria) this;
        }

        public Criteria andZhzhrqIsNotNull() {
            addCriterion("zhzhrq is not null");
            return (Criteria) this;
        }

        public Criteria andZhzhrqEqualTo(Date value) {
            addCriterion("zhzhrq =", value, "zhzhrq");
            return (Criteria) this;
        }

        public Criteria andZhzhrqNotEqualTo(Date value) {
            addCriterion("zhzhrq <>", value, "zhzhrq");
            return (Criteria) this;
        }

        public Criteria andZhzhrqGreaterThan(Date value) {
            addCriterion("zhzhrq >", value, "zhzhrq");
            return (Criteria) this;
        }

        public Criteria andZhzhrqGreaterThanOrEqualTo(Date value) {
            addCriterion("zhzhrq >=", value, "zhzhrq");
            return (Criteria) this;
        }

        public Criteria andZhzhrqLessThan(Date value) {
            addCriterion("zhzhrq <", value, "zhzhrq");
            return (Criteria) this;
        }

        public Criteria andZhzhrqLessThanOrEqualTo(Date value) {
            addCriterion("zhzhrq <=", value, "zhzhrq");
            return (Criteria) this;
        }

        public Criteria andZhzhrqIn(List<Date> values) {
            addCriterion("zhzhrq in", values, "zhzhrq");
            return (Criteria) this;
        }

        public Criteria andZhzhrqNotIn(List<Date> values) {
            addCriterion("zhzhrq not in", values, "zhzhrq");
            return (Criteria) this;
        }

        public Criteria andZhzhrqBetween(Date value1, Date value2) {
            addCriterion("zhzhrq between", value1, value2, "zhzhrq");
            return (Criteria) this;
        }

        public Criteria andZhzhrqNotBetween(Date value1, Date value2) {
            addCriterion("zhzhrq not between", value1, value2, "zhzhrq");
            return (Criteria) this;
        }

        public Criteria andDeclarenoIsNull() {
            addCriterion("declareno is null");
            return (Criteria) this;
        }

        public Criteria andDeclarenoIsNotNull() {
            addCriterion("declareno is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarenoEqualTo(String value) {
            addCriterion("declareno =", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoNotEqualTo(String value) {
            addCriterion("declareno <>", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoGreaterThan(String value) {
            addCriterion("declareno >", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoGreaterThanOrEqualTo(String value) {
            addCriterion("declareno >=", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoLessThan(String value) {
            addCriterion("declareno <", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoLessThanOrEqualTo(String value) {
            addCriterion("declareno <=", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoLike(String value) {
            addCriterion("declareno like", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoNotLike(String value) {
            addCriterion("declareno not like", value, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoIn(List<String> values) {
            addCriterion("declareno in", values, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoNotIn(List<String> values) {
            addCriterion("declareno not in", values, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoBetween(String value1, String value2) {
            addCriterion("declareno between", value1, value2, "declareno");
            return (Criteria) this;
        }

        public Criteria andDeclarenoNotBetween(String value1, String value2) {
            addCriterion("declareno not between", value1, value2, "declareno");
            return (Criteria) this;
        }

        public Criteria andListnoIsNull() {
            addCriterion("listno is null");
            return (Criteria) this;
        }

        public Criteria andListnoIsNotNull() {
            addCriterion("listno is not null");
            return (Criteria) this;
        }

        public Criteria andListnoEqualTo(BigDecimal value) {
            addCriterion("listno =", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotEqualTo(BigDecimal value) {
            addCriterion("listno <>", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThan(BigDecimal value) {
            addCriterion("listno >", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("listno >=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThan(BigDecimal value) {
            addCriterion("listno <", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("listno <=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoIn(List<BigDecimal> values) {
            addCriterion("listno in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotIn(List<BigDecimal> values) {
            addCriterion("listno not in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("listno between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("listno not between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNull() {
            addCriterion("signdate is null");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNotNull() {
            addCriterion("signdate is not null");
            return (Criteria) this;
        }

        public Criteria andSigndateEqualTo(Date value) {
            addCriterion("signdate =", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotEqualTo(Date value) {
            addCriterion("signdate <>", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThan(Date value) {
            addCriterion("signdate >", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThanOrEqualTo(Date value) {
            addCriterion("signdate >=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThan(Date value) {
            addCriterion("signdate <", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThanOrEqualTo(Date value) {
            addCriterion("signdate <=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateIn(List<Date> values) {
            addCriterion("signdate in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotIn(List<Date> values) {
            addCriterion("signdate not in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateBetween(Date value1, Date value2) {
            addCriterion("signdate between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotBetween(Date value1, Date value2) {
            addCriterion("signdate not between", value1, value2, "signdate");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_temp_taxdetailinfo_td
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
     * @Table : mm_temp_taxdetailinfo_td
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