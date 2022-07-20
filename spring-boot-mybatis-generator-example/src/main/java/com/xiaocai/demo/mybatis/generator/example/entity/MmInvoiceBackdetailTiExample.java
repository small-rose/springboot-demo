package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MmInvoiceBackdetailTiExample {
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
    public MmInvoiceBackdetailTiExample() {
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
     * @Table : mm_invoice_backdetail_ti
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

        public Criteria andFphxzIsNull() {
            addCriterion("FPHXZ is null");
            return (Criteria) this;
        }

        public Criteria andFphxzIsNotNull() {
            addCriterion("FPHXZ is not null");
            return (Criteria) this;
        }

        public Criteria andFphxzEqualTo(BigDecimal value) {
            addCriterion("FPHXZ =", value, "fphxz");
            return (Criteria) this;
        }

        public Criteria andFphxzNotEqualTo(BigDecimal value) {
            addCriterion("FPHXZ <>", value, "fphxz");
            return (Criteria) this;
        }

        public Criteria andFphxzGreaterThan(BigDecimal value) {
            addCriterion("FPHXZ >", value, "fphxz");
            return (Criteria) this;
        }

        public Criteria andFphxzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FPHXZ >=", value, "fphxz");
            return (Criteria) this;
        }

        public Criteria andFphxzLessThan(BigDecimal value) {
            addCriterion("FPHXZ <", value, "fphxz");
            return (Criteria) this;
        }

        public Criteria andFphxzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FPHXZ <=", value, "fphxz");
            return (Criteria) this;
        }

        public Criteria andFphxzIn(List<BigDecimal> values) {
            addCriterion("FPHXZ in", values, "fphxz");
            return (Criteria) this;
        }

        public Criteria andFphxzNotIn(List<BigDecimal> values) {
            addCriterion("FPHXZ not in", values, "fphxz");
            return (Criteria) this;
        }

        public Criteria andFphxzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPHXZ between", value1, value2, "fphxz");
            return (Criteria) this;
        }

        public Criteria andFphxzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FPHXZ not between", value1, value2, "fphxz");
            return (Criteria) this;
        }

        public Criteria andXmmcIsNull() {
            addCriterion("XMMC is null");
            return (Criteria) this;
        }

        public Criteria andXmmcIsNotNull() {
            addCriterion("XMMC is not null");
            return (Criteria) this;
        }

        public Criteria andXmmcEqualTo(String value) {
            addCriterion("XMMC =", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotEqualTo(String value) {
            addCriterion("XMMC <>", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcGreaterThan(String value) {
            addCriterion("XMMC >", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcGreaterThanOrEqualTo(String value) {
            addCriterion("XMMC >=", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcLessThan(String value) {
            addCriterion("XMMC <", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcLessThanOrEqualTo(String value) {
            addCriterion("XMMC <=", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcLike(String value) {
            addCriterion("XMMC like", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotLike(String value) {
            addCriterion("XMMC not like", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcIn(List<String> values) {
            addCriterion("XMMC in", values, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotIn(List<String> values) {
            addCriterion("XMMC not in", values, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcBetween(String value1, String value2) {
            addCriterion("XMMC between", value1, value2, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotBetween(String value1, String value2) {
            addCriterion("XMMC not between", value1, value2, "xmmc");
            return (Criteria) this;
        }

        public Criteria andGgxhIsNull() {
            addCriterion("GGXH is null");
            return (Criteria) this;
        }

        public Criteria andGgxhIsNotNull() {
            addCriterion("GGXH is not null");
            return (Criteria) this;
        }

        public Criteria andGgxhEqualTo(String value) {
            addCriterion("GGXH =", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhNotEqualTo(String value) {
            addCriterion("GGXH <>", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhGreaterThan(String value) {
            addCriterion("GGXH >", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhGreaterThanOrEqualTo(String value) {
            addCriterion("GGXH >=", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhLessThan(String value) {
            addCriterion("GGXH <", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhLessThanOrEqualTo(String value) {
            addCriterion("GGXH <=", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhLike(String value) {
            addCriterion("GGXH like", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhNotLike(String value) {
            addCriterion("GGXH not like", value, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhIn(List<String> values) {
            addCriterion("GGXH in", values, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhNotIn(List<String> values) {
            addCriterion("GGXH not in", values, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhBetween(String value1, String value2) {
            addCriterion("GGXH between", value1, value2, "ggxh");
            return (Criteria) this;
        }

        public Criteria andGgxhNotBetween(String value1, String value2) {
            addCriterion("GGXH not between", value1, value2, "ggxh");
            return (Criteria) this;
        }

        public Criteria andDwIsNull() {
            addCriterion("DW is null");
            return (Criteria) this;
        }

        public Criteria andDwIsNotNull() {
            addCriterion("DW is not null");
            return (Criteria) this;
        }

        public Criteria andDwEqualTo(String value) {
            addCriterion("DW =", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotEqualTo(String value) {
            addCriterion("DW <>", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwGreaterThan(String value) {
            addCriterion("DW >", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwGreaterThanOrEqualTo(String value) {
            addCriterion("DW >=", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLessThan(String value) {
            addCriterion("DW <", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLessThanOrEqualTo(String value) {
            addCriterion("DW <=", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLike(String value) {
            addCriterion("DW like", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotLike(String value) {
            addCriterion("DW not like", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwIn(List<String> values) {
            addCriterion("DW in", values, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotIn(List<String> values) {
            addCriterion("DW not in", values, "dw");
            return (Criteria) this;
        }

        public Criteria andDwBetween(String value1, String value2) {
            addCriterion("DW between", value1, value2, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotBetween(String value1, String value2) {
            addCriterion("DW not between", value1, value2, "dw");
            return (Criteria) this;
        }

        public Criteria andXmslIsNull() {
            addCriterion("XMSL is null");
            return (Criteria) this;
        }

        public Criteria andXmslIsNotNull() {
            addCriterion("XMSL is not null");
            return (Criteria) this;
        }

        public Criteria andXmslEqualTo(BigDecimal value) {
            addCriterion("XMSL =", value, "xmsl");
            return (Criteria) this;
        }

        public Criteria andXmslNotEqualTo(BigDecimal value) {
            addCriterion("XMSL <>", value, "xmsl");
            return (Criteria) this;
        }

        public Criteria andXmslGreaterThan(BigDecimal value) {
            addCriterion("XMSL >", value, "xmsl");
            return (Criteria) this;
        }

        public Criteria andXmslGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XMSL >=", value, "xmsl");
            return (Criteria) this;
        }

        public Criteria andXmslLessThan(BigDecimal value) {
            addCriterion("XMSL <", value, "xmsl");
            return (Criteria) this;
        }

        public Criteria andXmslLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XMSL <=", value, "xmsl");
            return (Criteria) this;
        }

        public Criteria andXmslIn(List<BigDecimal> values) {
            addCriterion("XMSL in", values, "xmsl");
            return (Criteria) this;
        }

        public Criteria andXmslNotIn(List<BigDecimal> values) {
            addCriterion("XMSL not in", values, "xmsl");
            return (Criteria) this;
        }

        public Criteria andXmslBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMSL between", value1, value2, "xmsl");
            return (Criteria) this;
        }

        public Criteria andXmslNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMSL not between", value1, value2, "xmsl");
            return (Criteria) this;
        }

        public Criteria andXmdjIsNull() {
            addCriterion("XMDJ is null");
            return (Criteria) this;
        }

        public Criteria andXmdjIsNotNull() {
            addCriterion("XMDJ is not null");
            return (Criteria) this;
        }

        public Criteria andXmdjEqualTo(BigDecimal value) {
            addCriterion("XMDJ =", value, "xmdj");
            return (Criteria) this;
        }

        public Criteria andXmdjNotEqualTo(BigDecimal value) {
            addCriterion("XMDJ <>", value, "xmdj");
            return (Criteria) this;
        }

        public Criteria andXmdjGreaterThan(BigDecimal value) {
            addCriterion("XMDJ >", value, "xmdj");
            return (Criteria) this;
        }

        public Criteria andXmdjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XMDJ >=", value, "xmdj");
            return (Criteria) this;
        }

        public Criteria andXmdjLessThan(BigDecimal value) {
            addCriterion("XMDJ <", value, "xmdj");
            return (Criteria) this;
        }

        public Criteria andXmdjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XMDJ <=", value, "xmdj");
            return (Criteria) this;
        }

        public Criteria andXmdjIn(List<BigDecimal> values) {
            addCriterion("XMDJ in", values, "xmdj");
            return (Criteria) this;
        }

        public Criteria andXmdjNotIn(List<BigDecimal> values) {
            addCriterion("XMDJ not in", values, "xmdj");
            return (Criteria) this;
        }

        public Criteria andXmdjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMDJ between", value1, value2, "xmdj");
            return (Criteria) this;
        }

        public Criteria andXmdjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMDJ not between", value1, value2, "xmdj");
            return (Criteria) this;
        }

        public Criteria andXmjeIsNull() {
            addCriterion("XMJE is null");
            return (Criteria) this;
        }

        public Criteria andXmjeIsNotNull() {
            addCriterion("XMJE is not null");
            return (Criteria) this;
        }

        public Criteria andXmjeEqualTo(BigDecimal value) {
            addCriterion("XMJE =", value, "xmje");
            return (Criteria) this;
        }

        public Criteria andXmjeNotEqualTo(BigDecimal value) {
            addCriterion("XMJE <>", value, "xmje");
            return (Criteria) this;
        }

        public Criteria andXmjeGreaterThan(BigDecimal value) {
            addCriterion("XMJE >", value, "xmje");
            return (Criteria) this;
        }

        public Criteria andXmjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XMJE >=", value, "xmje");
            return (Criteria) this;
        }

        public Criteria andXmjeLessThan(BigDecimal value) {
            addCriterion("XMJE <", value, "xmje");
            return (Criteria) this;
        }

        public Criteria andXmjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XMJE <=", value, "xmje");
            return (Criteria) this;
        }

        public Criteria andXmjeIn(List<BigDecimal> values) {
            addCriterion("XMJE in", values, "xmje");
            return (Criteria) this;
        }

        public Criteria andXmjeNotIn(List<BigDecimal> values) {
            addCriterion("XMJE not in", values, "xmje");
            return (Criteria) this;
        }

        public Criteria andXmjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMJE between", value1, value2, "xmje");
            return (Criteria) this;
        }

        public Criteria andXmjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMJE not between", value1, value2, "xmje");
            return (Criteria) this;
        }

        public Criteria andSlIsNull() {
            addCriterion("SL is null");
            return (Criteria) this;
        }

        public Criteria andSlIsNotNull() {
            addCriterion("SL is not null");
            return (Criteria) this;
        }

        public Criteria andSlEqualTo(BigDecimal value) {
            addCriterion("SL =", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotEqualTo(BigDecimal value) {
            addCriterion("SL <>", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThan(BigDecimal value) {
            addCriterion("SL >", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SL >=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThan(BigDecimal value) {
            addCriterion("SL <", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SL <=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlIn(List<BigDecimal> values) {
            addCriterion("SL in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotIn(List<BigDecimal> values) {
            addCriterion("SL not in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SL between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SL not between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSeIsNull() {
            addCriterion("SE is null");
            return (Criteria) this;
        }

        public Criteria andSeIsNotNull() {
            addCriterion("SE is not null");
            return (Criteria) this;
        }

        public Criteria andSeEqualTo(BigDecimal value) {
            addCriterion("SE =", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeNotEqualTo(BigDecimal value) {
            addCriterion("SE <>", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeGreaterThan(BigDecimal value) {
            addCriterion("SE >", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SE >=", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeLessThan(BigDecimal value) {
            addCriterion("SE <", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SE <=", value, "se");
            return (Criteria) this;
        }

        public Criteria andSeIn(List<BigDecimal> values) {
            addCriterion("SE in", values, "se");
            return (Criteria) this;
        }

        public Criteria andSeNotIn(List<BigDecimal> values) {
            addCriterion("SE not in", values, "se");
            return (Criteria) this;
        }

        public Criteria andSeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SE between", value1, value2, "se");
            return (Criteria) this;
        }

        public Criteria andSeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SE not between", value1, value2, "se");
            return (Criteria) this;
        }

        public Criteria andHsbzIsNull() {
            addCriterion("HSBZ is null");
            return (Criteria) this;
        }

        public Criteria andHsbzIsNotNull() {
            addCriterion("HSBZ is not null");
            return (Criteria) this;
        }

        public Criteria andHsbzEqualTo(BigDecimal value) {
            addCriterion("HSBZ =", value, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzNotEqualTo(BigDecimal value) {
            addCriterion("HSBZ <>", value, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzGreaterThan(BigDecimal value) {
            addCriterion("HSBZ >", value, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HSBZ >=", value, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzLessThan(BigDecimal value) {
            addCriterion("HSBZ <", value, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HSBZ <=", value, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzIn(List<BigDecimal> values) {
            addCriterion("HSBZ in", values, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzNotIn(List<BigDecimal> values) {
            addCriterion("HSBZ not in", values, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HSBZ between", value1, value2, "hsbz");
            return (Criteria) this;
        }

        public Criteria andHsbzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HSBZ not between", value1, value2, "hsbz");
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
     * @Table : mm_invoice_backdetail_ti
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
     * @Table : mm_invoice_backdetail_ti
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