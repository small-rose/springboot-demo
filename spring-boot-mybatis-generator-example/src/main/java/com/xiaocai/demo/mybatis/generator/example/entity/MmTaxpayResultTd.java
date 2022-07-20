package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_taxpay_result_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxpayResultTd {
    /**
     * 主键ID
     */
    private Long resultno;

    /**
     * mm_taxpay_td主键ID
     */
    private Long payid;

    /**
     * 确认时间起期
     */
    private Date startDate;

    /**
     * 确认时间止期
     */
    private Date endDate;

    /**
     * 对账结果:0：账不平；1：账平
     */
    private String checkresult;

    /**
     * 平台总金额
     */
    private BigDecimal totalTaxamount;

    /**
     * 平台总笔数
     */
    private BigDecimal totalNo;

    /**
     * 收付系统总金额
     */
    private BigDecimal paymentTotalTaxamount;

    /**
     * 收付系统总笔数
     */
    private BigDecimal paymentTotalNo;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 时间戳
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 手工标识
     */
    private String modifydesc;

    /**
    * 获取-主键ID
    * @return resultno
     */
    public Long getResultno() {
        return resultno;
    }

    /**
    * 设置-主键ID
    * @paramType java.lang.Long
    * @param resultno - 主键ID
     */
    public void setResultno(Long resultno) {
        this.resultno = resultno;
    }

    /**
    * 获取-mm_taxpay_td主键ID
    * @return payid
     */
    public Long getPayid() {
        return payid;
    }

    /**
    * 设置-mm_taxpay_td主键ID
    * @paramType java.lang.Long
    * @param payid - mm_taxpay_td主键ID
     */
    public void setPayid(Long payid) {
        this.payid = payid;
    }

    /**
    * 获取-确认时间起期
    * @return startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
    * 设置-确认时间起期
    * @paramType java.util.Date
    * @param startDate - 确认时间起期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
    * 获取-确认时间止期
    * @return endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
    * 设置-确认时间止期
    * @paramType java.util.Date
    * @param endDate - 确认时间止期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
    * 获取-对账结果:0：账不平；1：账平
    * @return checkresult
     */
    public String getCheckresult() {
        return checkresult;
    }

    /**
    * 设置-对账结果:0：账不平；1：账平
    * @paramType java.lang.String
    * @param checkresult - 对账结果:0：账不平；1：账平
     */
    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult;
    }

    /**
    * 获取-平台总金额
    * @return totalTaxamount
     */
    public BigDecimal getTotalTaxamount() {
        return totalTaxamount;
    }

    /**
    * 设置-平台总金额
    * @paramType java.math.BigDecimal
    * @param totalTaxamount - 平台总金额
     */
    public void setTotalTaxamount(BigDecimal totalTaxamount) {
        this.totalTaxamount = totalTaxamount;
    }

    /**
    * 获取-平台总笔数
    * @return totalNo
     */
    public BigDecimal getTotalNo() {
        return totalNo;
    }

    /**
    * 设置-平台总笔数
    * @paramType java.math.BigDecimal
    * @param totalNo - 平台总笔数
     */
    public void setTotalNo(BigDecimal totalNo) {
        this.totalNo = totalNo;
    }

    /**
    * 获取-收付系统总金额
    * @return paymentTotalTaxamount
     */
    public BigDecimal getPaymentTotalTaxamount() {
        return paymentTotalTaxamount;
    }

    /**
    * 设置-收付系统总金额
    * @paramType java.math.BigDecimal
    * @param paymentTotalTaxamount - 收付系统总金额
     */
    public void setPaymentTotalTaxamount(BigDecimal paymentTotalTaxamount) {
        this.paymentTotalTaxamount = paymentTotalTaxamount;
    }

    /**
    * 获取-收付系统总笔数
    * @return paymentTotalNo
     */
    public BigDecimal getPaymentTotalNo() {
        return paymentTotalNo;
    }

    /**
    * 设置-收付系统总笔数
    * @paramType java.math.BigDecimal
    * @param paymentTotalNo - 收付系统总笔数
     */
    public void setPaymentTotalNo(BigDecimal paymentTotalNo) {
        this.paymentTotalNo = paymentTotalNo;
    }

    /**
    * 获取-分公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司代码
    * @paramType java.lang.String
    * @param subcompany - 分公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
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
    * 获取-时间戳
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-时间戳
    * @paramType java.util.Date
    * @param lastopdate - 时间戳
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-手工标识
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工标识
    * @paramType java.lang.String
    * @param modifydesc - 手工标识
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }
}