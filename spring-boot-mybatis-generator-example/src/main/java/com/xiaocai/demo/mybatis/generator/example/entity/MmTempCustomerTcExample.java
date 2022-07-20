package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmTempCustomerTcExample {
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
    public MmTempCustomerTcExample() {
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
     * @Table : mm_temp_customer_tc
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

        public Criteria andCustomercodeIsNull() {
            addCriterion("CUSTOMERCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNotNull() {
            addCriterion("CUSTOMERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeEqualTo(String value) {
            addCriterion("CUSTOMERCODE =", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotEqualTo(String value) {
            addCriterion("CUSTOMERCODE <>", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThan(String value) {
            addCriterion("CUSTOMERCODE >", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERCODE >=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThan(String value) {
            addCriterion("CUSTOMERCODE <", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERCODE <=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLike(String value) {
            addCriterion("CUSTOMERCODE like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotLike(String value) {
            addCriterion("CUSTOMERCODE not like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIn(List<String> values) {
            addCriterion("CUSTOMERCODE in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotIn(List<String> values) {
            addCriterion("CUSTOMERCODE not in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeBetween(String value1, String value2) {
            addCriterion("CUSTOMERCODE between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERCODE not between", value1, value2, "customercode");
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

        public Criteria andCustomernameenIsNull() {
            addCriterion("CUSTOMERNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIsNotNull() {
            addCriterion("CUSTOMERNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameenEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN =", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN <>", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThan(String value) {
            addCriterion("CUSTOMERNAMEEN >", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN >=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThan(String value) {
            addCriterion("CUSTOMERNAMEEN <", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMEEN <=", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenLike(String value) {
            addCriterion("CUSTOMERNAMEEN like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotLike(String value) {
            addCriterion("CUSTOMERNAMEEN not like", value, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenIn(List<String> values) {
            addCriterion("CUSTOMERNAMEEN in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotIn(List<String> values) {
            addCriterion("CUSTOMERNAMEEN not in", values, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMEEN between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernameenNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMEEN not between", value1, value2, "customernameen");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnIsNull() {
            addCriterion("CUSTOMERNAMECN is null");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnIsNotNull() {
            addCriterion("CUSTOMERNAMECN is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnEqualTo(String value) {
            addCriterion("CUSTOMERNAMECN =", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnNotEqualTo(String value) {
            addCriterion("CUSTOMERNAMECN <>", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnGreaterThan(String value) {
            addCriterion("CUSTOMERNAMECN >", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMECN >=", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnLessThan(String value) {
            addCriterion("CUSTOMERNAMECN <", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAMECN <=", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnLike(String value) {
            addCriterion("CUSTOMERNAMECN like", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnNotLike(String value) {
            addCriterion("CUSTOMERNAMECN not like", value, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnIn(List<String> values) {
            addCriterion("CUSTOMERNAMECN in", values, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnNotIn(List<String> values) {
            addCriterion("CUSTOMERNAMECN not in", values, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMECN between", value1, value2, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andCustomernamecnNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAMECN not between", value1, value2, "customernamecn");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNull() {
            addCriterion("ROLENAME is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("ROLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("ROLENAME =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("ROLENAME <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("ROLENAME >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLENAME >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("ROLENAME <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("ROLENAME <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("ROLENAME like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("ROLENAME not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("ROLENAME in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("ROLENAME not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("ROLENAME between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("ROLENAME not between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andIsjapanIsNull() {
            addCriterion("ISJAPAN is null");
            return (Criteria) this;
        }

        public Criteria andIsjapanIsNotNull() {
            addCriterion("ISJAPAN is not null");
            return (Criteria) this;
        }

        public Criteria andIsjapanEqualTo(String value) {
            addCriterion("ISJAPAN =", value, "isjapan");
            return (Criteria) this;
        }

        public Criteria andIsjapanNotEqualTo(String value) {
            addCriterion("ISJAPAN <>", value, "isjapan");
            return (Criteria) this;
        }

        public Criteria andIsjapanGreaterThan(String value) {
            addCriterion("ISJAPAN >", value, "isjapan");
            return (Criteria) this;
        }

        public Criteria andIsjapanGreaterThanOrEqualTo(String value) {
            addCriterion("ISJAPAN >=", value, "isjapan");
            return (Criteria) this;
        }

        public Criteria andIsjapanLessThan(String value) {
            addCriterion("ISJAPAN <", value, "isjapan");
            return (Criteria) this;
        }

        public Criteria andIsjapanLessThanOrEqualTo(String value) {
            addCriterion("ISJAPAN <=", value, "isjapan");
            return (Criteria) this;
        }

        public Criteria andIsjapanLike(String value) {
            addCriterion("ISJAPAN like", value, "isjapan");
            return (Criteria) this;
        }

        public Criteria andIsjapanNotLike(String value) {
            addCriterion("ISJAPAN not like", value, "isjapan");
            return (Criteria) this;
        }

        public Criteria andIsjapanIn(List<String> values) {
            addCriterion("ISJAPAN in", values, "isjapan");
            return (Criteria) this;
        }

        public Criteria andIsjapanNotIn(List<String> values) {
            addCriterion("ISJAPAN not in", values, "isjapan");
            return (Criteria) this;
        }

        public Criteria andIsjapanBetween(String value1, String value2) {
            addCriterion("ISJAPAN between", value1, value2, "isjapan");
            return (Criteria) this;
        }

        public Criteria andIsjapanNotBetween(String value1, String value2) {
            addCriterion("ISJAPAN not between", value1, value2, "isjapan");
            return (Criteria) this;
        }

        public Criteria andDomesticIsNull() {
            addCriterion("DOMESTIC is null");
            return (Criteria) this;
        }

        public Criteria andDomesticIsNotNull() {
            addCriterion("DOMESTIC is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticEqualTo(String value) {
            addCriterion("DOMESTIC =", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotEqualTo(String value) {
            addCriterion("DOMESTIC <>", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticGreaterThan(String value) {
            addCriterion("DOMESTIC >", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticGreaterThanOrEqualTo(String value) {
            addCriterion("DOMESTIC >=", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLessThan(String value) {
            addCriterion("DOMESTIC <", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLessThanOrEqualTo(String value) {
            addCriterion("DOMESTIC <=", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLike(String value) {
            addCriterion("DOMESTIC like", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotLike(String value) {
            addCriterion("DOMESTIC not like", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticIn(List<String> values) {
            addCriterion("DOMESTIC in", values, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotIn(List<String> values) {
            addCriterion("DOMESTIC not in", values, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticBetween(String value1, String value2) {
            addCriterion("DOMESTIC between", value1, value2, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotBetween(String value1, String value2) {
            addCriterion("DOMESTIC not between", value1, value2, "domestic");
            return (Criteria) this;
        }

        public Criteria andLinkernameIsNull() {
            addCriterion("LINKERNAME is null");
            return (Criteria) this;
        }

        public Criteria andLinkernameIsNotNull() {
            addCriterion("LINKERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLinkernameEqualTo(String value) {
            addCriterion("LINKERNAME =", value, "linkername");
            return (Criteria) this;
        }

        public Criteria andLinkernameNotEqualTo(String value) {
            addCriterion("LINKERNAME <>", value, "linkername");
            return (Criteria) this;
        }

        public Criteria andLinkernameGreaterThan(String value) {
            addCriterion("LINKERNAME >", value, "linkername");
            return (Criteria) this;
        }

        public Criteria andLinkernameGreaterThanOrEqualTo(String value) {
            addCriterion("LINKERNAME >=", value, "linkername");
            return (Criteria) this;
        }

        public Criteria andLinkernameLessThan(String value) {
            addCriterion("LINKERNAME <", value, "linkername");
            return (Criteria) this;
        }

        public Criteria andLinkernameLessThanOrEqualTo(String value) {
            addCriterion("LINKERNAME <=", value, "linkername");
            return (Criteria) this;
        }

        public Criteria andLinkernameLike(String value) {
            addCriterion("LINKERNAME like", value, "linkername");
            return (Criteria) this;
        }

        public Criteria andLinkernameNotLike(String value) {
            addCriterion("LINKERNAME not like", value, "linkername");
            return (Criteria) this;
        }

        public Criteria andLinkernameIn(List<String> values) {
            addCriterion("LINKERNAME in", values, "linkername");
            return (Criteria) this;
        }

        public Criteria andLinkernameNotIn(List<String> values) {
            addCriterion("LINKERNAME not in", values, "linkername");
            return (Criteria) this;
        }

        public Criteria andLinkernameBetween(String value1, String value2) {
            addCriterion("LINKERNAME between", value1, value2, "linkername");
            return (Criteria) this;
        }

        public Criteria andLinkernameNotBetween(String value1, String value2) {
            addCriterion("LINKERNAME not between", value1, value2, "linkername");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressIsNull() {
            addCriterion("LINKERADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressIsNotNull() {
            addCriterion("LINKERADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressEqualTo(String value) {
            addCriterion("LINKERADDRESS =", value, "linkeraddress");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressNotEqualTo(String value) {
            addCriterion("LINKERADDRESS <>", value, "linkeraddress");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressGreaterThan(String value) {
            addCriterion("LINKERADDRESS >", value, "linkeraddress");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("LINKERADDRESS >=", value, "linkeraddress");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressLessThan(String value) {
            addCriterion("LINKERADDRESS <", value, "linkeraddress");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressLessThanOrEqualTo(String value) {
            addCriterion("LINKERADDRESS <=", value, "linkeraddress");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressLike(String value) {
            addCriterion("LINKERADDRESS like", value, "linkeraddress");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressNotLike(String value) {
            addCriterion("LINKERADDRESS not like", value, "linkeraddress");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressIn(List<String> values) {
            addCriterion("LINKERADDRESS in", values, "linkeraddress");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressNotIn(List<String> values) {
            addCriterion("LINKERADDRESS not in", values, "linkeraddress");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressBetween(String value1, String value2) {
            addCriterion("LINKERADDRESS between", value1, value2, "linkeraddress");
            return (Criteria) this;
        }

        public Criteria andLinkeraddressNotBetween(String value1, String value2) {
            addCriterion("LINKERADDRESS not between", value1, value2, "linkeraddress");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneIsNull() {
            addCriterion("LINKERPHONE is null");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneIsNotNull() {
            addCriterion("LINKERPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneEqualTo(String value) {
            addCriterion("LINKERPHONE =", value, "linkerphone");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneNotEqualTo(String value) {
            addCriterion("LINKERPHONE <>", value, "linkerphone");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneGreaterThan(String value) {
            addCriterion("LINKERPHONE >", value, "linkerphone");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("LINKERPHONE >=", value, "linkerphone");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneLessThan(String value) {
            addCriterion("LINKERPHONE <", value, "linkerphone");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneLessThanOrEqualTo(String value) {
            addCriterion("LINKERPHONE <=", value, "linkerphone");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneLike(String value) {
            addCriterion("LINKERPHONE like", value, "linkerphone");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneNotLike(String value) {
            addCriterion("LINKERPHONE not like", value, "linkerphone");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneIn(List<String> values) {
            addCriterion("LINKERPHONE in", values, "linkerphone");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneNotIn(List<String> values) {
            addCriterion("LINKERPHONE not in", values, "linkerphone");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneBetween(String value1, String value2) {
            addCriterion("LINKERPHONE between", value1, value2, "linkerphone");
            return (Criteria) this;
        }

        public Criteria andLinkerphoneNotBetween(String value1, String value2) {
            addCriterion("LINKERPHONE not between", value1, value2, "linkerphone");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeIsNull() {
            addCriterion("REALCUSTOMERCODE is null");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeIsNotNull() {
            addCriterion("REALCUSTOMERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeEqualTo(String value) {
            addCriterion("REALCUSTOMERCODE =", value, "realcustomercode");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeNotEqualTo(String value) {
            addCriterion("REALCUSTOMERCODE <>", value, "realcustomercode");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeGreaterThan(String value) {
            addCriterion("REALCUSTOMERCODE >", value, "realcustomercode");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeGreaterThanOrEqualTo(String value) {
            addCriterion("REALCUSTOMERCODE >=", value, "realcustomercode");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeLessThan(String value) {
            addCriterion("REALCUSTOMERCODE <", value, "realcustomercode");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeLessThanOrEqualTo(String value) {
            addCriterion("REALCUSTOMERCODE <=", value, "realcustomercode");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeLike(String value) {
            addCriterion("REALCUSTOMERCODE like", value, "realcustomercode");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeNotLike(String value) {
            addCriterion("REALCUSTOMERCODE not like", value, "realcustomercode");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeIn(List<String> values) {
            addCriterion("REALCUSTOMERCODE in", values, "realcustomercode");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeNotIn(List<String> values) {
            addCriterion("REALCUSTOMERCODE not in", values, "realcustomercode");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeBetween(String value1, String value2) {
            addCriterion("REALCUSTOMERCODE between", value1, value2, "realcustomercode");
            return (Criteria) this;
        }

        public Criteria andRealcustomercodeNotBetween(String value1, String value2) {
            addCriterion("REALCUSTOMERCODE not between", value1, value2, "realcustomercode");
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

        public Criteria andNameasciiIsNull() {
            addCriterion("NAMEASCII is null");
            return (Criteria) this;
        }

        public Criteria andNameasciiIsNotNull() {
            addCriterion("NAMEASCII is not null");
            return (Criteria) this;
        }

        public Criteria andNameasciiEqualTo(String value) {
            addCriterion("NAMEASCII =", value, "nameascii");
            return (Criteria) this;
        }

        public Criteria andNameasciiNotEqualTo(String value) {
            addCriterion("NAMEASCII <>", value, "nameascii");
            return (Criteria) this;
        }

        public Criteria andNameasciiGreaterThan(String value) {
            addCriterion("NAMEASCII >", value, "nameascii");
            return (Criteria) this;
        }

        public Criteria andNameasciiGreaterThanOrEqualTo(String value) {
            addCriterion("NAMEASCII >=", value, "nameascii");
            return (Criteria) this;
        }

        public Criteria andNameasciiLessThan(String value) {
            addCriterion("NAMEASCII <", value, "nameascii");
            return (Criteria) this;
        }

        public Criteria andNameasciiLessThanOrEqualTo(String value) {
            addCriterion("NAMEASCII <=", value, "nameascii");
            return (Criteria) this;
        }

        public Criteria andNameasciiLike(String value) {
            addCriterion("NAMEASCII like", value, "nameascii");
            return (Criteria) this;
        }

        public Criteria andNameasciiNotLike(String value) {
            addCriterion("NAMEASCII not like", value, "nameascii");
            return (Criteria) this;
        }

        public Criteria andNameasciiIn(List<String> values) {
            addCriterion("NAMEASCII in", values, "nameascii");
            return (Criteria) this;
        }

        public Criteria andNameasciiNotIn(List<String> values) {
            addCriterion("NAMEASCII not in", values, "nameascii");
            return (Criteria) this;
        }

        public Criteria andNameasciiBetween(String value1, String value2) {
            addCriterion("NAMEASCII between", value1, value2, "nameascii");
            return (Criteria) this;
        }

        public Criteria andNameasciiNotBetween(String value1, String value2) {
            addCriterion("NAMEASCII not between", value1, value2, "nameascii");
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
     * @Table : mm_temp_customer_tc
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
     * @Table : mm_temp_customer_tc
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