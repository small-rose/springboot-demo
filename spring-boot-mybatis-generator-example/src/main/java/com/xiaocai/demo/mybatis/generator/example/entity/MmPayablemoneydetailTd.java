package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_payablemoneydetail_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPayablemoneydetailTd {
    /**
     * 物理主键
     */
    private Long seqpayabledetail;

    /**
     * 主表主键
     */
    private Long payableno;

    /**
     * 赔案表主键、手续费表主键、再保表主键
     */
    private Long seqclaimdetail;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 币种（记账币种）
     */
    private String currencycode;

    /**
     * 金额（记账币种）
     */
    private BigDecimal amount;

    /**
     * 已处理金额（记账币种）
     */
    private BigDecimal usedamount;

    /**
     * 币种
     */
    private String basecurrencycode;

    /**
     * 金额（保单币种），备用
     */
    private BigDecimal baseamount;

    /**
     * 已处理金额（保单币种），备用
     */
    private BigDecimal baseusedamount;

    /**
     * 0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被作废并红冲 5 由于取消其他记录产生的红冲记录  0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收款表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）
     */
    private String opstatus;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 险种
     */
    private String classescode;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 修改说明
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
     * hibernate版本号
     */
    private Integer hibernateversion;

    /**
     * 对应被拆分记录的billno
     */
    private String custseq;

    /**
     * 对应被拆分记录的custseq
     */
    private String billno;

    /**
     * 被拆分记录对应的表名
     */
    private String tablename;

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
     * 已开具发票原币金额，20191225新增
     */
    private BigDecimal invoicebaseamount;

    /**
     * 未开具发票金额，20191225新增
     */
    private BigDecimal unbilledamount;

    /**
     * 税金金额，保留6位数
     */
    private BigDecimal invoicebasetaxesamount;

    /**
     * 税金金额，保留6位数
     */
    private BigDecimal taxesamount1;

    /**
     * 税金转出金额，保留6位数
     */
    private BigDecimal invoicebasetaxesamount1;

    /**
    * 获取-物理主键
    * @return seqpayabledetail
     */
    public Long getSeqpayabledetail() {
        return seqpayabledetail;
    }

    /**
    * 设置-物理主键
    * @paramType java.lang.Long
    * @param seqpayabledetail - 物理主键
     */
    public void setSeqpayabledetail(Long seqpayabledetail) {
        this.seqpayabledetail = seqpayabledetail;
    }

    /**
    * 获取-主表主键
    * @return payableno
     */
    public Long getPayableno() {
        return payableno;
    }

    /**
    * 设置-主表主键
    * @paramType java.lang.Long
    * @param payableno - 主表主键
     */
    public void setPayableno(Long payableno) {
        this.payableno = payableno;
    }

    /**
    * 获取-赔案表主键、手续费表主键、再保表主键
    * @return seqclaimdetail
     */
    public Long getSeqclaimdetail() {
        return seqclaimdetail;
    }

    /**
    * 设置-赔案表主键、手续费表主键、再保表主键
    * @paramType java.lang.Long
    * @param seqclaimdetail - 赔案表主键、手续费表主键、再保表主键
     */
    public void setSeqclaimdetail(Long seqclaimdetail) {
        this.seqclaimdetail = seqclaimdetail;
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
    * 获取-已处理金额（记账币种）
    * @return usedamount
     */
    public BigDecimal getUsedamount() {
        return usedamount;
    }

    /**
    * 设置-已处理金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param usedamount - 已处理金额（记账币种）
     */
    public void setUsedamount(BigDecimal usedamount) {
        this.usedamount = usedamount;
    }

    /**
    * 获取-币种
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-币种
    * @paramType java.lang.String
    * @param basecurrencycode - 币种
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
    }

    /**
    * 获取-金额（保单币种），备用
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-金额（保单币种），备用
    * @paramType java.math.BigDecimal
    * @param baseamount - 金额（保单币种），备用
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    /**
    * 获取-已处理金额（保单币种），备用
    * @return baseusedamount
     */
    public BigDecimal getBaseusedamount() {
        return baseusedamount;
    }

    /**
    * 设置-已处理金额（保单币种），备用
    * @paramType java.math.BigDecimal
    * @param baseusedamount - 已处理金额（保单币种），备用
     */
    public void setBaseusedamount(BigDecimal baseusedamount) {
        this.baseusedamount = baseusedamount;
    }

    /**
    * 获取-0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被作废并红冲 5 由于取消其他记录产生的红冲记录  0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收款表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被作废并红冲 5 由于取消其他记录产生的红冲记录  0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收款表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）
    * @paramType java.lang.String
    * @param opstatus - 0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被作废并红冲 5 由于取消其他记录产生的红冲记录  0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收款表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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
    * 获取-修改说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-修改说明
    * @paramType java.lang.String
    * @param modifydesc - 修改说明
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
    * 获取-对应被拆分记录的billno
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-对应被拆分记录的billno
    * @paramType java.lang.String
    * @param custseq - 对应被拆分记录的billno
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-对应被拆分记录的custseq
    * @return billno
     */
    public String getBillno() {
        return billno;
    }

    /**
    * 设置-对应被拆分记录的custseq
    * @paramType java.lang.String
    * @param billno - 对应被拆分记录的custseq
     */
    public void setBillno(String billno) {
        this.billno = billno;
    }

    /**
    * 获取-被拆分记录对应的表名
    * @return tablename
     */
    public String getTablename() {
        return tablename;
    }

    /**
    * 设置-被拆分记录对应的表名
    * @paramType java.lang.String
    * @param tablename - 被拆分记录对应的表名
     */
    public void setTablename(String tablename) {
        this.tablename = tablename;
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
    * 获取-已开具发票原币金额，20191225新增
    * @return invoicebaseamount
     */
    public BigDecimal getInvoicebaseamount() {
        return invoicebaseamount;
    }

    /**
    * 设置-已开具发票原币金额，20191225新增
    * @paramType java.math.BigDecimal
    * @param invoicebaseamount - 已开具发票原币金额，20191225新增
     */
    public void setInvoicebaseamount(BigDecimal invoicebaseamount) {
        this.invoicebaseamount = invoicebaseamount;
    }

    /**
    * 获取-未开具发票金额，20191225新增
    * @return unbilledamount
     */
    public BigDecimal getUnbilledamount() {
        return unbilledamount;
    }

    /**
    * 设置-未开具发票金额，20191225新增
    * @paramType java.math.BigDecimal
    * @param unbilledamount - 未开具发票金额，20191225新增
     */
    public void setUnbilledamount(BigDecimal unbilledamount) {
        this.unbilledamount = unbilledamount;
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
    * 获取-税金转出金额，保留6位数
    * @return invoicebasetaxesamount1
     */
    public BigDecimal getInvoicebasetaxesamount1() {
        return invoicebasetaxesamount1;
    }

    /**
    * 设置-税金转出金额，保留6位数
    * @paramType java.math.BigDecimal
    * @param invoicebasetaxesamount1 - 税金转出金额，保留6位数
     */
    public void setInvoicebasetaxesamount1(BigDecimal invoicebasetaxesamount1) {
        this.invoicebasetaxesamount1 = invoicebasetaxesamount1;
    }
}