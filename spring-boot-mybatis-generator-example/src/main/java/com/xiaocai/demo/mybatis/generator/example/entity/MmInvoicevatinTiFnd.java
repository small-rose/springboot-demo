package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_invoicevatin_ti_fnd
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvoicevatinTiFnd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 结算单号
     */
    private String summaryno;

    /**
     * 发票号
     */
    private String invoicecode;

    /**
     * 发票代码
     */
    private String invoiceno;

    /**
     * 开票时间
     */
    private Date invoicedate;

    /**
     * 税额合计
     */
    private BigDecimal sumtaxesamount;

    /**
     * 价合计
     */
    private BigDecimal sumpriceamount;

    /**
     * 价税合计
     */
    private BigDecimal sumamount;

    /**
     * 状态
     */
    private String status;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 描述
     */
    private String description;

    /**
     * 错误信息
     */
    private String errmsg;

    /**
     * 数据源
     */
    private String datasource;

    /**
     * 关联结算单明细主键
     */
    private String seqcentralization;

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
    * 获取-结算单号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-结算单号
    * @paramType java.lang.String
    * @param summaryno - 结算单号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    /**
    * 获取-发票号
    * @return invoicecode
     */
    public String getInvoicecode() {
        return invoicecode;
    }

    /**
    * 设置-发票号
    * @paramType java.lang.String
    * @param invoicecode - 发票号
     */
    public void setInvoicecode(String invoicecode) {
        this.invoicecode = invoicecode;
    }

    /**
    * 获取-发票代码
    * @return invoiceno
     */
    public String getInvoiceno() {
        return invoiceno;
    }

    /**
    * 设置-发票代码
    * @paramType java.lang.String
    * @param invoiceno - 发票代码
     */
    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    /**
    * 获取-开票时间
    * @return invoicedate
     */
    public Date getInvoicedate() {
        return invoicedate;
    }

    /**
    * 设置-开票时间
    * @paramType java.util.Date
    * @param invoicedate - 开票时间
     */
    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
    }

    /**
    * 获取-税额合计
    * @return sumtaxesamount
     */
    public BigDecimal getSumtaxesamount() {
        return sumtaxesamount;
    }

    /**
    * 设置-税额合计
    * @paramType java.math.BigDecimal
    * @param sumtaxesamount - 税额合计
     */
    public void setSumtaxesamount(BigDecimal sumtaxesamount) {
        this.sumtaxesamount = sumtaxesamount;
    }

    /**
    * 获取-价合计
    * @return sumpriceamount
     */
    public BigDecimal getSumpriceamount() {
        return sumpriceamount;
    }

    /**
    * 设置-价合计
    * @paramType java.math.BigDecimal
    * @param sumpriceamount - 价合计
     */
    public void setSumpriceamount(BigDecimal sumpriceamount) {
        this.sumpriceamount = sumpriceamount;
    }

    /**
    * 获取-价税合计
    * @return sumamount
     */
    public BigDecimal getSumamount() {
        return sumamount;
    }

    /**
    * 设置-价税合计
    * @paramType java.math.BigDecimal
    * @param sumamount - 价税合计
     */
    public void setSumamount(BigDecimal sumamount) {
        this.sumamount = sumamount;
    }

    /**
    * 获取-状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态
    * @paramType java.lang.String
    * @param status - 状态
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-最后操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间
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
    * 获取-描述
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param description - 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-错误信息
    * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
    * 设置-错误信息
    * @paramType java.lang.String
    * @param errmsg - 错误信息
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    /**
    * 获取-数据源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据源
    * @paramType java.lang.String
    * @param datasource - 数据源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-关联结算单明细主键
    * @return seqcentralization
     */
    public String getSeqcentralization() {
        return seqcentralization;
    }

    /**
    * 设置-关联结算单明细主键
    * @paramType java.lang.String
    * @param seqcentralization - 关联结算单明细主键
     */
    public void setSeqcentralization(String seqcentralization) {
        this.seqcentralization = seqcentralization;
    }
}