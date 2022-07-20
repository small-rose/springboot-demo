package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_batch_invoicelist_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBatchInvoicelistTd {
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
    private Integer hibernateversion;

    /**
     * 状态  0:初始状态(未校验)，1:校验成功，2:校验失败(已开票)，3:校验失败(批改)，4:校验失败(机构不一致)
     */
    private String checkstatus;

    /**
     * 校验信息
     */
    private String checkmsg;

    /**
     * 开票金额
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
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-状态  0:初始状态(未校验)，1:校验成功，2:校验失败(已开票)，3:校验失败(批改)，4:校验失败(机构不一致)
    * @return checkstatus
     */
    public String getCheckstatus() {
        return checkstatus;
    }

    /**
    * 设置-状态  0:初始状态(未校验)，1:校验成功，2:校验失败(已开票)，3:校验失败(批改)，4:校验失败(机构不一致)
    * @paramType java.lang.String
    * @param checkstatus - 状态  0:初始状态(未校验)，1:校验成功，2:校验失败(已开票)，3:校验失败(批改)，4:校验失败(机构不一致)
     */
    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus;
    }

    /**
    * 获取-校验信息
    * @return checkmsg
     */
    public String getCheckmsg() {
        return checkmsg;
    }

    /**
    * 设置-校验信息
    * @paramType java.lang.String
    * @param checkmsg - 校验信息
     */
    public void setCheckmsg(String checkmsg) {
        this.checkmsg = checkmsg;
    }

    /**
    * 获取-开票金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-开票金额
    * @paramType java.math.BigDecimal
    * @param amount - 开票金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}