package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmOrganizationTiExample {
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
    public MmOrganizationTiExample() {
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
     * @Table : mm_organization_ti
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

        public Criteria andOrgancodeIsNull() {
            addCriterion("ORGANCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgancodeIsNotNull() {
            addCriterion("ORGANCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgancodeEqualTo(String value) {
            addCriterion("ORGANCODE =", value, "organcode");
            return (Criteria) this;
        }

        public Criteria andOrgancodeNotEqualTo(String value) {
            addCriterion("ORGANCODE <>", value, "organcode");
            return (Criteria) this;
        }

        public Criteria andOrgancodeGreaterThan(String value) {
            addCriterion("ORGANCODE >", value, "organcode");
            return (Criteria) this;
        }

        public Criteria andOrgancodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANCODE >=", value, "organcode");
            return (Criteria) this;
        }

        public Criteria andOrgancodeLessThan(String value) {
            addCriterion("ORGANCODE <", value, "organcode");
            return (Criteria) this;
        }

        public Criteria andOrgancodeLessThanOrEqualTo(String value) {
            addCriterion("ORGANCODE <=", value, "organcode");
            return (Criteria) this;
        }

        public Criteria andOrgancodeLike(String value) {
            addCriterion("ORGANCODE like", value, "organcode");
            return (Criteria) this;
        }

        public Criteria andOrgancodeNotLike(String value) {
            addCriterion("ORGANCODE not like", value, "organcode");
            return (Criteria) this;
        }

        public Criteria andOrgancodeIn(List<String> values) {
            addCriterion("ORGANCODE in", values, "organcode");
            return (Criteria) this;
        }

        public Criteria andOrgancodeNotIn(List<String> values) {
            addCriterion("ORGANCODE not in", values, "organcode");
            return (Criteria) this;
        }

        public Criteria andOrgancodeBetween(String value1, String value2) {
            addCriterion("ORGANCODE between", value1, value2, "organcode");
            return (Criteria) this;
        }

        public Criteria andOrgancodeNotBetween(String value1, String value2) {
            addCriterion("ORGANCODE not between", value1, value2, "organcode");
            return (Criteria) this;
        }

        public Criteria andOrgannameIsNull() {
            addCriterion("ORGANNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgannameIsNotNull() {
            addCriterion("ORGANNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgannameEqualTo(String value) {
            addCriterion("ORGANNAME =", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotEqualTo(String value) {
            addCriterion("ORGANNAME <>", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameGreaterThan(String value) {
            addCriterion("ORGANNAME >", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANNAME >=", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameLessThan(String value) {
            addCriterion("ORGANNAME <", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameLessThanOrEqualTo(String value) {
            addCriterion("ORGANNAME <=", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameLike(String value) {
            addCriterion("ORGANNAME like", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotLike(String value) {
            addCriterion("ORGANNAME not like", value, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameIn(List<String> values) {
            addCriterion("ORGANNAME in", values, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotIn(List<String> values) {
            addCriterion("ORGANNAME not in", values, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameBetween(String value1, String value2) {
            addCriterion("ORGANNAME between", value1, value2, "organname");
            return (Criteria) this;
        }

        public Criteria andOrgannameNotBetween(String value1, String value2) {
            addCriterion("ORGANNAME not between", value1, value2, "organname");
            return (Criteria) this;
        }

        public Criteria andOrganlevelIsNull() {
            addCriterion("ORGANLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andOrganlevelIsNotNull() {
            addCriterion("ORGANLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andOrganlevelEqualTo(Long value) {
            addCriterion("ORGANLEVEL =", value, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelNotEqualTo(Long value) {
            addCriterion("ORGANLEVEL <>", value, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelGreaterThan(Long value) {
            addCriterion("ORGANLEVEL >", value, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelGreaterThanOrEqualTo(Long value) {
            addCriterion("ORGANLEVEL >=", value, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelLessThan(Long value) {
            addCriterion("ORGANLEVEL <", value, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelLessThanOrEqualTo(Long value) {
            addCriterion("ORGANLEVEL <=", value, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelIn(List<Long> values) {
            addCriterion("ORGANLEVEL in", values, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelNotIn(List<Long> values) {
            addCriterion("ORGANLEVEL not in", values, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelBetween(Long value1, Long value2) {
            addCriterion("ORGANLEVEL between", value1, value2, "organlevel");
            return (Criteria) this;
        }

        public Criteria andOrganlevelNotBetween(Long value1, Long value2) {
            addCriterion("ORGANLEVEL not between", value1, value2, "organlevel");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeIsNull() {
            addCriterion("FATHERORGANCODE is null");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeIsNotNull() {
            addCriterion("FATHERORGANCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeEqualTo(String value) {
            addCriterion("FATHERORGANCODE =", value, "fatherorgancode");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeNotEqualTo(String value) {
            addCriterion("FATHERORGANCODE <>", value, "fatherorgancode");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeGreaterThan(String value) {
            addCriterion("FATHERORGANCODE >", value, "fatherorgancode");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeGreaterThanOrEqualTo(String value) {
            addCriterion("FATHERORGANCODE >=", value, "fatherorgancode");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeLessThan(String value) {
            addCriterion("FATHERORGANCODE <", value, "fatherorgancode");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeLessThanOrEqualTo(String value) {
            addCriterion("FATHERORGANCODE <=", value, "fatherorgancode");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeLike(String value) {
            addCriterion("FATHERORGANCODE like", value, "fatherorgancode");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeNotLike(String value) {
            addCriterion("FATHERORGANCODE not like", value, "fatherorgancode");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeIn(List<String> values) {
            addCriterion("FATHERORGANCODE in", values, "fatherorgancode");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeNotIn(List<String> values) {
            addCriterion("FATHERORGANCODE not in", values, "fatherorgancode");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeBetween(String value1, String value2) {
            addCriterion("FATHERORGANCODE between", value1, value2, "fatherorgancode");
            return (Criteria) this;
        }

        public Criteria andFatherorgancodeNotBetween(String value1, String value2) {
            addCriterion("FATHERORGANCODE not between", value1, value2, "fatherorgancode");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeIsNull() {
            addCriterion("ORGANSHORTCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeIsNotNull() {
            addCriterion("ORGANSHORTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeEqualTo(String value) {
            addCriterion("ORGANSHORTCODE =", value, "organshortcode");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeNotEqualTo(String value) {
            addCriterion("ORGANSHORTCODE <>", value, "organshortcode");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeGreaterThan(String value) {
            addCriterion("ORGANSHORTCODE >", value, "organshortcode");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANSHORTCODE >=", value, "organshortcode");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeLessThan(String value) {
            addCriterion("ORGANSHORTCODE <", value, "organshortcode");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGANSHORTCODE <=", value, "organshortcode");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeLike(String value) {
            addCriterion("ORGANSHORTCODE like", value, "organshortcode");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeNotLike(String value) {
            addCriterion("ORGANSHORTCODE not like", value, "organshortcode");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeIn(List<String> values) {
            addCriterion("ORGANSHORTCODE in", values, "organshortcode");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeNotIn(List<String> values) {
            addCriterion("ORGANSHORTCODE not in", values, "organshortcode");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeBetween(String value1, String value2) {
            addCriterion("ORGANSHORTCODE between", value1, value2, "organshortcode");
            return (Criteria) this;
        }

        public Criteria andOrganshortcodeNotBetween(String value1, String value2) {
            addCriterion("ORGANSHORTCODE not between", value1, value2, "organshortcode");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameIsNull() {
            addCriterion("ORGANSHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameIsNotNull() {
            addCriterion("ORGANSHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameEqualTo(String value) {
            addCriterion("ORGANSHORTNAME =", value, "organshortname");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameNotEqualTo(String value) {
            addCriterion("ORGANSHORTNAME <>", value, "organshortname");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameGreaterThan(String value) {
            addCriterion("ORGANSHORTNAME >", value, "organshortname");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANSHORTNAME >=", value, "organshortname");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameLessThan(String value) {
            addCriterion("ORGANSHORTNAME <", value, "organshortname");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameLessThanOrEqualTo(String value) {
            addCriterion("ORGANSHORTNAME <=", value, "organshortname");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameLike(String value) {
            addCriterion("ORGANSHORTNAME like", value, "organshortname");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameNotLike(String value) {
            addCriterion("ORGANSHORTNAME not like", value, "organshortname");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameIn(List<String> values) {
            addCriterion("ORGANSHORTNAME in", values, "organshortname");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameNotIn(List<String> values) {
            addCriterion("ORGANSHORTNAME not in", values, "organshortname");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameBetween(String value1, String value2) {
            addCriterion("ORGANSHORTNAME between", value1, value2, "organshortname");
            return (Criteria) this;
        }

        public Criteria andOrganshortnameNotBetween(String value1, String value2) {
            addCriterion("ORGANSHORTNAME not between", value1, value2, "organshortname");
            return (Criteria) this;
        }

        public Criteria andSuperidIsNull() {
            addCriterion("SUPERID is null");
            return (Criteria) this;
        }

        public Criteria andSuperidIsNotNull() {
            addCriterion("SUPERID is not null");
            return (Criteria) this;
        }

        public Criteria andSuperidEqualTo(String value) {
            addCriterion("SUPERID =", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidNotEqualTo(String value) {
            addCriterion("SUPERID <>", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidGreaterThan(String value) {
            addCriterion("SUPERID >", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERID >=", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidLessThan(String value) {
            addCriterion("SUPERID <", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidLessThanOrEqualTo(String value) {
            addCriterion("SUPERID <=", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidLike(String value) {
            addCriterion("SUPERID like", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidNotLike(String value) {
            addCriterion("SUPERID not like", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidIn(List<String> values) {
            addCriterion("SUPERID in", values, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidNotIn(List<String> values) {
            addCriterion("SUPERID not in", values, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidBetween(String value1, String value2) {
            addCriterion("SUPERID between", value1, value2, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidNotBetween(String value1, String value2) {
            addCriterion("SUPERID not between", value1, value2, "superid");
            return (Criteria) this;
        }

        public Criteria andRealcodeIsNull() {
            addCriterion("REALCODE is null");
            return (Criteria) this;
        }

        public Criteria andRealcodeIsNotNull() {
            addCriterion("REALCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRealcodeEqualTo(String value) {
            addCriterion("REALCODE =", value, "realcode");
            return (Criteria) this;
        }

        public Criteria andRealcodeNotEqualTo(String value) {
            addCriterion("REALCODE <>", value, "realcode");
            return (Criteria) this;
        }

        public Criteria andRealcodeGreaterThan(String value) {
            addCriterion("REALCODE >", value, "realcode");
            return (Criteria) this;
        }

        public Criteria andRealcodeGreaterThanOrEqualTo(String value) {
            addCriterion("REALCODE >=", value, "realcode");
            return (Criteria) this;
        }

        public Criteria andRealcodeLessThan(String value) {
            addCriterion("REALCODE <", value, "realcode");
            return (Criteria) this;
        }

        public Criteria andRealcodeLessThanOrEqualTo(String value) {
            addCriterion("REALCODE <=", value, "realcode");
            return (Criteria) this;
        }

        public Criteria andRealcodeLike(String value) {
            addCriterion("REALCODE like", value, "realcode");
            return (Criteria) this;
        }

        public Criteria andRealcodeNotLike(String value) {
            addCriterion("REALCODE not like", value, "realcode");
            return (Criteria) this;
        }

        public Criteria andRealcodeIn(List<String> values) {
            addCriterion("REALCODE in", values, "realcode");
            return (Criteria) this;
        }

        public Criteria andRealcodeNotIn(List<String> values) {
            addCriterion("REALCODE not in", values, "realcode");
            return (Criteria) this;
        }

        public Criteria andRealcodeBetween(String value1, String value2) {
            addCriterion("REALCODE between", value1, value2, "realcode");
            return (Criteria) this;
        }

        public Criteria andRealcodeNotBetween(String value1, String value2) {
            addCriterion("REALCODE not between", value1, value2, "realcode");
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

        public Criteria andDepartmentcodeIsNull() {
            addCriterion("DEPARTMENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNotNull() {
            addCriterion("DEPARTMENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeEqualTo(String value) {
            addCriterion("DEPARTMENTCODE =", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotEqualTo(String value) {
            addCriterion("DEPARTMENTCODE <>", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThan(String value) {
            addCriterion("DEPARTMENTCODE >", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTCODE >=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThan(String value) {
            addCriterion("DEPARTMENTCODE <", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTCODE <=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLike(String value) {
            addCriterion("DEPARTMENTCODE like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotLike(String value) {
            addCriterion("DEPARTMENTCODE not like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIn(List<String> values) {
            addCriterion("DEPARTMENTCODE in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotIn(List<String> values) {
            addCriterion("DEPARTMENTCODE not in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeBetween(String value1, String value2) {
            addCriterion("DEPARTMENTCODE between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTCODE not between", value1, value2, "departmentcode");
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

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andServicephoneIsNull() {
            addCriterion("SERVICEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andServicephoneIsNotNull() {
            addCriterion("SERVICEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andServicephoneEqualTo(String value) {
            addCriterion("SERVICEPHONE =", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneNotEqualTo(String value) {
            addCriterion("SERVICEPHONE <>", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneGreaterThan(String value) {
            addCriterion("SERVICEPHONE >", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICEPHONE >=", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneLessThan(String value) {
            addCriterion("SERVICEPHONE <", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneLessThanOrEqualTo(String value) {
            addCriterion("SERVICEPHONE <=", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneLike(String value) {
            addCriterion("SERVICEPHONE like", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneNotLike(String value) {
            addCriterion("SERVICEPHONE not like", value, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneIn(List<String> values) {
            addCriterion("SERVICEPHONE in", values, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneNotIn(List<String> values) {
            addCriterion("SERVICEPHONE not in", values, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneBetween(String value1, String value2) {
            addCriterion("SERVICEPHONE between", value1, value2, "servicephone");
            return (Criteria) this;
        }

        public Criteria andServicephoneNotBetween(String value1, String value2) {
            addCriterion("SERVICEPHONE not between", value1, value2, "servicephone");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridIsNull() {
            addCriterion("TAXPAYERID is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridIsNotNull() {
            addCriterion("TAXPAYERID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridEqualTo(String value) {
            addCriterion("TAXPAYERID =", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotEqualTo(String value) {
            addCriterion("TAXPAYERID <>", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridGreaterThan(String value) {
            addCriterion("TAXPAYERID >", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERID >=", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridLessThan(String value) {
            addCriterion("TAXPAYERID <", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERID <=", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridLike(String value) {
            addCriterion("TAXPAYERID like", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotLike(String value) {
            addCriterion("TAXPAYERID not like", value, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridIn(List<String> values) {
            addCriterion("TAXPAYERID in", values, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotIn(List<String> values) {
            addCriterion("TAXPAYERID not in", values, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridBetween(String value1, String value2) {
            addCriterion("TAXPAYERID between", value1, value2, "taxpayerid");
            return (Criteria) this;
        }

        public Criteria andTaxpayeridNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERID not between", value1, value2, "taxpayerid");
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

        public Criteria andSegment1IsNull() {
            addCriterion("SEGMENT1 is null");
            return (Criteria) this;
        }

        public Criteria andSegment1IsNotNull() {
            addCriterion("SEGMENT1 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment1EqualTo(String value) {
            addCriterion("SEGMENT1 =", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotEqualTo(String value) {
            addCriterion("SEGMENT1 <>", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThan(String value) {
            addCriterion("SEGMENT1 >", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 >=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThan(String value) {
            addCriterion("SEGMENT1 <", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT1 <=", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Like(String value) {
            addCriterion("SEGMENT1 like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotLike(String value) {
            addCriterion("SEGMENT1 not like", value, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1In(List<String> values) {
            addCriterion("SEGMENT1 in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotIn(List<String> values) {
            addCriterion("SEGMENT1 not in", values, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1Between(String value1, String value2) {
            addCriterion("SEGMENT1 between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment1NotBetween(String value1, String value2) {
            addCriterion("SEGMENT1 not between", value1, value2, "segment1");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNull() {
            addCriterion("SEGMENT2 is null");
            return (Criteria) this;
        }

        public Criteria andSegment2IsNotNull() {
            addCriterion("SEGMENT2 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment2EqualTo(String value) {
            addCriterion("SEGMENT2 =", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotEqualTo(String value) {
            addCriterion("SEGMENT2 <>", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThan(String value) {
            addCriterion("SEGMENT2 >", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT2 >=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThan(String value) {
            addCriterion("SEGMENT2 <", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT2 <=", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Like(String value) {
            addCriterion("SEGMENT2 like", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotLike(String value) {
            addCriterion("SEGMENT2 not like", value, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2In(List<String> values) {
            addCriterion("SEGMENT2 in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotIn(List<String> values) {
            addCriterion("SEGMENT2 not in", values, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2Between(String value1, String value2) {
            addCriterion("SEGMENT2 between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment2NotBetween(String value1, String value2) {
            addCriterion("SEGMENT2 not between", value1, value2, "segment2");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNull() {
            addCriterion("SEGMENT3 is null");
            return (Criteria) this;
        }

        public Criteria andSegment3IsNotNull() {
            addCriterion("SEGMENT3 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment3EqualTo(String value) {
            addCriterion("SEGMENT3 =", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotEqualTo(String value) {
            addCriterion("SEGMENT3 <>", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThan(String value) {
            addCriterion("SEGMENT3 >", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT3 >=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThan(String value) {
            addCriterion("SEGMENT3 <", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT3 <=", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Like(String value) {
            addCriterion("SEGMENT3 like", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotLike(String value) {
            addCriterion("SEGMENT3 not like", value, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3In(List<String> values) {
            addCriterion("SEGMENT3 in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotIn(List<String> values) {
            addCriterion("SEGMENT3 not in", values, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3Between(String value1, String value2) {
            addCriterion("SEGMENT3 between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment3NotBetween(String value1, String value2) {
            addCriterion("SEGMENT3 not between", value1, value2, "segment3");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNull() {
            addCriterion("SEGMENT4 is null");
            return (Criteria) this;
        }

        public Criteria andSegment4IsNotNull() {
            addCriterion("SEGMENT4 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment4EqualTo(String value) {
            addCriterion("SEGMENT4 =", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotEqualTo(String value) {
            addCriterion("SEGMENT4 <>", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThan(String value) {
            addCriterion("SEGMENT4 >", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT4 >=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThan(String value) {
            addCriterion("SEGMENT4 <", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT4 <=", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Like(String value) {
            addCriterion("SEGMENT4 like", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotLike(String value) {
            addCriterion("SEGMENT4 not like", value, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4In(List<String> values) {
            addCriterion("SEGMENT4 in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotIn(List<String> values) {
            addCriterion("SEGMENT4 not in", values, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4Between(String value1, String value2) {
            addCriterion("SEGMENT4 between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment4NotBetween(String value1, String value2) {
            addCriterion("SEGMENT4 not between", value1, value2, "segment4");
            return (Criteria) this;
        }

        public Criteria andSegment5IsNull() {
            addCriterion("SEGMENT5 is null");
            return (Criteria) this;
        }

        public Criteria andSegment5IsNotNull() {
            addCriterion("SEGMENT5 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment5EqualTo(String value) {
            addCriterion("SEGMENT5 =", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotEqualTo(String value) {
            addCriterion("SEGMENT5 <>", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5GreaterThan(String value) {
            addCriterion("SEGMENT5 >", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT5 >=", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5LessThan(String value) {
            addCriterion("SEGMENT5 <", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT5 <=", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5Like(String value) {
            addCriterion("SEGMENT5 like", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotLike(String value) {
            addCriterion("SEGMENT5 not like", value, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5In(List<String> values) {
            addCriterion("SEGMENT5 in", values, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotIn(List<String> values) {
            addCriterion("SEGMENT5 not in", values, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5Between(String value1, String value2) {
            addCriterion("SEGMENT5 between", value1, value2, "segment5");
            return (Criteria) this;
        }

        public Criteria andSegment5NotBetween(String value1, String value2) {
            addCriterion("SEGMENT5 not between", value1, value2, "segment5");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_organization_ti
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
     * @Table : mm_organization_ti
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