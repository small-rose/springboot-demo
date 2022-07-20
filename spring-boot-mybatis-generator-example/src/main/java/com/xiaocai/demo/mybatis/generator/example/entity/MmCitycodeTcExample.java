package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmCitycodeTcExample {
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
    public MmCitycodeTcExample() {
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
     * @Table : mm_citycode_tc
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

        public Criteria andAddrcodeIsNull() {
            addCriterion("ADDRCODE is null");
            return (Criteria) this;
        }

        public Criteria andAddrcodeIsNotNull() {
            addCriterion("ADDRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAddrcodeEqualTo(String value) {
            addCriterion("ADDRCODE =", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeNotEqualTo(String value) {
            addCriterion("ADDRCODE <>", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeGreaterThan(String value) {
            addCriterion("ADDRCODE >", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRCODE >=", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeLessThan(String value) {
            addCriterion("ADDRCODE <", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeLessThanOrEqualTo(String value) {
            addCriterion("ADDRCODE <=", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeLike(String value) {
            addCriterion("ADDRCODE like", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeNotLike(String value) {
            addCriterion("ADDRCODE not like", value, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeIn(List<String> values) {
            addCriterion("ADDRCODE in", values, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeNotIn(List<String> values) {
            addCriterion("ADDRCODE not in", values, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeBetween(String value1, String value2) {
            addCriterion("ADDRCODE between", value1, value2, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrcodeNotBetween(String value1, String value2) {
            addCriterion("ADDRCODE not between", value1, value2, "addrcode");
            return (Criteria) this;
        }

        public Criteria andAddrnameIsNull() {
            addCriterion("ADDRNAME is null");
            return (Criteria) this;
        }

        public Criteria andAddrnameIsNotNull() {
            addCriterion("ADDRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddrnameEqualTo(String value) {
            addCriterion("ADDRNAME =", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameNotEqualTo(String value) {
            addCriterion("ADDRNAME <>", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameGreaterThan(String value) {
            addCriterion("ADDRNAME >", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRNAME >=", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameLessThan(String value) {
            addCriterion("ADDRNAME <", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameLessThanOrEqualTo(String value) {
            addCriterion("ADDRNAME <=", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameLike(String value) {
            addCriterion("ADDRNAME like", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameNotLike(String value) {
            addCriterion("ADDRNAME not like", value, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameIn(List<String> values) {
            addCriterion("ADDRNAME in", values, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameNotIn(List<String> values) {
            addCriterion("ADDRNAME not in", values, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameBetween(String value1, String value2) {
            addCriterion("ADDRNAME between", value1, value2, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrnameNotBetween(String value1, String value2) {
            addCriterion("ADDRNAME not between", value1, value2, "addrname");
            return (Criteria) this;
        }

        public Criteria andAddrlevelIsNull() {
            addCriterion("ADDRLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAddrlevelIsNotNull() {
            addCriterion("ADDRLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAddrlevelEqualTo(String value) {
            addCriterion("ADDRLEVEL =", value, "addrlevel");
            return (Criteria) this;
        }

        public Criteria andAddrlevelNotEqualTo(String value) {
            addCriterion("ADDRLEVEL <>", value, "addrlevel");
            return (Criteria) this;
        }

        public Criteria andAddrlevelGreaterThan(String value) {
            addCriterion("ADDRLEVEL >", value, "addrlevel");
            return (Criteria) this;
        }

        public Criteria andAddrlevelGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRLEVEL >=", value, "addrlevel");
            return (Criteria) this;
        }

        public Criteria andAddrlevelLessThan(String value) {
            addCriterion("ADDRLEVEL <", value, "addrlevel");
            return (Criteria) this;
        }

        public Criteria andAddrlevelLessThanOrEqualTo(String value) {
            addCriterion("ADDRLEVEL <=", value, "addrlevel");
            return (Criteria) this;
        }

        public Criteria andAddrlevelLike(String value) {
            addCriterion("ADDRLEVEL like", value, "addrlevel");
            return (Criteria) this;
        }

        public Criteria andAddrlevelNotLike(String value) {
            addCriterion("ADDRLEVEL not like", value, "addrlevel");
            return (Criteria) this;
        }

        public Criteria andAddrlevelIn(List<String> values) {
            addCriterion("ADDRLEVEL in", values, "addrlevel");
            return (Criteria) this;
        }

        public Criteria andAddrlevelNotIn(List<String> values) {
            addCriterion("ADDRLEVEL not in", values, "addrlevel");
            return (Criteria) this;
        }

        public Criteria andAddrlevelBetween(String value1, String value2) {
            addCriterion("ADDRLEVEL between", value1, value2, "addrlevel");
            return (Criteria) this;
        }

        public Criteria andAddrlevelNotBetween(String value1, String value2) {
            addCriterion("ADDRLEVEL not between", value1, value2, "addrlevel");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("CITYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("CITYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("CITYNAME =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("CITYNAME <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("CITYNAME >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("CITYNAME >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("CITYNAME <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("CITYNAME <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("CITYNAME like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("CITYNAME not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("CITYNAME in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("CITYNAME not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("CITYNAME between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("CITYNAME not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("CITYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("CITYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("CITYCODE =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("CITYCODE <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("CITYCODE >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITYCODE >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("CITYCODE <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("CITYCODE <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("CITYCODE like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("CITYCODE not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("CITYCODE in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("CITYCODE not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("CITYCODE between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("CITYCODE not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andProvnameIsNull() {
            addCriterion("PROVNAME is null");
            return (Criteria) this;
        }

        public Criteria andProvnameIsNotNull() {
            addCriterion("PROVNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProvnameEqualTo(String value) {
            addCriterion("PROVNAME =", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotEqualTo(String value) {
            addCriterion("PROVNAME <>", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameGreaterThan(String value) {
            addCriterion("PROVNAME >", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVNAME >=", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLessThan(String value) {
            addCriterion("PROVNAME <", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLessThanOrEqualTo(String value) {
            addCriterion("PROVNAME <=", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameLike(String value) {
            addCriterion("PROVNAME like", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotLike(String value) {
            addCriterion("PROVNAME not like", value, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameIn(List<String> values) {
            addCriterion("PROVNAME in", values, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotIn(List<String> values) {
            addCriterion("PROVNAME not in", values, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameBetween(String value1, String value2) {
            addCriterion("PROVNAME between", value1, value2, "provname");
            return (Criteria) this;
        }

        public Criteria andProvnameNotBetween(String value1, String value2) {
            addCriterion("PROVNAME not between", value1, value2, "provname");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNull() {
            addCriterion("PROVCODE is null");
            return (Criteria) this;
        }

        public Criteria andProvcodeIsNotNull() {
            addCriterion("PROVCODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvcodeEqualTo(String value) {
            addCriterion("PROVCODE =", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotEqualTo(String value) {
            addCriterion("PROVCODE <>", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThan(String value) {
            addCriterion("PROVCODE >", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVCODE >=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThan(String value) {
            addCriterion("PROVCODE <", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLessThanOrEqualTo(String value) {
            addCriterion("PROVCODE <=", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeLike(String value) {
            addCriterion("PROVCODE like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotLike(String value) {
            addCriterion("PROVCODE not like", value, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeIn(List<String> values) {
            addCriterion("PROVCODE in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotIn(List<String> values) {
            addCriterion("PROVCODE not in", values, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeBetween(String value1, String value2) {
            addCriterion("PROVCODE between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andProvcodeNotBetween(String value1, String value2) {
            addCriterion("PROVCODE not between", value1, value2, "provcode");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_citycode_tc
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
     * @Table : mm_citycode_tc
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