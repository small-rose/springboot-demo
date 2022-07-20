package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmAgentcodeTcExample {
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
    public MmAgentcodeTcExample() {
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
     * @Table : mm_agentcode_tc
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

        public Criteria andAgentcodeIsNull() {
            addCriterion("AGENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNotNull() {
            addCriterion("AGENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeEqualTo(String value) {
            addCriterion("AGENTCODE =", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotEqualTo(String value) {
            addCriterion("AGENTCODE <>", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThan(String value) {
            addCriterion("AGENTCODE >", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTCODE >=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThan(String value) {
            addCriterion("AGENTCODE <", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThanOrEqualTo(String value) {
            addCriterion("AGENTCODE <=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLike(String value) {
            addCriterion("AGENTCODE like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotLike(String value) {
            addCriterion("AGENTCODE not like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIn(List<String> values) {
            addCriterion("AGENTCODE in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotIn(List<String> values) {
            addCriterion("AGENTCODE not in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeBetween(String value1, String value2) {
            addCriterion("AGENTCODE between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotBetween(String value1, String value2) {
            addCriterion("AGENTCODE not between", value1, value2, "agentcode");
            return (Criteria) this;
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

        public Criteria andAgentnameIsNull() {
            addCriterion("AGENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andAgentnameIsNotNull() {
            addCriterion("AGENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnameEqualTo(String value) {
            addCriterion("AGENTNAME =", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotEqualTo(String value) {
            addCriterion("AGENTNAME <>", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThan(String value) {
            addCriterion("AGENTNAME >", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTNAME >=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThan(String value) {
            addCriterion("AGENTNAME <", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThanOrEqualTo(String value) {
            addCriterion("AGENTNAME <=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLike(String value) {
            addCriterion("AGENTNAME like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotLike(String value) {
            addCriterion("AGENTNAME not like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameIn(List<String> values) {
            addCriterion("AGENTNAME in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotIn(List<String> values) {
            addCriterion("AGENTNAME not in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameBetween(String value1, String value2) {
            addCriterion("AGENTNAME between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotBetween(String value1, String value2) {
            addCriterion("AGENTNAME not between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeIsNull() {
            addCriterion("REALLAGENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeIsNotNull() {
            addCriterion("REALLAGENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeEqualTo(String value) {
            addCriterion("REALLAGENTCODE =", value, "reallagentcode");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeNotEqualTo(String value) {
            addCriterion("REALLAGENTCODE <>", value, "reallagentcode");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeGreaterThan(String value) {
            addCriterion("REALLAGENTCODE >", value, "reallagentcode");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("REALLAGENTCODE >=", value, "reallagentcode");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeLessThan(String value) {
            addCriterion("REALLAGENTCODE <", value, "reallagentcode");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeLessThanOrEqualTo(String value) {
            addCriterion("REALLAGENTCODE <=", value, "reallagentcode");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeLike(String value) {
            addCriterion("REALLAGENTCODE like", value, "reallagentcode");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeNotLike(String value) {
            addCriterion("REALLAGENTCODE not like", value, "reallagentcode");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeIn(List<String> values) {
            addCriterion("REALLAGENTCODE in", values, "reallagentcode");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeNotIn(List<String> values) {
            addCriterion("REALLAGENTCODE not in", values, "reallagentcode");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeBetween(String value1, String value2) {
            addCriterion("REALLAGENTCODE between", value1, value2, "reallagentcode");
            return (Criteria) this;
        }

        public Criteria andReallagentcodeNotBetween(String value1, String value2) {
            addCriterion("REALLAGENTCODE not between", value1, value2, "reallagentcode");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressIsNull() {
            addCriterion("AGENCYADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressIsNotNull() {
            addCriterion("AGENCYADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressEqualTo(String value) {
            addCriterion("AGENCYADDRESS =", value, "agencyaddress");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressNotEqualTo(String value) {
            addCriterion("AGENCYADDRESS <>", value, "agencyaddress");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressGreaterThan(String value) {
            addCriterion("AGENCYADDRESS >", value, "agencyaddress");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("AGENCYADDRESS >=", value, "agencyaddress");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressLessThan(String value) {
            addCriterion("AGENCYADDRESS <", value, "agencyaddress");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressLessThanOrEqualTo(String value) {
            addCriterion("AGENCYADDRESS <=", value, "agencyaddress");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressLike(String value) {
            addCriterion("AGENCYADDRESS like", value, "agencyaddress");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressNotLike(String value) {
            addCriterion("AGENCYADDRESS not like", value, "agencyaddress");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressIn(List<String> values) {
            addCriterion("AGENCYADDRESS in", values, "agencyaddress");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressNotIn(List<String> values) {
            addCriterion("AGENCYADDRESS not in", values, "agencyaddress");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressBetween(String value1, String value2) {
            addCriterion("AGENCYADDRESS between", value1, value2, "agencyaddress");
            return (Criteria) this;
        }

        public Criteria andAgencyaddressNotBetween(String value1, String value2) {
            addCriterion("AGENCYADDRESS not between", value1, value2, "agencyaddress");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeIsNull() {
            addCriterion("AGENCYPOSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeIsNotNull() {
            addCriterion("AGENCYPOSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeEqualTo(String value) {
            addCriterion("AGENCYPOSTCODE =", value, "agencypostcode");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeNotEqualTo(String value) {
            addCriterion("AGENCYPOSTCODE <>", value, "agencypostcode");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeGreaterThan(String value) {
            addCriterion("AGENCYPOSTCODE >", value, "agencypostcode");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENCYPOSTCODE >=", value, "agencypostcode");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeLessThan(String value) {
            addCriterion("AGENCYPOSTCODE <", value, "agencypostcode");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeLessThanOrEqualTo(String value) {
            addCriterion("AGENCYPOSTCODE <=", value, "agencypostcode");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeLike(String value) {
            addCriterion("AGENCYPOSTCODE like", value, "agencypostcode");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeNotLike(String value) {
            addCriterion("AGENCYPOSTCODE not like", value, "agencypostcode");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeIn(List<String> values) {
            addCriterion("AGENCYPOSTCODE in", values, "agencypostcode");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeNotIn(List<String> values) {
            addCriterion("AGENCYPOSTCODE not in", values, "agencypostcode");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeBetween(String value1, String value2) {
            addCriterion("AGENCYPOSTCODE between", value1, value2, "agencypostcode");
            return (Criteria) this;
        }

        public Criteria andAgencypostcodeNotBetween(String value1, String value2) {
            addCriterion("AGENCYPOSTCODE not between", value1, value2, "agencypostcode");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneIsNull() {
            addCriterion("AGENCYPHONE is null");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneIsNotNull() {
            addCriterion("AGENCYPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneEqualTo(String value) {
            addCriterion("AGENCYPHONE =", value, "agencyphone");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneNotEqualTo(String value) {
            addCriterion("AGENCYPHONE <>", value, "agencyphone");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneGreaterThan(String value) {
            addCriterion("AGENCYPHONE >", value, "agencyphone");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("AGENCYPHONE >=", value, "agencyphone");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneLessThan(String value) {
            addCriterion("AGENCYPHONE <", value, "agencyphone");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneLessThanOrEqualTo(String value) {
            addCriterion("AGENCYPHONE <=", value, "agencyphone");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneLike(String value) {
            addCriterion("AGENCYPHONE like", value, "agencyphone");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneNotLike(String value) {
            addCriterion("AGENCYPHONE not like", value, "agencyphone");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneIn(List<String> values) {
            addCriterion("AGENCYPHONE in", values, "agencyphone");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneNotIn(List<String> values) {
            addCriterion("AGENCYPHONE not in", values, "agencyphone");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneBetween(String value1, String value2) {
            addCriterion("AGENCYPHONE between", value1, value2, "agencyphone");
            return (Criteria) this;
        }

        public Criteria andAgencyphoneNotBetween(String value1, String value2) {
            addCriterion("AGENCYPHONE not between", value1, value2, "agencyphone");
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

        public Criteria andModifydescIsNull() {
            addCriterion("MODIFYDESC is null");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNotNull() {
            addCriterion("MODIFYDESC is not null");
            return (Criteria) this;
        }

        public Criteria andModifydescEqualTo(String value) {
            addCriterion("MODIFYDESC =", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotEqualTo(String value) {
            addCriterion("MODIFYDESC <>", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThan(String value) {
            addCriterion("MODIFYDESC >", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFYDESC >=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThan(String value) {
            addCriterion("MODIFYDESC <", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThanOrEqualTo(String value) {
            addCriterion("MODIFYDESC <=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLike(String value) {
            addCriterion("MODIFYDESC like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotLike(String value) {
            addCriterion("MODIFYDESC not like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescIn(List<String> values) {
            addCriterion("MODIFYDESC in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotIn(List<String> values) {
            addCriterion("MODIFYDESC not in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescBetween(String value1, String value2) {
            addCriterion("MODIFYDESC between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotBetween(String value1, String value2) {
            addCriterion("MODIFYDESC not between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIsNull() {
            addCriterion("AGENTNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIsNotNull() {
            addCriterion("AGENTNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnameenEqualTo(String value) {
            addCriterion("AGENTNAMEEN =", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotEqualTo(String value) {
            addCriterion("AGENTNAMEEN <>", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenGreaterThan(String value) {
            addCriterion("AGENTNAMEEN >", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTNAMEEN >=", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLessThan(String value) {
            addCriterion("AGENTNAMEEN <", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLessThanOrEqualTo(String value) {
            addCriterion("AGENTNAMEEN <=", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenLike(String value) {
            addCriterion("AGENTNAMEEN like", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotLike(String value) {
            addCriterion("AGENTNAMEEN not like", value, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenIn(List<String> values) {
            addCriterion("AGENTNAMEEN in", values, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotIn(List<String> values) {
            addCriterion("AGENTNAMEEN not in", values, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenBetween(String value1, String value2) {
            addCriterion("AGENTNAMEEN between", value1, value2, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andAgentnameenNotBetween(String value1, String value2) {
            addCriterion("AGENTNAMEEN not between", value1, value2, "agentnameen");
            return (Criteria) this;
        }

        public Criteria andPartycodeIsNull() {
            addCriterion("PARTYCODE is null");
            return (Criteria) this;
        }

        public Criteria andPartycodeIsNotNull() {
            addCriterion("PARTYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPartycodeEqualTo(String value) {
            addCriterion("PARTYCODE =", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeNotEqualTo(String value) {
            addCriterion("PARTYCODE <>", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeGreaterThan(String value) {
            addCriterion("PARTYCODE >", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARTYCODE >=", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeLessThan(String value) {
            addCriterion("PARTYCODE <", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeLessThanOrEqualTo(String value) {
            addCriterion("PARTYCODE <=", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeLike(String value) {
            addCriterion("PARTYCODE like", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeNotLike(String value) {
            addCriterion("PARTYCODE not like", value, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeIn(List<String> values) {
            addCriterion("PARTYCODE in", values, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeNotIn(List<String> values) {
            addCriterion("PARTYCODE not in", values, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeBetween(String value1, String value2) {
            addCriterion("PARTYCODE between", value1, value2, "partycode");
            return (Criteria) this;
        }

        public Criteria andPartycodeNotBetween(String value1, String value2) {
            addCriterion("PARTYCODE not between", value1, value2, "partycode");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdIsNull() {
            addCriterion("INTERFACE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdIsNotNull() {
            addCriterion("INTERFACE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdEqualTo(String value) {
            addCriterion("INTERFACE_ID =", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdNotEqualTo(String value) {
            addCriterion("INTERFACE_ID <>", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdGreaterThan(String value) {
            addCriterion("INTERFACE_ID >", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("INTERFACE_ID >=", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdLessThan(String value) {
            addCriterion("INTERFACE_ID <", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdLessThanOrEqualTo(String value) {
            addCriterion("INTERFACE_ID <=", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdLike(String value) {
            addCriterion("INTERFACE_ID like", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdNotLike(String value) {
            addCriterion("INTERFACE_ID not like", value, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdIn(List<String> values) {
            addCriterion("INTERFACE_ID in", values, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdNotIn(List<String> values) {
            addCriterion("INTERFACE_ID not in", values, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdBetween(String value1, String value2) {
            addCriterion("INTERFACE_ID between", value1, value2, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andInterfaceIdNotBetween(String value1, String value2) {
            addCriterion("INTERFACE_ID not between", value1, value2, "interfaceId");
            return (Criteria) this;
        }

        public Criteria andHelpcodeIsNull() {
            addCriterion("HELPCODE is null");
            return (Criteria) this;
        }

        public Criteria andHelpcodeIsNotNull() {
            addCriterion("HELPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andHelpcodeEqualTo(String value) {
            addCriterion("HELPCODE =", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeNotEqualTo(String value) {
            addCriterion("HELPCODE <>", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeGreaterThan(String value) {
            addCriterion("HELPCODE >", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("HELPCODE >=", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeLessThan(String value) {
            addCriterion("HELPCODE <", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeLessThanOrEqualTo(String value) {
            addCriterion("HELPCODE <=", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeLike(String value) {
            addCriterion("HELPCODE like", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeNotLike(String value) {
            addCriterion("HELPCODE not like", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeIn(List<String> values) {
            addCriterion("HELPCODE in", values, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeNotIn(List<String> values) {
            addCriterion("HELPCODE not in", values, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeBetween(String value1, String value2) {
            addCriterion("HELPCODE between", value1, value2, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeNotBetween(String value1, String value2) {
            addCriterion("HELPCODE not between", value1, value2, "helpcode");
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

        public Criteria andAgentlevelIsNull() {
            addCriterion("AGENTLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAgentlevelIsNotNull() {
            addCriterion("AGENTLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAgentlevelEqualTo(String value) {
            addCriterion("AGENTLEVEL =", value, "agentlevel");
            return (Criteria) this;
        }

        public Criteria andAgentlevelNotEqualTo(String value) {
            addCriterion("AGENTLEVEL <>", value, "agentlevel");
            return (Criteria) this;
        }

        public Criteria andAgentlevelGreaterThan(String value) {
            addCriterion("AGENTLEVEL >", value, "agentlevel");
            return (Criteria) this;
        }

        public Criteria andAgentlevelGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTLEVEL >=", value, "agentlevel");
            return (Criteria) this;
        }

        public Criteria andAgentlevelLessThan(String value) {
            addCriterion("AGENTLEVEL <", value, "agentlevel");
            return (Criteria) this;
        }

        public Criteria andAgentlevelLessThanOrEqualTo(String value) {
            addCriterion("AGENTLEVEL <=", value, "agentlevel");
            return (Criteria) this;
        }

        public Criteria andAgentlevelLike(String value) {
            addCriterion("AGENTLEVEL like", value, "agentlevel");
            return (Criteria) this;
        }

        public Criteria andAgentlevelNotLike(String value) {
            addCriterion("AGENTLEVEL not like", value, "agentlevel");
            return (Criteria) this;
        }

        public Criteria andAgentlevelIn(List<String> values) {
            addCriterion("AGENTLEVEL in", values, "agentlevel");
            return (Criteria) this;
        }

        public Criteria andAgentlevelNotIn(List<String> values) {
            addCriterion("AGENTLEVEL not in", values, "agentlevel");
            return (Criteria) this;
        }

        public Criteria andAgentlevelBetween(String value1, String value2) {
            addCriterion("AGENTLEVEL between", value1, value2, "agentlevel");
            return (Criteria) this;
        }

        public Criteria andAgentlevelNotBetween(String value1, String value2) {
            addCriterion("AGENTLEVEL not between", value1, value2, "agentlevel");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andAscriptionIsNull() {
            addCriterion("ASCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andAscriptionIsNotNull() {
            addCriterion("ASCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andAscriptionEqualTo(String value) {
            addCriterion("ASCRIPTION =", value, "ascription");
            return (Criteria) this;
        }

        public Criteria andAscriptionNotEqualTo(String value) {
            addCriterion("ASCRIPTION <>", value, "ascription");
            return (Criteria) this;
        }

        public Criteria andAscriptionGreaterThan(String value) {
            addCriterion("ASCRIPTION >", value, "ascription");
            return (Criteria) this;
        }

        public Criteria andAscriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ASCRIPTION >=", value, "ascription");
            return (Criteria) this;
        }

        public Criteria andAscriptionLessThan(String value) {
            addCriterion("ASCRIPTION <", value, "ascription");
            return (Criteria) this;
        }

        public Criteria andAscriptionLessThanOrEqualTo(String value) {
            addCriterion("ASCRIPTION <=", value, "ascription");
            return (Criteria) this;
        }

        public Criteria andAscriptionLike(String value) {
            addCriterion("ASCRIPTION like", value, "ascription");
            return (Criteria) this;
        }

        public Criteria andAscriptionNotLike(String value) {
            addCriterion("ASCRIPTION not like", value, "ascription");
            return (Criteria) this;
        }

        public Criteria andAscriptionIn(List<String> values) {
            addCriterion("ASCRIPTION in", values, "ascription");
            return (Criteria) this;
        }

        public Criteria andAscriptionNotIn(List<String> values) {
            addCriterion("ASCRIPTION not in", values, "ascription");
            return (Criteria) this;
        }

        public Criteria andAscriptionBetween(String value1, String value2) {
            addCriterion("ASCRIPTION between", value1, value2, "ascription");
            return (Criteria) this;
        }

        public Criteria andAscriptionNotBetween(String value1, String value2) {
            addCriterion("ASCRIPTION not between", value1, value2, "ascription");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
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
     * @Table : mm_agentcode_tc
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
     * @Table : mm_agentcode_tc
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