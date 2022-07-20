package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_invoiceinform_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvoiceinformTd {
    /**
     * 主键
     */
    private String informid;

    /**
     * 关联mm_policy_td或者mm_reinsurance_td的主键
     */
    private Long seqid;

    /**
     * 纳税人代码
     */
    private String taxpayercode;

    /**
     * 纳税人名称
     */
    private String taxpayername;

    /**
     * 纳税人识别号
     */
    private String taxpayer;

    /**
     * 纳税人地址
     */
    private String taxesaddress;

    /**
     * 纳税人电话
     */
    private String taxesphone;

    /**
     * 纳税人手机号
     */
    private String taxesmobilephone;

    /**
     * 纳税人邮箱
     */
    private String taxesemail;

    /**
     * 纳税人开户银行
     */
    private String taxesbankname;

    /**
     * 纳税人开户银行账号
     */
    private String taxesaccountno;

    /**
     * 纳税人身份
     */
    private String taxespayertype;

    /**
     * 纳税人证件类型
     */
    private String taxescertificatetype;

    /**
     * 纳税人证件号码
     */
    private String taxescertificateno;

    /**
     * 开具发票类型
     */
    private String invoicetype;

    /**
     * 发票备注信息
     */
    private String invoiceremark;

    /**
     * 0开全额发票，1开我方份额发票 联共保需要主供或主联方开具全额发票时传0
     */
    private String invoiceissueway;

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
    * 获取-主键
    * @return informid
     */
    public String getInformid() {
        return informid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.String
    * @param informid - 主键
     */
    public void setInformid(String informid) {
        this.informid = informid;
    }

    /**
    * 获取-关联mm_policy_td或者mm_reinsurance_td的主键
    * @return seqid
     */
    public Long getSeqid() {
        return seqid;
    }

    /**
    * 设置-关联mm_policy_td或者mm_reinsurance_td的主键
    * @paramType java.lang.Long
    * @param seqid - 关联mm_policy_td或者mm_reinsurance_td的主键
     */
    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    /**
    * 获取-纳税人代码
    * @return taxpayercode
     */
    public String getTaxpayercode() {
        return taxpayercode;
    }

    /**
    * 设置-纳税人代码
    * @paramType java.lang.String
    * @param taxpayercode - 纳税人代码
     */
    public void setTaxpayercode(String taxpayercode) {
        this.taxpayercode = taxpayercode;
    }

    /**
    * 获取-纳税人名称
    * @return taxpayername
     */
    public String getTaxpayername() {
        return taxpayername;
    }

    /**
    * 设置-纳税人名称
    * @paramType java.lang.String
    * @param taxpayername - 纳税人名称
     */
    public void setTaxpayername(String taxpayername) {
        this.taxpayername = taxpayername;
    }

    /**
    * 获取-纳税人识别号
    * @return taxpayer
     */
    public String getTaxpayer() {
        return taxpayer;
    }

    /**
    * 设置-纳税人识别号
    * @paramType java.lang.String
    * @param taxpayer - 纳税人识别号
     */
    public void setTaxpayer(String taxpayer) {
        this.taxpayer = taxpayer;
    }

    /**
    * 获取-纳税人地址
    * @return taxesaddress
     */
    public String getTaxesaddress() {
        return taxesaddress;
    }

    /**
    * 设置-纳税人地址
    * @paramType java.lang.String
    * @param taxesaddress - 纳税人地址
     */
    public void setTaxesaddress(String taxesaddress) {
        this.taxesaddress = taxesaddress;
    }

    /**
    * 获取-纳税人电话
    * @return taxesphone
     */
    public String getTaxesphone() {
        return taxesphone;
    }

    /**
    * 设置-纳税人电话
    * @paramType java.lang.String
    * @param taxesphone - 纳税人电话
     */
    public void setTaxesphone(String taxesphone) {
        this.taxesphone = taxesphone;
    }

    /**
    * 获取-纳税人手机号
    * @return taxesmobilephone
     */
    public String getTaxesmobilephone() {
        return taxesmobilephone;
    }

    /**
    * 设置-纳税人手机号
    * @paramType java.lang.String
    * @param taxesmobilephone - 纳税人手机号
     */
    public void setTaxesmobilephone(String taxesmobilephone) {
        this.taxesmobilephone = taxesmobilephone;
    }

    /**
    * 获取-纳税人邮箱
    * @return taxesemail
     */
    public String getTaxesemail() {
        return taxesemail;
    }

    /**
    * 设置-纳税人邮箱
    * @paramType java.lang.String
    * @param taxesemail - 纳税人邮箱
     */
    public void setTaxesemail(String taxesemail) {
        this.taxesemail = taxesemail;
    }

    /**
    * 获取-纳税人开户银行
    * @return taxesbankname
     */
    public String getTaxesbankname() {
        return taxesbankname;
    }

    /**
    * 设置-纳税人开户银行
    * @paramType java.lang.String
    * @param taxesbankname - 纳税人开户银行
     */
    public void setTaxesbankname(String taxesbankname) {
        this.taxesbankname = taxesbankname;
    }

    /**
    * 获取-纳税人开户银行账号
    * @return taxesaccountno
     */
    public String getTaxesaccountno() {
        return taxesaccountno;
    }

    /**
    * 设置-纳税人开户银行账号
    * @paramType java.lang.String
    * @param taxesaccountno - 纳税人开户银行账号
     */
    public void setTaxesaccountno(String taxesaccountno) {
        this.taxesaccountno = taxesaccountno;
    }

    /**
    * 获取-纳税人身份
    * @return taxespayertype
     */
    public String getTaxespayertype() {
        return taxespayertype;
    }

    /**
    * 设置-纳税人身份
    * @paramType java.lang.String
    * @param taxespayertype - 纳税人身份
     */
    public void setTaxespayertype(String taxespayertype) {
        this.taxespayertype = taxespayertype;
    }

    /**
    * 获取-纳税人证件类型
    * @return taxescertificatetype
     */
    public String getTaxescertificatetype() {
        return taxescertificatetype;
    }

    /**
    * 设置-纳税人证件类型
    * @paramType java.lang.String
    * @param taxescertificatetype - 纳税人证件类型
     */
    public void setTaxescertificatetype(String taxescertificatetype) {
        this.taxescertificatetype = taxescertificatetype;
    }

    /**
    * 获取-纳税人证件号码
    * @return taxescertificateno
     */
    public String getTaxescertificateno() {
        return taxescertificateno;
    }

    /**
    * 设置-纳税人证件号码
    * @paramType java.lang.String
    * @param taxescertificateno - 纳税人证件号码
     */
    public void setTaxescertificateno(String taxescertificateno) {
        this.taxescertificateno = taxescertificateno;
    }

    /**
    * 获取-开具发票类型
    * @return invoicetype
     */
    public String getInvoicetype() {
        return invoicetype;
    }

    /**
    * 设置-开具发票类型
    * @paramType java.lang.String
    * @param invoicetype - 开具发票类型
     */
    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    /**
    * 获取-发票备注信息
    * @return invoiceremark
     */
    public String getInvoiceremark() {
        return invoiceremark;
    }

    /**
    * 设置-发票备注信息
    * @paramType java.lang.String
    * @param invoiceremark - 发票备注信息
     */
    public void setInvoiceremark(String invoiceremark) {
        this.invoiceremark = invoiceremark;
    }

    /**
    * 获取-0开全额发票，1开我方份额发票 联共保需要主供或主联方开具全额发票时传0
    * @return invoiceissueway
     */
    public String getInvoiceissueway() {
        return invoiceissueway;
    }

    /**
    * 设置-0开全额发票，1开我方份额发票 联共保需要主供或主联方开具全额发票时传0
    * @paramType java.lang.String
    * @param invoiceissueway - 0开全额发票，1开我方份额发票 联共保需要主供或主联方开具全额发票时传0
     */
    public void setInvoiceissueway(String invoiceissueway) {
        this.invoiceissueway = invoiceissueway;
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
}