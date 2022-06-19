package com.xiaocai.demo.mybatis.datascope.web.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 待付款实体 退保、退储、储金返还和赔案等挂为待付款时，在本表插入一条记录。不明到款不在本表记录 收款放其他应付款
 *
 * @author
 * @date
 */
public class PayableMoney implements java.io.Serializable {

    private Long payableno; // 待付款流水号
    private Long payableseq; // 待付款批次号
    private Long fatherno; // 来源流水号
    private String returnno; // 储金返还序号

    private String summaryno; // 小汇总号
    private String policyno; // 保单号
    private String endorseno; // 批单号
    private String claimno; // 赔案号
    private String custseq; //账单号唯一流水号
    private String billno; // 账单号
    private String offsetno; // 冲销号 为红冲数据，所红冲原记录的唯一流水号


    private String datasource; // 数据来源
    private String certitype;// 业务类型，大类
    private String datatype; // 数据类型
    private String businessattr;//业务性质
    /*
     * PAYTYPE是对应DATATYPE的大类。对于付款： 1=赔款，DATATYPE包含{ "302", "304", "308", "311",
     * "313", "315", "317", "319", "321" }；2=退保，DATATYPE包含{ "101", "103", "107"
     * }；3=退储{ "201", "204", "206" }，DATATYPE包含；4=储金返还，DATATYPE包含{ "208"
     * }；5=其他应付款，DATATYPE包含{ "407" }；6=手续费，DATATYPE包含{ "502", "504", "508",
     * "512", "514" }
     */
    private String paytype; // 待付款大类

    private String subcompany; // 分公司代码
    private String unitcode; // 财务机构代码
    private String departmentcode; // 业务部门代码

    private String currencycode; // 币种（记账币种）
    private BigDecimal amount; // 金额（记账币种）
    private BigDecimal usedamount; // 已处理金额（记账币种）

    private String basecurrencycode; // 币种（保单币种）
    private BigDecimal baseamount; // 金额（保单币种）
    private BigDecimal baseusedamount; // 已处理金额（保单币种）
    private BigDecimal invoiceamount;//发票开票金额


    private String classeskind;// 险类
    private String classescode; // 业务险种
    private String businesschannel;// 展业渠道
    private String contracttype;// 合同类型
    private String insuranceterm;// 承保期限
    private String risktype; // 风险类别
    private String domestic; // 境内/境外标识 0：境外 1：境内 可以为空
    private String porttype; // 进口/出口标识 0：进口 1: 出口 可以为空

    private String opstatus;// 核销状态

    private String opcode; // 操作员代码
    //@Temporal(TemporalType.DATE)
    private Date opdate; // 挂账日期
    //@Temporal(TemporalType.TIMESTAMP)
    private Date lastopdate; // 最后操作时间

    //@Temporal(TemporalType.TIMESTAMP)
    private Date timestamp; // 记录生成时间

   // @Version
    private Long hibernateversion; // 版本号

    //@Temporal(TemporalType.DATE)
    private Date canceldate; // 取消日期
    private String cancelflag; // 取消标志


    private String insuredcode; // 被保险人代码
    private String insuredname; // 被保险人名称（中文）
    private String insurednameen; // 收付交易数据的被保险人名称（英文）
    private String insuredpartyno; // 保单上的被保险人partyno

    private String applicantcode; // 保单上的投保人代码
    private String applicantnamecn; // 收付交易数据的投保人中文名称
    private String applicantnameen; // 收付交易数据的投保人英文名称
    private String applicantionpartyno; // 保单上的投保人partyno
    private String appisjapan; // 投保人是否为日系客户 0：非日系 1：日系

    private String agentcode; // 代理点代码
    private String agentnamecn; // 代理点/经纪公司名称（中文）
    private String agentnameen; // 代理点/经纪公司名称（英文）
    private String agentpartyno; // 代理点/经纪公司partyno

    private String customercode; // 客户代码
    private String customername; // 客户名称
    private String customernameen; // 收付交易数据的客户名称（英文）
    private String customerpartyno; // 客户partyno
    private String custisjapan; // 收付交易数据的客户是否为日系客户
    private String custaccountarea;//客户所在地区 

    //支付信息相关字段--start
    private String inpaymentdepartment;//指定收付款机构
    private String paymentmethod;//指定支付方式
    private String custaccountname;// 客户账户名称
    private String custaccountnameen;// 客户账户名称(英文)
    private String custaccountno; // 客户银行帐号
    private String bankname; // 开户行银行名称
    private String custbankno; // 客户开户行代码(cnaps号联行号)
    private String banktype;//客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
    private String bankcity;//客户开户行所在市
    private String bankprovince;//客户开户行所在省份
    private String ispaypublic;//银行指令类型
    private String cardflag;//卡折标志
    private String certificatetype;//证件类型
    private String certificateno;//证件号码
    private String custemail;//客户电子邮箱
    private String mobilenumber;//客户手机号
    private String fastflag;// 加急标志。"0 - 普通 1 - 加急"
    private String smsflag;//短信通知标志
    private String custagentbankname;//客户代理银行名称
    private String custagentbankaddr;//客户代理银行地址
    private String custagentaccountno;//客户在代理银行的帐号
    private String custaddress;//客户地址
    private String custcountryname;//客户常驻国家名称
    private String custcountrycode;//客户常驻国家代码

    //add by sj 2020-01-17 批改序号
    private String serialno;
   /* //add by sj 2020-04-12 银行直联号名称
    private String custbankname;*/

    //支付信息相关字段--end

    private String description;// 摘要
    //private String chargedescription;// 理赔费用类型描述
    private String inpaymentbatchno;

    private String billcode;//对接资金账单号
    private String ifbillback;//是否退票0：未退票 1：已退票

    //===========2012-5-24 chy 财务标识审核 START
    private String checkstatus;//审核状态
    private String checkcode;//审核人员
    //@Temporal(TemporalType.DATE)
    private Date checkdate;//审核日期
    private String checkcontent;//审核意见


    private String transactorcode;//经办人 by lbw 2011-10-17
    private String ifeffect;
    private Date plandate; // 计划缴费日期

    //johnhsr 2010-11-23  中介管理平台收付系统改造所加字段
    private String confirmsequenceno;//投保确认码
    private String ifupload;//上传标志 0 不上传 1上传

    //private String isactivityflag;
    private String exstatus;
    private String modifydesc;
    //-----------------------start------------//

    private Long sourceno;
    private String waitpayno;//期初迁移的数据在老系统的待付款流水号

    private String vehkind;

    //private String settlementno;//小币种手工结算单号
    //private String defraymode;//财务支付方式，0  柜面领款，1  主动支付
    /*//cpic使用字段
    private String banks;
    private String payeecity;
    private String payeeprovince;
    private String ifpublic;*/
    /*
    private Long sourceno;
    private String waitpayno;//期初迁移的数据在老系统的待付款流水号
	private String settlementno;//小币种手工结算单号
	
    private String ifcoinsurance;
	private String ifinside;
	private String mainclaimno;
	
	
   
    private String pamentflag;//财务支付类型，0  其他账户，1  划盘账户 2 银企直连账户
    */
    //特殊处理--start
    public String getIfsupplement() {
        return "0";//固定值为0，非补录
    }

    public BigDecimal getInvoiceamount() {
        return invoiceamount;
    }

    public void setInvoiceamount(BigDecimal invoiceamount) {
        this.invoiceamount = invoiceamount;
    }

    public String getInpaymentflag() {
        return "1";//固定值为1， 付款数据
    }

    public String getBanks() {
        return this.banktype;
    }

    public String getPayeecity() {
        return this.bankcity;
    }

    public String getPayeeprovince() {
        return this.bankprovince;
    }

    public String getIfpublic() {
        return this.ispaypublic;
    }
    //特殊处理--end

    public String getCertitype() {
        return certitype;
    }

    public void setCertitype(String certitype) {
        this.certitype = certitype;
    }

    public String getInpaymentdepartment() {
        return inpaymentdepartment;
    }

    public void setInpaymentdepartment(String inpaymentdepartment) {
        this.inpaymentdepartment = inpaymentdepartment;
    }

    public String getIfbillback() {
        return ifbillback;
    }

    public void setIfbillback(String ifbillback) {
        this.ifbillback = ifbillback;
    }

    public String getBanktype() {
        return banktype;
    }

    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    public String getBankcity() {
        return bankcity;
    }

    public void setBankcity(String bankcity) {
        this.bankcity = bankcity;
    }

    public String getBankprovince() {
        return bankprovince;
    }

    public void setBankprovince(String bankprovince) {
        this.bankprovince = bankprovince;
    }

    public String getIspaypublic() {
        return ispaypublic;
    }

    public void setIspaypublic(String ispaypublic) {
        this.ispaypublic = ispaypublic;
    }

    public String getBillcode() {
        return billcode;
    }

    public void setBillcode(String billcode) {
        this.billcode = billcode;
    }

    public String getCustseq() {
        return custseq;
    }

    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    public String getCustaccountname() {
        return custaccountname;
    }

    public void setCustaccountname(String custaccountname) {
        this.custaccountname = custaccountname;
    }

    public String getCustaccountnameen() {
        return custaccountnameen;
    }

    public void setCustaccountnameen(String custaccountnameen) {
        this.custaccountnameen = custaccountnameen;
    }

	/*public String getChargedescription() {
        return chargedescription;
	}

	public void setChargedescription(String chargedescription) {
		this.chargedescription = chargedescription;
	}*/

    public String getBusinesschannel() {
        return businesschannel;
    }

    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
    }

    public String getContracttype() {
        return contracttype;
    }

    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }

    public String getInsuranceterm() {
        return insuranceterm;
    }

    public void setInsuranceterm(String insuranceterm) {
        this.insuranceterm = insuranceterm;
    }

    public String getClasseskind() {
        return classeskind;
    }

    public void setClasseskind(String classeskind) {
        this.classeskind = classeskind;
    }

    /**
     * @return the insuredcode
     */
    public String getInsuredcode() {
        return insuredcode;
    }

    /**
     * @param insuredcode the insuredcode to set
     */
    public void setInsuredcode(String insuredcode) {
        this.insuredcode = insuredcode;
    }

    /**
     * @return the insuredname
     */
    public String getInsuredname() {
        return insuredname;
    }

    /**
     * @param insuredname the insuredname to set
     */
    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    /**
     * @return the insurednameen
     */
    public String getInsurednameen() {
        return insurednameen;
    }

    /**
     * @param insurednameen the insurednameen to set
     */
    public void setInsurednameen(String insurednameen) {
        this.insurednameen = insurednameen;
    }

    /**
     * @return the insuredpartyno
     */
    public String getInsuredpartyno() {
        return insuredpartyno;
    }

    /**
     * @param insuredpartyno the insuredpartyno to set
     */
    public void setInsuredpartyno(String insuredpartyno) {
        this.insuredpartyno = insuredpartyno;
    }

    /**
     * @return the applicantcode
     */
    public String getApplicantcode() {
        return applicantcode;
    }

    /**
     * @param applicantcode the applicantcode to set
     */
    public void setApplicantcode(String applicantcode) {
        this.applicantcode = applicantcode;
    }

    /**
     * @return the applicantnamecn
     */
    public String getApplicantnamecn() {
        return applicantnamecn;
    }

    /**
     * @param applicantnamecn the applicantnamecn to set
     */
    public void setApplicantnamecn(String applicantnamecn) {
        this.applicantnamecn = applicantnamecn;
    }

    /**
     * @return the applicantnameen
     */
    public String getApplicantnameen() {
        return applicantnameen;
    }

    /**
     * @param applicantnameen the applicantnameen to set
     */
    public void setApplicantnameen(String applicantnameen) {
        this.applicantnameen = applicantnameen;
    }

    /**
     * @return the applicantionpartyno
     */
    public String getApplicantionpartyno() {
        return applicantionpartyno;
    }

    /**
     * @param applicantionpartyno the applicantionpartyno to set
     */
    public void setApplicantionpartyno(String applicantionpartyno) {
        this.applicantionpartyno = applicantionpartyno;
    }

    /**
     * @return the appisjapan
     */
    public String getAppisjapan() {
        return appisjapan;
    }

    /**
     * @param appisjapan the appisjapan to set
     */
    public void setAppisjapan(String appisjapan) {
        this.appisjapan = appisjapan;
    }

    /**
     * @return the domestic
     */
    public String getDomestic() {
        return domestic;
    }

    /**
     * @param domestic the domestic to set
     */
    public void setDomestic(String domestic) {
        this.domestic = domestic;
    }

    /**
     * @return the porttype
     */
    public String getPorttype() {
        return porttype;
    }

    /**
     * @param porttype the porttype to set
     */
    public void setPorttype(String porttype) {
        this.porttype = porttype;
    }

    /**
     * @return the billno
     */
    public String getBillno() {
        return billno;
    }

    /**
     * @param billno the billno to set
     */
    public void setBillno(String billno) {
        this.billno = billno;
    }

    /**
     * @return the offsetno
     */
    public String getOffsetno() {
        return offsetno;
    }

    /**
     * @param offsetno the offsetno to set
     */
    public void setOffsetno(String offsetno) {
        this.offsetno = offsetno;
    }

    /**
     * @return the plandate
     */
    public Date getPlandate() {
        return plandate;
    }

    /**
     * @param plandate the plandate to set
     */
    public void setPlandate(Date plandate) {
        this.plandate = plandate;
    }

    /**
     * @return the customernameen
     */
    public String getCustomernameen() {
        return customernameen;
    }

    /**
     * @param customernameen the customernameen to set
     */
    public void setCustomernameen(String customernameen) {
        this.customernameen = customernameen;
    }

    public String getCustomerpartyno() {
        return customerpartyno;
    }

    public void setCustomerpartyno(String customerpartyno) {
        this.customerpartyno = customerpartyno;
    }

    /**
     * @return the custisjapan
     */
    public String getCustisjapan() {
        return custisjapan;
    }

    /**
     * @param custisjapan the custisjapan to set
     */
    public void setCustisjapan(String custisjapan) {
        this.custisjapan = custisjapan;
    }

    /**
     * @return the agentnamecn
     */
    public String getAgentnamecn() {
        return agentnamecn;
    }

    /**
     * @param agentnamecn the agentnamecn to set
     */
    public void setAgentnamecn(String agentnamecn) {
        this.agentnamecn = agentnamecn;
    }

    /**
     * @return the agentnameen
     */
    public String getAgentnameen() {
        return agentnameen;
    }

    /**
     * @param agentnameen the agentnameen to set
     */
    public void setAgentnameen(String agentnameen) {
        this.agentnameen = agentnameen;
    }

    /**
     * @return the agentpartyno
     */
    public String getAgentpartyno() {
        return agentpartyno;
    }

    /**
     * @param agentpartyno the agentpartyno to set
     */
    public void setAgentpartyno(String agentpartyno) {
        this.agentpartyno = agentpartyno;
    }

    public String getInpaymentbatchno() {
        return inpaymentbatchno;
    }

    public void setInpaymentbatchno(String inpaymentbatchno) {
        this.inpaymentbatchno = inpaymentbatchno;
    }

    public String getBusinessattr() {
        return businessattr;
    }

    public void setBusinessattr(String businessattr) {
        this.businessattr = businessattr;
    }

    public String getIfeffect() {
        return ifeffect;
    }

    public void setIfeffect(String ifeffect) {
        this.ifeffect = ifeffect;
    }

    public PayableMoney() {
    }

    public PayableMoney(String agentcode, BigDecimal amount,
                        BigDecimal baseamount, String basecurrencycode,
                        BigDecimal baseusedamount, Date canceldate, String cancelflag,
                        String currencycode, String customercode, String customername,
                        String datasource, String datatype, String departmentcode,
                        String description, Long fatherno, Date lastopdate, String opcode,
                        Date opdate, String opstatus, String subcompany, Date timestamp,
                        String unitcode, Long payableno, Long payableseq,
                        BigDecimal usedamount) {
        super();
        this.agentcode = agentcode;
        this.amount = amount;
        this.baseamount = baseamount;
        this.basecurrencycode = basecurrencycode;
        this.baseusedamount = baseusedamount;
        this.canceldate = canceldate;
        this.cancelflag = cancelflag;
        this.currencycode = currencycode;
        this.customercode = customercode;
        this.customername = customername;
        this.datasource = datasource;
        this.datatype = datatype;
        this.departmentcode = departmentcode;
        this.description = description;
        this.fatherno = fatherno;
        this.lastopdate = lastopdate;
        this.opcode = opcode;
        this.opdate = opdate;
        this.opstatus = opstatus;
        this.subcompany = subcompany;
        this.timestamp = timestamp;
        this.unitcode = unitcode;
        this.payableno = payableno;
        this.payableseq = payableseq;
        this.usedamount = usedamount;
    }

    public Long getPayableno() {
        return this.payableno;
    }

    public void setPayableno(Long payableno) {
        this.payableno = payableno;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Long getPayableseq() {
        return this.payableseq;
    }

    public void setPayableseq(Long payableseq) {
        this.payableseq = payableseq;
    }

    public String getSummaryno() {
        return summaryno;
    }

    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    public String getDatatype() {
        return this.datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public Long getFatherno() {
        return this.fatherno;
    }

    public void setFatherno(Long fatherno) {
        this.fatherno = fatherno;
    }

    public String getSubcompany() {
        return this.subcompany;
    }

    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    public String getUnitcode() {
        return this.unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    public String getCurrencycode() {
        return this.currencycode;
    }

    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getUsedamount() {
        return this.usedamount;
    }

    public void setUsedamount(BigDecimal usedamount) {
        this.usedamount = usedamount;
    }

    public String getBasecurrencycode() {
        return this.basecurrencycode;
    }

    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
    }

    public BigDecimal getBaseamount() {
        return this.baseamount;
    }

    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    public BigDecimal getBaseusedamount() {
        return this.baseusedamount;
    }

    public void setBaseusedamount(BigDecimal baseusedamount) {
        this.baseusedamount = baseusedamount;
    }

    public String getCustomercode() {
        return this.customercode;
    }

    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    public String getCustomername() {
        return this.customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getOpstatus() {
        return this.opstatus;
    }

    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    public Date getOpdate() {
        return this.opdate;
    }

    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    public String getOpcode() {
        return this.opcode;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public Date getLastopdate() {
        return this.lastopdate;
    }

    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    public String getDepartmentcode() {
        return this.departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    public String getAgentcode() {
        return this.agentcode;
    }

    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPolicyno() {
        return this.policyno;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    public String getEndorseno() {
        return this.endorseno;
    }

    public void setEndorseno(String endorseno) {
        this.endorseno = endorseno;
    }

    public String getClassescode() {
        return this.classescode;
    }

    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    public String getRisktype() {
        return this.risktype;
    }

    public void setRisktype(String risktype) {
        this.risktype = risktype;
    }

    public String getCustaccountno() {
        return this.custaccountno;
    }

    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getCustbankno() {
        return custbankno;
    }

    public void setCustbankno(String custbankno) {
        this.custbankno = custbankno;
    }

    public String getClaimno() {
        return this.claimno;
    }

    public void setClaimno(String claimno) {
        this.claimno = claimno;
    }

    public String getReturnno() {
        return returnno;
    }

    public void setReturnno(String returnno) {
        this.returnno = returnno;
    }

    public Date getCanceldate() {
        return this.canceldate;
    }

    public void setCanceldate(Date canceldate) {
        this.canceldate = canceldate;
    }

    public String getDatasource() {
        return this.datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getCancelflag() {
        return this.cancelflag;
    }

    public void setCancelflag(String cancelflag) {
        this.cancelflag = cancelflag;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public Long getHibernateversion() {
        return hibernateversion;
    }

    public void setHibernateversion(Long hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    public String getConfirmsequenceno() {
        return confirmsequenceno;
    }

    public void setConfirmsequenceno(String confirmsequenceno) {
        this.confirmsequenceno = confirmsequenceno;
    }

    public String getIfupload() {
        return ifupload;
    }

    public void setIfupload(String ifupload) {
        this.ifupload = ifupload;
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus;
    }

    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getCheckcontent() {
        return checkcontent;
    }

    public void setCheckcontent(String checkcontent) {
        this.checkcontent = checkcontent;
    }

	/*public String getIsactivityflag() {
        return isactivityflag;
	}

	public void setIsactivityflag(String isactivityflag) {
		this.isactivityflag = isactivityflag;
	}*/


    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getModifydesc() {
        return modifydesc;
    }

    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    public String getExstatus() {
        return exstatus;
    }

    public void setExstatus(String exstatus) {
        this.exstatus = exstatus;
    }

    public Long getSourceno() {
        return sourceno;
    }

    public void setSourceno(Long sourceno) {
        this.sourceno = sourceno;
    }

	/*public String getDefraymode() {
        return defraymode;
	}

	public void setDefraymode(String defraymode) {
		this.defraymode = defraymode;
	}*/

    public String getWaitpayno() {
        return waitpayno;
    }

    public void setWaitpayno(String waitpayno) {
        this.waitpayno = waitpayno;
    }

	/*public String getIfcoinsurance() {
        return ifcoinsurance;
	}

	public void setIfcoinsurance(String ifcoinsurance) {
		this.ifcoinsurance = ifcoinsurance;
	}

	public String getIfinside() {
		return ifinside;
	}

	public void setIfinside(String ifinside) {
		this.ifinside = ifinside;
	}

	public String getMainclaimno() {
		return mainclaimno;
	}

	public void setMainclaimno(String mainclaimno) {
		this.mainclaimno = mainclaimno;
	}*/

	/*public String getSettlementno() {
        return settlementno;
	}

	public void setSettlementno(String settlementno) {
		this.settlementno = settlementno;
	}*/
    /*public String getBanks() {
        return banks;
	}

	public void setBanks(String banks) {
		this.banks = banks;
	}

	public String getPayeecity() {
		return payeecity;
	}

	public void setPayeecity(String payeecity) {
		this.payeecity = payeecity;
	}

	public String getPayeeprovince() {
		return payeeprovince;
	}

	public void setPayeeprovince(String payeeprovince) {
		this.payeeprovince = payeeprovince;
	}

	public String getIfpublic() {
		return ifpublic;
	}

	public void setIfpublic(String ifpublic) {
		this.ifpublic = ifpublic;
	}*/

	/*public String getPamentflag() {
		return pamentflag;
	}

	public void setPamentflag(String pamentflag) {
		this.pamentflag = pamentflag;
	}*/


    public String getTransactorcode() {
        return transactorcode;
    }

    public void setTransactorcode(String transactorcode) {
        this.transactorcode = transactorcode;
    }

    public String getCardflag() {
        return cardflag;
    }

    public void setCardflag(String cardflag) {
        this.cardflag = cardflag;
    }

    public String getCertificatetype() {
        return certificatetype;
    }

    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype;
    }

    public String getCertificateno() {
        return certificateno;
    }

    public void setCertificateno(String certificateno) {
        this.certificateno = certificateno;
    }

    public String getCustemail() {
        return custemail;
    }

    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getFastflag() {
        return fastflag;
    }

    public void setFastflag(String fastflag) {
        this.fastflag = fastflag;
    }

    public String getSmsflag() {
        return smsflag;
    }

    public void setSmsflag(String smsflag) {
        this.smsflag = smsflag;
    }

    public String getCustagentbankname() {
        return custagentbankname;
    }

    public void setCustagentbankname(String custagentbankname) {
        this.custagentbankname = custagentbankname;
    }

    public String getCustagentbankaddr() {
        return custagentbankaddr;
    }

    public void setCustagentbankaddr(String custagentbankaddr) {
        this.custagentbankaddr = custagentbankaddr;
    }

    public String getCustagentaccountno() {
        return custagentaccountno;
    }

    public void setCustagentaccountno(String custagentaccountno) {
        this.custagentaccountno = custagentaccountno;
    }

    public String getCustaddress() {
        return custaddress;
    }

    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress;
    }

    public String getCustcountryname() {
        return custcountryname;
    }

    public void setCustcountryname(String custcountryname) {
        this.custcountryname = custcountryname;
    }

    public String getCustcountrycode() {
        return custcountrycode;
    }

    public void setCustcountrycode(String custcountrycode) {
        this.custcountrycode = custcountrycode;
    }

    public String getCustaccountarea() {
        return custaccountarea;
    }

    public void setCustaccountarea(String custaccountarea) {
        this.custaccountarea = custaccountarea;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    /*public String getCustbankname() {
        return custbankname;
    }

    public void setCustbankname(String custbankname) {
        this.custbankname = custbankname;
    }*/

    public String getVehkind() {
        return vehkind;
    }

    public void setVehkind(String vehkind) {
        this.vehkind = vehkind;
    }
}
