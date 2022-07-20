package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmDatahuaLogExample {
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
    public MmDatahuaLogExample() {
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
     * @Table : mm_datahua_log
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

        public Criteria andSeqidIsNull() {
            addCriterion("SEQID is null");
            return (Criteria) this;
        }

        public Criteria andSeqidIsNotNull() {
            addCriterion("SEQID is not null");
            return (Criteria) this;
        }

        public Criteria andSeqidEqualTo(String value) {
            addCriterion("SEQID =", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotEqualTo(String value) {
            addCriterion("SEQID <>", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThan(String value) {
            addCriterion("SEQID >", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThanOrEqualTo(String value) {
            addCriterion("SEQID >=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThan(String value) {
            addCriterion("SEQID <", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThanOrEqualTo(String value) {
            addCriterion("SEQID <=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLike(String value) {
            addCriterion("SEQID like", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotLike(String value) {
            addCriterion("SEQID not like", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidIn(List<String> values) {
            addCriterion("SEQID in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotIn(List<String> values) {
            addCriterion("SEQID not in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidBetween(String value1, String value2) {
            addCriterion("SEQID between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotBetween(String value1, String value2) {
            addCriterion("SEQID not between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andTrancodeIsNull() {
            addCriterion("TRANCODE is null");
            return (Criteria) this;
        }

        public Criteria andTrancodeIsNotNull() {
            addCriterion("TRANCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTrancodeEqualTo(String value) {
            addCriterion("TRANCODE =", value, "trancode");
            return (Criteria) this;
        }

        public Criteria andTrancodeNotEqualTo(String value) {
            addCriterion("TRANCODE <>", value, "trancode");
            return (Criteria) this;
        }

        public Criteria andTrancodeGreaterThan(String value) {
            addCriterion("TRANCODE >", value, "trancode");
            return (Criteria) this;
        }

        public Criteria andTrancodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANCODE >=", value, "trancode");
            return (Criteria) this;
        }

        public Criteria andTrancodeLessThan(String value) {
            addCriterion("TRANCODE <", value, "trancode");
            return (Criteria) this;
        }

        public Criteria andTrancodeLessThanOrEqualTo(String value) {
            addCriterion("TRANCODE <=", value, "trancode");
            return (Criteria) this;
        }

        public Criteria andTrancodeLike(String value) {
            addCriterion("TRANCODE like", value, "trancode");
            return (Criteria) this;
        }

        public Criteria andTrancodeNotLike(String value) {
            addCriterion("TRANCODE not like", value, "trancode");
            return (Criteria) this;
        }

        public Criteria andTrancodeIn(List<String> values) {
            addCriterion("TRANCODE in", values, "trancode");
            return (Criteria) this;
        }

        public Criteria andTrancodeNotIn(List<String> values) {
            addCriterion("TRANCODE not in", values, "trancode");
            return (Criteria) this;
        }

        public Criteria andTrancodeBetween(String value1, String value2) {
            addCriterion("TRANCODE between", value1, value2, "trancode");
            return (Criteria) this;
        }

        public Criteria andTrancodeNotBetween(String value1, String value2) {
            addCriterion("TRANCODE not between", value1, value2, "trancode");
            return (Criteria) this;
        }

        public Criteria andRsltcodeIsNull() {
            addCriterion("RSLTCODE is null");
            return (Criteria) this;
        }

        public Criteria andRsltcodeIsNotNull() {
            addCriterion("RSLTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRsltcodeEqualTo(String value) {
            addCriterion("RSLTCODE =", value, "rsltcode");
            return (Criteria) this;
        }

        public Criteria andRsltcodeNotEqualTo(String value) {
            addCriterion("RSLTCODE <>", value, "rsltcode");
            return (Criteria) this;
        }

        public Criteria andRsltcodeGreaterThan(String value) {
            addCriterion("RSLTCODE >", value, "rsltcode");
            return (Criteria) this;
        }

        public Criteria andRsltcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RSLTCODE >=", value, "rsltcode");
            return (Criteria) this;
        }

        public Criteria andRsltcodeLessThan(String value) {
            addCriterion("RSLTCODE <", value, "rsltcode");
            return (Criteria) this;
        }

        public Criteria andRsltcodeLessThanOrEqualTo(String value) {
            addCriterion("RSLTCODE <=", value, "rsltcode");
            return (Criteria) this;
        }

        public Criteria andRsltcodeLike(String value) {
            addCriterion("RSLTCODE like", value, "rsltcode");
            return (Criteria) this;
        }

        public Criteria andRsltcodeNotLike(String value) {
            addCriterion("RSLTCODE not like", value, "rsltcode");
            return (Criteria) this;
        }

        public Criteria andRsltcodeIn(List<String> values) {
            addCriterion("RSLTCODE in", values, "rsltcode");
            return (Criteria) this;
        }

        public Criteria andRsltcodeNotIn(List<String> values) {
            addCriterion("RSLTCODE not in", values, "rsltcode");
            return (Criteria) this;
        }

        public Criteria andRsltcodeBetween(String value1, String value2) {
            addCriterion("RSLTCODE between", value1, value2, "rsltcode");
            return (Criteria) this;
        }

        public Criteria andRsltcodeNotBetween(String value1, String value2) {
            addCriterion("RSLTCODE not between", value1, value2, "rsltcode");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_datahua_log
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
     * @Table : mm_datahua_log
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