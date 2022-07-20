package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmBatchtaskTdExample {
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
    public MmBatchtaskTdExample() {
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
     * @Table : mm_batchtask_td
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

        public Criteria andBatchtaskidIsNull() {
            addCriterion("BATCHTASKID is null");
            return (Criteria) this;
        }

        public Criteria andBatchtaskidIsNotNull() {
            addCriterion("BATCHTASKID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchtaskidEqualTo(Long value) {
            addCriterion("BATCHTASKID =", value, "batchtaskid");
            return (Criteria) this;
        }

        public Criteria andBatchtaskidNotEqualTo(Long value) {
            addCriterion("BATCHTASKID <>", value, "batchtaskid");
            return (Criteria) this;
        }

        public Criteria andBatchtaskidGreaterThan(Long value) {
            addCriterion("BATCHTASKID >", value, "batchtaskid");
            return (Criteria) this;
        }

        public Criteria andBatchtaskidGreaterThanOrEqualTo(Long value) {
            addCriterion("BATCHTASKID >=", value, "batchtaskid");
            return (Criteria) this;
        }

        public Criteria andBatchtaskidLessThan(Long value) {
            addCriterion("BATCHTASKID <", value, "batchtaskid");
            return (Criteria) this;
        }

        public Criteria andBatchtaskidLessThanOrEqualTo(Long value) {
            addCriterion("BATCHTASKID <=", value, "batchtaskid");
            return (Criteria) this;
        }

        public Criteria andBatchtaskidIn(List<Long> values) {
            addCriterion("BATCHTASKID in", values, "batchtaskid");
            return (Criteria) this;
        }

        public Criteria andBatchtaskidNotIn(List<Long> values) {
            addCriterion("BATCHTASKID not in", values, "batchtaskid");
            return (Criteria) this;
        }

        public Criteria andBatchtaskidBetween(Long value1, Long value2) {
            addCriterion("BATCHTASKID between", value1, value2, "batchtaskid");
            return (Criteria) this;
        }

        public Criteria andBatchtaskidNotBetween(Long value1, Long value2) {
            addCriterion("BATCHTASKID not between", value1, value2, "batchtaskid");
            return (Criteria) this;
        }

        public Criteria andJobclassnameIsNull() {
            addCriterion("JOBCLASSNAME is null");
            return (Criteria) this;
        }

        public Criteria andJobclassnameIsNotNull() {
            addCriterion("JOBCLASSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobclassnameEqualTo(String value) {
            addCriterion("JOBCLASSNAME =", value, "jobclassname");
            return (Criteria) this;
        }

        public Criteria andJobclassnameNotEqualTo(String value) {
            addCriterion("JOBCLASSNAME <>", value, "jobclassname");
            return (Criteria) this;
        }

        public Criteria andJobclassnameGreaterThan(String value) {
            addCriterion("JOBCLASSNAME >", value, "jobclassname");
            return (Criteria) this;
        }

        public Criteria andJobclassnameGreaterThanOrEqualTo(String value) {
            addCriterion("JOBCLASSNAME >=", value, "jobclassname");
            return (Criteria) this;
        }

        public Criteria andJobclassnameLessThan(String value) {
            addCriterion("JOBCLASSNAME <", value, "jobclassname");
            return (Criteria) this;
        }

        public Criteria andJobclassnameLessThanOrEqualTo(String value) {
            addCriterion("JOBCLASSNAME <=", value, "jobclassname");
            return (Criteria) this;
        }

        public Criteria andJobclassnameLike(String value) {
            addCriterion("JOBCLASSNAME like", value, "jobclassname");
            return (Criteria) this;
        }

        public Criteria andJobclassnameNotLike(String value) {
            addCriterion("JOBCLASSNAME not like", value, "jobclassname");
            return (Criteria) this;
        }

        public Criteria andJobclassnameIn(List<String> values) {
            addCriterion("JOBCLASSNAME in", values, "jobclassname");
            return (Criteria) this;
        }

        public Criteria andJobclassnameNotIn(List<String> values) {
            addCriterion("JOBCLASSNAME not in", values, "jobclassname");
            return (Criteria) this;
        }

        public Criteria andJobclassnameBetween(String value1, String value2) {
            addCriterion("JOBCLASSNAME between", value1, value2, "jobclassname");
            return (Criteria) this;
        }

        public Criteria andJobclassnameNotBetween(String value1, String value2) {
            addCriterion("JOBCLASSNAME not between", value1, value2, "jobclassname");
            return (Criteria) this;
        }

        public Criteria andJobargumentIsNull() {
            addCriterion("JOBARGUMENT is null");
            return (Criteria) this;
        }

        public Criteria andJobargumentIsNotNull() {
            addCriterion("JOBARGUMENT is not null");
            return (Criteria) this;
        }

        public Criteria andJobargumentEqualTo(String value) {
            addCriterion("JOBARGUMENT =", value, "jobargument");
            return (Criteria) this;
        }

        public Criteria andJobargumentNotEqualTo(String value) {
            addCriterion("JOBARGUMENT <>", value, "jobargument");
            return (Criteria) this;
        }

        public Criteria andJobargumentGreaterThan(String value) {
            addCriterion("JOBARGUMENT >", value, "jobargument");
            return (Criteria) this;
        }

        public Criteria andJobargumentGreaterThanOrEqualTo(String value) {
            addCriterion("JOBARGUMENT >=", value, "jobargument");
            return (Criteria) this;
        }

        public Criteria andJobargumentLessThan(String value) {
            addCriterion("JOBARGUMENT <", value, "jobargument");
            return (Criteria) this;
        }

        public Criteria andJobargumentLessThanOrEqualTo(String value) {
            addCriterion("JOBARGUMENT <=", value, "jobargument");
            return (Criteria) this;
        }

        public Criteria andJobargumentLike(String value) {
            addCriterion("JOBARGUMENT like", value, "jobargument");
            return (Criteria) this;
        }

        public Criteria andJobargumentNotLike(String value) {
            addCriterion("JOBARGUMENT not like", value, "jobargument");
            return (Criteria) this;
        }

        public Criteria andJobargumentIn(List<String> values) {
            addCriterion("JOBARGUMENT in", values, "jobargument");
            return (Criteria) this;
        }

        public Criteria andJobargumentNotIn(List<String> values) {
            addCriterion("JOBARGUMENT not in", values, "jobargument");
            return (Criteria) this;
        }

        public Criteria andJobargumentBetween(String value1, String value2) {
            addCriterion("JOBARGUMENT between", value1, value2, "jobargument");
            return (Criteria) this;
        }

        public Criteria andJobargumentNotBetween(String value1, String value2) {
            addCriterion("JOBARGUMENT not between", value1, value2, "jobargument");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNull() {
            addCriterion("JOBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNotNull() {
            addCriterion("JOBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andJobtypeEqualTo(String value) {
            addCriterion("JOBTYPE =", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotEqualTo(String value) {
            addCriterion("JOBTYPE <>", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThan(String value) {
            addCriterion("JOBTYPE >", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThanOrEqualTo(String value) {
            addCriterion("JOBTYPE >=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThan(String value) {
            addCriterion("JOBTYPE <", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThanOrEqualTo(String value) {
            addCriterion("JOBTYPE <=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLike(String value) {
            addCriterion("JOBTYPE like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotLike(String value) {
            addCriterion("JOBTYPE not like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeIn(List<String> values) {
            addCriterion("JOBTYPE in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotIn(List<String> values) {
            addCriterion("JOBTYPE not in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeBetween(String value1, String value2) {
            addCriterion("JOBTYPE between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotBetween(String value1, String value2) {
            addCriterion("JOBTYPE not between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("STARTTIME =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("STARTTIME <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("STARTTIME >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTTIME >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("STARTTIME <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("STARTTIME <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("STARTTIME in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("STARTTIME not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("STARTTIME between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("STARTTIME not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andCronexpressionIsNull() {
            addCriterion("CRONEXPRESSION is null");
            return (Criteria) this;
        }

        public Criteria andCronexpressionIsNotNull() {
            addCriterion("CRONEXPRESSION is not null");
            return (Criteria) this;
        }

        public Criteria andCronexpressionEqualTo(String value) {
            addCriterion("CRONEXPRESSION =", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionNotEqualTo(String value) {
            addCriterion("CRONEXPRESSION <>", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionGreaterThan(String value) {
            addCriterion("CRONEXPRESSION >", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionGreaterThanOrEqualTo(String value) {
            addCriterion("CRONEXPRESSION >=", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionLessThan(String value) {
            addCriterion("CRONEXPRESSION <", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionLessThanOrEqualTo(String value) {
            addCriterion("CRONEXPRESSION <=", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionLike(String value) {
            addCriterion("CRONEXPRESSION like", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionNotLike(String value) {
            addCriterion("CRONEXPRESSION not like", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionIn(List<String> values) {
            addCriterion("CRONEXPRESSION in", values, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionNotIn(List<String> values) {
            addCriterion("CRONEXPRESSION not in", values, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionBetween(String value1, String value2) {
            addCriterion("CRONEXPRESSION between", value1, value2, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionNotBetween(String value1, String value2) {
            addCriterion("CRONEXPRESSION not between", value1, value2, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNull() {
            addCriterion("TASKNAME is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("TASKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("TASKNAME =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("TASKNAME <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("TASKNAME >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("TASKNAME >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("TASKNAME <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("TASKNAME <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("TASKNAME like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("TASKNAME not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("TASKNAME in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("TASKNAME not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("TASKNAME between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("TASKNAME not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionIsNull() {
            addCriterion("TASKDESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionIsNotNull() {
            addCriterion("TASKDESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionEqualTo(String value) {
            addCriterion("TASKDESCRIPTION =", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionNotEqualTo(String value) {
            addCriterion("TASKDESCRIPTION <>", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionGreaterThan(String value) {
            addCriterion("TASKDESCRIPTION >", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("TASKDESCRIPTION >=", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionLessThan(String value) {
            addCriterion("TASKDESCRIPTION <", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionLessThanOrEqualTo(String value) {
            addCriterion("TASKDESCRIPTION <=", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionLike(String value) {
            addCriterion("TASKDESCRIPTION like", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionNotLike(String value) {
            addCriterion("TASKDESCRIPTION not like", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionIn(List<String> values) {
            addCriterion("TASKDESCRIPTION in", values, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionNotIn(List<String> values) {
            addCriterion("TASKDESCRIPTION not in", values, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionBetween(String value1, String value2) {
            addCriterion("TASKDESCRIPTION between", value1, value2, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionNotBetween(String value1, String value2) {
            addCriterion("TASKDESCRIPTION not between", value1, value2, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskstateIsNull() {
            addCriterion("TASKSTATE is null");
            return (Criteria) this;
        }

        public Criteria andTaskstateIsNotNull() {
            addCriterion("TASKSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskstateEqualTo(String value) {
            addCriterion("TASKSTATE =", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateNotEqualTo(String value) {
            addCriterion("TASKSTATE <>", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateGreaterThan(String value) {
            addCriterion("TASKSTATE >", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateGreaterThanOrEqualTo(String value) {
            addCriterion("TASKSTATE >=", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateLessThan(String value) {
            addCriterion("TASKSTATE <", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateLessThanOrEqualTo(String value) {
            addCriterion("TASKSTATE <=", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateLike(String value) {
            addCriterion("TASKSTATE like", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateNotLike(String value) {
            addCriterion("TASKSTATE not like", value, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateIn(List<String> values) {
            addCriterion("TASKSTATE in", values, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateNotIn(List<String> values) {
            addCriterion("TASKSTATE not in", values, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateBetween(String value1, String value2) {
            addCriterion("TASKSTATE between", value1, value2, "taskstate");
            return (Criteria) this;
        }

        public Criteria andTaskstateNotBetween(String value1, String value2) {
            addCriterion("TASKSTATE not between", value1, value2, "taskstate");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("PORT is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("PORT is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("PORT =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("PORT <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("PORT >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("PORT >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("PORT <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("PORT <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("PORT like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("PORT not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("PORT in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("PORT not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("PORT between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("PORT not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andJobparameterIsNull() {
            addCriterion("JOBPARAMETER is null");
            return (Criteria) this;
        }

        public Criteria andJobparameterIsNotNull() {
            addCriterion("JOBPARAMETER is not null");
            return (Criteria) this;
        }

        public Criteria andJobparameterEqualTo(String value) {
            addCriterion("JOBPARAMETER =", value, "jobparameter");
            return (Criteria) this;
        }

        public Criteria andJobparameterNotEqualTo(String value) {
            addCriterion("JOBPARAMETER <>", value, "jobparameter");
            return (Criteria) this;
        }

        public Criteria andJobparameterGreaterThan(String value) {
            addCriterion("JOBPARAMETER >", value, "jobparameter");
            return (Criteria) this;
        }

        public Criteria andJobparameterGreaterThanOrEqualTo(String value) {
            addCriterion("JOBPARAMETER >=", value, "jobparameter");
            return (Criteria) this;
        }

        public Criteria andJobparameterLessThan(String value) {
            addCriterion("JOBPARAMETER <", value, "jobparameter");
            return (Criteria) this;
        }

        public Criteria andJobparameterLessThanOrEqualTo(String value) {
            addCriterion("JOBPARAMETER <=", value, "jobparameter");
            return (Criteria) this;
        }

        public Criteria andJobparameterLike(String value) {
            addCriterion("JOBPARAMETER like", value, "jobparameter");
            return (Criteria) this;
        }

        public Criteria andJobparameterNotLike(String value) {
            addCriterion("JOBPARAMETER not like", value, "jobparameter");
            return (Criteria) this;
        }

        public Criteria andJobparameterIn(List<String> values) {
            addCriterion("JOBPARAMETER in", values, "jobparameter");
            return (Criteria) this;
        }

        public Criteria andJobparameterNotIn(List<String> values) {
            addCriterion("JOBPARAMETER not in", values, "jobparameter");
            return (Criteria) this;
        }

        public Criteria andJobparameterBetween(String value1, String value2) {
            addCriterion("JOBPARAMETER between", value1, value2, "jobparameter");
            return (Criteria) this;
        }

        public Criteria andJobparameterNotBetween(String value1, String value2) {
            addCriterion("JOBPARAMETER not between", value1, value2, "jobparameter");
            return (Criteria) this;
        }

        public Criteria andModIsNull() {
            addCriterion("MOD is null");
            return (Criteria) this;
        }

        public Criteria andModIsNotNull() {
            addCriterion("MOD is not null");
            return (Criteria) this;
        }

        public Criteria andModEqualTo(String value) {
            addCriterion("MOD =", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModNotEqualTo(String value) {
            addCriterion("MOD <>", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModGreaterThan(String value) {
            addCriterion("MOD >", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModGreaterThanOrEqualTo(String value) {
            addCriterion("MOD >=", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModLessThan(String value) {
            addCriterion("MOD <", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModLessThanOrEqualTo(String value) {
            addCriterion("MOD <=", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModLike(String value) {
            addCriterion("MOD like", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModNotLike(String value) {
            addCriterion("MOD not like", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModIn(List<String> values) {
            addCriterion("MOD in", values, "mod");
            return (Criteria) this;
        }

        public Criteria andModNotIn(List<String> values) {
            addCriterion("MOD not in", values, "mod");
            return (Criteria) this;
        }

        public Criteria andModBetween(String value1, String value2) {
            addCriterion("MOD between", value1, value2, "mod");
            return (Criteria) this;
        }

        public Criteria andModNotBetween(String value1, String value2) {
            addCriterion("MOD not between", value1, value2, "mod");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_batchtask_td
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
     * @Table : mm_batchtask_td
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