package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_claim_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmClaimTd {
    /**
     * 主键
     */
    private Long seqpayment;

    /**
     * 赔案接口主表序号复制过来
     */
    private Long seqclaim;

    /**
     * 主保方
     */
    private String subcompany;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 立案号
     */
    private String caseno;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 终保日期
     */
    private Date enddate;

    /**
     * 业务性质 1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源
     */
    private String businessattr;

    /**
     * 经办人代码
     */
    private String transactorcode;

    /**
     * 展业方式编号
     */
    private String businesschannel;

    /**
     * 风险类别
     */
    private String risktype;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 业务险类
     */
    private String classeskind;

    /**
     * 核赔日期
     */
    private Date auditdate;

    /**
     * 保单币种
     */
    private String basecurrencycode;

    /**
     * 金额（保单币种）
     */
    private BigDecimal baseamount;

    /**
     * 已入帐金额(保单币种)
     */
    private BigDecimal baseaccountamount;

    /**
     * 挂应付金额（保单币种）
     */
    private BigDecimal basereceivableamount;

    /**
     * 实付金额（保单币种）
     */
    private BigDecimal baserealamount;

    /**
     * 记账币种
     */
    private String currencycode;

    /**
     * 金额（记账币种）
     */
    private BigDecimal amount;

    /**
     * 已入帐金额(记账币种)
     */
    private BigDecimal accountamount;

    /**
     * 挂应付金额（记账币种）
     */
    private BigDecimal receivableamount;

    /**
     * 实收付金额（记账币种）
     */
    private BigDecimal realamount;

    /**
     * 汇兑损益(记账币种)
     */
    private BigDecimal agiotageamount;

    /**
     * 业务部门代码
     */
    private String departmentcode;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 赔案数据类型
     */
    private String claimtype;

    /**
     * 付款方式
     */
    private String inpaymentmethod;

    /**
     * 客户银行账号
     */
    private String custaccountno;

    /**
     * 开户行银行名称
     */
    private String bankname;

    /**
     * 客户开户行代码（开户行联行号）
     */
    private String custbankno;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 核销状态
     */
    private String opstatus;

    /**
     * 含义改变了，请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history 
     */
    private String datasource;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 摘要
     */
    private String description;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 插入时间
     */
    private Date inputdate;

    /**
     * HIBERNATE版本号
     */
    private Long hibernateversion;

    /**
     * 如果写入了通付分公司代码并且与SUBCOMPANY不同，表示此赔案指定为跨司的通付，只有被指定的付款分公司才能付款，承保分公司不能进行付款
     */
    private String paysubcompany;

    /**
     * 0 非通付 1 通付
     */
    private String ifcorsspay;

    /**
     * 车险代垫付平台流水号
     */
    private String advancesequence;

    /**
     * 赔案的赔付序号
     */
    private String serialno;

    /**
     * 一次赔付的多个客户的序号
     */
    private String custseq;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 小汇总，对应indemnity.xhz
     */
    private String summaryno;

    /**
     * 票据用途，对应payment.zpyt
     */
    private String inpaymentbatchno;

    /**
     * 是否共保  0无共保，1司内/联保，2司外/共保
     */
    private String iscoinsurance;

    /**
     * 被保险人代码
     */
    private String insuredcode;

    /**
     * 被保险人名称（中文）
     */
    private String insuredname;

    /**
     * 收付交易数据的被保险人名称（英文）
     */
    private String insurednameen;

    /**
     * 保单上的被保险人partyno
     */
    private String insuredpartyno;

    /**
     * 保单上的投保人代码
     */
    private String applicantcode;

    /**
     * 收付交易数据的投保人中文名称
     */
    private String applicantnamecn;

    /**
     * 收付交易数据的投保人英文名称
     */
    private String applicantnameen;

    /**
     * 保单上的投保人partyno
     */
    private String applicantionpartyno;

    /**
     * 投保人是否为日系客户     0：非日系 1：日系
     */
    private String appisjapan;

    /**
     * 境内/境外标识  0 境外  1 境内
     */
    private String domestic;

    /**
     * 进口/出口标识   1  内陆货运险  2  进口货运险  3  出口货运险 
     */
    private String porttype;

    /**
     * 账单号
     */
    private String billno;

    /**
     * 冲销号 为红冲数据，所红冲原记录的唯一流水号
     */
    private String offsetno;

    /**
     * 计划缴费日期
     */
    private Date plandate;

    /**
     * 收付交易数据的客户名称（英文
     */
    private String customernameen;

    /**
     * 客户partyno
     */
    private String customerpartyno;

    /**
     * 收付交易数据的客户是否为日系客户
     */
    private String custisjapan;

    /**
     * 代理点/经纪公司名称（中文）
     */
    private String agentnamecn;

    /**
     * 代理点/经纪公司名称（英文）
     */
    private String agentnameen;

    /**
     * 代理点/经纪公司partyno
     */
    private String agentpartyno;

    /**
     * 0无共保，2司外/共保（主保），3司外/共保（从保） 用于东京海上
     */
    private String contracttype;

    /**
     * 客户账户名称
     */
    private String custaccountname;

    /**
     * 客户账户名称(英文)
     */
    private String custaccountnameen;

    /**
     * 费用类型描述
     */
    private String chargedescription;

    /**
     * 承保期限  000001   短期(一年以内) 000002  一年期 000003  一年以上定期   000004  不定期
     */
    private String insuranceterm;

    /**
     * 清算码
     */
    private String recoverycode;

    /**
     * 例外状态：0-正常，1-支付至责任保险第三者，2-法院判决，3-共保业务，4-交强险垫/预付，5-车辆过户，6-其他。
     */
    private String exstatus;

    /**
     * 针对“例外状态”的说明
     */
    private String exceptioncause;

    /**
     * 银行
     */
    private String banks;

    /**
     * 对公对私；0对公1对私
     */
    private String ifpublic;

    /**
     * 开户行所在城市
     */
    private String payeecity;

    /**
     * 开户行所在的省
     */
    private String payeeprovince;

    /**
     * 支付方式
     */
    private String defraymode;

    /**
     * 确定往mm_policy_events_td插入记录的金额确定的标志
     */
    private Long claimflag;

    /**
     * 银行备注
     */
    private String bankremark;

    /**
     * 报案号
     */
    private String reportcaseno;

    /**
     * 用于司内代位追偿案件后续自动批量对冲，司内代位求偿案件的追偿款和对应清偿款的PAIRNO必须一致
     */
    private String pairno;

    /**
     * ifcoinsurance(是主保方还是从共方，1是主保方，0是从共方)
     */
    private String ifcoinsurance;

    /**
     * ifinside是否司内的（1是0否）
     */
    private String ifinside;

    /**
     * 主保方赔案号
     */
    private String mainclaimno;

    /**
     * 垫付另外一条赔案的主键
     */
    private BigDecimal seqpaymentcopy;

    /**
     * 跟单方机构代码
     */
    private String gdunitcode;

    /**
     * 跟单方机构名称
     */
    private String gdunitname;

    /**
     * 车牌号
     */
    private String vehicleno;

    /**
     * 纳税主体
     */
    private String taxorgtally;

    /**
     * 进项税额转出
     */
    private BigDecimal taxesamountout;

    /**
     * 税额
     */
    private BigDecimal taxesamount;

    /**
     * 业务来源
     */
    private String businesssource;

    /**
     * 团队类型
     */
    private String grouptype;

    /**
     * 车辆使用性质
     */
    private String useporperty;

    /**
     * 车辆规格特性
     */
    private String characteristics;

    /**
     * 车辆用途
     */
    private String carusetype;

    /**
     * 车辆类型
     */
    private String vehkind;

    /**
     * 挂账兑换人民币汇率
     */
    private BigDecimal exchangerate;

    /**
    * 获取-主键
    * @return seqpayment
     */
    public Long getSeqpayment() {
        return seqpayment;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqpayment - 主键
     */
    public void setSeqpayment(Long seqpayment) {
        this.seqpayment = seqpayment;
    }

    /**
    * 获取-赔案接口主表序号复制过来
    * @return seqclaim
     */
    public Long getSeqclaim() {
        return seqclaim;
    }

    /**
    * 设置-赔案接口主表序号复制过来
    * @paramType java.lang.Long
    * @param seqclaim - 赔案接口主表序号复制过来
     */
    public void setSeqclaim(Long seqclaim) {
        this.seqclaim = seqclaim;
    }

    /**
    * 获取-主保方
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-主保方
    * @paramType java.lang.String
    * @param subcompany - 主保方
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
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
    * 获取-立案号
    * @return caseno
     */
    public String getCaseno() {
        return caseno;
    }

    /**
    * 设置-立案号
    * @paramType java.lang.String
    * @param caseno - 立案号
     */
    public void setCaseno(String caseno) {
        this.caseno = caseno;
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
    * 获取-核赔日期
    * @return auditdate
     */
    public Date getAuditdate() {
        return auditdate;
    }

    /**
    * 设置-核赔日期
    * @paramType java.util.Date
    * @param auditdate - 核赔日期
     */
    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
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
    * 获取-已入帐金额(保单币种)
    * @return baseaccountamount
     */
    public BigDecimal getBaseaccountamount() {
        return baseaccountamount;
    }

    /**
    * 设置-已入帐金额(保单币种)
    * @paramType java.math.BigDecimal
    * @param baseaccountamount - 已入帐金额(保单币种)
     */
    public void setBaseaccountamount(BigDecimal baseaccountamount) {
        this.baseaccountamount = baseaccountamount;
    }

    /**
    * 获取-挂应付金额（保单币种）
    * @return basereceivableamount
     */
    public BigDecimal getBasereceivableamount() {
        return basereceivableamount;
    }

    /**
    * 设置-挂应付金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param basereceivableamount - 挂应付金额（保单币种）
     */
    public void setBasereceivableamount(BigDecimal basereceivableamount) {
        this.basereceivableamount = basereceivableamount;
    }

    /**
    * 获取-实付金额（保单币种）
    * @return baserealamount
     */
    public BigDecimal getBaserealamount() {
        return baserealamount;
    }

    /**
    * 设置-实付金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param baserealamount - 实付金额（保单币种）
     */
    public void setBaserealamount(BigDecimal baserealamount) {
        this.baserealamount = baserealamount;
    }

    /**
    * 获取-记账币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-记账币种
    * @paramType java.lang.String
    * @param currencycode - 记账币种
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
    * 获取-挂应付金额（记账币种）
    * @return receivableamount
     */
    public BigDecimal getReceivableamount() {
        return receivableamount;
    }

    /**
    * 设置-挂应付金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param receivableamount - 挂应付金额（记账币种）
     */
    public void setReceivableamount(BigDecimal receivableamount) {
        this.receivableamount = receivableamount;
    }

    /**
    * 获取-实收付金额（记账币种）
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-实收付金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param realamount - 实收付金额（记账币种）
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
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
    * 获取-赔案数据类型
    * @return claimtype
     */
    public String getClaimtype() {
        return claimtype;
    }

    /**
    * 设置-赔案数据类型
    * @paramType java.lang.String
    * @param claimtype - 赔案数据类型
     */
    public void setClaimtype(String claimtype) {
        this.claimtype = claimtype;
    }

    /**
    * 获取-付款方式
    * @return inpaymentmethod
     */
    public String getInpaymentmethod() {
        return inpaymentmethod;
    }

    /**
    * 设置-付款方式
    * @paramType java.lang.String
    * @param inpaymentmethod - 付款方式
     */
    public void setInpaymentmethod(String inpaymentmethod) {
        this.inpaymentmethod = inpaymentmethod;
    }

    /**
    * 获取-客户银行账号
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户银行账号
    * @paramType java.lang.String
    * @param custaccountno - 客户银行账号
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
    * 获取-客户开户行代码（开户行联行号）
    * @return custbankno
     */
    public String getCustbankno() {
        return custbankno;
    }

    /**
    * 设置-客户开户行代码（开户行联行号）
    * @paramType java.lang.String
    * @param custbankno - 客户开户行代码（开户行联行号）
     */
    public void setCustbankno(String custbankno) {
        this.custbankno = custbankno;
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
    * 获取-含义改变了，请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history 
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-含义改变了，请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history 
    * @paramType java.lang.String
    * @param datasource - 含义改变了，请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history 
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
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
    * 获取-插入时间
    * @return inputdate
     */
    public Date getInputdate() {
        return inputdate;
    }

    /**
    * 设置-插入时间
    * @paramType java.util.Date
    * @param inputdate - 插入时间
     */
    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    /**
    * 获取-HIBERNATE版本号
    * @return hibernateversion
     */
    public Long getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本号
    * @paramType java.lang.Long
    * @param hibernateversion - HIBERNATE版本号
     */
    public void setHibernateversion(Long hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-如果写入了通付分公司代码并且与SUBCOMPANY不同，表示此赔案指定为跨司的通付，只有被指定的付款分公司才能付款，承保分公司不能进行付款
    * @return paysubcompany
     */
    public String getPaysubcompany() {
        return paysubcompany;
    }

    /**
    * 设置-如果写入了通付分公司代码并且与SUBCOMPANY不同，表示此赔案指定为跨司的通付，只有被指定的付款分公司才能付款，承保分公司不能进行付款
    * @paramType java.lang.String
    * @param paysubcompany - 如果写入了通付分公司代码并且与SUBCOMPANY不同，表示此赔案指定为跨司的通付，只有被指定的付款分公司才能付款，承保分公司不能进行付款
     */
    public void setPaysubcompany(String paysubcompany) {
        this.paysubcompany = paysubcompany;
    }

    /**
    * 获取-0 非通付 1 通付
    * @return ifcorsspay
     */
    public String getIfcorsspay() {
        return ifcorsspay;
    }

    /**
    * 设置-0 非通付 1 通付
    * @paramType java.lang.String
    * @param ifcorsspay - 0 非通付 1 通付
     */
    public void setIfcorsspay(String ifcorsspay) {
        this.ifcorsspay = ifcorsspay;
    }

    /**
    * 获取-车险代垫付平台流水号
    * @return advancesequence
     */
    public String getAdvancesequence() {
        return advancesequence;
    }

    /**
    * 设置-车险代垫付平台流水号
    * @paramType java.lang.String
    * @param advancesequence - 车险代垫付平台流水号
     */
    public void setAdvancesequence(String advancesequence) {
        this.advancesequence = advancesequence;
    }

    /**
    * 获取-赔案的赔付序号
    * @return serialno
     */
    public String getSerialno() {
        return serialno;
    }

    /**
    * 设置-赔案的赔付序号
    * @paramType java.lang.String
    * @param serialno - 赔案的赔付序号
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    /**
    * 获取-一次赔付的多个客户的序号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-一次赔付的多个客户的序号
    * @paramType java.lang.String
    * @param custseq - 一次赔付的多个客户的序号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-小汇总，对应indemnity.xhz
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-小汇总，对应indemnity.xhz
    * @paramType java.lang.String
    * @param summaryno - 小汇总，对应indemnity.xhz
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    /**
    * 获取-票据用途，对应payment.zpyt
    * @return inpaymentbatchno
     */
    public String getInpaymentbatchno() {
        return inpaymentbatchno;
    }

    /**
    * 设置-票据用途，对应payment.zpyt
    * @paramType java.lang.String
    * @param inpaymentbatchno - 票据用途，对应payment.zpyt
     */
    public void setInpaymentbatchno(String inpaymentbatchno) {
        this.inpaymentbatchno = inpaymentbatchno;
    }

    /**
    * 获取-是否共保  0无共保，1司内/联保，2司外/共保
    * @return iscoinsurance
     */
    public String getIscoinsurance() {
        return iscoinsurance;
    }

    /**
    * 设置-是否共保  0无共保，1司内/联保，2司外/共保
    * @paramType java.lang.String
    * @param iscoinsurance - 是否共保  0无共保，1司内/联保，2司外/共保
     */
    public void setIscoinsurance(String iscoinsurance) {
        this.iscoinsurance = iscoinsurance;
    }

    /**
    * 获取-被保险人代码
    * @return insuredcode
     */
    public String getInsuredcode() {
        return insuredcode;
    }

    /**
    * 设置-被保险人代码
    * @paramType java.lang.String
    * @param insuredcode - 被保险人代码
     */
    public void setInsuredcode(String insuredcode) {
        this.insuredcode = insuredcode;
    }

    /**
    * 获取-被保险人名称（中文）
    * @return insuredname
     */
    public String getInsuredname() {
        return insuredname;
    }

    /**
    * 设置-被保险人名称（中文）
    * @paramType java.lang.String
    * @param insuredname - 被保险人名称（中文）
     */
    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    /**
    * 获取-收付交易数据的被保险人名称（英文）
    * @return insurednameen
     */
    public String getInsurednameen() {
        return insurednameen;
    }

    /**
    * 设置-收付交易数据的被保险人名称（英文）
    * @paramType java.lang.String
    * @param insurednameen - 收付交易数据的被保险人名称（英文）
     */
    public void setInsurednameen(String insurednameen) {
        this.insurednameen = insurednameen;
    }

    /**
    * 获取-保单上的被保险人partyno
    * @return insuredpartyno
     */
    public String getInsuredpartyno() {
        return insuredpartyno;
    }

    /**
    * 设置-保单上的被保险人partyno
    * @paramType java.lang.String
    * @param insuredpartyno - 保单上的被保险人partyno
     */
    public void setInsuredpartyno(String insuredpartyno) {
        this.insuredpartyno = insuredpartyno;
    }

    /**
    * 获取-保单上的投保人代码
    * @return applicantcode
     */
    public String getApplicantcode() {
        return applicantcode;
    }

    /**
    * 设置-保单上的投保人代码
    * @paramType java.lang.String
    * @param applicantcode - 保单上的投保人代码
     */
    public void setApplicantcode(String applicantcode) {
        this.applicantcode = applicantcode;
    }

    /**
    * 获取-收付交易数据的投保人中文名称
    * @return applicantnamecn
     */
    public String getApplicantnamecn() {
        return applicantnamecn;
    }

    /**
    * 设置-收付交易数据的投保人中文名称
    * @paramType java.lang.String
    * @param applicantnamecn - 收付交易数据的投保人中文名称
     */
    public void setApplicantnamecn(String applicantnamecn) {
        this.applicantnamecn = applicantnamecn;
    }

    /**
    * 获取-收付交易数据的投保人英文名称
    * @return applicantnameen
     */
    public String getApplicantnameen() {
        return applicantnameen;
    }

    /**
    * 设置-收付交易数据的投保人英文名称
    * @paramType java.lang.String
    * @param applicantnameen - 收付交易数据的投保人英文名称
     */
    public void setApplicantnameen(String applicantnameen) {
        this.applicantnameen = applicantnameen;
    }

    /**
    * 获取-保单上的投保人partyno
    * @return applicantionpartyno
     */
    public String getApplicantionpartyno() {
        return applicantionpartyno;
    }

    /**
    * 设置-保单上的投保人partyno
    * @paramType java.lang.String
    * @param applicantionpartyno - 保单上的投保人partyno
     */
    public void setApplicantionpartyno(String applicantionpartyno) {
        this.applicantionpartyno = applicantionpartyno;
    }

    /**
    * 获取-投保人是否为日系客户     0：非日系 1：日系
    * @return appisjapan
     */
    public String getAppisjapan() {
        return appisjapan;
    }

    /**
    * 设置-投保人是否为日系客户     0：非日系 1：日系
    * @paramType java.lang.String
    * @param appisjapan - 投保人是否为日系客户     0：非日系 1：日系
     */
    public void setAppisjapan(String appisjapan) {
        this.appisjapan = appisjapan;
    }

    /**
    * 获取-境内/境外标识  0 境外  1 境内
    * @return domestic
     */
    public String getDomestic() {
        return domestic;
    }

    /**
    * 设置-境内/境外标识  0 境外  1 境内
    * @paramType java.lang.String
    * @param domestic - 境内/境外标识  0 境外  1 境内
     */
    public void setDomestic(String domestic) {
        this.domestic = domestic;
    }

    /**
    * 获取-进口/出口标识   1  内陆货运险  2  进口货运险  3  出口货运险 
    * @return porttype
     */
    public String getPorttype() {
        return porttype;
    }

    /**
    * 设置-进口/出口标识   1  内陆货运险  2  进口货运险  3  出口货运险 
    * @paramType java.lang.String
    * @param porttype - 进口/出口标识   1  内陆货运险  2  进口货运险  3  出口货运险 
     */
    public void setPorttype(String porttype) {
        this.porttype = porttype;
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
    * 获取-冲销号 为红冲数据，所红冲原记录的唯一流水号
    * @return offsetno
     */
    public String getOffsetno() {
        return offsetno;
    }

    /**
    * 设置-冲销号 为红冲数据，所红冲原记录的唯一流水号
    * @paramType java.lang.String
    * @param offsetno - 冲销号 为红冲数据，所红冲原记录的唯一流水号
     */
    public void setOffsetno(String offsetno) {
        this.offsetno = offsetno;
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
    * 获取-收付交易数据的客户名称（英文
    * @return customernameen
     */
    public String getCustomernameen() {
        return customernameen;
    }

    /**
    * 设置-收付交易数据的客户名称（英文
    * @paramType java.lang.String
    * @param customernameen - 收付交易数据的客户名称（英文
     */
    public void setCustomernameen(String customernameen) {
        this.customernameen = customernameen;
    }

    /**
    * 获取-客户partyno
    * @return customerpartyno
     */
    public String getCustomerpartyno() {
        return customerpartyno;
    }

    /**
    * 设置-客户partyno
    * @paramType java.lang.String
    * @param customerpartyno - 客户partyno
     */
    public void setCustomerpartyno(String customerpartyno) {
        this.customerpartyno = customerpartyno;
    }

    /**
    * 获取-收付交易数据的客户是否为日系客户
    * @return custisjapan
     */
    public String getCustisjapan() {
        return custisjapan;
    }

    /**
    * 设置-收付交易数据的客户是否为日系客户
    * @paramType java.lang.String
    * @param custisjapan - 收付交易数据的客户是否为日系客户
     */
    public void setCustisjapan(String custisjapan) {
        this.custisjapan = custisjapan;
    }

    /**
    * 获取-代理点/经纪公司名称（中文）
    * @return agentnamecn
     */
    public String getAgentnamecn() {
        return agentnamecn;
    }

    /**
    * 设置-代理点/经纪公司名称（中文）
    * @paramType java.lang.String
    * @param agentnamecn - 代理点/经纪公司名称（中文）
     */
    public void setAgentnamecn(String agentnamecn) {
        this.agentnamecn = agentnamecn;
    }

    /**
    * 获取-代理点/经纪公司名称（英文）
    * @return agentnameen
     */
    public String getAgentnameen() {
        return agentnameen;
    }

    /**
    * 设置-代理点/经纪公司名称（英文）
    * @paramType java.lang.String
    * @param agentnameen - 代理点/经纪公司名称（英文）
     */
    public void setAgentnameen(String agentnameen) {
        this.agentnameen = agentnameen;
    }

    /**
    * 获取-代理点/经纪公司partyno
    * @return agentpartyno
     */
    public String getAgentpartyno() {
        return agentpartyno;
    }

    /**
    * 设置-代理点/经纪公司partyno
    * @paramType java.lang.String
    * @param agentpartyno - 代理点/经纪公司partyno
     */
    public void setAgentpartyno(String agentpartyno) {
        this.agentpartyno = agentpartyno;
    }

    /**
    * 获取-0无共保，2司外/共保（主保），3司外/共保（从保） 用于东京海上
    * @return contracttype
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
    * 设置-0无共保，2司外/共保（主保），3司外/共保（从保） 用于东京海上
    * @paramType java.lang.String
    * @param contracttype - 0无共保，2司外/共保（主保），3司外/共保（从保） 用于东京海上
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
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
    * 获取-客户账户名称(英文)
    * @return custaccountnameen
     */
    public String getCustaccountnameen() {
        return custaccountnameen;
    }

    /**
    * 设置-客户账户名称(英文)
    * @paramType java.lang.String
    * @param custaccountnameen - 客户账户名称(英文)
     */
    public void setCustaccountnameen(String custaccountnameen) {
        this.custaccountnameen = custaccountnameen;
    }

    /**
    * 获取-费用类型描述
    * @return chargedescription
     */
    public String getChargedescription() {
        return chargedescription;
    }

    /**
    * 设置-费用类型描述
    * @paramType java.lang.String
    * @param chargedescription - 费用类型描述
     */
    public void setChargedescription(String chargedescription) {
        this.chargedescription = chargedescription;
    }

    /**
    * 获取-承保期限  000001   短期(一年以内) 000002  一年期 000003  一年以上定期   000004  不定期
    * @return insuranceterm
     */
    public String getInsuranceterm() {
        return insuranceterm;
    }

    /**
    * 设置-承保期限  000001   短期(一年以内) 000002  一年期 000003  一年以上定期   000004  不定期
    * @paramType java.lang.String
    * @param insuranceterm - 承保期限  000001   短期(一年以内) 000002  一年期 000003  一年以上定期   000004  不定期
     */
    public void setInsuranceterm(String insuranceterm) {
        this.insuranceterm = insuranceterm;
    }

    /**
    * 获取-清算码
    * @return recoverycode
     */
    public String getRecoverycode() {
        return recoverycode;
    }

    /**
    * 设置-清算码
    * @paramType java.lang.String
    * @param recoverycode - 清算码
     */
    public void setRecoverycode(String recoverycode) {
        this.recoverycode = recoverycode;
    }

    /**
    * 获取-例外状态：0-正常，1-支付至责任保险第三者，2-法院判决，3-共保业务，4-交强险垫/预付，5-车辆过户，6-其他。
    * @return exstatus
     */
    public String getExstatus() {
        return exstatus;
    }

    /**
    * 设置-例外状态：0-正常，1-支付至责任保险第三者，2-法院判决，3-共保业务，4-交强险垫/预付，5-车辆过户，6-其他。
    * @paramType java.lang.String
    * @param exstatus - 例外状态：0-正常，1-支付至责任保险第三者，2-法院判决，3-共保业务，4-交强险垫/预付，5-车辆过户，6-其他。
     */
    public void setExstatus(String exstatus) {
        this.exstatus = exstatus;
    }

    /**
    * 获取-针对“例外状态”的说明
    * @return exceptioncause
     */
    public String getExceptioncause() {
        return exceptioncause;
    }

    /**
    * 设置-针对“例外状态”的说明
    * @paramType java.lang.String
    * @param exceptioncause - 针对“例外状态”的说明
     */
    public void setExceptioncause(String exceptioncause) {
        this.exceptioncause = exceptioncause;
    }

    /**
    * 获取-银行
    * @return banks
     */
    public String getBanks() {
        return banks;
    }

    /**
    * 设置-银行
    * @paramType java.lang.String
    * @param banks - 银行
     */
    public void setBanks(String banks) {
        this.banks = banks;
    }

    /**
    * 获取-对公对私；0对公1对私
    * @return ifpublic
     */
    public String getIfpublic() {
        return ifpublic;
    }

    /**
    * 设置-对公对私；0对公1对私
    * @paramType java.lang.String
    * @param ifpublic - 对公对私；0对公1对私
     */
    public void setIfpublic(String ifpublic) {
        this.ifpublic = ifpublic;
    }

    /**
    * 获取-开户行所在城市
    * @return payeecity
     */
    public String getPayeecity() {
        return payeecity;
    }

    /**
    * 设置-开户行所在城市
    * @paramType java.lang.String
    * @param payeecity - 开户行所在城市
     */
    public void setPayeecity(String payeecity) {
        this.payeecity = payeecity;
    }

    /**
    * 获取-开户行所在的省
    * @return payeeprovince
     */
    public String getPayeeprovince() {
        return payeeprovince;
    }

    /**
    * 设置-开户行所在的省
    * @paramType java.lang.String
    * @param payeeprovince - 开户行所在的省
     */
    public void setPayeeprovince(String payeeprovince) {
        this.payeeprovince = payeeprovince;
    }

    /**
    * 获取-支付方式
    * @return defraymode
     */
    public String getDefraymode() {
        return defraymode;
    }

    /**
    * 设置-支付方式
    * @paramType java.lang.String
    * @param defraymode - 支付方式
     */
    public void setDefraymode(String defraymode) {
        this.defraymode = defraymode;
    }

    /**
    * 获取-确定往mm_policy_events_td插入记录的金额确定的标志
    * @return claimflag
     */
    public Long getClaimflag() {
        return claimflag;
    }

    /**
    * 设置-确定往mm_policy_events_td插入记录的金额确定的标志
    * @paramType java.lang.Long
    * @param claimflag - 确定往mm_policy_events_td插入记录的金额确定的标志
     */
    public void setClaimflag(Long claimflag) {
        this.claimflag = claimflag;
    }

    /**
    * 获取-银行备注
    * @return bankremark
     */
    public String getBankremark() {
        return bankremark;
    }

    /**
    * 设置-银行备注
    * @paramType java.lang.String
    * @param bankremark - 银行备注
     */
    public void setBankremark(String bankremark) {
        this.bankremark = bankremark;
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
    * 获取-用于司内代位追偿案件后续自动批量对冲，司内代位求偿案件的追偿款和对应清偿款的PAIRNO必须一致
    * @return pairno
     */
    public String getPairno() {
        return pairno;
    }

    /**
    * 设置-用于司内代位追偿案件后续自动批量对冲，司内代位求偿案件的追偿款和对应清偿款的PAIRNO必须一致
    * @paramType java.lang.String
    * @param pairno - 用于司内代位追偿案件后续自动批量对冲，司内代位求偿案件的追偿款和对应清偿款的PAIRNO必须一致
     */
    public void setPairno(String pairno) {
        this.pairno = pairno;
    }

    /**
    * 获取-ifcoinsurance(是主保方还是从共方，1是主保方，0是从共方)
    * @return ifcoinsurance
     */
    public String getIfcoinsurance() {
        return ifcoinsurance;
    }

    /**
    * 设置-ifcoinsurance(是主保方还是从共方，1是主保方，0是从共方)
    * @paramType java.lang.String
    * @param ifcoinsurance - ifcoinsurance(是主保方还是从共方，1是主保方，0是从共方)
     */
    public void setIfcoinsurance(String ifcoinsurance) {
        this.ifcoinsurance = ifcoinsurance;
    }

    /**
    * 获取-ifinside是否司内的（1是0否）
    * @return ifinside
     */
    public String getIfinside() {
        return ifinside;
    }

    /**
    * 设置-ifinside是否司内的（1是0否）
    * @paramType java.lang.String
    * @param ifinside - ifinside是否司内的（1是0否）
     */
    public void setIfinside(String ifinside) {
        this.ifinside = ifinside;
    }

    /**
    * 获取-主保方赔案号
    * @return mainclaimno
     */
    public String getMainclaimno() {
        return mainclaimno;
    }

    /**
    * 设置-主保方赔案号
    * @paramType java.lang.String
    * @param mainclaimno - 主保方赔案号
     */
    public void setMainclaimno(String mainclaimno) {
        this.mainclaimno = mainclaimno;
    }

    /**
    * 获取-垫付另外一条赔案的主键
    * @return seqpaymentcopy
     */
    public BigDecimal getSeqpaymentcopy() {
        return seqpaymentcopy;
    }

    /**
    * 设置-垫付另外一条赔案的主键
    * @paramType java.math.BigDecimal
    * @param seqpaymentcopy - 垫付另外一条赔案的主键
     */
    public void setSeqpaymentcopy(BigDecimal seqpaymentcopy) {
        this.seqpaymentcopy = seqpaymentcopy;
    }

    /**
    * 获取-跟单方机构代码
    * @return gdunitcode
     */
    public String getGdunitcode() {
        return gdunitcode;
    }

    /**
    * 设置-跟单方机构代码
    * @paramType java.lang.String
    * @param gdunitcode - 跟单方机构代码
     */
    public void setGdunitcode(String gdunitcode) {
        this.gdunitcode = gdunitcode;
    }

    /**
    * 获取-跟单方机构名称
    * @return gdunitname
     */
    public String getGdunitname() {
        return gdunitname;
    }

    /**
    * 设置-跟单方机构名称
    * @paramType java.lang.String
    * @param gdunitname - 跟单方机构名称
     */
    public void setGdunitname(String gdunitname) {
        this.gdunitname = gdunitname;
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
    * 获取-税额
    * @return taxesamount
     */
    public BigDecimal getTaxesamount() {
        return taxesamount;
    }

    /**
    * 设置-税额
    * @paramType java.math.BigDecimal
    * @param taxesamount - 税额
     */
    public void setTaxesamount(BigDecimal taxesamount) {
        this.taxesamount = taxesamount;
    }

    /**
    * 获取-业务来源
    * @return businesssource
     */
    public String getBusinesssource() {
        return businesssource;
    }

    /**
    * 设置-业务来源
    * @paramType java.lang.String
    * @param businesssource - 业务来源
     */
    public void setBusinesssource(String businesssource) {
        this.businesssource = businesssource;
    }

    /**
    * 获取-团队类型
    * @return grouptype
     */
    public String getGrouptype() {
        return grouptype;
    }

    /**
    * 设置-团队类型
    * @paramType java.lang.String
    * @param grouptype - 团队类型
     */
    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype;
    }

    /**
    * 获取-车辆使用性质
    * @return useporperty
     */
    public String getUseporperty() {
        return useporperty;
    }

    /**
    * 设置-车辆使用性质
    * @paramType java.lang.String
    * @param useporperty - 车辆使用性质
     */
    public void setUseporperty(String useporperty) {
        this.useporperty = useporperty;
    }

    /**
    * 获取-车辆规格特性
    * @return characteristics
     */
    public String getCharacteristics() {
        return characteristics;
    }

    /**
    * 设置-车辆规格特性
    * @paramType java.lang.String
    * @param characteristics - 车辆规格特性
     */
    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    /**
    * 获取-车辆用途
    * @return carusetype
     */
    public String getCarusetype() {
        return carusetype;
    }

    /**
    * 设置-车辆用途
    * @paramType java.lang.String
    * @param carusetype - 车辆用途
     */
    public void setCarusetype(String carusetype) {
        this.carusetype = carusetype;
    }

    /**
    * 获取-车辆类型
    * @return vehkind
     */
    public String getVehkind() {
        return vehkind;
    }

    /**
    * 设置-车辆类型
    * @paramType java.lang.String
    * @param vehkind - 车辆类型
     */
    public void setVehkind(String vehkind) {
        this.vehkind = vehkind;
    }

    /**
    * 获取-挂账兑换人民币汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-挂账兑换人民币汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 挂账兑换人民币汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
    }
}