package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.List;

public class MmAccAddTdExample {
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
    public MmAccAddTdExample() {
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
     * @Table : mm_acc_add_td
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

        public Criteria andSeqnoIsNull() {
            addCriterion("SEQNO is null");
            return (Criteria) this;
        }

        public Criteria andSeqnoIsNotNull() {
            addCriterion("SEQNO is not null");
            return (Criteria) this;
        }

        public Criteria andSeqnoEqualTo(Long value) {
            addCriterion("SEQNO =", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotEqualTo(Long value) {
            addCriterion("SEQNO <>", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThan(Long value) {
            addCriterion("SEQNO >", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQNO >=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThan(Long value) {
            addCriterion("SEQNO <", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoLessThanOrEqualTo(Long value) {
            addCriterion("SEQNO <=", value, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoIn(List<Long> values) {
            addCriterion("SEQNO in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotIn(List<Long> values) {
            addCriterion("SEQNO not in", values, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoBetween(Long value1, Long value2) {
            addCriterion("SEQNO between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andSeqnoNotBetween(Long value1, Long value2) {
            addCriterion("SEQNO not between", value1, value2, "seqno");
            return (Criteria) this;
        }

        public Criteria andSourcetableIsNull() {
            addCriterion("SOURCETABLE is null");
            return (Criteria) this;
        }

        public Criteria andSourcetableIsNotNull() {
            addCriterion("SOURCETABLE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetableEqualTo(String value) {
            addCriterion("SOURCETABLE =", value, "sourcetable");
            return (Criteria) this;
        }

        public Criteria andSourcetableNotEqualTo(String value) {
            addCriterion("SOURCETABLE <>", value, "sourcetable");
            return (Criteria) this;
        }

        public Criteria andSourcetableGreaterThan(String value) {
            addCriterion("SOURCETABLE >", value, "sourcetable");
            return (Criteria) this;
        }

        public Criteria andSourcetableGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCETABLE >=", value, "sourcetable");
            return (Criteria) this;
        }

        public Criteria andSourcetableLessThan(String value) {
            addCriterion("SOURCETABLE <", value, "sourcetable");
            return (Criteria) this;
        }

        public Criteria andSourcetableLessThanOrEqualTo(String value) {
            addCriterion("SOURCETABLE <=", value, "sourcetable");
            return (Criteria) this;
        }

        public Criteria andSourcetableLike(String value) {
            addCriterion("SOURCETABLE like", value, "sourcetable");
            return (Criteria) this;
        }

        public Criteria andSourcetableNotLike(String value) {
            addCriterion("SOURCETABLE not like", value, "sourcetable");
            return (Criteria) this;
        }

        public Criteria andSourcetableIn(List<String> values) {
            addCriterion("SOURCETABLE in", values, "sourcetable");
            return (Criteria) this;
        }

        public Criteria andSourcetableNotIn(List<String> values) {
            addCriterion("SOURCETABLE not in", values, "sourcetable");
            return (Criteria) this;
        }

        public Criteria andSourcetableBetween(String value1, String value2) {
            addCriterion("SOURCETABLE between", value1, value2, "sourcetable");
            return (Criteria) this;
        }

        public Criteria andSourcetableNotBetween(String value1, String value2) {
            addCriterion("SOURCETABLE not between", value1, value2, "sourcetable");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNull() {
            addCriterion("CLASSESCODE is null");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNotNull() {
            addCriterion("CLASSESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andClassescodeEqualTo(String value) {
            addCriterion("CLASSESCODE =", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotEqualTo(String value) {
            addCriterion("CLASSESCODE <>", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThan(String value) {
            addCriterion("CLASSESCODE >", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSESCODE >=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThan(String value) {
            addCriterion("CLASSESCODE <", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThanOrEqualTo(String value) {
            addCriterion("CLASSESCODE <=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLike(String value) {
            addCriterion("CLASSESCODE like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotLike(String value) {
            addCriterion("CLASSESCODE not like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeIn(List<String> values) {
            addCriterion("CLASSESCODE in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotIn(List<String> values) {
            addCriterion("CLASSESCODE not in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeBetween(String value1, String value2) {
            addCriterion("CLASSESCODE between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotBetween(String value1, String value2) {
            addCriterion("CLASSESCODE not between", value1, value2, "classescode");
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

        public Criteria andFarmflagIsNull() {
            addCriterion("FARMFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFarmflagIsNotNull() {
            addCriterion("FARMFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFarmflagEqualTo(String value) {
            addCriterion("FARMFLAG =", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotEqualTo(String value) {
            addCriterion("FARMFLAG <>", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagGreaterThan(String value) {
            addCriterion("FARMFLAG >", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagGreaterThanOrEqualTo(String value) {
            addCriterion("FARMFLAG >=", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLessThan(String value) {
            addCriterion("FARMFLAG <", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLessThanOrEqualTo(String value) {
            addCriterion("FARMFLAG <=", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLike(String value) {
            addCriterion("FARMFLAG like", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotLike(String value) {
            addCriterion("FARMFLAG not like", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagIn(List<String> values) {
            addCriterion("FARMFLAG in", values, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotIn(List<String> values) {
            addCriterion("FARMFLAG not in", values, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagBetween(String value1, String value2) {
            addCriterion("FARMFLAG between", value1, value2, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotBetween(String value1, String value2) {
            addCriterion("FARMFLAG not between", value1, value2, "farmflag");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentIsNull() {
            addCriterion("PROJECTSEGMENT is null");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentIsNotNull() {
            addCriterion("PROJECTSEGMENT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentEqualTo(String value) {
            addCriterion("PROJECTSEGMENT =", value, "projectsegment");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentNotEqualTo(String value) {
            addCriterion("PROJECTSEGMENT <>", value, "projectsegment");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentGreaterThan(String value) {
            addCriterion("PROJECTSEGMENT >", value, "projectsegment");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTSEGMENT >=", value, "projectsegment");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentLessThan(String value) {
            addCriterion("PROJECTSEGMENT <", value, "projectsegment");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentLessThanOrEqualTo(String value) {
            addCriterion("PROJECTSEGMENT <=", value, "projectsegment");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentLike(String value) {
            addCriterion("PROJECTSEGMENT like", value, "projectsegment");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentNotLike(String value) {
            addCriterion("PROJECTSEGMENT not like", value, "projectsegment");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentIn(List<String> values) {
            addCriterion("PROJECTSEGMENT in", values, "projectsegment");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentNotIn(List<String> values) {
            addCriterion("PROJECTSEGMENT not in", values, "projectsegment");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentBetween(String value1, String value2) {
            addCriterion("PROJECTSEGMENT between", value1, value2, "projectsegment");
            return (Criteria) this;
        }

        public Criteria andProjectsegmentNotBetween(String value1, String value2) {
            addCriterion("PROJECTSEGMENT not between", value1, value2, "projectsegment");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeIsNull() {
            addCriterion("SERVICEUNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeIsNotNull() {
            addCriterion("SERVICEUNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeEqualTo(String value) {
            addCriterion("SERVICEUNITCODE =", value, "serviceunitcode");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeNotEqualTo(String value) {
            addCriterion("SERVICEUNITCODE <>", value, "serviceunitcode");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeGreaterThan(String value) {
            addCriterion("SERVICEUNITCODE >", value, "serviceunitcode");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICEUNITCODE >=", value, "serviceunitcode");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeLessThan(String value) {
            addCriterion("SERVICEUNITCODE <", value, "serviceunitcode");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeLessThanOrEqualTo(String value) {
            addCriterion("SERVICEUNITCODE <=", value, "serviceunitcode");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeLike(String value) {
            addCriterion("SERVICEUNITCODE like", value, "serviceunitcode");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeNotLike(String value) {
            addCriterion("SERVICEUNITCODE not like", value, "serviceunitcode");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeIn(List<String> values) {
            addCriterion("SERVICEUNITCODE in", values, "serviceunitcode");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeNotIn(List<String> values) {
            addCriterion("SERVICEUNITCODE not in", values, "serviceunitcode");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeBetween(String value1, String value2) {
            addCriterion("SERVICEUNITCODE between", value1, value2, "serviceunitcode");
            return (Criteria) this;
        }

        public Criteria andServiceunitcodeNotBetween(String value1, String value2) {
            addCriterion("SERVICEUNITCODE not between", value1, value2, "serviceunitcode");
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

        public Criteria andIssplittedIsNull() {
            addCriterion("ISSPLITTED is null");
            return (Criteria) this;
        }

        public Criteria andIssplittedIsNotNull() {
            addCriterion("ISSPLITTED is not null");
            return (Criteria) this;
        }

        public Criteria andIssplittedEqualTo(String value) {
            addCriterion("ISSPLITTED =", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotEqualTo(String value) {
            addCriterion("ISSPLITTED <>", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThan(String value) {
            addCriterion("ISSPLITTED >", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThanOrEqualTo(String value) {
            addCriterion("ISSPLITTED >=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThan(String value) {
            addCriterion("ISSPLITTED <", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThanOrEqualTo(String value) {
            addCriterion("ISSPLITTED <=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLike(String value) {
            addCriterion("ISSPLITTED like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotLike(String value) {
            addCriterion("ISSPLITTED not like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedIn(List<String> values) {
            addCriterion("ISSPLITTED in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotIn(List<String> values) {
            addCriterion("ISSPLITTED not in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedBetween(String value1, String value2) {
            addCriterion("ISSPLITTED between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotBetween(String value1, String value2) {
            addCriterion("ISSPLITTED not between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIsNull() {
            addCriterion("FARMFLAGCODE is null");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIsNotNull() {
            addCriterion("FARMFLAGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeEqualTo(String value) {
            addCriterion("FARMFLAGCODE =", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotEqualTo(String value) {
            addCriterion("FARMFLAGCODE <>", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeGreaterThan(String value) {
            addCriterion("FARMFLAGCODE >", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FARMFLAGCODE >=", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLessThan(String value) {
            addCriterion("FARMFLAGCODE <", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLessThanOrEqualTo(String value) {
            addCriterion("FARMFLAGCODE <=", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLike(String value) {
            addCriterion("FARMFLAGCODE like", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotLike(String value) {
            addCriterion("FARMFLAGCODE not like", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIn(List<String> values) {
            addCriterion("FARMFLAGCODE in", values, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotIn(List<String> values) {
            addCriterion("FARMFLAGCODE not in", values, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeBetween(String value1, String value2) {
            addCriterion("FARMFLAGCODE between", value1, value2, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotBetween(String value1, String value2) {
            addCriterion("FARMFLAGCODE not between", value1, value2, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIsNull() {
            addCriterion("USEPORPERTY is null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIsNotNull() {
            addCriterion("USEPORPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyEqualTo(String value) {
            addCriterion("USEPORPERTY =", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotEqualTo(String value) {
            addCriterion("USEPORPERTY <>", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThan(String value) {
            addCriterion("USEPORPERTY >", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThanOrEqualTo(String value) {
            addCriterion("USEPORPERTY >=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThan(String value) {
            addCriterion("USEPORPERTY <", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThanOrEqualTo(String value) {
            addCriterion("USEPORPERTY <=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLike(String value) {
            addCriterion("USEPORPERTY like", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotLike(String value) {
            addCriterion("USEPORPERTY not like", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIn(List<String> values) {
            addCriterion("USEPORPERTY in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotIn(List<String> values) {
            addCriterion("USEPORPERTY not in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyBetween(String value1, String value2) {
            addCriterion("USEPORPERTY between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotBetween(String value1, String value2) {
            addCriterion("USEPORPERTY not between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIsNull() {
            addCriterion("FARPOLICYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIsNotNull() {
            addCriterion("FARPOLICYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeEqualTo(String value) {
            addCriterion("FARPOLICYTYPE =", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotEqualTo(String value) {
            addCriterion("FARPOLICYTYPE <>", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeGreaterThan(String value) {
            addCriterion("FARPOLICYTYPE >", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeGreaterThanOrEqualTo(String value) {
            addCriterion("FARPOLICYTYPE >=", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLessThan(String value) {
            addCriterion("FARPOLICYTYPE <", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLessThanOrEqualTo(String value) {
            addCriterion("FARPOLICYTYPE <=", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLike(String value) {
            addCriterion("FARPOLICYTYPE like", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotLike(String value) {
            addCriterion("FARPOLICYTYPE not like", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIn(List<String> values) {
            addCriterion("FARPOLICYTYPE in", values, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotIn(List<String> values) {
            addCriterion("FARPOLICYTYPE not in", values, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeBetween(String value1, String value2) {
            addCriterion("FARPOLICYTYPE between", value1, value2, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotBetween(String value1, String value2) {
            addCriterion("FARPOLICYTYPE not between", value1, value2, "farpolicytype");
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

        public Criteria andSegment6IsNull() {
            addCriterion("SEGMENT6 is null");
            return (Criteria) this;
        }

        public Criteria andSegment6IsNotNull() {
            addCriterion("SEGMENT6 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment6EqualTo(String value) {
            addCriterion("SEGMENT6 =", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotEqualTo(String value) {
            addCriterion("SEGMENT6 <>", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6GreaterThan(String value) {
            addCriterion("SEGMENT6 >", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT6 >=", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6LessThan(String value) {
            addCriterion("SEGMENT6 <", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT6 <=", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6Like(String value) {
            addCriterion("SEGMENT6 like", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotLike(String value) {
            addCriterion("SEGMENT6 not like", value, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6In(List<String> values) {
            addCriterion("SEGMENT6 in", values, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotIn(List<String> values) {
            addCriterion("SEGMENT6 not in", values, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6Between(String value1, String value2) {
            addCriterion("SEGMENT6 between", value1, value2, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment6NotBetween(String value1, String value2) {
            addCriterion("SEGMENT6 not between", value1, value2, "segment6");
            return (Criteria) this;
        }

        public Criteria andSegment7IsNull() {
            addCriterion("SEGMENT7 is null");
            return (Criteria) this;
        }

        public Criteria andSegment7IsNotNull() {
            addCriterion("SEGMENT7 is not null");
            return (Criteria) this;
        }

        public Criteria andSegment7EqualTo(String value) {
            addCriterion("SEGMENT7 =", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotEqualTo(String value) {
            addCriterion("SEGMENT7 <>", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7GreaterThan(String value) {
            addCriterion("SEGMENT7 >", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7GreaterThanOrEqualTo(String value) {
            addCriterion("SEGMENT7 >=", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7LessThan(String value) {
            addCriterion("SEGMENT7 <", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7LessThanOrEqualTo(String value) {
            addCriterion("SEGMENT7 <=", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7Like(String value) {
            addCriterion("SEGMENT7 like", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotLike(String value) {
            addCriterion("SEGMENT7 not like", value, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7In(List<String> values) {
            addCriterion("SEGMENT7 in", values, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotIn(List<String> values) {
            addCriterion("SEGMENT7 not in", values, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7Between(String value1, String value2) {
            addCriterion("SEGMENT7 between", value1, value2, "segment7");
            return (Criteria) this;
        }

        public Criteria andSegment7NotBetween(String value1, String value2) {
            addCriterion("SEGMENT7 not between", value1, value2, "segment7");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_acc_add_td
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
     * @Table : mm_acc_add_td
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