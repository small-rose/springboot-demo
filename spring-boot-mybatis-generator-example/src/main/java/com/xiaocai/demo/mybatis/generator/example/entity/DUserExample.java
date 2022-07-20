package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DUserExample {
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
    public DUserExample() {
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
     * @Table : d_user
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("PWD is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("PWD is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("PWD =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("PWD <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("PWD >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("PWD >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("PWD <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("PWD <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("PWD like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("PWD not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("PWD in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("PWD not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("PWD between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("PWD not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
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

        public Criteria andShortnoIsNull() {
            addCriterion("SHORTNO is null");
            return (Criteria) this;
        }

        public Criteria andShortnoIsNotNull() {
            addCriterion("SHORTNO is not null");
            return (Criteria) this;
        }

        public Criteria andShortnoEqualTo(String value) {
            addCriterion("SHORTNO =", value, "shortno");
            return (Criteria) this;
        }

        public Criteria andShortnoNotEqualTo(String value) {
            addCriterion("SHORTNO <>", value, "shortno");
            return (Criteria) this;
        }

        public Criteria andShortnoGreaterThan(String value) {
            addCriterion("SHORTNO >", value, "shortno");
            return (Criteria) this;
        }

        public Criteria andShortnoGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNO >=", value, "shortno");
            return (Criteria) this;
        }

        public Criteria andShortnoLessThan(String value) {
            addCriterion("SHORTNO <", value, "shortno");
            return (Criteria) this;
        }

        public Criteria andShortnoLessThanOrEqualTo(String value) {
            addCriterion("SHORTNO <=", value, "shortno");
            return (Criteria) this;
        }

        public Criteria andShortnoLike(String value) {
            addCriterion("SHORTNO like", value, "shortno");
            return (Criteria) this;
        }

        public Criteria andShortnoNotLike(String value) {
            addCriterion("SHORTNO not like", value, "shortno");
            return (Criteria) this;
        }

        public Criteria andShortnoIn(List<String> values) {
            addCriterion("SHORTNO in", values, "shortno");
            return (Criteria) this;
        }

        public Criteria andShortnoNotIn(List<String> values) {
            addCriterion("SHORTNO not in", values, "shortno");
            return (Criteria) this;
        }

        public Criteria andShortnoBetween(String value1, String value2) {
            addCriterion("SHORTNO between", value1, value2, "shortno");
            return (Criteria) this;
        }

        public Criteria andShortnoNotBetween(String value1, String value2) {
            addCriterion("SHORTNO not between", value1, value2, "shortno");
            return (Criteria) this;
        }

        public Criteria andIfchecktidIsNull() {
            addCriterion("IFCHECKTID is null");
            return (Criteria) this;
        }

        public Criteria andIfchecktidIsNotNull() {
            addCriterion("IFCHECKTID is not null");
            return (Criteria) this;
        }

        public Criteria andIfchecktidEqualTo(String value) {
            addCriterion("IFCHECKTID =", value, "ifchecktid");
            return (Criteria) this;
        }

        public Criteria andIfchecktidNotEqualTo(String value) {
            addCriterion("IFCHECKTID <>", value, "ifchecktid");
            return (Criteria) this;
        }

        public Criteria andIfchecktidGreaterThan(String value) {
            addCriterion("IFCHECKTID >", value, "ifchecktid");
            return (Criteria) this;
        }

        public Criteria andIfchecktidGreaterThanOrEqualTo(String value) {
            addCriterion("IFCHECKTID >=", value, "ifchecktid");
            return (Criteria) this;
        }

        public Criteria andIfchecktidLessThan(String value) {
            addCriterion("IFCHECKTID <", value, "ifchecktid");
            return (Criteria) this;
        }

        public Criteria andIfchecktidLessThanOrEqualTo(String value) {
            addCriterion("IFCHECKTID <=", value, "ifchecktid");
            return (Criteria) this;
        }

        public Criteria andIfchecktidLike(String value) {
            addCriterion("IFCHECKTID like", value, "ifchecktid");
            return (Criteria) this;
        }

        public Criteria andIfchecktidNotLike(String value) {
            addCriterion("IFCHECKTID not like", value, "ifchecktid");
            return (Criteria) this;
        }

        public Criteria andIfchecktidIn(List<String> values) {
            addCriterion("IFCHECKTID in", values, "ifchecktid");
            return (Criteria) this;
        }

        public Criteria andIfchecktidNotIn(List<String> values) {
            addCriterion("IFCHECKTID not in", values, "ifchecktid");
            return (Criteria) this;
        }

        public Criteria andIfchecktidBetween(String value1, String value2) {
            addCriterion("IFCHECKTID between", value1, value2, "ifchecktid");
            return (Criteria) this;
        }

        public Criteria andIfchecktidNotBetween(String value1, String value2) {
            addCriterion("IFCHECKTID not between", value1, value2, "ifchecktid");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("USERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("USERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(String value) {
            addCriterion("USERTYPE =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(String value) {
            addCriterion("USERTYPE <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(String value) {
            addCriterion("USERTYPE >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(String value) {
            addCriterion("USERTYPE >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(String value) {
            addCriterion("USERTYPE <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(String value) {
            addCriterion("USERTYPE <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLike(String value) {
            addCriterion("USERTYPE like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotLike(String value) {
            addCriterion("USERTYPE not like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<String> values) {
            addCriterion("USERTYPE in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<String> values) {
            addCriterion("USERTYPE not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(String value1, String value2) {
            addCriterion("USERTYPE between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(String value1, String value2) {
            addCriterion("USERTYPE not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoIsNull() {
            addCriterion("IFCHECKINSUREMIDNO is null");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoIsNotNull() {
            addCriterion("IFCHECKINSUREMIDNO is not null");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoEqualTo(String value) {
            addCriterion("IFCHECKINSUREMIDNO =", value, "ifcheckinsuremidno");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoNotEqualTo(String value) {
            addCriterion("IFCHECKINSUREMIDNO <>", value, "ifcheckinsuremidno");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoGreaterThan(String value) {
            addCriterion("IFCHECKINSUREMIDNO >", value, "ifcheckinsuremidno");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoGreaterThanOrEqualTo(String value) {
            addCriterion("IFCHECKINSUREMIDNO >=", value, "ifcheckinsuremidno");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoLessThan(String value) {
            addCriterion("IFCHECKINSUREMIDNO <", value, "ifcheckinsuremidno");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoLessThanOrEqualTo(String value) {
            addCriterion("IFCHECKINSUREMIDNO <=", value, "ifcheckinsuremidno");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoLike(String value) {
            addCriterion("IFCHECKINSUREMIDNO like", value, "ifcheckinsuremidno");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoNotLike(String value) {
            addCriterion("IFCHECKINSUREMIDNO not like", value, "ifcheckinsuremidno");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoIn(List<String> values) {
            addCriterion("IFCHECKINSUREMIDNO in", values, "ifcheckinsuremidno");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoNotIn(List<String> values) {
            addCriterion("IFCHECKINSUREMIDNO not in", values, "ifcheckinsuremidno");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoBetween(String value1, String value2) {
            addCriterion("IFCHECKINSUREMIDNO between", value1, value2, "ifcheckinsuremidno");
            return (Criteria) this;
        }

        public Criteria andIfcheckinsuremidnoNotBetween(String value1, String value2) {
            addCriterion("IFCHECKINSUREMIDNO not between", value1, value2, "ifcheckinsuremidno");
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

        public Criteria andIfchecksubcompanyIsNull() {
            addCriterion("IFCHECKSUBCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyIsNotNull() {
            addCriterion("IFCHECKSUBCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyEqualTo(String value) {
            addCriterion("IFCHECKSUBCOMPANY =", value, "ifchecksubcompany");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyNotEqualTo(String value) {
            addCriterion("IFCHECKSUBCOMPANY <>", value, "ifchecksubcompany");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyGreaterThan(String value) {
            addCriterion("IFCHECKSUBCOMPANY >", value, "ifchecksubcompany");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("IFCHECKSUBCOMPANY >=", value, "ifchecksubcompany");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyLessThan(String value) {
            addCriterion("IFCHECKSUBCOMPANY <", value, "ifchecksubcompany");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyLessThanOrEqualTo(String value) {
            addCriterion("IFCHECKSUBCOMPANY <=", value, "ifchecksubcompany");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyLike(String value) {
            addCriterion("IFCHECKSUBCOMPANY like", value, "ifchecksubcompany");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyNotLike(String value) {
            addCriterion("IFCHECKSUBCOMPANY not like", value, "ifchecksubcompany");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyIn(List<String> values) {
            addCriterion("IFCHECKSUBCOMPANY in", values, "ifchecksubcompany");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyNotIn(List<String> values) {
            addCriterion("IFCHECKSUBCOMPANY not in", values, "ifchecksubcompany");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyBetween(String value1, String value2) {
            addCriterion("IFCHECKSUBCOMPANY between", value1, value2, "ifchecksubcompany");
            return (Criteria) this;
        }

        public Criteria andIfchecksubcompanyNotBetween(String value1, String value2) {
            addCriterion("IFCHECKSUBCOMPANY not between", value1, value2, "ifchecksubcompany");
            return (Criteria) this;
        }

        public Criteria andSignkeyIsNull() {
            addCriterion("SIGNKEY is null");
            return (Criteria) this;
        }

        public Criteria andSignkeyIsNotNull() {
            addCriterion("SIGNKEY is not null");
            return (Criteria) this;
        }

        public Criteria andSignkeyEqualTo(String value) {
            addCriterion("SIGNKEY =", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyNotEqualTo(String value) {
            addCriterion("SIGNKEY <>", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyGreaterThan(String value) {
            addCriterion("SIGNKEY >", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNKEY >=", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyLessThan(String value) {
            addCriterion("SIGNKEY <", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyLessThanOrEqualTo(String value) {
            addCriterion("SIGNKEY <=", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyLike(String value) {
            addCriterion("SIGNKEY like", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyNotLike(String value) {
            addCriterion("SIGNKEY not like", value, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyIn(List<String> values) {
            addCriterion("SIGNKEY in", values, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyNotIn(List<String> values) {
            addCriterion("SIGNKEY not in", values, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyBetween(String value1, String value2) {
            addCriterion("SIGNKEY between", value1, value2, "signkey");
            return (Criteria) this;
        }

        public Criteria andSignkeyNotBetween(String value1, String value2) {
            addCriterion("SIGNKEY not between", value1, value2, "signkey");
            return (Criteria) this;
        }

        public Criteria andSigntypeIsNull() {
            addCriterion("SIGNTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSigntypeIsNotNull() {
            addCriterion("SIGNTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSigntypeEqualTo(String value) {
            addCriterion("SIGNTYPE =", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotEqualTo(String value) {
            addCriterion("SIGNTYPE <>", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeGreaterThan(String value) {
            addCriterion("SIGNTYPE >", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNTYPE >=", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLessThan(String value) {
            addCriterion("SIGNTYPE <", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLessThanOrEqualTo(String value) {
            addCriterion("SIGNTYPE <=", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLike(String value) {
            addCriterion("SIGNTYPE like", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotLike(String value) {
            addCriterion("SIGNTYPE not like", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeIn(List<String> values) {
            addCriterion("SIGNTYPE in", values, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotIn(List<String> values) {
            addCriterion("SIGNTYPE not in", values, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeBetween(String value1, String value2) {
            addCriterion("SIGNTYPE between", value1, value2, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotBetween(String value1, String value2) {
            addCriterion("SIGNTYPE not between", value1, value2, "signtype");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeIsNull() {
            addCriterion("IFCHECKUNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeIsNotNull() {
            addCriterion("IFCHECKUNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeEqualTo(String value) {
            addCriterion("IFCHECKUNITCODE =", value, "ifcheckunitcode");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeNotEqualTo(String value) {
            addCriterion("IFCHECKUNITCODE <>", value, "ifcheckunitcode");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeGreaterThan(String value) {
            addCriterion("IFCHECKUNITCODE >", value, "ifcheckunitcode");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("IFCHECKUNITCODE >=", value, "ifcheckunitcode");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeLessThan(String value) {
            addCriterion("IFCHECKUNITCODE <", value, "ifcheckunitcode");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeLessThanOrEqualTo(String value) {
            addCriterion("IFCHECKUNITCODE <=", value, "ifcheckunitcode");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeLike(String value) {
            addCriterion("IFCHECKUNITCODE like", value, "ifcheckunitcode");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeNotLike(String value) {
            addCriterion("IFCHECKUNITCODE not like", value, "ifcheckunitcode");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeIn(List<String> values) {
            addCriterion("IFCHECKUNITCODE in", values, "ifcheckunitcode");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeNotIn(List<String> values) {
            addCriterion("IFCHECKUNITCODE not in", values, "ifcheckunitcode");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeBetween(String value1, String value2) {
            addCriterion("IFCHECKUNITCODE between", value1, value2, "ifcheckunitcode");
            return (Criteria) this;
        }

        public Criteria andIfcheckunitcodeNotBetween(String value1, String value2) {
            addCriterion("IFCHECKUNITCODE not between", value1, value2, "ifcheckunitcode");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : d_user
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
     * @Table : d_user
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