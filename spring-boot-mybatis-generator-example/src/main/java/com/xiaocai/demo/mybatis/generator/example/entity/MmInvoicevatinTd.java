package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_invoicevatin_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvoicevatinTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 结算单号
     */
    private String summaryno;

    /**
     * 发票代码
     */
    private String invoicecode;

    /**
     * 发票号码
     */
    private String invoiceno;

    /**
     * 开票日期
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
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION版本号
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
     * 结算单接口主表id
     */
    private Long seqcentralization;

    /**
     * 差异金额
     */
    private BigDecimal diffamount;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 业务唯一流水号
     */
    private String custseq;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 机构
     */
    private String unitcode;

    /**
     * 进项税转出
     */
    private BigDecimal taxesamountout;

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
    * 获取-发票代码
    * @return invoicecode
     */
    public String getInvoicecode() {
        return invoicecode;
    }

    /**
    * 设置-发票代码
    * @paramType java.lang.String
    * @param invoicecode - 发票代码
     */
    public void setInvoicecode(String invoicecode) {
        this.invoicecode = invoicecode;
    }

    /**
    * 获取-发票号码
    * @return invoiceno
     */
    public String getInvoiceno() {
        return invoiceno;
    }

    /**
    * 设置-发票号码
    * @paramType java.lang.String
    * @param invoiceno - 发票号码
     */
    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    /**
    * 获取-开票日期
    * @return invoicedate
     */
    public Date getInvoicedate() {
        return invoicedate;
    }

    /**
    * 设置-开票日期
    * @paramType java.util.Date
    * @param invoicedate - 开票日期
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
    * 获取-HIBERNATEVERSION版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATEVERSION版本号
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
    * 获取-结算单接口主表id
    * @return seqcentralization
     */
    public Long getSeqcentralization() {
        return seqcentralization;
    }

    /**
    * 设置-结算单接口主表id
    * @paramType java.lang.Long
    * @param seqcentralization - 结算单接口主表id
     */
    public void setSeqcentralization(Long seqcentralization) {
        this.seqcentralization = seqcentralization;
    }

    /**
    * 获取-差异金额
    * @return diffamount
     */
    public BigDecimal getDiffamount() {
        return diffamount;
    }

    /**
    * 设置-差异金额
    * @paramType java.math.BigDecimal
    * @param diffamount - 差异金额
     */
    public void setDiffamount(BigDecimal diffamount) {
        this.diffamount = diffamount;
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
    * 获取-业务唯一流水号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务唯一流水号
    * @paramType java.lang.String
    * @param custseq - 业务唯一流水号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
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
    * 获取-赔案号
    * @return claimno
     */
    public String getClaimno() {
        return claimno;
    }

    /**
    * 设置-赔案号
    * @paramType java.lang.String
    * @param claimno - 赔案号
     */
    public void setClaimno(String claimno) {
        this.claimno = claimno;
    }

    /**
    * 获取-机构
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-机构
    * @paramType java.lang.String
    * @param unitcode - 机构
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    /**
    * 获取-进项税转出
    * @return taxesamountout
     */
    public BigDecimal getTaxesamountout() {
        return taxesamountout;
    }

    /**
    * 设置-进项税转出
    * @paramType java.math.BigDecimal
    * @param taxesamountout - 进项税转出
     */
    public void setTaxesamountout(BigDecimal taxesamountout) {
        this.taxesamountout = taxesamountout;
    }
}