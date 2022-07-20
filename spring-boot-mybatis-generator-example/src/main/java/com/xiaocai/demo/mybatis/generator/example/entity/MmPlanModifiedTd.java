package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_plan_modified_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPlanModifiedTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 使用mm_pay_plan_ti.serialno
     */
    private BigDecimal thisseq;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * mm_policylist_ti表主键
     */
    private String seqcharge;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 计划缴费日期
     */
    private Date datedate;

    /**
     * 状态 0 未核销 1 部分核销 2 已核销
     */
    private String opstatus;

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
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * mm_policy_ti表主键
     */
    private Long seqpayplan;

    /**
     * 业务系统主键custseq
     */
    private String custseq;

    /**
     * 批次号
     */
    private String batchid;

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
    * 获取-使用mm_pay_plan_ti.serialno
    * @return thisseq
     */
    public BigDecimal getThisseq() {
        return thisseq;
    }

    /**
    * 设置-使用mm_pay_plan_ti.serialno
    * @paramType java.math.BigDecimal
    * @param thisseq - 使用mm_pay_plan_ti.serialno
     */
    public void setThisseq(BigDecimal thisseq) {
        this.thisseq = thisseq;
    }

    /**
    * 获取-分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司
    * @paramType java.lang.String
    * @param subcompany - 分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-mm_policylist_ti表主键
    * @return seqcharge
     */
    public String getSeqcharge() {
        return seqcharge;
    }

    /**
    * 设置-mm_policylist_ti表主键
    * @paramType java.lang.String
    * @param seqcharge - mm_policylist_ti表主键
     */
    public void setSeqcharge(String seqcharge) {
        this.seqcharge = seqcharge;
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
    * @return datedate
     */
    public Date getDatedate() {
        return datedate;
    }

    /**
    * 设置-计划缴费日期
    * @paramType java.util.Date
    * @param datedate - 计划缴费日期
     */
    public void setDatedate(Date datedate) {
        this.datedate = datedate;
    }

    /**
    * 获取-状态 0 未核销 1 部分核销 2 已核销
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-状态 0 未核销 1 部分核销 2 已核销
    * @paramType java.lang.String
    * @param opstatus - 状态 0 未核销 1 部分核销 2 已核销
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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
    * 获取-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
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
}