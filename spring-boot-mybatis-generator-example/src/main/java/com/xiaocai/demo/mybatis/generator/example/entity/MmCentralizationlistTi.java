package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_centralizationlist_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmCentralizationlistTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * MM_CENTRALIZATION_TI主键
     */
    private Long seqcentralization;

    /**
     * 数据类型
     */
    private String datatype;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 业务归属部门
     */
    private String departmentcode;

    /**
     * 结算单号
     */
    private String summaryno;

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
     * 财务险种
     */
    private String classescode;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 应付手续费记录的CUSTSEQ
     */
    private String custseq;

    /**
     * 本次应付手续费原币币种
     */
    private String basecurrencycode;

    /**
     * 本次应付手续费原币金额
     */
    private BigDecimal baseamount;

    /**
     * 本次应付手续费币种
     */
    private String currencycode;

    /**
     * 本次应付手续费金额
     */
    private BigDecimal amount;

    /**
     * 实际支付币种针对原币种的兑换汇率
     */
    private BigDecimal exchangerate;

    /**
     * 实收保费币种
     */
    private String realcurrencycode;

    /**
     * 实收保费
     */
    private BigDecimal realamount;

    /**
     * 手续费比例
     */
    private BigDecimal feepercentage;

    /**
     * 支付确认码
     */
    private String confirmcode;

    /**
     * 支付号
     */
    private String inpaymentno;

    /**
     * 投保确认码
     */
    private String confirmsequenceno;

    /**
     * 上传标志（北京手续费上传标志）
     */
    private String ifupload;

    /**
     * 发票号
     */
    private String invoicecode;

    /**
     * 发票开具单位
     */
    private String invoicedunit;

    /**
     * 发票金额
     */
    private BigDecimal invoiceamount;

    /**
     * 收款单位名称
     */
    private String receiveunit;

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
     * 手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
     */
    private String modifydesc;

    /**
     * 初始状态(2落地成功,3.落地失败.4作废)
     */
    private String status;

    /**
     * 数据错误日志
     */
    private String errmsg;

    /**
     *  账单号
     */
    private String billno;

    /**
     * 是否做子险拆分 0 不拆分 1拆分
     */
    private String issplitted;

    /**
     * 预约协议标示1--预约协议结算单  0--正常结算单
     */
    private String protocolflag;

    /**
     * 预约协议标示1--预约协议结算单  0--正常结算单
     */
    private String totalprotocoltno;

    /**
     * 进项税额
     */
    private BigDecimal taxesamount;

    /**
     * 进项税额转出
     */
    private BigDecimal taxesamountout;

    /**
     * 税率
     */
    private BigDecimal taxesrate;

    /**
     * 条款或险别代码
     */
    private String classescodedesc;

    /**
     * 险别属性：0应税 1 免税 2 零税
     */
    private String classesstype;

    /**
     * 发票抬头
     */
    private String invoiceheader;

    /**
     * 税额入账机构
     */
    private String invoiceunit;

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
    * 获取-MM_CENTRALIZATION_TI主键
    * @return seqcentralization
     */
    public Long getSeqcentralization() {
        return seqcentralization;
    }

    /**
    * 设置-MM_CENTRALIZATION_TI主键
    * @paramType java.lang.Long
    * @param seqcentralization - MM_CENTRALIZATION_TI主键
     */
    public void setSeqcentralization(Long seqcentralization) {
        this.seqcentralization = seqcentralization;
    }

    /**
    * 获取-数据类型
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-数据类型
    * @paramType java.lang.String
    * @param datatype - 数据类型
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
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
    * 获取-业务归属部门
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-业务归属部门
    * @paramType java.lang.String
    * @param departmentcode - 业务归属部门
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
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
    * 获取-财务险种
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-财务险种
    * @paramType java.lang.String
    * @param classescode - 财务险种
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-起保日期
    * @return startdate
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
    * 设置-起保日期
    * @paramType java.util.Date
    * @param startdate - 起保日期
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
    * 获取-应付手续费记录的CUSTSEQ
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-应付手续费记录的CUSTSEQ
    * @paramType java.lang.String
    * @param custseq - 应付手续费记录的CUSTSEQ
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-本次应付手续费原币币种
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-本次应付手续费原币币种
    * @paramType java.lang.String
    * @param basecurrencycode - 本次应付手续费原币币种
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
    }

    /**
    * 获取-本次应付手续费原币金额
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-本次应付手续费原币金额
    * @paramType java.math.BigDecimal
    * @param baseamount - 本次应付手续费原币金额
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    /**
    * 获取-本次应付手续费币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-本次应付手续费币种
    * @paramType java.lang.String
    * @param currencycode - 本次应付手续费币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-本次应付手续费金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-本次应付手续费金额
    * @paramType java.math.BigDecimal
    * @param amount - 本次应付手续费金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-实际支付币种针对原币种的兑换汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-实际支付币种针对原币种的兑换汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 实际支付币种针对原币种的兑换汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
    }

    /**
    * 获取-实收保费币种
    * @return realcurrencycode
     */
    public String getRealcurrencycode() {
        return realcurrencycode;
    }

    /**
    * 设置-实收保费币种
    * @paramType java.lang.String
    * @param realcurrencycode - 实收保费币种
     */
    public void setRealcurrencycode(String realcurrencycode) {
        this.realcurrencycode = realcurrencycode;
    }

    /**
    * 获取-实收保费
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-实收保费
    * @paramType java.math.BigDecimal
    * @param realamount - 实收保费
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
    }

    /**
    * 获取-手续费比例
    * @return feepercentage
     */
    public BigDecimal getFeepercentage() {
        return feepercentage;
    }

    /**
    * 设置-手续费比例
    * @paramType java.math.BigDecimal
    * @param feepercentage - 手续费比例
     */
    public void setFeepercentage(BigDecimal feepercentage) {
        this.feepercentage = feepercentage;
    }

    /**
    * 获取-支付确认码
    * @return confirmcode
     */
    public String getConfirmcode() {
        return confirmcode;
    }

    /**
    * 设置-支付确认码
    * @paramType java.lang.String
    * @param confirmcode - 支付确认码
     */
    public void setConfirmcode(String confirmcode) {
        this.confirmcode = confirmcode;
    }

    /**
    * 获取-支付号
    * @return inpaymentno
     */
    public String getInpaymentno() {
        return inpaymentno;
    }

    /**
    * 设置-支付号
    * @paramType java.lang.String
    * @param inpaymentno - 支付号
     */
    public void setInpaymentno(String inpaymentno) {
        this.inpaymentno = inpaymentno;
    }

    /**
    * 获取-投保确认码
    * @return confirmsequenceno
     */
    public String getConfirmsequenceno() {
        return confirmsequenceno;
    }

    /**
    * 设置-投保确认码
    * @paramType java.lang.String
    * @param confirmsequenceno - 投保确认码
     */
    public void setConfirmsequenceno(String confirmsequenceno) {
        this.confirmsequenceno = confirmsequenceno;
    }

    /**
    * 获取-上传标志（北京手续费上传标志）
    * @return ifupload
     */
    public String getIfupload() {
        return ifupload;
    }

    /**
    * 设置-上传标志（北京手续费上传标志）
    * @paramType java.lang.String
    * @param ifupload - 上传标志（北京手续费上传标志）
     */
    public void setIfupload(String ifupload) {
        this.ifupload = ifupload;
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
    * 获取-发票开具单位
    * @return invoicedunit
     */
    public String getInvoicedunit() {
        return invoicedunit;
    }

    /**
    * 设置-发票开具单位
    * @paramType java.lang.String
    * @param invoicedunit - 发票开具单位
     */
    public void setInvoicedunit(String invoicedunit) {
        this.invoicedunit = invoicedunit;
    }

    /**
    * 获取-发票金额
    * @return invoiceamount
     */
    public BigDecimal getInvoiceamount() {
        return invoiceamount;
    }

    /**
    * 设置-发票金额
    * @paramType java.math.BigDecimal
    * @param invoiceamount - 发票金额
     */
    public void setInvoiceamount(BigDecimal invoiceamount) {
        this.invoiceamount = invoiceamount;
    }

    /**
    * 获取-收款单位名称
    * @return receiveunit
     */
    public String getReceiveunit() {
        return receiveunit;
    }

    /**
    * 设置-收款单位名称
    * @paramType java.lang.String
    * @param receiveunit - 收款单位名称
     */
    public void setReceiveunit(String receiveunit) {
        this.receiveunit = receiveunit;
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
    * 获取-手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-初始状态(2落地成功,3.落地失败.4作废)
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-初始状态(2落地成功,3.落地失败.4作废)
    * @paramType java.lang.String
    * @param status - 初始状态(2落地成功,3.落地失败.4作废)
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-数据错误日志
    * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
    * 设置-数据错误日志
    * @paramType java.lang.String
    * @param errmsg - 数据错误日志
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    /**
    * 获取-
账单号
    * @return billno
     */
    public String getBillno() {
        return billno;
    }

    /**
    * 设置-
账单号
    * @paramType java.lang.String
    * @param billno - 
账单号
     */
    public void setBillno(String billno) {
        this.billno = billno;
    }

    /**
    * 获取-是否做子险拆分 0 不拆分 1拆分
    * @return issplitted
     */
    public String getIssplitted() {
        return issplitted;
    }

    /**
    * 设置-是否做子险拆分 0 不拆分 1拆分
    * @paramType java.lang.String
    * @param issplitted - 是否做子险拆分 0 不拆分 1拆分
     */
    public void setIssplitted(String issplitted) {
        this.issplitted = issplitted;
    }

    /**
    * 获取-预约协议标示1--预约协议结算单  0--正常结算单
    * @return protocolflag
     */
    public String getProtocolflag() {
        return protocolflag;
    }

    /**
    * 设置-预约协议标示1--预约协议结算单  0--正常结算单
    * @paramType java.lang.String
    * @param protocolflag - 预约协议标示1--预约协议结算单  0--正常结算单
     */
    public void setProtocolflag(String protocolflag) {
        this.protocolflag = protocolflag;
    }

    /**
    * 获取-预约协议标示1--预约协议结算单  0--正常结算单
    * @return totalprotocoltno
     */
    public String getTotalprotocoltno() {
        return totalprotocoltno;
    }

    /**
    * 设置-预约协议标示1--预约协议结算单  0--正常结算单
    * @paramType java.lang.String
    * @param totalprotocoltno - 预约协议标示1--预约协议结算单  0--正常结算单
     */
    public void setTotalprotocoltno(String totalprotocoltno) {
        this.totalprotocoltno = totalprotocoltno;
    }

    /**
    * 获取-进项税额
    * @return taxesamount
     */
    public BigDecimal getTaxesamount() {
        return taxesamount;
    }

    /**
    * 设置-进项税额
    * @paramType java.math.BigDecimal
    * @param taxesamount - 进项税额
     */
    public void setTaxesamount(BigDecimal taxesamount) {
        this.taxesamount = taxesamount;
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
    * 获取-条款或险别代码
    * @return classescodedesc
     */
    public String getClassescodedesc() {
        return classescodedesc;
    }

    /**
    * 设置-条款或险别代码
    * @paramType java.lang.String
    * @param classescodedesc - 条款或险别代码
     */
    public void setClassescodedesc(String classescodedesc) {
        this.classescodedesc = classescodedesc;
    }

    /**
    * 获取-险别属性：0应税 1 免税 2 零税
    * @return classesstype
     */
    public String getClassesstype() {
        return classesstype;
    }

    /**
    * 设置-险别属性：0应税 1 免税 2 零税
    * @paramType java.lang.String
    * @param classesstype - 险别属性：0应税 1 免税 2 零税
     */
    public void setClassesstype(String classesstype) {
        this.classesstype = classesstype;
    }

    /**
    * 获取-发票抬头
    * @return invoiceheader
     */
    public String getInvoiceheader() {
        return invoiceheader;
    }

    /**
    * 设置-发票抬头
    * @paramType java.lang.String
    * @param invoiceheader - 发票抬头
     */
    public void setInvoiceheader(String invoiceheader) {
        this.invoiceheader = invoiceheader;
    }

    /**
    * 获取-税额入账机构
    * @return invoiceunit
     */
    public String getInvoiceunit() {
        return invoiceunit;
    }

    /**
    * 设置-税额入账机构
    * @paramType java.lang.String
    * @param invoiceunit - 税额入账机构
     */
    public void setInvoiceunit(String invoiceunit) {
        this.invoiceunit = invoiceunit;
    }
}