package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_temp_policy2_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTempPolicy2Td {
    /**
     * 主键
     */
    private Long seqpolicy;

    /**
     * mm_policy_ti.id
     */
    private Long seqcharge;

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
     * 保单币种
     */
    private String basecurrencycode;

    /**
     * 金额（保单币种）
     */
    private BigDecimal baseamount;

    /**
     * 已入帐金额（保单币种）
     */
    private BigDecimal baseaccountamount;

    /**
     * 应收余额（保单币种）
     */
    private BigDecimal basereceivableamount;

    /**
     * 实收/实付金额（保单币种）
     */
    private BigDecimal baserealamount;

    /**
     * 已开发票金额（保单币种）
     */
    private BigDecimal invoiceamount;

    /**
     * 发票到款金额（保单币种）
     */
    private BigDecimal invoicepaidamount;

    /**
     * 收款币种
     */
    private String currencycode;

    /**
     * 金额（记账金额）
     */
    private BigDecimal amount;

    /**
     * 已入帐金额(记账币种)
     */
    private BigDecimal accountamount;

    /**
     * 应收余额（记账币种）
     */
    private BigDecimal receivableamount;

    /**
     * 实收/实付金额（记账币种）
     */
    private BigDecimal realamount;

    /**
     * 预收余额(记账币种)
     */
    private BigDecimal premium;

    /**
     * 汇兑损益(记账币种)
     */
    private BigDecimal agiotageamount;

    /**
     * 收款币种
     */
    private String incurrencycode;

    /**
     * 业务性质 1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源
     */
    private String businessattr;

    /**
     * 是否已起保生效
     */
    private String ifstart;

    /**
     * 已处理次数
     */
    private Long operatedtimes;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 业务归属部门
     */
    private String departmentcode;

    /**
     * 签单日期
     */
    private Date signdate;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 终保日期
     */
    private Date enddate;

    /**
     * 业务系统录入日期
     */
    private Date inputdate;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 经办人代码
     */
    private String transactorcode;

    /**
     * 核保员代码
     */
    private String underwritercode;

    /**
     * 展业方式编号
     */
    private String businesschannel;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 风险类别
     */
    private String risktype;

    /**
     * 业务险类
     */
    private String classeskind;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 批单类型
     */
    private String endorsetype;

    /**
     * 是否有缴费计划
     */
    private String hasplan;

    /**
     * 是否共保
     */
    private String iscoinsurance;

    /**
     * 共保协议号
     */
    private String masterprotocolno;

    /**
     * 卡式保单冲销号
     */
    private String cardpolicyno;

    /**
     * 一揽子协议号
     */
    private String totalprotocoltno;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 核销状态(0:未核销 1：部分核销 2：完全核销 4:视同销售 9:待审核)
     */
    private String opstatus;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 摘要
     */
    private String description;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 版本号
     */
    private Long hibernateversion;

    /**
     * 结算单号
     */
    private String handoverno;

    /**
     * 车牌号
     */
    private String vehicleno;

    /**
     * 用于控制退保批单能否进行付款操作
     */
    private String canpay;

    /**
     * 用于区分数据的来源和后续处理的业务类型，
     */
    private String datatype;

    /**
     * 1有效 2退保 3注销 4终止责任
     */
    private String policystatus;

    /**
     * 1新保 2续保 3公司内转保 4公司间转保
     */
    private String policyattr;

    /**
     * 承保数量
     */
    private Long insurencecount;

    /**
     * 储金返还的数据会有小汇总号
     */
    private String summaryno;

    /**
     * 车船税状态 ：（00：待确认；01待申报，11：已申报）
     */
    private String taxstate;

    /**
     * charge.id_card用于发票打印
     */
    private String idcard;

    /**
     * charge.khmc_c用于发票打印
     */
    private String customernamesimple;

    /**
     * 单票合一属性(单票合一属性，也就是保单代发票 0 非保单代发票 1 保单代发票)
     */
    private String polandinv;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC
     */
    private String modifydesc;

    /**
     * 已申报金额
     */
    private BigDecimal usedtaxamount;

    /**
     * 车辆种类
     */
    private String vehkind;

    /**
    * 获取-主键
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqpolicy - 主键
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
    }

    /**
    * 获取-mm_policy_ti.id
    * @return seqcharge
     */
    public Long getSeqcharge() {
        return seqcharge;
    }

    /**
    * 设置-mm_policy_ti.id
    * @paramType java.lang.Long
    * @param seqcharge - mm_policy_ti.id
     */
    public void setSeqcharge(Long seqcharge) {
        this.seqcharge = seqcharge;
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
    * 获取-保单币种
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-保单币种
    * @paramType java.lang.String
    * @param basecurrencycode - 保单币种
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
    * 获取-已入帐金额（保单币种）
    * @return baseaccountamount
     */
    public BigDecimal getBaseaccountamount() {
        return baseaccountamount;
    }

    /**
    * 设置-已入帐金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param baseaccountamount - 已入帐金额（保单币种）
     */
    public void setBaseaccountamount(BigDecimal baseaccountamount) {
        this.baseaccountamount = baseaccountamount;
    }

    /**
    * 获取-应收余额（保单币种）
    * @return basereceivableamount
     */
    public BigDecimal getBasereceivableamount() {
        return basereceivableamount;
    }

    /**
    * 设置-应收余额（保单币种）
    * @paramType java.math.BigDecimal
    * @param basereceivableamount - 应收余额（保单币种）
     */
    public void setBasereceivableamount(BigDecimal basereceivableamount) {
        this.basereceivableamount = basereceivableamount;
    }

    /**
    * 获取-实收/实付金额（保单币种）
    * @return baserealamount
     */
    public BigDecimal getBaserealamount() {
        return baserealamount;
    }

    /**
    * 设置-实收/实付金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param baserealamount - 实收/实付金额（保单币种）
     */
    public void setBaserealamount(BigDecimal baserealamount) {
        this.baserealamount = baserealamount;
    }

    /**
    * 获取-已开发票金额（保单币种）
    * @return invoiceamount
     */
    public BigDecimal getInvoiceamount() {
        return invoiceamount;
    }

    /**
    * 设置-已开发票金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param invoiceamount - 已开发票金额（保单币种）
     */
    public void setInvoiceamount(BigDecimal invoiceamount) {
        this.invoiceamount = invoiceamount;
    }

    /**
    * 获取-发票到款金额（保单币种）
    * @return invoicepaidamount
     */
    public BigDecimal getInvoicepaidamount() {
        return invoicepaidamount;
    }

    /**
    * 设置-发票到款金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param invoicepaidamount - 发票到款金额（保单币种）
     */
    public void setInvoicepaidamount(BigDecimal invoicepaidamount) {
        this.invoicepaidamount = invoicepaidamount;
    }

    /**
    * 获取-收款币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-收款币种
    * @paramType java.lang.String
    * @param currencycode - 收款币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-金额（记账金额）
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额（记账金额）
    * @paramType java.math.BigDecimal
    * @param amount - 金额（记账金额）
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-已入帐金额(记账币种)
    * @return accountamount
     */
    public BigDecimal getAccountamount() {
        return accountamount;
    }

    /**
    * 设置-已入帐金额(记账币种)
    * @paramType java.math.BigDecimal
    * @param accountamount - 已入帐金额(记账币种)
     */
    public void setAccountamount(BigDecimal accountamount) {
        this.accountamount = accountamount;
    }

    /**
    * 获取-应收余额（记账币种）
    * @return receivableamount
     */
    public BigDecimal getReceivableamount() {
        return receivableamount;
    }

    /**
    * 设置-应收余额（记账币种）
    * @paramType java.math.BigDecimal
    * @param receivableamount - 应收余额（记账币种）
     */
    public void setReceivableamount(BigDecimal receivableamount) {
        this.receivableamount = receivableamount;
    }

    /**
    * 获取-实收/实付金额（记账币种）
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-实收/实付金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param realamount - 实收/实付金额（记账币种）
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
    }

    /**
    * 获取-预收余额(记账币种)
    * @return premium
     */
    public BigDecimal getPremium() {
        return premium;
    }

    /**
    * 设置-预收余额(记账币种)
    * @paramType java.math.BigDecimal
    * @param premium - 预收余额(记账币种)
     */
    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    /**
    * 获取-汇兑损益(记账币种)
    * @return agiotageamount
     */
    public BigDecimal getAgiotageamount() {
        return agiotageamount;
    }

    /**
    * 设置-汇兑损益(记账币种)
    * @paramType java.math.BigDecimal
    * @param agiotageamount - 汇兑损益(记账币种)
     */
    public void setAgiotageamount(BigDecimal agiotageamount) {
        this.agiotageamount = agiotageamount;
    }

    /**
    * 获取-收款币种
    * @return incurrencycode
     */
    public String getIncurrencycode() {
        return incurrencycode;
    }

    /**
    * 设置-收款币种
    * @paramType java.lang.String
    * @param incurrencycode - 收款币种
     */
    public void setIncurrencycode(String incurrencycode) {
        this.incurrencycode = incurrencycode;
    }

    /**
    * 获取-业务性质 1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源
    * @return businessattr
     */
    public String getBusinessattr() {
        return businessattr;
    }

    /**
    * 设置-业务性质 1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源
    * @paramType java.lang.String
    * @param businessattr - 业务性质 1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源
     */
    public void setBusinessattr(String businessattr) {
        this.businessattr = businessattr;
    }

    /**
    * 获取-是否已起保生效
    * @return ifstart
     */
    public String getIfstart() {
        return ifstart;
    }

    /**
    * 设置-是否已起保生效
    * @paramType java.lang.String
    * @param ifstart - 是否已起保生效
     */
    public void setIfstart(String ifstart) {
        this.ifstart = ifstart;
    }

    /**
    * 获取-已处理次数
    * @return operatedtimes
     */
    public Long getOperatedtimes() {
        return operatedtimes;
    }

    /**
    * 设置-已处理次数
    * @paramType java.lang.Long
    * @param operatedtimes - 已处理次数
     */
    public void setOperatedtimes(Long operatedtimes) {
        this.operatedtimes = operatedtimes;
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
    * 获取-签单日期
    * @return signdate
     */
    public Date getSigndate() {
        return signdate;
    }

    /**
    * 设置-签单日期
    * @paramType java.util.Date
    * @param signdate - 签单日期
     */
    public void setSigndate(Date signdate) {
        this.signdate = signdate;
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
    * 获取-终保日期
    * @return enddate
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
    * 设置-终保日期
    * @paramType java.util.Date
    * @param enddate - 终保日期
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
    * 获取-业务系统录入日期
    * @return inputdate
     */
    public Date getInputdate() {
        return inputdate;
    }

    /**
    * 设置-业务系统录入日期
    * @paramType java.util.Date
    * @param inputdate - 业务系统录入日期
     */
    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
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
    * 获取-经办人代码
    * @return transactorcode
     */
    public String getTransactorcode() {
        return transactorcode;
    }

    /**
    * 设置-经办人代码
    * @paramType java.lang.String
    * @param transactorcode - 经办人代码
     */
    public void setTransactorcode(String transactorcode) {
        this.transactorcode = transactorcode;
    }

    /**
    * 获取-核保员代码
    * @return underwritercode
     */
    public String getUnderwritercode() {
        return underwritercode;
    }

    /**
    * 设置-核保员代码
    * @paramType java.lang.String
    * @param underwritercode - 核保员代码
     */
    public void setUnderwritercode(String underwritercode) {
        this.underwritercode = underwritercode;
    }

    /**
    * 获取-展业方式编号
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-展业方式编号
    * @paramType java.lang.String
    * @param businesschannel - 展业方式编号
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
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
    * 获取-业务险类
    * @return classeskind
     */
    public String getClasseskind() {
        return classeskind;
    }

    /**
    * 设置-业务险类
    * @paramType java.lang.String
    * @param classeskind - 业务险类
     */
    public void setClasseskind(String classeskind) {
        this.classeskind = classeskind;
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
    * 获取-批单类型
    * @return endorsetype
     */
    public String getEndorsetype() {
        return endorsetype;
    }

    /**
    * 设置-批单类型
    * @paramType java.lang.String
    * @param endorsetype - 批单类型
     */
    public void setEndorsetype(String endorsetype) {
        this.endorsetype = endorsetype;
    }

    /**
    * 获取-是否有缴费计划
    * @return hasplan
     */
    public String getHasplan() {
        return hasplan;
    }

    /**
    * 设置-是否有缴费计划
    * @paramType java.lang.String
    * @param hasplan - 是否有缴费计划
     */
    public void setHasplan(String hasplan) {
        this.hasplan = hasplan;
    }

    /**
    * 获取-是否共保
    * @return iscoinsurance
     */
    public String getIscoinsurance() {
        return iscoinsurance;
    }

    /**
    * 设置-是否共保
    * @paramType java.lang.String
    * @param iscoinsurance - 是否共保
     */
    public void setIscoinsurance(String iscoinsurance) {
        this.iscoinsurance = iscoinsurance;
    }

    /**
    * 获取-共保协议号
    * @return masterprotocolno
     */
    public String getMasterprotocolno() {
        return masterprotocolno;
    }

    /**
    * 设置-共保协议号
    * @paramType java.lang.String
    * @param masterprotocolno - 共保协议号
     */
    public void setMasterprotocolno(String masterprotocolno) {
        this.masterprotocolno = masterprotocolno;
    }

    /**
    * 获取-卡式保单冲销号
    * @return cardpolicyno
     */
    public String getCardpolicyno() {
        return cardpolicyno;
    }

    /**
    * 设置-卡式保单冲销号
    * @paramType java.lang.String
    * @param cardpolicyno - 卡式保单冲销号
     */
    public void setCardpolicyno(String cardpolicyno) {
        this.cardpolicyno = cardpolicyno;
    }

    /**
    * 获取-一揽子协议号
    * @return totalprotocoltno
     */
    public String getTotalprotocoltno() {
        return totalprotocoltno;
    }

    /**
    * 设置-一揽子协议号
    * @paramType java.lang.String
    * @param totalprotocoltno - 一揽子协议号
     */
    public void setTotalprotocoltno(String totalprotocoltno) {
        this.totalprotocoltno = totalprotocoltno;
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
    * 获取-核销状态(0:未核销 1：部分核销 2：完全核销 4:视同销售 9:待审核)
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-核销状态(0:未核销 1：部分核销 2：完全核销 4:视同销售 9:待审核)
    * @paramType java.lang.String
    * @param opstatus - 核销状态(0:未核销 1：部分核销 2：完全核销 4:视同销售 9:待审核)
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
    * 获取-结算单号
    * @return handoverno
     */
    public String getHandoverno() {
        return handoverno;
    }

    /**
    * 设置-结算单号
    * @paramType java.lang.String
    * @param handoverno - 结算单号
     */
    public void setHandoverno(String handoverno) {
        this.handoverno = handoverno;
    }

    /**
    * 获取-车牌号
    * @return vehicleno
     */
    public String getVehicleno() {
        return vehicleno;
    }

    /**
    * 设置-车牌号
    * @paramType java.lang.String
    * @param vehicleno - 车牌号
     */
    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    /**
    * 获取-用于控制退保批单能否进行付款操作
    * @return canpay
     */
    public String getCanpay() {
        return canpay;
    }

    /**
    * 设置-用于控制退保批单能否进行付款操作
    * @paramType java.lang.String
    * @param canpay - 用于控制退保批单能否进行付款操作
     */
    public void setCanpay(String canpay) {
        this.canpay = canpay;
    }

    /**
    * 获取-用于区分数据的来源和后续处理的业务类型，
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-用于区分数据的来源和后续处理的业务类型，
    * @paramType java.lang.String
    * @param datatype - 用于区分数据的来源和后续处理的业务类型，
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-1有效 2退保 3注销 4终止责任
    * @return policystatus
     */
    public String getPolicystatus() {
        return policystatus;
    }

    /**
    * 设置-1有效 2退保 3注销 4终止责任
    * @paramType java.lang.String
    * @param policystatus - 1有效 2退保 3注销 4终止责任
     */
    public void setPolicystatus(String policystatus) {
        this.policystatus = policystatus;
    }

    /**
    * 获取-1新保 2续保 3公司内转保 4公司间转保
    * @return policyattr
     */
    public String getPolicyattr() {
        return policyattr;
    }

    /**
    * 设置-1新保 2续保 3公司内转保 4公司间转保
    * @paramType java.lang.String
    * @param policyattr - 1新保 2续保 3公司内转保 4公司间转保
     */
    public void setPolicyattr(String policyattr) {
        this.policyattr = policyattr;
    }

    /**
    * 获取-承保数量
    * @return insurencecount
     */
    public Long getInsurencecount() {
        return insurencecount;
    }

    /**
    * 设置-承保数量
    * @paramType java.lang.Long
    * @param insurencecount - 承保数量
     */
    public void setInsurencecount(Long insurencecount) {
        this.insurencecount = insurencecount;
    }

    /**
    * 获取-储金返还的数据会有小汇总号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-储金返还的数据会有小汇总号
    * @paramType java.lang.String
    * @param summaryno - 储金返还的数据会有小汇总号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    /**
    * 获取-车船税状态 ：（00：待确认；01待申报，11：已申报）
    * @return taxstate
     */
    public String getTaxstate() {
        return taxstate;
    }

    /**
    * 设置-车船税状态 ：（00：待确认；01待申报，11：已申报）
    * @paramType java.lang.String
    * @param taxstate - 车船税状态 ：（00：待确认；01待申报，11：已申报）
     */
    public void setTaxstate(String taxstate) {
        this.taxstate = taxstate;
    }

    /**
    * 获取-charge.id_card用于发票打印
    * @return idcard
     */
    public String getIdcard() {
        return idcard;
    }

    /**
    * 设置-charge.id_card用于发票打印
    * @paramType java.lang.String
    * @param idcard - charge.id_card用于发票打印
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
    * 获取-charge.khmc_c用于发票打印
    * @return customernamesimple
     */
    public String getCustomernamesimple() {
        return customernamesimple;
    }

    /**
    * 设置-charge.khmc_c用于发票打印
    * @paramType java.lang.String
    * @param customernamesimple - charge.khmc_c用于发票打印
     */
    public void setCustomernamesimple(String customernamesimple) {
        this.customernamesimple = customernamesimple;
    }

    /**
    * 获取-单票合一属性(单票合一属性，也就是保单代发票 0 非保单代发票 1 保单代发票)
    * @return polandinv
     */
    public String getPolandinv() {
        return polandinv;
    }

    /**
    * 设置-单票合一属性(单票合一属性，也就是保单代发票 0 非保单代发票 1 保单代发票)
    * @paramType java.lang.String
    * @param polandinv - 单票合一属性(单票合一属性，也就是保单代发票 0 非保单代发票 1 保单代发票)
     */
    public void setPolandinv(String polandinv) {
        this.polandinv = polandinv;
    }

    /**
    * 获取-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-已申报金额
    * @return usedtaxamount
     */
    public BigDecimal getUsedtaxamount() {
        return usedtaxamount;
    }

    /**
    * 设置-已申报金额
    * @paramType java.math.BigDecimal
    * @param usedtaxamount - 已申报金额
     */
    public void setUsedtaxamount(BigDecimal usedtaxamount) {
        this.usedtaxamount = usedtaxamount;
    }

    /**
    * 获取-车辆种类
    * @return vehkind
     */
    public String getVehkind() {
        return vehkind;
    }

    /**
    * 设置-车辆种类
    * @paramType java.lang.String
    * @param vehkind - 车辆种类
     */
    public void setVehkind(String vehkind) {
        this.vehkind = vehkind;
    }
}