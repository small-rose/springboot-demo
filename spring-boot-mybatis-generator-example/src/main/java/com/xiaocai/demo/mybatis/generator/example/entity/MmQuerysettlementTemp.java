package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_querysettlement_temp
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmQuerysettlementTemp {
    /**
     * 主键
     */
    private Long id;

    /**
     * 支付流水号
     */
    private String applydataid;

    /**
     * 待付款流水号
     */
    private Long settlementno;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 待付款批次号
     */
    private Long payableseq;

    /**
     * 小汇总号
     */
    private String summaryno;

    /**
     * 数据类型
     */
    private String datatype;

    /**
     * 11保单 12红字待付款
     */
    private String businesstype;

    /**
     * 来源流水号
     */
    private Long fatherno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 币种（记账币种）
     */
    private String currencycode;

    /**
     * 本次支付金额（记账币种）
     */
    private BigDecimal handledamount;

    /**
     * 金额（记账币种）
     */
    private BigDecimal amount;

    /**
     * 已处理金额（记账币种）
     */
    private BigDecimal usedamount;

    /**
     * 币种（保单币种）
     */
    private String basecurrencycode;

    /**
     * 本次支付金额（保单币种）
     */
    private BigDecimal handledbaseamount;

    /**
     * 金额（保单币种）
     */
    private BigDecimal baseamount;

    /**
     * 已处理金额（保单币种）
     */
    private BigDecimal baseusedamount;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 客户名称（英文）
     */
    private String customernameen;

    /**
     * 客户组
     */
    private String customerpartyno;

    /**
     * 核销状态
     */
    private String opstatus;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 业务部门代码
     */
    private String departmentcode;

    /**
     * 业务部门
     */
    private String departmentname;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 摘要
     */
    private String description;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 风险类别
     */
    private String risktype;

    /**
     * 客户账户代码
     */
    private String custaccountno;

    /**
     * 客户开户行名称
     */
    private String bankname;

    /**
     * 客户开户行代码
     */
    private String custbankno;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 储金返还序号
     */
    private String returnno;

    /**
     * 取消日期
     */
    private Date canceldate;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 取消标志
     */
    private String cancelflag;

    /**
     * 待付款大类
     */
    private String paytype;

    /**
     * 保单业务性质
     */
    private String businessattr;

    /**
     * 序号
     */
    private String serialno;

    /**
     * 业务唯一主键
     */
    private String custseq;

    /**
     * 批次号
     */
    private String inpaymentbatchno;

    /**
     * 审核状态
     */
    private String checkstatus;

    /**
     * 审核字段
     */
    private String checkcode;

    /**
     * 审核日期
     */
    private Date checkdate;

    /**
     * 审核意见
     */
    private String checkcontent;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 批次结算单号
     */
    private String batchsummaryno;

    /**
     * 批次总金额
     */
    private BigDecimal batchamount;

    /**
     * 保批单欠收金额
     */
    private BigDecimal baseleftamount;

    /**
     * 实际手续费支付币种
     */
    private String actualcurrencycode;

    /**
     * 手续费实际支付币种针对原币种的兑换汇率
     */
    private Long actualexchangerate;

    /**
     * 再保页面用，合同号
     */
    private String contractcode;

    /**
     * 授权状态
     */
    private String authorizedstate;

    /**
     * 投保确认码
     */
    private String confirmsequenceno;

    /**
     * 是否上传
     */
    private String ifupload;

    /**
     * 保单发票表主键
     */
    private Long seqinvply;

    /**
     * 手续费支付号
     */
    private String paycode;

    /**
     * 保单起保时间
     */
    private String startdate;

    /**
     * 业务类型
     */
    private String certitype;

    /**
     * 应付比例金额
     */
    private BigDecimal proportionamount;

    /**
     * 客户代理银行名称
     */
    private String custagentbankname;

    /**
     * 客户代理银行地址
     */
    private String custagentbankaddr;

    /**
     * 客户在代理银行的帐号
     */
    private String custagentaccountno;

    /**
     * 客户地址
     */
    private String custaddress;

    /**
     * 客户常驻国家名称
     */
    private String custcountryname;

    /**
     * 客户常驻国家代码
     */
    private String custcountrycode;

    /**
     * 支付方式
     */
    private String paymentmethod;

    /**
     * 进项税额
     */
    private BigDecimal taxesamount;

    /**
     * 进项税额（保单币种）
     */
    private BigDecimal basetaxesamount;

    /**
     * 客户约定结算币种
     */
    private String exchangecurrencycode;

    /**
     * 客户约定结算金额
     */
    private String exchangeamount;

    /**
     * 共保序号
     */
    private String coinsurno;

    /**
     * 共保标识
     */
    private String hascoins;

    /**
     * 报案号
     */
    private String reportcaseno;

    /**
     * 帐单序号
     */
    private String totalserialno;

    /**
     * 客户账户名称
     */
    private String custaccountname;

    /**
     * 保费结算单唯一键
     */
    private Long seqhandover;

    /**
     * 是否做子险拆分 0 不拆分 1拆分
     */
    private Byte issplitted;

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
    * 获取-支付流水号
    * @return applydataid
     */
    public String getApplydataid() {
        return applydataid;
    }

    /**
    * 设置-支付流水号
    * @paramType java.lang.String
    * @param applydataid - 支付流水号
     */
    public void setApplydataid(String applydataid) {
        this.applydataid = applydataid;
    }

    /**
    * 获取-待付款流水号
    * @return settlementno
     */
    public Long getSettlementno() {
        return settlementno;
    }

    /**
    * 设置-待付款流水号
    * @paramType java.lang.Long
    * @param settlementno - 待付款流水号
     */
    public void setSettlementno(Long settlementno) {
        this.settlementno = settlementno;
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
    * 获取-待付款批次号
    * @return payableseq
     */
    public Long getPayableseq() {
        return payableseq;
    }

    /**
    * 设置-待付款批次号
    * @paramType java.lang.Long
    * @param payableseq - 待付款批次号
     */
    public void setPayableseq(Long payableseq) {
        this.payableseq = payableseq;
    }

    /**
    * 获取-小汇总号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-小汇总号
    * @paramType java.lang.String
    * @param summaryno - 小汇总号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
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
    * 获取-11保单 12红字待付款
    * @return businesstype
     */
    public String getBusinesstype() {
        return businesstype;
    }

    /**
    * 设置-11保单 12红字待付款
    * @paramType java.lang.String
    * @param businesstype - 11保单 12红字待付款
     */
    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    /**
    * 获取-来源流水号
    * @return fatherno
     */
    public Long getFatherno() {
        return fatherno;
    }

    /**
    * 设置-来源流水号
    * @paramType java.lang.Long
    * @param fatherno - 来源流水号
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
    * 获取-财务机构代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-财务机构代码
    * @paramType java.lang.String
    * @param unitcode - 财务机构代码
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
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
    * 获取-本次支付金额（记账币种）
    * @return handledamount
     */
    public BigDecimal getHandledamount() {
        return handledamount;
    }

    /**
    * 设置-本次支付金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param handledamount - 本次支付金额（记账币种）
     */
    public void setHandledamount(BigDecimal handledamount) {
        this.handledamount = handledamount;
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
    * 获取-本次支付金额（保单币种）
    * @return handledbaseamount
     */
    public BigDecimal getHandledbaseamount() {
        return handledbaseamount;
    }

    /**
    * 设置-本次支付金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param handledbaseamount - 本次支付金额（保单币种）
     */
    public void setHandledbaseamount(BigDecimal handledbaseamount) {
        this.handledbaseamount = handledbaseamount;
    }

    /**
    * 获取-金额（保单币种）
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param baseamount - 金额（保单币种）
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    /**
    * 获取-已处理金额（保单币种）
    * @return baseusedamount
     */
    public BigDecimal getBaseusedamount() {
        return baseusedamount;
    }

    /**
    * 设置-已处理金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param baseusedamount - 已处理金额（保单币种）
     */
    public void setBaseusedamount(BigDecimal baseusedamount) {
        this.baseusedamount = baseusedamount;
    }

    /**
    * 获取-客户代码
    * @return customercode
     */
    public String getCustomercode() {
        return customercode;
    }

    /**
    * 设置-客户代码
    * @paramType java.lang.String
    * @param customercode - 客户代码
     */
    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    /**
    * 获取-客户名称
    * @return customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
    * 设置-客户名称
    * @paramType java.lang.String
    * @param customername - 客户名称
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
    * 获取-客户名称（英文）
    * @return customernameen
     */
    public String getCustomernameen() {
        return customernameen;
    }

    /**
    * 设置-客户名称（英文）
    * @paramType java.lang.String
    * @param customernameen - 客户名称（英文）
     */
    public void setCustomernameen(String customernameen) {
        this.customernameen = customernameen;
    }

    /**
    * 获取-客户组
    * @return customerpartyno
     */
    public String getCustomerpartyno() {
        return customerpartyno;
    }

    /**
    * 设置-客户组
    * @paramType java.lang.String
    * @param customerpartyno - 客户组
     */
    public void setCustomerpartyno(String customerpartyno) {
        this.customerpartyno = customerpartyno;
    }

    /**
    * 获取-核销状态
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-核销状态
    * @paramType java.lang.String
    * @param opstatus - 核销状态
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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
    * 获取-操作员代码
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员代码
    * @paramType java.lang.String
    * @param opcode - 操作员代码
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-最后操作日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作日期
    * @paramType java.util.Date
    * @param lastopdate - 最后操作日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-业务部门代码
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-业务部门代码
    * @paramType java.lang.String
    * @param departmentcode - 业务部门代码
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-业务部门
    * @return departmentname
     */
    public String getDepartmentname() {
        return departmentname;
    }

    /**
    * 设置-业务部门
    * @paramType java.lang.String
    * @param departmentname - 业务部门
     */
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    /**
    * 获取-代理点代码
    * @return agentcode
     */
    public String getAgentcode() {
        return agentcode;
    }

    /**
    * 设置-代理点代码
    * @paramType java.lang.String
    * @param agentcode - 代理点代码
     */
    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    /**
    * 获取-摘要
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-摘要
    * @paramType java.lang.String
    * @param description - 摘要
     */
    public void setDescription(String description) {
        this.description = description;
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
    * 获取-风险类别
    * @return risktype
     */
    public String getRisktype() {
        return risktype;
    }

    /**
    * 设置-风险类别
    * @paramType java.lang.String
    * @param risktype - 风险类别
     */
    public void setRisktype(String risktype) {
        this.risktype = risktype;
    }

    /**
    * 获取-客户账户代码
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户账户代码
    * @paramType java.lang.String
    * @param custaccountno - 客户账户代码
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    /**
    * 获取-客户开户行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-客户开户行名称
    * @paramType java.lang.String
    * @param bankname - 客户开户行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-客户开户行代码
    * @return custbankno
     */
    public String getCustbankno() {
        return custbankno;
    }

    /**
    * 设置-客户开户行代码
    * @paramType java.lang.String
    * @param custbankno - 客户开户行代码
     */
    public void setCustbankno(String custbankno) {
        this.custbankno = custbankno;
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
    * 获取-储金返还序号
    * @return returnno
     */
    public String getReturnno() {
        return returnno;
    }

    /**
    * 设置-储金返还序号
    * @paramType java.lang.String
    * @param returnno - 储金返还序号
     */
    public void setReturnno(String returnno) {
        this.returnno = returnno;
    }

    /**
    * 获取-取消日期
    * @return canceldate
     */
    public Date getCanceldate() {
        return canceldate;
    }

    /**
    * 设置-取消日期
    * @paramType java.util.Date
    * @param canceldate - 取消日期
     */
    public void setCanceldate(Date canceldate) {
        this.canceldate = canceldate;
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
    * 获取-取消标志
    * @return cancelflag
     */
    public String getCancelflag() {
        return cancelflag;
    }

    /**
    * 设置-取消标志
    * @paramType java.lang.String
    * @param cancelflag - 取消标志
     */
    public void setCancelflag(String cancelflag) {
        this.cancelflag = cancelflag;
    }

    /**
    * 获取-待付款大类
    * @return paytype
     */
    public String getPaytype() {
        return paytype;
    }

    /**
    * 设置-待付款大类
    * @paramType java.lang.String
    * @param paytype - 待付款大类
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
    * 获取-保单业务性质
    * @return businessattr
     */
    public String getBusinessattr() {
        return businessattr;
    }

    /**
    * 设置-保单业务性质
    * @paramType java.lang.String
    * @param businessattr - 保单业务性质
     */
    public void setBusinessattr(String businessattr) {
        this.businessattr = businessattr;
    }

    /**
    * 获取-序号
    * @return serialno
     */
    public String getSerialno() {
        return serialno;
    }

    /**
    * 设置-序号
    * @paramType java.lang.String
    * @param serialno - 序号
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    /**
    * 获取-业务唯一主键
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务唯一主键
    * @paramType java.lang.String
    * @param custseq - 业务唯一主键
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-批次号
    * @return inpaymentbatchno
     */
    public String getInpaymentbatchno() {
        return inpaymentbatchno;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param inpaymentbatchno - 批次号
     */
    public void setInpaymentbatchno(String inpaymentbatchno) {
        this.inpaymentbatchno = inpaymentbatchno;
    }

    /**
    * 获取-审核状态
    * @return checkstatus
     */
    public String getCheckstatus() {
        return checkstatus;
    }

    /**
    * 设置-审核状态
    * @paramType java.lang.String
    * @param checkstatus - 审核状态
     */
    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus;
    }

    /**
    * 获取-审核字段
    * @return checkcode
     */
    public String getCheckcode() {
        return checkcode;
    }

    /**
    * 设置-审核字段
    * @paramType java.lang.String
    * @param checkcode - 审核字段
     */
    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    /**
    * 获取-审核日期
    * @return checkdate
     */
    public Date getCheckdate() {
        return checkdate;
    }

    /**
    * 设置-审核日期
    * @paramType java.util.Date
    * @param checkdate - 审核日期
     */
    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    /**
    * 获取-审核意见
    * @return checkcontent
     */
    public String getCheckcontent() {
        return checkcontent;
    }

    /**
    * 设置-审核意见
    * @paramType java.lang.String
    * @param checkcontent - 审核意见
     */
    public void setCheckcontent(String checkcontent) {
        this.checkcontent = checkcontent;
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
    * 获取-批次结算单号
    * @return batchsummaryno
     */
    public String getBatchsummaryno() {
        return batchsummaryno;
    }

    /**
    * 设置-批次结算单号
    * @paramType java.lang.String
    * @param batchsummaryno - 批次结算单号
     */
    public void setBatchsummaryno(String batchsummaryno) {
        this.batchsummaryno = batchsummaryno;
    }

    /**
    * 获取-批次总金额
    * @return batchamount
     */
    public BigDecimal getBatchamount() {
        return batchamount;
    }

    /**
    * 设置-批次总金额
    * @paramType java.math.BigDecimal
    * @param batchamount - 批次总金额
     */
    public void setBatchamount(BigDecimal batchamount) {
        this.batchamount = batchamount;
    }

    /**
    * 获取-保批单欠收金额
    * @return baseleftamount
     */
    public BigDecimal getBaseleftamount() {
        return baseleftamount;
    }

    /**
    * 设置-保批单欠收金额
    * @paramType java.math.BigDecimal
    * @param baseleftamount - 保批单欠收金额
     */
    public void setBaseleftamount(BigDecimal baseleftamount) {
        this.baseleftamount = baseleftamount;
    }

    /**
    * 获取-实际手续费支付币种
    * @return actualcurrencycode
     */
    public String getActualcurrencycode() {
        return actualcurrencycode;
    }

    /**
    * 设置-实际手续费支付币种
    * @paramType java.lang.String
    * @param actualcurrencycode - 实际手续费支付币种
     */
    public void setActualcurrencycode(String actualcurrencycode) {
        this.actualcurrencycode = actualcurrencycode;
    }

    /**
    * 获取-手续费实际支付币种针对原币种的兑换汇率
    * @return actualexchangerate
     */
    public Long getActualexchangerate() {
        return actualexchangerate;
    }

    /**
    * 设置-手续费实际支付币种针对原币种的兑换汇率
    * @paramType java.lang.Long
    * @param actualexchangerate - 手续费实际支付币种针对原币种的兑换汇率
     */
    public void setActualexchangerate(Long actualexchangerate) {
        this.actualexchangerate = actualexchangerate;
    }

    /**
    * 获取-再保页面用，合同号
    * @return contractcode
     */
    public String getContractcode() {
        return contractcode;
    }

    /**
    * 设置-再保页面用，合同号
    * @paramType java.lang.String
    * @param contractcode - 再保页面用，合同号
     */
    public void setContractcode(String contractcode) {
        this.contractcode = contractcode;
    }

    /**
    * 获取-授权状态
    * @return authorizedstate
     */
    public String getAuthorizedstate() {
        return authorizedstate;
    }

    /**
    * 设置-授权状态
    * @paramType java.lang.String
    * @param authorizedstate - 授权状态
     */
    public void setAuthorizedstate(String authorizedstate) {
        this.authorizedstate = authorizedstate;
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
    * 获取-是否上传
    * @return ifupload
     */
    public String getIfupload() {
        return ifupload;
    }

    /**
    * 设置-是否上传
    * @paramType java.lang.String
    * @param ifupload - 是否上传
     */
    public void setIfupload(String ifupload) {
        this.ifupload = ifupload;
    }

    /**
    * 获取-保单发票表主键
    * @return seqinvply
     */
    public Long getSeqinvply() {
        return seqinvply;
    }

    /**
    * 设置-保单发票表主键
    * @paramType java.lang.Long
    * @param seqinvply - 保单发票表主键
     */
    public void setSeqinvply(Long seqinvply) {
        this.seqinvply = seqinvply;
    }

    /**
    * 获取-手续费支付号
    * @return paycode
     */
    public String getPaycode() {
        return paycode;
    }

    /**
    * 设置-手续费支付号
    * @paramType java.lang.String
    * @param paycode - 手续费支付号
     */
    public void setPaycode(String paycode) {
        this.paycode = paycode;
    }

    /**
    * 获取-保单起保时间
    * @return startdate
     */
    public String getStartdate() {
        return startdate;
    }

    /**
    * 设置-保单起保时间
    * @paramType java.lang.String
    * @param startdate - 保单起保时间
     */
    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    /**
    * 获取-业务类型
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param certitype - 业务类型
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
    }

    /**
    * 获取-应付比例金额
    * @return proportionamount
     */
    public BigDecimal getProportionamount() {
        return proportionamount;
    }

    /**
    * 设置-应付比例金额
    * @paramType java.math.BigDecimal
    * @param proportionamount - 应付比例金额
     */
    public void setProportionamount(BigDecimal proportionamount) {
        this.proportionamount = proportionamount;
    }

    /**
    * 获取-客户代理银行名称
    * @return custagentbankname
     */
    public String getCustagentbankname() {
        return custagentbankname;
    }

    /**
    * 设置-客户代理银行名称
    * @paramType java.lang.String
    * @param custagentbankname - 客户代理银行名称
     */
    public void setCustagentbankname(String custagentbankname) {
        this.custagentbankname = custagentbankname;
    }

    /**
    * 获取-客户代理银行地址
    * @return custagentbankaddr
     */
    public String getCustagentbankaddr() {
        return custagentbankaddr;
    }

    /**
    * 设置-客户代理银行地址
    * @paramType java.lang.String
    * @param custagentbankaddr - 客户代理银行地址
     */
    public void setCustagentbankaddr(String custagentbankaddr) {
        this.custagentbankaddr = custagentbankaddr;
    }

    /**
    * 获取-客户在代理银行的帐号
    * @return custagentaccountno
     */
    public String getCustagentaccountno() {
        return custagentaccountno;
    }

    /**
    * 设置-客户在代理银行的帐号
    * @paramType java.lang.String
    * @param custagentaccountno - 客户在代理银行的帐号
     */
    public void setCustagentaccountno(String custagentaccountno) {
        this.custagentaccountno = custagentaccountno;
    }

    /**
    * 获取-客户地址
    * @return custaddress
     */
    public String getCustaddress() {
        return custaddress;
    }

    /**
    * 设置-客户地址
    * @paramType java.lang.String
    * @param custaddress - 客户地址
     */
    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress;
    }

    /**
    * 获取-客户常驻国家名称
    * @return custcountryname
     */
    public String getCustcountryname() {
        return custcountryname;
    }

    /**
    * 设置-客户常驻国家名称
    * @paramType java.lang.String
    * @param custcountryname - 客户常驻国家名称
     */
    public void setCustcountryname(String custcountryname) {
        this.custcountryname = custcountryname;
    }

    /**
    * 获取-客户常驻国家代码
    * @return custcountrycode
     */
    public String getCustcountrycode() {
        return custcountrycode;
    }

    /**
    * 设置-客户常驻国家代码
    * @paramType java.lang.String
    * @param custcountrycode - 客户常驻国家代码
     */
    public void setCustcountrycode(String custcountrycode) {
        this.custcountrycode = custcountrycode;
    }

    /**
    * 获取-支付方式
    * @return paymentmethod
     */
    public String getPaymentmethod() {
        return paymentmethod;
    }

    /**
    * 设置-支付方式
    * @paramType java.lang.String
    * @param paymentmethod - 支付方式
     */
    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
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
    * 获取-进项税额（保单币种）
    * @return basetaxesamount
     */
    public BigDecimal getBasetaxesamount() {
        return basetaxesamount;
    }

    /**
    * 设置-进项税额（保单币种）
    * @paramType java.math.BigDecimal
    * @param basetaxesamount - 进项税额（保单币种）
     */
    public void setBasetaxesamount(BigDecimal basetaxesamount) {
        this.basetaxesamount = basetaxesamount;
    }

    /**
    * 获取-客户约定结算币种
    * @return exchangecurrencycode
     */
    public String getExchangecurrencycode() {
        return exchangecurrencycode;
    }

    /**
    * 设置-客户约定结算币种
    * @paramType java.lang.String
    * @param exchangecurrencycode - 客户约定结算币种
     */
    public void setExchangecurrencycode(String exchangecurrencycode) {
        this.exchangecurrencycode = exchangecurrencycode;
    }

    /**
    * 获取-客户约定结算金额
    * @return exchangeamount
     */
    public String getExchangeamount() {
        return exchangeamount;
    }

    /**
    * 设置-客户约定结算金额
    * @paramType java.lang.String
    * @param exchangeamount - 客户约定结算金额
     */
    public void setExchangeamount(String exchangeamount) {
        this.exchangeamount = exchangeamount;
    }

    /**
    * 获取-共保序号
    * @return coinsurno
     */
    public String getCoinsurno() {
        return coinsurno;
    }

    /**
    * 设置-共保序号
    * @paramType java.lang.String
    * @param coinsurno - 共保序号
     */
    public void setCoinsurno(String coinsurno) {
        this.coinsurno = coinsurno;
    }

    /**
    * 获取-共保标识
    * @return hascoins
     */
    public String getHascoins() {
        return hascoins;
    }

    /**
    * 设置-共保标识
    * @paramType java.lang.String
    * @param hascoins - 共保标识
     */
    public void setHascoins(String hascoins) {
        this.hascoins = hascoins;
    }

    /**
    * 获取-报案号
    * @return reportcaseno
     */
    public String getReportcaseno() {
        return reportcaseno;
    }

    /**
    * 设置-报案号
    * @paramType java.lang.String
    * @param reportcaseno - 报案号
     */
    public void setReportcaseno(String reportcaseno) {
        this.reportcaseno = reportcaseno;
    }

    /**
    * 获取-帐单序号
    * @return totalserialno
     */
    public String getTotalserialno() {
        return totalserialno;
    }

    /**
    * 设置-帐单序号
    * @paramType java.lang.String
    * @param totalserialno - 帐单序号
     */
    public void setTotalserialno(String totalserialno) {
        this.totalserialno = totalserialno;
    }

    /**
    * 获取-客户账户名称
    * @return custaccountname
     */
    public String getCustaccountname() {
        return custaccountname;
    }

    /**
    * 设置-客户账户名称
    * @paramType java.lang.String
    * @param custaccountname - 客户账户名称
     */
    public void setCustaccountname(String custaccountname) {
        this.custaccountname = custaccountname;
    }

    /**
    * 获取-保费结算单唯一键
    * @return seqhandover
     */
    public Long getSeqhandover() {
        return seqhandover;
    }

    /**
    * 设置-保费结算单唯一键
    * @paramType java.lang.Long
    * @param seqhandover - 保费结算单唯一键
     */
    public void setSeqhandover(Long seqhandover) {
        this.seqhandover = seqhandover;
    }

    /**
    * 获取-是否做子险拆分 0 不拆分 1拆分
    * @return issplitted
     */
    public Byte getIssplitted() {
        return issplitted;
    }

    /**
    * 设置-是否做子险拆分 0 不拆分 1拆分
    * @paramType java.lang.Byte
    * @param issplitted - 是否做子险拆分 0 不拆分 1拆分
     */
    public void setIssplitted(Byte issplitted) {
        this.issplitted = issplitted;
    }
}