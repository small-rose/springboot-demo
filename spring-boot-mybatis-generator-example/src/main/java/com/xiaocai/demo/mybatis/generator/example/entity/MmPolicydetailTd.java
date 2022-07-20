package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policydetail_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicydetailTd {
    /**
     * 主键
     */
    private Long seqpolicydetail;

    /**
     * 复制接口表中的MM_CHARGEDETAIL_TI.SEQCHARGEDETAIL
     */
    private Long seqchargedetail;

    /**
     * 关联字段(等于MM_POLICY_TD.SEQPOLICY)
     */
    private Long seqpolicy;

    /**
     * 分公司
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
     * 币种（记账币种）
     */
    private String currencycode;

    /**
     * 险种
     */
    private String classescode;

    /**
     * 金额（记账币种）
     */
    private BigDecimal amount;

    /**
     * 实收金额（记账币种）
     */
    private BigDecimal realamount;

    /**
     * 币种（保单币种）
     */
    private String basecurrencycode;

    /**
     * 险种（保单币种）
     */
    private BigDecimal baseamount;

    /**
     * 实收金额（保单币种）
     */
    private BigDecimal baserealamount;

    /**
     * 状态 0 未核销 1 部分核销 2 已核销
     */
    private String opstatus;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 数据修改说明
     */
    private String modifydesc;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 农业险保费补贴来源明细代码
     */
    private String detailcode;

    /**
     * 业务数据唯一流水号
     */
    private String custseq;

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
     * 税金标志：0保费 1税金
     */
    private String taxesflag;

    /**
     * 已开具发票原币金额
     */
    private BigDecimal invoicebaseamount;

    /**
     * 未开票金额
     */
    private BigDecimal unbilledamount;

    /**
     * 税金金额，保留6位数
     */
    private BigDecimal taxesamount1;

    /**
     * 税金金额，保留2位数
     */
    private BigDecimal invoicebasetaxesamount1;

    /**
     * 税金金额，保留6位数
     */
    private BigDecimal invoicebasetaxesamount;

    /**
    * 获取-主键
    * @return seqpolicydetail
     */
    public Long getSeqpolicydetail() {
        return seqpolicydetail;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqpolicydetail - 主键
     */
    public void setSeqpolicydetail(Long seqpolicydetail) {
        this.seqpolicydetail = seqpolicydetail;
    }

    /**
    * 获取-复制接口表中的MM_CHARGEDETAIL_TI.SEQCHARGEDETAIL
    * @return seqchargedetail
     */
    public Long getSeqchargedetail() {
        return seqchargedetail;
    }

    /**
    * 设置-复制接口表中的MM_CHARGEDETAIL_TI.SEQCHARGEDETAIL
    * @paramType java.lang.Long
    * @param seqchargedetail - 复制接口表中的MM_CHARGEDETAIL_TI.SEQCHARGEDETAIL
     */
    public void setSeqchargedetail(Long seqchargedetail) {
        this.seqchargedetail = seqchargedetail;
    }

    /**
    * 获取-关联字段(等于MM_POLICY_TD.SEQPOLICY)
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-关联字段(等于MM_POLICY_TD.SEQPOLICY)
    * @paramType java.lang.Long
    * @param seqpolicy - 关联字段(等于MM_POLICY_TD.SEQPOLICY)
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
    }

    /**
    * 获取-分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司
    * @paramType java.lang.String
    * @param subcompany - 分公司
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
    * 获取-币种（记账币种）
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种（记账币种）
    * @paramType java.lang.String
    * @param currencycode - 币种（记账币种）
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-险种
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种
    * @paramType java.lang.String
    * @param classescode - 险种
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-金额（记账币种）
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param amount - 金额（记账币种）
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-实收金额（记账币种）
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-实收金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param realamount - 实收金额（记账币种）
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
    }

    /**
    * 获取-币种（保单币种）
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-币种（保单币种）
    * @paramType java.lang.String
    * @param basecurrencycode - 币种（保单币种）
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
    }

    /**
    * 获取-险种（保单币种）
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-险种（保单币种）
    * @paramType java.math.BigDecimal
    * @param baseamount - 险种（保单币种）
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    /**
    * 获取-实收金额（保单币种）
    * @return baserealamount
     */
    public BigDecimal getBaserealamount() {
        return baserealamount;
    }

    /**
    * 设置-实收金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param baserealamount - 实收金额（保单币种）
     */
    public void setBaserealamount(BigDecimal baserealamount) {
        this.baserealamount = baserealamount;
    }

    /**
    * 获取-状态 0 未核销 1 部分核销 2 已核销
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-状态 0 未核销 1 部分核销 2 已核销
    * @paramType java.lang.String
    * @param opstatus - 状态 0 未核销 1 部分核销 2 已核销
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-数据来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据来源
    * @paramType java.lang.String
    * @param datasource - 数据来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-数据修改说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-数据修改说明
    * @paramType java.lang.String
    * @param modifydesc - 数据修改说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
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
    * 获取-农业险保费补贴来源明细代码
    * @return detailcode
     */
    public String getDetailcode() {
        return detailcode;
    }

    /**
    * 设置-农业险保费补贴来源明细代码
    * @paramType java.lang.String
    * @param detailcode - 农业险保费补贴来源明细代码
     */
    public void setDetailcode(String detailcode) {
        this.detailcode = detailcode;
    }

    /**
    * 获取-业务数据唯一流水号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务数据唯一流水号
    * @paramType java.lang.String
    * @param custseq - 业务数据唯一流水号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
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
    * 获取-税金标志：0保费 1税金
    * @return taxesflag
     */
    public String getTaxesflag() {
        return taxesflag;
    }

    /**
    * 设置-税金标志：0保费 1税金
    * @paramType java.lang.String
    * @param taxesflag - 税金标志：0保费 1税金
     */
    public void setTaxesflag(String taxesflag) {
        this.taxesflag = taxesflag;
    }

    /**
    * 获取-已开具发票原币金额
    * @return invoicebaseamount
     */
    public BigDecimal getInvoicebaseamount() {
        return invoicebaseamount;
    }

    /**
    * 设置-已开具发票原币金额
    * @paramType java.math.BigDecimal
    * @param invoicebaseamount - 已开具发票原币金额
     */
    public void setInvoicebaseamount(BigDecimal invoicebaseamount) {
        this.invoicebaseamount = invoicebaseamount;
    }

    /**
    * 获取-未开票金额
    * @return unbilledamount
     */
    public BigDecimal getUnbilledamount() {
        return unbilledamount;
    }

    /**
    * 设置-未开票金额
    * @paramType java.math.BigDecimal
    * @param unbilledamount - 未开票金额
     */
    public void setUnbilledamount(BigDecimal unbilledamount) {
        this.unbilledamount = unbilledamount;
    }

    /**
    * 获取-税金金额，保留6位数
    * @return taxesamount1
     */
    public BigDecimal getTaxesamount1() {
        return taxesamount1;
    }

    /**
    * 设置-税金金额，保留6位数
    * @paramType java.math.BigDecimal
    * @param taxesamount1 - 税金金额，保留6位数
     */
    public void setTaxesamount1(BigDecimal taxesamount1) {
        this.taxesamount1 = taxesamount1;
    }

    /**
    * 获取-税金金额，保留2位数
    * @return invoicebasetaxesamount1
     */
    public BigDecimal getInvoicebasetaxesamount1() {
        return invoicebasetaxesamount1;
    }

    /**
    * 设置-税金金额，保留2位数
    * @paramType java.math.BigDecimal
    * @param invoicebasetaxesamount1 - 税金金额，保留2位数
     */
    public void setInvoicebasetaxesamount1(BigDecimal invoicebasetaxesamount1) {
        this.invoicebasetaxesamount1 = invoicebasetaxesamount1;
    }

    /**
    * 获取-税金金额，保留6位数
    * @return invoicebasetaxesamount
     */
    public BigDecimal getInvoicebasetaxesamount() {
        return invoicebasetaxesamount;
    }

    /**
    * 设置-税金金额，保留6位数
    * @paramType java.math.BigDecimal
    * @param invoicebasetaxesamount - 税金金额，保留6位数
     */
    public void setInvoicebasetaxesamount(BigDecimal invoicebasetaxesamount) {
        this.invoicebasetaxesamount = invoicebasetaxesamount;
    }
}