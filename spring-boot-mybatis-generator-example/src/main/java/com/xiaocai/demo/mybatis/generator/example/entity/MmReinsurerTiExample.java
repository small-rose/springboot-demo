package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmReinsurerTiExample {
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
    public MmReinsurerTiExample() {
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
     * @Table : mm_reinsurer_ti
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

        public Criteria andSeqreinsurerIsNull() {
            addCriterion("SEQREINSURER is null");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerIsNotNull() {
            addCriterion("SEQREINSURER is not null");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerEqualTo(String value) {
            addCriterion("SEQREINSURER =", value, "seqreinsurer");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerNotEqualTo(String value) {
            addCriterion("SEQREINSURER <>", value, "seqreinsurer");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerGreaterThan(String value) {
            addCriterion("SEQREINSURER >", value, "seqreinsurer");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerGreaterThanOrEqualTo(String value) {
            addCriterion("SEQREINSURER >=", value, "seqreinsurer");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerLessThan(String value) {
            addCriterion("SEQREINSURER <", value, "seqreinsurer");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerLessThanOrEqualTo(String value) {
            addCriterion("SEQREINSURER <=", value, "seqreinsurer");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerLike(String value) {
            addCriterion("SEQREINSURER like", value, "seqreinsurer");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerNotLike(String value) {
            addCriterion("SEQREINSURER not like", value, "seqreinsurer");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerIn(List<String> values) {
            addCriterion("SEQREINSURER in", values, "seqreinsurer");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerNotIn(List<String> values) {
            addCriterion("SEQREINSURER not in", values, "seqreinsurer");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerBetween(String value1, String value2) {
            addCriterion("SEQREINSURER between", value1, value2, "seqreinsurer");
            return (Criteria) this;
        }

        public Criteria andSeqreinsurerNotBetween(String value1, String value2) {
            addCriterion("SEQREINSURER not between", value1, value2, "seqreinsurer");
            return (Criteria) this;
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

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_reinsurer_ti
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
     * @Table : mm_reinsurer_ti
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