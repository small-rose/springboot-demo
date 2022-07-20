package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_batch_invoicelist_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBatchInvoicelistTi {
    /**
     * 主键
     */
    private String id;

    /**
     * 请求收付系统的流水号
     */
    private String taskid;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后更新时间
     */
    private Date lastopdate;

    /**
     * 版本
     */
    private Short hibernateversion;

    /**
     * 状态  0:初始状态，1:落地成功，2:落地失败
     */
    private String status;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
    * 获取-主键
    * @return id
     */
    public String getId() {
        return id;
    }

    /**
    * 设置-主键
    * @paramType java.lang.String
    * @param id - 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
    * 获取-请求收付系统的流水号
    * @return taskid
     */
    public String getTaskid() {
        return taskid;
    }

    /**
    * 设置-请求收付系统的流水号
    * @paramType java.lang.String
    * @param taskid - 请求收付系统的流水号
     */
    public void setTaskid(String taskid) {
        this.taskid = taskid;
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
    * 获取-最后更新时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后更新时间
    * @paramType java.util.Date
    * @param lastopdate - 最后更新时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-版本
    * @return hibernateversion
     */
    public Short getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本
    * @paramType java.lang.Short
    * @param hibernateversion - 版本
     */
    public void setHibernateversion(Short hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-状态  0:初始状态，1:落地成功，2:落地失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态  0:初始状态，1:落地成功，2:落地失败
    * @paramType java.lang.String
    * @param status - 状态  0:初始状态，1:落地成功，2:落地失败
     */
    public void setStatus(String status) {
        this.status = status;
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
}