package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.List;

public class SapCodeMappingExample {
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
    public SapCodeMappingExample() {
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
     * @Table : sap_code_mapping
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

        public Criteria andTypenameIsNull() {
            addCriterion("TYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("TYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("TYPENAME =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("TYPENAME <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("TYPENAME >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("TYPENAME >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("TYPENAME <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("TYPENAME <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("TYPENAME like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("TYPENAME not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("TYPENAME in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("TYPENAME not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("TYPENAME between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("TYPENAME not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andSapCodeIsNull() {
            addCriterion("SAP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSapCodeIsNotNull() {
            addCriterion("SAP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSapCodeEqualTo(String value) {
            addCriterion("SAP_CODE =", value, "sapCode");
            return (Criteria) this;
        }

        public Criteria andSapCodeNotEqualTo(String value) {
            addCriterion("SAP_CODE <>", value, "sapCode");
            return (Criteria) this;
        }

        public Criteria andSapCodeGreaterThan(String value) {
            addCriterion("SAP_CODE >", value, "sapCode");
            return (Criteria) this;
        }

        public Criteria andSapCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SAP_CODE >=", value, "sapCode");
            return (Criteria) this;
        }

        public Criteria andSapCodeLessThan(String value) {
            addCriterion("SAP_CODE <", value, "sapCode");
            return (Criteria) this;
        }

        public Criteria andSapCodeLessThanOrEqualTo(String value) {
            addCriterion("SAP_CODE <=", value, "sapCode");
            return (Criteria) this;
        }

        public Criteria andSapCodeLike(String value) {
            addCriterion("SAP_CODE like", value, "sapCode");
            return (Criteria) this;
        }

        public Criteria andSapCodeNotLike(String value) {
            addCriterion("SAP_CODE not like", value, "sapCode");
            return (Criteria) this;
        }

        public Criteria andSapCodeIn(List<String> values) {
            addCriterion("SAP_CODE in", values, "sapCode");
            return (Criteria) this;
        }

        public Criteria andSapCodeNotIn(List<String> values) {
            addCriterion("SAP_CODE not in", values, "sapCode");
            return (Criteria) this;
        }

        public Criteria andSapCodeBetween(String value1, String value2) {
            addCriterion("SAP_CODE between", value1, value2, "sapCode");
            return (Criteria) this;
        }

        public Criteria andSapCodeNotBetween(String value1, String value2) {
            addCriterion("SAP_CODE not between", value1, value2, "sapCode");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeIsNull() {
            addCriterion("TMNCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeIsNotNull() {
            addCriterion("TMNCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeEqualTo(String value) {
            addCriterion("TMNCH_CODE =", value, "tmnchCode");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeNotEqualTo(String value) {
            addCriterion("TMNCH_CODE <>", value, "tmnchCode");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeGreaterThan(String value) {
            addCriterion("TMNCH_CODE >", value, "tmnchCode");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TMNCH_CODE >=", value, "tmnchCode");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeLessThan(String value) {
            addCriterion("TMNCH_CODE <", value, "tmnchCode");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeLessThanOrEqualTo(String value) {
            addCriterion("TMNCH_CODE <=", value, "tmnchCode");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeLike(String value) {
            addCriterion("TMNCH_CODE like", value, "tmnchCode");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeNotLike(String value) {
            addCriterion("TMNCH_CODE not like", value, "tmnchCode");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeIn(List<String> values) {
            addCriterion("TMNCH_CODE in", values, "tmnchCode");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeNotIn(List<String> values) {
            addCriterion("TMNCH_CODE not in", values, "tmnchCode");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeBetween(String value1, String value2) {
            addCriterion("TMNCH_CODE between", value1, value2, "tmnchCode");
            return (Criteria) this;
        }

        public Criteria andTmnchCodeNotBetween(String value1, String value2) {
            addCriterion("TMNCH_CODE not between", value1, value2, "tmnchCode");
            return (Criteria) this;
        }

        public Criteria andFree1IsNull() {
            addCriterion("FREE1 is null");
            return (Criteria) this;
        }

        public Criteria andFree1IsNotNull() {
            addCriterion("FREE1 is not null");
            return (Criteria) this;
        }

        public Criteria andFree1EqualTo(String value) {
            addCriterion("FREE1 =", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1NotEqualTo(String value) {
            addCriterion("FREE1 <>", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1GreaterThan(String value) {
            addCriterion("FREE1 >", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1GreaterThanOrEqualTo(String value) {
            addCriterion("FREE1 >=", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1LessThan(String value) {
            addCriterion("FREE1 <", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1LessThanOrEqualTo(String value) {
            addCriterion("FREE1 <=", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1Like(String value) {
            addCriterion("FREE1 like", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1NotLike(String value) {
            addCriterion("FREE1 not like", value, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1In(List<String> values) {
            addCriterion("FREE1 in", values, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1NotIn(List<String> values) {
            addCriterion("FREE1 not in", values, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1Between(String value1, String value2) {
            addCriterion("FREE1 between", value1, value2, "free1");
            return (Criteria) this;
        }

        public Criteria andFree1NotBetween(String value1, String value2) {
            addCriterion("FREE1 not between", value1, value2, "free1");
            return (Criteria) this;
        }

        public Criteria andFree2IsNull() {
            addCriterion("FREE2 is null");
            return (Criteria) this;
        }

        public Criteria andFree2IsNotNull() {
            addCriterion("FREE2 is not null");
            return (Criteria) this;
        }

        public Criteria andFree2EqualTo(String value) {
            addCriterion("FREE2 =", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2NotEqualTo(String value) {
            addCriterion("FREE2 <>", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2GreaterThan(String value) {
            addCriterion("FREE2 >", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2GreaterThanOrEqualTo(String value) {
            addCriterion("FREE2 >=", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2LessThan(String value) {
            addCriterion("FREE2 <", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2LessThanOrEqualTo(String value) {
            addCriterion("FREE2 <=", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2Like(String value) {
            addCriterion("FREE2 like", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2NotLike(String value) {
            addCriterion("FREE2 not like", value, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2In(List<String> values) {
            addCriterion("FREE2 in", values, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2NotIn(List<String> values) {
            addCriterion("FREE2 not in", values, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2Between(String value1, String value2) {
            addCriterion("FREE2 between", value1, value2, "free2");
            return (Criteria) this;
        }

        public Criteria andFree2NotBetween(String value1, String value2) {
            addCriterion("FREE2 not between", value1, value2, "free2");
            return (Criteria) this;
        }

        public Criteria andCodedescIsNull() {
            addCriterion("CODEDESC is null");
            return (Criteria) this;
        }

        public Criteria andCodedescIsNotNull() {
            addCriterion("CODEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andCodedescEqualTo(String value) {
            addCriterion("CODEDESC =", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotEqualTo(String value) {
            addCriterion("CODEDESC <>", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescGreaterThan(String value) {
            addCriterion("CODEDESC >", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescGreaterThanOrEqualTo(String value) {
            addCriterion("CODEDESC >=", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescLessThan(String value) {
            addCriterion("CODEDESC <", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescLessThanOrEqualTo(String value) {
            addCriterion("CODEDESC <=", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescLike(String value) {
            addCriterion("CODEDESC like", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotLike(String value) {
            addCriterion("CODEDESC not like", value, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescIn(List<String> values) {
            addCriterion("CODEDESC in", values, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotIn(List<String> values) {
            addCriterion("CODEDESC not in", values, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescBetween(String value1, String value2) {
            addCriterion("CODEDESC between", value1, value2, "codedesc");
            return (Criteria) this;
        }

        public Criteria andCodedescNotBetween(String value1, String value2) {
            addCriterion("CODEDESC not between", value1, value2, "codedesc");
            return (Criteria) this;
        }

        public Criteria andFree3IsNull() {
            addCriterion("FREE3 is null");
            return (Criteria) this;
        }

        public Criteria andFree3IsNotNull() {
            addCriterion("FREE3 is not null");
            return (Criteria) this;
        }

        public Criteria andFree3EqualTo(String value) {
            addCriterion("FREE3 =", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3NotEqualTo(String value) {
            addCriterion("FREE3 <>", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3GreaterThan(String value) {
            addCriterion("FREE3 >", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3GreaterThanOrEqualTo(String value) {
            addCriterion("FREE3 >=", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3LessThan(String value) {
            addCriterion("FREE3 <", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3LessThanOrEqualTo(String value) {
            addCriterion("FREE3 <=", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3Like(String value) {
            addCriterion("FREE3 like", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3NotLike(String value) {
            addCriterion("FREE3 not like", value, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3In(List<String> values) {
            addCriterion("FREE3 in", values, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3NotIn(List<String> values) {
            addCriterion("FREE3 not in", values, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3Between(String value1, String value2) {
            addCriterion("FREE3 between", value1, value2, "free3");
            return (Criteria) this;
        }

        public Criteria andFree3NotBetween(String value1, String value2) {
            addCriterion("FREE3 not between", value1, value2, "free3");
            return (Criteria) this;
        }

        public Criteria andFree4IsNull() {
            addCriterion("FREE4 is null");
            return (Criteria) this;
        }

        public Criteria andFree4IsNotNull() {
            addCriterion("FREE4 is not null");
            return (Criteria) this;
        }

        public Criteria andFree4EqualTo(String value) {
            addCriterion("FREE4 =", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4NotEqualTo(String value) {
            addCriterion("FREE4 <>", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4GreaterThan(String value) {
            addCriterion("FREE4 >", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4GreaterThanOrEqualTo(String value) {
            addCriterion("FREE4 >=", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4LessThan(String value) {
            addCriterion("FREE4 <", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4LessThanOrEqualTo(String value) {
            addCriterion("FREE4 <=", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4Like(String value) {
            addCriterion("FREE4 like", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4NotLike(String value) {
            addCriterion("FREE4 not like", value, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4In(List<String> values) {
            addCriterion("FREE4 in", values, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4NotIn(List<String> values) {
            addCriterion("FREE4 not in", values, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4Between(String value1, String value2) {
            addCriterion("FREE4 between", value1, value2, "free4");
            return (Criteria) this;
        }

        public Criteria andFree4NotBetween(String value1, String value2) {
            addCriterion("FREE4 not between", value1, value2, "free4");
            return (Criteria) this;
        }

        public Criteria andFree5IsNull() {
            addCriterion("FREE5 is null");
            return (Criteria) this;
        }

        public Criteria andFree5IsNotNull() {
            addCriterion("FREE5 is not null");
            return (Criteria) this;
        }

        public Criteria andFree5EqualTo(String value) {
            addCriterion("FREE5 =", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5NotEqualTo(String value) {
            addCriterion("FREE5 <>", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5GreaterThan(String value) {
            addCriterion("FREE5 >", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5GreaterThanOrEqualTo(String value) {
            addCriterion("FREE5 >=", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5LessThan(String value) {
            addCriterion("FREE5 <", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5LessThanOrEqualTo(String value) {
            addCriterion("FREE5 <=", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5Like(String value) {
            addCriterion("FREE5 like", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5NotLike(String value) {
            addCriterion("FREE5 not like", value, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5In(List<String> values) {
            addCriterion("FREE5 in", values, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5NotIn(List<String> values) {
            addCriterion("FREE5 not in", values, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5Between(String value1, String value2) {
            addCriterion("FREE5 between", value1, value2, "free5");
            return (Criteria) this;
        }

        public Criteria andFree5NotBetween(String value1, String value2) {
            addCriterion("FREE5 not between", value1, value2, "free5");
            return (Criteria) this;
        }

        public Criteria andFree6IsNull() {
            addCriterion("FREE6 is null");
            return (Criteria) this;
        }

        public Criteria andFree6IsNotNull() {
            addCriterion("FREE6 is not null");
            return (Criteria) this;
        }

        public Criteria andFree6EqualTo(String value) {
            addCriterion("FREE6 =", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6NotEqualTo(String value) {
            addCriterion("FREE6 <>", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6GreaterThan(String value) {
            addCriterion("FREE6 >", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6GreaterThanOrEqualTo(String value) {
            addCriterion("FREE6 >=", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6LessThan(String value) {
            addCriterion("FREE6 <", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6LessThanOrEqualTo(String value) {
            addCriterion("FREE6 <=", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6Like(String value) {
            addCriterion("FREE6 like", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6NotLike(String value) {
            addCriterion("FREE6 not like", value, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6In(List<String> values) {
            addCriterion("FREE6 in", values, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6NotIn(List<String> values) {
            addCriterion("FREE6 not in", values, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6Between(String value1, String value2) {
            addCriterion("FREE6 between", value1, value2, "free6");
            return (Criteria) this;
        }

        public Criteria andFree6NotBetween(String value1, String value2) {
            addCriterion("FREE6 not between", value1, value2, "free6");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : sap_code_mapping
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
     * @Table : sap_code_mapping
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