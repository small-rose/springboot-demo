package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmMsgtemplateTdExample {
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
    public MmMsgtemplateTdExample() {
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
     * @Table : mm_msgtemplate_td
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNull() {
            addCriterion("TRANSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNotNull() {
            addCriterion("TRANSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTranstypeEqualTo(String value) {
            addCriterion("TRANSTYPE =", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotEqualTo(String value) {
            addCriterion("TRANSTYPE <>", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThan(String value) {
            addCriterion("TRANSTYPE >", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSTYPE >=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThan(String value) {
            addCriterion("TRANSTYPE <", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThanOrEqualTo(String value) {
            addCriterion("TRANSTYPE <=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLike(String value) {
            addCriterion("TRANSTYPE like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotLike(String value) {
            addCriterion("TRANSTYPE not like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeIn(List<String> values) {
            addCriterion("TRANSTYPE in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotIn(List<String> values) {
            addCriterion("TRANSTYPE not in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeBetween(String value1, String value2) {
            addCriterion("TRANSTYPE between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotBetween(String value1, String value2) {
            addCriterion("TRANSTYPE not between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNull() {
            addCriterion("GROUPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNotNull() {
            addCriterion("GROUPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeEqualTo(String value) {
            addCriterion("GROUPTYPE =", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotEqualTo(String value) {
            addCriterion("GROUPTYPE <>", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThan(String value) {
            addCriterion("GROUPTYPE >", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPTYPE >=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThan(String value) {
            addCriterion("GROUPTYPE <", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThanOrEqualTo(String value) {
            addCriterion("GROUPTYPE <=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLike(String value) {
            addCriterion("GROUPTYPE like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotLike(String value) {
            addCriterion("GROUPTYPE not like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIn(List<String> values) {
            addCriterion("GROUPTYPE in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotIn(List<String> values) {
            addCriterion("GROUPTYPE not in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeBetween(String value1, String value2) {
            addCriterion("GROUPTYPE between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotBetween(String value1, String value2) {
            addCriterion("GROUPTYPE not between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andMsgtitleIsNull() {
            addCriterion("MSGTITLE is null");
            return (Criteria) this;
        }

        public Criteria andMsgtitleIsNotNull() {
            addCriterion("MSGTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtitleEqualTo(String value) {
            addCriterion("MSGTITLE =", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleNotEqualTo(String value) {
            addCriterion("MSGTITLE <>", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleGreaterThan(String value) {
            addCriterion("MSGTITLE >", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleGreaterThanOrEqualTo(String value) {
            addCriterion("MSGTITLE >=", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleLessThan(String value) {
            addCriterion("MSGTITLE <", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleLessThanOrEqualTo(String value) {
            addCriterion("MSGTITLE <=", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleLike(String value) {
            addCriterion("MSGTITLE like", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleNotLike(String value) {
            addCriterion("MSGTITLE not like", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleIn(List<String> values) {
            addCriterion("MSGTITLE in", values, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleNotIn(List<String> values) {
            addCriterion("MSGTITLE not in", values, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleBetween(String value1, String value2) {
            addCriterion("MSGTITLE between", value1, value2, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleNotBetween(String value1, String value2) {
            addCriterion("MSGTITLE not between", value1, value2, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgheadIsNull() {
            addCriterion("MSGHEAD is null");
            return (Criteria) this;
        }

        public Criteria andMsgheadIsNotNull() {
            addCriterion("MSGHEAD is not null");
            return (Criteria) this;
        }

        public Criteria andMsgheadEqualTo(String value) {
            addCriterion("MSGHEAD =", value, "msghead");
            return (Criteria) this;
        }

        public Criteria andMsgheadNotEqualTo(String value) {
            addCriterion("MSGHEAD <>", value, "msghead");
            return (Criteria) this;
        }

        public Criteria andMsgheadGreaterThan(String value) {
            addCriterion("MSGHEAD >", value, "msghead");
            return (Criteria) this;
        }

        public Criteria andMsgheadGreaterThanOrEqualTo(String value) {
            addCriterion("MSGHEAD >=", value, "msghead");
            return (Criteria) this;
        }

        public Criteria andMsgheadLessThan(String value) {
            addCriterion("MSGHEAD <", value, "msghead");
            return (Criteria) this;
        }

        public Criteria andMsgheadLessThanOrEqualTo(String value) {
            addCriterion("MSGHEAD <=", value, "msghead");
            return (Criteria) this;
        }

        public Criteria andMsgheadLike(String value) {
            addCriterion("MSGHEAD like", value, "msghead");
            return (Criteria) this;
        }

        public Criteria andMsgheadNotLike(String value) {
            addCriterion("MSGHEAD not like", value, "msghead");
            return (Criteria) this;
        }

        public Criteria andMsgheadIn(List<String> values) {
            addCriterion("MSGHEAD in", values, "msghead");
            return (Criteria) this;
        }

        public Criteria andMsgheadNotIn(List<String> values) {
            addCriterion("MSGHEAD not in", values, "msghead");
            return (Criteria) this;
        }

        public Criteria andMsgheadBetween(String value1, String value2) {
            addCriterion("MSGHEAD between", value1, value2, "msghead");
            return (Criteria) this;
        }

        public Criteria andMsgheadNotBetween(String value1, String value2) {
            addCriterion("MSGHEAD not between", value1, value2, "msghead");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andMsgtailIsNull() {
            addCriterion("MSGTAIL is null");
            return (Criteria) this;
        }

        public Criteria andMsgtailIsNotNull() {
            addCriterion("MSGTAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtailEqualTo(String value) {
            addCriterion("MSGTAIL =", value, "msgtail");
            return (Criteria) this;
        }

        public Criteria andMsgtailNotEqualTo(String value) {
            addCriterion("MSGTAIL <>", value, "msgtail");
            return (Criteria) this;
        }

        public Criteria andMsgtailGreaterThan(String value) {
            addCriterion("MSGTAIL >", value, "msgtail");
            return (Criteria) this;
        }

        public Criteria andMsgtailGreaterThanOrEqualTo(String value) {
            addCriterion("MSGTAIL >=", value, "msgtail");
            return (Criteria) this;
        }

        public Criteria andMsgtailLessThan(String value) {
            addCriterion("MSGTAIL <", value, "msgtail");
            return (Criteria) this;
        }

        public Criteria andMsgtailLessThanOrEqualTo(String value) {
            addCriterion("MSGTAIL <=", value, "msgtail");
            return (Criteria) this;
        }

        public Criteria andMsgtailLike(String value) {
            addCriterion("MSGTAIL like", value, "msgtail");
            return (Criteria) this;
        }

        public Criteria andMsgtailNotLike(String value) {
            addCriterion("MSGTAIL not like", value, "msgtail");
            return (Criteria) this;
        }

        public Criteria andMsgtailIn(List<String> values) {
            addCriterion("MSGTAIL in", values, "msgtail");
            return (Criteria) this;
        }

        public Criteria andMsgtailNotIn(List<String> values) {
            addCriterion("MSGTAIL not in", values, "msgtail");
            return (Criteria) this;
        }

        public Criteria andMsgtailBetween(String value1, String value2) {
            addCriterion("MSGTAIL between", value1, value2, "msgtail");
            return (Criteria) this;
        }

        public Criteria andMsgtailNotBetween(String value1, String value2) {
            addCriterion("MSGTAIL not between", value1, value2, "msgtail");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
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
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_msgtemplate_td
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
     * @Table : mm_msgtemplate_td
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