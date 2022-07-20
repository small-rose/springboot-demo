package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_chargedetail_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmChargedetailTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 被拆分接口表记录mm_policylist_ti的id
     */
    private Long seqchargedetail;

    /**
     * 关联字段，等于mm_policy_ti.id
     */
    private Long seqcharge;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 原币币种
     */
    private String basecurrencycode;

    /**
     * 原币金额
     */
    private BigDecimal baseamount;

    /**
     * 原币进项税额
     */
    private BigDecimal basetaxesamount;

    /**
     * 操作状态
     */
    private String opstatus;

    /**
     * 来源
     */
    private String source;

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
    private Short hibernateversion;

    /**
     * 落地进入td表后的id
     */
    private BigDecimal landid;

    /**
     * 税金金额(包含在总金额amount中)，对于营改增的必传
     */
    private BigDecimal taxesamount;

    /**
     * 税率，对于正数的金额，营改增必传，批减或者退保时可空
     */
    private BigDecimal taxesrate;

    /**
     * 险别属性 0应税 1 免税 2 零税
     */
    private String classesstype;

    /**
     * 进项税额转出
     */
    private BigDecimal taxesamountout;

    /**
     * 税额结构进项税必传:01-货物及加工、修理修配劳务的进项,02-运输服务的进项,03-电信服务的进项,04-建筑安装服务的进项,05-金融保险服务的进项,06-有形动产租赁的进项,07-有形动产租赁服务的进项,08-不动产租赁服务的进项,09-取得无形资产的进项,10-受让土地使用权的进项,11-生活服务的进项,12-用于购建不动产并一次性抵扣的进项,13-通行费的进项,14-其他的进项
     */
    private String taxstr;

    /**
     * 转出项目:01：免税项目用,02：集体福利、个人消费,03：非正常损失,04：简易计税方法征税项目用,05：免抵退税办法不得抵扣的进项税,06：额纳税检查调减进项税额,07：红字专用发票信息表注明的进项税额,08：上期留抵税额抵减欠税,09：上期留抵税额退税,99：其他应作进项税额转出的情形
     */
    private String returnitem;

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
     * 农险明细分类
     */
    private String farmtypedetail;

    /**
     * 税金（保留6位小数）
     */
    private BigDecimal taxesamount1;

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
    * 获取-被拆分接口表记录mm_policylist_ti的id
    * @return seqchargedetail
     */
    public Long getSeqchargedetail() {
        return seqchargedetail;
    }

    /**
    * 设置-被拆分接口表记录mm_policylist_ti的id
    * @paramType java.lang.Long
    * @param seqchargedetail - 被拆分接口表记录mm_policylist_ti的id
     */
    public void setSeqchargedetail(Long seqchargedetail) {
        this.seqchargedetail = seqchargedetail;
    }

    /**
    * 获取-关联字段，等于mm_policy_ti.id
    * @return seqcharge
     */
    public Long getSeqcharge() {
        return seqcharge;
    }

    /**
    * 设置-关联字段，等于mm_policy_ti.id
    * @paramType java.lang.Long
    * @param seqcharge - 关联字段，等于mm_policy_ti.id
     */
    public void setSeqcharge(Long seqcharge) {
        this.seqcharge = seqcharge;
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
    * 获取-原币金额
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-原币金额
    * @paramType java.math.BigDecimal
    * @param baseamount - 原币金额
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    /**
    * 获取-原币进项税额
    * @return basetaxesamount
     */
    public BigDecimal getBasetaxesamount() {
        return basetaxesamount;
    }

    /**
    * 设置-原币进项税额
    * @paramType java.math.BigDecimal
    * @param basetaxesamount - 原币进项税额
     */
    public void setBasetaxesamount(BigDecimal basetaxesamount) {
        this.basetaxesamount = basetaxesamount;
    }

    /**
    * 获取-操作状态
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-操作状态
    * @paramType java.lang.String
    * @param opstatus - 操作状态
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-来源
    * @return source
     */
    public String getSource() {
        return source;
    }

    /**
    * 设置-来源
    * @paramType java.lang.String
    * @param source - 来源
     */
    public void setSource(String source) {
        this.source = source;
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
    public Short getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本号
    * @paramType java.lang.Short
    * @param hibernateversion - HIBERNATEVERSION版本号
     */
    public void setHibernateversion(Short hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-落地进入td表后的id
    * @return landid
     */
    public BigDecimal getLandid() {
        return landid;
    }

    /**
    * 设置-落地进入td表后的id
    * @paramType java.math.BigDecimal
    * @param landid - 落地进入td表后的id
     */
    public void setLandid(BigDecimal landid) {
        this.landid = landid;
    }

    /**
    * 获取-税金金额(包含在总金额amount中)，对于营改增的必传
    * @return taxesamount
     */
    public BigDecimal getTaxesamount() {
        return taxesamount;
    }

    /**
    * 设置-税金金额(包含在总金额amount中)，对于营改增的必传
    * @paramType java.math.BigDecimal
    * @param taxesamount - 税金金额(包含在总金额amount中)，对于营改增的必传
     */
    public void setTaxesamount(BigDecimal taxesamount) {
        this.taxesamount = taxesamount;
    }

    /**
    * 获取-税率，对于正数的金额，营改增必传，批减或者退保时可空
    * @return taxesrate
     */
    public BigDecimal getTaxesrate() {
        return taxesrate;
    }

    /**
    * 设置-税率，对于正数的金额，营改增必传，批减或者退保时可空
    * @paramType java.math.BigDecimal
    * @param taxesrate - 税率，对于正数的金额，营改增必传，批减或者退保时可空
     */
    public void setTaxesrate(BigDecimal taxesrate) {
        this.taxesrate = taxesrate;
    }

    /**
    * 获取-险别属性 0应税 1 免税 2 零税
    * @return classesstype
     */
    public String getClassesstype() {
        return classesstype;
    }

    /**
    * 设置-险别属性 0应税 1 免税 2 零税
    * @paramType java.lang.String
    * @param classesstype - 险别属性 0应税 1 免税 2 零税
     */
    public void setClassesstype(String classesstype) {
        this.classesstype = classesstype;
    }

    /**
    * 获取-进项税额转出
    * @return taxesamountout
     */
    public BigDecimal getTaxesamountout() {
        return taxesamountout;
    }

    /**
    * 设置-进项税额转出
    * @paramType java.math.BigDecimal
    * @param taxesamountout - 进项税额转出
     */
    public void setTaxesamountout(BigDecimal taxesamountout) {
        this.taxesamountout = taxesamountout;
    }

    /**
    * 获取-税额结构进项税必传:01-货物及加工、修理修配劳务的进项,02-运输服务的进项,03-电信服务的进项,04-建筑安装服务的进项,05-金融保险服务的进项,06-有形动产租赁的进项,07-有形动产租赁服务的进项,08-不动产租赁服务的进项,09-取得无形资产的进项,10-受让土地使用权的进项,11-生活服务的进项,12-用于购建不动产并一次性抵扣的进项,13-通行费的进项,14-其他的进项
    * @return taxstr
     */
    public String getTaxstr() {
        return taxstr;
    }

    /**
    * 设置-税额结构进项税必传:01-货物及加工、修理修配劳务的进项,02-运输服务的进项,03-电信服务的进项,04-建筑安装服务的进项,05-金融保险服务的进项,06-有形动产租赁的进项,07-有形动产租赁服务的进项,08-不动产租赁服务的进项,09-取得无形资产的进项,10-受让土地使用权的进项,11-生活服务的进项,12-用于购建不动产并一次性抵扣的进项,13-通行费的进项,14-其他的进项
    * @paramType java.lang.String
    * @param taxstr - 税额结构进项税必传:01-货物及加工、修理修配劳务的进项,02-运输服务的进项,03-电信服务的进项,04-建筑安装服务的进项,05-金融保险服务的进项,06-有形动产租赁的进项,07-有形动产租赁服务的进项,08-不动产租赁服务的进项,09-取得无形资产的进项,10-受让土地使用权的进项,11-生活服务的进项,12-用于购建不动产并一次性抵扣的进项,13-通行费的进项,14-其他的进项
     */
    public void setTaxstr(String taxstr) {
        this.taxstr = taxstr;
    }

    /**
    * 获取-转出项目:01：免税项目用,02：集体福利、个人消费,03：非正常损失,04：简易计税方法征税项目用,05：免抵退税办法不得抵扣的进项税,06：额纳税检查调减进项税额,07：红字专用发票信息表注明的进项税额,08：上期留抵税额抵减欠税,09：上期留抵税额退税,99：其他应作进项税额转出的情形
    * @return returnitem
     */
    public String getReturnitem() {
        return returnitem;
    }

    /**
    * 设置-转出项目:01：免税项目用,02：集体福利、个人消费,03：非正常损失,04：简易计税方法征税项目用,05：免抵退税办法不得抵扣的进项税,06：额纳税检查调减进项税额,07：红字专用发票信息表注明的进项税额,08：上期留抵税额抵减欠税,09：上期留抵税额退税,99：其他应作进项税额转出的情形
    * @paramType java.lang.String
    * @param returnitem - 转出项目:01：免税项目用,02：集体福利、个人消费,03：非正常损失,04：简易计税方法征税项目用,05：免抵退税办法不得抵扣的进项税,06：额纳税检查调减进项税额,07：红字专用发票信息表注明的进项税额,08：上期留抵税额抵减欠税,09：上期留抵税额退税,99：其他应作进项税额转出的情形
     */
    public void setReturnitem(String returnitem) {
        this.returnitem = returnitem;
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
    * 获取-农险明细分类
    * @return farmtypedetail
     */
    public String getFarmtypedetail() {
        return farmtypedetail;
    }

    /**
    * 设置-农险明细分类
    * @paramType java.lang.String
    * @param farmtypedetail - 农险明细分类
     */
    public void setFarmtypedetail(String farmtypedetail) {
        this.farmtypedetail = farmtypedetail;
    }

    /**
    * 获取-税金（保留6位小数）
    * @return taxesamount1
     */
    public BigDecimal getTaxesamount1() {
        return taxesamount1;
    }

    /**
    * 设置-税金（保留6位小数）
    * @paramType java.math.BigDecimal
    * @param taxesamount1 - 税金（保留6位小数）
     */
    public void setTaxesamount1(BigDecimal taxesamount1) {
        this.taxesamount1 = taxesamount1;
    }
}