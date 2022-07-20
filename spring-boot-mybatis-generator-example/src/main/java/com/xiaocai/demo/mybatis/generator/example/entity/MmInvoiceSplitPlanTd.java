package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_invoice_split_plan_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvoiceSplitPlanTd {
    /**
     * 拆分流水单号
     */
    private Long seqinvoice;

    /**
     * 原发票流水单号
     */
    private Long fatherno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 币种
     */
    private String currencycode;

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
     * 发票类型
     */
    private String kplx;

    /**
     * 纳税人姓名
     */
    private String taxpayername;

    /**
     * 纳税人识别号
     */
    private String taxpayer;

    /**
     * 描述
     */
    private String description;

    /**
     * 规格型号
     */
    private String ggxh;

    /**
     * 计量单位
     */
    private String jldw;

    /**
     * 商品数量
     */
    private String spsl;

    /**
     * 版本号
     */
    private Long hibernateversion;

    /**
     * 手动修改记录
     */
    private String modifydesc;

    /**
     * 创建时间
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
    * 获取-拆分流水单号
    * @return seqinvoice
     */
    public Long getSeqinvoice() {
        return seqinvoice;
    }

    /**
    * 设置-拆分流水单号
    * @paramType java.lang.Long
    * @param seqinvoice - 拆分流水单号
     */
    public void setSeqinvoice(Long seqinvoice) {
        this.seqinvoice = seqinvoice;
    }

    /**
    * 获取-原发票流水单号
    * @return fatherno
     */
    public Long getFatherno() {
        return fatherno;
    }

    /**
    * 设置-原发票流水单号
    * @paramType java.lang.Long
    * @param fatherno - 原发票流水单号
     */
    public void setFatherno(Long fatherno) {
        this.fatherno = fatherno;
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
    * 获取-币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种
    * @paramType java.lang.String
    * @param currencycode - 币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
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
    * 获取-发票类型
    * @return kplx
     */
    public String getKplx() {
        return kplx;
    }

    /**
    * 设置-发票类型
    * @paramType java.lang.String
    * @param kplx - 发票类型
     */
    public void setKplx(String kplx) {
        this.kplx = kplx;
    }

    /**
    * 获取-纳税人姓名
    * @return taxpayername
     */
    public String getTaxpayername() {
        return taxpayername;
    }

    /**
    * 设置-纳税人姓名
    * @paramType java.lang.String
    * @param taxpayername - 纳税人姓名
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
    * 获取-规格型号
    * @return ggxh
     */
    public String getGgxh() {
        return ggxh;
    }

    /**
    * 设置-规格型号
    * @paramType java.lang.String
    * @param ggxh - 规格型号
     */
    public void setGgxh(String ggxh) {
        this.ggxh = ggxh;
    }

    /**
    * 获取-计量单位
    * @return jldw
     */
    public String getJldw() {
        return jldw;
    }

    /**
    * 设置-计量单位
    * @paramType java.lang.String
    * @param jldw - 计量单位
     */
    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    /**
    * 获取-商品数量
    * @return spsl
     */
    public String getSpsl() {
        return spsl;
    }

    /**
    * 设置-商品数量
    * @paramType java.lang.String
    * @param spsl - 商品数量
     */
    public void setSpsl(String spsl) {
        this.spsl = spsl;
    }

    /**
    * 获取-版本号
    * @return hibernateversion
     */
    public Long getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Long
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Long hibernateversion) {
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
    * 获取-创建时间
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-创建时间
    * @paramType java.util.Date
    * @param timestamp - 创建时间
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
}