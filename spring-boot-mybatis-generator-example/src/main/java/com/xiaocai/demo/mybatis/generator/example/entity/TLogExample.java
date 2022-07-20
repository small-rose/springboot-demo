package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TLogExample {
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
    public TLogExample() {
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
     * @Table : t_log
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

        public Criteria andTanoIsNull() {
            addCriterion("TANO is null");
            return (Criteria) this;
        }

        public Criteria andTanoIsNotNull() {
            addCriterion("TANO is not null");
            return (Criteria) this;
        }

        public Criteria andTanoEqualTo(Long value) {
            addCriterion("TANO =", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotEqualTo(Long value) {
            addCriterion("TANO <>", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoGreaterThan(Long value) {
            addCriterion("TANO >", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoGreaterThanOrEqualTo(Long value) {
            addCriterion("TANO >=", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLessThan(Long value) {
            addCriterion("TANO <", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLessThanOrEqualTo(Long value) {
            addCriterion("TANO <=", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoIn(List<Long> values) {
            addCriterion("TANO in", values, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotIn(List<Long> values) {
            addCriterion("TANO not in", values, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoBetween(Long value1, Long value2) {
            addCriterion("TANO between", value1, value2, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotBetween(Long value1, Long value2) {
            addCriterion("TANO not between", value1, value2, "tano");
            return (Criteria) this;
        }

        public Criteria andRequestIsNull() {
            addCriterion("REQUEST is null");
            return (Criteria) this;
        }

        public Criteria andRequestIsNotNull() {
            addCriterion("REQUEST is not null");
            return (Criteria) this;
        }

        public Criteria andRequestEqualTo(String value) {
            addCriterion("REQUEST =", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotEqualTo(String value) {
            addCriterion("REQUEST <>", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestGreaterThan(String value) {
            addCriterion("REQUEST >", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST >=", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestLessThan(String value) {
            addCriterion("REQUEST <", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestLessThanOrEqualTo(String value) {
            addCriterion("REQUEST <=", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestLike(String value) {
            addCriterion("REQUEST like", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotLike(String value) {
            addCriterion("REQUEST not like", value, "request");
            return (Criteria) this;
        }

        public Criteria andRequestIn(List<String> values) {
            addCriterion("REQUEST in", values, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotIn(List<String> values) {
            addCriterion("REQUEST not in", values, "request");
            return (Criteria) this;
        }

        public Criteria andRequestBetween(String value1, String value2) {
            addCriterion("REQUEST between", value1, value2, "request");
            return (Criteria) this;
        }

        public Criteria andRequestNotBetween(String value1, String value2) {
            addCriterion("REQUEST not between", value1, value2, "request");
            return (Criteria) this;
        }

        public Criteria andResponseIsNull() {
            addCriterion("RESPONSE is null");
            return (Criteria) this;
        }

        public Criteria andResponseIsNotNull() {
            addCriterion("RESPONSE is not null");
            return (Criteria) this;
        }

        public Criteria andResponseEqualTo(String value) {
            addCriterion("RESPONSE =", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotEqualTo(String value) {
            addCriterion("RESPONSE <>", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThan(String value) {
            addCriterion("RESPONSE >", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONSE >=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThan(String value) {
            addCriterion("RESPONSE <", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThanOrEqualTo(String value) {
            addCriterion("RESPONSE <=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLike(String value) {
            addCriterion("RESPONSE like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotLike(String value) {
            addCriterion("RESPONSE not like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseIn(List<String> values) {
            addCriterion("RESPONSE in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotIn(List<String> values) {
            addCriterion("RESPONSE not in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseBetween(String value1, String value2) {
            addCriterion("RESPONSE between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotBetween(String value1, String value2) {
            addCriterion("RESPONSE not between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andRequesttimeIsNull() {
            addCriterion("REQUESTTIME is null");
            return (Criteria) this;
        }

        public Criteria andRequesttimeIsNotNull() {
            addCriterion("REQUESTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRequesttimeEqualTo(Date value) {
            addCriterion("REQUESTTIME =", value, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeNotEqualTo(Date value) {
            addCriterion("REQUESTTIME <>", value, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeGreaterThan(Date value) {
            addCriterion("REQUESTTIME >", value, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REQUESTTIME >=", value, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeLessThan(Date value) {
            addCriterion("REQUESTTIME <", value, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeLessThanOrEqualTo(Date value) {
            addCriterion("REQUESTTIME <=", value, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeIn(List<Date> values) {
            addCriterion("REQUESTTIME in", values, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeNotIn(List<Date> values) {
            addCriterion("REQUESTTIME not in", values, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeBetween(Date value1, Date value2) {
            addCriterion("REQUESTTIME between", value1, value2, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeNotBetween(Date value1, Date value2) {
            addCriterion("REQUESTTIME not between", value1, value2, "requesttime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeIsNull() {
            addCriterion("RESPONSETIME is null");
            return (Criteria) this;
        }

        public Criteria andResponsetimeIsNotNull() {
            addCriterion("RESPONSETIME is not null");
            return (Criteria) this;
        }

        public Criteria andResponsetimeEqualTo(Date value) {
            addCriterion("RESPONSETIME =", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeNotEqualTo(Date value) {
            addCriterion("RESPONSETIME <>", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeGreaterThan(Date value) {
            addCriterion("RESPONSETIME >", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RESPONSETIME >=", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeLessThan(Date value) {
            addCriterion("RESPONSETIME <", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeLessThanOrEqualTo(Date value) {
            addCriterion("RESPONSETIME <=", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeIn(List<Date> values) {
            addCriterion("RESPONSETIME in", values, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeNotIn(List<Date> values) {
            addCriterion("RESPONSETIME not in", values, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeBetween(Date value1, Date value2) {
            addCriterion("RESPONSETIME between", value1, value2, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeNotBetween(Date value1, Date value2) {
            addCriterion("RESPONSETIME not between", value1, value2, "responsetime");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNull() {
            addCriterion("APPLYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNotNull() {
            addCriterion("APPLYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplynoEqualTo(String value) {
            addCriterion("APPLYNO =", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotEqualTo(String value) {
            addCriterion("APPLYNO <>", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThan(String value) {
            addCriterion("APPLYNO >", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYNO >=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThan(String value) {
            addCriterion("APPLYNO <", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThanOrEqualTo(String value) {
            addCriterion("APPLYNO <=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLike(String value) {
            addCriterion("APPLYNO like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotLike(String value) {
            addCriterion("APPLYNO not like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoIn(List<String> values) {
            addCriterion("APPLYNO in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotIn(List<String> values) {
            addCriterion("APPLYNO not in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoBetween(String value1, String value2) {
            addCriterion("APPLYNO between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotBetween(String value1, String value2) {
            addCriterion("APPLYNO not between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTranCodeIsNull() {
            addCriterion("TRAN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTranCodeIsNotNull() {
            addCriterion("TRAN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTranCodeEqualTo(String value) {
            addCriterion("TRAN_CODE =", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeNotEqualTo(String value) {
            addCriterion("TRAN_CODE <>", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeGreaterThan(String value) {
            addCriterion("TRAN_CODE >", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRAN_CODE >=", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeLessThan(String value) {
            addCriterion("TRAN_CODE <", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeLessThanOrEqualTo(String value) {
            addCriterion("TRAN_CODE <=", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeLike(String value) {
            addCriterion("TRAN_CODE like", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeNotLike(String value) {
            addCriterion("TRAN_CODE not like", value, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeIn(List<String> values) {
            addCriterion("TRAN_CODE in", values, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeNotIn(List<String> values) {
            addCriterion("TRAN_CODE not in", values, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeBetween(String value1, String value2) {
            addCriterion("TRAN_CODE between", value1, value2, "tranCode");
            return (Criteria) this;
        }

        public Criteria andTranCodeNotBetween(String value1, String value2) {
            addCriterion("TRAN_CODE not between", value1, value2, "tranCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeIsNull() {
            addCriterion("RSLT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRsltCodeIsNotNull() {
            addCriterion("RSLT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRsltCodeEqualTo(String value) {
            addCriterion("RSLT_CODE =", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeNotEqualTo(String value) {
            addCriterion("RSLT_CODE <>", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeGreaterThan(String value) {
            addCriterion("RSLT_CODE >", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RSLT_CODE >=", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeLessThan(String value) {
            addCriterion("RSLT_CODE <", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeLessThanOrEqualTo(String value) {
            addCriterion("RSLT_CODE <=", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeLike(String value) {
            addCriterion("RSLT_CODE like", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeNotLike(String value) {
            addCriterion("RSLT_CODE not like", value, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeIn(List<String> values) {
            addCriterion("RSLT_CODE in", values, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeNotIn(List<String> values) {
            addCriterion("RSLT_CODE not in", values, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeBetween(String value1, String value2) {
            addCriterion("RSLT_CODE between", value1, value2, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andRsltCodeNotBetween(String value1, String value2) {
            addCriterion("RSLT_CODE not between", value1, value2, "rsltCode");
            return (Criteria) this;
        }

        public Criteria andResponsebackIsNull() {
            addCriterion("RESPONSEBACK is null");
            return (Criteria) this;
        }

        public Criteria andResponsebackIsNotNull() {
            addCriterion("RESPONSEBACK is not null");
            return (Criteria) this;
        }

        public Criteria andResponsebackEqualTo(String value) {
            addCriterion("RESPONSEBACK =", value, "responseback");
            return (Criteria) this;
        }

        public Criteria andResponsebackNotEqualTo(String value) {
            addCriterion("RESPONSEBACK <>", value, "responseback");
            return (Criteria) this;
        }

        public Criteria andResponsebackGreaterThan(String value) {
            addCriterion("RESPONSEBACK >", value, "responseback");
            return (Criteria) this;
        }

        public Criteria andResponsebackGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONSEBACK >=", value, "responseback");
            return (Criteria) this;
        }

        public Criteria andResponsebackLessThan(String value) {
            addCriterion("RESPONSEBACK <", value, "responseback");
            return (Criteria) this;
        }

        public Criteria andResponsebackLessThanOrEqualTo(String value) {
            addCriterion("RESPONSEBACK <=", value, "responseback");
            return (Criteria) this;
        }

        public Criteria andResponsebackLike(String value) {
            addCriterion("RESPONSEBACK like", value, "responseback");
            return (Criteria) this;
        }

        public Criteria andResponsebackNotLike(String value) {
            addCriterion("RESPONSEBACK not like", value, "responseback");
            return (Criteria) this;
        }

        public Criteria andResponsebackIn(List<String> values) {
            addCriterion("RESPONSEBACK in", values, "responseback");
            return (Criteria) this;
        }

        public Criteria andResponsebackNotIn(List<String> values) {
            addCriterion("RESPONSEBACK not in", values, "responseback");
            return (Criteria) this;
        }

        public Criteria andResponsebackBetween(String value1, String value2) {
            addCriterion("RESPONSEBACK between", value1, value2, "responseback");
            return (Criteria) this;
        }

        public Criteria andResponsebackNotBetween(String value1, String value2) {
            addCriterion("RESPONSEBACK not between", value1, value2, "responseback");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : t_log
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
     * @Table : t_log
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