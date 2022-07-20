package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmFormatCellTcExample {
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
    public MmFormatCellTcExample() {
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
     * @Table : mm_format_cell_tc
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

        public Criteria andFormatidIsNull() {
            addCriterion("FORMATID is null");
            return (Criteria) this;
        }

        public Criteria andFormatidIsNotNull() {
            addCriterion("FORMATID is not null");
            return (Criteria) this;
        }

        public Criteria andFormatidEqualTo(BigDecimal value) {
            addCriterion("FORMATID =", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotEqualTo(BigDecimal value) {
            addCriterion("FORMATID <>", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidGreaterThan(BigDecimal value) {
            addCriterion("FORMATID >", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMATID >=", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLessThan(BigDecimal value) {
            addCriterion("FORMATID <", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMATID <=", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidIn(List<BigDecimal> values) {
            addCriterion("FORMATID in", values, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotIn(List<BigDecimal> values) {
            addCriterion("FORMATID not in", values, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMATID between", value1, value2, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMATID not between", value1, value2, "formatid");
            return (Criteria) this;
        }

        public Criteria andComponenttypeIsNull() {
            addCriterion("COMPONENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andComponenttypeIsNotNull() {
            addCriterion("COMPONENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andComponenttypeEqualTo(String value) {
            addCriterion("COMPONENTTYPE =", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeNotEqualTo(String value) {
            addCriterion("COMPONENTTYPE <>", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeGreaterThan(String value) {
            addCriterion("COMPONENTTYPE >", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPONENTTYPE >=", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeLessThan(String value) {
            addCriterion("COMPONENTTYPE <", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeLessThanOrEqualTo(String value) {
            addCriterion("COMPONENTTYPE <=", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeLike(String value) {
            addCriterion("COMPONENTTYPE like", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeNotLike(String value) {
            addCriterion("COMPONENTTYPE not like", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeIn(List<String> values) {
            addCriterion("COMPONENTTYPE in", values, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeNotIn(List<String> values) {
            addCriterion("COMPONENTTYPE not in", values, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeBetween(String value1, String value2) {
            addCriterion("COMPONENTTYPE between", value1, value2, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeNotBetween(String value1, String value2) {
            addCriterion("COMPONENTTYPE not between", value1, value2, "componenttype");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("NO is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("NO is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(BigDecimal value) {
            addCriterion("NO =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(BigDecimal value) {
            addCriterion("NO <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(BigDecimal value) {
            addCriterion("NO >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NO >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(BigDecimal value) {
            addCriterion("NO <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NO <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<BigDecimal> values) {
            addCriterion("NO in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<BigDecimal> values) {
            addCriterion("NO not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andColumncodeIsNull() {
            addCriterion("COLUMNCODE is null");
            return (Criteria) this;
        }

        public Criteria andColumncodeIsNotNull() {
            addCriterion("COLUMNCODE is not null");
            return (Criteria) this;
        }

        public Criteria andColumncodeEqualTo(String value) {
            addCriterion("COLUMNCODE =", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeNotEqualTo(String value) {
            addCriterion("COLUMNCODE <>", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeGreaterThan(String value) {
            addCriterion("COLUMNCODE >", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeGreaterThanOrEqualTo(String value) {
            addCriterion("COLUMNCODE >=", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeLessThan(String value) {
            addCriterion("COLUMNCODE <", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeLessThanOrEqualTo(String value) {
            addCriterion("COLUMNCODE <=", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeLike(String value) {
            addCriterion("COLUMNCODE like", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeNotLike(String value) {
            addCriterion("COLUMNCODE not like", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeIn(List<String> values) {
            addCriterion("COLUMNCODE in", values, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeNotIn(List<String> values) {
            addCriterion("COLUMNCODE not in", values, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeBetween(String value1, String value2) {
            addCriterion("COLUMNCODE between", value1, value2, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeNotBetween(String value1, String value2) {
            addCriterion("COLUMNCODE not between", value1, value2, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumnnameIsNull() {
            addCriterion("COLUMNNAME is null");
            return (Criteria) this;
        }

        public Criteria andColumnnameIsNotNull() {
            addCriterion("COLUMNNAME is not null");
            return (Criteria) this;
        }

        public Criteria andColumnnameEqualTo(String value) {
            addCriterion("COLUMNNAME =", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotEqualTo(String value) {
            addCriterion("COLUMNNAME <>", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameGreaterThan(String value) {
            addCriterion("COLUMNNAME >", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameGreaterThanOrEqualTo(String value) {
            addCriterion("COLUMNNAME >=", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameLessThan(String value) {
            addCriterion("COLUMNNAME <", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameLessThanOrEqualTo(String value) {
            addCriterion("COLUMNNAME <=", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameLike(String value) {
            addCriterion("COLUMNNAME like", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotLike(String value) {
            addCriterion("COLUMNNAME not like", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameIn(List<String> values) {
            addCriterion("COLUMNNAME in", values, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotIn(List<String> values) {
            addCriterion("COLUMNNAME not in", values, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameBetween(String value1, String value2) {
            addCriterion("COLUMNNAME between", value1, value2, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotBetween(String value1, String value2) {
            addCriterion("COLUMNNAME not between", value1, value2, "columnname");
            return (Criteria) this;
        }

        public Criteria andObjectnameIsNull() {
            addCriterion("OBJECTNAME is null");
            return (Criteria) this;
        }

        public Criteria andObjectnameIsNotNull() {
            addCriterion("OBJECTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andObjectnameEqualTo(String value) {
            addCriterion("OBJECTNAME =", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotEqualTo(String value) {
            addCriterion("OBJECTNAME <>", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameGreaterThan(String value) {
            addCriterion("OBJECTNAME >", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECTNAME >=", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLessThan(String value) {
            addCriterion("OBJECTNAME <", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLessThanOrEqualTo(String value) {
            addCriterion("OBJECTNAME <=", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameLike(String value) {
            addCriterion("OBJECTNAME like", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotLike(String value) {
            addCriterion("OBJECTNAME not like", value, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameIn(List<String> values) {
            addCriterion("OBJECTNAME in", values, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotIn(List<String> values) {
            addCriterion("OBJECTNAME not in", values, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameBetween(String value1, String value2) {
            addCriterion("OBJECTNAME between", value1, value2, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectnameNotBetween(String value1, String value2) {
            addCriterion("OBJECTNAME not between", value1, value2, "objectname");
            return (Criteria) this;
        }

        public Criteria andObjectlengthIsNull() {
            addCriterion("OBJECTLENGTH is null");
            return (Criteria) this;
        }

        public Criteria andObjectlengthIsNotNull() {
            addCriterion("OBJECTLENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andObjectlengthEqualTo(BigDecimal value) {
            addCriterion("OBJECTLENGTH =", value, "objectlength");
            return (Criteria) this;
        }

        public Criteria andObjectlengthNotEqualTo(BigDecimal value) {
            addCriterion("OBJECTLENGTH <>", value, "objectlength");
            return (Criteria) this;
        }

        public Criteria andObjectlengthGreaterThan(BigDecimal value) {
            addCriterion("OBJECTLENGTH >", value, "objectlength");
            return (Criteria) this;
        }

        public Criteria andObjectlengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJECTLENGTH >=", value, "objectlength");
            return (Criteria) this;
        }

        public Criteria andObjectlengthLessThan(BigDecimal value) {
            addCriterion("OBJECTLENGTH <", value, "objectlength");
            return (Criteria) this;
        }

        public Criteria andObjectlengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJECTLENGTH <=", value, "objectlength");
            return (Criteria) this;
        }

        public Criteria andObjectlengthIn(List<BigDecimal> values) {
            addCriterion("OBJECTLENGTH in", values, "objectlength");
            return (Criteria) this;
        }

        public Criteria andObjectlengthNotIn(List<BigDecimal> values) {
            addCriterion("OBJECTLENGTH not in", values, "objectlength");
            return (Criteria) this;
        }

        public Criteria andObjectlengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJECTLENGTH between", value1, value2, "objectlength");
            return (Criteria) this;
        }

        public Criteria andObjectlengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJECTLENGTH not between", value1, value2, "objectlength");
            return (Criteria) this;
        }

        public Criteria andIsfillIsNull() {
            addCriterion("ISFILL is null");
            return (Criteria) this;
        }

        public Criteria andIsfillIsNotNull() {
            addCriterion("ISFILL is not null");
            return (Criteria) this;
        }

        public Criteria andIsfillEqualTo(BigDecimal value) {
            addCriterion("ISFILL =", value, "isfill");
            return (Criteria) this;
        }

        public Criteria andIsfillNotEqualTo(BigDecimal value) {
            addCriterion("ISFILL <>", value, "isfill");
            return (Criteria) this;
        }

        public Criteria andIsfillGreaterThan(BigDecimal value) {
            addCriterion("ISFILL >", value, "isfill");
            return (Criteria) this;
        }

        public Criteria andIsfillGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISFILL >=", value, "isfill");
            return (Criteria) this;
        }

        public Criteria andIsfillLessThan(BigDecimal value) {
            addCriterion("ISFILL <", value, "isfill");
            return (Criteria) this;
        }

        public Criteria andIsfillLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISFILL <=", value, "isfill");
            return (Criteria) this;
        }

        public Criteria andIsfillIn(List<BigDecimal> values) {
            addCriterion("ISFILL in", values, "isfill");
            return (Criteria) this;
        }

        public Criteria andIsfillNotIn(List<BigDecimal> values) {
            addCriterion("ISFILL not in", values, "isfill");
            return (Criteria) this;
        }

        public Criteria andIsfillBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISFILL between", value1, value2, "isfill");
            return (Criteria) this;
        }

        public Criteria andIsfillNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISFILL not between", value1, value2, "isfill");
            return (Criteria) this;
        }

        public Criteria andFillingIsNull() {
            addCriterion("FILLING is null");
            return (Criteria) this;
        }

        public Criteria andFillingIsNotNull() {
            addCriterion("FILLING is not null");
            return (Criteria) this;
        }

        public Criteria andFillingEqualTo(String value) {
            addCriterion("FILLING =", value, "filling");
            return (Criteria) this;
        }

        public Criteria andFillingNotEqualTo(String value) {
            addCriterion("FILLING <>", value, "filling");
            return (Criteria) this;
        }

        public Criteria andFillingGreaterThan(String value) {
            addCriterion("FILLING >", value, "filling");
            return (Criteria) this;
        }

        public Criteria andFillingGreaterThanOrEqualTo(String value) {
            addCriterion("FILLING >=", value, "filling");
            return (Criteria) this;
        }

        public Criteria andFillingLessThan(String value) {
            addCriterion("FILLING <", value, "filling");
            return (Criteria) this;
        }

        public Criteria andFillingLessThanOrEqualTo(String value) {
            addCriterion("FILLING <=", value, "filling");
            return (Criteria) this;
        }

        public Criteria andFillingLike(String value) {
            addCriterion("FILLING like", value, "filling");
            return (Criteria) this;
        }

        public Criteria andFillingNotLike(String value) {
            addCriterion("FILLING not like", value, "filling");
            return (Criteria) this;
        }

        public Criteria andFillingIn(List<String> values) {
            addCriterion("FILLING in", values, "filling");
            return (Criteria) this;
        }

        public Criteria andFillingNotIn(List<String> values) {
            addCriterion("FILLING not in", values, "filling");
            return (Criteria) this;
        }

        public Criteria andFillingBetween(String value1, String value2) {
            addCriterion("FILLING between", value1, value2, "filling");
            return (Criteria) this;
        }

        public Criteria andFillingNotBetween(String value1, String value2) {
            addCriterion("FILLING not between", value1, value2, "filling");
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

        public Criteria andOpcodeIsNull() {
            addCriterion("OPCODE is null");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNotNull() {
            addCriterion("OPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOpcodeEqualTo(String value) {
            addCriterion("OPCODE =", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotEqualTo(String value) {
            addCriterion("OPCODE <>", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThan(String value) {
            addCriterion("OPCODE >", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPCODE >=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThan(String value) {
            addCriterion("OPCODE <", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThanOrEqualTo(String value) {
            addCriterion("OPCODE <=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLike(String value) {
            addCriterion("OPCODE like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotLike(String value) {
            addCriterion("OPCODE not like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeIn(List<String> values) {
            addCriterion("OPCODE in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotIn(List<String> values) {
            addCriterion("OPCODE not in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeBetween(String value1, String value2) {
            addCriterion("OPCODE between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotBetween(String value1, String value2) {
            addCriterion("OPCODE not between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeIsNull() {
            addCriterion("LASTOPCODE is null");
            return (Criteria) this;
        }

        public Criteria andLastopcodeIsNotNull() {
            addCriterion("LASTOPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andLastopcodeEqualTo(String value) {
            addCriterion("LASTOPCODE =", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotEqualTo(String value) {
            addCriterion("LASTOPCODE <>", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeGreaterThan(String value) {
            addCriterion("LASTOPCODE >", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeGreaterThanOrEqualTo(String value) {
            addCriterion("LASTOPCODE >=", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeLessThan(String value) {
            addCriterion("LASTOPCODE <", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeLessThanOrEqualTo(String value) {
            addCriterion("LASTOPCODE <=", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeLike(String value) {
            addCriterion("LASTOPCODE like", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotLike(String value) {
            addCriterion("LASTOPCODE not like", value, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeIn(List<String> values) {
            addCriterion("LASTOPCODE in", values, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotIn(List<String> values) {
            addCriterion("LASTOPCODE not in", values, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeBetween(String value1, String value2) {
            addCriterion("LASTOPCODE between", value1, value2, "lastopcode");
            return (Criteria) this;
        }

        public Criteria andLastopcodeNotBetween(String value1, String value2) {
            addCriterion("LASTOPCODE not between", value1, value2, "lastopcode");
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

        public Criteria andDateformatIsNull() {
            addCriterion("DATEFORMAT is null");
            return (Criteria) this;
        }

        public Criteria andDateformatIsNotNull() {
            addCriterion("DATEFORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andDateformatEqualTo(String value) {
            addCriterion("DATEFORMAT =", value, "dateformat");
            return (Criteria) this;
        }

        public Criteria andDateformatNotEqualTo(String value) {
            addCriterion("DATEFORMAT <>", value, "dateformat");
            return (Criteria) this;
        }

        public Criteria andDateformatGreaterThan(String value) {
            addCriterion("DATEFORMAT >", value, "dateformat");
            return (Criteria) this;
        }

        public Criteria andDateformatGreaterThanOrEqualTo(String value) {
            addCriterion("DATEFORMAT >=", value, "dateformat");
            return (Criteria) this;
        }

        public Criteria andDateformatLessThan(String value) {
            addCriterion("DATEFORMAT <", value, "dateformat");
            return (Criteria) this;
        }

        public Criteria andDateformatLessThanOrEqualTo(String value) {
            addCriterion("DATEFORMAT <=", value, "dateformat");
            return (Criteria) this;
        }

        public Criteria andDateformatLike(String value) {
            addCriterion("DATEFORMAT like", value, "dateformat");
            return (Criteria) this;
        }

        public Criteria andDateformatNotLike(String value) {
            addCriterion("DATEFORMAT not like", value, "dateformat");
            return (Criteria) this;
        }

        public Criteria andDateformatIn(List<String> values) {
            addCriterion("DATEFORMAT in", values, "dateformat");
            return (Criteria) this;
        }

        public Criteria andDateformatNotIn(List<String> values) {
            addCriterion("DATEFORMAT not in", values, "dateformat");
            return (Criteria) this;
        }

        public Criteria andDateformatBetween(String value1, String value2) {
            addCriterion("DATEFORMAT between", value1, value2, "dateformat");
            return (Criteria) this;
        }

        public Criteria andDateformatNotBetween(String value1, String value2) {
            addCriterion("DATEFORMAT not between", value1, value2, "dateformat");
            return (Criteria) this;
        }

        public Criteria andFixedvalueIsNull() {
            addCriterion("FIXEDVALUE is null");
            return (Criteria) this;
        }

        public Criteria andFixedvalueIsNotNull() {
            addCriterion("FIXEDVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFixedvalueEqualTo(String value) {
            addCriterion("FIXEDVALUE =", value, "fixedvalue");
            return (Criteria) this;
        }

        public Criteria andFixedvalueNotEqualTo(String value) {
            addCriterion("FIXEDVALUE <>", value, "fixedvalue");
            return (Criteria) this;
        }

        public Criteria andFixedvalueGreaterThan(String value) {
            addCriterion("FIXEDVALUE >", value, "fixedvalue");
            return (Criteria) this;
        }

        public Criteria andFixedvalueGreaterThanOrEqualTo(String value) {
            addCriterion("FIXEDVALUE >=", value, "fixedvalue");
            return (Criteria) this;
        }

        public Criteria andFixedvalueLessThan(String value) {
            addCriterion("FIXEDVALUE <", value, "fixedvalue");
            return (Criteria) this;
        }

        public Criteria andFixedvalueLessThanOrEqualTo(String value) {
            addCriterion("FIXEDVALUE <=", value, "fixedvalue");
            return (Criteria) this;
        }

        public Criteria andFixedvalueLike(String value) {
            addCriterion("FIXEDVALUE like", value, "fixedvalue");
            return (Criteria) this;
        }

        public Criteria andFixedvalueNotLike(String value) {
            addCriterion("FIXEDVALUE not like", value, "fixedvalue");
            return (Criteria) this;
        }

        public Criteria andFixedvalueIn(List<String> values) {
            addCriterion("FIXEDVALUE in", values, "fixedvalue");
            return (Criteria) this;
        }

        public Criteria andFixedvalueNotIn(List<String> values) {
            addCriterion("FIXEDVALUE not in", values, "fixedvalue");
            return (Criteria) this;
        }

        public Criteria andFixedvalueBetween(String value1, String value2) {
            addCriterion("FIXEDVALUE between", value1, value2, "fixedvalue");
            return (Criteria) this;
        }

        public Criteria andFixedvalueNotBetween(String value1, String value2) {
            addCriterion("FIXEDVALUE not between", value1, value2, "fixedvalue");
            return (Criteria) this;
        }

        public Criteria andComponentidIsNull() {
            addCriterion("COMPONENTID is null");
            return (Criteria) this;
        }

        public Criteria andComponentidIsNotNull() {
            addCriterion("COMPONENTID is not null");
            return (Criteria) this;
        }

        public Criteria andComponentidEqualTo(BigDecimal value) {
            addCriterion("COMPONENTID =", value, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidNotEqualTo(BigDecimal value) {
            addCriterion("COMPONENTID <>", value, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidGreaterThan(BigDecimal value) {
            addCriterion("COMPONENTID >", value, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPONENTID >=", value, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidLessThan(BigDecimal value) {
            addCriterion("COMPONENTID <", value, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPONENTID <=", value, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidIn(List<BigDecimal> values) {
            addCriterion("COMPONENTID in", values, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidNotIn(List<BigDecimal> values) {
            addCriterion("COMPONENTID not in", values, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPONENTID between", value1, value2, "componentid");
            return (Criteria) this;
        }

        public Criteria andComponentidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPONENTID not between", value1, value2, "componentid");
            return (Criteria) this;
        }

        public Criteria andRequiredIsNull() {
            addCriterion("REQUIRED is null");
            return (Criteria) this;
        }

        public Criteria andRequiredIsNotNull() {
            addCriterion("REQUIRED is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredEqualTo(String value) {
            addCriterion("REQUIRED =", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredNotEqualTo(String value) {
            addCriterion("REQUIRED <>", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredGreaterThan(String value) {
            addCriterion("REQUIRED >", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRED >=", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredLessThan(String value) {
            addCriterion("REQUIRED <", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredLessThanOrEqualTo(String value) {
            addCriterion("REQUIRED <=", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredLike(String value) {
            addCriterion("REQUIRED like", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredNotLike(String value) {
            addCriterion("REQUIRED not like", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredIn(List<String> values) {
            addCriterion("REQUIRED in", values, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredNotIn(List<String> values) {
            addCriterion("REQUIRED not in", values, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredBetween(String value1, String value2) {
            addCriterion("REQUIRED between", value1, value2, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredNotBetween(String value1, String value2) {
            addCriterion("REQUIRED not between", value1, value2, "required");
            return (Criteria) this;
        }

        public Criteria andNumberscaleIsNull() {
            addCriterion("NUMBERSCALE is null");
            return (Criteria) this;
        }

        public Criteria andNumberscaleIsNotNull() {
            addCriterion("NUMBERSCALE is not null");
            return (Criteria) this;
        }

        public Criteria andNumberscaleEqualTo(BigDecimal value) {
            addCriterion("NUMBERSCALE =", value, "numberscale");
            return (Criteria) this;
        }

        public Criteria andNumberscaleNotEqualTo(BigDecimal value) {
            addCriterion("NUMBERSCALE <>", value, "numberscale");
            return (Criteria) this;
        }

        public Criteria andNumberscaleGreaterThan(BigDecimal value) {
            addCriterion("NUMBERSCALE >", value, "numberscale");
            return (Criteria) this;
        }

        public Criteria andNumberscaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUMBERSCALE >=", value, "numberscale");
            return (Criteria) this;
        }

        public Criteria andNumberscaleLessThan(BigDecimal value) {
            addCriterion("NUMBERSCALE <", value, "numberscale");
            return (Criteria) this;
        }

        public Criteria andNumberscaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUMBERSCALE <=", value, "numberscale");
            return (Criteria) this;
        }

        public Criteria andNumberscaleIn(List<BigDecimal> values) {
            addCriterion("NUMBERSCALE in", values, "numberscale");
            return (Criteria) this;
        }

        public Criteria andNumberscaleNotIn(List<BigDecimal> values) {
            addCriterion("NUMBERSCALE not in", values, "numberscale");
            return (Criteria) this;
        }

        public Criteria andNumberscaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUMBERSCALE between", value1, value2, "numberscale");
            return (Criteria) this;
        }

        public Criteria andNumberscaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUMBERSCALE not between", value1, value2, "numberscale");
            return (Criteria) this;
        }

        public Criteria andFirstfilllengthIsNull() {
            addCriterion("FIRSTFILLLENGTH is null");
            return (Criteria) this;
        }

        public Criteria andFirstfilllengthIsNotNull() {
            addCriterion("FIRSTFILLLENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andFirstfilllengthEqualTo(BigDecimal value) {
            addCriterion("FIRSTFILLLENGTH =", value, "firstfilllength");
            return (Criteria) this;
        }

        public Criteria andFirstfilllengthNotEqualTo(BigDecimal value) {
            addCriterion("FIRSTFILLLENGTH <>", value, "firstfilllength");
            return (Criteria) this;
        }

        public Criteria andFirstfilllengthGreaterThan(BigDecimal value) {
            addCriterion("FIRSTFILLLENGTH >", value, "firstfilllength");
            return (Criteria) this;
        }

        public Criteria andFirstfilllengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRSTFILLLENGTH >=", value, "firstfilllength");
            return (Criteria) this;
        }

        public Criteria andFirstfilllengthLessThan(BigDecimal value) {
            addCriterion("FIRSTFILLLENGTH <", value, "firstfilllength");
            return (Criteria) this;
        }

        public Criteria andFirstfilllengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRSTFILLLENGTH <=", value, "firstfilllength");
            return (Criteria) this;
        }

        public Criteria andFirstfilllengthIn(List<BigDecimal> values) {
            addCriterion("FIRSTFILLLENGTH in", values, "firstfilllength");
            return (Criteria) this;
        }

        public Criteria andFirstfilllengthNotIn(List<BigDecimal> values) {
            addCriterion("FIRSTFILLLENGTH not in", values, "firstfilllength");
            return (Criteria) this;
        }

        public Criteria andFirstfilllengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRSTFILLLENGTH between", value1, value2, "firstfilllength");
            return (Criteria) this;
        }

        public Criteria andFirstfilllengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRSTFILLLENGTH not between", value1, value2, "firstfilllength");
            return (Criteria) this;
        }

        public Criteria andSecondfillingIsNull() {
            addCriterion("SECONDFILLING is null");
            return (Criteria) this;
        }

        public Criteria andSecondfillingIsNotNull() {
            addCriterion("SECONDFILLING is not null");
            return (Criteria) this;
        }

        public Criteria andSecondfillingEqualTo(String value) {
            addCriterion("SECONDFILLING =", value, "secondfilling");
            return (Criteria) this;
        }

        public Criteria andSecondfillingNotEqualTo(String value) {
            addCriterion("SECONDFILLING <>", value, "secondfilling");
            return (Criteria) this;
        }

        public Criteria andSecondfillingGreaterThan(String value) {
            addCriterion("SECONDFILLING >", value, "secondfilling");
            return (Criteria) this;
        }

        public Criteria andSecondfillingGreaterThanOrEqualTo(String value) {
            addCriterion("SECONDFILLING >=", value, "secondfilling");
            return (Criteria) this;
        }

        public Criteria andSecondfillingLessThan(String value) {
            addCriterion("SECONDFILLING <", value, "secondfilling");
            return (Criteria) this;
        }

        public Criteria andSecondfillingLessThanOrEqualTo(String value) {
            addCriterion("SECONDFILLING <=", value, "secondfilling");
            return (Criteria) this;
        }

        public Criteria andSecondfillingLike(String value) {
            addCriterion("SECONDFILLING like", value, "secondfilling");
            return (Criteria) this;
        }

        public Criteria andSecondfillingNotLike(String value) {
            addCriterion("SECONDFILLING not like", value, "secondfilling");
            return (Criteria) this;
        }

        public Criteria andSecondfillingIn(List<String> values) {
            addCriterion("SECONDFILLING in", values, "secondfilling");
            return (Criteria) this;
        }

        public Criteria andSecondfillingNotIn(List<String> values) {
            addCriterion("SECONDFILLING not in", values, "secondfilling");
            return (Criteria) this;
        }

        public Criteria andSecondfillingBetween(String value1, String value2) {
            addCriterion("SECONDFILLING between", value1, value2, "secondfilling");
            return (Criteria) this;
        }

        public Criteria andSecondfillingNotBetween(String value1, String value2) {
            addCriterion("SECONDFILLING not between", value1, value2, "secondfilling");
            return (Criteria) this;
        }

        public Criteria andCodetypeIsNull() {
            addCriterion("CODETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCodetypeIsNotNull() {
            addCriterion("CODETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCodetypeEqualTo(String value) {
            addCriterion("CODETYPE =", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotEqualTo(String value) {
            addCriterion("CODETYPE <>", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeGreaterThan(String value) {
            addCriterion("CODETYPE >", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CODETYPE >=", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeLessThan(String value) {
            addCriterion("CODETYPE <", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeLessThanOrEqualTo(String value) {
            addCriterion("CODETYPE <=", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeLike(String value) {
            addCriterion("CODETYPE like", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotLike(String value) {
            addCriterion("CODETYPE not like", value, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeIn(List<String> values) {
            addCriterion("CODETYPE in", values, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotIn(List<String> values) {
            addCriterion("CODETYPE not in", values, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeBetween(String value1, String value2) {
            addCriterion("CODETYPE between", value1, value2, "codetype");
            return (Criteria) this;
        }

        public Criteria andCodetypeNotBetween(String value1, String value2) {
            addCriterion("CODETYPE not between", value1, value2, "codetype");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnIsNull() {
            addCriterion("REFRENCE1BYCOLUMN is null");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnIsNotNull() {
            addCriterion("REFRENCE1BYCOLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnEqualTo(String value) {
            addCriterion("REFRENCE1BYCOLUMN =", value, "refrence1bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnNotEqualTo(String value) {
            addCriterion("REFRENCE1BYCOLUMN <>", value, "refrence1bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnGreaterThan(String value) {
            addCriterion("REFRENCE1BYCOLUMN >", value, "refrence1bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnGreaterThanOrEqualTo(String value) {
            addCriterion("REFRENCE1BYCOLUMN >=", value, "refrence1bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnLessThan(String value) {
            addCriterion("REFRENCE1BYCOLUMN <", value, "refrence1bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnLessThanOrEqualTo(String value) {
            addCriterion("REFRENCE1BYCOLUMN <=", value, "refrence1bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnLike(String value) {
            addCriterion("REFRENCE1BYCOLUMN like", value, "refrence1bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnNotLike(String value) {
            addCriterion("REFRENCE1BYCOLUMN not like", value, "refrence1bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnIn(List<String> values) {
            addCriterion("REFRENCE1BYCOLUMN in", values, "refrence1bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnNotIn(List<String> values) {
            addCriterion("REFRENCE1BYCOLUMN not in", values, "refrence1bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnBetween(String value1, String value2) {
            addCriterion("REFRENCE1BYCOLUMN between", value1, value2, "refrence1bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence1bycolumnNotBetween(String value1, String value2) {
            addCriterion("REFRENCE1BYCOLUMN not between", value1, value2, "refrence1bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnIsNull() {
            addCriterion("REFRENCE2BYCOLUMN is null");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnIsNotNull() {
            addCriterion("REFRENCE2BYCOLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnEqualTo(String value) {
            addCriterion("REFRENCE2BYCOLUMN =", value, "refrence2bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnNotEqualTo(String value) {
            addCriterion("REFRENCE2BYCOLUMN <>", value, "refrence2bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnGreaterThan(String value) {
            addCriterion("REFRENCE2BYCOLUMN >", value, "refrence2bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnGreaterThanOrEqualTo(String value) {
            addCriterion("REFRENCE2BYCOLUMN >=", value, "refrence2bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnLessThan(String value) {
            addCriterion("REFRENCE2BYCOLUMN <", value, "refrence2bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnLessThanOrEqualTo(String value) {
            addCriterion("REFRENCE2BYCOLUMN <=", value, "refrence2bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnLike(String value) {
            addCriterion("REFRENCE2BYCOLUMN like", value, "refrence2bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnNotLike(String value) {
            addCriterion("REFRENCE2BYCOLUMN not like", value, "refrence2bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnIn(List<String> values) {
            addCriterion("REFRENCE2BYCOLUMN in", values, "refrence2bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnNotIn(List<String> values) {
            addCriterion("REFRENCE2BYCOLUMN not in", values, "refrence2bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnBetween(String value1, String value2) {
            addCriterion("REFRENCE2BYCOLUMN between", value1, value2, "refrence2bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence2bycolumnNotBetween(String value1, String value2) {
            addCriterion("REFRENCE2BYCOLUMN not between", value1, value2, "refrence2bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnIsNull() {
            addCriterion("REFRENCE3BYCOLUMN is null");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnIsNotNull() {
            addCriterion("REFRENCE3BYCOLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnEqualTo(String value) {
            addCriterion("REFRENCE3BYCOLUMN =", value, "refrence3bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnNotEqualTo(String value) {
            addCriterion("REFRENCE3BYCOLUMN <>", value, "refrence3bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnGreaterThan(String value) {
            addCriterion("REFRENCE3BYCOLUMN >", value, "refrence3bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnGreaterThanOrEqualTo(String value) {
            addCriterion("REFRENCE3BYCOLUMN >=", value, "refrence3bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnLessThan(String value) {
            addCriterion("REFRENCE3BYCOLUMN <", value, "refrence3bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnLessThanOrEqualTo(String value) {
            addCriterion("REFRENCE3BYCOLUMN <=", value, "refrence3bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnLike(String value) {
            addCriterion("REFRENCE3BYCOLUMN like", value, "refrence3bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnNotLike(String value) {
            addCriterion("REFRENCE3BYCOLUMN not like", value, "refrence3bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnIn(List<String> values) {
            addCriterion("REFRENCE3BYCOLUMN in", values, "refrence3bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnNotIn(List<String> values) {
            addCriterion("REFRENCE3BYCOLUMN not in", values, "refrence3bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnBetween(String value1, String value2) {
            addCriterion("REFRENCE3BYCOLUMN between", value1, value2, "refrence3bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence3bycolumnNotBetween(String value1, String value2) {
            addCriterion("REFRENCE3BYCOLUMN not between", value1, value2, "refrence3bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnIsNull() {
            addCriterion("REFRENCE4BYCOLUMN is null");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnIsNotNull() {
            addCriterion("REFRENCE4BYCOLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnEqualTo(String value) {
            addCriterion("REFRENCE4BYCOLUMN =", value, "refrence4bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnNotEqualTo(String value) {
            addCriterion("REFRENCE4BYCOLUMN <>", value, "refrence4bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnGreaterThan(String value) {
            addCriterion("REFRENCE4BYCOLUMN >", value, "refrence4bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnGreaterThanOrEqualTo(String value) {
            addCriterion("REFRENCE4BYCOLUMN >=", value, "refrence4bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnLessThan(String value) {
            addCriterion("REFRENCE4BYCOLUMN <", value, "refrence4bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnLessThanOrEqualTo(String value) {
            addCriterion("REFRENCE4BYCOLUMN <=", value, "refrence4bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnLike(String value) {
            addCriterion("REFRENCE4BYCOLUMN like", value, "refrence4bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnNotLike(String value) {
            addCriterion("REFRENCE4BYCOLUMN not like", value, "refrence4bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnIn(List<String> values) {
            addCriterion("REFRENCE4BYCOLUMN in", values, "refrence4bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnNotIn(List<String> values) {
            addCriterion("REFRENCE4BYCOLUMN not in", values, "refrence4bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnBetween(String value1, String value2) {
            addCriterion("REFRENCE4BYCOLUMN between", value1, value2, "refrence4bycolumn");
            return (Criteria) this;
        }

        public Criteria andRefrence4bycolumnNotBetween(String value1, String value2) {
            addCriterion("REFRENCE4BYCOLUMN not between", value1, value2, "refrence4bycolumn");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNull() {
            addCriterion("PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNotNull() {
            addCriterion("PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andPrefixEqualTo(String value) {
            addCriterion("PREFIX =", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotEqualTo(String value) {
            addCriterion("PREFIX <>", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThan(String value) {
            addCriterion("PREFIX >", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("PREFIX >=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThan(String value) {
            addCriterion("PREFIX <", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThanOrEqualTo(String value) {
            addCriterion("PREFIX <=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLike(String value) {
            addCriterion("PREFIX like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotLike(String value) {
            addCriterion("PREFIX not like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixIn(List<String> values) {
            addCriterion("PREFIX in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotIn(List<String> values) {
            addCriterion("PREFIX not in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixBetween(String value1, String value2) {
            addCriterion("PREFIX between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotBetween(String value1, String value2) {
            addCriterion("PREFIX not between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andSuffixIsNull() {
            addCriterion("SUFFIX is null");
            return (Criteria) this;
        }

        public Criteria andSuffixIsNotNull() {
            addCriterion("SUFFIX is not null");
            return (Criteria) this;
        }

        public Criteria andSuffixEqualTo(String value) {
            addCriterion("SUFFIX =", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotEqualTo(String value) {
            addCriterion("SUFFIX <>", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixGreaterThan(String value) {
            addCriterion("SUFFIX >", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("SUFFIX >=", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLessThan(String value) {
            addCriterion("SUFFIX <", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLessThanOrEqualTo(String value) {
            addCriterion("SUFFIX <=", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLike(String value) {
            addCriterion("SUFFIX like", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotLike(String value) {
            addCriterion("SUFFIX not like", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixIn(List<String> values) {
            addCriterion("SUFFIX in", values, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotIn(List<String> values) {
            addCriterion("SUFFIX not in", values, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixBetween(String value1, String value2) {
            addCriterion("SUFFIX between", value1, value2, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotBetween(String value1, String value2) {
            addCriterion("SUFFIX not between", value1, value2, "suffix");
            return (Criteria) this;
        }

        public Criteria andRatioIsNull() {
            addCriterion("RATIO is null");
            return (Criteria) this;
        }

        public Criteria andRatioIsNotNull() {
            addCriterion("RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andRatioEqualTo(BigDecimal value) {
            addCriterion("RATIO =", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotEqualTo(BigDecimal value) {
            addCriterion("RATIO <>", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThan(BigDecimal value) {
            addCriterion("RATIO >", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATIO >=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThan(BigDecimal value) {
            addCriterion("RATIO <", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATIO <=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioIn(List<BigDecimal> values) {
            addCriterion("RATIO in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotIn(List<BigDecimal> values) {
            addCriterion("RATIO not in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATIO between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATIO not between", value1, value2, "ratio");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_format_cell_tc
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
     * @Table : mm_format_cell_tc
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