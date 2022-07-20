package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MmSystemsetTcExample {
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
    public MmSystemsetTcExample() {
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
     * @Table : mm_systemset_tc
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

        public Criteria andCustomernameIsNull() {
            addCriterion("CUSTOMERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CUSTOMERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CUSTOMERNAME =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CUSTOMERNAME <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CUSTOMERNAME >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CUSTOMERNAME <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CUSTOMERNAME like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CUSTOMERNAME not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CUSTOMERNAME in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CUSTOMERNAME not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andDef1IsNull() {
            addCriterion("DEF1 is null");
            return (Criteria) this;
        }

        public Criteria andDef1IsNotNull() {
            addCriterion("DEF1 is not null");
            return (Criteria) this;
        }

        public Criteria andDef1EqualTo(String value) {
            addCriterion("DEF1 =", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotEqualTo(String value) {
            addCriterion("DEF1 <>", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThan(String value) {
            addCriterion("DEF1 >", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThanOrEqualTo(String value) {
            addCriterion("DEF1 >=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThan(String value) {
            addCriterion("DEF1 <", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThanOrEqualTo(String value) {
            addCriterion("DEF1 <=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Like(String value) {
            addCriterion("DEF1 like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotLike(String value) {
            addCriterion("DEF1 not like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1In(List<String> values) {
            addCriterion("DEF1 in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotIn(List<String> values) {
            addCriterion("DEF1 not in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Between(String value1, String value2) {
            addCriterion("DEF1 between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotBetween(String value1, String value2) {
            addCriterion("DEF1 not between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef2IsNull() {
            addCriterion("DEF2 is null");
            return (Criteria) this;
        }

        public Criteria andDef2IsNotNull() {
            addCriterion("DEF2 is not null");
            return (Criteria) this;
        }

        public Criteria andDef2EqualTo(String value) {
            addCriterion("DEF2 =", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotEqualTo(String value) {
            addCriterion("DEF2 <>", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThan(String value) {
            addCriterion("DEF2 >", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThanOrEqualTo(String value) {
            addCriterion("DEF2 >=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThan(String value) {
            addCriterion("DEF2 <", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThanOrEqualTo(String value) {
            addCriterion("DEF2 <=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Like(String value) {
            addCriterion("DEF2 like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotLike(String value) {
            addCriterion("DEF2 not like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2In(List<String> values) {
            addCriterion("DEF2 in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotIn(List<String> values) {
            addCriterion("DEF2 not in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Between(String value1, String value2) {
            addCriterion("DEF2 between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotBetween(String value1, String value2) {
            addCriterion("DEF2 not between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef3IsNull() {
            addCriterion("DEF3 is null");
            return (Criteria) this;
        }

        public Criteria andDef3IsNotNull() {
            addCriterion("DEF3 is not null");
            return (Criteria) this;
        }

        public Criteria andDef3EqualTo(String value) {
            addCriterion("DEF3 =", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotEqualTo(String value) {
            addCriterion("DEF3 <>", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThan(String value) {
            addCriterion("DEF3 >", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThanOrEqualTo(String value) {
            addCriterion("DEF3 >=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThan(String value) {
            addCriterion("DEF3 <", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThanOrEqualTo(String value) {
            addCriterion("DEF3 <=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Like(String value) {
            addCriterion("DEF3 like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotLike(String value) {
            addCriterion("DEF3 not like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3In(List<String> values) {
            addCriterion("DEF3 in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotIn(List<String> values) {
            addCriterion("DEF3 not in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Between(String value1, String value2) {
            addCriterion("DEF3 between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotBetween(String value1, String value2) {
            addCriterion("DEF3 not between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef4IsNull() {
            addCriterion("DEF4 is null");
            return (Criteria) this;
        }

        public Criteria andDef4IsNotNull() {
            addCriterion("DEF4 is not null");
            return (Criteria) this;
        }

        public Criteria andDef4EqualTo(String value) {
            addCriterion("DEF4 =", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotEqualTo(String value) {
            addCriterion("DEF4 <>", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThan(String value) {
            addCriterion("DEF4 >", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThanOrEqualTo(String value) {
            addCriterion("DEF4 >=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThan(String value) {
            addCriterion("DEF4 <", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThanOrEqualTo(String value) {
            addCriterion("DEF4 <=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Like(String value) {
            addCriterion("DEF4 like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotLike(String value) {
            addCriterion("DEF4 not like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4In(List<String> values) {
            addCriterion("DEF4 in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotIn(List<String> values) {
            addCriterion("DEF4 not in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Between(String value1, String value2) {
            addCriterion("DEF4 between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotBetween(String value1, String value2) {
            addCriterion("DEF4 not between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeIsNull() {
            addCriterion("DAILYAUDITTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeIsNotNull() {
            addCriterion("DAILYAUDITTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeEqualTo(String value) {
            addCriterion("DAILYAUDITTYPE =", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeNotEqualTo(String value) {
            addCriterion("DAILYAUDITTYPE <>", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeGreaterThan(String value) {
            addCriterion("DAILYAUDITTYPE >", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeGreaterThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITTYPE >=", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeLessThan(String value) {
            addCriterion("DAILYAUDITTYPE <", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeLessThanOrEqualTo(String value) {
            addCriterion("DAILYAUDITTYPE <=", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeLike(String value) {
            addCriterion("DAILYAUDITTYPE like", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeNotLike(String value) {
            addCriterion("DAILYAUDITTYPE not like", value, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeIn(List<String> values) {
            addCriterion("DAILYAUDITTYPE in", values, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeNotIn(List<String> values) {
            addCriterion("DAILYAUDITTYPE not in", values, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeBetween(String value1, String value2) {
            addCriterion("DAILYAUDITTYPE between", value1, value2, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andDailyaudittypeNotBetween(String value1, String value2) {
            addCriterion("DAILYAUDITTYPE not between", value1, value2, "dailyaudittype");
            return (Criteria) this;
        }

        public Criteria andAccounttoIsNull() {
            addCriterion("ACCOUNTTO is null");
            return (Criteria) this;
        }

        public Criteria andAccounttoIsNotNull() {
            addCriterion("ACCOUNTTO is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttoEqualTo(String value) {
            addCriterion("ACCOUNTTO =", value, "accountto");
            return (Criteria) this;
        }

        public Criteria andAccounttoNotEqualTo(String value) {
            addCriterion("ACCOUNTTO <>", value, "accountto");
            return (Criteria) this;
        }

        public Criteria andAccounttoGreaterThan(String value) {
            addCriterion("ACCOUNTTO >", value, "accountto");
            return (Criteria) this;
        }

        public Criteria andAccounttoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTTO >=", value, "accountto");
            return (Criteria) this;
        }

        public Criteria andAccounttoLessThan(String value) {
            addCriterion("ACCOUNTTO <", value, "accountto");
            return (Criteria) this;
        }

        public Criteria andAccounttoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTTO <=", value, "accountto");
            return (Criteria) this;
        }

        public Criteria andAccounttoLike(String value) {
            addCriterion("ACCOUNTTO like", value, "accountto");
            return (Criteria) this;
        }

        public Criteria andAccounttoNotLike(String value) {
            addCriterion("ACCOUNTTO not like", value, "accountto");
            return (Criteria) this;
        }

        public Criteria andAccounttoIn(List<String> values) {
            addCriterion("ACCOUNTTO in", values, "accountto");
            return (Criteria) this;
        }

        public Criteria andAccounttoNotIn(List<String> values) {
            addCriterion("ACCOUNTTO not in", values, "accountto");
            return (Criteria) this;
        }

        public Criteria andAccounttoBetween(String value1, String value2) {
            addCriterion("ACCOUNTTO between", value1, value2, "accountto");
            return (Criteria) this;
        }

        public Criteria andAccounttoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTTO not between", value1, value2, "accountto");
            return (Criteria) this;
        }

        public Criteria andApplyfeeIsNull() {
            addCriterion("APPLYFEE is null");
            return (Criteria) this;
        }

        public Criteria andApplyfeeIsNotNull() {
            addCriterion("APPLYFEE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyfeeEqualTo(String value) {
            addCriterion("APPLYFEE =", value, "applyfee");
            return (Criteria) this;
        }

        public Criteria andApplyfeeNotEqualTo(String value) {
            addCriterion("APPLYFEE <>", value, "applyfee");
            return (Criteria) this;
        }

        public Criteria andApplyfeeGreaterThan(String value) {
            addCriterion("APPLYFEE >", value, "applyfee");
            return (Criteria) this;
        }

        public Criteria andApplyfeeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYFEE >=", value, "applyfee");
            return (Criteria) this;
        }

        public Criteria andApplyfeeLessThan(String value) {
            addCriterion("APPLYFEE <", value, "applyfee");
            return (Criteria) this;
        }

        public Criteria andApplyfeeLessThanOrEqualTo(String value) {
            addCriterion("APPLYFEE <=", value, "applyfee");
            return (Criteria) this;
        }

        public Criteria andApplyfeeLike(String value) {
            addCriterion("APPLYFEE like", value, "applyfee");
            return (Criteria) this;
        }

        public Criteria andApplyfeeNotLike(String value) {
            addCriterion("APPLYFEE not like", value, "applyfee");
            return (Criteria) this;
        }

        public Criteria andApplyfeeIn(List<String> values) {
            addCriterion("APPLYFEE in", values, "applyfee");
            return (Criteria) this;
        }

        public Criteria andApplyfeeNotIn(List<String> values) {
            addCriterion("APPLYFEE not in", values, "applyfee");
            return (Criteria) this;
        }

        public Criteria andApplyfeeBetween(String value1, String value2) {
            addCriterion("APPLYFEE between", value1, value2, "applyfee");
            return (Criteria) this;
        }

        public Criteria andApplyfeeNotBetween(String value1, String value2) {
            addCriterion("APPLYFEE not between", value1, value2, "applyfee");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoIsNull() {
            addCriterion("INPAYMENTTO is null");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoIsNotNull() {
            addCriterion("INPAYMENTTO is not null");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoEqualTo(String value) {
            addCriterion("INPAYMENTTO =", value, "inpaymentto");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoNotEqualTo(String value) {
            addCriterion("INPAYMENTTO <>", value, "inpaymentto");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoGreaterThan(String value) {
            addCriterion("INPAYMENTTO >", value, "inpaymentto");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoGreaterThanOrEqualTo(String value) {
            addCriterion("INPAYMENTTO >=", value, "inpaymentto");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoLessThan(String value) {
            addCriterion("INPAYMENTTO <", value, "inpaymentto");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoLessThanOrEqualTo(String value) {
            addCriterion("INPAYMENTTO <=", value, "inpaymentto");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoLike(String value) {
            addCriterion("INPAYMENTTO like", value, "inpaymentto");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoNotLike(String value) {
            addCriterion("INPAYMENTTO not like", value, "inpaymentto");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoIn(List<String> values) {
            addCriterion("INPAYMENTTO in", values, "inpaymentto");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoNotIn(List<String> values) {
            addCriterion("INPAYMENTTO not in", values, "inpaymentto");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoBetween(String value1, String value2) {
            addCriterion("INPAYMENTTO between", value1, value2, "inpaymentto");
            return (Criteria) this;
        }

        public Criteria andInpaymenttoNotBetween(String value1, String value2) {
            addCriterion("INPAYMENTTO not between", value1, value2, "inpaymentto");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectIsNull() {
            addCriterion("TAXIFEFFECT is null");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectIsNotNull() {
            addCriterion("TAXIFEFFECT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectEqualTo(String value) {
            addCriterion("TAXIFEFFECT =", value, "taxifeffect");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectNotEqualTo(String value) {
            addCriterion("TAXIFEFFECT <>", value, "taxifeffect");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectGreaterThan(String value) {
            addCriterion("TAXIFEFFECT >", value, "taxifeffect");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectGreaterThanOrEqualTo(String value) {
            addCriterion("TAXIFEFFECT >=", value, "taxifeffect");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectLessThan(String value) {
            addCriterion("TAXIFEFFECT <", value, "taxifeffect");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectLessThanOrEqualTo(String value) {
            addCriterion("TAXIFEFFECT <=", value, "taxifeffect");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectLike(String value) {
            addCriterion("TAXIFEFFECT like", value, "taxifeffect");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectNotLike(String value) {
            addCriterion("TAXIFEFFECT not like", value, "taxifeffect");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectIn(List<String> values) {
            addCriterion("TAXIFEFFECT in", values, "taxifeffect");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectNotIn(List<String> values) {
            addCriterion("TAXIFEFFECT not in", values, "taxifeffect");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectBetween(String value1, String value2) {
            addCriterion("TAXIFEFFECT between", value1, value2, "taxifeffect");
            return (Criteria) this;
        }

        public Criteria andTaxifeffectNotBetween(String value1, String value2) {
            addCriterion("TAXIFEFFECT not between", value1, value2, "taxifeffect");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectIsNull() {
            addCriterion("APPLYFEEIFEFFECT is null");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectIsNotNull() {
            addCriterion("APPLYFEEIFEFFECT is not null");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectEqualTo(String value) {
            addCriterion("APPLYFEEIFEFFECT =", value, "applyfeeifeffect");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectNotEqualTo(String value) {
            addCriterion("APPLYFEEIFEFFECT <>", value, "applyfeeifeffect");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectGreaterThan(String value) {
            addCriterion("APPLYFEEIFEFFECT >", value, "applyfeeifeffect");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYFEEIFEFFECT >=", value, "applyfeeifeffect");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectLessThan(String value) {
            addCriterion("APPLYFEEIFEFFECT <", value, "applyfeeifeffect");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectLessThanOrEqualTo(String value) {
            addCriterion("APPLYFEEIFEFFECT <=", value, "applyfeeifeffect");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectLike(String value) {
            addCriterion("APPLYFEEIFEFFECT like", value, "applyfeeifeffect");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectNotLike(String value) {
            addCriterion("APPLYFEEIFEFFECT not like", value, "applyfeeifeffect");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectIn(List<String> values) {
            addCriterion("APPLYFEEIFEFFECT in", values, "applyfeeifeffect");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectNotIn(List<String> values) {
            addCriterion("APPLYFEEIFEFFECT not in", values, "applyfeeifeffect");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectBetween(String value1, String value2) {
            addCriterion("APPLYFEEIFEFFECT between", value1, value2, "applyfeeifeffect");
            return (Criteria) this;
        }

        public Criteria andApplyfeeifeffectNotBetween(String value1, String value2) {
            addCriterion("APPLYFEEIFEFFECT not between", value1, value2, "applyfeeifeffect");
            return (Criteria) this;
        }

        public Criteria andPagenumIsNull() {
            addCriterion("PAGENUM is null");
            return (Criteria) this;
        }

        public Criteria andPagenumIsNotNull() {
            addCriterion("PAGENUM is not null");
            return (Criteria) this;
        }

        public Criteria andPagenumEqualTo(BigDecimal value) {
            addCriterion("PAGENUM =", value, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumNotEqualTo(BigDecimal value) {
            addCriterion("PAGENUM <>", value, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumGreaterThan(BigDecimal value) {
            addCriterion("PAGENUM >", value, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAGENUM >=", value, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumLessThan(BigDecimal value) {
            addCriterion("PAGENUM <", value, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAGENUM <=", value, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumIn(List<BigDecimal> values) {
            addCriterion("PAGENUM in", values, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumNotIn(List<BigDecimal> values) {
            addCriterion("PAGENUM not in", values, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAGENUM between", value1, value2, "pagenum");
            return (Criteria) this;
        }

        public Criteria andPagenumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAGENUM not between", value1, value2, "pagenum");
            return (Criteria) this;
        }

        public Criteria andIfexchangeIsNull() {
            addCriterion("IFEXCHANGE is null");
            return (Criteria) this;
        }

        public Criteria andIfexchangeIsNotNull() {
            addCriterion("IFEXCHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andIfexchangeEqualTo(String value) {
            addCriterion("IFEXCHANGE =", value, "ifexchange");
            return (Criteria) this;
        }

        public Criteria andIfexchangeNotEqualTo(String value) {
            addCriterion("IFEXCHANGE <>", value, "ifexchange");
            return (Criteria) this;
        }

        public Criteria andIfexchangeGreaterThan(String value) {
            addCriterion("IFEXCHANGE >", value, "ifexchange");
            return (Criteria) this;
        }

        public Criteria andIfexchangeGreaterThanOrEqualTo(String value) {
            addCriterion("IFEXCHANGE >=", value, "ifexchange");
            return (Criteria) this;
        }

        public Criteria andIfexchangeLessThan(String value) {
            addCriterion("IFEXCHANGE <", value, "ifexchange");
            return (Criteria) this;
        }

        public Criteria andIfexchangeLessThanOrEqualTo(String value) {
            addCriterion("IFEXCHANGE <=", value, "ifexchange");
            return (Criteria) this;
        }

        public Criteria andIfexchangeLike(String value) {
            addCriterion("IFEXCHANGE like", value, "ifexchange");
            return (Criteria) this;
        }

        public Criteria andIfexchangeNotLike(String value) {
            addCriterion("IFEXCHANGE not like", value, "ifexchange");
            return (Criteria) this;
        }

        public Criteria andIfexchangeIn(List<String> values) {
            addCriterion("IFEXCHANGE in", values, "ifexchange");
            return (Criteria) this;
        }

        public Criteria andIfexchangeNotIn(List<String> values) {
            addCriterion("IFEXCHANGE not in", values, "ifexchange");
            return (Criteria) this;
        }

        public Criteria andIfexchangeBetween(String value1, String value2) {
            addCriterion("IFEXCHANGE between", value1, value2, "ifexchange");
            return (Criteria) this;
        }

        public Criteria andIfexchangeNotBetween(String value1, String value2) {
            addCriterion("IFEXCHANGE not between", value1, value2, "ifexchange");
            return (Criteria) this;
        }

        public Criteria andIfmd5IsNull() {
            addCriterion("IFMD5 is null");
            return (Criteria) this;
        }

        public Criteria andIfmd5IsNotNull() {
            addCriterion("IFMD5 is not null");
            return (Criteria) this;
        }

        public Criteria andIfmd5EqualTo(String value) {
            addCriterion("IFMD5 =", value, "ifmd5");
            return (Criteria) this;
        }

        public Criteria andIfmd5NotEqualTo(String value) {
            addCriterion("IFMD5 <>", value, "ifmd5");
            return (Criteria) this;
        }

        public Criteria andIfmd5GreaterThan(String value) {
            addCriterion("IFMD5 >", value, "ifmd5");
            return (Criteria) this;
        }

        public Criteria andIfmd5GreaterThanOrEqualTo(String value) {
            addCriterion("IFMD5 >=", value, "ifmd5");
            return (Criteria) this;
        }

        public Criteria andIfmd5LessThan(String value) {
            addCriterion("IFMD5 <", value, "ifmd5");
            return (Criteria) this;
        }

        public Criteria andIfmd5LessThanOrEqualTo(String value) {
            addCriterion("IFMD5 <=", value, "ifmd5");
            return (Criteria) this;
        }

        public Criteria andIfmd5Like(String value) {
            addCriterion("IFMD5 like", value, "ifmd5");
            return (Criteria) this;
        }

        public Criteria andIfmd5NotLike(String value) {
            addCriterion("IFMD5 not like", value, "ifmd5");
            return (Criteria) this;
        }

        public Criteria andIfmd5In(List<String> values) {
            addCriterion("IFMD5 in", values, "ifmd5");
            return (Criteria) this;
        }

        public Criteria andIfmd5NotIn(List<String> values) {
            addCriterion("IFMD5 not in", values, "ifmd5");
            return (Criteria) this;
        }

        public Criteria andIfmd5Between(String value1, String value2) {
            addCriterion("IFMD5 between", value1, value2, "ifmd5");
            return (Criteria) this;
        }

        public Criteria andIfmd5NotBetween(String value1, String value2) {
            addCriterion("IFMD5 not between", value1, value2, "ifmd5");
            return (Criteria) this;
        }

        public Criteria andAccountcontrolsizeIsNull() {
            addCriterion("ACCOUNTCONTROLSIZE is null");
            return (Criteria) this;
        }

        public Criteria andAccountcontrolsizeIsNotNull() {
            addCriterion("ACCOUNTCONTROLSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountcontrolsizeEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTCONTROLSIZE =", value, "accountcontrolsize");
            return (Criteria) this;
        }

        public Criteria andAccountcontrolsizeNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTCONTROLSIZE <>", value, "accountcontrolsize");
            return (Criteria) this;
        }

        public Criteria andAccountcontrolsizeGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTCONTROLSIZE >", value, "accountcontrolsize");
            return (Criteria) this;
        }

        public Criteria andAccountcontrolsizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTCONTROLSIZE >=", value, "accountcontrolsize");
            return (Criteria) this;
        }

        public Criteria andAccountcontrolsizeLessThan(BigDecimal value) {
            addCriterion("ACCOUNTCONTROLSIZE <", value, "accountcontrolsize");
            return (Criteria) this;
        }

        public Criteria andAccountcontrolsizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTCONTROLSIZE <=", value, "accountcontrolsize");
            return (Criteria) this;
        }

        public Criteria andAccountcontrolsizeIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTCONTROLSIZE in", values, "accountcontrolsize");
            return (Criteria) this;
        }

        public Criteria andAccountcontrolsizeNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTCONTROLSIZE not in", values, "accountcontrolsize");
            return (Criteria) this;
        }

        public Criteria andAccountcontrolsizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTCONTROLSIZE between", value1, value2, "accountcontrolsize");
            return (Criteria) this;
        }

        public Criteria andAccountcontrolsizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTCONTROLSIZE not between", value1, value2, "accountcontrolsize");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenIsNull() {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN is null");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenIsNotNull() {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenEqualTo(String value) {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN =", value, "paymentagiotageinputhiden");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenNotEqualTo(String value) {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN <>", value, "paymentagiotageinputhiden");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenGreaterThan(String value) {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN >", value, "paymentagiotageinputhiden");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN >=", value, "paymentagiotageinputhiden");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenLessThan(String value) {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN <", value, "paymentagiotageinputhiden");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN <=", value, "paymentagiotageinputhiden");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenLike(String value) {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN like", value, "paymentagiotageinputhiden");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenNotLike(String value) {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN not like", value, "paymentagiotageinputhiden");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenIn(List<String> values) {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN in", values, "paymentagiotageinputhiden");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenNotIn(List<String> values) {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN not in", values, "paymentagiotageinputhiden");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenBetween(String value1, String value2) {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN between", value1, value2, "paymentagiotageinputhiden");
            return (Criteria) this;
        }

        public Criteria andPaymentagiotageinputhidenNotBetween(String value1, String value2) {
            addCriterion("PAYMENTAGIOTAGEINPUTHIDEN not between", value1, value2, "paymentagiotageinputhiden");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordIsNull() {
            addCriterion("DEFAULTPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordIsNotNull() {
            addCriterion("DEFAULTPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordEqualTo(String value) {
            addCriterion("DEFAULTPASSWORD =", value, "defaultpassword");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordNotEqualTo(String value) {
            addCriterion("DEFAULTPASSWORD <>", value, "defaultpassword");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordGreaterThan(String value) {
            addCriterion("DEFAULTPASSWORD >", value, "defaultpassword");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULTPASSWORD >=", value, "defaultpassword");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordLessThan(String value) {
            addCriterion("DEFAULTPASSWORD <", value, "defaultpassword");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordLessThanOrEqualTo(String value) {
            addCriterion("DEFAULTPASSWORD <=", value, "defaultpassword");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordLike(String value) {
            addCriterion("DEFAULTPASSWORD like", value, "defaultpassword");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordNotLike(String value) {
            addCriterion("DEFAULTPASSWORD not like", value, "defaultpassword");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordIn(List<String> values) {
            addCriterion("DEFAULTPASSWORD in", values, "defaultpassword");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordNotIn(List<String> values) {
            addCriterion("DEFAULTPASSWORD not in", values, "defaultpassword");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordBetween(String value1, String value2) {
            addCriterion("DEFAULTPASSWORD between", value1, value2, "defaultpassword");
            return (Criteria) this;
        }

        public Criteria andDefaultpasswordNotBetween(String value1, String value2) {
            addCriterion("DEFAULTPASSWORD not between", value1, value2, "defaultpassword");
            return (Criteria) this;
        }

        public Criteria andFloatingIsNull() {
            addCriterion("FLOATING is null");
            return (Criteria) this;
        }

        public Criteria andFloatingIsNotNull() {
            addCriterion("FLOATING is not null");
            return (Criteria) this;
        }

        public Criteria andFloatingEqualTo(BigDecimal value) {
            addCriterion("FLOATING =", value, "floating");
            return (Criteria) this;
        }

        public Criteria andFloatingNotEqualTo(BigDecimal value) {
            addCriterion("FLOATING <>", value, "floating");
            return (Criteria) this;
        }

        public Criteria andFloatingGreaterThan(BigDecimal value) {
            addCriterion("FLOATING >", value, "floating");
            return (Criteria) this;
        }

        public Criteria andFloatingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FLOATING >=", value, "floating");
            return (Criteria) this;
        }

        public Criteria andFloatingLessThan(BigDecimal value) {
            addCriterion("FLOATING <", value, "floating");
            return (Criteria) this;
        }

        public Criteria andFloatingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FLOATING <=", value, "floating");
            return (Criteria) this;
        }

        public Criteria andFloatingIn(List<BigDecimal> values) {
            addCriterion("FLOATING in", values, "floating");
            return (Criteria) this;
        }

        public Criteria andFloatingNotIn(List<BigDecimal> values) {
            addCriterion("FLOATING not in", values, "floating");
            return (Criteria) this;
        }

        public Criteria andFloatingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLOATING between", value1, value2, "floating");
            return (Criteria) this;
        }

        public Criteria andFloatingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLOATING not between", value1, value2, "floating");
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

        public Criteria andDailyreportcontrolIsNull() {
            addCriterion("DAILYREPORTCONTROL is null");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolIsNotNull() {
            addCriterion("DAILYREPORTCONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolEqualTo(String value) {
            addCriterion("DAILYREPORTCONTROL =", value, "dailyreportcontrol");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolNotEqualTo(String value) {
            addCriterion("DAILYREPORTCONTROL <>", value, "dailyreportcontrol");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolGreaterThan(String value) {
            addCriterion("DAILYREPORTCONTROL >", value, "dailyreportcontrol");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolGreaterThanOrEqualTo(String value) {
            addCriterion("DAILYREPORTCONTROL >=", value, "dailyreportcontrol");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolLessThan(String value) {
            addCriterion("DAILYREPORTCONTROL <", value, "dailyreportcontrol");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolLessThanOrEqualTo(String value) {
            addCriterion("DAILYREPORTCONTROL <=", value, "dailyreportcontrol");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolLike(String value) {
            addCriterion("DAILYREPORTCONTROL like", value, "dailyreportcontrol");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolNotLike(String value) {
            addCriterion("DAILYREPORTCONTROL not like", value, "dailyreportcontrol");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolIn(List<String> values) {
            addCriterion("DAILYREPORTCONTROL in", values, "dailyreportcontrol");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolNotIn(List<String> values) {
            addCriterion("DAILYREPORTCONTROL not in", values, "dailyreportcontrol");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolBetween(String value1, String value2) {
            addCriterion("DAILYREPORTCONTROL between", value1, value2, "dailyreportcontrol");
            return (Criteria) this;
        }

        public Criteria andDailyreportcontrolNotBetween(String value1, String value2) {
            addCriterion("DAILYREPORTCONTROL not between", value1, value2, "dailyreportcontrol");
            return (Criteria) this;
        }

        public Criteria andLimitedcnyIsNull() {
            addCriterion("LIMITEDCNY is null");
            return (Criteria) this;
        }

        public Criteria andLimitedcnyIsNotNull() {
            addCriterion("LIMITEDCNY is not null");
            return (Criteria) this;
        }

        public Criteria andLimitedcnyEqualTo(BigDecimal value) {
            addCriterion("LIMITEDCNY =", value, "limitedcny");
            return (Criteria) this;
        }

        public Criteria andLimitedcnyNotEqualTo(BigDecimal value) {
            addCriterion("LIMITEDCNY <>", value, "limitedcny");
            return (Criteria) this;
        }

        public Criteria andLimitedcnyGreaterThan(BigDecimal value) {
            addCriterion("LIMITEDCNY >", value, "limitedcny");
            return (Criteria) this;
        }

        public Criteria andLimitedcnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIMITEDCNY >=", value, "limitedcny");
            return (Criteria) this;
        }

        public Criteria andLimitedcnyLessThan(BigDecimal value) {
            addCriterion("LIMITEDCNY <", value, "limitedcny");
            return (Criteria) this;
        }

        public Criteria andLimitedcnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIMITEDCNY <=", value, "limitedcny");
            return (Criteria) this;
        }

        public Criteria andLimitedcnyIn(List<BigDecimal> values) {
            addCriterion("LIMITEDCNY in", values, "limitedcny");
            return (Criteria) this;
        }

        public Criteria andLimitedcnyNotIn(List<BigDecimal> values) {
            addCriterion("LIMITEDCNY not in", values, "limitedcny");
            return (Criteria) this;
        }

        public Criteria andLimitedcnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIMITEDCNY between", value1, value2, "limitedcny");
            return (Criteria) this;
        }

        public Criteria andLimitedcnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIMITEDCNY not between", value1, value2, "limitedcny");
            return (Criteria) this;
        }

        public Criteria andLimitedusdIsNull() {
            addCriterion("LIMITEDUSD is null");
            return (Criteria) this;
        }

        public Criteria andLimitedusdIsNotNull() {
            addCriterion("LIMITEDUSD is not null");
            return (Criteria) this;
        }

        public Criteria andLimitedusdEqualTo(BigDecimal value) {
            addCriterion("LIMITEDUSD =", value, "limitedusd");
            return (Criteria) this;
        }

        public Criteria andLimitedusdNotEqualTo(BigDecimal value) {
            addCriterion("LIMITEDUSD <>", value, "limitedusd");
            return (Criteria) this;
        }

        public Criteria andLimitedusdGreaterThan(BigDecimal value) {
            addCriterion("LIMITEDUSD >", value, "limitedusd");
            return (Criteria) this;
        }

        public Criteria andLimitedusdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIMITEDUSD >=", value, "limitedusd");
            return (Criteria) this;
        }

        public Criteria andLimitedusdLessThan(BigDecimal value) {
            addCriterion("LIMITEDUSD <", value, "limitedusd");
            return (Criteria) this;
        }

        public Criteria andLimitedusdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIMITEDUSD <=", value, "limitedusd");
            return (Criteria) this;
        }

        public Criteria andLimitedusdIn(List<BigDecimal> values) {
            addCriterion("LIMITEDUSD in", values, "limitedusd");
            return (Criteria) this;
        }

        public Criteria andLimitedusdNotIn(List<BigDecimal> values) {
            addCriterion("LIMITEDUSD not in", values, "limitedusd");
            return (Criteria) this;
        }

        public Criteria andLimitedusdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIMITEDUSD between", value1, value2, "limitedusd");
            return (Criteria) this;
        }

        public Criteria andLimitedusdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIMITEDUSD not between", value1, value2, "limitedusd");
            return (Criteria) this;
        }

        public Criteria andImportrowsIsNull() {
            addCriterion("IMPORTROWS is null");
            return (Criteria) this;
        }

        public Criteria andImportrowsIsNotNull() {
            addCriterion("IMPORTROWS is not null");
            return (Criteria) this;
        }

        public Criteria andImportrowsEqualTo(BigDecimal value) {
            addCriterion("IMPORTROWS =", value, "importrows");
            return (Criteria) this;
        }

        public Criteria andImportrowsNotEqualTo(BigDecimal value) {
            addCriterion("IMPORTROWS <>", value, "importrows");
            return (Criteria) this;
        }

        public Criteria andImportrowsGreaterThan(BigDecimal value) {
            addCriterion("IMPORTROWS >", value, "importrows");
            return (Criteria) this;
        }

        public Criteria andImportrowsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IMPORTROWS >=", value, "importrows");
            return (Criteria) this;
        }

        public Criteria andImportrowsLessThan(BigDecimal value) {
            addCriterion("IMPORTROWS <", value, "importrows");
            return (Criteria) this;
        }

        public Criteria andImportrowsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IMPORTROWS <=", value, "importrows");
            return (Criteria) this;
        }

        public Criteria andImportrowsIn(List<BigDecimal> values) {
            addCriterion("IMPORTROWS in", values, "importrows");
            return (Criteria) this;
        }

        public Criteria andImportrowsNotIn(List<BigDecimal> values) {
            addCriterion("IMPORTROWS not in", values, "importrows");
            return (Criteria) this;
        }

        public Criteria andImportrowsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMPORTROWS between", value1, value2, "importrows");
            return (Criteria) this;
        }

        public Criteria andImportrowsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMPORTROWS not between", value1, value2, "importrows");
            return (Criteria) this;
        }

        public Criteria andRateDowncontrolIsNull() {
            addCriterion("RATE_DOWNCONTROL is null");
            return (Criteria) this;
        }

        public Criteria andRateDowncontrolIsNotNull() {
            addCriterion("RATE_DOWNCONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andRateDowncontrolEqualTo(BigDecimal value) {
            addCriterion("RATE_DOWNCONTROL =", value, "rateDowncontrol");
            return (Criteria) this;
        }

        public Criteria andRateDowncontrolNotEqualTo(BigDecimal value) {
            addCriterion("RATE_DOWNCONTROL <>", value, "rateDowncontrol");
            return (Criteria) this;
        }

        public Criteria andRateDowncontrolGreaterThan(BigDecimal value) {
            addCriterion("RATE_DOWNCONTROL >", value, "rateDowncontrol");
            return (Criteria) this;
        }

        public Criteria andRateDowncontrolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE_DOWNCONTROL >=", value, "rateDowncontrol");
            return (Criteria) this;
        }

        public Criteria andRateDowncontrolLessThan(BigDecimal value) {
            addCriterion("RATE_DOWNCONTROL <", value, "rateDowncontrol");
            return (Criteria) this;
        }

        public Criteria andRateDowncontrolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE_DOWNCONTROL <=", value, "rateDowncontrol");
            return (Criteria) this;
        }

        public Criteria andRateDowncontrolIn(List<BigDecimal> values) {
            addCriterion("RATE_DOWNCONTROL in", values, "rateDowncontrol");
            return (Criteria) this;
        }

        public Criteria andRateDowncontrolNotIn(List<BigDecimal> values) {
            addCriterion("RATE_DOWNCONTROL not in", values, "rateDowncontrol");
            return (Criteria) this;
        }

        public Criteria andRateDowncontrolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE_DOWNCONTROL between", value1, value2, "rateDowncontrol");
            return (Criteria) this;
        }

        public Criteria andRateDowncontrolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE_DOWNCONTROL not between", value1, value2, "rateDowncontrol");
            return (Criteria) this;
        }

        public Criteria andExchangeglIsNull() {
            addCriterion("EXCHANGEGL is null");
            return (Criteria) this;
        }

        public Criteria andExchangeglIsNotNull() {
            addCriterion("EXCHANGEGL is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeglEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEGL =", value, "exchangegl");
            return (Criteria) this;
        }

        public Criteria andExchangeglNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEGL <>", value, "exchangegl");
            return (Criteria) this;
        }

        public Criteria andExchangeglGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGEGL >", value, "exchangegl");
            return (Criteria) this;
        }

        public Criteria andExchangeglGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEGL >=", value, "exchangegl");
            return (Criteria) this;
        }

        public Criteria andExchangeglLessThan(BigDecimal value) {
            addCriterion("EXCHANGEGL <", value, "exchangegl");
            return (Criteria) this;
        }

        public Criteria andExchangeglLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGEGL <=", value, "exchangegl");
            return (Criteria) this;
        }

        public Criteria andExchangeglIn(List<BigDecimal> values) {
            addCriterion("EXCHANGEGL in", values, "exchangegl");
            return (Criteria) this;
        }

        public Criteria andExchangeglNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGEGL not in", values, "exchangegl");
            return (Criteria) this;
        }

        public Criteria andExchangeglBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGEGL between", value1, value2, "exchangegl");
            return (Criteria) this;
        }

        public Criteria andExchangeglNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGEGL not between", value1, value2, "exchangegl");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_systemset_tc
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
     * @Table : mm_systemset_tc
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