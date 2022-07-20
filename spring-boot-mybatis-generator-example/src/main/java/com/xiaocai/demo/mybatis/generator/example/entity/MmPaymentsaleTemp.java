package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_paymentsale_temp
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPaymentsaleTemp {
    /**
     * 主键
     */
    private Long id;

    /**
     * 保费结算单唯一键
     */
    private String seqhandover;

    /**
     * 支付流水号
     */
    private String applydataid;

    /**
     * 生成的付款流水号或预收流水号
     */
    private Long newno;

    /**
     * 待付款流水号
     */
    private BigDecimal settlementno;

    /**
     * 付款页面合并支付时，本字段记录合并出来的记录的_hashcode
     */
    private String mergeid;

    /**
     * 交易平台id
     */
    private String platformid;

    /**
     * 出纳帐户（柜面唯一号）
     */
    private BigDecimal mmaccountid;

    /**
     * 出纳帐户（代码）
     */
    private String accountno;

    /**
     * 出纳帐户（名称）
     */
    private String accountname;

    /**
     * 出纳帐户（现银属性）
     */
    private String accountaccattribute;

    /**
     * 待付记录财务机构代码
     */
    private String fromunitcode;

    /**
     * 数据类型
     */
    private String datatype;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 分公司代码(对应QuerySettlementResultVO中的subcompany)
     */
    private String tosubcompany;

    /**
     * 出纳帐户财务机构代码
     */
    private String unitcode;

    /**
     * 储金返还序号
     */
    private String returnno;

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
     * 小汇总号
     */
    private String summaryno;

    /**
     * 币种（记账币种）
     */
    private String currencycode;

    /**
     * 金额（记账币种）
     */
    private BigDecimal amount;

    /**
     * 已用金额（记账币种）
     */
    private BigDecimal usedamount;

    /**
     * 本次支付金额（记账币种）
     */
    private BigDecimal handledamount;

    /**
     * 币种（保单币种）
     */
    private String basecurrencycode;

    /**
     * 金额（保单币种）
     */
    private BigDecimal baseamount;

    /**
     * 本次支付金额（保单币种）
     */
    private BigDecimal baseusedamount;

    /**
     * 本次支付金额（保单币种）
     */
    private BigDecimal handledbaseamount;

    /**
     * 费率（由记帐币种/保单币种金额计算，精度6位）
     */
    private BigDecimal rate;

    /**
     * 货币兑换币种（账户支付币种）
     */
    private String accountcurrencycode;

    /**
     * 货币兑换金额（账户支付金额）
     */
    private BigDecimal accountamount;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 客户名称
     */
    private String customernameen;

    /**
     * 客户组
     */
    private String customerpartyno;

    /**
     * 业务部门代码
     */
    private String departmentcode;

    /**
     * 业务部门代码
     */
    private String departmentname;

    /**
     * 代理点
     */
    private String agentcode;

    /**
     * 银行代码
     */
    private String bankcode;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 风险类别
     */
    private String risktype;

    /**
     * 投保确认码
     */
    private String confirmsequenceno;

    /**
     * 发票号码
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
     * 网银流水号
     */
    private String ebankingsequenceno;

    /**
     * 收款单位名称
     */
    private String receiveunit;

    /**
     * 凭证号
     */
    private String reference4;

    /**
     * 上传标志 0 不上传 1上传
     */
    private String ifupload;

    /**
     * 添加保单发票对照表主键
     */
    private BigDecimal seqinvply;

    /**
     * 增加项目段
     */
    private String projectcode;

    /**
     * 客户账户名称
     */
    private String custaccountname;

    /**
     * 客户银行帐号
     */
    private String custaccountno;

    /**
     * 开户行银行名称
     */
    private String bankname;

    /**
     * 客户开户行代码
     */
    private String custbankno;

    /**
     * 客户开户行直联号
     */
    private String banktype;

    /**
     * 客户开户行所在市
     */
    private String bankcity;

    /**
     * 客户开户行所在省份
     */
    private String bankprovince;

    /**
     * 银行指令类型
     */
    private String ispaypublic;

    /**
     * 卡折标志
     */
    private String cardflag;

    /**
     * 证件类型
     */
    private String certificatetype;

    /**
     * 证件号码
     */
    private String certificateno;

    /**
     * 客户电子邮箱
     */
    private String custemail;

    /**
     * 客户手机号
     */
    private String mobilenumber;

    /**
     * 联行号
     */
    private String unitbankno;

    /**
     * 加急标志
     */
    private String fastflag;

    /**
     * 短信通知标志
     */
    private String smsflag;

    /**
     * 支付方式
     */
    private String paymode;

    /**
     * 单据号码
     */
    private String billno;

    /**
     * 票据类型
     */
    private String checktype;

    /**
     * 票据号码
     */
    private String checkno;

    /**
     * 票据日期
     */
    private Date checkdate;

    /**
     * 付款原因
     */
    private String payreason;

    /**
     * 摘要
     */
    private String description;

    /**
     * 备注
     */
    private String paycomment;

    /**
     * 收款批次号
     */
    private String inpaymentbatchno;

    /**
     * 计划缴费日期
     */
    private Date plandate;

    /**
     * 应收应付标志
     */
    private String inpaymentflag;

    /**
     * 大类
     */
    private String certitype;

    /**
     * 支付方式
     */
    private String paymentmethod;

    /**
     * 特定汇总规则id
     */
    private String paymentruleid;

    /**
     * 顾客账户区域
     */
    private String custaccountarea;

    /**
     * 支付类型
     */
    private String paytype;

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
    * 获取-保费结算单唯一键
    * @return seqhandover
     */
    public String getSeqhandover() {
        return seqhandover;
    }

    /**
    * 设置-保费结算单唯一键
    * @paramType java.lang.String
    * @param seqhandover - 保费结算单唯一键
     */
    public void setSeqhandover(String seqhandover) {
        this.seqhandover = seqhandover;
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
    * 获取-生成的付款流水号或预收流水号
    * @return newno
     */
    public Long getNewno() {
        return newno;
    }

    /**
    * 设置-生成的付款流水号或预收流水号
    * @paramType java.lang.Long
    * @param newno - 生成的付款流水号或预收流水号
     */
    public void setNewno(Long newno) {
        this.newno = newno;
    }

    /**
    * 获取-待付款流水号
    * @return settlementno
     */
    public BigDecimal getSettlementno() {
        return settlementno;
    }

    /**
    * 设置-待付款流水号
    * @paramType java.math.BigDecimal
    * @param settlementno - 待付款流水号
     */
    public void setSettlementno(BigDecimal settlementno) {
        this.settlementno = settlementno;
    }

    /**
    * 获取-付款页面合并支付时，本字段记录合并出来的记录的_hashcode
    * @return mergeid
     */
    public String getMergeid() {
        return mergeid;
    }

    /**
    * 设置-付款页面合并支付时，本字段记录合并出来的记录的_hashcode
    * @paramType java.lang.String
    * @param mergeid - 付款页面合并支付时，本字段记录合并出来的记录的_hashcode
     */
    public void setMergeid(String mergeid) {
        this.mergeid = mergeid;
    }

    /**
    * 获取-交易平台id
    * @return platformid
     */
    public String getPlatformid() {
        return platformid;
    }

    /**
    * 设置-交易平台id
    * @paramType java.lang.String
    * @param platformid - 交易平台id
     */
    public void setPlatformid(String platformid) {
        this.platformid = platformid;
    }

    /**
    * 获取-出纳帐户（柜面唯一号）
    * @return mmaccountid
     */
    public BigDecimal getMmaccountid() {
        return mmaccountid;
    }

    /**
    * 设置-出纳帐户（柜面唯一号）
    * @paramType java.math.BigDecimal
    * @param mmaccountid - 出纳帐户（柜面唯一号）
     */
    public void setMmaccountid(BigDecimal mmaccountid) {
        this.mmaccountid = mmaccountid;
    }

    /**
    * 获取-出纳帐户（代码）
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-出纳帐户（代码）
    * @paramType java.lang.String
    * @param accountno - 出纳帐户（代码）
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-出纳帐户（名称）
    * @return accountname
     */
    public String getAccountname() {
        return accountname;
    }

    /**
    * 设置-出纳帐户（名称）
    * @paramType java.lang.String
    * @param accountname - 出纳帐户（名称）
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
    * 获取-出纳帐户（现银属性）
    * @return accountaccattribute
     */
    public String getAccountaccattribute() {
        return accountaccattribute;
    }

    /**
    * 设置-出纳帐户（现银属性）
    * @paramType java.lang.String
    * @param accountaccattribute - 出纳帐户（现银属性）
     */
    public void setAccountaccattribute(String accountaccattribute) {
        this.accountaccattribute = accountaccattribute;
    }

    /**
    * 获取-待付记录财务机构代码
    * @return fromunitcode
     */
    public String getFromunitcode() {
        return fromunitcode;
    }

    /**
    * 设置-待付记录财务机构代码
    * @paramType java.lang.String
    * @param fromunitcode - 待付记录财务机构代码
     */
    public void setFromunitcode(String fromunitcode) {
        this.fromunitcode = fromunitcode;
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
    * 获取-分公司代码(对应QuerySettlementResultVO中的subcompany)
    * @return tosubcompany
     */
    public String getTosubcompany() {
        return tosubcompany;
    }

    /**
    * 设置-分公司代码(对应QuerySettlementResultVO中的subcompany)
    * @paramType java.lang.String
    * @param tosubcompany - 分公司代码(对应QuerySettlementResultVO中的subcompany)
     */
    public void setTosubcompany(String tosubcompany) {
        this.tosubcompany = tosubcompany;
    }

    /**
    * 获取-出纳帐户财务机构代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-出纳帐户财务机构代码
    * @paramType java.lang.String
    * @param unitcode - 出纳帐户财务机构代码
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
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
    * 获取-已用金额（记账币种）
    * @return usedamount
     */
    public BigDecimal getUsedamount() {
        return usedamount;
    }

    /**
    * 设置-已用金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param usedamount - 已用金额（记账币种）
     */
    public void setUsedamount(BigDecimal usedamount) {
        this.usedamount = usedamount;
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
    * 获取-本次支付金额（保单币种）
    * @return baseusedamount
     */
    public BigDecimal getBaseusedamount() {
        return baseusedamount;
    }

    /**
    * 设置-本次支付金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param baseusedamount - 本次支付金额（保单币种）
     */
    public void setBaseusedamount(BigDecimal baseusedamount) {
        this.baseusedamount = baseusedamount;
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
    * 获取-费率（由记帐币种/保单币种金额计算，精度6位）
    * @return rate
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
    * 设置-费率（由记帐币种/保单币种金额计算，精度6位）
    * @paramType java.math.BigDecimal
    * @param rate - 费率（由记帐币种/保单币种金额计算，精度6位）
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
    * 获取-货币兑换币种（账户支付币种）
    * @return accountcurrencycode
     */
    public String getAccountcurrencycode() {
        return accountcurrencycode;
    }

    /**
    * 设置-货币兑换币种（账户支付币种）
    * @paramType java.lang.String
    * @param accountcurrencycode - 货币兑换币种（账户支付币种）
     */
    public void setAccountcurrencycode(String accountcurrencycode) {
        this.accountcurrencycode = accountcurrencycode;
    }

    /**
    * 获取-货币兑换金额（账户支付金额）
    * @return accountamount
     */
    public BigDecimal getAccountamount() {
        return accountamount;
    }

    /**
    * 设置-货币兑换金额（账户支付金额）
    * @paramType java.math.BigDecimal
    * @param accountamount - 货币兑换金额（账户支付金额）
     */
    public void setAccountamount(BigDecimal accountamount) {
        this.accountamount = accountamount;
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
    * 获取-客户名称
    * @return customernameen
     */
    public String getCustomernameen() {
        return customernameen;
    }

    /**
    * 设置-客户名称
    * @paramType java.lang.String
    * @param customernameen - 客户名称
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
    * 获取-业务部门代码
    * @return departmentname
     */
    public String getDepartmentname() {
        return departmentname;
    }

    /**
    * 设置-业务部门代码
    * @paramType java.lang.String
    * @param departmentname - 业务部门代码
     */
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    /**
    * 获取-代理点
    * @return agentcode
     */
    public String getAgentcode() {
        return agentcode;
    }

    /**
    * 设置-代理点
    * @paramType java.lang.String
    * @param agentcode - 代理点
     */
    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    /**
    * 获取-银行代码
    * @return bankcode
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
    * 设置-银行代码
    * @paramType java.lang.String
    * @param bankcode - 银行代码
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
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
    * 获取-发票号码
    * @return invoicecode
     */
    public String getInvoicecode() {
        return invoicecode;
    }

    /**
    * 设置-发票号码
    * @paramType java.lang.String
    * @param invoicecode - 发票号码
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
    * 获取-网银流水号
    * @return ebankingsequenceno
     */
    public String getEbankingsequenceno() {
        return ebankingsequenceno;
    }

    /**
    * 设置-网银流水号
    * @paramType java.lang.String
    * @param ebankingsequenceno - 网银流水号
     */
    public void setEbankingsequenceno(String ebankingsequenceno) {
        this.ebankingsequenceno = ebankingsequenceno;
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
    * 获取-凭证号
    * @return reference4
     */
    public String getReference4() {
        return reference4;
    }

    /**
    * 设置-凭证号
    * @paramType java.lang.String
    * @param reference4 - 凭证号
     */
    public void setReference4(String reference4) {
        this.reference4 = reference4;
    }

    /**
    * 获取-上传标志 0 不上传 1上传
    * @return ifupload
     */
    public String getIfupload() {
        return ifupload;
    }

    /**
    * 设置-上传标志 0 不上传 1上传
    * @paramType java.lang.String
    * @param ifupload - 上传标志 0 不上传 1上传
     */
    public void setIfupload(String ifupload) {
        this.ifupload = ifupload;
    }

    /**
    * 获取-添加保单发票对照表主键
    * @return seqinvply
     */
    public BigDecimal getSeqinvply() {
        return seqinvply;
    }

    /**
    * 设置-添加保单发票对照表主键
    * @paramType java.math.BigDecimal
    * @param seqinvply - 添加保单发票对照表主键
     */
    public void setSeqinvply(BigDecimal seqinvply) {
        this.seqinvply = seqinvply;
    }

    /**
    * 获取-增加项目段
    * @return projectcode
     */
    public String getProjectcode() {
        return projectcode;
    }

    /**
    * 设置-增加项目段
    * @paramType java.lang.String
    * @param projectcode - 增加项目段
     */
    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode;
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
    * 获取-客户银行帐号
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户银行帐号
    * @paramType java.lang.String
    * @param custaccountno - 客户银行帐号
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    /**
    * 获取-开户行银行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-开户行银行名称
    * @paramType java.lang.String
    * @param bankname - 开户行银行名称
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
    * 获取-客户开户行直联号
    * @return banktype
     */
    public String getBanktype() {
        return banktype;
    }

    /**
    * 设置-客户开户行直联号
    * @paramType java.lang.String
    * @param banktype - 客户开户行直联号
     */
    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    /**
    * 获取-客户开户行所在市
    * @return bankcity
     */
    public String getBankcity() {
        return bankcity;
    }

    /**
    * 设置-客户开户行所在市
    * @paramType java.lang.String
    * @param bankcity - 客户开户行所在市
     */
    public void setBankcity(String bankcity) {
        this.bankcity = bankcity;
    }

    /**
    * 获取-客户开户行所在省份
    * @return bankprovince
     */
    public String getBankprovince() {
        return bankprovince;
    }

    /**
    * 设置-客户开户行所在省份
    * @paramType java.lang.String
    * @param bankprovince - 客户开户行所在省份
     */
    public void setBankprovince(String bankprovince) {
        this.bankprovince = bankprovince;
    }

    /**
    * 获取-银行指令类型
    * @return ispaypublic
     */
    public String getIspaypublic() {
        return ispaypublic;
    }

    /**
    * 设置-银行指令类型
    * @paramType java.lang.String
    * @param ispaypublic - 银行指令类型
     */
    public void setIspaypublic(String ispaypublic) {
        this.ispaypublic = ispaypublic;
    }

    /**
    * 获取-卡折标志
    * @return cardflag
     */
    public String getCardflag() {
        return cardflag;
    }

    /**
    * 设置-卡折标志
    * @paramType java.lang.String
    * @param cardflag - 卡折标志
     */
    public void setCardflag(String cardflag) {
        this.cardflag = cardflag;
    }

    /**
    * 获取-证件类型
    * @return certificatetype
     */
    public String getCertificatetype() {
        return certificatetype;
    }

    /**
    * 设置-证件类型
    * @paramType java.lang.String
    * @param certificatetype - 证件类型
     */
    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype;
    }

    /**
    * 获取-证件号码
    * @return certificateno
     */
    public String getCertificateno() {
        return certificateno;
    }

    /**
    * 设置-证件号码
    * @paramType java.lang.String
    * @param certificateno - 证件号码
     */
    public void setCertificateno(String certificateno) {
        this.certificateno = certificateno;
    }

    /**
    * 获取-客户电子邮箱
    * @return custemail
     */
    public String getCustemail() {
        return custemail;
    }

    /**
    * 设置-客户电子邮箱
    * @paramType java.lang.String
    * @param custemail - 客户电子邮箱
     */
    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

    /**
    * 获取-客户手机号
    * @return mobilenumber
     */
    public String getMobilenumber() {
        return mobilenumber;
    }

    /**
    * 设置-客户手机号
    * @paramType java.lang.String
    * @param mobilenumber - 客户手机号
     */
    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    /**
    * 获取-联行号
    * @return unitbankno
     */
    public String getUnitbankno() {
        return unitbankno;
    }

    /**
    * 设置-联行号
    * @paramType java.lang.String
    * @param unitbankno - 联行号
     */
    public void setUnitbankno(String unitbankno) {
        this.unitbankno = unitbankno;
    }

    /**
    * 获取-加急标志
    * @return fastflag
     */
    public String getFastflag() {
        return fastflag;
    }

    /**
    * 设置-加急标志
    * @paramType java.lang.String
    * @param fastflag - 加急标志
     */
    public void setFastflag(String fastflag) {
        this.fastflag = fastflag;
    }

    /**
    * 获取-短信通知标志
    * @return smsflag
     */
    public String getSmsflag() {
        return smsflag;
    }

    /**
    * 设置-短信通知标志
    * @paramType java.lang.String
    * @param smsflag - 短信通知标志
     */
    public void setSmsflag(String smsflag) {
        this.smsflag = smsflag;
    }

    /**
    * 获取-支付方式
    * @return paymode
     */
    public String getPaymode() {
        return paymode;
    }

    /**
    * 设置-支付方式
    * @paramType java.lang.String
    * @param paymode - 支付方式
     */
    public void setPaymode(String paymode) {
        this.paymode = paymode;
    }

    /**
    * 获取-单据号码
    * @return billno
     */
    public String getBillno() {
        return billno;
    }

    /**
    * 设置-单据号码
    * @paramType java.lang.String
    * @param billno - 单据号码
     */
    public void setBillno(String billno) {
        this.billno = billno;
    }

    /**
    * 获取-票据类型
    * @return checktype
     */
    public String getChecktype() {
        return checktype;
    }

    /**
    * 设置-票据类型
    * @paramType java.lang.String
    * @param checktype - 票据类型
     */
    public void setChecktype(String checktype) {
        this.checktype = checktype;
    }

    /**
    * 获取-票据号码
    * @return checkno
     */
    public String getCheckno() {
        return checkno;
    }

    /**
    * 设置-票据号码
    * @paramType java.lang.String
    * @param checkno - 票据号码
     */
    public void setCheckno(String checkno) {
        this.checkno = checkno;
    }

    /**
    * 获取-票据日期
    * @return checkdate
     */
    public Date getCheckdate() {
        return checkdate;
    }

    /**
    * 设置-票据日期
    * @paramType java.util.Date
    * @param checkdate - 票据日期
     */
    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    /**
    * 获取-付款原因
    * @return payreason
     */
    public String getPayreason() {
        return payreason;
    }

    /**
    * 设置-付款原因
    * @paramType java.lang.String
    * @param payreason - 付款原因
     */
    public void setPayreason(String payreason) {
        this.payreason = payreason;
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
    * 获取-备注
    * @return paycomment
     */
    public String getPaycomment() {
        return paycomment;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param paycomment - 备注
     */
    public void setPaycomment(String paycomment) {
        this.paycomment = paycomment;
    }

    /**
    * 获取-收款批次号
    * @return inpaymentbatchno
     */
    public String getInpaymentbatchno() {
        return inpaymentbatchno;
    }

    /**
    * 设置-收款批次号
    * @paramType java.lang.String
    * @param inpaymentbatchno - 收款批次号
     */
    public void setInpaymentbatchno(String inpaymentbatchno) {
        this.inpaymentbatchno = inpaymentbatchno;
    }

    /**
    * 获取-计划缴费日期
    * @return plandate
     */
    public Date getPlandate() {
        return plandate;
    }

    /**
    * 设置-计划缴费日期
    * @paramType java.util.Date
    * @param plandate - 计划缴费日期
     */
    public void setPlandate(Date plandate) {
        this.plandate = plandate;
    }

    /**
    * 获取-应收应付标志
    * @return inpaymentflag
     */
    public String getInpaymentflag() {
        return inpaymentflag;
    }

    /**
    * 设置-应收应付标志
    * @paramType java.lang.String
    * @param inpaymentflag - 应收应付标志
     */
    public void setInpaymentflag(String inpaymentflag) {
        this.inpaymentflag = inpaymentflag;
    }

    /**
    * 获取-大类
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-大类
    * @paramType java.lang.String
    * @param certitype - 大类
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
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
    * 获取-特定汇总规则id
    * @return paymentruleid
     */
    public String getPaymentruleid() {
        return paymentruleid;
    }

    /**
    * 设置-特定汇总规则id
    * @paramType java.lang.String
    * @param paymentruleid - 特定汇总规则id
     */
    public void setPaymentruleid(String paymentruleid) {
        this.paymentruleid = paymentruleid;
    }

    /**
    * 获取-顾客账户区域
    * @return custaccountarea
     */
    public String getCustaccountarea() {
        return custaccountarea;
    }

    /**
    * 设置-顾客账户区域
    * @paramType java.lang.String
    * @param custaccountarea - 顾客账户区域
     */
    public void setCustaccountarea(String custaccountarea) {
        this.custaccountarea = custaccountarea;
    }

    /**
    * 获取-支付类型
    * @return paytype
     */
    public String getPaytype() {
        return paytype;
    }

    /**
    * 设置-支付类型
    * @paramType java.lang.String
    * @param paytype - 支付类型
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }
}