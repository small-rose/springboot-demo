package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmFtpCofTcExample {
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
    public MmFtpCofTcExample() {
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
     * @Table : mm_ftp_cof_tc
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("mid like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("mid not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameIsNull() {
            addCriterion("ftprealmname is null");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameIsNotNull() {
            addCriterion("ftprealmname is not null");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameEqualTo(String value) {
            addCriterion("ftprealmname =", value, "ftprealmname");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameNotEqualTo(String value) {
            addCriterion("ftprealmname <>", value, "ftprealmname");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameGreaterThan(String value) {
            addCriterion("ftprealmname >", value, "ftprealmname");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameGreaterThanOrEqualTo(String value) {
            addCriterion("ftprealmname >=", value, "ftprealmname");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameLessThan(String value) {
            addCriterion("ftprealmname <", value, "ftprealmname");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameLessThanOrEqualTo(String value) {
            addCriterion("ftprealmname <=", value, "ftprealmname");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameLike(String value) {
            addCriterion("ftprealmname like", value, "ftprealmname");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameNotLike(String value) {
            addCriterion("ftprealmname not like", value, "ftprealmname");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameIn(List<String> values) {
            addCriterion("ftprealmname in", values, "ftprealmname");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameNotIn(List<String> values) {
            addCriterion("ftprealmname not in", values, "ftprealmname");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameBetween(String value1, String value2) {
            addCriterion("ftprealmname between", value1, value2, "ftprealmname");
            return (Criteria) this;
        }

        public Criteria andFtprealmnameNotBetween(String value1, String value2) {
            addCriterion("ftprealmname not between", value1, value2, "ftprealmname");
            return (Criteria) this;
        }

        public Criteria andFtpipIsNull() {
            addCriterion("ftpip is null");
            return (Criteria) this;
        }

        public Criteria andFtpipIsNotNull() {
            addCriterion("ftpip is not null");
            return (Criteria) this;
        }

        public Criteria andFtpipEqualTo(String value) {
            addCriterion("ftpip =", value, "ftpip");
            return (Criteria) this;
        }

        public Criteria andFtpipNotEqualTo(String value) {
            addCriterion("ftpip <>", value, "ftpip");
            return (Criteria) this;
        }

        public Criteria andFtpipGreaterThan(String value) {
            addCriterion("ftpip >", value, "ftpip");
            return (Criteria) this;
        }

        public Criteria andFtpipGreaterThanOrEqualTo(String value) {
            addCriterion("ftpip >=", value, "ftpip");
            return (Criteria) this;
        }

        public Criteria andFtpipLessThan(String value) {
            addCriterion("ftpip <", value, "ftpip");
            return (Criteria) this;
        }

        public Criteria andFtpipLessThanOrEqualTo(String value) {
            addCriterion("ftpip <=", value, "ftpip");
            return (Criteria) this;
        }

        public Criteria andFtpipLike(String value) {
            addCriterion("ftpip like", value, "ftpip");
            return (Criteria) this;
        }

        public Criteria andFtpipNotLike(String value) {
            addCriterion("ftpip not like", value, "ftpip");
            return (Criteria) this;
        }

        public Criteria andFtpipIn(List<String> values) {
            addCriterion("ftpip in", values, "ftpip");
            return (Criteria) this;
        }

        public Criteria andFtpipNotIn(List<String> values) {
            addCriterion("ftpip not in", values, "ftpip");
            return (Criteria) this;
        }

        public Criteria andFtpipBetween(String value1, String value2) {
            addCriterion("ftpip between", value1, value2, "ftpip");
            return (Criteria) this;
        }

        public Criteria andFtpipNotBetween(String value1, String value2) {
            addCriterion("ftpip not between", value1, value2, "ftpip");
            return (Criteria) this;
        }

        public Criteria andFtpuserIsNull() {
            addCriterion("ftpuser is null");
            return (Criteria) this;
        }

        public Criteria andFtpuserIsNotNull() {
            addCriterion("ftpuser is not null");
            return (Criteria) this;
        }

        public Criteria andFtpuserEqualTo(String value) {
            addCriterion("ftpuser =", value, "ftpuser");
            return (Criteria) this;
        }

        public Criteria andFtpuserNotEqualTo(String value) {
            addCriterion("ftpuser <>", value, "ftpuser");
            return (Criteria) this;
        }

        public Criteria andFtpuserGreaterThan(String value) {
            addCriterion("ftpuser >", value, "ftpuser");
            return (Criteria) this;
        }

        public Criteria andFtpuserGreaterThanOrEqualTo(String value) {
            addCriterion("ftpuser >=", value, "ftpuser");
            return (Criteria) this;
        }

        public Criteria andFtpuserLessThan(String value) {
            addCriterion("ftpuser <", value, "ftpuser");
            return (Criteria) this;
        }

        public Criteria andFtpuserLessThanOrEqualTo(String value) {
            addCriterion("ftpuser <=", value, "ftpuser");
            return (Criteria) this;
        }

        public Criteria andFtpuserLike(String value) {
            addCriterion("ftpuser like", value, "ftpuser");
            return (Criteria) this;
        }

        public Criteria andFtpuserNotLike(String value) {
            addCriterion("ftpuser not like", value, "ftpuser");
            return (Criteria) this;
        }

        public Criteria andFtpuserIn(List<String> values) {
            addCriterion("ftpuser in", values, "ftpuser");
            return (Criteria) this;
        }

        public Criteria andFtpuserNotIn(List<String> values) {
            addCriterion("ftpuser not in", values, "ftpuser");
            return (Criteria) this;
        }

        public Criteria andFtpuserBetween(String value1, String value2) {
            addCriterion("ftpuser between", value1, value2, "ftpuser");
            return (Criteria) this;
        }

        public Criteria andFtpuserNotBetween(String value1, String value2) {
            addCriterion("ftpuser not between", value1, value2, "ftpuser");
            return (Criteria) this;
        }

        public Criteria andFtppasswordIsNull() {
            addCriterion("ftppassword is null");
            return (Criteria) this;
        }

        public Criteria andFtppasswordIsNotNull() {
            addCriterion("ftppassword is not null");
            return (Criteria) this;
        }

        public Criteria andFtppasswordEqualTo(String value) {
            addCriterion("ftppassword =", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordNotEqualTo(String value) {
            addCriterion("ftppassword <>", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordGreaterThan(String value) {
            addCriterion("ftppassword >", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ftppassword >=", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordLessThan(String value) {
            addCriterion("ftppassword <", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordLessThanOrEqualTo(String value) {
            addCriterion("ftppassword <=", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordLike(String value) {
            addCriterion("ftppassword like", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordNotLike(String value) {
            addCriterion("ftppassword not like", value, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordIn(List<String> values) {
            addCriterion("ftppassword in", values, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordNotIn(List<String> values) {
            addCriterion("ftppassword not in", values, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordBetween(String value1, String value2) {
            addCriterion("ftppassword between", value1, value2, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFtppasswordNotBetween(String value1, String value2) {
            addCriterion("ftppassword not between", value1, value2, "ftppassword");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNull() {
            addCriterion("fileType is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("fileType is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("fileType =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("fileType <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("fileType >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("fileType >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("fileType <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("fileType <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("fileType like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("fileType not like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("fileType in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("fileType not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("fileType between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("fileType not between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFtpregionIsNull() {
            addCriterion("ftpregion is null");
            return (Criteria) this;
        }

        public Criteria andFtpregionIsNotNull() {
            addCriterion("ftpregion is not null");
            return (Criteria) this;
        }

        public Criteria andFtpregionEqualTo(String value) {
            addCriterion("ftpregion =", value, "ftpregion");
            return (Criteria) this;
        }

        public Criteria andFtpregionNotEqualTo(String value) {
            addCriterion("ftpregion <>", value, "ftpregion");
            return (Criteria) this;
        }

        public Criteria andFtpregionGreaterThan(String value) {
            addCriterion("ftpregion >", value, "ftpregion");
            return (Criteria) this;
        }

        public Criteria andFtpregionGreaterThanOrEqualTo(String value) {
            addCriterion("ftpregion >=", value, "ftpregion");
            return (Criteria) this;
        }

        public Criteria andFtpregionLessThan(String value) {
            addCriterion("ftpregion <", value, "ftpregion");
            return (Criteria) this;
        }

        public Criteria andFtpregionLessThanOrEqualTo(String value) {
            addCriterion("ftpregion <=", value, "ftpregion");
            return (Criteria) this;
        }

        public Criteria andFtpregionLike(String value) {
            addCriterion("ftpregion like", value, "ftpregion");
            return (Criteria) this;
        }

        public Criteria andFtpregionNotLike(String value) {
            addCriterion("ftpregion not like", value, "ftpregion");
            return (Criteria) this;
        }

        public Criteria andFtpregionIn(List<String> values) {
            addCriterion("ftpregion in", values, "ftpregion");
            return (Criteria) this;
        }

        public Criteria andFtpregionNotIn(List<String> values) {
            addCriterion("ftpregion not in", values, "ftpregion");
            return (Criteria) this;
        }

        public Criteria andFtpregionBetween(String value1, String value2) {
            addCriterion("ftpregion between", value1, value2, "ftpregion");
            return (Criteria) this;
        }

        public Criteria andFtpregionNotBetween(String value1, String value2) {
            addCriterion("ftpregion not between", value1, value2, "ftpregion");
            return (Criteria) this;
        }

        public Criteria andIfvalidIsNull() {
            addCriterion("ifvalid is null");
            return (Criteria) this;
        }

        public Criteria andIfvalidIsNotNull() {
            addCriterion("ifvalid is not null");
            return (Criteria) this;
        }

        public Criteria andIfvalidEqualTo(String value) {
            addCriterion("ifvalid =", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotEqualTo(String value) {
            addCriterion("ifvalid <>", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThan(String value) {
            addCriterion("ifvalid >", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThanOrEqualTo(String value) {
            addCriterion("ifvalid >=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThan(String value) {
            addCriterion("ifvalid <", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThanOrEqualTo(String value) {
            addCriterion("ifvalid <=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLike(String value) {
            addCriterion("ifvalid like", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotLike(String value) {
            addCriterion("ifvalid not like", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidIn(List<String> values) {
            addCriterion("ifvalid in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotIn(List<String> values) {
            addCriterion("ifvalid not in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidBetween(String value1, String value2) {
            addCriterion("ifvalid between", value1, value2, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotBetween(String value1, String value2) {
            addCriterion("ifvalid not between", value1, value2, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNull() {
            addCriterion("lastopdate is null");
            return (Criteria) this;
        }

        public Criteria andLastopdateIsNotNull() {
            addCriterion("lastopdate is not null");
            return (Criteria) this;
        }

        public Criteria andLastopdateEqualTo(Date value) {
            addCriterion("lastopdate =", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotEqualTo(Date value) {
            addCriterion("lastopdate <>", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThan(Date value) {
            addCriterion("lastopdate >", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastopdate >=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThan(Date value) {
            addCriterion("lastopdate <", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateLessThanOrEqualTo(Date value) {
            addCriterion("lastopdate <=", value, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateIn(List<Date> values) {
            addCriterion("lastopdate in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotIn(List<Date> values) {
            addCriterion("lastopdate not in", values, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateBetween(Date value1, Date value2) {
            addCriterion("lastopdate between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andLastopdateNotBetween(Date value1, Date value2) {
            addCriterion("lastopdate not between", value1, value2, "lastopdate");
            return (Criteria) this;
        }

        public Criteria andFtppathIsNull() {
            addCriterion("ftppath is null");
            return (Criteria) this;
        }

        public Criteria andFtppathIsNotNull() {
            addCriterion("ftppath is not null");
            return (Criteria) this;
        }

        public Criteria andFtppathEqualTo(String value) {
            addCriterion("ftppath =", value, "ftppath");
            return (Criteria) this;
        }

        public Criteria andFtppathNotEqualTo(String value) {
            addCriterion("ftppath <>", value, "ftppath");
            return (Criteria) this;
        }

        public Criteria andFtppathGreaterThan(String value) {
            addCriterion("ftppath >", value, "ftppath");
            return (Criteria) this;
        }

        public Criteria andFtppathGreaterThanOrEqualTo(String value) {
            addCriterion("ftppath >=", value, "ftppath");
            return (Criteria) this;
        }

        public Criteria andFtppathLessThan(String value) {
            addCriterion("ftppath <", value, "ftppath");
            return (Criteria) this;
        }

        public Criteria andFtppathLessThanOrEqualTo(String value) {
            addCriterion("ftppath <=", value, "ftppath");
            return (Criteria) this;
        }

        public Criteria andFtppathLike(String value) {
            addCriterion("ftppath like", value, "ftppath");
            return (Criteria) this;
        }

        public Criteria andFtppathNotLike(String value) {
            addCriterion("ftppath not like", value, "ftppath");
            return (Criteria) this;
        }

        public Criteria andFtppathIn(List<String> values) {
            addCriterion("ftppath in", values, "ftppath");
            return (Criteria) this;
        }

        public Criteria andFtppathNotIn(List<String> values) {
            addCriterion("ftppath not in", values, "ftppath");
            return (Criteria) this;
        }

        public Criteria andFtppathBetween(String value1, String value2) {
            addCriterion("ftppath between", value1, value2, "ftppath");
            return (Criteria) this;
        }

        public Criteria andFtppathNotBetween(String value1, String value2) {
            addCriterion("ftppath not between", value1, value2, "ftppath");
            return (Criteria) this;
        }

        public Criteria andLocalpathIsNull() {
            addCriterion("localpath is null");
            return (Criteria) this;
        }

        public Criteria andLocalpathIsNotNull() {
            addCriterion("localpath is not null");
            return (Criteria) this;
        }

        public Criteria andLocalpathEqualTo(String value) {
            addCriterion("localpath =", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathNotEqualTo(String value) {
            addCriterion("localpath <>", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathGreaterThan(String value) {
            addCriterion("localpath >", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathGreaterThanOrEqualTo(String value) {
            addCriterion("localpath >=", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathLessThan(String value) {
            addCriterion("localpath <", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathLessThanOrEqualTo(String value) {
            addCriterion("localpath <=", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathLike(String value) {
            addCriterion("localpath like", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathNotLike(String value) {
            addCriterion("localpath not like", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathIn(List<String> values) {
            addCriterion("localpath in", values, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathNotIn(List<String> values) {
            addCriterion("localpath not in", values, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathBetween(String value1, String value2) {
            addCriterion("localpath between", value1, value2, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathNotBetween(String value1, String value2) {
            addCriterion("localpath not between", value1, value2, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucIsNull() {
            addCriterion("localpathsuc is null");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucIsNotNull() {
            addCriterion("localpathsuc is not null");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucEqualTo(String value) {
            addCriterion("localpathsuc =", value, "localpathsuc");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucNotEqualTo(String value) {
            addCriterion("localpathsuc <>", value, "localpathsuc");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucGreaterThan(String value) {
            addCriterion("localpathsuc >", value, "localpathsuc");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucGreaterThanOrEqualTo(String value) {
            addCriterion("localpathsuc >=", value, "localpathsuc");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucLessThan(String value) {
            addCriterion("localpathsuc <", value, "localpathsuc");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucLessThanOrEqualTo(String value) {
            addCriterion("localpathsuc <=", value, "localpathsuc");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucLike(String value) {
            addCriterion("localpathsuc like", value, "localpathsuc");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucNotLike(String value) {
            addCriterion("localpathsuc not like", value, "localpathsuc");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucIn(List<String> values) {
            addCriterion("localpathsuc in", values, "localpathsuc");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucNotIn(List<String> values) {
            addCriterion("localpathsuc not in", values, "localpathsuc");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucBetween(String value1, String value2) {
            addCriterion("localpathsuc between", value1, value2, "localpathsuc");
            return (Criteria) this;
        }

        public Criteria andLocalpathsucNotBetween(String value1, String value2) {
            addCriterion("localpathsuc not between", value1, value2, "localpathsuc");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrIsNull() {
            addCriterion("localpatherr is null");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrIsNotNull() {
            addCriterion("localpatherr is not null");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrEqualTo(String value) {
            addCriterion("localpatherr =", value, "localpatherr");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrNotEqualTo(String value) {
            addCriterion("localpatherr <>", value, "localpatherr");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrGreaterThan(String value) {
            addCriterion("localpatherr >", value, "localpatherr");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrGreaterThanOrEqualTo(String value) {
            addCriterion("localpatherr >=", value, "localpatherr");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrLessThan(String value) {
            addCriterion("localpatherr <", value, "localpatherr");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrLessThanOrEqualTo(String value) {
            addCriterion("localpatherr <=", value, "localpatherr");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrLike(String value) {
            addCriterion("localpatherr like", value, "localpatherr");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrNotLike(String value) {
            addCriterion("localpatherr not like", value, "localpatherr");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrIn(List<String> values) {
            addCriterion("localpatherr in", values, "localpatherr");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrNotIn(List<String> values) {
            addCriterion("localpatherr not in", values, "localpatherr");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrBetween(String value1, String value2) {
            addCriterion("localpatherr between", value1, value2, "localpatherr");
            return (Criteria) this;
        }

        public Criteria andLocalpatherrNotBetween(String value1, String value2) {
            addCriterion("localpatherr not between", value1, value2, "localpatherr");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_ftp_cof_tc
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
     * @Table : mm_ftp_cof_tc
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