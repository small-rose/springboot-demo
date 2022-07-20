package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_invoice_clause_split_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvoiceClauseSplitTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 发票表主键
     */
    private Long seqinvoice;

    /**
     * 保单发票对照表主键
     */
    private Long seqinvply;

    /**
     * 保单表主键
     */
    private Long seqpolicy;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 险种名称
     */
    private String classescodename;

    /**
     * 条款代码
     */
    private String clausecode;

    /**
     * 条款名称
     */
    private String clausename;

    /**
     * 原币币种
     */
    private String basecurrencycode;

    /**
     * 原币含税金额
     */
    private BigDecimal baseamount;

    /**
     * 折币币种
     */
    private String currencycode;

    /**
     * 折币含税金额
     */
    private BigDecimal amount;

    /**
     * 税率
     */
    private BigDecimal taxesrate;

    /**
     * 汇率
     */
    private BigDecimal exchangerate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * hibernate版本号
     */
    private Integer hibernateversion;

    /**
     * 手动修改记录
     */
    private String modifydesc;

    /**
     * 商品代码
     */
    private String productcode;

    /**
     * 对应保单明细表主键
     */
    private BigDecimal seqpolicydetail;

    /**
     * 商品名称
     */
    private String productname;

    /**
     * 险别属性
     */
    private String classesstype;

    /**
     * 税金金额，保留2位数
     */
    private BigDecimal taxamount1;

    /**
     * 原币税金金额，保留2位数
     */
    private BigDecimal taxbaseamount1;

    /**
     * 税金金额，保留6位数
     */
    private BigDecimal taxamount;

    /**
     * 税金金额，保留6位数
     */
    private BigDecimal taxbaseamount;

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
    * 获取-发票表主键
    * @return seqinvoice
     */
    public Long getSeqinvoice() {
        return seqinvoice;
    }

    /**
    * 设置-发票表主键
    * @paramType java.lang.Long
    * @param seqinvoice - 发票表主键
     */
    public void setSeqinvoice(Long seqinvoice) {
        this.seqinvoice = seqinvoice;
    }

    /**
    * 获取-保单发票对照表主键
    * @return seqinvply
     */
    public Long getSeqinvply() {
        return seqinvply;
    }

    /**
    * 设置-保单发票对照表主键
    * @paramType java.lang.Long
    * @param seqinvply - 保单发票对照表主键
     */
    public void setSeqinvply(Long seqinvply) {
        this.seqinvply = seqinvply;
    }

    /**
    * 获取-保单表主键
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-保单表主键
    * @paramType java.lang.Long
    * @param seqpolicy - 保单表主键
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
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
    * 获取-险种代码
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种代码
    * @paramType java.lang.String
    * @param classescode - 险种代码
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-险种名称
    * @return classescodename
     */
    public String getClassescodename() {
        return classescodename;
    }

    /**
    * 设置-险种名称
    * @paramType java.lang.String
    * @param classescodename - 险种名称
     */
    public void setClassescodename(String classescodename) {
        this.classescodename = classescodename;
    }

    /**
    * 获取-条款代码
    * @return clausecode
     */
    public String getClausecode() {
        return clausecode;
    }

    /**
    * 设置-条款代码
    * @paramType java.lang.String
    * @param clausecode - 条款代码
     */
    public void setClausecode(String clausecode) {
        this.clausecode = clausecode;
    }

    /**
    * 获取-条款名称
    * @return clausename
     */
    public String getClausename() {
        return clausename;
    }

    /**
    * 设置-条款名称
    * @paramType java.lang.String
    * @param clausename - 条款名称
     */
    public void setClausename(String clausename) {
        this.clausename = clausename;
    }

    /**
    * 获取-原币币种
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-原币币种
    * @paramType java.lang.String
    * @param basecurrencycode - 原币币种
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
    }

    /**
    * 获取-原币含税金额
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-原币含税金额
    * @paramType java.math.BigDecimal
    * @param baseamount - 原币含税金额
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    /**
    * 获取-折币币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-折币币种
    * @paramType java.lang.String
    * @param currencycode - 折币币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-折币含税金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-折币含税金额
    * @paramType java.math.BigDecimal
    * @param amount - 折币含税金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    * 获取-汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
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
    * 获取-手动修改记录
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手动修改记录
    * @paramType java.lang.String
    * @param modifydesc - 手动修改记录
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-商品代码
    * @return productcode
     */
    public String getProductcode() {
        return productcode;
    }

    /**
    * 设置-商品代码
    * @paramType java.lang.String
    * @param productcode - 商品代码
     */
    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    /**
    * 获取-对应保单明细表主键
    * @return seqpolicydetail
     */
    public BigDecimal getSeqpolicydetail() {
        return seqpolicydetail;
    }

    /**
    * 设置-对应保单明细表主键
    * @paramType java.math.BigDecimal
    * @param seqpolicydetail - 对应保单明细表主键
     */
    public void setSeqpolicydetail(BigDecimal seqpolicydetail) {
        this.seqpolicydetail = seqpolicydetail;
    }

    /**
    * 获取-商品名称
    * @return productname
     */
    public String getProductname() {
        return productname;
    }

    /**
    * 设置-商品名称
    * @paramType java.lang.String
    * @param productname - 商品名称
     */
    public void setProductname(String productname) {
        this.productname = productname;
    }

    /**
    * 获取-险别属性
    * @return classesstype
     */
    public String getClassesstype() {
        return classesstype;
    }

    /**
    * 设置-险别属性
    * @paramType java.lang.String
    * @param classesstype - 险别属性
     */
    public void setClassesstype(String classesstype) {
        this.classesstype = classesstype;
    }

    /**
    * 获取-税金金额，保留2位数
    * @return taxamount1
     */
    public BigDecimal getTaxamount1() {
        return taxamount1;
    }

    /**
    * 设置-税金金额，保留2位数
    * @paramType java.math.BigDecimal
    * @param taxamount1 - 税金金额，保留2位数
     */
    public void setTaxamount1(BigDecimal taxamount1) {
        this.taxamount1 = taxamount1;
    }

    /**
    * 获取-原币税金金额，保留2位数
    * @return taxbaseamount1
     */
    public BigDecimal getTaxbaseamount1() {
        return taxbaseamount1;
    }

    /**
    * 设置-原币税金金额，保留2位数
    * @paramType java.math.BigDecimal
    * @param taxbaseamount1 - 原币税金金额，保留2位数
     */
    public void setTaxbaseamount1(BigDecimal taxbaseamount1) {
        this.taxbaseamount1 = taxbaseamount1;
    }

    /**
    * 获取-税金金额，保留6位数
    * @return taxamount
     */
    public BigDecimal getTaxamount() {
        return taxamount;
    }

    /**
    * 设置-税金金额，保留6位数
    * @paramType java.math.BigDecimal
    * @param taxamount - 税金金额，保留6位数
     */
    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    /**
    * 获取-税金金额，保留6位数
    * @return taxbaseamount
     */
    public BigDecimal getTaxbaseamount() {
        return taxbaseamount;
    }

    /**
    * 设置-税金金额，保留6位数
    * @paramType java.math.BigDecimal
    * @param taxbaseamount - 税金金额，保留6位数
     */
    public void setTaxbaseamount(BigDecimal taxbaseamount) {
        this.taxbaseamount = taxbaseamount;
    }
}