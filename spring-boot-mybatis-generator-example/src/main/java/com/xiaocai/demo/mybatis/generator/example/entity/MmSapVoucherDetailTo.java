package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_sap_voucher_detail_to
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmSapVoucherDetailTo {
    /**
     * 收付报送流水号（唯一号）
     */
    private Long sequenceno;

    /**
     * 机构代码（分公司代码）
     */
    private String branchcode;

    /**
     * 收付会计年度
     */
    private String accountyear;

    /**
     * 收付会计月
     */
    private String accountmonth;

    /**
     * 收付记账日期（YYYMMDD）
     */
    private String postdate;

    /**
     * 收付凭证号
     */
    private String voucherno;

    /**
     * 某张凭证下的行号
     */
    private String voucherlineno;

    /**
     * 内部往来分公司代码
     */
    private String crossbranchcode;

    /**
     * 会计分录科目代码
     */
    private String accounttitlecode;

    /**
     * 文本摘要，凭证摘要信息。
     */
    private String abstract;

    /**
     * 票据参考号，主要用于银行对账。
     */
    private String checkno;

    /**
     * BP中记录的操作人员代码
     */
    private String opcode;

    /**
     * 币种代码
     */
    private String currencycode;

    /**
     * 借方金额，正负数都允许。
     */
    private BigDecimal dramount;

    /**
     * 贷方金额，正负数都允许。
     */
    private BigDecimal cramount;

    /**
     * 成本中心
     */
    private String departmentcode;

    /**
     * 险类
     */
    private String classeskind;

    /**
     * 险种
     */
    private String classescode;

    /**
     * 0：进口 、1: 出口
     */
    private String porttype;

    /**
     * 保单或批单的保险起期。
     */
    private Date startdate;

    /**
     * 保单或批单的保险止期。
     */
    private Date enddate;

    /**
     * 合同类型代码
     */
    private String contracttype;

    /**
     * 销售渠道代码
     */
    private String businesschannel;

    /**
     * 境内外标识 0：境外 、1：境内
     */
    private String isdomestic;

    /**
     * 投保人代码（客户代码）
     */
    private String applicationcode;

    /**
     * 投保人中文名
     */
    private String applicationname;

    /**
     * 投保人英文名
     */
    private String applicationnameen;

    /**
     * 投保人日系标识 0：非日系 1：日系
     */
    private String appisjapan;

    /**
     * 投保人partyno
     */
    private String applicationpartyno;

    /**
     * 结算对象
     */
    private String customercode;

    /**
     * 结算对象中文名
     */
    private String customername;

    /**
     * 结算对象英文名
     */
    private String customernameen;

    /**
     * 结算对象是否日系0：非日系 1：日系
     */
    private String cstisjapan;

    /**
     * 结算对象partyno
     */
    private String customerpartyno;

    /**
     * 再保险人/共保险人
     */
    private String insurercode;

    /**
     * 再保险人/共保险人中文名
     */
    private String insurename;

    /**
     * 再保险人/共保险人英文名
     */
    private String insurenameen;

    /**
     * 再保险人/共保险人partyno
     */
    private String insurenpartyno;

    /**
     * 代理/经纪人代码
     */
    private String agentcode;

    /**
     * 代理/经纪人中文名称
     */
    private String agentname;

    /**
     * 代理/经纪人英文名称
     */
    private String agentnameen;

    /**
     * 代理/经纪人partyno
     */
    private String agentpartyno;

    /**
     * 账单号
     */
    private String billno;

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
     * 时间戳
     */
    private Date timestamp;

    /**
     * 报送状态 00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
     */
    private String statusflag;

    /**
     * SAP更新
     */
    private String zsapd;

    /**
     * SAP更新
     */
    private String zsapt;

    /**
     * SAP凭证号
     */
    private String sapdocumentno;

    /**
     * SAP凭证年度
     */
    private String sapyear;

    /**
     * SAP凭证会计期间
     */
    private String sapmonth;

    /**
     * SAP凭证记账日期
     */
    private String sappostingdate;

    /**
     * 业务时间
     */
    private String businessdate;

    /**
     * 凭证类型
     */
    private String vouchertype;

    /**
     * 计划日期
     */
    private String plandate;

    /**
     * 承保期限
     */
    private String insuranceterm;

    /**
     * 分期缴费期次
     */
    private String installmentstimes;

    /**
     * 客户银行帐号
     */
    private String custbankno;

    /**
     * 客户结算号
     */
    private String custsettlementno;

    /**
     * 报送日期
     */
    private String datum;

    /**
     * 报送时间
     */
    private String uzeit;

    /**
     * SAP处理状态
     */
    private String intFlag;

    /**
     * 接口数据被SAP系统最后处理日期(SAP需要回写Core中间表)
     */
    private String cpudt;

    /**
     * 接口数据被SAP系统最后处理时间(SAP需要回写Core中间表)
     */
    private String cputm;

    /**
     * SAP凭证号(SAP需要回写Core中间表)
     */
    private String belnr;

    /**
     * SAP凭证年度(SAP需要回写Core中间表)
     */
    private String gjahr;

    /**
     * SAP凭证会计期间(SAP需要回写Core中间表)
     */
    private String monat;

    /**
     * SAP凭证记账日期(SAP需要回写Core中间表)
     */
    private String budat;

    /**
     * 报送批次号，同一凭证每次报送一个批次号
     */
    private BigDecimal batchid;

    /**
     * 日结单号
     */
    private String dailyauditno;

    /**
     * 业务流水号
     */
    private String businessno;

    /**
     * 日结单明细的结算对象partycode
     */
    private String partycode;

    /**
     * 是否已打印  0：否  1 是
     */
    private String isprinted;

    /**
    * 获取-收付报送流水号（唯一号）
    * @return sequenceno
     */
    public Long getSequenceno() {
        return sequenceno;
    }

    /**
    * 设置-收付报送流水号（唯一号）
    * @paramType java.lang.Long
    * @param sequenceno - 收付报送流水号（唯一号）
     */
    public void setSequenceno(Long sequenceno) {
        this.sequenceno = sequenceno;
    }

    /**
    * 获取-机构代码（分公司代码）
    * @return branchcode
     */
    public String getBranchcode() {
        return branchcode;
    }

    /**
    * 设置-机构代码（分公司代码）
    * @paramType java.lang.String
    * @param branchcode - 机构代码（分公司代码）
     */
    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    /**
    * 获取-收付会计年度
    * @return accountyear
     */
    public String getAccountyear() {
        return accountyear;
    }

    /**
    * 设置-收付会计年度
    * @paramType java.lang.String
    * @param accountyear - 收付会计年度
     */
    public void setAccountyear(String accountyear) {
        this.accountyear = accountyear;
    }

    /**
    * 获取-收付会计月
    * @return accountmonth
     */
    public String getAccountmonth() {
        return accountmonth;
    }

    /**
    * 设置-收付会计月
    * @paramType java.lang.String
    * @param accountmonth - 收付会计月
     */
    public void setAccountmonth(String accountmonth) {
        this.accountmonth = accountmonth;
    }

    /**
    * 获取-收付记账日期（YYYMMDD）
    * @return postdate
     */
    public String getPostdate() {
        return postdate;
    }

    /**
    * 设置-收付记账日期（YYYMMDD）
    * @paramType java.lang.String
    * @param postdate - 收付记账日期（YYYMMDD）
     */
    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    /**
    * 获取-收付凭证号
    * @return voucherno
     */
    public String getVoucherno() {
        return voucherno;
    }

    /**
    * 设置-收付凭证号
    * @paramType java.lang.String
    * @param voucherno - 收付凭证号
     */
    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    /**
    * 获取-某张凭证下的行号
    * @return voucherlineno
     */
    public String getVoucherlineno() {
        return voucherlineno;
    }

    /**
    * 设置-某张凭证下的行号
    * @paramType java.lang.String
    * @param voucherlineno - 某张凭证下的行号
     */
    public void setVoucherlineno(String voucherlineno) {
        this.voucherlineno = voucherlineno;
    }

    /**
    * 获取-内部往来分公司代码
    * @return crossbranchcode
     */
    public String getCrossbranchcode() {
        return crossbranchcode;
    }

    /**
    * 设置-内部往来分公司代码
    * @paramType java.lang.String
    * @param crossbranchcode - 内部往来分公司代码
     */
    public void setCrossbranchcode(String crossbranchcode) {
        this.crossbranchcode = crossbranchcode;
    }

    /**
    * 获取-会计分录科目代码
    * @return accounttitlecode
     */
    public String getAccounttitlecode() {
        return accounttitlecode;
    }

    /**
    * 设置-会计分录科目代码
    * @paramType java.lang.String
    * @param accounttitlecode - 会计分录科目代码
     */
    public void setAccounttitlecode(String accounttitlecode) {
        this.accounttitlecode = accounttitlecode;
    }

    /**
    * 获取-文本摘要，凭证摘要信息。
    * @return abstract
     */
    public String getAbstract() {
        return abstract;
    }

    /**
    * 设置-文本摘要，凭证摘要信息。
    * @paramType java.lang.String
    * @param abstract - 文本摘要，凭证摘要信息。
     */
    public void setAbstract(String abstract) {
        this.abstract = abstract;
    }

    /**
    * 获取-票据参考号，主要用于银行对账。
    * @return checkno
     */
    public String getCheckno() {
        return checkno;
    }

    /**
    * 设置-票据参考号，主要用于银行对账。
    * @paramType java.lang.String
    * @param checkno - 票据参考号，主要用于银行对账。
     */
    public void setCheckno(String checkno) {
        this.checkno = checkno;
    }

    /**
    * 获取-BP中记录的操作人员代码
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-BP中记录的操作人员代码
    * @paramType java.lang.String
    * @param opcode - BP中记录的操作人员代码
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-币种代码
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种代码
    * @paramType java.lang.String
    * @param currencycode - 币种代码
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-借方金额，正负数都允许。
    * @return dramount
     */
    public BigDecimal getDramount() {
        return dramount;
    }

    /**
    * 设置-借方金额，正负数都允许。
    * @paramType java.math.BigDecimal
    * @param dramount - 借方金额，正负数都允许。
     */
    public void setDramount(BigDecimal dramount) {
        this.dramount = dramount;
    }

    /**
    * 获取-贷方金额，正负数都允许。
    * @return cramount
     */
    public BigDecimal getCramount() {
        return cramount;
    }

    /**
    * 设置-贷方金额，正负数都允许。
    * @paramType java.math.BigDecimal
    * @param cramount - 贷方金额，正负数都允许。
     */
    public void setCramount(BigDecimal cramount) {
        this.cramount = cramount;
    }

    /**
    * 获取-成本中心
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-成本中心
    * @paramType java.lang.String
    * @param departmentcode - 成本中心
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-险类
    * @return classeskind
     */
    public String getClasseskind() {
        return classeskind;
    }

    /**
    * 设置-险类
    * @paramType java.lang.String
    * @param classeskind - 险类
     */
    public void setClasseskind(String classeskind) {
        this.classeskind = classeskind;
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
    * 获取-0：进口 、1: 出口
    * @return porttype
     */
    public String getPorttype() {
        return porttype;
    }

    /**
    * 设置-0：进口 、1: 出口
    * @paramType java.lang.String
    * @param porttype - 0：进口 、1: 出口
     */
    public void setPorttype(String porttype) {
        this.porttype = porttype;
    }

    /**
    * 获取-保单或批单的保险起期。
    * @return startdate
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
    * 设置-保单或批单的保险起期。
    * @paramType java.util.Date
    * @param startdate - 保单或批单的保险起期。
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
    * 获取-保单或批单的保险止期。
    * @return enddate
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
    * 设置-保单或批单的保险止期。
    * @paramType java.util.Date
    * @param enddate - 保单或批单的保险止期。
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
    * 获取-合同类型代码
    * @return contracttype
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
    * 设置-合同类型代码
    * @paramType java.lang.String
    * @param contracttype - 合同类型代码
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }

    /**
    * 获取-销售渠道代码
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-销售渠道代码
    * @paramType java.lang.String
    * @param businesschannel - 销售渠道代码
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
    }

    /**
    * 获取-境内外标识 0：境外 、1：境内
    * @return isdomestic
     */
    public String getIsdomestic() {
        return isdomestic;
    }

    /**
    * 设置-境内外标识 0：境外 、1：境内
    * @paramType java.lang.String
    * @param isdomestic - 境内外标识 0：境外 、1：境内
     */
    public void setIsdomestic(String isdomestic) {
        this.isdomestic = isdomestic;
    }

    /**
    * 获取-投保人代码（客户代码）
    * @return applicationcode
     */
    public String getApplicationcode() {
        return applicationcode;
    }

    /**
    * 设置-投保人代码（客户代码）
    * @paramType java.lang.String
    * @param applicationcode - 投保人代码（客户代码）
     */
    public void setApplicationcode(String applicationcode) {
        this.applicationcode = applicationcode;
    }

    /**
    * 获取-投保人中文名
    * @return applicationname
     */
    public String getApplicationname() {
        return applicationname;
    }

    /**
    * 设置-投保人中文名
    * @paramType java.lang.String
    * @param applicationname - 投保人中文名
     */
    public void setApplicationname(String applicationname) {
        this.applicationname = applicationname;
    }

    /**
    * 获取-投保人英文名
    * @return applicationnameen
     */
    public String getApplicationnameen() {
        return applicationnameen;
    }

    /**
    * 设置-投保人英文名
    * @paramType java.lang.String
    * @param applicationnameen - 投保人英文名
     */
    public void setApplicationnameen(String applicationnameen) {
        this.applicationnameen = applicationnameen;
    }

    /**
    * 获取-投保人日系标识 0：非日系 1：日系
    * @return appisjapan
     */
    public String getAppisjapan() {
        return appisjapan;
    }

    /**
    * 设置-投保人日系标识 0：非日系 1：日系
    * @paramType java.lang.String
    * @param appisjapan - 投保人日系标识 0：非日系 1：日系
     */
    public void setAppisjapan(String appisjapan) {
        this.appisjapan = appisjapan;
    }

    /**
    * 获取-投保人partyno
    * @return applicationpartyno
     */
    public String getApplicationpartyno() {
        return applicationpartyno;
    }

    /**
    * 设置-投保人partyno
    * @paramType java.lang.String
    * @param applicationpartyno - 投保人partyno
     */
    public void setApplicationpartyno(String applicationpartyno) {
        this.applicationpartyno = applicationpartyno;
    }

    /**
    * 获取-结算对象
    * @return customercode
     */
    public String getCustomercode() {
        return customercode;
    }

    /**
    * 设置-结算对象
    * @paramType java.lang.String
    * @param customercode - 结算对象
     */
    public void setCustomercode(String customercode) {
        this.customercode = customercode;
    }

    /**
    * 获取-结算对象中文名
    * @return customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
    * 设置-结算对象中文名
    * @paramType java.lang.String
    * @param customername - 结算对象中文名
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
    * 获取-结算对象英文名
    * @return customernameen
     */
    public String getCustomernameen() {
        return customernameen;
    }

    /**
    * 设置-结算对象英文名
    * @paramType java.lang.String
    * @param customernameen - 结算对象英文名
     */
    public void setCustomernameen(String customernameen) {
        this.customernameen = customernameen;
    }

    /**
    * 获取-结算对象是否日系0：非日系 1：日系
    * @return cstisjapan
     */
    public String getCstisjapan() {
        return cstisjapan;
    }

    /**
    * 设置-结算对象是否日系0：非日系 1：日系
    * @paramType java.lang.String
    * @param cstisjapan - 结算对象是否日系0：非日系 1：日系
     */
    public void setCstisjapan(String cstisjapan) {
        this.cstisjapan = cstisjapan;
    }

    /**
    * 获取-结算对象partyno
    * @return customerpartyno
     */
    public String getCustomerpartyno() {
        return customerpartyno;
    }

    /**
    * 设置-结算对象partyno
    * @paramType java.lang.String
    * @param customerpartyno - 结算对象partyno
     */
    public void setCustomerpartyno(String customerpartyno) {
        this.customerpartyno = customerpartyno;
    }

    /**
    * 获取-再保险人/共保险人
    * @return insurercode
     */
    public String getInsurercode() {
        return insurercode;
    }

    /**
    * 设置-再保险人/共保险人
    * @paramType java.lang.String
    * @param insurercode - 再保险人/共保险人
     */
    public void setInsurercode(String insurercode) {
        this.insurercode = insurercode;
    }

    /**
    * 获取-再保险人/共保险人中文名
    * @return insurename
     */
    public String getInsurename() {
        return insurename;
    }

    /**
    * 设置-再保险人/共保险人中文名
    * @paramType java.lang.String
    * @param insurename - 再保险人/共保险人中文名
     */
    public void setInsurename(String insurename) {
        this.insurename = insurename;
    }

    /**
    * 获取-再保险人/共保险人英文名
    * @return insurenameen
     */
    public String getInsurenameen() {
        return insurenameen;
    }

    /**
    * 设置-再保险人/共保险人英文名
    * @paramType java.lang.String
    * @param insurenameen - 再保险人/共保险人英文名
     */
    public void setInsurenameen(String insurenameen) {
        this.insurenameen = insurenameen;
    }

    /**
    * 获取-再保险人/共保险人partyno
    * @return insurenpartyno
     */
    public String getInsurenpartyno() {
        return insurenpartyno;
    }

    /**
    * 设置-再保险人/共保险人partyno
    * @paramType java.lang.String
    * @param insurenpartyno - 再保险人/共保险人partyno
     */
    public void setInsurenpartyno(String insurenpartyno) {
        this.insurenpartyno = insurenpartyno;
    }

    /**
    * 获取-代理/经纪人代码
    * @return agentcode
     */
    public String getAgentcode() {
        return agentcode;
    }

    /**
    * 设置-代理/经纪人代码
    * @paramType java.lang.String
    * @param agentcode - 代理/经纪人代码
     */
    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    /**
    * 获取-代理/经纪人中文名称
    * @return agentname
     */
    public String getAgentname() {
        return agentname;
    }

    /**
    * 设置-代理/经纪人中文名称
    * @paramType java.lang.String
    * @param agentname - 代理/经纪人中文名称
     */
    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    /**
    * 获取-代理/经纪人英文名称
    * @return agentnameen
     */
    public String getAgentnameen() {
        return agentnameen;
    }

    /**
    * 设置-代理/经纪人英文名称
    * @paramType java.lang.String
    * @param agentnameen - 代理/经纪人英文名称
     */
    public void setAgentnameen(String agentnameen) {
        this.agentnameen = agentnameen;
    }

    /**
    * 获取-代理/经纪人partyno
    * @return agentpartyno
     */
    public String getAgentpartyno() {
        return agentpartyno;
    }

    /**
    * 设置-代理/经纪人partyno
    * @paramType java.lang.String
    * @param agentpartyno - 代理/经纪人partyno
     */
    public void setAgentpartyno(String agentpartyno) {
        this.agentpartyno = agentpartyno;
    }

    /**
    * 获取-账单号
    * @return billno
     */
    public String getBillno() {
        return billno;
    }

    /**
    * 设置-账单号
    * @paramType java.lang.String
    * @param billno - 账单号
     */
    public void setBillno(String billno) {
        this.billno = billno;
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
    * 获取-报送状态 00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
    * @return statusflag
     */
    public String getStatusflag() {
        return statusflag;
    }

    /**
    * 设置-报送状态 00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
    * @paramType java.lang.String
    * @param statusflag - 报送状态 00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误
     */
    public void setStatusflag(String statusflag) {
        this.statusflag = statusflag;
    }

    /**
    * 获取-SAP更新
    * @return zsapd
     */
    public String getZsapd() {
        return zsapd;
    }

    /**
    * 设置-SAP更新
    * @paramType java.lang.String
    * @param zsapd - SAP更新
     */
    public void setZsapd(String zsapd) {
        this.zsapd = zsapd;
    }

    /**
    * 获取-SAP更新
    * @return zsapt
     */
    public String getZsapt() {
        return zsapt;
    }

    /**
    * 设置-SAP更新
    * @paramType java.lang.String
    * @param zsapt - SAP更新
     */
    public void setZsapt(String zsapt) {
        this.zsapt = zsapt;
    }

    /**
    * 获取-SAP凭证号
    * @return sapdocumentno
     */
    public String getSapdocumentno() {
        return sapdocumentno;
    }

    /**
    * 设置-SAP凭证号
    * @paramType java.lang.String
    * @param sapdocumentno - SAP凭证号
     */
    public void setSapdocumentno(String sapdocumentno) {
        this.sapdocumentno = sapdocumentno;
    }

    /**
    * 获取-SAP凭证年度
    * @return sapyear
     */
    public String getSapyear() {
        return sapyear;
    }

    /**
    * 设置-SAP凭证年度
    * @paramType java.lang.String
    * @param sapyear - SAP凭证年度
     */
    public void setSapyear(String sapyear) {
        this.sapyear = sapyear;
    }

    /**
    * 获取-SAP凭证会计期间
    * @return sapmonth
     */
    public String getSapmonth() {
        return sapmonth;
    }

    /**
    * 设置-SAP凭证会计期间
    * @paramType java.lang.String
    * @param sapmonth - SAP凭证会计期间
     */
    public void setSapmonth(String sapmonth) {
        this.sapmonth = sapmonth;
    }

    /**
    * 获取-SAP凭证记账日期
    * @return sappostingdate
     */
    public String getSappostingdate() {
        return sappostingdate;
    }

    /**
    * 设置-SAP凭证记账日期
    * @paramType java.lang.String
    * @param sappostingdate - SAP凭证记账日期
     */
    public void setSappostingdate(String sappostingdate) {
        this.sappostingdate = sappostingdate;
    }

    /**
    * 获取-业务时间
    * @return businessdate
     */
    public String getBusinessdate() {
        return businessdate;
    }

    /**
    * 设置-业务时间
    * @paramType java.lang.String
    * @param businessdate - 业务时间
     */
    public void setBusinessdate(String businessdate) {
        this.businessdate = businessdate;
    }

    /**
    * 获取-凭证类型
    * @return vouchertype
     */
    public String getVouchertype() {
        return vouchertype;
    }

    /**
    * 设置-凭证类型
    * @paramType java.lang.String
    * @param vouchertype - 凭证类型
     */
    public void setVouchertype(String vouchertype) {
        this.vouchertype = vouchertype;
    }

    /**
    * 获取-计划日期
    * @return plandate
     */
    public String getPlandate() {
        return plandate;
    }

    /**
    * 设置-计划日期
    * @paramType java.lang.String
    * @param plandate - 计划日期
     */
    public void setPlandate(String plandate) {
        this.plandate = plandate;
    }

    /**
    * 获取-承保期限
    * @return insuranceterm
     */
    public String getInsuranceterm() {
        return insuranceterm;
    }

    /**
    * 设置-承保期限
    * @paramType java.lang.String
    * @param insuranceterm - 承保期限
     */
    public void setInsuranceterm(String insuranceterm) {
        this.insuranceterm = insuranceterm;
    }

    /**
    * 获取-分期缴费期次
    * @return installmentstimes
     */
    public String getInstallmentstimes() {
        return installmentstimes;
    }

    /**
    * 设置-分期缴费期次
    * @paramType java.lang.String
    * @param installmentstimes - 分期缴费期次
     */
    public void setInstallmentstimes(String installmentstimes) {
        this.installmentstimes = installmentstimes;
    }

    /**
    * 获取-客户银行帐号
    * @return custbankno
     */
    public String getCustbankno() {
        return custbankno;
    }

    /**
    * 设置-客户银行帐号
    * @paramType java.lang.String
    * @param custbankno - 客户银行帐号
     */
    public void setCustbankno(String custbankno) {
        this.custbankno = custbankno;
    }

    /**
    * 获取-客户结算号
    * @return custsettlementno
     */
    public String getCustsettlementno() {
        return custsettlementno;
    }

    /**
    * 设置-客户结算号
    * @paramType java.lang.String
    * @param custsettlementno - 客户结算号
     */
    public void setCustsettlementno(String custsettlementno) {
        this.custsettlementno = custsettlementno;
    }

    /**
    * 获取-报送日期
    * @return datum
     */
    public String getDatum() {
        return datum;
    }

    /**
    * 设置-报送日期
    * @paramType java.lang.String
    * @param datum - 报送日期
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
    * 获取-报送时间
    * @return uzeit
     */
    public String getUzeit() {
        return uzeit;
    }

    /**
    * 设置-报送时间
    * @paramType java.lang.String
    * @param uzeit - 报送时间
     */
    public void setUzeit(String uzeit) {
        this.uzeit = uzeit;
    }

    /**
    * 获取-SAP处理状态
    * @return intFlag
     */
    public String getIntFlag() {
        return intFlag;
    }

    /**
    * 设置-SAP处理状态
    * @paramType java.lang.String
    * @param intFlag - SAP处理状态
     */
    public void setIntFlag(String intFlag) {
        this.intFlag = intFlag;
    }

    /**
    * 获取-接口数据被SAP系统最后处理日期(SAP需要回写Core中间表)
    * @return cpudt
     */
    public String getCpudt() {
        return cpudt;
    }

    /**
    * 设置-接口数据被SAP系统最后处理日期(SAP需要回写Core中间表)
    * @paramType java.lang.String
    * @param cpudt - 接口数据被SAP系统最后处理日期(SAP需要回写Core中间表)
     */
    public void setCpudt(String cpudt) {
        this.cpudt = cpudt;
    }

    /**
    * 获取-接口数据被SAP系统最后处理时间(SAP需要回写Core中间表)
    * @return cputm
     */
    public String getCputm() {
        return cputm;
    }

    /**
    * 设置-接口数据被SAP系统最后处理时间(SAP需要回写Core中间表)
    * @paramType java.lang.String
    * @param cputm - 接口数据被SAP系统最后处理时间(SAP需要回写Core中间表)
     */
    public void setCputm(String cputm) {
        this.cputm = cputm;
    }

    /**
    * 获取-SAP凭证号(SAP需要回写Core中间表)
    * @return belnr
     */
    public String getBelnr() {
        return belnr;
    }

    /**
    * 设置-SAP凭证号(SAP需要回写Core中间表)
    * @paramType java.lang.String
    * @param belnr - SAP凭证号(SAP需要回写Core中间表)
     */
    public void setBelnr(String belnr) {
        this.belnr = belnr;
    }

    /**
    * 获取-SAP凭证年度(SAP需要回写Core中间表)
    * @return gjahr
     */
    public String getGjahr() {
        return gjahr;
    }

    /**
    * 设置-SAP凭证年度(SAP需要回写Core中间表)
    * @paramType java.lang.String
    * @param gjahr - SAP凭证年度(SAP需要回写Core中间表)
     */
    public void setGjahr(String gjahr) {
        this.gjahr = gjahr;
    }

    /**
    * 获取-SAP凭证会计期间(SAP需要回写Core中间表)
    * @return monat
     */
    public String getMonat() {
        return monat;
    }

    /**
    * 设置-SAP凭证会计期间(SAP需要回写Core中间表)
    * @paramType java.lang.String
    * @param monat - SAP凭证会计期间(SAP需要回写Core中间表)
     */
    public void setMonat(String monat) {
        this.monat = monat;
    }

    /**
    * 获取-SAP凭证记账日期(SAP需要回写Core中间表)
    * @return budat
     */
    public String getBudat() {
        return budat;
    }

    /**
    * 设置-SAP凭证记账日期(SAP需要回写Core中间表)
    * @paramType java.lang.String
    * @param budat - SAP凭证记账日期(SAP需要回写Core中间表)
     */
    public void setBudat(String budat) {
        this.budat = budat;
    }

    /**
    * 获取-报送批次号，同一凭证每次报送一个批次号
    * @return batchid
     */
    public BigDecimal getBatchid() {
        return batchid;
    }

    /**
    * 设置-报送批次号，同一凭证每次报送一个批次号
    * @paramType java.math.BigDecimal
    * @param batchid - 报送批次号，同一凭证每次报送一个批次号
     */
    public void setBatchid(BigDecimal batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-日结单号
    * @return dailyauditno
     */
    public String getDailyauditno() {
        return dailyauditno;
    }

    /**
    * 设置-日结单号
    * @paramType java.lang.String
    * @param dailyauditno - 日结单号
     */
    public void setDailyauditno(String dailyauditno) {
        this.dailyauditno = dailyauditno;
    }

    /**
    * 获取-业务流水号
    * @return businessno
     */
    public String getBusinessno() {
        return businessno;
    }

    /**
    * 设置-业务流水号
    * @paramType java.lang.String
    * @param businessno - 业务流水号
     */
    public void setBusinessno(String businessno) {
        this.businessno = businessno;
    }

    /**
    * 获取-日结单明细的结算对象partycode
    * @return partycode
     */
    public String getPartycode() {
        return partycode;
    }

    /**
    * 设置-日结单明细的结算对象partycode
    * @paramType java.lang.String
    * @param partycode - 日结单明细的结算对象partycode
     */
    public void setPartycode(String partycode) {
        this.partycode = partycode;
    }

    /**
    * 获取-是否已打印  0：否  1 是
    * @return isprinted
     */
    public String getIsprinted() {
        return isprinted;
    }

    /**
    * 设置-是否已打印  0：否  1 是
    * @paramType java.lang.String
    * @param isprinted - 是否已打印  0：否  1 是
     */
    public void setIsprinted(String isprinted) {
        this.isprinted = isprinted;
    }
}