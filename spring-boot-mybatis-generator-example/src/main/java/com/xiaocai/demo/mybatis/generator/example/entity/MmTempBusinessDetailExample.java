package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmTempBusinessDetailExample {
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
    public MmTempBusinessDetailExample() {
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
     * @Table : mm_temp_business_detail
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

        public Criteria andListnoIsNull() {
            addCriterion("listno is null");
            return (Criteria) this;
        }

        public Criteria andListnoIsNotNull() {
            addCriterion("listno is not null");
            return (Criteria) this;
        }

        public Criteria andListnoEqualTo(Long value) {
            addCriterion("listno =", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotEqualTo(Long value) {
            addCriterion("listno <>", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThan(Long value) {
            addCriterion("listno >", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoGreaterThanOrEqualTo(Long value) {
            addCriterion("listno >=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThan(Long value) {
            addCriterion("listno <", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoLessThanOrEqualTo(Long value) {
            addCriterion("listno <=", value, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoIn(List<Long> values) {
            addCriterion("listno in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotIn(List<Long> values) {
            addCriterion("listno not in", values, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoBetween(Long value1, Long value2) {
            addCriterion("listno between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andListnoNotBetween(Long value1, Long value2) {
            addCriterion("listno not between", value1, value2, "listno");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNull() {
            addCriterion("subcompany is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNotNull() {
            addCriterion("subcompany is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyEqualTo(String value) {
            addCriterion("subcompany =", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotEqualTo(String value) {
            addCriterion("subcompany <>", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThan(String value) {
            addCriterion("subcompany >", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("subcompany >=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThan(String value) {
            addCriterion("subcompany <", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThanOrEqualTo(String value) {
            addCriterion("subcompany <=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLike(String value) {
            addCriterion("subcompany like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotLike(String value) {
            addCriterion("subcompany not like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIn(List<String> values) {
            addCriterion("subcompany in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotIn(List<String> values) {
            addCriterion("subcompany not in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyBetween(String value1, String value2) {
            addCriterion("subcompany between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotBetween(String value1, String value2) {
            addCriterion("subcompany not between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNull() {
            addCriterion("unitcode is null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIsNotNull() {
            addCriterion("unitcode is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcodeEqualTo(String value) {
            addCriterion("unitcode =", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotEqualTo(String value) {
            addCriterion("unitcode <>", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThan(String value) {
            addCriterion("unitcode >", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("unitcode >=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThan(String value) {
            addCriterion("unitcode <", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLessThanOrEqualTo(String value) {
            addCriterion("unitcode <=", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeLike(String value) {
            addCriterion("unitcode like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotLike(String value) {
            addCriterion("unitcode not like", value, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeIn(List<String> values) {
            addCriterion("unitcode in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotIn(List<String> values) {
            addCriterion("unitcode not in", values, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeBetween(String value1, String value2) {
            addCriterion("unitcode between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andUnitcodeNotBetween(String value1, String value2) {
            addCriterion("unitcode not between", value1, value2, "unitcode");
            return (Criteria) this;
        }

        public Criteria andOldnoIsNull() {
            addCriterion("oldno is null");
            return (Criteria) this;
        }

        public Criteria andOldnoIsNotNull() {
            addCriterion("oldno is not null");
            return (Criteria) this;
        }

        public Criteria andOldnoEqualTo(Long value) {
            addCriterion("oldno =", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotEqualTo(Long value) {
            addCriterion("oldno <>", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoGreaterThan(Long value) {
            addCriterion("oldno >", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoGreaterThanOrEqualTo(Long value) {
            addCriterion("oldno >=", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoLessThan(Long value) {
            addCriterion("oldno <", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoLessThanOrEqualTo(Long value) {
            addCriterion("oldno <=", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoIn(List<Long> values) {
            addCriterion("oldno in", values, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotIn(List<Long> values) {
            addCriterion("oldno not in", values, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoBetween(Long value1, Long value2) {
            addCriterion("oldno between", value1, value2, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotBetween(Long value1, Long value2) {
            addCriterion("oldno not between", value1, value2, "oldno");
            return (Criteria) this;
        }

        public Criteria andNewnoIsNull() {
            addCriterion("newno is null");
            return (Criteria) this;
        }

        public Criteria andNewnoIsNotNull() {
            addCriterion("newno is not null");
            return (Criteria) this;
        }

        public Criteria andNewnoEqualTo(Long value) {
            addCriterion("newno =", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotEqualTo(Long value) {
            addCriterion("newno <>", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoGreaterThan(Long value) {
            addCriterion("newno >", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoGreaterThanOrEqualTo(Long value) {
            addCriterion("newno >=", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoLessThan(Long value) {
            addCriterion("newno <", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoLessThanOrEqualTo(Long value) {
            addCriterion("newno <=", value, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoIn(List<Long> values) {
            addCriterion("newno in", values, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotIn(List<Long> values) {
            addCriterion("newno not in", values, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoBetween(Long value1, Long value2) {
            addCriterion("newno between", value1, value2, "newno");
            return (Criteria) this;
        }

        public Criteria andNewnoNotBetween(Long value1, Long value2) {
            addCriterion("newno not between", value1, value2, "newno");
            return (Criteria) this;
        }

        public Criteria andFathernoIsNull() {
            addCriterion("fatherno is null");
            return (Criteria) this;
        }

        public Criteria andFathernoIsNotNull() {
            addCriterion("fatherno is not null");
            return (Criteria) this;
        }

        public Criteria andFathernoEqualTo(Long value) {
            addCriterion("fatherno =", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotEqualTo(Long value) {
            addCriterion("fatherno <>", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThan(Long value) {
            addCriterion("fatherno >", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoGreaterThanOrEqualTo(Long value) {
            addCriterion("fatherno >=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThan(Long value) {
            addCriterion("fatherno <", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoLessThanOrEqualTo(Long value) {
            addCriterion("fatherno <=", value, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoIn(List<Long> values) {
            addCriterion("fatherno in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotIn(List<Long> values) {
            addCriterion("fatherno not in", values, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoBetween(Long value1, Long value2) {
            addCriterion("fatherno between", value1, value2, "fatherno");
            return (Criteria) this;
        }

        public Criteria andFathernoNotBetween(Long value1, Long value2) {
            addCriterion("fatherno not between", value1, value2, "fatherno");
            return (Criteria) this;
        }

        public Criteria andSonnoIsNull() {
            addCriterion("sonno is null");
            return (Criteria) this;
        }

        public Criteria andSonnoIsNotNull() {
            addCriterion("sonno is not null");
            return (Criteria) this;
        }

        public Criteria andSonnoEqualTo(Long value) {
            addCriterion("sonno =", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoNotEqualTo(Long value) {
            addCriterion("sonno <>", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoGreaterThan(Long value) {
            addCriterion("sonno >", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoGreaterThanOrEqualTo(Long value) {
            addCriterion("sonno >=", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoLessThan(Long value) {
            addCriterion("sonno <", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoLessThanOrEqualTo(Long value) {
            addCriterion("sonno <=", value, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoIn(List<Long> values) {
            addCriterion("sonno in", values, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoNotIn(List<Long> values) {
            addCriterion("sonno not in", values, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoBetween(Long value1, Long value2) {
            addCriterion("sonno between", value1, value2, "sonno");
            return (Criteria) this;
        }

        public Criteria andSonnoNotBetween(Long value1, Long value2) {
            addCriterion("sonno not between", value1, value2, "sonno");
            return (Criteria) this;
        }

        public Criteria andBusinessoneIsNull() {
            addCriterion("businessone is null");
            return (Criteria) this;
        }

        public Criteria andBusinessoneIsNotNull() {
            addCriterion("businessone is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessoneEqualTo(String value) {
            addCriterion("businessone =", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotEqualTo(String value) {
            addCriterion("businessone <>", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneGreaterThan(String value) {
            addCriterion("businessone >", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneGreaterThanOrEqualTo(String value) {
            addCriterion("businessone >=", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneLessThan(String value) {
            addCriterion("businessone <", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneLessThanOrEqualTo(String value) {
            addCriterion("businessone <=", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneLike(String value) {
            addCriterion("businessone like", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotLike(String value) {
            addCriterion("businessone not like", value, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneIn(List<String> values) {
            addCriterion("businessone in", values, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotIn(List<String> values) {
            addCriterion("businessone not in", values, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneBetween(String value1, String value2) {
            addCriterion("businessone between", value1, value2, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinessoneNotBetween(String value1, String value2) {
            addCriterion("businessone not between", value1, value2, "businessone");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoIsNull() {
            addCriterion("businesstwo is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoIsNotNull() {
            addCriterion("businesstwo is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoEqualTo(String value) {
            addCriterion("businesstwo =", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotEqualTo(String value) {
            addCriterion("businesstwo <>", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoGreaterThan(String value) {
            addCriterion("businesstwo >", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoGreaterThanOrEqualTo(String value) {
            addCriterion("businesstwo >=", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoLessThan(String value) {
            addCriterion("businesstwo <", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoLessThanOrEqualTo(String value) {
            addCriterion("businesstwo <=", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoLike(String value) {
            addCriterion("businesstwo like", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotLike(String value) {
            addCriterion("businesstwo not like", value, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoIn(List<String> values) {
            addCriterion("businesstwo in", values, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotIn(List<String> values) {
            addCriterion("businesstwo not in", values, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoBetween(String value1, String value2) {
            addCriterion("businesstwo between", value1, value2, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andBusinesstwoNotBetween(String value1, String value2) {
            addCriterion("businesstwo not between", value1, value2, "businesstwo");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNull() {
            addCriterion("opcode is null");
            return (Criteria) this;
        }

        public Criteria andOpcodeIsNotNull() {
            addCriterion("opcode is not null");
            return (Criteria) this;
        }

        public Criteria andOpcodeEqualTo(String value) {
            addCriterion("opcode =", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotEqualTo(String value) {
            addCriterion("opcode <>", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThan(String value) {
            addCriterion("opcode >", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("opcode >=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThan(String value) {
            addCriterion("opcode <", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLessThanOrEqualTo(String value) {
            addCriterion("opcode <=", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeLike(String value) {
            addCriterion("opcode like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotLike(String value) {
            addCriterion("opcode not like", value, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeIn(List<String> values) {
            addCriterion("opcode in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotIn(List<String> values) {
            addCriterion("opcode not in", values, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeBetween(String value1, String value2) {
            addCriterion("opcode between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpcodeNotBetween(String value1, String value2) {
            addCriterion("opcode not between", value1, value2, "opcode");
            return (Criteria) this;
        }

        public Criteria andOpdatetimeIsNull() {
            addCriterion("opdatetime is null");
            return (Criteria) this;
        }

        public Criteria andOpdatetimeIsNotNull() {
            addCriterion("opdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andOpdatetimeEqualTo(Date value) {
            addCriterion("opdatetime =", value, "opdatetime");
            return (Criteria) this;
        }

        public Criteria andOpdatetimeNotEqualTo(Date value) {
            addCriterion("opdatetime <>", value, "opdatetime");
            return (Criteria) this;
        }

        public Criteria andOpdatetimeGreaterThan(Date value) {
            addCriterion("opdatetime >", value, "opdatetime");
            return (Criteria) this;
        }

        public Criteria andOpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opdatetime >=", value, "opdatetime");
            return (Criteria) this;
        }

        public Criteria andOpdatetimeLessThan(Date value) {
            addCriterion("opdatetime <", value, "opdatetime");
            return (Criteria) this;
        }

        public Criteria andOpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("opdatetime <=", value, "opdatetime");
            return (Criteria) this;
        }

        public Criteria andOpdatetimeIn(List<Date> values) {
            addCriterion("opdatetime in", values, "opdatetime");
            return (Criteria) this;
        }

        public Criteria andOpdatetimeNotIn(List<Date> values) {
            addCriterion("opdatetime not in", values, "opdatetime");
            return (Criteria) this;
        }

        public Criteria andOpdatetimeBetween(Date value1, Date value2) {
            addCriterion("opdatetime between", value1, value2, "opdatetime");
            return (Criteria) this;
        }

        public Criteria andOpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("opdatetime not between", value1, value2, "opdatetime");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNull() {
            addCriterion("agentcode is null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNotNull() {
            addCriterion("agentcode is not null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeEqualTo(String value) {
            addCriterion("agentcode =", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotEqualTo(String value) {
            addCriterion("agentcode <>", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThan(String value) {
            addCriterion("agentcode >", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("agentcode >=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThan(String value) {
            addCriterion("agentcode <", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThanOrEqualTo(String value) {
            addCriterion("agentcode <=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLike(String value) {
            addCriterion("agentcode like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotLike(String value) {
            addCriterion("agentcode not like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIn(List<String> values) {
            addCriterion("agentcode in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotIn(List<String> values) {
            addCriterion("agentcode not in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeBetween(String value1, String value2) {
            addCriterion("agentcode between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotBetween(String value1, String value2) {
            addCriterion("agentcode not between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNull() {
            addCriterion("departmentcode is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNotNull() {
            addCriterion("departmentcode is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeEqualTo(String value) {
            addCriterion("departmentcode =", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotEqualTo(String value) {
            addCriterion("departmentcode <>", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThan(String value) {
            addCriterion("departmentcode >", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("departmentcode >=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThan(String value) {
            addCriterion("departmentcode <", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThanOrEqualTo(String value) {
            addCriterion("departmentcode <=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLike(String value) {
            addCriterion("departmentcode like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotLike(String value) {
            addCriterion("departmentcode not like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIn(List<String> values) {
            addCriterion("departmentcode in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotIn(List<String> values) {
            addCriterion("departmentcode not in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeBetween(String value1, String value2) {
            addCriterion("departmentcode between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotBetween(String value1, String value2) {
            addCriterion("departmentcode not between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNull() {
            addCriterion("currencycode is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIsNotNull() {
            addCriterion("currencycode is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeEqualTo(String value) {
            addCriterion("currencycode =", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotEqualTo(String value) {
            addCriterion("currencycode <>", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThan(String value) {
            addCriterion("currencycode >", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("currencycode >=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThan(String value) {
            addCriterion("currencycode <", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("currencycode <=", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeLike(String value) {
            addCriterion("currencycode like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotLike(String value) {
            addCriterion("currencycode not like", value, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeIn(List<String> values) {
            addCriterion("currencycode in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotIn(List<String> values) {
            addCriterion("currencycode not in", values, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeBetween(String value1, String value2) {
            addCriterion("currencycode between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andCurrencycodeNotBetween(String value1, String value2) {
            addCriterion("currencycode not between", value1, value2, "currencycode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeIsNull() {
            addCriterion("insuredcode is null");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeIsNotNull() {
            addCriterion("insuredcode is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeEqualTo(String value) {
            addCriterion("insuredcode =", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotEqualTo(String value) {
            addCriterion("insuredcode <>", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeGreaterThan(String value) {
            addCriterion("insuredcode >", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeGreaterThanOrEqualTo(String value) {
            addCriterion("insuredcode >=", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeLessThan(String value) {
            addCriterion("insuredcode <", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeLessThanOrEqualTo(String value) {
            addCriterion("insuredcode <=", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeLike(String value) {
            addCriterion("insuredcode like", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotLike(String value) {
            addCriterion("insuredcode not like", value, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeIn(List<String> values) {
            addCriterion("insuredcode in", values, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotIn(List<String> values) {
            addCriterion("insuredcode not in", values, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeBetween(String value1, String value2) {
            addCriterion("insuredcode between", value1, value2, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsuredcodeNotBetween(String value1, String value2) {
            addCriterion("insuredcode not between", value1, value2, "insuredcode");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNull() {
            addCriterion("insuredname is null");
            return (Criteria) this;
        }

        public Criteria andInsurednameIsNotNull() {
            addCriterion("insuredname is not null");
            return (Criteria) this;
        }

        public Criteria andInsurednameEqualTo(String value) {
            addCriterion("insuredname =", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotEqualTo(String value) {
            addCriterion("insuredname <>", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThan(String value) {
            addCriterion("insuredname >", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameGreaterThanOrEqualTo(String value) {
            addCriterion("insuredname >=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThan(String value) {
            addCriterion("insuredname <", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLessThanOrEqualTo(String value) {
            addCriterion("insuredname <=", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameLike(String value) {
            addCriterion("insuredname like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotLike(String value) {
            addCriterion("insuredname not like", value, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameIn(List<String> values) {
            addCriterion("insuredname in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotIn(List<String> values) {
            addCriterion("insuredname not in", values, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameBetween(String value1, String value2) {
            addCriterion("insuredname between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurednameNotBetween(String value1, String value2) {
            addCriterion("insuredname not between", value1, value2, "insuredname");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIsNull() {
            addCriterion("insurencecount is null");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIsNotNull() {
            addCriterion("insurencecount is not null");
            return (Criteria) this;
        }

        public Criteria andInsurencecountEqualTo(Long value) {
            addCriterion("insurencecount =", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotEqualTo(Long value) {
            addCriterion("insurencecount <>", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountGreaterThan(Long value) {
            addCriterion("insurencecount >", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountGreaterThanOrEqualTo(Long value) {
            addCriterion("insurencecount >=", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountLessThan(Long value) {
            addCriterion("insurencecount <", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountLessThanOrEqualTo(Long value) {
            addCriterion("insurencecount <=", value, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountIn(List<Long> values) {
            addCriterion("insurencecount in", values, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotIn(List<Long> values) {
            addCriterion("insurencecount not in", values, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountBetween(Long value1, Long value2) {
            addCriterion("insurencecount between", value1, value2, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andInsurencecountNotBetween(Long value1, Long value2) {
            addCriterion("insurencecount not between", value1, value2, "insurencecount");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNull() {
            addCriterion("basecurrencycode is null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIsNotNull() {
            addCriterion("basecurrencycode is not null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeEqualTo(String value) {
            addCriterion("basecurrencycode =", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotEqualTo(String value) {
            addCriterion("basecurrencycode <>", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThan(String value) {
            addCriterion("basecurrencycode >", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("basecurrencycode >=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThan(String value) {
            addCriterion("basecurrencycode <", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLessThanOrEqualTo(String value) {
            addCriterion("basecurrencycode <=", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeLike(String value) {
            addCriterion("basecurrencycode like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotLike(String value) {
            addCriterion("basecurrencycode not like", value, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeIn(List<String> values) {
            addCriterion("basecurrencycode in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotIn(List<String> values) {
            addCriterion("basecurrencycode not in", values, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeBetween(String value1, String value2) {
            addCriterion("basecurrencycode between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBasecurrencycodeNotBetween(String value1, String value2) {
            addCriterion("basecurrencycode not between", value1, value2, "basecurrencycode");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNull() {
            addCriterion("baseamount is null");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNotNull() {
            addCriterion("baseamount is not null");
            return (Criteria) this;
        }

        public Criteria andBaseamountEqualTo(BigDecimal value) {
            addCriterion("baseamount =", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotEqualTo(BigDecimal value) {
            addCriterion("baseamount <>", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThan(BigDecimal value) {
            addCriterion("baseamount >", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baseamount >=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThan(BigDecimal value) {
            addCriterion("baseamount <", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baseamount <=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountIn(List<BigDecimal> values) {
            addCriterion("baseamount in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotIn(List<BigDecimal> values) {
            addCriterion("baseamount not in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseamount between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseamount not between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIsNull() {
            addCriterion("businessattr is null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIsNotNull() {
            addCriterion("businessattr is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessattrEqualTo(String value) {
            addCriterion("businessattr =", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotEqualTo(String value) {
            addCriterion("businessattr <>", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrGreaterThan(String value) {
            addCriterion("businessattr >", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrGreaterThanOrEqualTo(String value) {
            addCriterion("businessattr >=", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLessThan(String value) {
            addCriterion("businessattr <", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLessThanOrEqualTo(String value) {
            addCriterion("businessattr <=", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrLike(String value) {
            addCriterion("businessattr like", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotLike(String value) {
            addCriterion("businessattr not like", value, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrIn(List<String> values) {
            addCriterion("businessattr in", values, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotIn(List<String> values) {
            addCriterion("businessattr not in", values, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrBetween(String value1, String value2) {
            addCriterion("businessattr between", value1, value2, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinessattrNotBetween(String value1, String value2) {
            addCriterion("businessattr not between", value1, value2, "businessattr");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNull() {
            addCriterion("businesschannel is null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNotNull() {
            addCriterion("businesschannel is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelEqualTo(String value) {
            addCriterion("businesschannel =", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotEqualTo(String value) {
            addCriterion("businesschannel <>", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThan(String value) {
            addCriterion("businesschannel >", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThanOrEqualTo(String value) {
            addCriterion("businesschannel >=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThan(String value) {
            addCriterion("businesschannel <", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThanOrEqualTo(String value) {
            addCriterion("businesschannel <=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLike(String value) {
            addCriterion("businesschannel like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotLike(String value) {
            addCriterion("businesschannel not like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIn(List<String> values) {
            addCriterion("businesschannel in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotIn(List<String> values) {
            addCriterion("businesschannel not in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelBetween(String value1, String value2) {
            addCriterion("businesschannel between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotBetween(String value1, String value2) {
            addCriterion("businesschannel not between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andHasplanIsNull() {
            addCriterion("hasplan is null");
            return (Criteria) this;
        }

        public Criteria andHasplanIsNotNull() {
            addCriterion("hasplan is not null");
            return (Criteria) this;
        }

        public Criteria andHasplanEqualTo(String value) {
            addCriterion("hasplan =", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotEqualTo(String value) {
            addCriterion("hasplan <>", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanGreaterThan(String value) {
            addCriterion("hasplan >", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanGreaterThanOrEqualTo(String value) {
            addCriterion("hasplan >=", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLessThan(String value) {
            addCriterion("hasplan <", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLessThanOrEqualTo(String value) {
            addCriterion("hasplan <=", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanLike(String value) {
            addCriterion("hasplan like", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotLike(String value) {
            addCriterion("hasplan not like", value, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanIn(List<String> values) {
            addCriterion("hasplan in", values, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotIn(List<String> values) {
            addCriterion("hasplan not in", values, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanBetween(String value1, String value2) {
            addCriterion("hasplan between", value1, value2, "hasplan");
            return (Criteria) this;
        }

        public Criteria andHasplanNotBetween(String value1, String value2) {
            addCriterion("hasplan not between", value1, value2, "hasplan");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNull() {
            addCriterion("classescode is null");
            return (Criteria) this;
        }

        public Criteria andClassescodeIsNotNull() {
            addCriterion("classescode is not null");
            return (Criteria) this;
        }

        public Criteria andClassescodeEqualTo(String value) {
            addCriterion("classescode =", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotEqualTo(String value) {
            addCriterion("classescode <>", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThan(String value) {
            addCriterion("classescode >", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeGreaterThanOrEqualTo(String value) {
            addCriterion("classescode >=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThan(String value) {
            addCriterion("classescode <", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLessThanOrEqualTo(String value) {
            addCriterion("classescode <=", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeLike(String value) {
            addCriterion("classescode like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotLike(String value) {
            addCriterion("classescode not like", value, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeIn(List<String> values) {
            addCriterion("classescode in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotIn(List<String> values) {
            addCriterion("classescode not in", values, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeBetween(String value1, String value2) {
            addCriterion("classescode between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andClassescodeNotBetween(String value1, String value2) {
            addCriterion("classescode not between", value1, value2, "classescode");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNull() {
            addCriterion("risktype is null");
            return (Criteria) this;
        }

        public Criteria andRisktypeIsNotNull() {
            addCriterion("risktype is not null");
            return (Criteria) this;
        }

        public Criteria andRisktypeEqualTo(String value) {
            addCriterion("risktype =", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotEqualTo(String value) {
            addCriterion("risktype <>", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThan(String value) {
            addCriterion("risktype >", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeGreaterThanOrEqualTo(String value) {
            addCriterion("risktype >=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThan(String value) {
            addCriterion("risktype <", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLessThanOrEqualTo(String value) {
            addCriterion("risktype <=", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeLike(String value) {
            addCriterion("risktype like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotLike(String value) {
            addCriterion("risktype not like", value, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeIn(List<String> values) {
            addCriterion("risktype in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotIn(List<String> values) {
            addCriterion("risktype not in", values, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeBetween(String value1, String value2) {
            addCriterion("risktype between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andRisktypeNotBetween(String value1, String value2) {
            addCriterion("risktype not between", value1, value2, "risktype");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNull() {
            addCriterion("customercode is null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIsNotNull() {
            addCriterion("customercode is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercodeEqualTo(String value) {
            addCriterion("customercode =", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotEqualTo(String value) {
            addCriterion("customercode <>", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThan(String value) {
            addCriterion("customercode >", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeGreaterThanOrEqualTo(String value) {
            addCriterion("customercode >=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThan(String value) {
            addCriterion("customercode <", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLessThanOrEqualTo(String value) {
            addCriterion("customercode <=", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeLike(String value) {
            addCriterion("customercode like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotLike(String value) {
            addCriterion("customercode not like", value, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeIn(List<String> values) {
            addCriterion("customercode in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotIn(List<String> values) {
            addCriterion("customercode not in", values, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeBetween(String value1, String value2) {
            addCriterion("customercode between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomercodeNotBetween(String value1, String value2) {
            addCriterion("customercode not between", value1, value2, "customercode");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("customername is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customername is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customername =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customername <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customername >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customername >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customername <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customername <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customername like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customername not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customername in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customername not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customername between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customername not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIsNull() {
            addCriterion("transactorcode is null");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIsNotNull() {
            addCriterion("transactorcode is not null");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeEqualTo(String value) {
            addCriterion("transactorcode =", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotEqualTo(String value) {
            addCriterion("transactorcode <>", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeGreaterThan(String value) {
            addCriterion("transactorcode >", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("transactorcode >=", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLessThan(String value) {
            addCriterion("transactorcode <", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLessThanOrEqualTo(String value) {
            addCriterion("transactorcode <=", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeLike(String value) {
            addCriterion("transactorcode like", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotLike(String value) {
            addCriterion("transactorcode not like", value, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeIn(List<String> values) {
            addCriterion("transactorcode in", values, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotIn(List<String> values) {
            addCriterion("transactorcode not in", values, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeBetween(String value1, String value2) {
            addCriterion("transactorcode between", value1, value2, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andTransactorcodeNotBetween(String value1, String value2) {
            addCriterion("transactorcode not between", value1, value2, "transactorcode");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeIsNull() {
            addCriterion("signdatetime is null");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeIsNotNull() {
            addCriterion("signdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeEqualTo(Date value) {
            addCriterion("signdatetime =", value, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeNotEqualTo(Date value) {
            addCriterion("signdatetime <>", value, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeGreaterThan(Date value) {
            addCriterion("signdatetime >", value, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signdatetime >=", value, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeLessThan(Date value) {
            addCriterion("signdatetime <", value, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeLessThanOrEqualTo(Date value) {
            addCriterion("signdatetime <=", value, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeIn(List<Date> values) {
            addCriterion("signdatetime in", values, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeNotIn(List<Date> values) {
            addCriterion("signdatetime not in", values, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeBetween(Date value1, Date value2) {
            addCriterion("signdatetime between", value1, value2, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeNotBetween(Date value1, Date value2) {
            addCriterion("signdatetime not between", value1, value2, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andStartdatetimeIsNull() {
            addCriterion("startdatetime is null");
            return (Criteria) this;
        }

        public Criteria andStartdatetimeIsNotNull() {
            addCriterion("startdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andStartdatetimeEqualTo(Date value) {
            addCriterion("startdatetime =", value, "startdatetime");
            return (Criteria) this;
        }

        public Criteria andStartdatetimeNotEqualTo(Date value) {
            addCriterion("startdatetime <>", value, "startdatetime");
            return (Criteria) this;
        }

        public Criteria andStartdatetimeGreaterThan(Date value) {
            addCriterion("startdatetime >", value, "startdatetime");
            return (Criteria) this;
        }

        public Criteria andStartdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startdatetime >=", value, "startdatetime");
            return (Criteria) this;
        }

        public Criteria andStartdatetimeLessThan(Date value) {
            addCriterion("startdatetime <", value, "startdatetime");
            return (Criteria) this;
        }

        public Criteria andStartdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("startdatetime <=", value, "startdatetime");
            return (Criteria) this;
        }

        public Criteria andStartdatetimeIn(List<Date> values) {
            addCriterion("startdatetime in", values, "startdatetime");
            return (Criteria) this;
        }

        public Criteria andStartdatetimeNotIn(List<Date> values) {
            addCriterion("startdatetime not in", values, "startdatetime");
            return (Criteria) this;
        }

        public Criteria andStartdatetimeBetween(Date value1, Date value2) {
            addCriterion("startdatetime between", value1, value2, "startdatetime");
            return (Criteria) this;
        }

        public Criteria andStartdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("startdatetime not between", value1, value2, "startdatetime");
            return (Criteria) this;
        }

        public Criteria andEnddatetimeIsNull() {
            addCriterion("enddatetime is null");
            return (Criteria) this;
        }

        public Criteria andEnddatetimeIsNotNull() {
            addCriterion("enddatetime is not null");
            return (Criteria) this;
        }

        public Criteria andEnddatetimeEqualTo(Date value) {
            addCriterion("enddatetime =", value, "enddatetime");
            return (Criteria) this;
        }

        public Criteria andEnddatetimeNotEqualTo(Date value) {
            addCriterion("enddatetime <>", value, "enddatetime");
            return (Criteria) this;
        }

        public Criteria andEnddatetimeGreaterThan(Date value) {
            addCriterion("enddatetime >", value, "enddatetime");
            return (Criteria) this;
        }

        public Criteria andEnddatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enddatetime >=", value, "enddatetime");
            return (Criteria) this;
        }

        public Criteria andEnddatetimeLessThan(Date value) {
            addCriterion("enddatetime <", value, "enddatetime");
            return (Criteria) this;
        }

        public Criteria andEnddatetimeLessThanOrEqualTo(Date value) {
            addCriterion("enddatetime <=", value, "enddatetime");
            return (Criteria) this;
        }

        public Criteria andEnddatetimeIn(List<Date> values) {
            addCriterion("enddatetime in", values, "enddatetime");
            return (Criteria) this;
        }

        public Criteria andEnddatetimeNotIn(List<Date> values) {
            addCriterion("enddatetime not in", values, "enddatetime");
            return (Criteria) this;
        }

        public Criteria andEnddatetimeBetween(Date value1, Date value2) {
            addCriterion("enddatetime between", value1, value2, "enddatetime");
            return (Criteria) this;
        }

        public Criteria andEnddatetimeNotBetween(Date value1, Date value2) {
            addCriterion("enddatetime not between", value1, value2, "enddatetime");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNull() {
            addCriterion("policyno is null");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNotNull() {
            addCriterion("policyno is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynoEqualTo(String value) {
            addCriterion("policyno =", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotEqualTo(String value) {
            addCriterion("policyno <>", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThan(String value) {
            addCriterion("policyno >", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("policyno >=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThan(String value) {
            addCriterion("policyno <", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThanOrEqualTo(String value) {
            addCriterion("policyno <=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLike(String value) {
            addCriterion("policyno like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotLike(String value) {
            addCriterion("policyno not like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoIn(List<String> values) {
            addCriterion("policyno in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotIn(List<String> values) {
            addCriterion("policyno not in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoBetween(String value1, String value2) {
            addCriterion("policyno between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotBetween(String value1, String value2) {
            addCriterion("policyno not between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNull() {
            addCriterion("endorseno is null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIsNotNull() {
            addCriterion("endorseno is not null");
            return (Criteria) this;
        }

        public Criteria andEndorsenoEqualTo(String value) {
            addCriterion("endorseno =", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotEqualTo(String value) {
            addCriterion("endorseno <>", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThan(String value) {
            addCriterion("endorseno >", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoGreaterThanOrEqualTo(String value) {
            addCriterion("endorseno >=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThan(String value) {
            addCriterion("endorseno <", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLessThanOrEqualTo(String value) {
            addCriterion("endorseno <=", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoLike(String value) {
            addCriterion("endorseno like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotLike(String value) {
            addCriterion("endorseno not like", value, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoIn(List<String> values) {
            addCriterion("endorseno in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotIn(List<String> values) {
            addCriterion("endorseno not in", values, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoBetween(String value1, String value2) {
            addCriterion("endorseno between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andEndorsenoNotBetween(String value1, String value2) {
            addCriterion("endorseno not between", value1, value2, "endorseno");
            return (Criteria) this;
        }

        public Criteria andClaimnoIsNull() {
            addCriterion("claimno is null");
            return (Criteria) this;
        }

        public Criteria andClaimnoIsNotNull() {
            addCriterion("claimno is not null");
            return (Criteria) this;
        }

        public Criteria andClaimnoEqualTo(String value) {
            addCriterion("claimno =", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotEqualTo(String value) {
            addCriterion("claimno <>", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoGreaterThan(String value) {
            addCriterion("claimno >", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoGreaterThanOrEqualTo(String value) {
            addCriterion("claimno >=", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoLessThan(String value) {
            addCriterion("claimno <", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoLessThanOrEqualTo(String value) {
            addCriterion("claimno <=", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoLike(String value) {
            addCriterion("claimno like", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotLike(String value) {
            addCriterion("claimno not like", value, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoIn(List<String> values) {
            addCriterion("claimno in", values, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotIn(List<String> values) {
            addCriterion("claimno not in", values, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoBetween(String value1, String value2) {
            addCriterion("claimno between", value1, value2, "claimno");
            return (Criteria) this;
        }

        public Criteria andClaimnoNotBetween(String value1, String value2) {
            addCriterion("claimno not between", value1, value2, "claimno");
            return (Criteria) this;
        }

        public Criteria andReturnnoIsNull() {
            addCriterion("returnno is null");
            return (Criteria) this;
        }

        public Criteria andReturnnoIsNotNull() {
            addCriterion("returnno is not null");
            return (Criteria) this;
        }

        public Criteria andReturnnoEqualTo(String value) {
            addCriterion("returnno =", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotEqualTo(String value) {
            addCriterion("returnno <>", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoGreaterThan(String value) {
            addCriterion("returnno >", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoGreaterThanOrEqualTo(String value) {
            addCriterion("returnno >=", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLessThan(String value) {
            addCriterion("returnno <", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLessThanOrEqualTo(String value) {
            addCriterion("returnno <=", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoLike(String value) {
            addCriterion("returnno like", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotLike(String value) {
            addCriterion("returnno not like", value, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoIn(List<String> values) {
            addCriterion("returnno in", values, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotIn(List<String> values) {
            addCriterion("returnno not in", values, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoBetween(String value1, String value2) {
            addCriterion("returnno between", value1, value2, "returnno");
            return (Criteria) this;
        }

        public Criteria andReturnnoNotBetween(String value1, String value2) {
            addCriterion("returnno not between", value1, value2, "returnno");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNull() {
            addCriterion("auditstatus is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("auditstatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(String value) {
            addCriterion("auditstatus =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(String value) {
            addCriterion("auditstatus <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(String value) {
            addCriterion("auditstatus >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(String value) {
            addCriterion("auditstatus >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(String value) {
            addCriterion("auditstatus <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(String value) {
            addCriterion("auditstatus <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLike(String value) {
            addCriterion("auditstatus like", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotLike(String value) {
            addCriterion("auditstatus not like", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<String> values) {
            addCriterion("auditstatus in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<String> values) {
            addCriterion("auditstatus not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(String value1, String value2) {
            addCriterion("auditstatus between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(String value1, String value2) {
            addCriterion("auditstatus not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIsNull() {
            addCriterion("dailyauditno is null");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIsNotNull() {
            addCriterion("dailyauditno is not null");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoEqualTo(String value) {
            addCriterion("dailyauditno =", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotEqualTo(String value) {
            addCriterion("dailyauditno <>", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoGreaterThan(String value) {
            addCriterion("dailyauditno >", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoGreaterThanOrEqualTo(String value) {
            addCriterion("dailyauditno >=", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLessThan(String value) {
            addCriterion("dailyauditno <", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLessThanOrEqualTo(String value) {
            addCriterion("dailyauditno <=", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoLike(String value) {
            addCriterion("dailyauditno like", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotLike(String value) {
            addCriterion("dailyauditno not like", value, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoIn(List<String> values) {
            addCriterion("dailyauditno in", values, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotIn(List<String> values) {
            addCriterion("dailyauditno not in", values, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoBetween(String value1, String value2) {
            addCriterion("dailyauditno between", value1, value2, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andDailyauditnoNotBetween(String value1, String value2) {
            addCriterion("dailyauditno not between", value1, value2, "dailyauditno");
            return (Criteria) this;
        }

        public Criteria andCheckdatetimeIsNull() {
            addCriterion("checkdatetime is null");
            return (Criteria) this;
        }

        public Criteria andCheckdatetimeIsNotNull() {
            addCriterion("checkdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdatetimeEqualTo(Date value) {
            addCriterion("checkdatetime =", value, "checkdatetime");
            return (Criteria) this;
        }

        public Criteria andCheckdatetimeNotEqualTo(Date value) {
            addCriterion("checkdatetime <>", value, "checkdatetime");
            return (Criteria) this;
        }

        public Criteria andCheckdatetimeGreaterThan(Date value) {
            addCriterion("checkdatetime >", value, "checkdatetime");
            return (Criteria) this;
        }

        public Criteria andCheckdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkdatetime >=", value, "checkdatetime");
            return (Criteria) this;
        }

        public Criteria andCheckdatetimeLessThan(Date value) {
            addCriterion("checkdatetime <", value, "checkdatetime");
            return (Criteria) this;
        }

        public Criteria andCheckdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("checkdatetime <=", value, "checkdatetime");
            return (Criteria) this;
        }

        public Criteria andCheckdatetimeIn(List<Date> values) {
            addCriterion("checkdatetime in", values, "checkdatetime");
            return (Criteria) this;
        }

        public Criteria andCheckdatetimeNotIn(List<Date> values) {
            addCriterion("checkdatetime not in", values, "checkdatetime");
            return (Criteria) this;
        }

        public Criteria andCheckdatetimeBetween(Date value1, Date value2) {
            addCriterion("checkdatetime between", value1, value2, "checkdatetime");
            return (Criteria) this;
        }

        public Criteria andCheckdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("checkdatetime not between", value1, value2, "checkdatetime");
            return (Criteria) this;
        }

        public Criteria andAuditdatetimeIsNull() {
            addCriterion("auditdatetime is null");
            return (Criteria) this;
        }

        public Criteria andAuditdatetimeIsNotNull() {
            addCriterion("auditdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andAuditdatetimeEqualTo(Date value) {
            addCriterion("auditdatetime =", value, "auditdatetime");
            return (Criteria) this;
        }

        public Criteria andAuditdatetimeNotEqualTo(Date value) {
            addCriterion("auditdatetime <>", value, "auditdatetime");
            return (Criteria) this;
        }

        public Criteria andAuditdatetimeGreaterThan(Date value) {
            addCriterion("auditdatetime >", value, "auditdatetime");
            return (Criteria) this;
        }

        public Criteria andAuditdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auditdatetime >=", value, "auditdatetime");
            return (Criteria) this;
        }

        public Criteria andAuditdatetimeLessThan(Date value) {
            addCriterion("auditdatetime <", value, "auditdatetime");
            return (Criteria) this;
        }

        public Criteria andAuditdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("auditdatetime <=", value, "auditdatetime");
            return (Criteria) this;
        }

        public Criteria andAuditdatetimeIn(List<Date> values) {
            addCriterion("auditdatetime in", values, "auditdatetime");
            return (Criteria) this;
        }

        public Criteria andAuditdatetimeNotIn(List<Date> values) {
            addCriterion("auditdatetime not in", values, "auditdatetime");
            return (Criteria) this;
        }

        public Criteria andAuditdatetimeBetween(Date value1, Date value2) {
            addCriterion("auditdatetime between", value1, value2, "auditdatetime");
            return (Criteria) this;
        }

        public Criteria andAuditdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("auditdatetime not between", value1, value2, "auditdatetime");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNull() {
            addCriterion("opstatus is null");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNotNull() {
            addCriterion("opstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOpstatusEqualTo(String value) {
            addCriterion("opstatus =", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotEqualTo(String value) {
            addCriterion("opstatus <>", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThan(String value) {
            addCriterion("opstatus >", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("opstatus >=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThan(String value) {
            addCriterion("opstatus <", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThanOrEqualTo(String value) {
            addCriterion("opstatus <=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLike(String value) {
            addCriterion("opstatus like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotLike(String value) {
            addCriterion("opstatus not like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusIn(List<String> values) {
            addCriterion("opstatus in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotIn(List<String> values) {
            addCriterion("opstatus not in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusBetween(String value1, String value2) {
            addCriterion("opstatus between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotBetween(String value1, String value2) {
            addCriterion("opstatus not between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNull() {
            addCriterion("datasource is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("datasource is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("datasource =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("datasource <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("datasource >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("datasource >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("datasource <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("datasource <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("datasource like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("datasource not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("datasource in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("datasource not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("datasource between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("datasource not between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andLastopdatetimeIsNull() {
            addCriterion("lastopdatetime is null");
            return (Criteria) this;
        }

        public Criteria andLastopdatetimeIsNotNull() {
            addCriterion("lastopdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andLastopdatetimeEqualTo(Date value) {
            addCriterion("lastopdatetime =", value, "lastopdatetime");
            return (Criteria) this;
        }

        public Criteria andLastopdatetimeNotEqualTo(Date value) {
            addCriterion("lastopdatetime <>", value, "lastopdatetime");
            return (Criteria) this;
        }

        public Criteria andLastopdatetimeGreaterThan(Date value) {
            addCriterion("lastopdatetime >", value, "lastopdatetime");
            return (Criteria) this;
        }

        public Criteria andLastopdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastopdatetime >=", value, "lastopdatetime");
            return (Criteria) this;
        }

        public Criteria andLastopdatetimeLessThan(Date value) {
            addCriterion("lastopdatetime <", value, "lastopdatetime");
            return (Criteria) this;
        }

        public Criteria andLastopdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("lastopdatetime <=", value, "lastopdatetime");
            return (Criteria) this;
        }

        public Criteria andLastopdatetimeIn(List<Date> values) {
            addCriterion("lastopdatetime in", values, "lastopdatetime");
            return (Criteria) this;
        }

        public Criteria andLastopdatetimeNotIn(List<Date> values) {
            addCriterion("lastopdatetime not in", values, "lastopdatetime");
            return (Criteria) this;
        }

        public Criteria andLastopdatetimeBetween(Date value1, Date value2) {
            addCriterion("lastopdatetime between", value1, value2, "lastopdatetime");
            return (Criteria) this;
        }

        public Criteria andLastopdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("lastopdatetime not between", value1, value2, "lastopdatetime");
            return (Criteria) this;
        }

        public Criteria andInputdatetimeIsNull() {
            addCriterion("inputdatetime is null");
            return (Criteria) this;
        }

        public Criteria andInputdatetimeIsNotNull() {
            addCriterion("inputdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andInputdatetimeEqualTo(Date value) {
            addCriterion("inputdatetime =", value, "inputdatetime");
            return (Criteria) this;
        }

        public Criteria andInputdatetimeNotEqualTo(Date value) {
            addCriterion("inputdatetime <>", value, "inputdatetime");
            return (Criteria) this;
        }

        public Criteria andInputdatetimeGreaterThan(Date value) {
            addCriterion("inputdatetime >", value, "inputdatetime");
            return (Criteria) this;
        }

        public Criteria andInputdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inputdatetime >=", value, "inputdatetime");
            return (Criteria) this;
        }

        public Criteria andInputdatetimeLessThan(Date value) {
            addCriterion("inputdatetime <", value, "inputdatetime");
            return (Criteria) this;
        }

        public Criteria andInputdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("inputdatetime <=", value, "inputdatetime");
            return (Criteria) this;
        }

        public Criteria andInputdatetimeIn(List<Date> values) {
            addCriterion("inputdatetime in", values, "inputdatetime");
            return (Criteria) this;
        }

        public Criteria andInputdatetimeNotIn(List<Date> values) {
            addCriterion("inputdatetime not in", values, "inputdatetime");
            return (Criteria) this;
        }

        public Criteria andInputdatetimeBetween(Date value1, Date value2) {
            addCriterion("inputdatetime between", value1, value2, "inputdatetime");
            return (Criteria) this;
        }

        public Criteria andInputdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("inputdatetime not between", value1, value2, "inputdatetime");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNull() {
            addCriterion("hibernateversion is null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIsNotNull() {
            addCriterion("hibernateversion is not null");
            return (Criteria) this;
        }

        public Criteria andHibernateversionEqualTo(Long value) {
            addCriterion("hibernateversion =", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotEqualTo(Long value) {
            addCriterion("hibernateversion <>", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThan(Long value) {
            addCriterion("hibernateversion >", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionGreaterThanOrEqualTo(Long value) {
            addCriterion("hibernateversion >=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThan(Long value) {
            addCriterion("hibernateversion <", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionLessThanOrEqualTo(Long value) {
            addCriterion("hibernateversion <=", value, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionIn(List<Long> values) {
            addCriterion("hibernateversion in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotIn(List<Long> values) {
            addCriterion("hibernateversion not in", values, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionBetween(Long value1, Long value2) {
            addCriterion("hibernateversion between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andHibernateversionNotBetween(Long value1, Long value2) {
            addCriterion("hibernateversion not between", value1, value2, "hibernateversion");
            return (Criteria) this;
        }

        public Criteria andIssplittedIsNull() {
            addCriterion("issplitted is null");
            return (Criteria) this;
        }

        public Criteria andIssplittedIsNotNull() {
            addCriterion("issplitted is not null");
            return (Criteria) this;
        }

        public Criteria andIssplittedEqualTo(String value) {
            addCriterion("issplitted =", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotEqualTo(String value) {
            addCriterion("issplitted <>", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThan(String value) {
            addCriterion("issplitted >", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedGreaterThanOrEqualTo(String value) {
            addCriterion("issplitted >=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThan(String value) {
            addCriterion("issplitted <", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLessThanOrEqualTo(String value) {
            addCriterion("issplitted <=", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedLike(String value) {
            addCriterion("issplitted like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotLike(String value) {
            addCriterion("issplitted not like", value, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedIn(List<String> values) {
            addCriterion("issplitted in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotIn(List<String> values) {
            addCriterion("issplitted not in", values, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedBetween(String value1, String value2) {
            addCriterion("issplitted between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andIssplittedNotBetween(String value1, String value2) {
            addCriterion("issplitted not between", value1, value2, "issplitted");
            return (Criteria) this;
        }

        public Criteria andSummarynoIsNull() {
            addCriterion("summaryno is null");
            return (Criteria) this;
        }

        public Criteria andSummarynoIsNotNull() {
            addCriterion("summaryno is not null");
            return (Criteria) this;
        }

        public Criteria andSummarynoEqualTo(String value) {
            addCriterion("summaryno =", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotEqualTo(String value) {
            addCriterion("summaryno <>", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoGreaterThan(String value) {
            addCriterion("summaryno >", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoGreaterThanOrEqualTo(String value) {
            addCriterion("summaryno >=", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLessThan(String value) {
            addCriterion("summaryno <", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLessThanOrEqualTo(String value) {
            addCriterion("summaryno <=", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoLike(String value) {
            addCriterion("summaryno like", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotLike(String value) {
            addCriterion("summaryno not like", value, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoIn(List<String> values) {
            addCriterion("summaryno in", values, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotIn(List<String> values) {
            addCriterion("summaryno not in", values, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoBetween(String value1, String value2) {
            addCriterion("summaryno between", value1, value2, "summaryno");
            return (Criteria) this;
        }

        public Criteria andSummarynoNotBetween(String value1, String value2) {
            addCriterion("summaryno not between", value1, value2, "summaryno");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNull() {
            addCriterion("modifydesc is null");
            return (Criteria) this;
        }

        public Criteria andModifydescIsNotNull() {
            addCriterion("modifydesc is not null");
            return (Criteria) this;
        }

        public Criteria andModifydescEqualTo(String value) {
            addCriterion("modifydesc =", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotEqualTo(String value) {
            addCriterion("modifydesc <>", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThan(String value) {
            addCriterion("modifydesc >", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescGreaterThanOrEqualTo(String value) {
            addCriterion("modifydesc >=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThan(String value) {
            addCriterion("modifydesc <", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLessThanOrEqualTo(String value) {
            addCriterion("modifydesc <=", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescLike(String value) {
            addCriterion("modifydesc like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotLike(String value) {
            addCriterion("modifydesc not like", value, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescIn(List<String> values) {
            addCriterion("modifydesc in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotIn(List<String> values) {
            addCriterion("modifydesc not in", values, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescBetween(String value1, String value2) {
            addCriterion("modifydesc between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andModifydescNotBetween(String value1, String value2) {
            addCriterion("modifydesc not between", value1, value2, "modifydesc");
            return (Criteria) this;
        }

        public Criteria andTounitcodeIsNull() {
            addCriterion("tounitcode is null");
            return (Criteria) this;
        }

        public Criteria andTounitcodeIsNotNull() {
            addCriterion("tounitcode is not null");
            return (Criteria) this;
        }

        public Criteria andTounitcodeEqualTo(String value) {
            addCriterion("tounitcode =", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeNotEqualTo(String value) {
            addCriterion("tounitcode <>", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeGreaterThan(String value) {
            addCriterion("tounitcode >", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("tounitcode >=", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeLessThan(String value) {
            addCriterion("tounitcode <", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeLessThanOrEqualTo(String value) {
            addCriterion("tounitcode <=", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeLike(String value) {
            addCriterion("tounitcode like", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeNotLike(String value) {
            addCriterion("tounitcode not like", value, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeIn(List<String> values) {
            addCriterion("tounitcode in", values, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeNotIn(List<String> values) {
            addCriterion("tounitcode not in", values, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeBetween(String value1, String value2) {
            addCriterion("tounitcode between", value1, value2, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andTounitcodeNotBetween(String value1, String value2) {
            addCriterion("tounitcode not between", value1, value2, "tounitcode");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoIsNull() {
            addCriterion("newdetailno is null");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoIsNotNull() {
            addCriterion("newdetailno is not null");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoEqualTo(Long value) {
            addCriterion("newdetailno =", value, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoNotEqualTo(Long value) {
            addCriterion("newdetailno <>", value, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoGreaterThan(Long value) {
            addCriterion("newdetailno >", value, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoGreaterThanOrEqualTo(Long value) {
            addCriterion("newdetailno >=", value, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoLessThan(Long value) {
            addCriterion("newdetailno <", value, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoLessThanOrEqualTo(Long value) {
            addCriterion("newdetailno <=", value, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoIn(List<Long> values) {
            addCriterion("newdetailno in", values, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoNotIn(List<Long> values) {
            addCriterion("newdetailno not in", values, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoBetween(Long value1, Long value2) {
            addCriterion("newdetailno between", value1, value2, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andNewdetailnoNotBetween(Long value1, Long value2) {
            addCriterion("newdetailno not between", value1, value2, "newdetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoIsNull() {
            addCriterion("olddetailno is null");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoIsNotNull() {
            addCriterion("olddetailno is not null");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoEqualTo(Long value) {
            addCriterion("olddetailno =", value, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoNotEqualTo(Long value) {
            addCriterion("olddetailno <>", value, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoGreaterThan(Long value) {
            addCriterion("olddetailno >", value, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoGreaterThanOrEqualTo(Long value) {
            addCriterion("olddetailno >=", value, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoLessThan(Long value) {
            addCriterion("olddetailno <", value, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoLessThanOrEqualTo(Long value) {
            addCriterion("olddetailno <=", value, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoIn(List<Long> values) {
            addCriterion("olddetailno in", values, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoNotIn(List<Long> values) {
            addCriterion("olddetailno not in", values, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoBetween(Long value1, Long value2) {
            addCriterion("olddetailno between", value1, value2, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andOlddetailnoNotBetween(Long value1, Long value2) {
            addCriterion("olddetailno not between", value1, value2, "olddetailno");
            return (Criteria) this;
        }

        public Criteria andExcangerateIsNull() {
            addCriterion("excangerate is null");
            return (Criteria) this;
        }

        public Criteria andExcangerateIsNotNull() {
            addCriterion("excangerate is not null");
            return (Criteria) this;
        }

        public Criteria andExcangerateEqualTo(BigDecimal value) {
            addCriterion("excangerate =", value, "excangerate");
            return (Criteria) this;
        }

        public Criteria andExcangerateNotEqualTo(BigDecimal value) {
            addCriterion("excangerate <>", value, "excangerate");
            return (Criteria) this;
        }

        public Criteria andExcangerateGreaterThan(BigDecimal value) {
            addCriterion("excangerate >", value, "excangerate");
            return (Criteria) this;
        }

        public Criteria andExcangerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("excangerate >=", value, "excangerate");
            return (Criteria) this;
        }

        public Criteria andExcangerateLessThan(BigDecimal value) {
            addCriterion("excangerate <", value, "excangerate");
            return (Criteria) this;
        }

        public Criteria andExcangerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("excangerate <=", value, "excangerate");
            return (Criteria) this;
        }

        public Criteria andExcangerateIn(List<BigDecimal> values) {
            addCriterion("excangerate in", values, "excangerate");
            return (Criteria) this;
        }

        public Criteria andExcangerateNotIn(List<BigDecimal> values) {
            addCriterion("excangerate not in", values, "excangerate");
            return (Criteria) this;
        }

        public Criteria andExcangerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("excangerate between", value1, value2, "excangerate");
            return (Criteria) this;
        }

        public Criteria andExcangerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("excangerate not between", value1, value2, "excangerate");
            return (Criteria) this;
        }

        public Criteria andGroupflagIsNull() {
            addCriterion("groupflag is null");
            return (Criteria) this;
        }

        public Criteria andGroupflagIsNotNull() {
            addCriterion("groupflag is not null");
            return (Criteria) this;
        }

        public Criteria andGroupflagEqualTo(String value) {
            addCriterion("groupflag =", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotEqualTo(String value) {
            addCriterion("groupflag <>", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagGreaterThan(String value) {
            addCriterion("groupflag >", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagGreaterThanOrEqualTo(String value) {
            addCriterion("groupflag >=", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagLessThan(String value) {
            addCriterion("groupflag <", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagLessThanOrEqualTo(String value) {
            addCriterion("groupflag <=", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagLike(String value) {
            addCriterion("groupflag like", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotLike(String value) {
            addCriterion("groupflag not like", value, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagIn(List<String> values) {
            addCriterion("groupflag in", values, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotIn(List<String> values) {
            addCriterion("groupflag not in", values, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagBetween(String value1, String value2) {
            addCriterion("groupflag between", value1, value2, "groupflag");
            return (Criteria) this;
        }

        public Criteria andGroupflagNotBetween(String value1, String value2) {
            addCriterion("groupflag not between", value1, value2, "groupflag");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIsNull() {
            addCriterion("businessno is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIsNotNull() {
            addCriterion("businessno is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnoEqualTo(String value) {
            addCriterion("businessno =", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotEqualTo(String value) {
            addCriterion("businessno <>", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThan(String value) {
            addCriterion("businessno >", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoGreaterThanOrEqualTo(String value) {
            addCriterion("businessno >=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThan(String value) {
            addCriterion("businessno <", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLessThanOrEqualTo(String value) {
            addCriterion("businessno <=", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoLike(String value) {
            addCriterion("businessno like", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotLike(String value) {
            addCriterion("businessno not like", value, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoIn(List<String> values) {
            addCriterion("businessno in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotIn(List<String> values) {
            addCriterion("businessno not in", values, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoBetween(String value1, String value2) {
            addCriterion("businessno between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinessnoNotBetween(String value1, String value2) {
            addCriterion("businessno not between", value1, value2, "businessno");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIsNull() {
            addCriterion("businesssource is null");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIsNotNull() {
            addCriterion("businesssource is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceEqualTo(String value) {
            addCriterion("businesssource =", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotEqualTo(String value) {
            addCriterion("businesssource <>", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceGreaterThan(String value) {
            addCriterion("businesssource >", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceGreaterThanOrEqualTo(String value) {
            addCriterion("businesssource >=", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLessThan(String value) {
            addCriterion("businesssource <", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLessThanOrEqualTo(String value) {
            addCriterion("businesssource <=", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceLike(String value) {
            addCriterion("businesssource like", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotLike(String value) {
            addCriterion("businesssource not like", value, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceIn(List<String> values) {
            addCriterion("businesssource in", values, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotIn(List<String> values) {
            addCriterion("businesssource not in", values, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceBetween(String value1, String value2) {
            addCriterion("businesssource between", value1, value2, "businesssource");
            return (Criteria) this;
        }

        public Criteria andBusinesssourceNotBetween(String value1, String value2) {
            addCriterion("businesssource not between", value1, value2, "businesssource");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNull() {
            addCriterion("grouptype is null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNotNull() {
            addCriterion("grouptype is not null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeEqualTo(String value) {
            addCriterion("grouptype =", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotEqualTo(String value) {
            addCriterion("grouptype <>", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThan(String value) {
            addCriterion("grouptype >", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThanOrEqualTo(String value) {
            addCriterion("grouptype >=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThan(String value) {
            addCriterion("grouptype <", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThanOrEqualTo(String value) {
            addCriterion("grouptype <=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLike(String value) {
            addCriterion("grouptype like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotLike(String value) {
            addCriterion("grouptype not like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIn(List<String> values) {
            addCriterion("grouptype in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotIn(List<String> values) {
            addCriterion("grouptype not in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeBetween(String value1, String value2) {
            addCriterion("grouptype between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotBetween(String value1, String value2) {
            addCriterion("grouptype not between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNull() {
            addCriterion("batchnumber is null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNotNull() {
            addCriterion("batchnumber is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberEqualTo(String value) {
            addCriterion("batchnumber =", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotEqualTo(String value) {
            addCriterion("batchnumber <>", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThan(String value) {
            addCriterion("batchnumber >", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("batchnumber >=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThan(String value) {
            addCriterion("batchnumber <", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThanOrEqualTo(String value) {
            addCriterion("batchnumber <=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLike(String value) {
            addCriterion("batchnumber like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotLike(String value) {
            addCriterion("batchnumber not like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIn(List<String> values) {
            addCriterion("batchnumber in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotIn(List<String> values) {
            addCriterion("batchnumber not in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberBetween(String value1, String value2) {
            addCriterion("batchnumber between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotBetween(String value1, String value2) {
            addCriterion("batchnumber not between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceIsNull() {
            addCriterion("outdatasource is null");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceIsNotNull() {
            addCriterion("outdatasource is not null");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceEqualTo(String value) {
            addCriterion("outdatasource =", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotEqualTo(String value) {
            addCriterion("outdatasource <>", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceGreaterThan(String value) {
            addCriterion("outdatasource >", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("outdatasource >=", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceLessThan(String value) {
            addCriterion("outdatasource <", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceLessThanOrEqualTo(String value) {
            addCriterion("outdatasource <=", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceLike(String value) {
            addCriterion("outdatasource like", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotLike(String value) {
            addCriterion("outdatasource not like", value, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceIn(List<String> values) {
            addCriterion("outdatasource in", values, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotIn(List<String> values) {
            addCriterion("outdatasource not in", values, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceBetween(String value1, String value2) {
            addCriterion("outdatasource between", value1, value2, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andOutdatasourceNotBetween(String value1, String value2) {
            addCriterion("outdatasource not between", value1, value2, "outdatasource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceIsNull() {
            addCriterion("customersource is null");
            return (Criteria) this;
        }

        public Criteria andCustomersourceIsNotNull() {
            addCriterion("customersource is not null");
            return (Criteria) this;
        }

        public Criteria andCustomersourceEqualTo(String value) {
            addCriterion("customersource =", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceNotEqualTo(String value) {
            addCriterion("customersource <>", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceGreaterThan(String value) {
            addCriterion("customersource >", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceGreaterThanOrEqualTo(String value) {
            addCriterion("customersource >=", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceLessThan(String value) {
            addCriterion("customersource <", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceLessThanOrEqualTo(String value) {
            addCriterion("customersource <=", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceLike(String value) {
            addCriterion("customersource like", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceNotLike(String value) {
            addCriterion("customersource not like", value, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceIn(List<String> values) {
            addCriterion("customersource in", values, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceNotIn(List<String> values) {
            addCriterion("customersource not in", values, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceBetween(String value1, String value2) {
            addCriterion("customersource between", value1, value2, "customersource");
            return (Criteria) this;
        }

        public Criteria andCustomersourceNotBetween(String value1, String value2) {
            addCriterion("customersource not between", value1, value2, "customersource");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIsNull() {
            addCriterion("agenttype is null");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIsNotNull() {
            addCriterion("agenttype is not null");
            return (Criteria) this;
        }

        public Criteria andAgenttypeEqualTo(String value) {
            addCriterion("agenttype =", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotEqualTo(String value) {
            addCriterion("agenttype <>", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeGreaterThan(String value) {
            addCriterion("agenttype >", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("agenttype >=", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLessThan(String value) {
            addCriterion("agenttype <", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLessThanOrEqualTo(String value) {
            addCriterion("agenttype <=", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLike(String value) {
            addCriterion("agenttype like", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotLike(String value) {
            addCriterion("agenttype not like", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIn(List<String> values) {
            addCriterion("agenttype in", values, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotIn(List<String> values) {
            addCriterion("agenttype not in", values, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeBetween(String value1, String value2) {
            addCriterion("agenttype between", value1, value2, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotBetween(String value1, String value2) {
            addCriterion("agenttype not between", value1, value2, "agenttype");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIsNull() {
            addCriterion("farmflagcode is null");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIsNotNull() {
            addCriterion("farmflagcode is not null");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeEqualTo(String value) {
            addCriterion("farmflagcode =", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotEqualTo(String value) {
            addCriterion("farmflagcode <>", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeGreaterThan(String value) {
            addCriterion("farmflagcode >", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeGreaterThanOrEqualTo(String value) {
            addCriterion("farmflagcode >=", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLessThan(String value) {
            addCriterion("farmflagcode <", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLessThanOrEqualTo(String value) {
            addCriterion("farmflagcode <=", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeLike(String value) {
            addCriterion("farmflagcode like", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotLike(String value) {
            addCriterion("farmflagcode not like", value, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeIn(List<String> values) {
            addCriterion("farmflagcode in", values, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotIn(List<String> values) {
            addCriterion("farmflagcode not in", values, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeBetween(String value1, String value2) {
            addCriterion("farmflagcode between", value1, value2, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andFarmflagcodeNotBetween(String value1, String value2) {
            addCriterion("farmflagcode not between", value1, value2, "farmflagcode");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceIsNull() {
            addCriterion("premiumsource is null");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceIsNotNull() {
            addCriterion("premiumsource is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceEqualTo(String value) {
            addCriterion("premiumsource =", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotEqualTo(String value) {
            addCriterion("premiumsource <>", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceGreaterThan(String value) {
            addCriterion("premiumsource >", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceGreaterThanOrEqualTo(String value) {
            addCriterion("premiumsource >=", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceLessThan(String value) {
            addCriterion("premiumsource <", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceLessThanOrEqualTo(String value) {
            addCriterion("premiumsource <=", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceLike(String value) {
            addCriterion("premiumsource like", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotLike(String value) {
            addCriterion("premiumsource not like", value, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceIn(List<String> values) {
            addCriterion("premiumsource in", values, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotIn(List<String> values) {
            addCriterion("premiumsource not in", values, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceBetween(String value1, String value2) {
            addCriterion("premiumsource between", value1, value2, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andPremiumsourceNotBetween(String value1, String value2) {
            addCriterion("premiumsource not between", value1, value2, "premiumsource");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIsNull() {
            addCriterion("useporperty is null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIsNotNull() {
            addCriterion("useporperty is not null");
            return (Criteria) this;
        }

        public Criteria andUseporpertyEqualTo(String value) {
            addCriterion("useporperty =", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotEqualTo(String value) {
            addCriterion("useporperty <>", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThan(String value) {
            addCriterion("useporperty >", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyGreaterThanOrEqualTo(String value) {
            addCriterion("useporperty >=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThan(String value) {
            addCriterion("useporperty <", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLessThanOrEqualTo(String value) {
            addCriterion("useporperty <=", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyLike(String value) {
            addCriterion("useporperty like", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotLike(String value) {
            addCriterion("useporperty not like", value, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyIn(List<String> values) {
            addCriterion("useporperty in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotIn(List<String> values) {
            addCriterion("useporperty not in", values, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyBetween(String value1, String value2) {
            addCriterion("useporperty between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andUseporpertyNotBetween(String value1, String value2) {
            addCriterion("useporperty not between", value1, value2, "useporperty");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNull() {
            addCriterion("vehkind is null");
            return (Criteria) this;
        }

        public Criteria andVehkindIsNotNull() {
            addCriterion("vehkind is not null");
            return (Criteria) this;
        }

        public Criteria andVehkindEqualTo(String value) {
            addCriterion("vehkind =", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotEqualTo(String value) {
            addCriterion("vehkind <>", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThan(String value) {
            addCriterion("vehkind >", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindGreaterThanOrEqualTo(String value) {
            addCriterion("vehkind >=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThan(String value) {
            addCriterion("vehkind <", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLessThanOrEqualTo(String value) {
            addCriterion("vehkind <=", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindLike(String value) {
            addCriterion("vehkind like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotLike(String value) {
            addCriterion("vehkind not like", value, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindIn(List<String> values) {
            addCriterion("vehkind in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotIn(List<String> values) {
            addCriterion("vehkind not in", values, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindBetween(String value1, String value2) {
            addCriterion("vehkind between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andVehkindNotBetween(String value1, String value2) {
            addCriterion("vehkind not between", value1, value2, "vehkind");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsIsNull() {
            addCriterion("characteristics is null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsIsNotNull() {
            addCriterion("characteristics is not null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsEqualTo(String value) {
            addCriterion("characteristics =", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotEqualTo(String value) {
            addCriterion("characteristics <>", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsGreaterThan(String value) {
            addCriterion("characteristics >", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsGreaterThanOrEqualTo(String value) {
            addCriterion("characteristics >=", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLessThan(String value) {
            addCriterion("characteristics <", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLessThanOrEqualTo(String value) {
            addCriterion("characteristics <=", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsLike(String value) {
            addCriterion("characteristics like", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotLike(String value) {
            addCriterion("characteristics not like", value, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsIn(List<String> values) {
            addCriterion("characteristics in", values, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotIn(List<String> values) {
            addCriterion("characteristics not in", values, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsBetween(String value1, String value2) {
            addCriterion("characteristics between", value1, value2, "characteristics");
            return (Criteria) this;
        }

        public Criteria andCharacteristicsNotBetween(String value1, String value2) {
            addCriterion("characteristics not between", value1, value2, "characteristics");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailIsNull() {
            addCriterion("farmtypedetail is null");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailIsNotNull() {
            addCriterion("farmtypedetail is not null");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailEqualTo(String value) {
            addCriterion("farmtypedetail =", value, "farmtypedetail");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailNotEqualTo(String value) {
            addCriterion("farmtypedetail <>", value, "farmtypedetail");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailGreaterThan(String value) {
            addCriterion("farmtypedetail >", value, "farmtypedetail");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailGreaterThanOrEqualTo(String value) {
            addCriterion("farmtypedetail >=", value, "farmtypedetail");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailLessThan(String value) {
            addCriterion("farmtypedetail <", value, "farmtypedetail");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailLessThanOrEqualTo(String value) {
            addCriterion("farmtypedetail <=", value, "farmtypedetail");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailLike(String value) {
            addCriterion("farmtypedetail like", value, "farmtypedetail");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailNotLike(String value) {
            addCriterion("farmtypedetail not like", value, "farmtypedetail");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailIn(List<String> values) {
            addCriterion("farmtypedetail in", values, "farmtypedetail");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailNotIn(List<String> values) {
            addCriterion("farmtypedetail not in", values, "farmtypedetail");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailBetween(String value1, String value2) {
            addCriterion("farmtypedetail between", value1, value2, "farmtypedetail");
            return (Criteria) this;
        }

        public Criteria andFarmtypedetailNotBetween(String value1, String value2) {
            addCriterion("farmtypedetail not between", value1, value2, "farmtypedetail");
            return (Criteria) this;
        }

        public Criteria andFarmflagIsNull() {
            addCriterion("farmflag is null");
            return (Criteria) this;
        }

        public Criteria andFarmflagIsNotNull() {
            addCriterion("farmflag is not null");
            return (Criteria) this;
        }

        public Criteria andFarmflagEqualTo(String value) {
            addCriterion("farmflag =", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotEqualTo(String value) {
            addCriterion("farmflag <>", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagGreaterThan(String value) {
            addCriterion("farmflag >", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagGreaterThanOrEqualTo(String value) {
            addCriterion("farmflag >=", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLessThan(String value) {
            addCriterion("farmflag <", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLessThanOrEqualTo(String value) {
            addCriterion("farmflag <=", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagLike(String value) {
            addCriterion("farmflag like", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotLike(String value) {
            addCriterion("farmflag not like", value, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagIn(List<String> values) {
            addCriterion("farmflag in", values, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotIn(List<String> values) {
            addCriterion("farmflag not in", values, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagBetween(String value1, String value2) {
            addCriterion("farmflag between", value1, value2, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarmflagNotBetween(String value1, String value2) {
            addCriterion("farmflag not between", value1, value2, "farmflag");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIsNull() {
            addCriterion("farpolicytype is null");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIsNotNull() {
            addCriterion("farpolicytype is not null");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeEqualTo(String value) {
            addCriterion("farpolicytype =", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotEqualTo(String value) {
            addCriterion("farpolicytype <>", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeGreaterThan(String value) {
            addCriterion("farpolicytype >", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeGreaterThanOrEqualTo(String value) {
            addCriterion("farpolicytype >=", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLessThan(String value) {
            addCriterion("farpolicytype <", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLessThanOrEqualTo(String value) {
            addCriterion("farpolicytype <=", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeLike(String value) {
            addCriterion("farpolicytype like", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotLike(String value) {
            addCriterion("farpolicytype not like", value, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeIn(List<String> values) {
            addCriterion("farpolicytype in", values, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotIn(List<String> values) {
            addCriterion("farpolicytype not in", values, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeBetween(String value1, String value2) {
            addCriterion("farpolicytype between", value1, value2, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andFarpolicytypeNotBetween(String value1, String value2) {
            addCriterion("farpolicytype not between", value1, value2, "farpolicytype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIsNull() {
            addCriterion("carusetype is null");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIsNotNull() {
            addCriterion("carusetype is not null");
            return (Criteria) this;
        }

        public Criteria andCarusetypeEqualTo(String value) {
            addCriterion("carusetype =", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotEqualTo(String value) {
            addCriterion("carusetype <>", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeGreaterThan(String value) {
            addCriterion("carusetype >", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeGreaterThanOrEqualTo(String value) {
            addCriterion("carusetype >=", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLessThan(String value) {
            addCriterion("carusetype <", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLessThanOrEqualTo(String value) {
            addCriterion("carusetype <=", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeLike(String value) {
            addCriterion("carusetype like", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotLike(String value) {
            addCriterion("carusetype not like", value, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeIn(List<String> values) {
            addCriterion("carusetype in", values, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotIn(List<String> values) {
            addCriterion("carusetype not in", values, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeBetween(String value1, String value2) {
            addCriterion("carusetype between", value1, value2, "carusetype");
            return (Criteria) this;
        }

        public Criteria andCarusetypeNotBetween(String value1, String value2) {
            addCriterion("carusetype not between", value1, value2, "carusetype");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_temp_business_detail
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
     * @Table : mm_temp_business_detail
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