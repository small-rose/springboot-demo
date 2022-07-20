package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmFormatTcExample {
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
    public MmFormatTcExample() {
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
     * @Table : mm_format_tc
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

        public Criteria andFormatidIsNull() {
            addCriterion("FORMATID is null");
            return (Criteria) this;
        }

        public Criteria andFormatidIsNotNull() {
            addCriterion("FORMATID is not null");
            return (Criteria) this;
        }

        public Criteria andFormatidEqualTo(String value) {
            addCriterion("FORMATID =", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotEqualTo(String value) {
            addCriterion("FORMATID <>", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidGreaterThan(String value) {
            addCriterion("FORMATID >", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidGreaterThanOrEqualTo(String value) {
            addCriterion("FORMATID >=", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLessThan(String value) {
            addCriterion("FORMATID <", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLessThanOrEqualTo(String value) {
            addCriterion("FORMATID <=", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLike(String value) {
            addCriterion("FORMATID like", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotLike(String value) {
            addCriterion("FORMATID not like", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidIn(List<String> values) {
            addCriterion("FORMATID in", values, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotIn(List<String> values) {
            addCriterion("FORMATID not in", values, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidBetween(String value1, String value2) {
            addCriterion("FORMATID between", value1, value2, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotBetween(String value1, String value2) {
            addCriterion("FORMATID not between", value1, value2, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatnameIsNull() {
            addCriterion("FORMATNAME is null");
            return (Criteria) this;
        }

        public Criteria andFormatnameIsNotNull() {
            addCriterion("FORMATNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFormatnameEqualTo(String value) {
            addCriterion("FORMATNAME =", value, "formatname");
            return (Criteria) this;
        }

        public Criteria andFormatnameNotEqualTo(String value) {
            addCriterion("FORMATNAME <>", value, "formatname");
            return (Criteria) this;
        }

        public Criteria andFormatnameGreaterThan(String value) {
            addCriterion("FORMATNAME >", value, "formatname");
            return (Criteria) this;
        }

        public Criteria andFormatnameGreaterThanOrEqualTo(String value) {
            addCriterion("FORMATNAME >=", value, "formatname");
            return (Criteria) this;
        }

        public Criteria andFormatnameLessThan(String value) {
            addCriterion("FORMATNAME <", value, "formatname");
            return (Criteria) this;
        }

        public Criteria andFormatnameLessThanOrEqualTo(String value) {
            addCriterion("FORMATNAME <=", value, "formatname");
            return (Criteria) this;
        }

        public Criteria andFormatnameLike(String value) {
            addCriterion("FORMATNAME like", value, "formatname");
            return (Criteria) this;
        }

        public Criteria andFormatnameNotLike(String value) {
            addCriterion("FORMATNAME not like", value, "formatname");
            return (Criteria) this;
        }

        public Criteria andFormatnameIn(List<String> values) {
            addCriterion("FORMATNAME in", values, "formatname");
            return (Criteria) this;
        }

        public Criteria andFormatnameNotIn(List<String> values) {
            addCriterion("FORMATNAME not in", values, "formatname");
            return (Criteria) this;
        }

        public Criteria andFormatnameBetween(String value1, String value2) {
            addCriterion("FORMATNAME between", value1, value2, "formatname");
            return (Criteria) this;
        }

        public Criteria andFormatnameNotBetween(String value1, String value2) {
            addCriterion("FORMATNAME not between", value1, value2, "formatname");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("FILEPATH is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("FILEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("FILEPATH =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("FILEPATH <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("FILEPATH >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("FILEPATH >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("FILEPATH <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("FILEPATH <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("FILEPATH like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("FILEPATH not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("FILEPATH in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("FILEPATH not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("FILEPATH between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("FILEPATH not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilesuffixIsNull() {
            addCriterion("FILESUFFIX is null");
            return (Criteria) this;
        }

        public Criteria andFilesuffixIsNotNull() {
            addCriterion("FILESUFFIX is not null");
            return (Criteria) this;
        }

        public Criteria andFilesuffixEqualTo(String value) {
            addCriterion("FILESUFFIX =", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixNotEqualTo(String value) {
            addCriterion("FILESUFFIX <>", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixGreaterThan(String value) {
            addCriterion("FILESUFFIX >", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixGreaterThanOrEqualTo(String value) {
            addCriterion("FILESUFFIX >=", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixLessThan(String value) {
            addCriterion("FILESUFFIX <", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixLessThanOrEqualTo(String value) {
            addCriterion("FILESUFFIX <=", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixLike(String value) {
            addCriterion("FILESUFFIX like", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixNotLike(String value) {
            addCriterion("FILESUFFIX not like", value, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixIn(List<String> values) {
            addCriterion("FILESUFFIX in", values, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixNotIn(List<String> values) {
            addCriterion("FILESUFFIX not in", values, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixBetween(String value1, String value2) {
            addCriterion("FILESUFFIX between", value1, value2, "filesuffix");
            return (Criteria) this;
        }

        public Criteria andFilesuffixNotBetween(String value1, String value2) {
            addCriterion("FILESUFFIX not between", value1, value2, "filesuffix");
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

        public Criteria andIsaddIsNull() {
            addCriterion("ISADD is null");
            return (Criteria) this;
        }

        public Criteria andIsaddIsNotNull() {
            addCriterion("ISADD is not null");
            return (Criteria) this;
        }

        public Criteria andIsaddEqualTo(BigDecimal value) {
            addCriterion("ISADD =", value, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddNotEqualTo(BigDecimal value) {
            addCriterion("ISADD <>", value, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddGreaterThan(BigDecimal value) {
            addCriterion("ISADD >", value, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISADD >=", value, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddLessThan(BigDecimal value) {
            addCriterion("ISADD <", value, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISADD <=", value, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddIn(List<BigDecimal> values) {
            addCriterion("ISADD in", values, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddNotIn(List<BigDecimal> values) {
            addCriterion("ISADD not in", values, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISADD between", value1, value2, "isadd");
            return (Criteria) this;
        }

        public Criteria andIsaddNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISADD not between", value1, value2, "isadd");
            return (Criteria) this;
        }

        public Criteria andSplitIsNull() {
            addCriterion("SPLIT is null");
            return (Criteria) this;
        }

        public Criteria andSplitIsNotNull() {
            addCriterion("SPLIT is not null");
            return (Criteria) this;
        }

        public Criteria andSplitEqualTo(String value) {
            addCriterion("SPLIT =", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitNotEqualTo(String value) {
            addCriterion("SPLIT <>", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitGreaterThan(String value) {
            addCriterion("SPLIT >", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitGreaterThanOrEqualTo(String value) {
            addCriterion("SPLIT >=", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitLessThan(String value) {
            addCriterion("SPLIT <", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitLessThanOrEqualTo(String value) {
            addCriterion("SPLIT <=", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitLike(String value) {
            addCriterion("SPLIT like", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitNotLike(String value) {
            addCriterion("SPLIT not like", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitIn(List<String> values) {
            addCriterion("SPLIT in", values, "split");
            return (Criteria) this;
        }

        public Criteria andSplitNotIn(List<String> values) {
            addCriterion("SPLIT not in", values, "split");
            return (Criteria) this;
        }

        public Criteria andSplitBetween(String value1, String value2) {
            addCriterion("SPLIT between", value1, value2, "split");
            return (Criteria) this;
        }

        public Criteria andSplitNotBetween(String value1, String value2) {
            addCriterion("SPLIT not between", value1, value2, "split");
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

        public Criteria andFormattypeIsNull() {
            addCriterion("FORMATTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFormattypeIsNotNull() {
            addCriterion("FORMATTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFormattypeEqualTo(String value) {
            addCriterion("FORMATTYPE =", value, "formattype");
            return (Criteria) this;
        }

        public Criteria andFormattypeNotEqualTo(String value) {
            addCriterion("FORMATTYPE <>", value, "formattype");
            return (Criteria) this;
        }

        public Criteria andFormattypeGreaterThan(String value) {
            addCriterion("FORMATTYPE >", value, "formattype");
            return (Criteria) this;
        }

        public Criteria andFormattypeGreaterThanOrEqualTo(String value) {
            addCriterion("FORMATTYPE >=", value, "formattype");
            return (Criteria) this;
        }

        public Criteria andFormattypeLessThan(String value) {
            addCriterion("FORMATTYPE <", value, "formattype");
            return (Criteria) this;
        }

        public Criteria andFormattypeLessThanOrEqualTo(String value) {
            addCriterion("FORMATTYPE <=", value, "formattype");
            return (Criteria) this;
        }

        public Criteria andFormattypeLike(String value) {
            addCriterion("FORMATTYPE like", value, "formattype");
            return (Criteria) this;
        }

        public Criteria andFormattypeNotLike(String value) {
            addCriterion("FORMATTYPE not like", value, "formattype");
            return (Criteria) this;
        }

        public Criteria andFormattypeIn(List<String> values) {
            addCriterion("FORMATTYPE in", values, "formattype");
            return (Criteria) this;
        }

        public Criteria andFormattypeNotIn(List<String> values) {
            addCriterion("FORMATTYPE not in", values, "formattype");
            return (Criteria) this;
        }

        public Criteria andFormattypeBetween(String value1, String value2) {
            addCriterion("FORMATTYPE between", value1, value2, "formattype");
            return (Criteria) this;
        }

        public Criteria andFormattypeNotBetween(String value1, String value2) {
            addCriterion("FORMATTYPE not between", value1, value2, "formattype");
            return (Criteria) this;
        }

        public Criteria andLinetypeIsNull() {
            addCriterion("LINETYPE is null");
            return (Criteria) this;
        }

        public Criteria andLinetypeIsNotNull() {
            addCriterion("LINETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLinetypeEqualTo(String value) {
            addCriterion("LINETYPE =", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotEqualTo(String value) {
            addCriterion("LINETYPE <>", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeGreaterThan(String value) {
            addCriterion("LINETYPE >", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeGreaterThanOrEqualTo(String value) {
            addCriterion("LINETYPE >=", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLessThan(String value) {
            addCriterion("LINETYPE <", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLessThanOrEqualTo(String value) {
            addCriterion("LINETYPE <=", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLike(String value) {
            addCriterion("LINETYPE like", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotLike(String value) {
            addCriterion("LINETYPE not like", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeIn(List<String> values) {
            addCriterion("LINETYPE in", values, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotIn(List<String> values) {
            addCriterion("LINETYPE not in", values, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeBetween(String value1, String value2) {
            addCriterion("LINETYPE between", value1, value2, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotBetween(String value1, String value2) {
            addCriterion("LINETYPE not between", value1, value2, "linetype");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_format_tc
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
     * @Table : mm_format_tc
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