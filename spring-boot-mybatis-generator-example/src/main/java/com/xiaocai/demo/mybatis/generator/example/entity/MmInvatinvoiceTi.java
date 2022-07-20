package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_invatinvoice_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvatinvoiceTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 发票代码
     */
    private String invoicecode;

    /**
     * 发票号码
     */
    private String invoiceno;

    /**
     * 币种（发票币种CNY），默认CNY
     */
    private String currencycode;

    /**
     * 发票上的金额合计
     */
    private BigDecimal amount;

    /**
     * 发票上的税额合计
     */
    private BigDecimal taxesamount;

    /**
     * 发票上的价税合计
     */
    private BigDecimal totalamount;

    /**
     * 落地状态(2标示成功)
     */
    private String status;

    /**
     * 发票打印名称(发票抬头)
     */
    private String printname;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 描述
     */
    private String description;

    /**
     * 数据源即来源系统：XSZC 销管，DZGL 单管，AUTOUW 车承保，AUTOCLAIM 车理赔，CLAIM 非车理赔，UNDERWRITING 非车承保，ISoftStone_RI 再保，ecargo ecargo
     */
    private String datasource;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 开票时间YYYY-MM-DD
     */
    private Date invoicedate;

    /**
     * 纳税主体
     */
    private String taxorgtally;

    /**
     * 税票类型：0-增值税专用发票，1-海关进口增值税专用缴款书，2-农产品收购发票，3-代扣代缴完税凭证，4-其他，5-通行费，6-机动车销售统一发票，7-货物运输业增值税专用发票，8-农产品销售发票
     */
    private String taxbilltype;

    /**
     * 抵扣类型：0:可抵扣，1:不可抵扣，2：无法划分，3：视同销售，默认传0
     */
    private String dkstatus;

    /**
     * 申报属性：0：固定资产，1：不动产，2：无形资产，3：其他非资产，4：首次购买税控专用设备，5：税控专用设备技术维护费，默认传3：其他非资产
     */
    private String dectype;

    /**
     * 发票状态：0：未查验，1：正常，2：异常，默认传1：正常
     */
    private String billstatus;

    /**
     * 认证状态：0：未认证，1：已认证，2：已过期，默认传1：已认证
     */
    private String authstatus;

    /**
     * 所属期间
     */
    private Date period;

    /**
     * 业务单元编码，出单部门
     */
    private String pkOrg;

    /**
     * 供应商税号
     */
    private String outtaxno;

    /**
     * 供应商名称
     */
    private String outname;

    /**
     * 供应商地址
     */
    private String outaddr;

    /**
     * 供应商电话
     */
    private String outphone;

    /**
     * 供应商开户行
     */
    private String outbankname;

    /**
     * 供应商账户
     */
    private String outbankno;

    /**
     * 是否全额转出：0否  1是
     */
    private String ifallout;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 预留字段
     */
    private String reserve1;

    /**
     * 预留字段
     */
    private String reserve2;

    /**
     * 预留字段
     */
    private String reserve3;

    /**
     * 预留字段
     */
    private Date reserve4;

    /**
     * 版本号
     */
    private String hibernateversion;

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
    * 获取-币种（发票币种CNY），默认CNY
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种（发票币种CNY），默认CNY
    * @paramType java.lang.String
    * @param currencycode - 币种（发票币种CNY），默认CNY
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-发票上的金额合计
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-发票上的金额合计
    * @paramType java.math.BigDecimal
    * @param amount - 发票上的金额合计
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-发票上的税额合计
    * @return taxesamount
     */
    public BigDecimal getTaxesamount() {
        return taxesamount;
    }

    /**
    * 设置-发票上的税额合计
    * @paramType java.math.BigDecimal
    * @param taxesamount - 发票上的税额合计
     */
    public void setTaxesamount(BigDecimal taxesamount) {
        this.taxesamount = taxesamount;
    }

    /**
    * 获取-发票上的价税合计
    * @return totalamount
     */
    public BigDecimal getTotalamount() {
        return totalamount;
    }

    /**
    * 设置-发票上的价税合计
    * @paramType java.math.BigDecimal
    * @param totalamount - 发票上的价税合计
     */
    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    /**
    * 获取-落地状态(2标示成功)
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-落地状态(2标示成功)
    * @paramType java.lang.String
    * @param status - 落地状态(2标示成功)
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-发票打印名称(发票抬头)
    * @return printname
     */
    public String getPrintname() {
        return printname;
    }

    /**
    * 设置-发票打印名称(发票抬头)
    * @paramType java.lang.String
    * @param printname - 发票打印名称(发票抬头)
     */
    public void setPrintname(String printname) {
        this.printname = printname;
    }

    /**
    * 获取-操作日期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-操作日期
    * @paramType java.util.Date
    * @param opdate - 操作日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
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
    * 获取-数据源即来源系统：XSZC 销管，DZGL 单管，AUTOUW 车承保，AUTOCLAIM 车理赔，CLAIM 非车理赔，UNDERWRITING 非车承保，ISoftStone_RI 再保，ecargo ecargo
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据源即来源系统：XSZC 销管，DZGL 单管，AUTOUW 车承保，AUTOCLAIM 车理赔，CLAIM 非车理赔，UNDERWRITING 非车承保，ISoftStone_RI 再保，ecargo ecargo
    * @paramType java.lang.String
    * @param datasource - 数据源即来源系统：XSZC 销管，DZGL 单管，AUTOUW 车承保，AUTOCLAIM 车理赔，CLAIM 非车理赔，UNDERWRITING 非车承保，ISoftStone_RI 再保，ecargo ecargo
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-批次号
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchid - 批次号
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-开票时间YYYY-MM-DD
    * @return invoicedate
     */
    public Date getInvoicedate() {
        return invoicedate;
    }

    /**
    * 设置-开票时间YYYY-MM-DD
    * @paramType java.util.Date
    * @param invoicedate - 开票时间YYYY-MM-DD
     */
    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
    }

    /**
    * 获取-纳税主体
    * @return taxorgtally
     */
    public String getTaxorgtally() {
        return taxorgtally;
    }

    /**
    * 设置-纳税主体
    * @paramType java.lang.String
    * @param taxorgtally - 纳税主体
     */
    public void setTaxorgtally(String taxorgtally) {
        this.taxorgtally = taxorgtally;
    }

    /**
    * 获取-税票类型：0-增值税专用发票，1-海关进口增值税专用缴款书，2-农产品收购发票，3-代扣代缴完税凭证，4-其他，5-通行费，6-机动车销售统一发票，7-货物运输业增值税专用发票，8-农产品销售发票
    * @return taxbilltype
     */
    public String getTaxbilltype() {
        return taxbilltype;
    }

    /**
    * 设置-税票类型：0-增值税专用发票，1-海关进口增值税专用缴款书，2-农产品收购发票，3-代扣代缴完税凭证，4-其他，5-通行费，6-机动车销售统一发票，7-货物运输业增值税专用发票，8-农产品销售发票
    * @paramType java.lang.String
    * @param taxbilltype - 税票类型：0-增值税专用发票，1-海关进口增值税专用缴款书，2-农产品收购发票，3-代扣代缴完税凭证，4-其他，5-通行费，6-机动车销售统一发票，7-货物运输业增值税专用发票，8-农产品销售发票
     */
    public void setTaxbilltype(String taxbilltype) {
        this.taxbilltype = taxbilltype;
    }

    /**
    * 获取-抵扣类型：0:可抵扣，1:不可抵扣，2：无法划分，3：视同销售，默认传0
    * @return dkstatus
     */
    public String getDkstatus() {
        return dkstatus;
    }

    /**
    * 设置-抵扣类型：0:可抵扣，1:不可抵扣，2：无法划分，3：视同销售，默认传0
    * @paramType java.lang.String
    * @param dkstatus - 抵扣类型：0:可抵扣，1:不可抵扣，2：无法划分，3：视同销售，默认传0
     */
    public void setDkstatus(String dkstatus) {
        this.dkstatus = dkstatus;
    }

    /**
    * 获取-申报属性：0：固定资产，1：不动产，2：无形资产，3：其他非资产，4：首次购买税控专用设备，5：税控专用设备技术维护费，默认传3：其他非资产
    * @return dectype
     */
    public String getDectype() {
        return dectype;
    }

    /**
    * 设置-申报属性：0：固定资产，1：不动产，2：无形资产，3：其他非资产，4：首次购买税控专用设备，5：税控专用设备技术维护费，默认传3：其他非资产
    * @paramType java.lang.String
    * @param dectype - 申报属性：0：固定资产，1：不动产，2：无形资产，3：其他非资产，4：首次购买税控专用设备，5：税控专用设备技术维护费，默认传3：其他非资产
     */
    public void setDectype(String dectype) {
        this.dectype = dectype;
    }

    /**
    * 获取-发票状态：0：未查验，1：正常，2：异常，默认传1：正常
    * @return billstatus
     */
    public String getBillstatus() {
        return billstatus;
    }

    /**
    * 设置-发票状态：0：未查验，1：正常，2：异常，默认传1：正常
    * @paramType java.lang.String
    * @param billstatus - 发票状态：0：未查验，1：正常，2：异常，默认传1：正常
     */
    public void setBillstatus(String billstatus) {
        this.billstatus = billstatus;
    }

    /**
    * 获取-认证状态：0：未认证，1：已认证，2：已过期，默认传1：已认证
    * @return authstatus
     */
    public String getAuthstatus() {
        return authstatus;
    }

    /**
    * 设置-认证状态：0：未认证，1：已认证，2：已过期，默认传1：已认证
    * @paramType java.lang.String
    * @param authstatus - 认证状态：0：未认证，1：已认证，2：已过期，默认传1：已认证
     */
    public void setAuthstatus(String authstatus) {
        this.authstatus = authstatus;
    }

    /**
    * 获取-所属期间
    * @return period
     */
    public Date getPeriod() {
        return period;
    }

    /**
    * 设置-所属期间
    * @paramType java.util.Date
    * @param period - 所属期间
     */
    public void setPeriod(Date period) {
        this.period = period;
    }

    /**
    * 获取-业务单元编码，出单部门
    * @return pkOrg
     */
    public String getPkOrg() {
        return pkOrg;
    }

    /**
    * 设置-业务单元编码，出单部门
    * @paramType java.lang.String
    * @param pkOrg - 业务单元编码，出单部门
     */
    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg;
    }

    /**
    * 获取-供应商税号
    * @return outtaxno
     */
    public String getOuttaxno() {
        return outtaxno;
    }

    /**
    * 设置-供应商税号
    * @paramType java.lang.String
    * @param outtaxno - 供应商税号
     */
    public void setOuttaxno(String outtaxno) {
        this.outtaxno = outtaxno;
    }

    /**
    * 获取-供应商名称
    * @return outname
     */
    public String getOutname() {
        return outname;
    }

    /**
    * 设置-供应商名称
    * @paramType java.lang.String
    * @param outname - 供应商名称
     */
    public void setOutname(String outname) {
        this.outname = outname;
    }

    /**
    * 获取-供应商地址
    * @return outaddr
     */
    public String getOutaddr() {
        return outaddr;
    }

    /**
    * 设置-供应商地址
    * @paramType java.lang.String
    * @param outaddr - 供应商地址
     */
    public void setOutaddr(String outaddr) {
        this.outaddr = outaddr;
    }

    /**
    * 获取-供应商电话
    * @return outphone
     */
    public String getOutphone() {
        return outphone;
    }

    /**
    * 设置-供应商电话
    * @paramType java.lang.String
    * @param outphone - 供应商电话
     */
    public void setOutphone(String outphone) {
        this.outphone = outphone;
    }

    /**
    * 获取-供应商开户行
    * @return outbankname
     */
    public String getOutbankname() {
        return outbankname;
    }

    /**
    * 设置-供应商开户行
    * @paramType java.lang.String
    * @param outbankname - 供应商开户行
     */
    public void setOutbankname(String outbankname) {
        this.outbankname = outbankname;
    }

    /**
    * 获取-供应商账户
    * @return outbankno
     */
    public String getOutbankno() {
        return outbankno;
    }

    /**
    * 设置-供应商账户
    * @paramType java.lang.String
    * @param outbankno - 供应商账户
     */
    public void setOutbankno(String outbankno) {
        this.outbankno = outbankno;
    }

    /**
    * 获取-是否全额转出：0否  1是
    * @return ifallout
     */
    public String getIfallout() {
        return ifallout;
    }

    /**
    * 设置-是否全额转出：0否  1是
    * @paramType java.lang.String
    * @param ifallout - 是否全额转出：0否  1是
     */
    public void setIfallout(String ifallout) {
        this.ifallout = ifallout;
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
    * 获取-预留字段
    * @return reserve1
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param reserve1 - 预留字段
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    /**
    * 获取-预留字段
    * @return reserve2
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param reserve2 - 预留字段
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    /**
    * 获取-预留字段
    * @return reserve3
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param reserve3 - 预留字段
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    /**
    * 获取-预留字段
    * @return reserve4
     */
    public Date getReserve4() {
        return reserve4;
    }

    /**
    * 设置-预留字段
    * @paramType java.util.Date
    * @param reserve4 - 预留字段
     */
    public void setReserve4(Date reserve4) {
        this.reserve4 = reserve4;
    }

    /**
    * 获取-版本号
    * @return hibernateversion
     */
    public String getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.String
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(String hibernateversion) {
        this.hibernateversion = hibernateversion;
    }
}