package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.List;

public class HicmiMidAccDetailExample {
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
    public HicmiMidAccDetailExample() {
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
     * @Table : hicmi_mid_acc_detail
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

        public Criteria andMainIdIsNull() {
            addCriterion("MAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andMainIdIsNotNull() {
            addCriterion("MAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMainIdEqualTo(Long value) {
            addCriterion("MAIN_ID =", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotEqualTo(Long value) {
            addCriterion("MAIN_ID <>", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThan(Long value) {
            addCriterion("MAIN_ID >", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MAIN_ID >=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThan(Long value) {
            addCriterion("MAIN_ID <", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThanOrEqualTo(Long value) {
            addCriterion("MAIN_ID <=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdIn(List<Long> values) {
            addCriterion("MAIN_ID in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotIn(List<Long> values) {
            addCriterion("MAIN_ID not in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdBetween(Long value1, Long value2) {
            addCriterion("MAIN_ID between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotBetween(Long value1, Long value2) {
            addCriterion("MAIN_ID not between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andSubIdIsNull() {
            addCriterion("SUB_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubIdIsNotNull() {
            addCriterion("SUB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubIdEqualTo(Long value) {
            addCriterion("SUB_ID =", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotEqualTo(Long value) {
            addCriterion("SUB_ID <>", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThan(Long value) {
            addCriterion("SUB_ID >", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUB_ID >=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThan(Long value) {
            addCriterion("SUB_ID <", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThanOrEqualTo(Long value) {
            addCriterion("SUB_ID <=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdIn(List<Long> values) {
            addCriterion("SUB_ID in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotIn(List<Long> values) {
            addCriterion("SUB_ID not in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdBetween(Long value1, Long value2) {
            addCriterion("SUB_ID between", value1, value2, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotBetween(Long value1, Long value2) {
            addCriterion("SUB_ID not between", value1, value2, "subId");
            return (Criteria) this;
        }

        public Criteria andTrdnmIsNull() {
            addCriterion("TRDNM is null");
            return (Criteria) this;
        }

        public Criteria andTrdnmIsNotNull() {
            addCriterion("TRDNM is not null");
            return (Criteria) this;
        }

        public Criteria andTrdnmEqualTo(String value) {
            addCriterion("TRDNM =", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmNotEqualTo(String value) {
            addCriterion("TRDNM <>", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmGreaterThan(String value) {
            addCriterion("TRDNM >", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmGreaterThanOrEqualTo(String value) {
            addCriterion("TRDNM >=", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmLessThan(String value) {
            addCriterion("TRDNM <", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmLessThanOrEqualTo(String value) {
            addCriterion("TRDNM <=", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmLike(String value) {
            addCriterion("TRDNM like", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmNotLike(String value) {
            addCriterion("TRDNM not like", value, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmIn(List<String> values) {
            addCriterion("TRDNM in", values, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmNotIn(List<String> values) {
            addCriterion("TRDNM not in", values, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmBetween(String value1, String value2) {
            addCriterion("TRDNM between", value1, value2, "trdnm");
            return (Criteria) this;
        }

        public Criteria andTrdnmNotBetween(String value1, String value2) {
            addCriterion("TRDNM not between", value1, value2, "trdnm");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("DETAIL =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("DETAIL <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("DETAIL >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("DETAIL <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("DETAIL <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("DETAIL like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("DETAIL not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("DETAIL in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("DETAIL not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("DETAIL between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("DETAIL not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeIsNull() {
            addCriterion("PK_CHECKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeIsNotNull() {
            addCriterion("PK_CHECKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeEqualTo(String value) {
            addCriterion("PK_CHECKTYPE =", value, "pkChecktype");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeNotEqualTo(String value) {
            addCriterion("PK_CHECKTYPE <>", value, "pkChecktype");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeGreaterThan(String value) {
            addCriterion("PK_CHECKTYPE >", value, "pkChecktype");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CHECKTYPE >=", value, "pkChecktype");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeLessThan(String value) {
            addCriterion("PK_CHECKTYPE <", value, "pkChecktype");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeLessThanOrEqualTo(String value) {
            addCriterion("PK_CHECKTYPE <=", value, "pkChecktype");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeLike(String value) {
            addCriterion("PK_CHECKTYPE like", value, "pkChecktype");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeNotLike(String value) {
            addCriterion("PK_CHECKTYPE not like", value, "pkChecktype");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeIn(List<String> values) {
            addCriterion("PK_CHECKTYPE in", values, "pkChecktype");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeNotIn(List<String> values) {
            addCriterion("PK_CHECKTYPE not in", values, "pkChecktype");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeBetween(String value1, String value2) {
            addCriterion("PK_CHECKTYPE between", value1, value2, "pkChecktype");
            return (Criteria) this;
        }

        public Criteria andPkChecktypeNotBetween(String value1, String value2) {
            addCriterion("PK_CHECKTYPE not between", value1, value2, "pkChecktype");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueIsNull() {
            addCriterion("PK_CHECKVALUE is null");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueIsNotNull() {
            addCriterion("PK_CHECKVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueEqualTo(String value) {
            addCriterion("PK_CHECKVALUE =", value, "pkCheckvalue");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueNotEqualTo(String value) {
            addCriterion("PK_CHECKVALUE <>", value, "pkCheckvalue");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueGreaterThan(String value) {
            addCriterion("PK_CHECKVALUE >", value, "pkCheckvalue");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CHECKVALUE >=", value, "pkCheckvalue");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueLessThan(String value) {
            addCriterion("PK_CHECKVALUE <", value, "pkCheckvalue");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueLessThanOrEqualTo(String value) {
            addCriterion("PK_CHECKVALUE <=", value, "pkCheckvalue");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueLike(String value) {
            addCriterion("PK_CHECKVALUE like", value, "pkCheckvalue");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueNotLike(String value) {
            addCriterion("PK_CHECKVALUE not like", value, "pkCheckvalue");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueIn(List<String> values) {
            addCriterion("PK_CHECKVALUE in", values, "pkCheckvalue");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueNotIn(List<String> values) {
            addCriterion("PK_CHECKVALUE not in", values, "pkCheckvalue");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueBetween(String value1, String value2) {
            addCriterion("PK_CHECKVALUE between", value1, value2, "pkCheckvalue");
            return (Criteria) this;
        }

        public Criteria andPkCheckvalueNotBetween(String value1, String value2) {
            addCriterion("PK_CHECKVALUE not between", value1, value2, "pkCheckvalue");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : hicmi_mid_acc_detail
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
     * @Table : hicmi_mid_acc_detail
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