package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_payablemoney_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPayablemoneyTd {
    /**
     * 待付款流水号
     */
    private Long payableno;

    /**
     * 待付款批次号
     */
    private Long payableseq;

    /**
     * 用于区分数据的来源和后续处理的业务类型， 参见业务类型表中已挂待付款XX的业务类别
     */
    private String datatype;

    /**
     * 比如赔案挂待付款写赔案的流水号，预收转待付款写预收的流水号，如果是多笔转过来则写9999999999即可
     */
    private Long fatherno;

    /**
     * 储金返还的数据会有小汇总号 手续费数据的提取单号也放在这里边 车船税的申报单号也写在这里边
     */
    private String summaryno;

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
     * 金额（记账币种）
     */
    private BigDecimal amount;

    /**
     * 已处理金额（记账币种）
     */
    private BigDecimal usedamount;

    /**
     * 币种（保单币种），备用
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
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称（中文）
     */
    private String customername;

    /**
     * 0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被作废并红冲 5 由于取消其他记录产生的红冲记录  9 未审核（审核标记）;0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收款表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）
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
     * 系统时间
     */
    private Date lastopdate;

    /**
     * 业务部门代码
     */
    private String departmentcode;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 业务系统对结算信息的额外描述。由前端录入。
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
     * 客户银行代码
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
     * 赔案号
     */
    private String claimno;

    /**
     * 储金返还序号
     */
    private String returnno;

    /**
     * 此记录被作废的系统时间
     */
    private Date canceldate;

    /**
     * 含义改变了，请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history 
     */
    private String datasource;

    /**
     * 取消标识
     */
    private String cancelflag;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * PAYTYPE是对应DATATYPE的大类。对于付款： 1=赔款，DATATYPE包含{ "302", "304", "308", "311", "313", "315", "317", "319", "321" }；2=退保，DATATYPE包含{ "101", "103", "107" }；3=退储{ "201", "204", "206" }，DATATYPE包含；4=储金返还，DATATYPE包含{ "208" }；5=其他应付款，DATATYPE包含{ "407" }；6=手续费，DATATYPE包含{ "502", "504", "508", "512", "514" }
     */
    private String paytype;

    /**
     * hibernate版本号
     */
    private Integer hibernateversion;

    /**
     * 用于区分退保挂待付的时候是否已经生效 0 未生效 1已生效
     */
    private String ifeffect;

    /**
     * 赔款=赔案的赔付序号,手续费=手续费序号
     */
    private String serialno;

    /**
     * 卡式保单冲销号
     */
    private String cardpolicyno;

    /**
     * 期初迁移的数据在老系统的待付款流水号
     */
    private String waitpayno;

    /**
     * 一次赔付的多个客户的序号
     */
    private String custseq;

    /**
     * 票据用途，对应payment.zpyt
     */
    private String inpaymentbatchno;

    /**
     * 业务性质
     */
    private String businessattr;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 经办人，落地时插入
     */
    private String transactorcode;

    /**
     * 指定收付款机构
     */
    private String inpaymentdepartment;

    /**
     * 预约保单、卡式保单已冲销金额（记账币种）
     */
    private BigDecimal closeamount;

    /**
     * 预约保单、卡式保单已冲销金额（保单币种）
     */
    private BigDecimal basecloseamount;

    /**
     * 是否共联保
     */
    private String hascoins;

    /**
     * 是否分期
     */
    private String hasplan;

    /**
     * 是否见费出单
     */
    private String hasfee;

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
     * 客户账户名称
     */
    private String custaccountname;

    /**
     * 客户账户名称(英文)
     */
    private String custaccountnameen;

    /**
     * 理赔费用类型描述
     */
    private String chargedescription;

    /**
     * 展业渠道
     */
    private String businesschannel;

    /**
     * 合同类型
     */
    private String contracttype;

    /**
     * 承保期限  000001   短期(一年以内) 000002  一年期 000003  一年以上定期   000004  不定期
     */
    private String insuranceterm;

    /**
     * 险类
     */
    private String classeskind;

    /**
     * 投保确认码
     */
    private String confirmsequenceno;

    /**
     * 上传标志 0 不上传 1上传
     */
    private String ifupload;

    /**
     * 涉农标志
     */
    private String farmflag;

    /**
     * 发票开票金额
     */
    private BigDecimal invoiceamount;

    /**
     * 出险时间
     */
    private Date damagedate;

    /**
     * 是否预付赔款,0不是预付，1是预付
     */
    private String claimtype;

    /**
     * 客户开户行所在省份
     */
    private String bankprovince;

    /**
     * 客户开户行所在市
     */
    private String bankcity;

    /**
     * 客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
     */
    private String banktype;

    /**
     * 银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
     */
    private String ispaypublic;

    /**
     * 对接资金账单号
     */
    private String billcode;

    /**
     * 是否退票0：未退票 1：已退票
     */
    private String ifbillback;

    /**
     * 支付号，此字段目前只用来记录手续费的支付号
     */
    private String paycode;

    /**
     * 应付比例金额,只用于分期缴费保单的赔款数据
     */
    private BigDecimal proportionamount;

    /**
     * 结案追加码
     */
    private String claimaddcode;

    /**
     * 手工结算单号，小币种结算单场景使用本字段
     */
    private String settlementno;

    /**
     * 支付方式： 51 现金付款、 52 银行转账付款、53支票付款 
     */
    private String paymentmethod;

    /**
     * 例外状态：0-正常，1-支付至责任保险第三者，2-法院判决，3-共保业务，4-交强险垫/预付，5-车辆过户，6-其他。
     */
    private String exstatus;

    /**
     * 针对“例外状态”的说明
     */
    private String exceptioncause;

    /**
     * 异地标识
     */
    private String iflocal;

    /**
     * 客户手机号
     */
    private String mobilenumber;

    /**
     * 报案号
     */
    private String reportcaseno;

    /**
     * 审核状态
     */
    private String checkstatus;

    /**
     * 审核人员
     */
    private String checkcode;

    /**
     * 审核时间
     */
    private Date checkdate;

    /**
     * 审核意见
     */
    private String checkcontent;

    /**
     * 业务来源表的主键
     */
    private BigDecimal sourceno;

    /**
     * 备注
     */
    private String remark;

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
     * 车牌号
     */
    private String vehicleno;

    /**
     * 配对编号
     */
    private String pairno;

    /**
     * 客户开户行的银行区域代码
     */
    private String bankarea;

    /**
     * 业务类型.业务类型,1:保单,2:赔案,3:手续费,5:再保结算单,6:赔款结算单
     */
    private String certitype;

    /**
     * 加急标志。  "0 - 普通 1 - 加急"
     */
    private String fastflag;

    /**
     * 短信通知标志
     */
    private String smsflag;

    /**
     * 客户代理银行名称
     */
    private String custagentbankname;

    /**
     * 客户代理银行地址
     */
    private String custagentbankaddr;

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
     * 客户银行在代理银行的帐号
     */
    private String custagentaccountno;

    /**
     * 制单人工号
     */
    private String operatorcode;

    /**
     * 制单人名称
     */
    private String operatorname;

    /**
     * 是否做子险拆分 0 不拆分 1拆分
     */
    private String issplitted;

    /**
     * 客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外
     */
    private String custaccountarea;

    /**
     * 客户银行地址，境外汇款时使用
     */
    private String custbankaddr;

    /**
     * Swift Code：即国际银行代码，境外汇款时使用
     */
    private String custbankswiftcode;

    /**
     * 国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA
     */
    private String custchargetype;

    /**
     *  汇率
     */
    private BigDecimal exchangerate;

    /**
     * 是否预结手续费，卡单预结手续费时必填，0 否，1 是
     */
    private String ifprecost;

    /**
     * 计算书号
     */
    private String certino;

    /**
     * 理赔赔付批次号
     */
    private String paybatchno;

    /**
     * 联共保号
     */
    private String coinsurno;

    /**
     * 兑换币种
     */
    private String exchangecurrencycode;

    /**
     * 兑换金额
     */
    private BigDecimal exchangeamount;

    /**
     * 保单币种税额
     */
    private BigDecimal basetaxesamount;

    /**
     * 结算币种税额
     */
    private BigDecimal taxesamount;

    /**
     * 投保单号/批改申请单号
     */
    private String businessno;

    /**
     * 业务来源
     */
    private String businesssource;

    /**
     * 客户类型
     */
    private String customertype;

    /**
     * 帐单序号
     */
    private String totalserialno;

    /**
     * 个团标志
     */
    private String groupflag;

    /**
     * 团队类型
     */
    private String grouptype;

    /**
     * 报批号
     */
    private String batchnumber;

    /**
     * 外部系统来源
     */
    private String outdatasource;

    /**
     * 客户来源
     */
    private String customersource;

    /**
     * 代理人类型
     */
    private String agenttype;

    /**
     * 涉农类别
     */
    private String farmflagcode;

    /**
     * 保费补贴来源编码
     */
    private String premiumsource;

    /**
     * 车辆使用性质
     */
    private String useporperty;

    /**
     * 车辆种类
     */
    private String vehkind;

    /**
     * 车辆规格特性
     */
    private String characteristics;

    /**
     * 农业险政策性
     */
    private String farpolicytype;

    /**
     * 结算类型：0 无票支付  1 有票支付 2 先支付后开票
     */
    private String settlementtype;

    /**
     * 车辆用途
     */
    private String carusetype;

    /**
     * 无红票退款不退税金额
     */
    private BigDecimal confirmamount;

    /**
     * 主保单号
     */
    private String mainpolicyno;

    /**
     * 无红票退款确认状态 1 未确认 2已确认
     */
    private String confirmstatus;

    /**
     * 税金金额，保留6位数
     */
    private BigDecimal taxesamount1;

    /**
     * 开户行联行号名称
     */
    private String custbankname;

    /**
     * 结算的手续费业务归属：0 车险 1 团险 2 个险
     */
    private String businessbelong;

    /**
    * 获取-待付款流水号
    * @return payableno
     */
    public Long getPayableno() {
        return payableno;
    }

    /**
    * 设置-待付款流水号
    * @paramType java.lang.Long
    * @param payableno - 待付款流水号
     */
    public void setPayableno(Long payableno) {
        this.payableno = payableno;
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
    * 获取-用于区分数据的来源和后续处理的业务类型， 参见业务类型表中已挂待付款XX的业务类别
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-用于区分数据的来源和后续处理的业务类型， 参见业务类型表中已挂待付款XX的业务类别
    * @paramType java.lang.String
    * @param datatype - 用于区分数据的来源和后续处理的业务类型， 参见业务类型表中已挂待付款XX的业务类别
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-比如赔案挂待付款写赔案的流水号，预收转待付款写预收的流水号，如果是多笔转过来则写9999999999即可
    * @return fatherno
     */
    public Long getFatherno() {
        return fatherno;
    }

    /**
    * 设置-比如赔案挂待付款写赔案的流水号，预收转待付款写预收的流水号，如果是多笔转过来则写9999999999即可
    * @paramType java.lang.Long
    * @param fatherno - 比如赔案挂待付款写赔案的流水号，预收转待付款写预收的流水号，如果是多笔转过来则写9999999999即可
     */
    public void setFatherno(Long fatherno) {
        this.fatherno = fatherno;
    }

    /**
    * 获取-储金返还的数据会有小汇总号 手续费数据的提取单号也放在这里边 车船税的申报单号也写在这里边
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-储金返还的数据会有小汇总号 手续费数据的提取单号也放在这里边 车船税的申报单号也写在这里边
    * @paramType java.lang.String
    * @param summaryno - 储金返还的数据会有小汇总号 手续费数据的提取单号也放在这里边 车船税的申报单号也写在这里边
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
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
    * 获取-币种（保单币种），备用
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-币种（保单币种），备用
    * @paramType java.lang.String
    * @param basecurrencycode - 币种（保单币种），备用
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
    * 获取-客户名称（中文）
    * @return customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
    * 设置-客户名称（中文）
    * @paramType java.lang.String
    * @param customername - 客户名称（中文）
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
    * 获取-0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被作废并红冲 5 由于取消其他记录产生的红冲记录  9 未审核（审核标记）;0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收款表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被作废并红冲 5 由于取消其他记录产生的红冲记录  9 未审核（审核标记）;0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收款表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）
    * @paramType java.lang.String
    * @param opstatus - 0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被作废并红冲 5 由于取消其他记录产生的红冲记录  9 未审核（审核标记）;0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收款表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）
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
    * 获取-系统时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-系统时间
    * @paramType java.util.Date
    * @param lastopdate - 系统时间
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
    * 获取-业务系统对结算信息的额外描述。由前端录入。
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-业务系统对结算信息的额外描述。由前端录入。
    * @paramType java.lang.String
    * @param description - 业务系统对结算信息的额外描述。由前端录入。
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
    * 获取-客户银行代码
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户银行代码
    * @paramType java.lang.String
    * @param custaccountno - 客户银行代码
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
    * 获取-此记录被作废的系统时间
    * @return canceldate
     */
    public Date getCanceldate() {
        return canceldate;
    }

    /**
    * 设置-此记录被作废的系统时间
    * @paramType java.util.Date
    * @param canceldate - 此记录被作废的系统时间
     */
    public void setCanceldate(Date canceldate) {
        this.canceldate = canceldate;
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
    * 获取-取消标识
    * @return cancelflag
     */
    public String getCancelflag() {
        return cancelflag;
    }

    /**
    * 设置-取消标识
    * @paramType java.lang.String
    * @param cancelflag - 取消标识
     */
    public void setCancelflag(String cancelflag) {
        this.cancelflag = cancelflag;
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
    * 获取-PAYTYPE是对应DATATYPE的大类。对于付款： 1=赔款，DATATYPE包含{ "302", "304", "308", "311", "313", "315", "317", "319", "321" }；2=退保，DATATYPE包含{ "101", "103", "107" }；3=退储{ "201", "204", "206" }，DATATYPE包含；4=储金返还，DATATYPE包含{ "208" }；5=其他应付款，DATATYPE包含{ "407" }；6=手续费，DATATYPE包含{ "502", "504", "508", "512", "514" }
    * @return paytype
     */
    public String getPaytype() {
        return paytype;
    }

    /**
    * 设置-PAYTYPE是对应DATATYPE的大类。对于付款： 1=赔款，DATATYPE包含{ "302", "304", "308", "311", "313", "315", "317", "319", "321" }；2=退保，DATATYPE包含{ "101", "103", "107" }；3=退储{ "201", "204", "206" }，DATATYPE包含；4=储金返还，DATATYPE包含{ "208" }；5=其他应付款，DATATYPE包含{ "407" }；6=手续费，DATATYPE包含{ "502", "504", "508", "512", "514" }
    * @paramType java.lang.String
    * @param paytype - PAYTYPE是对应DATATYPE的大类。对于付款： 1=赔款，DATATYPE包含{ "302", "304", "308", "311", "313", "315", "317", "319", "321" }；2=退保，DATATYPE包含{ "101", "103", "107" }；3=退储{ "201", "204", "206" }，DATATYPE包含；4=储金返还，DATATYPE包含{ "208" }；5=其他应付款，DATATYPE包含{ "407" }；6=手续费，DATATYPE包含{ "502", "504", "508", "512", "514" }
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
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
    * 获取-用于区分退保挂待付的时候是否已经生效 0 未生效 1已生效
    * @return ifeffect
     */
    public String getIfeffect() {
        return ifeffect;
    }

    /**
    * 设置-用于区分退保挂待付的时候是否已经生效 0 未生效 1已生效
    * @paramType java.lang.String
    * @param ifeffect - 用于区分退保挂待付的时候是否已经生效 0 未生效 1已生效
     */
    public void setIfeffect(String ifeffect) {
        this.ifeffect = ifeffect;
    }

    /**
    * 获取-赔款=赔案的赔付序号,手续费=手续费序号
    * @return serialno
     */
    public String getSerialno() {
        return serialno;
    }

    /**
    * 设置-赔款=赔案的赔付序号,手续费=手续费序号
    * @paramType java.lang.String
    * @param serialno - 赔款=赔案的赔付序号,手续费=手续费序号
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
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
    * 获取-期初迁移的数据在老系统的待付款流水号
    * @return waitpayno
     */
    public String getWaitpayno() {
        return waitpayno;
    }

    /**
    * 设置-期初迁移的数据在老系统的待付款流水号
    * @paramType java.lang.String
    * @param waitpayno - 期初迁移的数据在老系统的待付款流水号
     */
    public void setWaitpayno(String waitpayno) {
        this.waitpayno = waitpayno;
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
    * 获取-业务性质
    * @return businessattr
     */
    public String getBusinessattr() {
        return businessattr;
    }

    /**
    * 设置-业务性质
    * @paramType java.lang.String
    * @param businessattr - 业务性质
     */
    public void setBusinessattr(String businessattr) {
        this.businessattr = businessattr;
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
    * 获取-经办人，落地时插入
    * @return transactorcode
     */
    public String getTransactorcode() {
        return transactorcode;
    }

    /**
    * 设置-经办人，落地时插入
    * @paramType java.lang.String
    * @param transactorcode - 经办人，落地时插入
     */
    public void setTransactorcode(String transactorcode) {
        this.transactorcode = transactorcode;
    }

    /**
    * 获取-指定收付款机构
    * @return inpaymentdepartment
     */
    public String getInpaymentdepartment() {
        return inpaymentdepartment;
    }

    /**
    * 设置-指定收付款机构
    * @paramType java.lang.String
    * @param inpaymentdepartment - 指定收付款机构
     */
    public void setInpaymentdepartment(String inpaymentdepartment) {
        this.inpaymentdepartment = inpaymentdepartment;
    }

    /**
    * 获取-预约保单、卡式保单已冲销金额（记账币种）
    * @return closeamount
     */
    public BigDecimal getCloseamount() {
        return closeamount;
    }

    /**
    * 设置-预约保单、卡式保单已冲销金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param closeamount - 预约保单、卡式保单已冲销金额（记账币种）
     */
    public void setCloseamount(BigDecimal closeamount) {
        this.closeamount = closeamount;
    }

    /**
    * 获取-预约保单、卡式保单已冲销金额（保单币种）
    * @return basecloseamount
     */
    public BigDecimal getBasecloseamount() {
        return basecloseamount;
    }

    /**
    * 设置-预约保单、卡式保单已冲销金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param basecloseamount - 预约保单、卡式保单已冲销金额（保单币种）
     */
    public void setBasecloseamount(BigDecimal basecloseamount) {
        this.basecloseamount = basecloseamount;
    }

    /**
    * 获取-是否共联保
    * @return hascoins
     */
    public String getHascoins() {
        return hascoins;
    }

    /**
    * 设置-是否共联保
    * @paramType java.lang.String
    * @param hascoins - 是否共联保
     */
    public void setHascoins(String hascoins) {
        this.hascoins = hascoins;
    }

    /**
    * 获取-是否分期
    * @return hasplan
     */
    public String getHasplan() {
        return hasplan;
    }

    /**
    * 设置-是否分期
    * @paramType java.lang.String
    * @param hasplan - 是否分期
     */
    public void setHasplan(String hasplan) {
        this.hasplan = hasplan;
    }

    /**
    * 获取-是否见费出单
    * @return hasfee
     */
    public String getHasfee() {
        return hasfee;
    }

    /**
    * 设置-是否见费出单
    * @paramType java.lang.String
    * @param hasfee - 是否见费出单
     */
    public void setHasfee(String hasfee) {
        this.hasfee = hasfee;
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
    * 获取-理赔费用类型描述
    * @return chargedescription
     */
    public String getChargedescription() {
        return chargedescription;
    }

    /**
    * 设置-理赔费用类型描述
    * @paramType java.lang.String
    * @param chargedescription - 理赔费用类型描述
     */
    public void setChargedescription(String chargedescription) {
        this.chargedescription = chargedescription;
    }

    /**
    * 获取-展业渠道
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-展业渠道
    * @paramType java.lang.String
    * @param businesschannel - 展业渠道
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
    }

    /**
    * 获取-合同类型
    * @return contracttype
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
    * 设置-合同类型
    * @paramType java.lang.String
    * @param contracttype - 合同类型
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
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
    * 获取-涉农标志
    * @return farmflag
     */
    public String getFarmflag() {
        return farmflag;
    }

    /**
    * 设置-涉农标志
    * @paramType java.lang.String
    * @param farmflag - 涉农标志
     */
    public void setFarmflag(String farmflag) {
        this.farmflag = farmflag;
    }

    /**
    * 获取-发票开票金额
    * @return invoiceamount
     */
    public BigDecimal getInvoiceamount() {
        return invoiceamount;
    }

    /**
    * 设置-发票开票金额
    * @paramType java.math.BigDecimal
    * @param invoiceamount - 发票开票金额
     */
    public void setInvoiceamount(BigDecimal invoiceamount) {
        this.invoiceamount = invoiceamount;
    }

    /**
    * 获取-出险时间
    * @return damagedate
     */
    public Date getDamagedate() {
        return damagedate;
    }

    /**
    * 设置-出险时间
    * @paramType java.util.Date
    * @param damagedate - 出险时间
     */
    public void setDamagedate(Date damagedate) {
        this.damagedate = damagedate;
    }

    /**
    * 获取-是否预付赔款,0不是预付，1是预付
    * @return claimtype
     */
    public String getClaimtype() {
        return claimtype;
    }

    /**
    * 设置-是否预付赔款,0不是预付，1是预付
    * @paramType java.lang.String
    * @param claimtype - 是否预付赔款,0不是预付，1是预付
     */
    public void setClaimtype(String claimtype) {
        this.claimtype = claimtype;
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
    * 获取-客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
    * @return banktype
     */
    public String getBanktype() {
        return banktype;
    }

    /**
    * 设置-客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
    * @paramType java.lang.String
    * @param banktype - 客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
     */
    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    /**
    * 获取-银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
    * @return ispaypublic
     */
    public String getIspaypublic() {
        return ispaypublic;
    }

    /**
    * 设置-银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
    * @paramType java.lang.String
    * @param ispaypublic - 银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
     */
    public void setIspaypublic(String ispaypublic) {
        this.ispaypublic = ispaypublic;
    }

    /**
    * 获取-对接资金账单号
    * @return billcode
     */
    public String getBillcode() {
        return billcode;
    }

    /**
    * 设置-对接资金账单号
    * @paramType java.lang.String
    * @param billcode - 对接资金账单号
     */
    public void setBillcode(String billcode) {
        this.billcode = billcode;
    }

    /**
    * 获取-是否退票0：未退票 1：已退票
    * @return ifbillback
     */
    public String getIfbillback() {
        return ifbillback;
    }

    /**
    * 设置-是否退票0：未退票 1：已退票
    * @paramType java.lang.String
    * @param ifbillback - 是否退票0：未退票 1：已退票
     */
    public void setIfbillback(String ifbillback) {
        this.ifbillback = ifbillback;
    }

    /**
    * 获取-支付号，此字段目前只用来记录手续费的支付号
    * @return paycode
     */
    public String getPaycode() {
        return paycode;
    }

    /**
    * 设置-支付号，此字段目前只用来记录手续费的支付号
    * @paramType java.lang.String
    * @param paycode - 支付号，此字段目前只用来记录手续费的支付号
     */
    public void setPaycode(String paycode) {
        this.paycode = paycode;
    }

    /**
    * 获取-应付比例金额,只用于分期缴费保单的赔款数据
    * @return proportionamount
     */
    public BigDecimal getProportionamount() {
        return proportionamount;
    }

    /**
    * 设置-应付比例金额,只用于分期缴费保单的赔款数据
    * @paramType java.math.BigDecimal
    * @param proportionamount - 应付比例金额,只用于分期缴费保单的赔款数据
     */
    public void setProportionamount(BigDecimal proportionamount) {
        this.proportionamount = proportionamount;
    }

    /**
    * 获取-结案追加码
    * @return claimaddcode
     */
    public String getClaimaddcode() {
        return claimaddcode;
    }

    /**
    * 设置-结案追加码
    * @paramType java.lang.String
    * @param claimaddcode - 结案追加码
     */
    public void setClaimaddcode(String claimaddcode) {
        this.claimaddcode = claimaddcode;
    }

    /**
    * 获取-手工结算单号，小币种结算单场景使用本字段
    * @return settlementno
     */
    public String getSettlementno() {
        return settlementno;
    }

    /**
    * 设置-手工结算单号，小币种结算单场景使用本字段
    * @paramType java.lang.String
    * @param settlementno - 手工结算单号，小币种结算单场景使用本字段
     */
    public void setSettlementno(String settlementno) {
        this.settlementno = settlementno;
    }

    /**
    * 获取-支付方式： 51 现金付款、 52 银行转账付款、53支票付款

    * @return paymentmethod
     */
    public String getPaymentmethod() {
        return paymentmethod;
    }

    /**
    * 设置-支付方式： 51 现金付款、 52 银行转账付款、53支票付款

    * @paramType java.lang.String
    * @param paymentmethod - 支付方式： 51 现金付款、 52 银行转账付款、53支票付款

     */
    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
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
    * 获取-异地标识
    * @return iflocal
     */
    public String getIflocal() {
        return iflocal;
    }

    /**
    * 设置-异地标识
    * @paramType java.lang.String
    * @param iflocal - 异地标识
     */
    public void setIflocal(String iflocal) {
        this.iflocal = iflocal;
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
    * 获取-审核人员
    * @return checkcode
     */
    public String getCheckcode() {
        return checkcode;
    }

    /**
    * 设置-审核人员
    * @paramType java.lang.String
    * @param checkcode - 审核人员
     */
    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    /**
    * 获取-审核时间
    * @return checkdate
     */
    public Date getCheckdate() {
        return checkdate;
    }

    /**
    * 设置-审核时间
    * @paramType java.util.Date
    * @param checkdate - 审核时间
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
    * 获取-业务来源表的主键
    * @return sourceno
     */
    public BigDecimal getSourceno() {
        return sourceno;
    }

    /**
    * 设置-业务来源表的主键
    * @paramType java.math.BigDecimal
    * @param sourceno - 业务来源表的主键
     */
    public void setSourceno(BigDecimal sourceno) {
        this.sourceno = sourceno;
    }

    /**
    * 获取-备注
    * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param remark - 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
    * 获取-配对编号
    * @return pairno
     */
    public String getPairno() {
        return pairno;
    }

    /**
    * 设置-配对编号
    * @paramType java.lang.String
    * @param pairno - 配对编号
     */
    public void setPairno(String pairno) {
        this.pairno = pairno;
    }

    /**
    * 获取-客户开户行的银行区域代码
    * @return bankarea
     */
    public String getBankarea() {
        return bankarea;
    }

    /**
    * 设置-客户开户行的银行区域代码
    * @paramType java.lang.String
    * @param bankarea - 客户开户行的银行区域代码
     */
    public void setBankarea(String bankarea) {
        this.bankarea = bankarea;
    }

    /**
    * 获取-业务类型.业务类型,1:保单,2:赔案,3:手续费,5:再保结算单,6:赔款结算单
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-业务类型.业务类型,1:保单,2:赔案,3:手续费,5:再保结算单,6:赔款结算单
    * @paramType java.lang.String
    * @param certitype - 业务类型.业务类型,1:保单,2:赔案,3:手续费,5:再保结算单,6:赔款结算单
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
    }

    /**
    * 获取-加急标志。  "0 - 普通 1 - 加急"
    * @return fastflag
     */
    public String getFastflag() {
        return fastflag;
    }

    /**
    * 设置-加急标志。  "0 - 普通 1 - 加急"
    * @paramType java.lang.String
    * @param fastflag - 加急标志。  "0 - 普通 1 - 加急"
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
    * 获取-客户银行在代理银行的帐号
    * @return custagentaccountno
     */
    public String getCustagentaccountno() {
        return custagentaccountno;
    }

    /**
    * 设置-客户银行在代理银行的帐号
    * @paramType java.lang.String
    * @param custagentaccountno - 客户银行在代理银行的帐号
     */
    public void setCustagentaccountno(String custagentaccountno) {
        this.custagentaccountno = custagentaccountno;
    }

    /**
    * 获取-制单人工号
    * @return operatorcode
     */
    public String getOperatorcode() {
        return operatorcode;
    }

    /**
    * 设置-制单人工号
    * @paramType java.lang.String
    * @param operatorcode - 制单人工号
     */
    public void setOperatorcode(String operatorcode) {
        this.operatorcode = operatorcode;
    }

    /**
    * 获取-制单人名称
    * @return operatorname
     */
    public String getOperatorname() {
        return operatorname;
    }

    /**
    * 设置-制单人名称
    * @paramType java.lang.String
    * @param operatorname - 制单人名称
     */
    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
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
    * 获取-客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外
    * @return custaccountarea
     */
    public String getCustaccountarea() {
        return custaccountarea;
    }

    /**
    * 设置-客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外
    * @paramType java.lang.String
    * @param custaccountarea - 客户账户区域，转账付款必填，默认为0。0 - 国内 1 - 国外
     */
    public void setCustaccountarea(String custaccountarea) {
        this.custaccountarea = custaccountarea;
    }

    /**
    * 获取-客户银行地址，境外汇款时使用
    * @return custbankaddr
     */
    public String getCustbankaddr() {
        return custbankaddr;
    }

    /**
    * 设置-客户银行地址，境外汇款时使用
    * @paramType java.lang.String
    * @param custbankaddr - 客户银行地址，境外汇款时使用
     */
    public void setCustbankaddr(String custbankaddr) {
        this.custbankaddr = custbankaddr;
    }

    /**
    * 获取-Swift Code：即国际银行代码，境外汇款时使用
    * @return custbankswiftcode
     */
    public String getCustbankswiftcode() {
        return custbankswiftcode;
    }

    /**
    * 设置-Swift Code：即国际银行代码，境外汇款时使用
    * @paramType java.lang.String
    * @param custbankswiftcode - Swift Code：即国际银行代码，境外汇款时使用
     */
    public void setCustbankswiftcode(String custbankswiftcode) {
        this.custbankswiftcode = custbankswiftcode;
    }

    /**
    * 获取-国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA
    * @return custchargetype
     */
    public String getCustchargetype() {
        return custchargetype;
    }

    /**
    * 设置-国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA
    * @paramType java.lang.String
    * @param custchargetype - 国内外费用承担：1汇款人OUR、2收款人BEN、3共同SHA
     */
    public void setCustchargetype(String custchargetype) {
        this.custchargetype = custchargetype;
    }

    /**
    * 获取- 汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置- 汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate -  汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
    }

    /**
    * 获取-是否预结手续费，卡单预结手续费时必填，0 否，1 是
    * @return ifprecost
     */
    public String getIfprecost() {
        return ifprecost;
    }

    /**
    * 设置-是否预结手续费，卡单预结手续费时必填，0 否，1 是
    * @paramType java.lang.String
    * @param ifprecost - 是否预结手续费，卡单预结手续费时必填，0 否，1 是
     */
    public void setIfprecost(String ifprecost) {
        this.ifprecost = ifprecost;
    }

    /**
    * 获取-计算书号
    * @return certino
     */
    public String getCertino() {
        return certino;
    }

    /**
    * 设置-计算书号
    * @paramType java.lang.String
    * @param certino - 计算书号
     */
    public void setCertino(String certino) {
        this.certino = certino;
    }

    /**
    * 获取-理赔赔付批次号
    * @return paybatchno
     */
    public String getPaybatchno() {
        return paybatchno;
    }

    /**
    * 设置-理赔赔付批次号
    * @paramType java.lang.String
    * @param paybatchno - 理赔赔付批次号
     */
    public void setPaybatchno(String paybatchno) {
        this.paybatchno = paybatchno;
    }

    /**
    * 获取-联共保号
    * @return coinsurno
     */
    public String getCoinsurno() {
        return coinsurno;
    }

    /**
    * 设置-联共保号
    * @paramType java.lang.String
    * @param coinsurno - 联共保号
     */
    public void setCoinsurno(String coinsurno) {
        this.coinsurno = coinsurno;
    }

    /**
    * 获取-兑换币种
    * @return exchangecurrencycode
     */
    public String getExchangecurrencycode() {
        return exchangecurrencycode;
    }

    /**
    * 设置-兑换币种
    * @paramType java.lang.String
    * @param exchangecurrencycode - 兑换币种
     */
    public void setExchangecurrencycode(String exchangecurrencycode) {
        this.exchangecurrencycode = exchangecurrencycode;
    }

    /**
    * 获取-兑换金额
    * @return exchangeamount
     */
    public BigDecimal getExchangeamount() {
        return exchangeamount;
    }

    /**
    * 设置-兑换金额
    * @paramType java.math.BigDecimal
    * @param exchangeamount - 兑换金额
     */
    public void setExchangeamount(BigDecimal exchangeamount) {
        this.exchangeamount = exchangeamount;
    }

    /**
    * 获取-保单币种税额
    * @return basetaxesamount
     */
    public BigDecimal getBasetaxesamount() {
        return basetaxesamount;
    }

    /**
    * 设置-保单币种税额
    * @paramType java.math.BigDecimal
    * @param basetaxesamount - 保单币种税额
     */
    public void setBasetaxesamount(BigDecimal basetaxesamount) {
        this.basetaxesamount = basetaxesamount;
    }

    /**
    * 获取-结算币种税额
    * @return taxesamount
     */
    public BigDecimal getTaxesamount() {
        return taxesamount;
    }

    /**
    * 设置-结算币种税额
    * @paramType java.math.BigDecimal
    * @param taxesamount - 结算币种税额
     */
    public void setTaxesamount(BigDecimal taxesamount) {
        this.taxesamount = taxesamount;
    }

    /**
    * 获取-投保单号/批改申请单号
    * @return businessno
     */
    public String getBusinessno() {
        return businessno;
    }

    /**
    * 设置-投保单号/批改申请单号
    * @paramType java.lang.String
    * @param businessno - 投保单号/批改申请单号
     */
    public void setBusinessno(String businessno) {
        this.businessno = businessno;
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
    * 获取-客户类型
    * @return customertype
     */
    public String getCustomertype() {
        return customertype;
    }

    /**
    * 设置-客户类型
    * @paramType java.lang.String
    * @param customertype - 客户类型
     */
    public void setCustomertype(String customertype) {
        this.customertype = customertype;
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
    * 获取-个团标志
    * @return groupflag
     */
    public String getGroupflag() {
        return groupflag;
    }

    /**
    * 设置-个团标志
    * @paramType java.lang.String
    * @param groupflag - 个团标志
     */
    public void setGroupflag(String groupflag) {
        this.groupflag = groupflag;
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
    * 获取-报批号
    * @return batchnumber
     */
    public String getBatchnumber() {
        return batchnumber;
    }

    /**
    * 设置-报批号
    * @paramType java.lang.String
    * @param batchnumber - 报批号
     */
    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber;
    }

    /**
    * 获取-外部系统来源
    * @return outdatasource
     */
    public String getOutdatasource() {
        return outdatasource;
    }

    /**
    * 设置-外部系统来源
    * @paramType java.lang.String
    * @param outdatasource - 外部系统来源
     */
    public void setOutdatasource(String outdatasource) {
        this.outdatasource = outdatasource;
    }

    /**
    * 获取-客户来源
    * @return customersource
     */
    public String getCustomersource() {
        return customersource;
    }

    /**
    * 设置-客户来源
    * @paramType java.lang.String
    * @param customersource - 客户来源
     */
    public void setCustomersource(String customersource) {
        this.customersource = customersource;
    }

    /**
    * 获取-代理人类型
    * @return agenttype
     */
    public String getAgenttype() {
        return agenttype;
    }

    /**
    * 设置-代理人类型
    * @paramType java.lang.String
    * @param agenttype - 代理人类型
     */
    public void setAgenttype(String agenttype) {
        this.agenttype = agenttype;
    }

    /**
    * 获取-涉农类别
    * @return farmflagcode
     */
    public String getFarmflagcode() {
        return farmflagcode;
    }

    /**
    * 设置-涉农类别
    * @paramType java.lang.String
    * @param farmflagcode - 涉农类别
     */
    public void setFarmflagcode(String farmflagcode) {
        this.farmflagcode = farmflagcode;
    }

    /**
    * 获取-保费补贴来源编码
    * @return premiumsource
     */
    public String getPremiumsource() {
        return premiumsource;
    }

    /**
    * 设置-保费补贴来源编码
    * @paramType java.lang.String
    * @param premiumsource - 保费补贴来源编码
     */
    public void setPremiumsource(String premiumsource) {
        this.premiumsource = premiumsource;
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
    * 获取-农业险政策性
    * @return farpolicytype
     */
    public String getFarpolicytype() {
        return farpolicytype;
    }

    /**
    * 设置-农业险政策性
    * @paramType java.lang.String
    * @param farpolicytype - 农业险政策性
     */
    public void setFarpolicytype(String farpolicytype) {
        this.farpolicytype = farpolicytype;
    }

    /**
    * 获取-结算类型：0 无票支付  1 有票支付 2 先支付后开票
    * @return settlementtype
     */
    public String getSettlementtype() {
        return settlementtype;
    }

    /**
    * 设置-结算类型：0 无票支付  1 有票支付 2 先支付后开票
    * @paramType java.lang.String
    * @param settlementtype - 结算类型：0 无票支付  1 有票支付 2 先支付后开票
     */
    public void setSettlementtype(String settlementtype) {
        this.settlementtype = settlementtype;
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
    * 获取-无红票退款不退税金额
    * @return confirmamount
     */
    public BigDecimal getConfirmamount() {
        return confirmamount;
    }

    /**
    * 设置-无红票退款不退税金额
    * @paramType java.math.BigDecimal
    * @param confirmamount - 无红票退款不退税金额
     */
    public void setConfirmamount(BigDecimal confirmamount) {
        this.confirmamount = confirmamount;
    }

    /**
    * 获取-主保单号
    * @return mainpolicyno
     */
    public String getMainpolicyno() {
        return mainpolicyno;
    }

    /**
    * 设置-主保单号
    * @paramType java.lang.String
    * @param mainpolicyno - 主保单号
     */
    public void setMainpolicyno(String mainpolicyno) {
        this.mainpolicyno = mainpolicyno;
    }

    /**
    * 获取-无红票退款确认状态 1 未确认 2已确认
    * @return confirmstatus
     */
    public String getConfirmstatus() {
        return confirmstatus;
    }

    /**
    * 设置-无红票退款确认状态 1 未确认 2已确认
    * @paramType java.lang.String
    * @param confirmstatus - 无红票退款确认状态 1 未确认 2已确认
     */
    public void setConfirmstatus(String confirmstatus) {
        this.confirmstatus = confirmstatus;
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
    * 获取-开户行联行号名称
    * @return custbankname
     */
    public String getCustbankname() {
        return custbankname;
    }

    /**
    * 设置-开户行联行号名称
    * @paramType java.lang.String
    * @param custbankname - 开户行联行号名称
     */
    public void setCustbankname(String custbankname) {
        this.custbankname = custbankname;
    }

    /**
    * 获取-结算的手续费业务归属：0 车险 1 团险 2 个险
    * @return businessbelong
     */
    public String getBusinessbelong() {
        return businessbelong;
    }

    /**
    * 设置-结算的手续费业务归属：0 车险 1 团险 2 个险
    * @paramType java.lang.String
    * @param businessbelong - 结算的手续费业务归属：0 车险 1 团险 2 个险
     */
    public void setBusinessbelong(String businessbelong) {
        this.businessbelong = businessbelong;
    }
}