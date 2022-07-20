package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmReinsurerTcExample {
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
    public MmReinsurerTcExample() {
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
     * @Table : mm_reinsurer_tc
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

        public Criteria andReinsurercodeIsNull() {
            addCriterion("REINSURERCODE is null");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeIsNotNull() {
            addCriterion("REINSURERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeEqualTo(String value) {
            addCriterion("REINSURERCODE =", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotEqualTo(String value) {
            addCriterion("REINSURERCODE <>", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeGreaterThan(String value) {
            addCriterion("REINSURERCODE >", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERCODE >=", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLessThan(String value) {
            addCriterion("REINSURERCODE <", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLessThanOrEqualTo(String value) {
            addCriterion("REINSURERCODE <=", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeLike(String value) {
            addCriterion("REINSURERCODE like", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotLike(String value) {
            addCriterion("REINSURERCODE not like", value, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeIn(List<String> values) {
            addCriterion("REINSURERCODE in", values, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotIn(List<String> values) {
            addCriterion("REINSURERCODE not in", values, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeBetween(String value1, String value2) {
            addCriterion("REINSURERCODE between", value1, value2, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurercodeNotBetween(String value1, String value2) {
            addCriterion("REINSURERCODE not between", value1, value2, "reinsurercode");
            return (Criteria) this;
        }

        public Criteria andReinsurernameIsNull() {
            addCriterion("REINSURERNAME is null");
            return (Criteria) this;
        }

        public Criteria andReinsurernameIsNotNull() {
            addCriterion("REINSURERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurernameEqualTo(String value) {
            addCriterion("REINSURERNAME =", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameNotEqualTo(String value) {
            addCriterion("REINSURERNAME <>", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameGreaterThan(String value) {
            addCriterion("REINSURERNAME >", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERNAME >=", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameLessThan(String value) {
            addCriterion("REINSURERNAME <", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameLessThanOrEqualTo(String value) {
            addCriterion("REINSURERNAME <=", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameLike(String value) {
            addCriterion("REINSURERNAME like", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameNotLike(String value) {
            addCriterion("REINSURERNAME not like", value, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameIn(List<String> values) {
            addCriterion("REINSURERNAME in", values, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameNotIn(List<String> values) {
            addCriterion("REINSURERNAME not in", values, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameBetween(String value1, String value2) {
            addCriterion("REINSURERNAME between", value1, value2, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurernameNotBetween(String value1, String value2) {
            addCriterion("REINSURERNAME not between", value1, value2, "reinsurername");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameIsNull() {
            addCriterion("REINSURERENNAME is null");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameIsNotNull() {
            addCriterion("REINSURERENNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameEqualTo(String value) {
            addCriterion("REINSURERENNAME =", value, "reinsurerenname");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameNotEqualTo(String value) {
            addCriterion("REINSURERENNAME <>", value, "reinsurerenname");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameGreaterThan(String value) {
            addCriterion("REINSURERENNAME >", value, "reinsurerenname");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERENNAME >=", value, "reinsurerenname");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameLessThan(String value) {
            addCriterion("REINSURERENNAME <", value, "reinsurerenname");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameLessThanOrEqualTo(String value) {
            addCriterion("REINSURERENNAME <=", value, "reinsurerenname");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameLike(String value) {
            addCriterion("REINSURERENNAME like", value, "reinsurerenname");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameNotLike(String value) {
            addCriterion("REINSURERENNAME not like", value, "reinsurerenname");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameIn(List<String> values) {
            addCriterion("REINSURERENNAME in", values, "reinsurerenname");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameNotIn(List<String> values) {
            addCriterion("REINSURERENNAME not in", values, "reinsurerenname");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameBetween(String value1, String value2) {
            addCriterion("REINSURERENNAME between", value1, value2, "reinsurerenname");
            return (Criteria) this;
        }

        public Criteria andReinsurerennameNotBetween(String value1, String value2) {
            addCriterion("REINSURERENNAME not between", value1, value2, "reinsurerenname");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressIsNull() {
            addCriterion("REINSURERADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressIsNotNull() {
            addCriterion("REINSURERADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressEqualTo(String value) {
            addCriterion("REINSURERADDRESS =", value, "reinsureraddress");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressNotEqualTo(String value) {
            addCriterion("REINSURERADDRESS <>", value, "reinsureraddress");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressGreaterThan(String value) {
            addCriterion("REINSURERADDRESS >", value, "reinsureraddress");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERADDRESS >=", value, "reinsureraddress");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressLessThan(String value) {
            addCriterion("REINSURERADDRESS <", value, "reinsureraddress");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressLessThanOrEqualTo(String value) {
            addCriterion("REINSURERADDRESS <=", value, "reinsureraddress");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressLike(String value) {
            addCriterion("REINSURERADDRESS like", value, "reinsureraddress");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressNotLike(String value) {
            addCriterion("REINSURERADDRESS not like", value, "reinsureraddress");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressIn(List<String> values) {
            addCriterion("REINSURERADDRESS in", values, "reinsureraddress");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressNotIn(List<String> values) {
            addCriterion("REINSURERADDRESS not in", values, "reinsureraddress");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressBetween(String value1, String value2) {
            addCriterion("REINSURERADDRESS between", value1, value2, "reinsureraddress");
            return (Criteria) this;
        }

        public Criteria andReinsureraddressNotBetween(String value1, String value2) {
            addCriterion("REINSURERADDRESS not between", value1, value2, "reinsureraddress");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressIsNull() {
            addCriterion("REINSURERENADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressIsNotNull() {
            addCriterion("REINSURERENADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressEqualTo(String value) {
            addCriterion("REINSURERENADDRESS =", value, "reinsurerenaddress");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressNotEqualTo(String value) {
            addCriterion("REINSURERENADDRESS <>", value, "reinsurerenaddress");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressGreaterThan(String value) {
            addCriterion("REINSURERENADDRESS >", value, "reinsurerenaddress");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERENADDRESS >=", value, "reinsurerenaddress");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressLessThan(String value) {
            addCriterion("REINSURERENADDRESS <", value, "reinsurerenaddress");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressLessThanOrEqualTo(String value) {
            addCriterion("REINSURERENADDRESS <=", value, "reinsurerenaddress");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressLike(String value) {
            addCriterion("REINSURERENADDRESS like", value, "reinsurerenaddress");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressNotLike(String value) {
            addCriterion("REINSURERENADDRESS not like", value, "reinsurerenaddress");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressIn(List<String> values) {
            addCriterion("REINSURERENADDRESS in", values, "reinsurerenaddress");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressNotIn(List<String> values) {
            addCriterion("REINSURERENADDRESS not in", values, "reinsurerenaddress");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressBetween(String value1, String value2) {
            addCriterion("REINSURERENADDRESS between", value1, value2, "reinsurerenaddress");
            return (Criteria) this;
        }

        public Criteria andReinsurerenaddressNotBetween(String value1, String value2) {
            addCriterion("REINSURERENADDRESS not between", value1, value2, "reinsurerenaddress");
            return (Criteria) this;
        }

        public Criteria andReinsurertelIsNull() {
            addCriterion("REINSURERTEL is null");
            return (Criteria) this;
        }

        public Criteria andReinsurertelIsNotNull() {
            addCriterion("REINSURERTEL is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurertelEqualTo(String value) {
            addCriterion("REINSURERTEL =", value, "reinsurertel");
            return (Criteria) this;
        }

        public Criteria andReinsurertelNotEqualTo(String value) {
            addCriterion("REINSURERTEL <>", value, "reinsurertel");
            return (Criteria) this;
        }

        public Criteria andReinsurertelGreaterThan(String value) {
            addCriterion("REINSURERTEL >", value, "reinsurertel");
            return (Criteria) this;
        }

        public Criteria andReinsurertelGreaterThanOrEqualTo(String value) {
            addCriterion("REINSURERTEL >=", value, "reinsurertel");
            return (Criteria) this;
        }

        public Criteria andReinsurertelLessThan(String value) {
            addCriterion("REINSURERTEL <", value, "reinsurertel");
            return (Criteria) this;
        }

        public Criteria andReinsurertelLessThanOrEqualTo(String value) {
            addCriterion("REINSURERTEL <=", value, "reinsurertel");
            return (Criteria) this;
        }

        public Criteria andReinsurertelLike(String value) {
            addCriterion("REINSURERTEL like", value, "reinsurertel");
            return (Criteria) this;
        }

        public Criteria andReinsurertelNotLike(String value) {
            addCriterion("REINSURERTEL not like", value, "reinsurertel");
            return (Criteria) this;
        }

        public Criteria andReinsurertelIn(List<String> values) {
            addCriterion("REINSURERTEL in", values, "reinsurertel");
            return (Criteria) this;
        }

        public Criteria andReinsurertelNotIn(List<String> values) {
            addCriterion("REINSURERTEL not in", values, "reinsurertel");
            return (Criteria) this;
        }

        public Criteria andReinsurertelBetween(String value1, String value2) {
            addCriterion("REINSURERTEL between", value1, value2, "reinsurertel");
            return (Criteria) this;
        }

        public Criteria andReinsurertelNotBetween(String value1, String value2) {
            addCriterion("REINSURERTEL not between", value1, value2, "reinsurertel");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("LINKMAN is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("LINKMAN is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("LINKMAN =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("LINKMAN <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("LINKMAN >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("LINKMAN <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("LINKMAN like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("LINKMAN not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("LINKMAN in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("LINKMAN not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("LINKMAN between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("LINKMAN not between", value1, value2, "linkman");
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

        public Criteria andIfoverseaIsNull() {
            addCriterion("IFOVERSEA is null");
            return (Criteria) this;
        }

        public Criteria andIfoverseaIsNotNull() {
            addCriterion("IFOVERSEA is not null");
            return (Criteria) this;
        }

        public Criteria andIfoverseaEqualTo(String value) {
            addCriterion("IFOVERSEA =", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaNotEqualTo(String value) {
            addCriterion("IFOVERSEA <>", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaGreaterThan(String value) {
            addCriterion("IFOVERSEA >", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaGreaterThanOrEqualTo(String value) {
            addCriterion("IFOVERSEA >=", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaLessThan(String value) {
            addCriterion("IFOVERSEA <", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaLessThanOrEqualTo(String value) {
            addCriterion("IFOVERSEA <=", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaLike(String value) {
            addCriterion("IFOVERSEA like", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaNotLike(String value) {
            addCriterion("IFOVERSEA not like", value, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaIn(List<String> values) {
            addCriterion("IFOVERSEA in", values, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaNotIn(List<String> values) {
            addCriterion("IFOVERSEA not in", values, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaBetween(String value1, String value2) {
            addCriterion("IFOVERSEA between", value1, value2, "ifoversea");
            return (Criteria) this;
        }

        public Criteria andIfoverseaNotBetween(String value1, String value2) {
            addCriterion("IFOVERSEA not between", value1, value2, "ifoversea");
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

        public Criteria andReinsurersolvencyIsNull() {
            addCriterion("REINSURERSOLVENCY is null");
            return (Criteria) this;
        }

        public Criteria andReinsurersolvencyIsNotNull() {
            addCriterion("REINSURERSOLVENCY is not null");
            return (Criteria) this;
        }

        public Criteria andReinsurersolvencyEqualTo(Long value) {
            addCriterion("REINSURERSOLVENCY =", value, "reinsurersolvency");
            return (Criteria) this;
        }

        public Criteria andReinsurersolvencyNotEqualTo(Long value) {
            addCriterion("REINSURERSOLVENCY <>", value, "reinsurersolvency");
            return (Criteria) this;
        }

        public Criteria andReinsurersolvencyGreaterThan(Long value) {
            addCriterion("REINSURERSOLVENCY >", value, "reinsurersolvency");
            return (Criteria) this;
        }

        public Criteria andReinsurersolvencyGreaterThanOrEqualTo(Long value) {
            addCriterion("REINSURERSOLVENCY >=", value, "reinsurersolvency");
            return (Criteria) this;
        }

        public Criteria andReinsurersolvencyLessThan(Long value) {
            addCriterion("REINSURERSOLVENCY <", value, "reinsurersolvency");
            return (Criteria) this;
        }

        public Criteria andReinsurersolvencyLessThanOrEqualTo(Long value) {
            addCriterion("REINSURERSOLVENCY <=", value, "reinsurersolvency");
            return (Criteria) this;
        }

        public Criteria andReinsurersolvencyIn(List<Long> values) {
            addCriterion("REINSURERSOLVENCY in", values, "reinsurersolvency");
            return (Criteria) this;
        }

        public Criteria andReinsurersolvencyNotIn(List<Long> values) {
            addCriterion("REINSURERSOLVENCY not in", values, "reinsurersolvency");
            return (Criteria) this;
        }

        public Criteria andReinsurersolvencyBetween(Long value1, Long value2) {
            addCriterion("REINSURERSOLVENCY between", value1, value2, "reinsurersolvency");
            return (Criteria) this;
        }

        public Criteria andReinsurersolvencyNotBetween(Long value1, Long value2) {
            addCriterion("REINSURERSOLVENCY not between", value1, value2, "reinsurersolvency");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNull() {
            addCriterion("CERTIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNotNull() {
            addCriterion("CERTIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeEqualTo(String value) {
            addCriterion("CERTIFICATETYPE =", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <>", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThan(String value) {
            addCriterion("CERTIFICATETYPE >", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE >=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThan(String value) {
            addCriterion("CERTIFICATETYPE <", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLike(String value) {
            addCriterion("CERTIFICATETYPE like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotLike(String value) {
            addCriterion("CERTIFICATETYPE not like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIn(List<String> values) {
            addCriterion("CERTIFICATETYPE in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotIn(List<String> values) {
            addCriterion("CERTIFICATETYPE not in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE not between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIsNull() {
            addCriterion("CERTIFICATENO is null");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIsNotNull() {
            addCriterion("CERTIFICATENO is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatenoEqualTo(String value) {
            addCriterion("CERTIFICATENO =", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotEqualTo(String value) {
            addCriterion("CERTIFICATENO <>", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoGreaterThan(String value) {
            addCriterion("CERTIFICATENO >", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATENO >=", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLessThan(String value) {
            addCriterion("CERTIFICATENO <", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATENO <=", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoLike(String value) {
            addCriterion("CERTIFICATENO like", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotLike(String value) {
            addCriterion("CERTIFICATENO not like", value, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoIn(List<String> values) {
            addCriterion("CERTIFICATENO in", values, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotIn(List<String> values) {
            addCriterion("CERTIFICATENO not in", values, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoBetween(String value1, String value2) {
            addCriterion("CERTIFICATENO between", value1, value2, "certificateno");
            return (Criteria) this;
        }

        public Criteria andCertificatenoNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATENO not between", value1, value2, "certificateno");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeIsNull() {
            addCriterion("TAXPAYERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeIsNotNull() {
            addCriterion("TAXPAYERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeEqualTo(String value) {
            addCriterion("TAXPAYERTYPE =", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeNotEqualTo(String value) {
            addCriterion("TAXPAYERTYPE <>", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeGreaterThan(String value) {
            addCriterion("TAXPAYERTYPE >", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERTYPE >=", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeLessThan(String value) {
            addCriterion("TAXPAYERTYPE <", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERTYPE <=", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeLike(String value) {
            addCriterion("TAXPAYERTYPE like", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeNotLike(String value) {
            addCriterion("TAXPAYERTYPE not like", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeIn(List<String> values) {
            addCriterion("TAXPAYERTYPE in", values, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeNotIn(List<String> values) {
            addCriterion("TAXPAYERTYPE not in", values, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeBetween(String value1, String value2) {
            addCriterion("TAXPAYERTYPE between", value1, value2, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERTYPE not between", value1, value2, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumIsNull() {
            addCriterion("TAXPAYERNUM is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumIsNotNull() {
            addCriterion("TAXPAYERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumEqualTo(String value) {
            addCriterion("TAXPAYERNUM =", value, "taxpayernum");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumNotEqualTo(String value) {
            addCriterion("TAXPAYERNUM <>", value, "taxpayernum");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumGreaterThan(String value) {
            addCriterion("TAXPAYERNUM >", value, "taxpayernum");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNUM >=", value, "taxpayernum");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumLessThan(String value) {
            addCriterion("TAXPAYERNUM <", value, "taxpayernum");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNUM <=", value, "taxpayernum");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumLike(String value) {
            addCriterion("TAXPAYERNUM like", value, "taxpayernum");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumNotLike(String value) {
            addCriterion("TAXPAYERNUM not like", value, "taxpayernum");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumIn(List<String> values) {
            addCriterion("TAXPAYERNUM in", values, "taxpayernum");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumNotIn(List<String> values) {
            addCriterion("TAXPAYERNUM not in", values, "taxpayernum");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumBetween(String value1, String value2) {
            addCriterion("TAXPAYERNUM between", value1, value2, "taxpayernum");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERNUM not between", value1, value2, "taxpayernum");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrIsNull() {
            addCriterion("TAXPAYERADDR is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrIsNotNull() {
            addCriterion("TAXPAYERADDR is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrEqualTo(String value) {
            addCriterion("TAXPAYERADDR =", value, "taxpayeraddr");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrNotEqualTo(String value) {
            addCriterion("TAXPAYERADDR <>", value, "taxpayeraddr");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrGreaterThan(String value) {
            addCriterion("TAXPAYERADDR >", value, "taxpayeraddr");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERADDR >=", value, "taxpayeraddr");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrLessThan(String value) {
            addCriterion("TAXPAYERADDR <", value, "taxpayeraddr");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERADDR <=", value, "taxpayeraddr");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrLike(String value) {
            addCriterion("TAXPAYERADDR like", value, "taxpayeraddr");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrNotLike(String value) {
            addCriterion("TAXPAYERADDR not like", value, "taxpayeraddr");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrIn(List<String> values) {
            addCriterion("TAXPAYERADDR in", values, "taxpayeraddr");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrNotIn(List<String> values) {
            addCriterion("TAXPAYERADDR not in", values, "taxpayeraddr");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrBetween(String value1, String value2) {
            addCriterion("TAXPAYERADDR between", value1, value2, "taxpayeraddr");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddrNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERADDR not between", value1, value2, "taxpayeraddr");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankIsNull() {
            addCriterion("TAXPAYBANK is null");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankIsNotNull() {
            addCriterion("TAXPAYBANK is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankEqualTo(String value) {
            addCriterion("TAXPAYBANK =", value, "taxpaybank");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankNotEqualTo(String value) {
            addCriterion("TAXPAYBANK <>", value, "taxpaybank");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankGreaterThan(String value) {
            addCriterion("TAXPAYBANK >", value, "taxpaybank");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYBANK >=", value, "taxpaybank");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankLessThan(String value) {
            addCriterion("TAXPAYBANK <", value, "taxpaybank");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYBANK <=", value, "taxpaybank");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankLike(String value) {
            addCriterion("TAXPAYBANK like", value, "taxpaybank");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankNotLike(String value) {
            addCriterion("TAXPAYBANK not like", value, "taxpaybank");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankIn(List<String> values) {
            addCriterion("TAXPAYBANK in", values, "taxpaybank");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankNotIn(List<String> values) {
            addCriterion("TAXPAYBANK not in", values, "taxpaybank");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankBetween(String value1, String value2) {
            addCriterion("TAXPAYBANK between", value1, value2, "taxpaybank");
            return (Criteria) this;
        }

        public Criteria andTaxpaybankNotBetween(String value1, String value2) {
            addCriterion("TAXPAYBANK not between", value1, value2, "taxpaybank");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoIsNull() {
            addCriterion("TAXPAYERACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoIsNotNull() {
            addCriterion("TAXPAYERACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoEqualTo(String value) {
            addCriterion("TAXPAYERACCOUNTNO =", value, "taxpayeraccountno");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoNotEqualTo(String value) {
            addCriterion("TAXPAYERACCOUNTNO <>", value, "taxpayeraccountno");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoGreaterThan(String value) {
            addCriterion("TAXPAYERACCOUNTNO >", value, "taxpayeraccountno");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERACCOUNTNO >=", value, "taxpayeraccountno");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoLessThan(String value) {
            addCriterion("TAXPAYERACCOUNTNO <", value, "taxpayeraccountno");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERACCOUNTNO <=", value, "taxpayeraccountno");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoLike(String value) {
            addCriterion("TAXPAYERACCOUNTNO like", value, "taxpayeraccountno");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoNotLike(String value) {
            addCriterion("TAXPAYERACCOUNTNO not like", value, "taxpayeraccountno");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoIn(List<String> values) {
            addCriterion("TAXPAYERACCOUNTNO in", values, "taxpayeraccountno");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoNotIn(List<String> values) {
            addCriterion("TAXPAYERACCOUNTNO not in", values, "taxpayeraccountno");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoBetween(String value1, String value2) {
            addCriterion("TAXPAYERACCOUNTNO between", value1, value2, "taxpayeraccountno");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraccountnoNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERACCOUNTNO not between", value1, value2, "taxpayeraccountno");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelIsNull() {
            addCriterion("TAXPAYERTEL is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelIsNotNull() {
            addCriterion("TAXPAYERTEL is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelEqualTo(String value) {
            addCriterion("TAXPAYERTEL =", value, "taxpayertel");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelNotEqualTo(String value) {
            addCriterion("TAXPAYERTEL <>", value, "taxpayertel");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelGreaterThan(String value) {
            addCriterion("TAXPAYERTEL >", value, "taxpayertel");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERTEL >=", value, "taxpayertel");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelLessThan(String value) {
            addCriterion("TAXPAYERTEL <", value, "taxpayertel");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERTEL <=", value, "taxpayertel");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelLike(String value) {
            addCriterion("TAXPAYERTEL like", value, "taxpayertel");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelNotLike(String value) {
            addCriterion("TAXPAYERTEL not like", value, "taxpayertel");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelIn(List<String> values) {
            addCriterion("TAXPAYERTEL in", values, "taxpayertel");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelNotIn(List<String> values) {
            addCriterion("TAXPAYERTEL not in", values, "taxpayertel");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelBetween(String value1, String value2) {
            addCriterion("TAXPAYERTEL between", value1, value2, "taxpayertel");
            return (Criteria) this;
        }

        public Criteria andTaxpayertelNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERTEL not between", value1, value2, "taxpayertel");
            return (Criteria) this;
        }

        public Criteria andPosttypeIsNull() {
            addCriterion("POSTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPosttypeIsNotNull() {
            addCriterion("POSTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPosttypeEqualTo(String value) {
            addCriterion("POSTTYPE =", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotEqualTo(String value) {
            addCriterion("POSTTYPE <>", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeGreaterThan(String value) {
            addCriterion("POSTTYPE >", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTTYPE >=", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeLessThan(String value) {
            addCriterion("POSTTYPE <", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeLessThanOrEqualTo(String value) {
            addCriterion("POSTTYPE <=", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeLike(String value) {
            addCriterion("POSTTYPE like", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotLike(String value) {
            addCriterion("POSTTYPE not like", value, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeIn(List<String> values) {
            addCriterion("POSTTYPE in", values, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotIn(List<String> values) {
            addCriterion("POSTTYPE not in", values, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeBetween(String value1, String value2) {
            addCriterion("POSTTYPE between", value1, value2, "posttype");
            return (Criteria) this;
        }

        public Criteria andPosttypeNotBetween(String value1, String value2) {
            addCriterion("POSTTYPE not between", value1, value2, "posttype");
            return (Criteria) this;
        }

        public Criteria andPostreceiverIsNull() {
            addCriterion("POSTRECEIVER is null");
            return (Criteria) this;
        }

        public Criteria andPostreceiverIsNotNull() {
            addCriterion("POSTRECEIVER is not null");
            return (Criteria) this;
        }

        public Criteria andPostreceiverEqualTo(String value) {
            addCriterion("POSTRECEIVER =", value, "postreceiver");
            return (Criteria) this;
        }

        public Criteria andPostreceiverNotEqualTo(String value) {
            addCriterion("POSTRECEIVER <>", value, "postreceiver");
            return (Criteria) this;
        }

        public Criteria andPostreceiverGreaterThan(String value) {
            addCriterion("POSTRECEIVER >", value, "postreceiver");
            return (Criteria) this;
        }

        public Criteria andPostreceiverGreaterThanOrEqualTo(String value) {
            addCriterion("POSTRECEIVER >=", value, "postreceiver");
            return (Criteria) this;
        }

        public Criteria andPostreceiverLessThan(String value) {
            addCriterion("POSTRECEIVER <", value, "postreceiver");
            return (Criteria) this;
        }

        public Criteria andPostreceiverLessThanOrEqualTo(String value) {
            addCriterion("POSTRECEIVER <=", value, "postreceiver");
            return (Criteria) this;
        }

        public Criteria andPostreceiverLike(String value) {
            addCriterion("POSTRECEIVER like", value, "postreceiver");
            return (Criteria) this;
        }

        public Criteria andPostreceiverNotLike(String value) {
            addCriterion("POSTRECEIVER not like", value, "postreceiver");
            return (Criteria) this;
        }

        public Criteria andPostreceiverIn(List<String> values) {
            addCriterion("POSTRECEIVER in", values, "postreceiver");
            return (Criteria) this;
        }

        public Criteria andPostreceiverNotIn(List<String> values) {
            addCriterion("POSTRECEIVER not in", values, "postreceiver");
            return (Criteria) this;
        }

        public Criteria andPostreceiverBetween(String value1, String value2) {
            addCriterion("POSTRECEIVER between", value1, value2, "postreceiver");
            return (Criteria) this;
        }

        public Criteria andPostreceiverNotBetween(String value1, String value2) {
            addCriterion("POSTRECEIVER not between", value1, value2, "postreceiver");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelIsNull() {
            addCriterion("POSTRECEIVERTEL is null");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelIsNotNull() {
            addCriterion("POSTRECEIVERTEL is not null");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelEqualTo(String value) {
            addCriterion("POSTRECEIVERTEL =", value, "postreceivertel");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelNotEqualTo(String value) {
            addCriterion("POSTRECEIVERTEL <>", value, "postreceivertel");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelGreaterThan(String value) {
            addCriterion("POSTRECEIVERTEL >", value, "postreceivertel");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelGreaterThanOrEqualTo(String value) {
            addCriterion("POSTRECEIVERTEL >=", value, "postreceivertel");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelLessThan(String value) {
            addCriterion("POSTRECEIVERTEL <", value, "postreceivertel");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelLessThanOrEqualTo(String value) {
            addCriterion("POSTRECEIVERTEL <=", value, "postreceivertel");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelLike(String value) {
            addCriterion("POSTRECEIVERTEL like", value, "postreceivertel");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelNotLike(String value) {
            addCriterion("POSTRECEIVERTEL not like", value, "postreceivertel");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelIn(List<String> values) {
            addCriterion("POSTRECEIVERTEL in", values, "postreceivertel");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelNotIn(List<String> values) {
            addCriterion("POSTRECEIVERTEL not in", values, "postreceivertel");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelBetween(String value1, String value2) {
            addCriterion("POSTRECEIVERTEL between", value1, value2, "postreceivertel");
            return (Criteria) this;
        }

        public Criteria andPostreceivertelNotBetween(String value1, String value2) {
            addCriterion("POSTRECEIVERTEL not between", value1, value2, "postreceivertel");
            return (Criteria) this;
        }

        public Criteria andPostaddrIsNull() {
            addCriterion("POSTADDR is null");
            return (Criteria) this;
        }

        public Criteria andPostaddrIsNotNull() {
            addCriterion("POSTADDR is not null");
            return (Criteria) this;
        }

        public Criteria andPostaddrEqualTo(String value) {
            addCriterion("POSTADDR =", value, "postaddr");
            return (Criteria) this;
        }

        public Criteria andPostaddrNotEqualTo(String value) {
            addCriterion("POSTADDR <>", value, "postaddr");
            return (Criteria) this;
        }

        public Criteria andPostaddrGreaterThan(String value) {
            addCriterion("POSTADDR >", value, "postaddr");
            return (Criteria) this;
        }

        public Criteria andPostaddrGreaterThanOrEqualTo(String value) {
            addCriterion("POSTADDR >=", value, "postaddr");
            return (Criteria) this;
        }

        public Criteria andPostaddrLessThan(String value) {
            addCriterion("POSTADDR <", value, "postaddr");
            return (Criteria) this;
        }

        public Criteria andPostaddrLessThanOrEqualTo(String value) {
            addCriterion("POSTADDR <=", value, "postaddr");
            return (Criteria) this;
        }

        public Criteria andPostaddrLike(String value) {
            addCriterion("POSTADDR like", value, "postaddr");
            return (Criteria) this;
        }

        public Criteria andPostaddrNotLike(String value) {
            addCriterion("POSTADDR not like", value, "postaddr");
            return (Criteria) this;
        }

        public Criteria andPostaddrIn(List<String> values) {
            addCriterion("POSTADDR in", values, "postaddr");
            return (Criteria) this;
        }

        public Criteria andPostaddrNotIn(List<String> values) {
            addCriterion("POSTADDR not in", values, "postaddr");
            return (Criteria) this;
        }

        public Criteria andPostaddrBetween(String value1, String value2) {
            addCriterion("POSTADDR between", value1, value2, "postaddr");
            return (Criteria) this;
        }

        public Criteria andPostaddrNotBetween(String value1, String value2) {
            addCriterion("POSTADDR not between", value1, value2, "postaddr");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_reinsurer_tc
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
     * @Table : mm_reinsurer_tc
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