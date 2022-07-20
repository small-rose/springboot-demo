package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_pay_plan_modify_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPayPlanModifyTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * mm_policy_ti表主键
     */
    private Long seqpayplan;

    /**
     * mm_policylist_ti表主键
     */
    private Long seqcharge;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 缴费序号
     */
    private Long serialno;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 计划缴费日期
     */
    private Date plandate;

    /**
     * 币种代码
     */
    private String currencycode;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * hibernate版本号
     */
    private Integer hibernateversion;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 数来源
     */
    private String source;

    /**
     * 状态，1 初始状态 2落地成功 3落地失败
     */
    private String status;

    /**
     * 业务系统主键custseq
     */
    private String custseq;

    /**
    * 获取-主键
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param id - 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-mm_policy_ti表主键
    * @return seqpayplan
     */
    public Long getSeqpayplan() {
        return seqpayplan;
    }

    /**
    * 设置-mm_policy_ti表主键
    * @paramType java.lang.Long
    * @param seqpayplan - mm_policy_ti表主键
     */
    public void setSeqpayplan(Long seqpayplan) {
        this.seqpayplan = seqpayplan;
    }

    /**
    * 获取-mm_policylist_ti表主键
    * @return seqcharge
     */
    public Long getSeqcharge() {
        return seqcharge;
    }

    /**
    * 设置-mm_policylist_ti表主键
    * @paramType java.lang.Long
    * @param seqcharge - mm_policylist_ti表主键
     */
    public void setSeqcharge(Long seqcharge) {
        this.seqcharge = seqcharge;
    }

    /**
    * 获取-保单号
    * @return policyno
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
    * 设置-保单号
    * @paramType java.lang.String
    * @param policyno - 保单号
     */
    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    /**
    * 获取-批单号
    * @return endorseno
     */
    public String getEndorseno() {
        return endorseno;
    }

    /**
    * 设置-批单号
    * @paramType java.lang.String
    * @param endorseno - 批单号
     */
    public void setEndorseno(String endorseno) {
        this.endorseno = endorseno;
    }

    /**
    * 获取-缴费序号
    * @return serialno
     */
    public Long getSerialno() {
        return serialno;
    }

    /**
    * 设置-缴费序号
    * @paramType java.lang.Long
    * @param serialno - 缴费序号
     */
    public void setSerialno(Long serialno) {
        this.serialno = serialno;
    }

    /**
    * 获取-业务险种
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-业务险种
    * @paramType java.lang.String
    * @param classescode - 业务险种
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额
    * @paramType java.math.BigDecimal
    * @param amount - 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-计划缴费日期
    * @return plandate
     */
    public Date getPlandate() {
        return plandate;
    }

    /**
    * 设置-计划缴费日期
    * @paramType java.util.Date
    * @param plandate - 计划缴费日期
     */
    public void setPlandate(Date plandate) {
        this.plandate = plandate;
    }

    /**
    * 获取-币种代码
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种代码
    * @paramType java.lang.String
    * @param currencycode - 币种代码
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-时间戳
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param timestamp - 时间戳
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-最后修改时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后修改时间
    * @paramType java.util.Date
    * @param lastopdate - 最后修改时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-hibernate版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-hibernate版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - hibernate版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-批次号
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchid - 批次号
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-数来源
    * @return source
     */
    public String getSource() {
        return source;
    }

    /**
    * 设置-数来源
    * @paramType java.lang.String
    * @param source - 数来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
    * 获取-状态，1 初始状态 2落地成功 3落地失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态，1 初始状态 2落地成功 3落地失败
    * @paramType java.lang.String
    * @param status - 状态，1 初始状态 2落地成功 3落地失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-业务系统主键custseq
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务系统主键custseq
    * @paramType java.lang.String
    * @param custseq - 业务系统主键custseq
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }
}