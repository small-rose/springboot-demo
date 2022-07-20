package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmWorkplatformTdExample {
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
    public MmWorkplatformTdExample() {
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
     * @Table : mm_workplatform_td
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

        public Criteria andWorkidIsNull() {
            addCriterion("WORKID is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("WORKID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(String value) {
            addCriterion("WORKID =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(String value) {
            addCriterion("WORKID <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(String value) {
            addCriterion("WORKID >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(String value) {
            addCriterion("WORKID >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(String value) {
            addCriterion("WORKID <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(String value) {
            addCriterion("WORKID <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLike(String value) {
            addCriterion("WORKID like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotLike(String value) {
            addCriterion("WORKID not like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<String> values) {
            addCriterion("WORKID in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<String> values) {
            addCriterion("WORKID not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(String value1, String value2) {
            addCriterion("WORKID between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(String value1, String value2) {
            addCriterion("WORKID not between", value1, value2, "workid");
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

        public Criteria andUnitcodeIsNull() {
            addCriterion("UNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNotNull() {
            addCriterion("UNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeEqualTo(String value) {
            addCriterion("UNITCODE =", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotEqualTo(String value) {
            addCriterion("UNITCODE <>", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThan(String value) {
            addCriterion("UNITCODE >", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNITCODE >=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThan(String value) {
            addCriterion("UNITCODE <", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThanOrEqualTo(String value) {
            addCriterion("UNITCODE <=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLike(String value) {
            addCriterion("UNITCODE like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotLike(String value) {
            addCriterion("UNITCODE not like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIn(List<String> values) {
            addCriterion("UNITCODE in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotIn(List<String> values) {
            addCriterion("UNITCODE not in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeBetween(String value1, String value2) {
            addCriterion("UNITCODE between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotBetween(String value1, String value2) {
            addCriterion("UNITCODE not between", value1, value2, "unitcode");
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

        public Criteria andWorkstatusIsNull() {
            addCriterion("WORKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIsNotNull() {
            addCriterion("WORKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstatusEqualTo(String value) {
            addCriterion("WORKSTATUS =", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotEqualTo(String value) {
            addCriterion("WORKSTATUS <>", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusGreaterThan(String value) {
            addCriterion("WORKSTATUS >", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSTATUS >=", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLessThan(String value) {
            addCriterion("WORKSTATUS <", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLessThanOrEqualTo(String value) {
            addCriterion("WORKSTATUS <=", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLike(String value) {
            addCriterion("WORKSTATUS like", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotLike(String value) {
            addCriterion("WORKSTATUS not like", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIn(List<String> values) {
            addCriterion("WORKSTATUS in", values, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotIn(List<String> values) {
            addCriterion("WORKSTATUS not in", values, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusBetween(String value1, String value2) {
            addCriterion("WORKSTATUS between", value1, value2, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotBetween(String value1, String value2) {
            addCriterion("WORKSTATUS not between", value1, value2, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorklevelIsNull() {
            addCriterion("WORKLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andWorklevelIsNotNull() {
            addCriterion("WORKLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andWorklevelEqualTo(String value) {
            addCriterion("WORKLEVEL =", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelNotEqualTo(String value) {
            addCriterion("WORKLEVEL <>", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelGreaterThan(String value) {
            addCriterion("WORKLEVEL >", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelGreaterThanOrEqualTo(String value) {
            addCriterion("WORKLEVEL >=", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelLessThan(String value) {
            addCriterion("WORKLEVEL <", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelLessThanOrEqualTo(String value) {
            addCriterion("WORKLEVEL <=", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelLike(String value) {
            addCriterion("WORKLEVEL like", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelNotLike(String value) {
            addCriterion("WORKLEVEL not like", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelIn(List<String> values) {
            addCriterion("WORKLEVEL in", values, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelNotIn(List<String> values) {
            addCriterion("WORKLEVEL not in", values, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelBetween(String value1, String value2) {
            addCriterion("WORKLEVEL between", value1, value2, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelNotBetween(String value1, String value2) {
            addCriterion("WORKLEVEL not between", value1, value2, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorktypeIsNull() {
            addCriterion("WORKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andWorktypeIsNotNull() {
            addCriterion("WORKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypeEqualTo(String value) {
            addCriterion("WORKTYPE =", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotEqualTo(String value) {
            addCriterion("WORKTYPE <>", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeGreaterThan(String value) {
            addCriterion("WORKTYPE >", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeGreaterThanOrEqualTo(String value) {
            addCriterion("WORKTYPE >=", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLessThan(String value) {
            addCriterion("WORKTYPE <", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLessThanOrEqualTo(String value) {
            addCriterion("WORKTYPE <=", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLike(String value) {
            addCriterion("WORKTYPE like", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotLike(String value) {
            addCriterion("WORKTYPE not like", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeIn(List<String> values) {
            addCriterion("WORKTYPE in", values, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotIn(List<String> values) {
            addCriterion("WORKTYPE not in", values, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeBetween(String value1, String value2) {
            addCriterion("WORKTYPE between", value1, value2, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotBetween(String value1, String value2) {
            addCriterion("WORKTYPE not between", value1, value2, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidIsNull() {
            addCriterion("WORKRELATIONID is null");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidIsNotNull() {
            addCriterion("WORKRELATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidEqualTo(String value) {
            addCriterion("WORKRELATIONID =", value, "workrelationid");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidNotEqualTo(String value) {
            addCriterion("WORKRELATIONID <>", value, "workrelationid");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidGreaterThan(String value) {
            addCriterion("WORKRELATIONID >", value, "workrelationid");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidGreaterThanOrEqualTo(String value) {
            addCriterion("WORKRELATIONID >=", value, "workrelationid");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidLessThan(String value) {
            addCriterion("WORKRELATIONID <", value, "workrelationid");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidLessThanOrEqualTo(String value) {
            addCriterion("WORKRELATIONID <=", value, "workrelationid");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidLike(String value) {
            addCriterion("WORKRELATIONID like", value, "workrelationid");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidNotLike(String value) {
            addCriterion("WORKRELATIONID not like", value, "workrelationid");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidIn(List<String> values) {
            addCriterion("WORKRELATIONID in", values, "workrelationid");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidNotIn(List<String> values) {
            addCriterion("WORKRELATIONID not in", values, "workrelationid");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidBetween(String value1, String value2) {
            addCriterion("WORKRELATIONID between", value1, value2, "workrelationid");
            return (Criteria) this;
        }

        public Criteria andWorkrelationidNotBetween(String value1, String value2) {
            addCriterion("WORKRELATIONID not between", value1, value2, "workrelationid");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeIsNull() {
            addCriterion("CURRENTCHECKCODE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeIsNotNull() {
            addCriterion("CURRENTCHECKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeEqualTo(String value) {
            addCriterion("CURRENTCHECKCODE =", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeNotEqualTo(String value) {
            addCriterion("CURRENTCHECKCODE <>", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeGreaterThan(String value) {
            addCriterion("CURRENTCHECKCODE >", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENTCHECKCODE >=", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeLessThan(String value) {
            addCriterion("CURRENTCHECKCODE <", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeLessThanOrEqualTo(String value) {
            addCriterion("CURRENTCHECKCODE <=", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeLike(String value) {
            addCriterion("CURRENTCHECKCODE like", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeNotLike(String value) {
            addCriterion("CURRENTCHECKCODE not like", value, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeIn(List<String> values) {
            addCriterion("CURRENTCHECKCODE in", values, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeNotIn(List<String> values) {
            addCriterion("CURRENTCHECKCODE not in", values, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeBetween(String value1, String value2) {
            addCriterion("CURRENTCHECKCODE between", value1, value2, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andCurrentcheckcodeNotBetween(String value1, String value2) {
            addCriterion("CURRENTCHECKCODE not between", value1, value2, "currentcheckcode");
            return (Criteria) this;
        }

        public Criteria andWorkreasonIsNull() {
            addCriterion("WORKREASON is null");
            return (Criteria) this;
        }

        public Criteria andWorkreasonIsNotNull() {
            addCriterion("WORKREASON is not null");
            return (Criteria) this;
        }

        public Criteria andWorkreasonEqualTo(String value) {
            addCriterion("WORKREASON =", value, "workreason");
            return (Criteria) this;
        }

        public Criteria andWorkreasonNotEqualTo(String value) {
            addCriterion("WORKREASON <>", value, "workreason");
            return (Criteria) this;
        }

        public Criteria andWorkreasonGreaterThan(String value) {
            addCriterion("WORKREASON >", value, "workreason");
            return (Criteria) this;
        }

        public Criteria andWorkreasonGreaterThanOrEqualTo(String value) {
            addCriterion("WORKREASON >=", value, "workreason");
            return (Criteria) this;
        }

        public Criteria andWorkreasonLessThan(String value) {
            addCriterion("WORKREASON <", value, "workreason");
            return (Criteria) this;
        }

        public Criteria andWorkreasonLessThanOrEqualTo(String value) {
            addCriterion("WORKREASON <=", value, "workreason");
            return (Criteria) this;
        }

        public Criteria andWorkreasonLike(String value) {
            addCriterion("WORKREASON like", value, "workreason");
            return (Criteria) this;
        }

        public Criteria andWorkreasonNotLike(String value) {
            addCriterion("WORKREASON not like", value, "workreason");
            return (Criteria) this;
        }

        public Criteria andWorkreasonIn(List<String> values) {
            addCriterion("WORKREASON in", values, "workreason");
            return (Criteria) this;
        }

        public Criteria andWorkreasonNotIn(List<String> values) {
            addCriterion("WORKREASON not in", values, "workreason");
            return (Criteria) this;
        }

        public Criteria andWorkreasonBetween(String value1, String value2) {
            addCriterion("WORKREASON between", value1, value2, "workreason");
            return (Criteria) this;
        }

        public Criteria andWorkreasonNotBetween(String value1, String value2) {
            addCriterion("WORKREASON not between", value1, value2, "workreason");
            return (Criteria) this;
        }

        public Criteria andWorkdateIsNull() {
            addCriterion("WORKDATE is null");
            return (Criteria) this;
        }

        public Criteria andWorkdateIsNotNull() {
            addCriterion("WORKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdateEqualTo(Date value) {
            addCriterion("WORKDATE =", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotEqualTo(Date value) {
            addCriterion("WORKDATE <>", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateGreaterThan(Date value) {
            addCriterion("WORKDATE >", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateGreaterThanOrEqualTo(Date value) {
            addCriterion("WORKDATE >=", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLessThan(Date value) {
            addCriterion("WORKDATE <", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLessThanOrEqualTo(Date value) {
            addCriterion("WORKDATE <=", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateIn(List<Date> values) {
            addCriterion("WORKDATE in", values, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotIn(List<Date> values) {
            addCriterion("WORKDATE not in", values, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateBetween(Date value1, Date value2) {
            addCriterion("WORKDATE between", value1, value2, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotBetween(Date value1, Date value2) {
            addCriterion("WORKDATE not between", value1, value2, "workdate");
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

        public Criteria andIdtableIsNull() {
            addCriterion("IDTABLE is null");
            return (Criteria) this;
        }

        public Criteria andIdtableIsNotNull() {
            addCriterion("IDTABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIdtableEqualTo(String value) {
            addCriterion("IDTABLE =", value, "idtable");
            return (Criteria) this;
        }

        public Criteria andIdtableNotEqualTo(String value) {
            addCriterion("IDTABLE <>", value, "idtable");
            return (Criteria) this;
        }

        public Criteria andIdtableGreaterThan(String value) {
            addCriterion("IDTABLE >", value, "idtable");
            return (Criteria) this;
        }

        public Criteria andIdtableGreaterThanOrEqualTo(String value) {
            addCriterion("IDTABLE >=", value, "idtable");
            return (Criteria) this;
        }

        public Criteria andIdtableLessThan(String value) {
            addCriterion("IDTABLE <", value, "idtable");
            return (Criteria) this;
        }

        public Criteria andIdtableLessThanOrEqualTo(String value) {
            addCriterion("IDTABLE <=", value, "idtable");
            return (Criteria) this;
        }

        public Criteria andIdtableLike(String value) {
            addCriterion("IDTABLE like", value, "idtable");
            return (Criteria) this;
        }

        public Criteria andIdtableNotLike(String value) {
            addCriterion("IDTABLE not like", value, "idtable");
            return (Criteria) this;
        }

        public Criteria andIdtableIn(List<String> values) {
            addCriterion("IDTABLE in", values, "idtable");
            return (Criteria) this;
        }

        public Criteria andIdtableNotIn(List<String> values) {
            addCriterion("IDTABLE not in", values, "idtable");
            return (Criteria) this;
        }

        public Criteria andIdtableBetween(String value1, String value2) {
            addCriterion("IDTABLE between", value1, value2, "idtable");
            return (Criteria) this;
        }

        public Criteria andIdtableNotBetween(String value1, String value2) {
            addCriterion("IDTABLE not between", value1, value2, "idtable");
            return (Criteria) this;
        }

        public Criteria andChecklevelIsNull() {
            addCriterion("CHECKLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andChecklevelIsNotNull() {
            addCriterion("CHECKLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andChecklevelEqualTo(String value) {
            addCriterion("CHECKLEVEL =", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelNotEqualTo(String value) {
            addCriterion("CHECKLEVEL <>", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelGreaterThan(String value) {
            addCriterion("CHECKLEVEL >", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKLEVEL >=", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelLessThan(String value) {
            addCriterion("CHECKLEVEL <", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelLessThanOrEqualTo(String value) {
            addCriterion("CHECKLEVEL <=", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelLike(String value) {
            addCriterion("CHECKLEVEL like", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelNotLike(String value) {
            addCriterion("CHECKLEVEL not like", value, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelIn(List<String> values) {
            addCriterion("CHECKLEVEL in", values, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelNotIn(List<String> values) {
            addCriterion("CHECKLEVEL not in", values, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelBetween(String value1, String value2) {
            addCriterion("CHECKLEVEL between", value1, value2, "checklevel");
            return (Criteria) this;
        }

        public Criteria andChecklevelNotBetween(String value1, String value2) {
            addCriterion("CHECKLEVEL not between", value1, value2, "checklevel");
            return (Criteria) this;
        }

        public Criteria andIfattachmentIsNull() {
            addCriterion("IFATTACHMENT is null");
            return (Criteria) this;
        }

        public Criteria andIfattachmentIsNotNull() {
            addCriterion("IFATTACHMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIfattachmentEqualTo(String value) {
            addCriterion("IFATTACHMENT =", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentNotEqualTo(String value) {
            addCriterion("IFATTACHMENT <>", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentGreaterThan(String value) {
            addCriterion("IFATTACHMENT >", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentGreaterThanOrEqualTo(String value) {
            addCriterion("IFATTACHMENT >=", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentLessThan(String value) {
            addCriterion("IFATTACHMENT <", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentLessThanOrEqualTo(String value) {
            addCriterion("IFATTACHMENT <=", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentLike(String value) {
            addCriterion("IFATTACHMENT like", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentNotLike(String value) {
            addCriterion("IFATTACHMENT not like", value, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentIn(List<String> values) {
            addCriterion("IFATTACHMENT in", values, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentNotIn(List<String> values) {
            addCriterion("IFATTACHMENT not in", values, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentBetween(String value1, String value2) {
            addCriterion("IFATTACHMENT between", value1, value2, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andIfattachmentNotBetween(String value1, String value2) {
            addCriterion("IFATTACHMENT not between", value1, value2, "ifattachment");
            return (Criteria) this;
        }

        public Criteria andPreworkidIsNull() {
            addCriterion("PREWORKID is null");
            return (Criteria) this;
        }

        public Criteria andPreworkidIsNotNull() {
            addCriterion("PREWORKID is not null");
            return (Criteria) this;
        }

        public Criteria andPreworkidEqualTo(String value) {
            addCriterion("PREWORKID =", value, "preworkid");
            return (Criteria) this;
        }

        public Criteria andPreworkidNotEqualTo(String value) {
            addCriterion("PREWORKID <>", value, "preworkid");
            return (Criteria) this;
        }

        public Criteria andPreworkidGreaterThan(String value) {
            addCriterion("PREWORKID >", value, "preworkid");
            return (Criteria) this;
        }

        public Criteria andPreworkidGreaterThanOrEqualTo(String value) {
            addCriterion("PREWORKID >=", value, "preworkid");
            return (Criteria) this;
        }

        public Criteria andPreworkidLessThan(String value) {
            addCriterion("PREWORKID <", value, "preworkid");
            return (Criteria) this;
        }

        public Criteria andPreworkidLessThanOrEqualTo(String value) {
            addCriterion("PREWORKID <=", value, "preworkid");
            return (Criteria) this;
        }

        public Criteria andPreworkidLike(String value) {
            addCriterion("PREWORKID like", value, "preworkid");
            return (Criteria) this;
        }

        public Criteria andPreworkidNotLike(String value) {
            addCriterion("PREWORKID not like", value, "preworkid");
            return (Criteria) this;
        }

        public Criteria andPreworkidIn(List<String> values) {
            addCriterion("PREWORKID in", values, "preworkid");
            return (Criteria) this;
        }

        public Criteria andPreworkidNotIn(List<String> values) {
            addCriterion("PREWORKID not in", values, "preworkid");
            return (Criteria) this;
        }

        public Criteria andPreworkidBetween(String value1, String value2) {
            addCriterion("PREWORKID between", value1, value2, "preworkid");
            return (Criteria) this;
        }

        public Criteria andPreworkidNotBetween(String value1, String value2) {
            addCriterion("PREWORKID not between", value1, value2, "preworkid");
            return (Criteria) this;
        }

        public Criteria andAttachidIsNull() {
            addCriterion("ATTACHID is null");
            return (Criteria) this;
        }

        public Criteria andAttachidIsNotNull() {
            addCriterion("ATTACHID is not null");
            return (Criteria) this;
        }

        public Criteria andAttachidEqualTo(String value) {
            addCriterion("ATTACHID =", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidNotEqualTo(String value) {
            addCriterion("ATTACHID <>", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidGreaterThan(String value) {
            addCriterion("ATTACHID >", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHID >=", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidLessThan(String value) {
            addCriterion("ATTACHID <", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidLessThanOrEqualTo(String value) {
            addCriterion("ATTACHID <=", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidLike(String value) {
            addCriterion("ATTACHID like", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidNotLike(String value) {
            addCriterion("ATTACHID not like", value, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidIn(List<String> values) {
            addCriterion("ATTACHID in", values, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidNotIn(List<String> values) {
            addCriterion("ATTACHID not in", values, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidBetween(String value1, String value2) {
            addCriterion("ATTACHID between", value1, value2, "attachid");
            return (Criteria) this;
        }

        public Criteria andAttachidNotBetween(String value1, String value2) {
            addCriterion("ATTACHID not between", value1, value2, "attachid");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNull() {
            addCriterion("CURRENCYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNotNull() {
            addCriterion("CURRENCYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeEqualTo(String value) {
            addCriterion("CURRENCYCODE =", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotEqualTo(String value) {
            addCriterion("CURRENCYCODE <>", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThan(String value) {
            addCriterion("CURRENCYCODE >", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYCODE >=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThan(String value) {
            addCriterion("CURRENCYCODE <", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("CURRENCYCODE <=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLike(String value) {
            addCriterion("CURRENCYCODE like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotLike(String value) {
            addCriterion("CURRENCYCODE not like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIn(List<String> values) {
            addCriterion("CURRENCYCODE in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotIn(List<String> values) {
            addCriterion("CURRENCYCODE not in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeBetween(String value1, String value2) {
            addCriterion("CURRENCYCODE between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotBetween(String value1, String value2) {
            addCriterion("CURRENCYCODE not between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeIsNull() {
            addCriterion("WORKPLATTYPE is null");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeIsNotNull() {
            addCriterion("WORKPLATTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeEqualTo(String value) {
            addCriterion("WORKPLATTYPE =", value, "workplattype");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeNotEqualTo(String value) {
            addCriterion("WORKPLATTYPE <>", value, "workplattype");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeGreaterThan(String value) {
            addCriterion("WORKPLATTYPE >", value, "workplattype");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeGreaterThanOrEqualTo(String value) {
            addCriterion("WORKPLATTYPE >=", value, "workplattype");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeLessThan(String value) {
            addCriterion("WORKPLATTYPE <", value, "workplattype");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeLessThanOrEqualTo(String value) {
            addCriterion("WORKPLATTYPE <=", value, "workplattype");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeLike(String value) {
            addCriterion("WORKPLATTYPE like", value, "workplattype");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeNotLike(String value) {
            addCriterion("WORKPLATTYPE not like", value, "workplattype");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeIn(List<String> values) {
            addCriterion("WORKPLATTYPE in", values, "workplattype");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeNotIn(List<String> values) {
            addCriterion("WORKPLATTYPE not in", values, "workplattype");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeBetween(String value1, String value2) {
            addCriterion("WORKPLATTYPE between", value1, value2, "workplattype");
            return (Criteria) this;
        }

        public Criteria andWorkplattypeNotBetween(String value1, String value2) {
            addCriterion("WORKPLATTYPE not between", value1, value2, "workplattype");
            return (Criteria) this;
        }

        public Criteria andApplydataidIsNull() {
            addCriterion("APPLYDATAID is null");
            return (Criteria) this;
        }

        public Criteria andApplydataidIsNotNull() {
            addCriterion("APPLYDATAID is not null");
            return (Criteria) this;
        }

        public Criteria andApplydataidEqualTo(String value) {
            addCriterion("APPLYDATAID =", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotEqualTo(String value) {
            addCriterion("APPLYDATAID <>", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidGreaterThan(String value) {
            addCriterion("APPLYDATAID >", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYDATAID >=", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLessThan(String value) {
            addCriterion("APPLYDATAID <", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLessThanOrEqualTo(String value) {
            addCriterion("APPLYDATAID <=", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidLike(String value) {
            addCriterion("APPLYDATAID like", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotLike(String value) {
            addCriterion("APPLYDATAID not like", value, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidIn(List<String> values) {
            addCriterion("APPLYDATAID in", values, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotIn(List<String> values) {
            addCriterion("APPLYDATAID not in", values, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidBetween(String value1, String value2) {
            addCriterion("APPLYDATAID between", value1, value2, "applydataid");
            return (Criteria) this;
        }

        public Criteria andApplydataidNotBetween(String value1, String value2) {
            addCriterion("APPLYDATAID not between", value1, value2, "applydataid");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNull() {
            addCriterion("OPSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNotNull() {
            addCriterion("OPSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOpstatusEqualTo(String value) {
            addCriterion("OPSTATUS =", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotEqualTo(String value) {
            addCriterion("OPSTATUS <>", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThan(String value) {
            addCriterion("OPSTATUS >", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("OPSTATUS >=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThan(String value) {
            addCriterion("OPSTATUS <", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThanOrEqualTo(String value) {
            addCriterion("OPSTATUS <=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLike(String value) {
            addCriterion("OPSTATUS like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotLike(String value) {
            addCriterion("OPSTATUS not like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusIn(List<String> values) {
            addCriterion("OPSTATUS in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotIn(List<String> values) {
            addCriterion("OPSTATUS not in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusBetween(String value1, String value2) {
            addCriterion("OPSTATUS between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotBetween(String value1, String value2) {
            addCriterion("OPSTATUS not between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andPowerroleIsNull() {
            addCriterion("powerrole is null");
            return (Criteria) this;
        }

        public Criteria andPowerroleIsNotNull() {
            addCriterion("powerrole is not null");
            return (Criteria) this;
        }

        public Criteria andPowerroleEqualTo(String value) {
            addCriterion("powerrole =", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleNotEqualTo(String value) {
            addCriterion("powerrole <>", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleGreaterThan(String value) {
            addCriterion("powerrole >", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleGreaterThanOrEqualTo(String value) {
            addCriterion("powerrole >=", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleLessThan(String value) {
            addCriterion("powerrole <", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleLessThanOrEqualTo(String value) {
            addCriterion("powerrole <=", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleLike(String value) {
            addCriterion("powerrole like", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleNotLike(String value) {
            addCriterion("powerrole not like", value, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleIn(List<String> values) {
            addCriterion("powerrole in", values, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleNotIn(List<String> values) {
            addCriterion("powerrole not in", values, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleBetween(String value1, String value2) {
            addCriterion("powerrole between", value1, value2, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerroleNotBetween(String value1, String value2) {
            addCriterion("powerrole not between", value1, value2, "powerrole");
            return (Criteria) this;
        }

        public Criteria andPowerunitIsNull() {
            addCriterion("powerunit is null");
            return (Criteria) this;
        }

        public Criteria andPowerunitIsNotNull() {
            addCriterion("powerunit is not null");
            return (Criteria) this;
        }

        public Criteria andPowerunitEqualTo(String value) {
            addCriterion("powerunit =", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitNotEqualTo(String value) {
            addCriterion("powerunit <>", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitGreaterThan(String value) {
            addCriterion("powerunit >", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitGreaterThanOrEqualTo(String value) {
            addCriterion("powerunit >=", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitLessThan(String value) {
            addCriterion("powerunit <", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitLessThanOrEqualTo(String value) {
            addCriterion("powerunit <=", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitLike(String value) {
            addCriterion("powerunit like", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitNotLike(String value) {
            addCriterion("powerunit not like", value, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitIn(List<String> values) {
            addCriterion("powerunit in", values, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitNotIn(List<String> values) {
            addCriterion("powerunit not in", values, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitBetween(String value1, String value2) {
            addCriterion("powerunit between", value1, value2, "powerunit");
            return (Criteria) this;
        }

        public Criteria andPowerunitNotBetween(String value1, String value2) {
            addCriterion("powerunit not between", value1, value2, "powerunit");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_workplatform_td
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
     * @Table : mm_workplatform_td
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