package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_invoicevatinlist_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvoicevatinlistTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 存储关联mm_invoicevatin_ti的id
     */
    private Long seqinvoicevatin;

    /**
     * 唯一流水号
     */
    private String custseq;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 险别代码
     */
    private String classescodedesc;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 税额
     */
    private BigDecimal taxesamount;

    /**
     * 税率
     */
    private BigDecimal taxesrate;

    /**
     * 税收属性 0应税 1 免税 2 零税
     */
    private String classesstype;

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
     * 状态
     */
    private String opstatus;

    /**
     * 进项税转出金额
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
    * 获取-存储关联mm_invoicevatin_ti的id
    * @return seqinvoicevatin
     */
    public Long getSeqinvoicevatin() {
        return seqinvoicevatin;
    }

    /**
    * 设置-存储关联mm_invoicevatin_ti的id
    * @paramType java.lang.Long
    * @param seqinvoicevatin - 存储关联mm_invoicevatin_ti的id
     */
    public void setSeqinvoicevatin(Long seqinvoicevatin) {
        this.seqinvoicevatin = seqinvoicevatin;
    }

    /**
    * 获取-唯一流水号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-唯一流水号
    * @paramType java.lang.String
    * @param custseq - 唯一流水号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
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
    * 获取-险别代码
    * @return classescodedesc
     */
    public String getClassescodedesc() {
        return classescodedesc;
    }

    /**
    * 设置-险别代码
    * @paramType java.lang.String
    * @param classescodedesc - 险别代码
     */
    public void setClassescodedesc(String classescodedesc) {
        this.classescodedesc = classescodedesc;
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
    * 获取-税额
    * @return taxesamount
     */
    public BigDecimal getTaxesamount() {
        return taxesamount;
    }

    /**
    * 设置-税额
    * @paramType java.math.BigDecimal
    * @param taxesamount - 税额
     */
    public void setTaxesamount(BigDecimal taxesamount) {
        this.taxesamount = taxesamount;
    }

    /**
    * 获取-税率
    * @return taxesrate
     */
    public BigDecimal getTaxesrate() {
        return taxesrate;
    }

    /**
    * 设置-税率
    * @paramType java.math.BigDecimal
    * @param taxesrate - 税率
     */
    public void setTaxesrate(BigDecimal taxesrate) {
        this.taxesrate = taxesrate;
    }

    /**
    * 获取-税收属性 0应税 1 免税 2 零税
    * @return classesstype
     */
    public String getClassesstype() {
        return classesstype;
    }

    /**
    * 设置-税收属性 0应税 1 免税 2 零税
    * @paramType java.lang.String
    * @param classesstype - 税收属性 0应税 1 免税 2 零税
     */
    public void setClassesstype(String classesstype) {
        this.classesstype = classesstype;
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
    * 获取-状态
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-状态
    * @paramType java.lang.String
    * @param opstatus - 状态
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-进项税转出金额
    * @return taxesamountout
     */
    public BigDecimal getTaxesamountout() {
        return taxesamountout;
    }

    /**
    * 设置-进项税转出金额
    * @paramType java.math.BigDecimal
    * @param taxesamountout - 进项税转出金额
     */
    public void setTaxesamountout(BigDecimal taxesamountout) {
        this.taxesamountout = taxesamountout;
    }
}