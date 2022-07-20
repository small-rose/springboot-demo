package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmSwitchcontrolTcExample {
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
    public MmSwitchcontrolTcExample() {
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
     * @Table : mm_switchcontrol_tc
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

        public Criteria andSwitchedsysIsNull() {
            addCriterion("SWITCHEDSYS is null");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysIsNotNull() {
            addCriterion("SWITCHEDSYS is not null");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysEqualTo(String value) {
            addCriterion("SWITCHEDSYS =", value, "switchedsys");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysNotEqualTo(String value) {
            addCriterion("SWITCHEDSYS <>", value, "switchedsys");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysGreaterThan(String value) {
            addCriterion("SWITCHEDSYS >", value, "switchedsys");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysGreaterThanOrEqualTo(String value) {
            addCriterion("SWITCHEDSYS >=", value, "switchedsys");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysLessThan(String value) {
            addCriterion("SWITCHEDSYS <", value, "switchedsys");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysLessThanOrEqualTo(String value) {
            addCriterion("SWITCHEDSYS <=", value, "switchedsys");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysLike(String value) {
            addCriterion("SWITCHEDSYS like", value, "switchedsys");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysNotLike(String value) {
            addCriterion("SWITCHEDSYS not like", value, "switchedsys");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysIn(List<String> values) {
            addCriterion("SWITCHEDSYS in", values, "switchedsys");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysNotIn(List<String> values) {
            addCriterion("SWITCHEDSYS not in", values, "switchedsys");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysBetween(String value1, String value2) {
            addCriterion("SWITCHEDSYS between", value1, value2, "switchedsys");
            return (Criteria) this;
        }

        public Criteria andSwitchedsysNotBetween(String value1, String value2) {
            addCriterion("SWITCHEDSYS not between", value1, value2, "switchedsys");
            return (Criteria) this;
        }

        public Criteria andIfvalidIsNull() {
            addCriterion("IFVALID is null");
            return (Criteria) this;
        }

        public Criteria andIfvalidIsNotNull() {
            addCriterion("IFVALID is not null");
            return (Criteria) this;
        }

        public Criteria andIfvalidEqualTo(String value) {
            addCriterion("IFVALID =", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotEqualTo(String value) {
            addCriterion("IFVALID <>", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThan(String value) {
            addCriterion("IFVALID >", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThanOrEqualTo(String value) {
            addCriterion("IFVALID >=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThan(String value) {
            addCriterion("IFVALID <", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThanOrEqualTo(String value) {
            addCriterion("IFVALID <=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLike(String value) {
            addCriterion("IFVALID like", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotLike(String value) {
            addCriterion("IFVALID not like", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidIn(List<String> values) {
            addCriterion("IFVALID in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotIn(List<String> values) {
            addCriterion("IFVALID not in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidBetween(String value1, String value2) {
            addCriterion("IFVALID between", value1, value2, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotBetween(String value1, String value2) {
            addCriterion("IFVALID not between", value1, value2, "ifvalid");
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

        public Criteria andSwitchinfoIsNull() {
            addCriterion("SWITCHINFO is null");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoIsNotNull() {
            addCriterion("SWITCHINFO is not null");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoEqualTo(String value) {
            addCriterion("SWITCHINFO =", value, "switchinfo");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoNotEqualTo(String value) {
            addCriterion("SWITCHINFO <>", value, "switchinfo");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoGreaterThan(String value) {
            addCriterion("SWITCHINFO >", value, "switchinfo");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoGreaterThanOrEqualTo(String value) {
            addCriterion("SWITCHINFO >=", value, "switchinfo");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoLessThan(String value) {
            addCriterion("SWITCHINFO <", value, "switchinfo");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoLessThanOrEqualTo(String value) {
            addCriterion("SWITCHINFO <=", value, "switchinfo");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoLike(String value) {
            addCriterion("SWITCHINFO like", value, "switchinfo");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoNotLike(String value) {
            addCriterion("SWITCHINFO not like", value, "switchinfo");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoIn(List<String> values) {
            addCriterion("SWITCHINFO in", values, "switchinfo");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoNotIn(List<String> values) {
            addCriterion("SWITCHINFO not in", values, "switchinfo");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoBetween(String value1, String value2) {
            addCriterion("SWITCHINFO between", value1, value2, "switchinfo");
            return (Criteria) this;
        }

        public Criteria andSwitchinfoNotBetween(String value1, String value2) {
            addCriterion("SWITCHINFO not between", value1, value2, "switchinfo");
            return (Criteria) this;
        }

        public Criteria andIntftypeIsNull() {
            addCriterion("INTFTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIntftypeIsNotNull() {
            addCriterion("INTFTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIntftypeEqualTo(String value) {
            addCriterion("INTFTYPE =", value, "intftype");
            return (Criteria) this;
        }

        public Criteria andIntftypeNotEqualTo(String value) {
            addCriterion("INTFTYPE <>", value, "intftype");
            return (Criteria) this;
        }

        public Criteria andIntftypeGreaterThan(String value) {
            addCriterion("INTFTYPE >", value, "intftype");
            return (Criteria) this;
        }

        public Criteria andIntftypeGreaterThanOrEqualTo(String value) {
            addCriterion("INTFTYPE >=", value, "intftype");
            return (Criteria) this;
        }

        public Criteria andIntftypeLessThan(String value) {
            addCriterion("INTFTYPE <", value, "intftype");
            return (Criteria) this;
        }

        public Criteria andIntftypeLessThanOrEqualTo(String value) {
            addCriterion("INTFTYPE <=", value, "intftype");
            return (Criteria) this;
        }

        public Criteria andIntftypeLike(String value) {
            addCriterion("INTFTYPE like", value, "intftype");
            return (Criteria) this;
        }

        public Criteria andIntftypeNotLike(String value) {
            addCriterion("INTFTYPE not like", value, "intftype");
            return (Criteria) this;
        }

        public Criteria andIntftypeIn(List<String> values) {
            addCriterion("INTFTYPE in", values, "intftype");
            return (Criteria) this;
        }

        public Criteria andIntftypeNotIn(List<String> values) {
            addCriterion("INTFTYPE not in", values, "intftype");
            return (Criteria) this;
        }

        public Criteria andIntftypeBetween(String value1, String value2) {
            addCriterion("INTFTYPE between", value1, value2, "intftype");
            return (Criteria) this;
        }

        public Criteria andIntftypeNotBetween(String value1, String value2) {
            addCriterion("INTFTYPE not between", value1, value2, "intftype");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_switchcontrol_tc
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
     * @Table : mm_switchcontrol_tc
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