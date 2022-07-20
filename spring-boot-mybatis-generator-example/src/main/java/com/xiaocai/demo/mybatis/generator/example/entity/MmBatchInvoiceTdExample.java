package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmBatchInvoiceTdExample {
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
    public MmBatchInvoiceTdExample() {
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
     * @Table : mm_batch_invoice_td
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("TASKID is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("TASKID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("TASKID =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("TASKID <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("TASKID >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("TASKID >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("TASKID <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("TASKID <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("TASKID like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("TASKID not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("TASKID in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("TASKID not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("TASKID between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("TASKID not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andPrintflagIsNull() {
            addCriterion("PRINTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andPrintflagIsNotNull() {
            addCriterion("PRINTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPrintflagEqualTo(String value) {
            addCriterion("PRINTFLAG =", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagNotEqualTo(String value) {
            addCriterion("PRINTFLAG <>", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagGreaterThan(String value) {
            addCriterion("PRINTFLAG >", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagGreaterThanOrEqualTo(String value) {
            addCriterion("PRINTFLAG >=", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagLessThan(String value) {
            addCriterion("PRINTFLAG <", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagLessThanOrEqualTo(String value) {
            addCriterion("PRINTFLAG <=", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagLike(String value) {
            addCriterion("PRINTFLAG like", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagNotLike(String value) {
            addCriterion("PRINTFLAG not like", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagIn(List<String> values) {
            addCriterion("PRINTFLAG in", values, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagNotIn(List<String> values) {
            addCriterion("PRINTFLAG not in", values, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagBetween(String value1, String value2) {
            addCriterion("PRINTFLAG between", value1, value2, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagNotBetween(String value1, String value2) {
            addCriterion("PRINTFLAG not between", value1, value2, "printflag");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadIsNull() {
            addCriterion("INVOICEHEAD is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadIsNotNull() {
            addCriterion("INVOICEHEAD is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadEqualTo(String value) {
            addCriterion("INVOICEHEAD =", value, "invoicehead");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadNotEqualTo(String value) {
            addCriterion("INVOICEHEAD <>", value, "invoicehead");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadGreaterThan(String value) {
            addCriterion("INVOICEHEAD >", value, "invoicehead");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEHEAD >=", value, "invoicehead");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadLessThan(String value) {
            addCriterion("INVOICEHEAD <", value, "invoicehead");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadLessThanOrEqualTo(String value) {
            addCriterion("INVOICEHEAD <=", value, "invoicehead");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadLike(String value) {
            addCriterion("INVOICEHEAD like", value, "invoicehead");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadNotLike(String value) {
            addCriterion("INVOICEHEAD not like", value, "invoicehead");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadIn(List<String> values) {
            addCriterion("INVOICEHEAD in", values, "invoicehead");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadNotIn(List<String> values) {
            addCriterion("INVOICEHEAD not in", values, "invoicehead");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadBetween(String value1, String value2) {
            addCriterion("INVOICEHEAD between", value1, value2, "invoicehead");
            return (Criteria) this;
        }

        public Criteria andInvoiceheadNotBetween(String value1, String value2) {
            addCriterion("INVOICEHEAD not between", value1, value2, "invoicehead");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNull() {
            addCriterion("INVOICETYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNotNull() {
            addCriterion("INVOICETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeEqualTo(String value) {
            addCriterion("INVOICETYPE =", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotEqualTo(String value) {
            addCriterion("INVOICETYPE <>", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThan(String value) {
            addCriterion("INVOICETYPE >", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICETYPE >=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThan(String value) {
            addCriterion("INVOICETYPE <", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThanOrEqualTo(String value) {
            addCriterion("INVOICETYPE <=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLike(String value) {
            addCriterion("INVOICETYPE like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotLike(String value) {
            addCriterion("INVOICETYPE not like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIn(List<String> values) {
            addCriterion("INVOICETYPE in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotIn(List<String> values) {
            addCriterion("INVOICETYPE not in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeBetween(String value1, String value2) {
            addCriterion("INVOICETYPE between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotBetween(String value1, String value2) {
            addCriterion("INVOICETYPE not between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoIsNull() {
            addCriterion("TAXPAYERNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoIsNotNull() {
            addCriterion("TAXPAYERNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoEqualTo(String value) {
            addCriterion("TAXPAYERNO =", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoNotEqualTo(String value) {
            addCriterion("TAXPAYERNO <>", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoGreaterThan(String value) {
            addCriterion("TAXPAYERNO >", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNO >=", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoLessThan(String value) {
            addCriterion("TAXPAYERNO <", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERNO <=", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoLike(String value) {
            addCriterion("TAXPAYERNO like", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoNotLike(String value) {
            addCriterion("TAXPAYERNO not like", value, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoIn(List<String> values) {
            addCriterion("TAXPAYERNO in", values, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoNotIn(List<String> values) {
            addCriterion("TAXPAYERNO not in", values, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoBetween(String value1, String value2) {
            addCriterion("TAXPAYERNO between", value1, value2, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayernoNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERNO not between", value1, value2, "taxpayerno");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileIsNull() {
            addCriterion("TAXPAYERMOBILE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileIsNotNull() {
            addCriterion("TAXPAYERMOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileEqualTo(String value) {
            addCriterion("TAXPAYERMOBILE =", value, "taxpayermobile");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileNotEqualTo(String value) {
            addCriterion("TAXPAYERMOBILE <>", value, "taxpayermobile");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileGreaterThan(String value) {
            addCriterion("TAXPAYERMOBILE >", value, "taxpayermobile");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERMOBILE >=", value, "taxpayermobile");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileLessThan(String value) {
            addCriterion("TAXPAYERMOBILE <", value, "taxpayermobile");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERMOBILE <=", value, "taxpayermobile");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileLike(String value) {
            addCriterion("TAXPAYERMOBILE like", value, "taxpayermobile");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileNotLike(String value) {
            addCriterion("TAXPAYERMOBILE not like", value, "taxpayermobile");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileIn(List<String> values) {
            addCriterion("TAXPAYERMOBILE in", values, "taxpayermobile");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileNotIn(List<String> values) {
            addCriterion("TAXPAYERMOBILE not in", values, "taxpayermobile");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileBetween(String value1, String value2) {
            addCriterion("TAXPAYERMOBILE between", value1, value2, "taxpayermobile");
            return (Criteria) this;
        }

        public Criteria andTaxpayermobileNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERMOBILE not between", value1, value2, "taxpayermobile");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressIsNull() {
            addCriterion("TAXPAYERADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressIsNotNull() {
            addCriterion("TAXPAYERADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressEqualTo(String value) {
            addCriterion("TAXPAYERADDRESS =", value, "taxpayeraddress");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressNotEqualTo(String value) {
            addCriterion("TAXPAYERADDRESS <>", value, "taxpayeraddress");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressGreaterThan(String value) {
            addCriterion("TAXPAYERADDRESS >", value, "taxpayeraddress");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERADDRESS >=", value, "taxpayeraddress");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressLessThan(String value) {
            addCriterion("TAXPAYERADDRESS <", value, "taxpayeraddress");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERADDRESS <=", value, "taxpayeraddress");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressLike(String value) {
            addCriterion("TAXPAYERADDRESS like", value, "taxpayeraddress");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressNotLike(String value) {
            addCriterion("TAXPAYERADDRESS not like", value, "taxpayeraddress");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressIn(List<String> values) {
            addCriterion("TAXPAYERADDRESS in", values, "taxpayeraddress");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressNotIn(List<String> values) {
            addCriterion("TAXPAYERADDRESS not in", values, "taxpayeraddress");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressBetween(String value1, String value2) {
            addCriterion("TAXPAYERADDRESS between", value1, value2, "taxpayeraddress");
            return (Criteria) this;
        }

        public Criteria andTaxpayeraddressNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERADDRESS not between", value1, value2, "taxpayeraddress");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountIsNull() {
            addCriterion("TAXPAYEROPENACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountIsNotNull() {
            addCriterion("TAXPAYEROPENACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountEqualTo(String value) {
            addCriterion("TAXPAYEROPENACCOUNT =", value, "taxpayeropenaccount");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountNotEqualTo(String value) {
            addCriterion("TAXPAYEROPENACCOUNT <>", value, "taxpayeropenaccount");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountGreaterThan(String value) {
            addCriterion("TAXPAYEROPENACCOUNT >", value, "taxpayeropenaccount");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYEROPENACCOUNT >=", value, "taxpayeropenaccount");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountLessThan(String value) {
            addCriterion("TAXPAYEROPENACCOUNT <", value, "taxpayeropenaccount");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYEROPENACCOUNT <=", value, "taxpayeropenaccount");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountLike(String value) {
            addCriterion("TAXPAYEROPENACCOUNT like", value, "taxpayeropenaccount");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountNotLike(String value) {
            addCriterion("TAXPAYEROPENACCOUNT not like", value, "taxpayeropenaccount");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountIn(List<String> values) {
            addCriterion("TAXPAYEROPENACCOUNT in", values, "taxpayeropenaccount");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountNotIn(List<String> values) {
            addCriterion("TAXPAYEROPENACCOUNT not in", values, "taxpayeropenaccount");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountBetween(String value1, String value2) {
            addCriterion("TAXPAYEROPENACCOUNT between", value1, value2, "taxpayeropenaccount");
            return (Criteria) this;
        }

        public Criteria andTaxpayeropenaccountNotBetween(String value1, String value2) {
            addCriterion("TAXPAYEROPENACCOUNT not between", value1, value2, "taxpayeropenaccount");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoIsNull() {
            addCriterion("TAXPAYERBANKNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoIsNotNull() {
            addCriterion("TAXPAYERBANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoEqualTo(String value) {
            addCriterion("TAXPAYERBANKNO =", value, "taxpayerbankno");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoNotEqualTo(String value) {
            addCriterion("TAXPAYERBANKNO <>", value, "taxpayerbankno");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoGreaterThan(String value) {
            addCriterion("TAXPAYERBANKNO >", value, "taxpayerbankno");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERBANKNO >=", value, "taxpayerbankno");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoLessThan(String value) {
            addCriterion("TAXPAYERBANKNO <", value, "taxpayerbankno");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERBANKNO <=", value, "taxpayerbankno");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoLike(String value) {
            addCriterion("TAXPAYERBANKNO like", value, "taxpayerbankno");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoNotLike(String value) {
            addCriterion("TAXPAYERBANKNO not like", value, "taxpayerbankno");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoIn(List<String> values) {
            addCriterion("TAXPAYERBANKNO in", values, "taxpayerbankno");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoNotIn(List<String> values) {
            addCriterion("TAXPAYERBANKNO not in", values, "taxpayerbankno");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoBetween(String value1, String value2) {
            addCriterion("TAXPAYERBANKNO between", value1, value2, "taxpayerbankno");
            return (Criteria) this;
        }

        public Criteria andTaxpayerbanknoNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERBANKNO not between", value1, value2, "taxpayerbankno");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneIsNull() {
            addCriterion("TAXPAYERCELLPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneIsNotNull() {
            addCriterion("TAXPAYERCELLPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneEqualTo(String value) {
            addCriterion("TAXPAYERCELLPHONE =", value, "taxpayercellphone");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneNotEqualTo(String value) {
            addCriterion("TAXPAYERCELLPHONE <>", value, "taxpayercellphone");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneGreaterThan(String value) {
            addCriterion("TAXPAYERCELLPHONE >", value, "taxpayercellphone");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYERCELLPHONE >=", value, "taxpayercellphone");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneLessThan(String value) {
            addCriterion("TAXPAYERCELLPHONE <", value, "taxpayercellphone");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYERCELLPHONE <=", value, "taxpayercellphone");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneLike(String value) {
            addCriterion("TAXPAYERCELLPHONE like", value, "taxpayercellphone");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneNotLike(String value) {
            addCriterion("TAXPAYERCELLPHONE not like", value, "taxpayercellphone");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneIn(List<String> values) {
            addCriterion("TAXPAYERCELLPHONE in", values, "taxpayercellphone");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneNotIn(List<String> values) {
            addCriterion("TAXPAYERCELLPHONE not in", values, "taxpayercellphone");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneBetween(String value1, String value2) {
            addCriterion("TAXPAYERCELLPHONE between", value1, value2, "taxpayercellphone");
            return (Criteria) this;
        }

        public Criteria andTaxpayercellphoneNotBetween(String value1, String value2) {
            addCriterion("TAXPAYERCELLPHONE not between", value1, value2, "taxpayercellphone");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailIsNull() {
            addCriterion("TAXPAYEREMAIL is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailIsNotNull() {
            addCriterion("TAXPAYEREMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailEqualTo(String value) {
            addCriterion("TAXPAYEREMAIL =", value, "taxpayeremail");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailNotEqualTo(String value) {
            addCriterion("TAXPAYEREMAIL <>", value, "taxpayeremail");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailGreaterThan(String value) {
            addCriterion("TAXPAYEREMAIL >", value, "taxpayeremail");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYEREMAIL >=", value, "taxpayeremail");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailLessThan(String value) {
            addCriterion("TAXPAYEREMAIL <", value, "taxpayeremail");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYEREMAIL <=", value, "taxpayeremail");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailLike(String value) {
            addCriterion("TAXPAYEREMAIL like", value, "taxpayeremail");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailNotLike(String value) {
            addCriterion("TAXPAYEREMAIL not like", value, "taxpayeremail");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailIn(List<String> values) {
            addCriterion("TAXPAYEREMAIL in", values, "taxpayeremail");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailNotIn(List<String> values) {
            addCriterion("TAXPAYEREMAIL not in", values, "taxpayeremail");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailBetween(String value1, String value2) {
            addCriterion("TAXPAYEREMAIL between", value1, value2, "taxpayeremail");
            return (Criteria) this;
        }

        public Criteria andTaxpayeremailNotBetween(String value1, String value2) {
            addCriterion("TAXPAYEREMAIL not between", value1, value2, "taxpayeremail");
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

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNull() {
            addCriterion("BATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("BATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(String value) {
            addCriterion("BATCHNO =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(String value) {
            addCriterion("BATCHNO <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(String value) {
            addCriterion("BATCHNO >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHNO >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(String value) {
            addCriterion("BATCHNO <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(String value) {
            addCriterion("BATCHNO <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLike(String value) {
            addCriterion("BATCHNO like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotLike(String value) {
            addCriterion("BATCHNO not like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<String> values) {
            addCriterion("BATCHNO in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<String> values) {
            addCriterion("BATCHNO not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(String value1, String value2) {
            addCriterion("BATCHNO between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(String value1, String value2) {
            addCriterion("BATCHNO not between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoIsNull() {
            addCriterion("RESULTBATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoIsNotNull() {
            addCriterion("RESULTBATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoEqualTo(String value) {
            addCriterion("RESULTBATCHNO =", value, "resultbatchno");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoNotEqualTo(String value) {
            addCriterion("RESULTBATCHNO <>", value, "resultbatchno");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoGreaterThan(String value) {
            addCriterion("RESULTBATCHNO >", value, "resultbatchno");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("RESULTBATCHNO >=", value, "resultbatchno");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoLessThan(String value) {
            addCriterion("RESULTBATCHNO <", value, "resultbatchno");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoLessThanOrEqualTo(String value) {
            addCriterion("RESULTBATCHNO <=", value, "resultbatchno");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoLike(String value) {
            addCriterion("RESULTBATCHNO like", value, "resultbatchno");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoNotLike(String value) {
            addCriterion("RESULTBATCHNO not like", value, "resultbatchno");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoIn(List<String> values) {
            addCriterion("RESULTBATCHNO in", values, "resultbatchno");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoNotIn(List<String> values) {
            addCriterion("RESULTBATCHNO not in", values, "resultbatchno");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoBetween(String value1, String value2) {
            addCriterion("RESULTBATCHNO between", value1, value2, "resultbatchno");
            return (Criteria) this;
        }

        public Criteria andResultbatchnoNotBetween(String value1, String value2) {
            addCriterion("RESULTBATCHNO not between", value1, value2, "resultbatchno");
            return (Criteria) this;
        }

        public Criteria andResultmsgIsNull() {
            addCriterion("RESULTMSG is null");
            return (Criteria) this;
        }

        public Criteria andResultmsgIsNotNull() {
            addCriterion("RESULTMSG is not null");
            return (Criteria) this;
        }

        public Criteria andResultmsgEqualTo(String value) {
            addCriterion("RESULTMSG =", value, "resultmsg");
            return (Criteria) this;
        }

        public Criteria andResultmsgNotEqualTo(String value) {
            addCriterion("RESULTMSG <>", value, "resultmsg");
            return (Criteria) this;
        }

        public Criteria andResultmsgGreaterThan(String value) {
            addCriterion("RESULTMSG >", value, "resultmsg");
            return (Criteria) this;
        }

        public Criteria andResultmsgGreaterThanOrEqualTo(String value) {
            addCriterion("RESULTMSG >=", value, "resultmsg");
            return (Criteria) this;
        }

        public Criteria andResultmsgLessThan(String value) {
            addCriterion("RESULTMSG <", value, "resultmsg");
            return (Criteria) this;
        }

        public Criteria andResultmsgLessThanOrEqualTo(String value) {
            addCriterion("RESULTMSG <=", value, "resultmsg");
            return (Criteria) this;
        }

        public Criteria andResultmsgLike(String value) {
            addCriterion("RESULTMSG like", value, "resultmsg");
            return (Criteria) this;
        }

        public Criteria andResultmsgNotLike(String value) {
            addCriterion("RESULTMSG not like", value, "resultmsg");
            return (Criteria) this;
        }

        public Criteria andResultmsgIn(List<String> values) {
            addCriterion("RESULTMSG in", values, "resultmsg");
            return (Criteria) this;
        }

        public Criteria andResultmsgNotIn(List<String> values) {
            addCriterion("RESULTMSG not in", values, "resultmsg");
            return (Criteria) this;
        }

        public Criteria andResultmsgBetween(String value1, String value2) {
            addCriterion("RESULTMSG between", value1, value2, "resultmsg");
            return (Criteria) this;
        }

        public Criteria andResultmsgNotBetween(String value1, String value2) {
            addCriterion("RESULTMSG not between", value1, value2, "resultmsg");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("MSG is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("MSG is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("MSG =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("MSG <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("MSG >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("MSG >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("MSG <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("MSG <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("MSG like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("MSG not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("MSG in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("MSG not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("MSG between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("MSG not between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andResultstatusIsNull() {
            addCriterion("RESULTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andResultstatusIsNotNull() {
            addCriterion("RESULTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andResultstatusEqualTo(String value) {
            addCriterion("RESULTSTATUS =", value, "resultstatus");
            return (Criteria) this;
        }

        public Criteria andResultstatusNotEqualTo(String value) {
            addCriterion("RESULTSTATUS <>", value, "resultstatus");
            return (Criteria) this;
        }

        public Criteria andResultstatusGreaterThan(String value) {
            addCriterion("RESULTSTATUS >", value, "resultstatus");
            return (Criteria) this;
        }

        public Criteria andResultstatusGreaterThanOrEqualTo(String value) {
            addCriterion("RESULTSTATUS >=", value, "resultstatus");
            return (Criteria) this;
        }

        public Criteria andResultstatusLessThan(String value) {
            addCriterion("RESULTSTATUS <", value, "resultstatus");
            return (Criteria) this;
        }

        public Criteria andResultstatusLessThanOrEqualTo(String value) {
            addCriterion("RESULTSTATUS <=", value, "resultstatus");
            return (Criteria) this;
        }

        public Criteria andResultstatusLike(String value) {
            addCriterion("RESULTSTATUS like", value, "resultstatus");
            return (Criteria) this;
        }

        public Criteria andResultstatusNotLike(String value) {
            addCriterion("RESULTSTATUS not like", value, "resultstatus");
            return (Criteria) this;
        }

        public Criteria andResultstatusIn(List<String> values) {
            addCriterion("RESULTSTATUS in", values, "resultstatus");
            return (Criteria) this;
        }

        public Criteria andResultstatusNotIn(List<String> values) {
            addCriterion("RESULTSTATUS not in", values, "resultstatus");
            return (Criteria) this;
        }

        public Criteria andResultstatusBetween(String value1, String value2) {
            addCriterion("RESULTSTATUS between", value1, value2, "resultstatus");
            return (Criteria) this;
        }

        public Criteria andResultstatusNotBetween(String value1, String value2) {
            addCriterion("RESULTSTATUS not between", value1, value2, "resultstatus");
            return (Criteria) this;
        }

        public Criteria andShortlinkIsNull() {
            addCriterion("SHORTLINK is null");
            return (Criteria) this;
        }

        public Criteria andShortlinkIsNotNull() {
            addCriterion("SHORTLINK is not null");
            return (Criteria) this;
        }

        public Criteria andShortlinkEqualTo(String value) {
            addCriterion("SHORTLINK =", value, "shortlink");
            return (Criteria) this;
        }

        public Criteria andShortlinkNotEqualTo(String value) {
            addCriterion("SHORTLINK <>", value, "shortlink");
            return (Criteria) this;
        }

        public Criteria andShortlinkGreaterThan(String value) {
            addCriterion("SHORTLINK >", value, "shortlink");
            return (Criteria) this;
        }

        public Criteria andShortlinkGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTLINK >=", value, "shortlink");
            return (Criteria) this;
        }

        public Criteria andShortlinkLessThan(String value) {
            addCriterion("SHORTLINK <", value, "shortlink");
            return (Criteria) this;
        }

        public Criteria andShortlinkLessThanOrEqualTo(String value) {
            addCriterion("SHORTLINK <=", value, "shortlink");
            return (Criteria) this;
        }

        public Criteria andShortlinkLike(String value) {
            addCriterion("SHORTLINK like", value, "shortlink");
            return (Criteria) this;
        }

        public Criteria andShortlinkNotLike(String value) {
            addCriterion("SHORTLINK not like", value, "shortlink");
            return (Criteria) this;
        }

        public Criteria andShortlinkIn(List<String> values) {
            addCriterion("SHORTLINK in", values, "shortlink");
            return (Criteria) this;
        }

        public Criteria andShortlinkNotIn(List<String> values) {
            addCriterion("SHORTLINK not in", values, "shortlink");
            return (Criteria) this;
        }

        public Criteria andShortlinkBetween(String value1, String value2) {
            addCriterion("SHORTLINK between", value1, value2, "shortlink");
            return (Criteria) this;
        }

        public Criteria andShortlinkNotBetween(String value1, String value2) {
            addCriterion("SHORTLINK not between", value1, value2, "shortlink");
            return (Criteria) this;
        }

        public Criteria andErrorinfoIsNull() {
            addCriterion("ERRORINFO is null");
            return (Criteria) this;
        }

        public Criteria andErrorinfoIsNotNull() {
            addCriterion("ERRORINFO is not null");
            return (Criteria) this;
        }

        public Criteria andErrorinfoEqualTo(String value) {
            addCriterion("ERRORINFO =", value, "errorinfo");
            return (Criteria) this;
        }

        public Criteria andErrorinfoNotEqualTo(String value) {
            addCriterion("ERRORINFO <>", value, "errorinfo");
            return (Criteria) this;
        }

        public Criteria andErrorinfoGreaterThan(String value) {
            addCriterion("ERRORINFO >", value, "errorinfo");
            return (Criteria) this;
        }

        public Criteria andErrorinfoGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORINFO >=", value, "errorinfo");
            return (Criteria) this;
        }

        public Criteria andErrorinfoLessThan(String value) {
            addCriterion("ERRORINFO <", value, "errorinfo");
            return (Criteria) this;
        }

        public Criteria andErrorinfoLessThanOrEqualTo(String value) {
            addCriterion("ERRORINFO <=", value, "errorinfo");
            return (Criteria) this;
        }

        public Criteria andErrorinfoLike(String value) {
            addCriterion("ERRORINFO like", value, "errorinfo");
            return (Criteria) this;
        }

        public Criteria andErrorinfoNotLike(String value) {
            addCriterion("ERRORINFO not like", value, "errorinfo");
            return (Criteria) this;
        }

        public Criteria andErrorinfoIn(List<String> values) {
            addCriterion("ERRORINFO in", values, "errorinfo");
            return (Criteria) this;
        }

        public Criteria andErrorinfoNotIn(List<String> values) {
            addCriterion("ERRORINFO not in", values, "errorinfo");
            return (Criteria) this;
        }

        public Criteria andErrorinfoBetween(String value1, String value2) {
            addCriterion("ERRORINFO between", value1, value2, "errorinfo");
            return (Criteria) this;
        }

        public Criteria andErrorinfoNotBetween(String value1, String value2) {
            addCriterion("ERRORINFO not between", value1, value2, "errorinfo");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoIsNull() {
            addCriterion("shortlinkbatchno is null");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoIsNotNull() {
            addCriterion("shortlinkbatchno is not null");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoEqualTo(String value) {
            addCriterion("shortlinkbatchno =", value, "shortlinkbatchno");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoNotEqualTo(String value) {
            addCriterion("shortlinkbatchno <>", value, "shortlinkbatchno");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoGreaterThan(String value) {
            addCriterion("shortlinkbatchno >", value, "shortlinkbatchno");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("shortlinkbatchno >=", value, "shortlinkbatchno");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoLessThan(String value) {
            addCriterion("shortlinkbatchno <", value, "shortlinkbatchno");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoLessThanOrEqualTo(String value) {
            addCriterion("shortlinkbatchno <=", value, "shortlinkbatchno");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoLike(String value) {
            addCriterion("shortlinkbatchno like", value, "shortlinkbatchno");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoNotLike(String value) {
            addCriterion("shortlinkbatchno not like", value, "shortlinkbatchno");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoIn(List<String> values) {
            addCriterion("shortlinkbatchno in", values, "shortlinkbatchno");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoNotIn(List<String> values) {
            addCriterion("shortlinkbatchno not in", values, "shortlinkbatchno");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoBetween(String value1, String value2) {
            addCriterion("shortlinkbatchno between", value1, value2, "shortlinkbatchno");
            return (Criteria) this;
        }

        public Criteria andShortlinkbatchnoNotBetween(String value1, String value2) {
            addCriterion("shortlinkbatchno not between", value1, value2, "shortlinkbatchno");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceIsNull() {
            addCriterion("SEQINVOICE is null");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceIsNotNull() {
            addCriterion("SEQINVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceEqualTo(Long value) {
            addCriterion("SEQINVOICE =", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceNotEqualTo(Long value) {
            addCriterion("SEQINVOICE <>", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceGreaterThan(Long value) {
            addCriterion("SEQINVOICE >", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQINVOICE >=", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceLessThan(Long value) {
            addCriterion("SEQINVOICE <", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceLessThanOrEqualTo(Long value) {
            addCriterion("SEQINVOICE <=", value, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceIn(List<Long> values) {
            addCriterion("SEQINVOICE in", values, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceNotIn(List<Long> values) {
            addCriterion("SEQINVOICE not in", values, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceBetween(Long value1, Long value2) {
            addCriterion("SEQINVOICE between", value1, value2, "seqinvoice");
            return (Criteria) this;
        }

        public Criteria andSeqinvoiceNotBetween(Long value1, Long value2) {
            addCriterion("SEQINVOICE not between", value1, value2, "seqinvoice");
            return (Criteria) this;
        }
    }

    /**
     * addClassComment by 3 params : 
     * @Table : mm_batch_invoice_td
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
     * @Table : mm_batch_invoice_td
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