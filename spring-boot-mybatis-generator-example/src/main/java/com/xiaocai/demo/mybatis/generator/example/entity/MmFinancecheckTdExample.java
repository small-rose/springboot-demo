package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MmFinancecheckTdExample {
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
    public MmFinancecheckTdExample() {
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
     * @Table : mm_financecheck_td
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andApplynoIsNull() {
            addCriterion("APPLYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNotNull() {
            addCriterion("APPLYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplynoEqualTo(String value) {
            addCriterion("APPLYNO =", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotEqualTo(String value) {
            addCriterion("APPLYNO <>", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThan(String value) {
            addCriterion("APPLYNO >", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYNO >=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThan(String value) {
            addCriterion("APPLYNO <", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThanOrEqualTo(String value) {
            addCriterion("APPLYNO <=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLike(String value) {
            addCriterion("APPLYNO like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotLike(String value) {
            addCriterion("APPLYNO not like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoIn(List<String> values) {
            addCriterion("APPLYNO in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotIn(List<String> values) {
            addCriterion("APPLYNO not in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoBetween(String value1, String value2) {
            addCriterion("APPLYNO between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotBetween(String value1, String value2) {
            addCriterion("APPLYNO not between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplycodeIsNull() {
            addCriterion("APPLYCODE is null");
            return (Criteria) this;
        }

        public Criteria andApplycodeIsNotNull() {
            addCriterion("APPLYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplycodeEqualTo(String value) {
            addCriterion("APPLYCODE =", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotEqualTo(String value) {
            addCriterion("APPLYCODE <>", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeGreaterThan(String value) {
            addCriterion("APPLYCODE >", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYCODE >=", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeLessThan(String value) {
            addCriterion("APPLYCODE <", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeLessThanOrEqualTo(String value) {
            addCriterion("APPLYCODE <=", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeLike(String value) {
            addCriterion("APPLYCODE like", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotLike(String value) {
            addCriterion("APPLYCODE not like", value, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeIn(List<String> values) {
            addCriterion("APPLYCODE in", values, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotIn(List<String> values) {
            addCriterion("APPLYCODE not in", values, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeBetween(String value1, String value2) {
            addCriterion("APPLYCODE between", value1, value2, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplycodeNotBetween(String value1, String value2) {
            addCriterion("APPLYCODE not between", value1, value2, "applycode");
            return (Criteria) this;
        }

        public Criteria andApplynameIsNull() {
            addCriterion("APPLYNAME is null");
            return (Criteria) this;
        }

        public Criteria andApplynameIsNotNull() {
            addCriterion("APPLYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andApplynameEqualTo(String value) {
            addCriterion("APPLYNAME =", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotEqualTo(String value) {
            addCriterion("APPLYNAME <>", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameGreaterThan(String value) {
            addCriterion("APPLYNAME >", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYNAME >=", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameLessThan(String value) {
            addCriterion("APPLYNAME <", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameLessThanOrEqualTo(String value) {
            addCriterion("APPLYNAME <=", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameLike(String value) {
            addCriterion("APPLYNAME like", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotLike(String value) {
            addCriterion("APPLYNAME not like", value, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameIn(List<String> values) {
            addCriterion("APPLYNAME in", values, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotIn(List<String> values) {
            addCriterion("APPLYNAME not in", values, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameBetween(String value1, String value2) {
            addCriterion("APPLYNAME between", value1, value2, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplynameNotBetween(String value1, String value2) {
            addCriterion("APPLYNAME not between", value1, value2, "applyname");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNull() {
            addCriterion("APPLYDATE is null");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNotNull() {
            addCriterion("APPLYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplydateEqualTo(Date value) {
            addCriterion("APPLYDATE =", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotEqualTo(Date value) {
            addCriterion("APPLYDATE <>", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThan(Date value) {
            addCriterion("APPLYDATE >", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLYDATE >=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThan(Date value) {
            addCriterion("APPLYDATE <", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThanOrEqualTo(Date value) {
            addCriterion("APPLYDATE <=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateIn(List<Date> values) {
            addCriterion("APPLYDATE in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotIn(List<Date> values) {
            addCriterion("APPLYDATE not in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateBetween(Date value1, Date value2) {
            addCriterion("APPLYDATE between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotBetween(Date value1, Date value2) {
            addCriterion("APPLYDATE not between", value1, value2, "applydate");
            return (Criteria) this;
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

        public Criteria andAttachmentcodeIsNull() {
            addCriterion("ATTACHMENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeIsNotNull() {
            addCriterion("ATTACHMENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeEqualTo(String value) {
            addCriterion("ATTACHMENTCODE =", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeNotEqualTo(String value) {
            addCriterion("ATTACHMENTCODE <>", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeGreaterThan(String value) {
            addCriterion("ATTACHMENTCODE >", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHMENTCODE >=", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeLessThan(String value) {
            addCriterion("ATTACHMENTCODE <", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeLessThanOrEqualTo(String value) {
            addCriterion("ATTACHMENTCODE <=", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeLike(String value) {
            addCriterion("ATTACHMENTCODE like", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeNotLike(String value) {
            addCriterion("ATTACHMENTCODE not like", value, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeIn(List<String> values) {
            addCriterion("ATTACHMENTCODE in", values, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeNotIn(List<String> values) {
            addCriterion("ATTACHMENTCODE not in", values, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeBetween(String value1, String value2) {
            addCriterion("ATTACHMENTCODE between", value1, value2, "attachmentcode");
            return (Criteria) this;
        }

        public Criteria andAttachmentcodeNotBetween(String value1, String value2) {
            addCriterion("ATTACHMENTCODE not between", value1, value2, "attachmentcode");
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

        public Criteria andTotalcountIsNull() {
            addCriterion("TOTALCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalcountIsNotNull() {
            addCriterion("TOTALCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcountEqualTo(Long value) {
            addCriterion("TOTALCOUNT =", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotEqualTo(Long value) {
            addCriterion("TOTALCOUNT <>", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountGreaterThan(Long value) {
            addCriterion("TOTALCOUNT >", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTALCOUNT >=", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountLessThan(Long value) {
            addCriterion("TOTALCOUNT <", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountLessThanOrEqualTo(Long value) {
            addCriterion("TOTALCOUNT <=", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountIn(List<Long> values) {
            addCriterion("TOTALCOUNT in", values, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotIn(List<Long> values) {
            addCriterion("TOTALCOUNT not in", values, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountBetween(Long value1, Long value2) {
            addCriterion("TOTALCOUNT between", value1, value2, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotBetween(Long value1, Long value2) {
            addCriterion("TOTALCOUNT not between", value1, value2, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNull() {
            addCriterion("TOTALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNotNull() {
            addCriterion("TOTALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountEqualTo(BigDecimal value) {
            addCriterion("TOTALAMOUNT =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(BigDecimal value) {
            addCriterion("TOTALAMOUNT <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(BigDecimal value) {
            addCriterion("TOTALAMOUNT >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALAMOUNT >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(BigDecimal value) {
            addCriterion("TOTALAMOUNT <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALAMOUNT <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<BigDecimal> values) {
            addCriterion("TOTALAMOUNT in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<BigDecimal> values) {
            addCriterion("TOTALAMOUNT not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALAMOUNT between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALAMOUNT not between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountIsNull() {
            addCriterion("SUCCESSCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSuccesscountIsNotNull() {
            addCriterion("SUCCESSCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSuccesscountEqualTo(Long value) {
            addCriterion("SUCCESSCOUNT =", value, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountNotEqualTo(Long value) {
            addCriterion("SUCCESSCOUNT <>", value, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountGreaterThan(Long value) {
            addCriterion("SUCCESSCOUNT >", value, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountGreaterThanOrEqualTo(Long value) {
            addCriterion("SUCCESSCOUNT >=", value, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountLessThan(Long value) {
            addCriterion("SUCCESSCOUNT <", value, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountLessThanOrEqualTo(Long value) {
            addCriterion("SUCCESSCOUNT <=", value, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountIn(List<Long> values) {
            addCriterion("SUCCESSCOUNT in", values, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountNotIn(List<Long> values) {
            addCriterion("SUCCESSCOUNT not in", values, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountBetween(Long value1, Long value2) {
            addCriterion("SUCCESSCOUNT between", value1, value2, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccesscountNotBetween(Long value1, Long value2) {
            addCriterion("SUCCESSCOUNT not between", value1, value2, "successcount");
            return (Criteria) this;
        }

        public Criteria andSuccessmountIsNull() {
            addCriterion("SUCCESSMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSuccessmountIsNotNull() {
            addCriterion("SUCCESSMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessmountEqualTo(BigDecimal value) {
            addCriterion("SUCCESSMOUNT =", value, "successmount");
            return (Criteria) this;
        }

        public Criteria andSuccessmountNotEqualTo(BigDecimal value) {
            addCriterion("SUCCESSMOUNT <>", value, "successmount");
            return (Criteria) this;
        }

        public Criteria andSuccessmountGreaterThan(BigDecimal value) {
            addCriterion("SUCCESSMOUNT >", value, "successmount");
            return (Criteria) this;
        }

        public Criteria andSuccessmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUCCESSMOUNT >=", value, "successmount");
            return (Criteria) this;
        }

        public Criteria andSuccessmountLessThan(BigDecimal value) {
            addCriterion("SUCCESSMOUNT <", value, "successmount");
            return (Criteria) this;
        }

        public Criteria andSuccessmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUCCESSMOUNT <=", value, "successmount");
            return (Criteria) this;
        }

        public Criteria andSuccessmountIn(List<BigDecimal> values) {
            addCriterion("SUCCESSMOUNT in", values, "successmount");
            return (Criteria) this;
        }

        public Criteria andSuccessmountNotIn(List<BigDecimal> values) {
            addCriterion("SUCCESSMOUNT not in", values, "successmount");
            return (Criteria) this;
        }

        public Criteria andSuccessmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUCCESSMOUNT between", value1, value2, "successmount");
            return (Criteria) this;
        }

        public Criteria andSuccessmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUCCESSMOUNT not between", value1, value2, "successmount");
            return (Criteria) this;
        }

        public Criteria andFailcountIsNull() {
            addCriterion("FAILCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFailcountIsNotNull() {
            addCriterion("FAILCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFailcountEqualTo(Long value) {
            addCriterion("FAILCOUNT =", value, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountNotEqualTo(Long value) {
            addCriterion("FAILCOUNT <>", value, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountGreaterThan(Long value) {
            addCriterion("FAILCOUNT >", value, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountGreaterThanOrEqualTo(Long value) {
            addCriterion("FAILCOUNT >=", value, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountLessThan(Long value) {
            addCriterion("FAILCOUNT <", value, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountLessThanOrEqualTo(Long value) {
            addCriterion("FAILCOUNT <=", value, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountIn(List<Long> values) {
            addCriterion("FAILCOUNT in", values, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountNotIn(List<Long> values) {
            addCriterion("FAILCOUNT not in", values, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountBetween(Long value1, Long value2) {
            addCriterion("FAILCOUNT between", value1, value2, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailcountNotBetween(Long value1, Long value2) {
            addCriterion("FAILCOUNT not between", value1, value2, "failcount");
            return (Criteria) this;
        }

        public Criteria andFailamountIsNull() {
            addCriterion("FAILAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFailamountIsNotNull() {
            addCriterion("FAILAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFailamountEqualTo(BigDecimal value) {
            addCriterion("FAILAMOUNT =", value, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountNotEqualTo(BigDecimal value) {
            addCriterion("FAILAMOUNT <>", value, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountGreaterThan(BigDecimal value) {
            addCriterion("FAILAMOUNT >", value, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAILAMOUNT >=", value, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountLessThan(BigDecimal value) {
            addCriterion("FAILAMOUNT <", value, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAILAMOUNT <=", value, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountIn(List<BigDecimal> values) {
            addCriterion("FAILAMOUNT in", values, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountNotIn(List<BigDecimal> values) {
            addCriterion("FAILAMOUNT not in", values, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAILAMOUNT between", value1, value2, "failamount");
            return (Criteria) this;
        }

        public Criteria andFailamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAILAMOUNT not between", value1, value2, "failamount");
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

        public Criteria andApplytypeIsNull() {
            addCriterion("APPLYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNotNull() {
            addCriterion("APPLYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApplytypeEqualTo(String value) {
            addCriterion("APPLYTYPE =", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotEqualTo(String value) {
            addCriterion("APPLYTYPE <>", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThan(String value) {
            addCriterion("APPLYTYPE >", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYTYPE >=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThan(String value) {
            addCriterion("APPLYTYPE <", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThanOrEqualTo(String value) {
            addCriterion("APPLYTYPE <=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLike(String value) {
            addCriterion("APPLYTYPE like", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotLike(String value) {
            addCriterion("APPLYTYPE not like", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeIn(List<String> values) {
            addCriterion("APPLYTYPE in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotIn(List<String> values) {
            addCriterion("APPLYTYPE not in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeBetween(String value1, String value2) {
            addCriterion("APPLYTYPE between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotBetween(String value1, String value2) {
            addCriterion("APPLYTYPE not between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeIsNull() {
            addCriterion("PROCESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProcesstypeIsNotNull() {
            addCriterion("PROCESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProcesstypeEqualTo(String value) {
            addCriterion("PROCESSTYPE =", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeNotEqualTo(String value) {
            addCriterion("PROCESSTYPE <>", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeGreaterThan(String value) {
            addCriterion("PROCESSTYPE >", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSTYPE >=", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeLessThan(String value) {
            addCriterion("PROCESSTYPE <", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeLessThanOrEqualTo(String value) {
            addCriterion("PROCESSTYPE <=", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeLike(String value) {
            addCriterion("PROCESSTYPE like", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeNotLike(String value) {
            addCriterion("PROCESSTYPE not like", value, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeIn(List<String> values) {
            addCriterion("PROCESSTYPE in", values, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeNotIn(List<String> values) {
            addCriterion("PROCESSTYPE not in", values, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeBetween(String value1, String value2) {
            addCriterion("PROCESSTYPE between", value1, value2, "processtype");
            return (Criteria) this;
        }

        public Criteria andProcesstypeNotBetween(String value1, String value2) {
            addCriterion("PROCESSTYPE not between", value1, value2, "processtype");
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

        public Criteria andResultcodeIsNull() {
            addCriterion("RESULTCODE is null");
            return (Criteria) this;
        }

        public Criteria andResultcodeIsNotNull() {
            addCriterion("RESULTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andResultcodeEqualTo(String value) {
            addCriterion("RESULTCODE =", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeNotEqualTo(String value) {
            addCriterion("RESULTCODE <>", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeGreaterThan(String value) {
            addCriterion("RESULTCODE >", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESULTCODE >=", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeLessThan(String value) {
            addCriterion("RESULTCODE <", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeLessThanOrEqualTo(String value) {
            addCriterion("RESULTCODE <=", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeLike(String value) {
            addCriterion("RESULTCODE like", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeNotLike(String value) {
            addCriterion("RESULTCODE not like", value, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeIn(List<String> values) {
            addCriterion("RESULTCODE in", values, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeNotIn(List<String> values) {
            addCriterion("RESULTCODE not in", values, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeBetween(String value1, String value2) {
            addCriterion("RESULTCODE between", value1, value2, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultcodeNotBetween(String value1, String value2) {
            addCriterion("RESULTCODE not between", value1, value2, "resultcode");
            return (Criteria) this;
        }

        public Criteria andResultreasonIsNull() {
            addCriterion("RESULTREASON is null");
            return (Criteria) this;
        }

        public Criteria andResultreasonIsNotNull() {
            addCriterion("RESULTREASON is not null");
            return (Criteria) this;
        }

        public Criteria andResultreasonEqualTo(String value) {
            addCriterion("RESULTREASON =", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonNotEqualTo(String value) {
            addCriterion("RESULTREASON <>", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonGreaterThan(String value) {
            addCriterion("RESULTREASON >", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonGreaterThanOrEqualTo(String value) {
            addCriterion("RESULTREASON >=", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonLessThan(String value) {
            addCriterion("RESULTREASON <", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonLessThanOrEqualTo(String value) {
            addCriterion("RESULTREASON <=", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonLike(String value) {
            addCriterion("RESULTREASON like", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonNotLike(String value) {
            addCriterion("RESULTREASON not like", value, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonIn(List<String> values) {
            addCriterion("RESULTREASON in", values, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonNotIn(List<String> values) {
            addCriterion("RESULTREASON not in", values, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonBetween(String value1, String value2) {
            addCriterion("RESULTREASON between", value1, value2, "resultreason");
            return (Criteria) this;
        }

        public Criteria andResultreasonNotBetween(String value1, String value2) {
            addCriterion("RESULTREASON not between", value1, value2, "resultreason");
            return (Criteria) this;
        }

        public Criteria andPressflagIsNull() {
            addCriterion("PRESSFLAG is null");
            return (Criteria) this;
        }

        public Criteria andPressflagIsNotNull() {
            addCriterion("PRESSFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPressflagEqualTo(String value) {
            addCriterion("PRESSFLAG =", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagNotEqualTo(String value) {
            addCriterion("PRESSFLAG <>", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagGreaterThan(String value) {
            addCriterion("PRESSFLAG >", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagGreaterThanOrEqualTo(String value) {
            addCriterion("PRESSFLAG >=", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagLessThan(String value) {
            addCriterion("PRESSFLAG <", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagLessThanOrEqualTo(String value) {
            addCriterion("PRESSFLAG <=", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagLike(String value) {
            addCriterion("PRESSFLAG like", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagNotLike(String value) {
            addCriterion("PRESSFLAG not like", value, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagIn(List<String> values) {
            addCriterion("PRESSFLAG in", values, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagNotIn(List<String> values) {
            addCriterion("PRESSFLAG not in", values, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagBetween(String value1, String value2) {
            addCriterion("PRESSFLAG between", value1, value2, "pressflag");
            return (Criteria) this;
        }

        public Criteria andPressflagNotBetween(String value1, String value2) {
            addCriterion("PRESSFLAG not between", value1, value2, "pressflag");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNull() {
            addCriterion("OPDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpdateIsNotNull() {
            addCriterion("OPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpdateEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE =", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE <>", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThan(Date value) {
            addCriterionForJDBCDate("OPDATE >", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE >=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThan(Date value) {
            addCriterionForJDBCDate("OPDATE <", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPDATE <=", value, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateIn(List<Date> values) {
            addCriterionForJDBCDate("OPDATE in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPDATE not in", values, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPDATE between", value1, value2, "opdate");
            return (Criteria) this;
        }

        public Criteria andOpdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPDATE not between", value1, value2, "opdate");
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

        public Criteria andChecktimesIsNull() {
            addCriterion("CHECKTIMES is null");
            return (Criteria) this;
        }

        public Criteria andChecktimesIsNotNull() {
            addCriterion("CHECKTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimesEqualTo(BigDecimal value) {
            addCriterion("CHECKTIMES =", value, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesNotEqualTo(BigDecimal value) {
            addCriterion("CHECKTIMES <>", value, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesGreaterThan(BigDecimal value) {
            addCriterion("CHECKTIMES >", value, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKTIMES >=", value, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesLessThan(BigDecimal value) {
            addCriterion("CHECKTIMES <", value, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKTIMES <=", value, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesIn(List<BigDecimal> values) {
            addCriterion("CHECKTIMES in", values, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesNotIn(List<BigDecimal> values) {
            addCriterion("CHECKTIMES not in", values, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKTIMES between", value1, value2, "checktimes");
            return (Criteria) this;
        }

        public Criteria andChecktimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKTIMES not between", value1, value2, "checktimes");
            return (Criteria) this;
        }

        public Criteria andOptypeIsNull() {
            addCriterion("OPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOptypeIsNotNull() {
            addCriterion("OPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOptypeEqualTo(String value) {
            addCriterion("OPTYPE =", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotEqualTo(String value) {
            addCriterion("OPTYPE <>", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeGreaterThan(String value) {
            addCriterion("OPTYPE >", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPTYPE >=", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLessThan(String value) {
            addCriterion("OPTYPE <", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLessThanOrEqualTo(String value) {
            addCriterion("OPTYPE <=", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeLike(String value) {
            addCriterion("OPTYPE like", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotLike(String value) {
            addCriterion("OPTYPE not like", value, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeIn(List<String> values) {
            addCriterion("OPTYPE in", values, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotIn(List<String> values) {
            addCriterion("OPTYPE not in", values, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeBetween(String value1, String value2) {
            addCriterion("OPTYPE between", value1, value2, "optype");
            return (Criteria) this;
        }

        public Criteria andOptypeNotBetween(String value1, String value2) {
            addCriterion("OPTYPE not between", value1, value2, "optype");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_financecheck_td
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
     * @Table : mm_financecheck_td
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