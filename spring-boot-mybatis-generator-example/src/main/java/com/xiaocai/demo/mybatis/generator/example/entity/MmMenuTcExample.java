package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmMenuTcExample {
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
    public MmMenuTcExample() {
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
     * @Table : mm_menu_tc
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

        public Criteria andMenuidIsNull() {
            addCriterion("MENUID is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("MENUID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Long value) {
            addCriterion("MENUID =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Long value) {
            addCriterion("MENUID <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Long value) {
            addCriterion("MENUID >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Long value) {
            addCriterion("MENUID >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Long value) {
            addCriterion("MENUID <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Long value) {
            addCriterion("MENUID <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Long> values) {
            addCriterion("MENUID in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Long> values) {
            addCriterion("MENUID not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Long value1, Long value2) {
            addCriterion("MENUID between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Long value1, Long value2) {
            addCriterion("MENUID not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("MENUNAME is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("MENUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("MENUNAME =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("MENUNAME <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("MENUNAME >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("MENUNAME >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("MENUNAME <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("MENUNAME <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("MENUNAME like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("MENUNAME not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("MENUNAME in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("MENUNAME not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("MENUNAME between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("MENUNAME not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenuactionIsNull() {
            addCriterion("MENUACTION is null");
            return (Criteria) this;
        }

        public Criteria andMenuactionIsNotNull() {
            addCriterion("MENUACTION is not null");
            return (Criteria) this;
        }

        public Criteria andMenuactionEqualTo(String value) {
            addCriterion("MENUACTION =", value, "menuaction");
            return (Criteria) this;
        }

        public Criteria andMenuactionNotEqualTo(String value) {
            addCriterion("MENUACTION <>", value, "menuaction");
            return (Criteria) this;
        }

        public Criteria andMenuactionGreaterThan(String value) {
            addCriterion("MENUACTION >", value, "menuaction");
            return (Criteria) this;
        }

        public Criteria andMenuactionGreaterThanOrEqualTo(String value) {
            addCriterion("MENUACTION >=", value, "menuaction");
            return (Criteria) this;
        }

        public Criteria andMenuactionLessThan(String value) {
            addCriterion("MENUACTION <", value, "menuaction");
            return (Criteria) this;
        }

        public Criteria andMenuactionLessThanOrEqualTo(String value) {
            addCriterion("MENUACTION <=", value, "menuaction");
            return (Criteria) this;
        }

        public Criteria andMenuactionLike(String value) {
            addCriterion("MENUACTION like", value, "menuaction");
            return (Criteria) this;
        }

        public Criteria andMenuactionNotLike(String value) {
            addCriterion("MENUACTION not like", value, "menuaction");
            return (Criteria) this;
        }

        public Criteria andMenuactionIn(List<String> values) {
            addCriterion("MENUACTION in", values, "menuaction");
            return (Criteria) this;
        }

        public Criteria andMenuactionNotIn(List<String> values) {
            addCriterion("MENUACTION not in", values, "menuaction");
            return (Criteria) this;
        }

        public Criteria andMenuactionBetween(String value1, String value2) {
            addCriterion("MENUACTION between", value1, value2, "menuaction");
            return (Criteria) this;
        }

        public Criteria andMenuactionNotBetween(String value1, String value2) {
            addCriterion("MENUACTION not between", value1, value2, "menuaction");
            return (Criteria) this;
        }

        public Criteria andMenulabelIsNull() {
            addCriterion("MENULABEL is null");
            return (Criteria) this;
        }

        public Criteria andMenulabelIsNotNull() {
            addCriterion("MENULABEL is not null");
            return (Criteria) this;
        }

        public Criteria andMenulabelEqualTo(String value) {
            addCriterion("MENULABEL =", value, "menulabel");
            return (Criteria) this;
        }

        public Criteria andMenulabelNotEqualTo(String value) {
            addCriterion("MENULABEL <>", value, "menulabel");
            return (Criteria) this;
        }

        public Criteria andMenulabelGreaterThan(String value) {
            addCriterion("MENULABEL >", value, "menulabel");
            return (Criteria) this;
        }

        public Criteria andMenulabelGreaterThanOrEqualTo(String value) {
            addCriterion("MENULABEL >=", value, "menulabel");
            return (Criteria) this;
        }

        public Criteria andMenulabelLessThan(String value) {
            addCriterion("MENULABEL <", value, "menulabel");
            return (Criteria) this;
        }

        public Criteria andMenulabelLessThanOrEqualTo(String value) {
            addCriterion("MENULABEL <=", value, "menulabel");
            return (Criteria) this;
        }

        public Criteria andMenulabelLike(String value) {
            addCriterion("MENULABEL like", value, "menulabel");
            return (Criteria) this;
        }

        public Criteria andMenulabelNotLike(String value) {
            addCriterion("MENULABEL not like", value, "menulabel");
            return (Criteria) this;
        }

        public Criteria andMenulabelIn(List<String> values) {
            addCriterion("MENULABEL in", values, "menulabel");
            return (Criteria) this;
        }

        public Criteria andMenulabelNotIn(List<String> values) {
            addCriterion("MENULABEL not in", values, "menulabel");
            return (Criteria) this;
        }

        public Criteria andMenulabelBetween(String value1, String value2) {
            addCriterion("MENULABEL between", value1, value2, "menulabel");
            return (Criteria) this;
        }

        public Criteria andMenulabelNotBetween(String value1, String value2) {
            addCriterion("MENULABEL not between", value1, value2, "menulabel");
            return (Criteria) this;
        }

        public Criteria andIsleafIsNull() {
            addCriterion("ISLEAF is null");
            return (Criteria) this;
        }

        public Criteria andIsleafIsNotNull() {
            addCriterion("ISLEAF is not null");
            return (Criteria) this;
        }

        public Criteria andIsleafEqualTo(String value) {
            addCriterion("ISLEAF =", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotEqualTo(String value) {
            addCriterion("ISLEAF <>", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafGreaterThan(String value) {
            addCriterion("ISLEAF >", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafGreaterThanOrEqualTo(String value) {
            addCriterion("ISLEAF >=", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLessThan(String value) {
            addCriterion("ISLEAF <", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLessThanOrEqualTo(String value) {
            addCriterion("ISLEAF <=", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLike(String value) {
            addCriterion("ISLEAF like", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotLike(String value) {
            addCriterion("ISLEAF not like", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafIn(List<String> values) {
            addCriterion("ISLEAF in", values, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotIn(List<String> values) {
            addCriterion("ISLEAF not in", values, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafBetween(String value1, String value2) {
            addCriterion("ISLEAF between", value1, value2, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotBetween(String value1, String value2) {
            addCriterion("ISLEAF not between", value1, value2, "isleaf");
            return (Criteria) this;
        }

        public Criteria andMenulevelIsNull() {
            addCriterion("MENULEVEL is null");
            return (Criteria) this;
        }

        public Criteria andMenulevelIsNotNull() {
            addCriterion("MENULEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andMenulevelEqualTo(BigDecimal value) {
            addCriterion("MENULEVEL =", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotEqualTo(BigDecimal value) {
            addCriterion("MENULEVEL <>", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelGreaterThan(BigDecimal value) {
            addCriterion("MENULEVEL >", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MENULEVEL >=", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelLessThan(BigDecimal value) {
            addCriterion("MENULEVEL <", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MENULEVEL <=", value, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelIn(List<BigDecimal> values) {
            addCriterion("MENULEVEL in", values, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotIn(List<BigDecimal> values) {
            addCriterion("MENULEVEL not in", values, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MENULEVEL between", value1, value2, "menulevel");
            return (Criteria) this;
        }

        public Criteria andMenulevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MENULEVEL not between", value1, value2, "menulevel");
            return (Criteria) this;
        }

        public Criteria andRootidIsNull() {
            addCriterion("ROOTID is null");
            return (Criteria) this;
        }

        public Criteria andRootidIsNotNull() {
            addCriterion("ROOTID is not null");
            return (Criteria) this;
        }

        public Criteria andRootidEqualTo(String value) {
            addCriterion("ROOTID =", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotEqualTo(String value) {
            addCriterion("ROOTID <>", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidGreaterThan(String value) {
            addCriterion("ROOTID >", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidGreaterThanOrEqualTo(String value) {
            addCriterion("ROOTID >=", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLessThan(String value) {
            addCriterion("ROOTID <", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLessThanOrEqualTo(String value) {
            addCriterion("ROOTID <=", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLike(String value) {
            addCriterion("ROOTID like", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotLike(String value) {
            addCriterion("ROOTID not like", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidIn(List<String> values) {
            addCriterion("ROOTID in", values, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotIn(List<String> values) {
            addCriterion("ROOTID not in", values, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidBetween(String value1, String value2) {
            addCriterion("ROOTID between", value1, value2, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotBetween(String value1, String value2) {
            addCriterion("ROOTID not between", value1, value2, "rootid");
            return (Criteria) this;
        }

        public Criteria andParentsidIsNull() {
            addCriterion("PARENTSID is null");
            return (Criteria) this;
        }

        public Criteria andParentsidIsNotNull() {
            addCriterion("PARENTSID is not null");
            return (Criteria) this;
        }

        public Criteria andParentsidEqualTo(String value) {
            addCriterion("PARENTSID =", value, "parentsid");
            return (Criteria) this;
        }

        public Criteria andParentsidNotEqualTo(String value) {
            addCriterion("PARENTSID <>", value, "parentsid");
            return (Criteria) this;
        }

        public Criteria andParentsidGreaterThan(String value) {
            addCriterion("PARENTSID >", value, "parentsid");
            return (Criteria) this;
        }

        public Criteria andParentsidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTSID >=", value, "parentsid");
            return (Criteria) this;
        }

        public Criteria andParentsidLessThan(String value) {
            addCriterion("PARENTSID <", value, "parentsid");
            return (Criteria) this;
        }

        public Criteria andParentsidLessThanOrEqualTo(String value) {
            addCriterion("PARENTSID <=", value, "parentsid");
            return (Criteria) this;
        }

        public Criteria andParentsidLike(String value) {
            addCriterion("PARENTSID like", value, "parentsid");
            return (Criteria) this;
        }

        public Criteria andParentsidNotLike(String value) {
            addCriterion("PARENTSID not like", value, "parentsid");
            return (Criteria) this;
        }

        public Criteria andParentsidIn(List<String> values) {
            addCriterion("PARENTSID in", values, "parentsid");
            return (Criteria) this;
        }

        public Criteria andParentsidNotIn(List<String> values) {
            addCriterion("PARENTSID not in", values, "parentsid");
            return (Criteria) this;
        }

        public Criteria andParentsidBetween(String value1, String value2) {
            addCriterion("PARENTSID between", value1, value2, "parentsid");
            return (Criteria) this;
        }

        public Criteria andParentsidNotBetween(String value1, String value2) {
            addCriterion("PARENTSID not between", value1, value2, "parentsid");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNull() {
            addCriterion("DISPLAYORDER is null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIsNotNull() {
            addCriterion("DISPLAYORDER is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayorderEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER =", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER <>", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThan(BigDecimal value) {
            addCriterion("DISPLAYORDER >", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER >=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThan(BigDecimal value) {
            addCriterion("DISPLAYORDER <", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISPLAYORDER <=", value, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderIn(List<BigDecimal> values) {
            addCriterion("DISPLAYORDER in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotIn(List<BigDecimal> values) {
            addCriterion("DISPLAYORDER not in", values, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISPLAYORDER between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andDisplayorderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISPLAYORDER not between", value1, value2, "displayorder");
            return (Criteria) this;
        }

        public Criteria andMenuseqIsNull() {
            addCriterion("MENUSEQ is null");
            return (Criteria) this;
        }

        public Criteria andMenuseqIsNotNull() {
            addCriterion("MENUSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andMenuseqEqualTo(String value) {
            addCriterion("MENUSEQ =", value, "menuseq");
            return (Criteria) this;
        }

        public Criteria andMenuseqNotEqualTo(String value) {
            addCriterion("MENUSEQ <>", value, "menuseq");
            return (Criteria) this;
        }

        public Criteria andMenuseqGreaterThan(String value) {
            addCriterion("MENUSEQ >", value, "menuseq");
            return (Criteria) this;
        }

        public Criteria andMenuseqGreaterThanOrEqualTo(String value) {
            addCriterion("MENUSEQ >=", value, "menuseq");
            return (Criteria) this;
        }

        public Criteria andMenuseqLessThan(String value) {
            addCriterion("MENUSEQ <", value, "menuseq");
            return (Criteria) this;
        }

        public Criteria andMenuseqLessThanOrEqualTo(String value) {
            addCriterion("MENUSEQ <=", value, "menuseq");
            return (Criteria) this;
        }

        public Criteria andMenuseqLike(String value) {
            addCriterion("MENUSEQ like", value, "menuseq");
            return (Criteria) this;
        }

        public Criteria andMenuseqNotLike(String value) {
            addCriterion("MENUSEQ not like", value, "menuseq");
            return (Criteria) this;
        }

        public Criteria andMenuseqIn(List<String> values) {
            addCriterion("MENUSEQ in", values, "menuseq");
            return (Criteria) this;
        }

        public Criteria andMenuseqNotIn(List<String> values) {
            addCriterion("MENUSEQ not in", values, "menuseq");
            return (Criteria) this;
        }

        public Criteria andMenuseqBetween(String value1, String value2) {
            addCriterion("MENUSEQ between", value1, value2, "menuseq");
            return (Criteria) this;
        }

        public Criteria andMenuseqNotBetween(String value1, String value2) {
            addCriterion("MENUSEQ not between", value1, value2, "menuseq");
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

        public Criteria andIcopathIsNull() {
            addCriterion("ICOPATH is null");
            return (Criteria) this;
        }

        public Criteria andIcopathIsNotNull() {
            addCriterion("ICOPATH is not null");
            return (Criteria) this;
        }

        public Criteria andIcopathEqualTo(String value) {
            addCriterion("ICOPATH =", value, "icopath");
            return (Criteria) this;
        }

        public Criteria andIcopathNotEqualTo(String value) {
            addCriterion("ICOPATH <>", value, "icopath");
            return (Criteria) this;
        }

        public Criteria andIcopathGreaterThan(String value) {
            addCriterion("ICOPATH >", value, "icopath");
            return (Criteria) this;
        }

        public Criteria andIcopathGreaterThanOrEqualTo(String value) {
            addCriterion("ICOPATH >=", value, "icopath");
            return (Criteria) this;
        }

        public Criteria andIcopathLessThan(String value) {
            addCriterion("ICOPATH <", value, "icopath");
            return (Criteria) this;
        }

        public Criteria andIcopathLessThanOrEqualTo(String value) {
            addCriterion("ICOPATH <=", value, "icopath");
            return (Criteria) this;
        }

        public Criteria andIcopathLike(String value) {
            addCriterion("ICOPATH like", value, "icopath");
            return (Criteria) this;
        }

        public Criteria andIcopathNotLike(String value) {
            addCriterion("ICOPATH not like", value, "icopath");
            return (Criteria) this;
        }

        public Criteria andIcopathIn(List<String> values) {
            addCriterion("ICOPATH in", values, "icopath");
            return (Criteria) this;
        }

        public Criteria andIcopathNotIn(List<String> values) {
            addCriterion("ICOPATH not in", values, "icopath");
            return (Criteria) this;
        }

        public Criteria andIcopathBetween(String value1, String value2) {
            addCriterion("ICOPATH between", value1, value2, "icopath");
            return (Criteria) this;
        }

        public Criteria andIcopathNotBetween(String value1, String value2) {
            addCriterion("ICOPATH not between", value1, value2, "icopath");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNull() {
            addCriterion("VISIBLE is null");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNotNull() {
            addCriterion("VISIBLE is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleEqualTo(String value) {
            addCriterion("VISIBLE =", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotEqualTo(String value) {
            addCriterion("VISIBLE <>", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThan(String value) {
            addCriterion("VISIBLE >", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThanOrEqualTo(String value) {
            addCriterion("VISIBLE >=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThan(String value) {
            addCriterion("VISIBLE <", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThanOrEqualTo(String value) {
            addCriterion("VISIBLE <=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLike(String value) {
            addCriterion("VISIBLE like", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotLike(String value) {
            addCriterion("VISIBLE not like", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleIn(List<String> values) {
            addCriterion("VISIBLE in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotIn(List<String> values) {
            addCriterion("VISIBLE not in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleBetween(String value1, String value2) {
            addCriterion("VISIBLE between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotBetween(String value1, String value2) {
            addCriterion("VISIBLE not between", value1, value2, "visible");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_menu_tc
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
     * @Table : mm_menu_tc
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