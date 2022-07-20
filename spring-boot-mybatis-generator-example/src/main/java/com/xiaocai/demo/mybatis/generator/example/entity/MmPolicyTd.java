package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policy_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicyTd {
    /**
     * 主键
     */
    private Long seqpolicy;

    /**
     * 分公司代码
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
     * 已入帐金额(保单币种)
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
     * 已开发票金额(保单币种)
     */
    private BigDecimal invoiceamount;

    /**
     * 发票到款金额（保单币种）
     */
    private BigDecimal invoicepaidamount;

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
    private BigDecimal operatedtimes;

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
     * 含义改变了，请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history 
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
     * 业务系统录入日期
     */
    private Date inputdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 结算单号
     */
    private String handoverno;

    /**
     * 1有效 2退保 3注销 4终止责任
     */
    private String policystatus;

    /**
     * 1新保 2续保 3公司内转保 4公司间转保
     */
    private String policyattr;

    /**
     * 车牌号，车险系统可以将车牌号写入，用于通过此字段查出相关的商业险、交强险、车船税
     */
    private String vehicleno;

    /**
     * 用于控制退保批单能否进行付款操作 0  可直接付款 1 只能用于冲抵保费
     */
    private String canpay;

    /**
     * 用于区分数据的来源和后续处理的业务类型， 参见业务类型表中的业务数据类别，比如101、102、103等等
     */
    private String datatype;

    /**
     * 承保数量
     */
    private BigDecimal insurencecount;

    /**
     * 储金返还的数据会有小汇总号 手续费数据的提取单号也放在这里边 车船税的申报单号也写在这里边
     */
    private String summaryno;

    /**
     * 车船税状态 ：（00：待确认；01待申报，11：已申报）        /* 00        未缴 11        完税 22        减税 33        免税 44        暂缓 55        缓税 99        拒缴 */
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
     * 已申报金额
     */
    private BigDecimal usedtaxamount;

    /**
     * 是否允许回退综合统计，0=不允许，1=允许
     */
    private String ifback;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 立案号
     */
    private String caseno;

    /**
     * 是否见费出单标志,0:不是.1:是
     */
    private String feeflag;

    /**
     * 自购赠与标志,0:否,1:自购,2:赠与,3:捐赠
     */
    private String donateflag;

    /**
     * 预约标志,0:普通,1:预约保单,2:卡业务收款单
     */
    private String protocolflag;

    /**
     * 通收通付时指定的收付款部门
     */
    private String inpaymentdepartment;

    /**
     * 主要针对付款的控制，保单主要指退保;0:无约束，1:内传冲抵，2:银行
     */
    private String inpaymentmethod;

    /**
     * 0 自缴 1 中央财政补助 2 省级财政补助 3地市县财政补助  4 其他
     */
    private String farmflag;

    /**
     * 客户序号
     */
    private String custseq;

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
     * 客户开户行代码（开户行联行号）
     */
    private String custbankno;

    /**
     * 客户银行名称
     */
    private String bankname;

    /**
     * 客户帐号
     */
    private String custaccountno;

    /**
     * 车险支付号
     */
    private String inpaymentno;

    /**
     * 承保期限  000001   短期(一年以内) 000002  一年期 000003  一年以上定期   000004  不定期
     */
    private String insuranceterm;

    /**
     * 分期缴费次数(是指本次业务是第几期分期付款而不是总共分几期付款的信息)
     */
    private BigDecimal installmentstimes;

    /**
     * 保单税费提取状态 0：未提取 1:已提取 3:已取消
     */
    private String policytaxstatus;

    /**
     * 投保确认码
     */
    private String confirmsequenceno;

    /**
     * 上传标志 0 不上传 1上传
     */
    private String ifupload;

    /**
     * 订单类型
     */
    private String proposalformno;

    /**
     * 币种结算单号
     */
    private String settlementno;

    /**
     * 收付结算批单对应的入账结算批单的SEQPOLICY
     */
    private BigDecimal sourceno;

    /**
     * 业务系统操作员代码
     */
    private String busiopcode;

    /**
     * 代理点代码
     */
    private String offersite;

    /**
     * 投保地代码
     */
    private String insuranceaddresscode;

    /**
     * 投保地名称
     */
    private String insuranceaddressname;

    /**
     * 上期保单终止日期
     */
    private Date lastpolicyenddate;

    /**
     * 险种条款代码
     */
    private String classesitemcode;

    /**
     * 险种条款名称
     */
    private String classesitemname;

    /**
     * 促销标志：3A东风本田,3B本田思域,3C依维柯，另：businessattr=4该值送null
     */
    private String isactiveflag;

    /**
     * 是否小额大单业务：01是，不是小额大单业务该值不送
     */
    private String isbatchsettlement;

    /**
     * mm_policy_ti.id
     */
    private BigDecimal seqcharge;

    /**
     * 约定结算币种代码
     */
    private String exchangecurrencycode;

    /**
     * 约定结算金额
     */
    private BigDecimal exchangeamount;

    /**
     * 约定汇率
     */
    private BigDecimal exchangerate;

    /**
     * 共保人代码
     */
    private String masterno;

    /**
     * 共保人名称
     */
    private String mastername;

    /**
     * 操作员代码
     */
    private String optcode;

    /**
     * 操作员名称
     */
    private String optname;

    /**
     * 经办人名称
     */
    private String transactorname;

    /**
     * 保费来源
     */
    private String premiumsource;

    /**
     * 是否做子险拆分 0 不拆分 1拆分
     */
    private String issplitted;

    /**
     * 保险卡客户账户区域，转账付款必填，默认为0,0 - 国内 1 - 国外
     */
    private String custaccountarea;

    /**
     * 单证类型
     */
    private String biztype;

    /**
     * 保险卡号
     */
    private String bizno;

    /**
     * 税金金额(包含在总金额amount中)，对于营改增的必传
     */
    private BigDecimal taxesamount;

    /**
     * 税率，对于正数的金额，营改增必传，批减或者退保时可空
     */
    private BigDecimal taxesrate;

    /**
     * 是否是视同销售：0 否 1 将服务用于非增值税应税项目 2将服务用于集体福利或个人消费 3将自产或购买的服务作为投资，提供给其他单位或个体经营者 4将自产或购买的服务分配给股东或投资者 5将自产或购买的服务无偿赠送给其他单位或个人
     */
    private String equalsale;

    /**
     * 客户类型 0非自然人 1自然人 
     */
    private String customertype;

    /**
     * 代收代付标识：0 否  1 是
     */
    private String ifagentbusiness;

    /**
     * 纳税主体
     */
    private String taxorgtally;

    /**
     * 进项税额转出
     */
    private BigDecimal taxesamountout;

    /**
     * 纳税人代码
     */
    private String taxpayercode;

    /**
     * 纳税人名称
     */
    private String taxpayername;

    /**
     * 纳税人识别号
     */
    private String taxpayer;

    /**
     * 纳税人地址
     */
    private String taxesaddress;

    /**
     * 纳税人电话
     */
    private String taxesphone;

    /**
     * 纳税人手机号
     */
    private String taxesmobilephone;

    /**
     * 纳税人邮箱
     */
    private String taxesemail;

    /**
     * 纳税人开户银行
     */
    private String taxesbankname;

    /**
     * 纳税人开户银行账号
     */
    private String taxesaccountno;

    /**
     * 纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
     */
    private String taxespayertype;

    /**
     * 纳税人证件类型 01身份证、02护照、03军官证、04士兵证、05港澳居民来往内地通行证、06台湾居民来往大陆通行证、07其他
     */
    private String taxescertificatetype;

    /**
     * 纳税人证件号
     */
    private String taxescertificateno;

    /**
     * 开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
     */
    private String invoicetype;

    /**
     * 联保类型 0 非联保 1主联方，2从联方
     */
    private String isjointinsurance;

    /**
     * 联保关联单号
     */
    private String jointinsuranceno;

    /**
     * 业务来源
     */
    private String businesssource;

    /**
     * 团队类型
     */
    private String grouptype;

    /**
     * 发票备注信息
     */
    private String invoiceremark;

    /**
     * 代理人类型:0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
     */
    private String agenttype;

    /**
     * 车辆规格特性
     */
    private String characteristics;

    /**
     * 个团标志
     */
    private String groupflag;

    /**
     * 年期标志
     */
    private String periodflag;

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
     * 投保单号/批改申请单号
     */
    private String businessno;

    /**
     * 账单序号
     */
    private String totalserialno;

    /**
     * 涉农类别
     */
    private String farmflagcode;

    /**
     * 车辆种类
     */
    private String vehkind;

    /**
     * 车辆使用性质
     */
    private String useporperty;

    /**
     * 农业险政策性
     */
    private String farpolicytype;

    /**
     * 车辆用途
     */
    private String carusetype;

    /**
     * 批改序号
     */
    private String serialno;

    /**
     * 主保单号
     */
    private String mainpolicyno;

    /**
     * 发票开具方式0开全额发票 1 开我方份额发票
     */
    private String invoiceissueway;

    /**
     * 税金金额，保留6位数
     */
    private BigDecimal taxesamount1;

    /**
     * 挂账兑换人民币汇率
     */
    private BigDecimal cnyexchangerate;

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
    * 获取-已开发票金额(保单币种)
    * @return invoiceamount
     */
    public BigDecimal getInvoiceamount() {
        return invoiceamount;
    }

    /**
    * 设置-已开发票金额(保单币种)
    * @paramType java.math.BigDecimal
    * @param invoiceamount - 已开发票金额(保单币种)
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
    public BigDecimal getOperatedtimes() {
        return operatedtimes;
    }

    /**
    * 设置-已处理次数
    * @paramType java.math.BigDecimal
    * @param operatedtimes - 已处理次数
     */
    public void setOperatedtimes(BigDecimal operatedtimes) {
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
    * 获取-HIBERNATE版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATE版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
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
    * 获取-车牌号，车险系统可以将车牌号写入，用于通过此字段查出相关的商业险、交强险、车船税
    * @return vehicleno
     */
    public String getVehicleno() {
        return vehicleno;
    }

    /**
    * 设置-车牌号，车险系统可以将车牌号写入，用于通过此字段查出相关的商业险、交强险、车船税
    * @paramType java.lang.String
    * @param vehicleno - 车牌号，车险系统可以将车牌号写入，用于通过此字段查出相关的商业险、交强险、车船税
     */
    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    /**
    * 获取-用于控制退保批单能否进行付款操作 0  可直接付款 1 只能用于冲抵保费
    * @return canpay
     */
    public String getCanpay() {
        return canpay;
    }

    /**
    * 设置-用于控制退保批单能否进行付款操作 0  可直接付款 1 只能用于冲抵保费
    * @paramType java.lang.String
    * @param canpay - 用于控制退保批单能否进行付款操作 0  可直接付款 1 只能用于冲抵保费
     */
    public void setCanpay(String canpay) {
        this.canpay = canpay;
    }

    /**
    * 获取-用于区分数据的来源和后续处理的业务类型， 参见业务类型表中的业务数据类别，比如101、102、103等等
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-用于区分数据的来源和后续处理的业务类型， 参见业务类型表中的业务数据类别，比如101、102、103等等
    * @paramType java.lang.String
    * @param datatype - 用于区分数据的来源和后续处理的业务类型， 参见业务类型表中的业务数据类别，比如101、102、103等等
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-承保数量
    * @return insurencecount
     */
    public BigDecimal getInsurencecount() {
        return insurencecount;
    }

    /**
    * 设置-承保数量
    * @paramType java.math.BigDecimal
    * @param insurencecount - 承保数量
     */
    public void setInsurencecount(BigDecimal insurencecount) {
        this.insurencecount = insurencecount;
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
    * 获取-车船税状态 ：（00：待确认；01待申报，11：已申报）        /* 00        未缴 11        完税 22        减税 33        免税 44        暂缓 55        缓税 99        拒缴 */
    * @return taxstate
     */
    public String getTaxstate() {
        return taxstate;
    }

    /**
    * 设置-车船税状态 ：（00：待确认；01待申报，11：已申报）        /* 00        未缴 11        完税 22        减税 33        免税 44        暂缓 55        缓税 99        拒缴 */
    * @paramType java.lang.String
    * @param taxstate - 车船税状态 ：（00：待确认；01待申报，11：已申报）        /* 00        未缴 11        完税 22        减税 33        免税 44        暂缓 55        缓税 99        拒缴 */
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
    * 获取-是否允许回退综合统计，0=不允许，1=允许
    * @return ifback
     */
    public String getIfback() {
        return ifback;
    }

    /**
    * 设置-是否允许回退综合统计，0=不允许，1=允许
    * @paramType java.lang.String
    * @param ifback - 是否允许回退综合统计，0=不允许，1=允许
     */
    public void setIfback(String ifback) {
        this.ifback = ifback;
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
    * 获取-是否见费出单标志,0:不是.1:是
    * @return feeflag
     */
    public String getFeeflag() {
        return feeflag;
    }

    /**
    * 设置-是否见费出单标志,0:不是.1:是
    * @paramType java.lang.String
    * @param feeflag - 是否见费出单标志,0:不是.1:是
     */
    public void setFeeflag(String feeflag) {
        this.feeflag = feeflag;
    }

    /**
    * 获取-自购赠与标志,0:否,1:自购,2:赠与,3:捐赠
    * @return donateflag
     */
    public String getDonateflag() {
        return donateflag;
    }

    /**
    * 设置-自购赠与标志,0:否,1:自购,2:赠与,3:捐赠
    * @paramType java.lang.String
    * @param donateflag - 自购赠与标志,0:否,1:自购,2:赠与,3:捐赠
     */
    public void setDonateflag(String donateflag) {
        this.donateflag = donateflag;
    }

    /**
    * 获取-预约标志,0:普通,1:预约保单,2:卡业务收款单
    * @return protocolflag
     */
    public String getProtocolflag() {
        return protocolflag;
    }

    /**
    * 设置-预约标志,0:普通,1:预约保单,2:卡业务收款单
    * @paramType java.lang.String
    * @param protocolflag - 预约标志,0:普通,1:预约保单,2:卡业务收款单
     */
    public void setProtocolflag(String protocolflag) {
        this.protocolflag = protocolflag;
    }

    /**
    * 获取-通收通付时指定的收付款部门
    * @return inpaymentdepartment
     */
    public String getInpaymentdepartment() {
        return inpaymentdepartment;
    }

    /**
    * 设置-通收通付时指定的收付款部门
    * @paramType java.lang.String
    * @param inpaymentdepartment - 通收通付时指定的收付款部门
     */
    public void setInpaymentdepartment(String inpaymentdepartment) {
        this.inpaymentdepartment = inpaymentdepartment;
    }

    /**
    * 获取-主要针对付款的控制，保单主要指退保;0:无约束，1:内传冲抵，2:银行
    * @return inpaymentmethod
     */
    public String getInpaymentmethod() {
        return inpaymentmethod;
    }

    /**
    * 设置-主要针对付款的控制，保单主要指退保;0:无约束，1:内传冲抵，2:银行
    * @paramType java.lang.String
    * @param inpaymentmethod - 主要针对付款的控制，保单主要指退保;0:无约束，1:内传冲抵，2:银行
     */
    public void setInpaymentmethod(String inpaymentmethod) {
        this.inpaymentmethod = inpaymentmethod;
    }

    /**
    * 获取-0 自缴 1 中央财政补助 2 省级财政补助 3地市县财政补助  4 其他
    * @return farmflag
     */
    public String getFarmflag() {
        return farmflag;
    }

    /**
    * 设置-0 自缴 1 中央财政补助 2 省级财政补助 3地市县财政补助  4 其他
    * @paramType java.lang.String
    * @param farmflag - 0 自缴 1 中央财政补助 2 省级财政补助 3地市县财政补助  4 其他
     */
    public void setFarmflag(String farmflag) {
        this.farmflag = farmflag;
    }

    /**
    * 获取-客户序号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-客户序号
    * @paramType java.lang.String
    * @param custseq - 客户序号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
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
    * 获取-客户银行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-客户银行名称
    * @paramType java.lang.String
    * @param bankname - 客户银行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-客户帐号
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户帐号
    * @paramType java.lang.String
    * @param custaccountno - 客户帐号
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    /**
    * 获取-车险支付号
    * @return inpaymentno
     */
    public String getInpaymentno() {
        return inpaymentno;
    }

    /**
    * 设置-车险支付号
    * @paramType java.lang.String
    * @param inpaymentno - 车险支付号
     */
    public void setInpaymentno(String inpaymentno) {
        this.inpaymentno = inpaymentno;
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
    * 获取-分期缴费次数(是指本次业务是第几期分期付款而不是总共分几期付款的信息)
    * @return installmentstimes
     */
    public BigDecimal getInstallmentstimes() {
        return installmentstimes;
    }

    /**
    * 设置-分期缴费次数(是指本次业务是第几期分期付款而不是总共分几期付款的信息)
    * @paramType java.math.BigDecimal
    * @param installmentstimes - 分期缴费次数(是指本次业务是第几期分期付款而不是总共分几期付款的信息)
     */
    public void setInstallmentstimes(BigDecimal installmentstimes) {
        this.installmentstimes = installmentstimes;
    }

    /**
    * 获取-保单税费提取状态 0：未提取 1:已提取 3:已取消
    * @return policytaxstatus
     */
    public String getPolicytaxstatus() {
        return policytaxstatus;
    }

    /**
    * 设置-保单税费提取状态 0：未提取 1:已提取 3:已取消
    * @paramType java.lang.String
    * @param policytaxstatus - 保单税费提取状态 0：未提取 1:已提取 3:已取消
     */
    public void setPolicytaxstatus(String policytaxstatus) {
        this.policytaxstatus = policytaxstatus;
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
    * 获取-订单类型
    * @return proposalformno
     */
    public String getProposalformno() {
        return proposalformno;
    }

    /**
    * 设置-订单类型
    * @paramType java.lang.String
    * @param proposalformno - 订单类型
     */
    public void setProposalformno(String proposalformno) {
        this.proposalformno = proposalformno;
    }

    /**
    * 获取-币种结算单号
    * @return settlementno
     */
    public String getSettlementno() {
        return settlementno;
    }

    /**
    * 设置-币种结算单号
    * @paramType java.lang.String
    * @param settlementno - 币种结算单号
     */
    public void setSettlementno(String settlementno) {
        this.settlementno = settlementno;
    }

    /**
    * 获取-收付结算批单对应的入账结算批单的SEQPOLICY
    * @return sourceno
     */
    public BigDecimal getSourceno() {
        return sourceno;
    }

    /**
    * 设置-收付结算批单对应的入账结算批单的SEQPOLICY
    * @paramType java.math.BigDecimal
    * @param sourceno - 收付结算批单对应的入账结算批单的SEQPOLICY
     */
    public void setSourceno(BigDecimal sourceno) {
        this.sourceno = sourceno;
    }

    /**
    * 获取-业务系统操作员代码
    * @return busiopcode
     */
    public String getBusiopcode() {
        return busiopcode;
    }

    /**
    * 设置-业务系统操作员代码
    * @paramType java.lang.String
    * @param busiopcode - 业务系统操作员代码
     */
    public void setBusiopcode(String busiopcode) {
        this.busiopcode = busiopcode;
    }

    /**
    * 获取-代理点代码
    * @return offersite
     */
    public String getOffersite() {
        return offersite;
    }

    /**
    * 设置-代理点代码
    * @paramType java.lang.String
    * @param offersite - 代理点代码
     */
    public void setOffersite(String offersite) {
        this.offersite = offersite;
    }

    /**
    * 获取-投保地代码
    * @return insuranceaddresscode
     */
    public String getInsuranceaddresscode() {
        return insuranceaddresscode;
    }

    /**
    * 设置-投保地代码
    * @paramType java.lang.String
    * @param insuranceaddresscode - 投保地代码
     */
    public void setInsuranceaddresscode(String insuranceaddresscode) {
        this.insuranceaddresscode = insuranceaddresscode;
    }

    /**
    * 获取-投保地名称
    * @return insuranceaddressname
     */
    public String getInsuranceaddressname() {
        return insuranceaddressname;
    }

    /**
    * 设置-投保地名称
    * @paramType java.lang.String
    * @param insuranceaddressname - 投保地名称
     */
    public void setInsuranceaddressname(String insuranceaddressname) {
        this.insuranceaddressname = insuranceaddressname;
    }

    /**
    * 获取-上期保单终止日期
    * @return lastpolicyenddate
     */
    public Date getLastpolicyenddate() {
        return lastpolicyenddate;
    }

    /**
    * 设置-上期保单终止日期
    * @paramType java.util.Date
    * @param lastpolicyenddate - 上期保单终止日期
     */
    public void setLastpolicyenddate(Date lastpolicyenddate) {
        this.lastpolicyenddate = lastpolicyenddate;
    }

    /**
    * 获取-险种条款代码
    * @return classesitemcode
     */
    public String getClassesitemcode() {
        return classesitemcode;
    }

    /**
    * 设置-险种条款代码
    * @paramType java.lang.String
    * @param classesitemcode - 险种条款代码
     */
    public void setClassesitemcode(String classesitemcode) {
        this.classesitemcode = classesitemcode;
    }

    /**
    * 获取-险种条款名称
    * @return classesitemname
     */
    public String getClassesitemname() {
        return classesitemname;
    }

    /**
    * 设置-险种条款名称
    * @paramType java.lang.String
    * @param classesitemname - 险种条款名称
     */
    public void setClassesitemname(String classesitemname) {
        this.classesitemname = classesitemname;
    }

    /**
    * 获取-促销标志：3A东风本田,3B本田思域,3C依维柯，另：businessattr=4该值送null
    * @return isactiveflag
     */
    public String getIsactiveflag() {
        return isactiveflag;
    }

    /**
    * 设置-促销标志：3A东风本田,3B本田思域,3C依维柯，另：businessattr=4该值送null
    * @paramType java.lang.String
    * @param isactiveflag - 促销标志：3A东风本田,3B本田思域,3C依维柯，另：businessattr=4该值送null
     */
    public void setIsactiveflag(String isactiveflag) {
        this.isactiveflag = isactiveflag;
    }

    /**
    * 获取-是否小额大单业务：01是，不是小额大单业务该值不送
    * @return isbatchsettlement
     */
    public String getIsbatchsettlement() {
        return isbatchsettlement;
    }

    /**
    * 设置-是否小额大单业务：01是，不是小额大单业务该值不送
    * @paramType java.lang.String
    * @param isbatchsettlement - 是否小额大单业务：01是，不是小额大单业务该值不送
     */
    public void setIsbatchsettlement(String isbatchsettlement) {
        this.isbatchsettlement = isbatchsettlement;
    }

    /**
    * 获取-mm_policy_ti.id
    * @return seqcharge
     */
    public BigDecimal getSeqcharge() {
        return seqcharge;
    }

    /**
    * 设置-mm_policy_ti.id
    * @paramType java.math.BigDecimal
    * @param seqcharge - mm_policy_ti.id
     */
    public void setSeqcharge(BigDecimal seqcharge) {
        this.seqcharge = seqcharge;
    }

    /**
    * 获取-约定结算币种代码
    * @return exchangecurrencycode
     */
    public String getExchangecurrencycode() {
        return exchangecurrencycode;
    }

    /**
    * 设置-约定结算币种代码
    * @paramType java.lang.String
    * @param exchangecurrencycode - 约定结算币种代码
     */
    public void setExchangecurrencycode(String exchangecurrencycode) {
        this.exchangecurrencycode = exchangecurrencycode;
    }

    /**
    * 获取-约定结算金额
    * @return exchangeamount
     */
    public BigDecimal getExchangeamount() {
        return exchangeamount;
    }

    /**
    * 设置-约定结算金额
    * @paramType java.math.BigDecimal
    * @param exchangeamount - 约定结算金额
     */
    public void setExchangeamount(BigDecimal exchangeamount) {
        this.exchangeamount = exchangeamount;
    }

    /**
    * 获取-约定汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-约定汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 约定汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
    }

    /**
    * 获取-共保人代码
    * @return masterno
     */
    public String getMasterno() {
        return masterno;
    }

    /**
    * 设置-共保人代码
    * @paramType java.lang.String
    * @param masterno - 共保人代码
     */
    public void setMasterno(String masterno) {
        this.masterno = masterno;
    }

    /**
    * 获取-共保人名称
    * @return mastername
     */
    public String getMastername() {
        return mastername;
    }

    /**
    * 设置-共保人名称
    * @paramType java.lang.String
    * @param mastername - 共保人名称
     */
    public void setMastername(String mastername) {
        this.mastername = mastername;
    }

    /**
    * 获取-操作员代码
    * @return optcode
     */
    public String getOptcode() {
        return optcode;
    }

    /**
    * 设置-操作员代码
    * @paramType java.lang.String
    * @param optcode - 操作员代码
     */
    public void setOptcode(String optcode) {
        this.optcode = optcode;
    }

    /**
    * 获取-操作员名称
    * @return optname
     */
    public String getOptname() {
        return optname;
    }

    /**
    * 设置-操作员名称
    * @paramType java.lang.String
    * @param optname - 操作员名称
     */
    public void setOptname(String optname) {
        this.optname = optname;
    }

    /**
    * 获取-经办人名称
    * @return transactorname
     */
    public String getTransactorname() {
        return transactorname;
    }

    /**
    * 设置-经办人名称
    * @paramType java.lang.String
    * @param transactorname - 经办人名称
     */
    public void setTransactorname(String transactorname) {
        this.transactorname = transactorname;
    }

    /**
    * 获取-保费来源
    * @return premiumsource
     */
    public String getPremiumsource() {
        return premiumsource;
    }

    /**
    * 设置-保费来源
    * @paramType java.lang.String
    * @param premiumsource - 保费来源
     */
    public void setPremiumsource(String premiumsource) {
        this.premiumsource = premiumsource;
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
    * 获取-保险卡客户账户区域，转账付款必填，默认为0,0 - 国内 1 - 国外
    * @return custaccountarea
     */
    public String getCustaccountarea() {
        return custaccountarea;
    }

    /**
    * 设置-保险卡客户账户区域，转账付款必填，默认为0,0 - 国内 1 - 国外
    * @paramType java.lang.String
    * @param custaccountarea - 保险卡客户账户区域，转账付款必填，默认为0,0 - 国内 1 - 国外
     */
    public void setCustaccountarea(String custaccountarea) {
        this.custaccountarea = custaccountarea;
    }

    /**
    * 获取-单证类型
    * @return biztype
     */
    public String getBiztype() {
        return biztype;
    }

    /**
    * 设置-单证类型
    * @paramType java.lang.String
    * @param biztype - 单证类型
     */
    public void setBiztype(String biztype) {
        this.biztype = biztype;
    }

    /**
    * 获取-保险卡号
    * @return bizno
     */
    public String getBizno() {
        return bizno;
    }

    /**
    * 设置-保险卡号
    * @paramType java.lang.String
    * @param bizno - 保险卡号
     */
    public void setBizno(String bizno) {
        this.bizno = bizno;
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
    * 获取-是否是视同销售：0 否 1 将服务用于非增值税应税项目 2将服务用于集体福利或个人消费 3将自产或购买的服务作为投资，提供给其他单位或个体经营者 4将自产或购买的服务分配给股东或投资者 5将自产或购买的服务无偿赠送给其他单位或个人
    * @return equalsale
     */
    public String getEqualsale() {
        return equalsale;
    }

    /**
    * 设置-是否是视同销售：0 否 1 将服务用于非增值税应税项目 2将服务用于集体福利或个人消费 3将自产或购买的服务作为投资，提供给其他单位或个体经营者 4将自产或购买的服务分配给股东或投资者 5将自产或购买的服务无偿赠送给其他单位或个人
    * @paramType java.lang.String
    * @param equalsale - 是否是视同销售：0 否 1 将服务用于非增值税应税项目 2将服务用于集体福利或个人消费 3将自产或购买的服务作为投资，提供给其他单位或个体经营者 4将自产或购买的服务分配给股东或投资者 5将自产或购买的服务无偿赠送给其他单位或个人
     */
    public void setEqualsale(String equalsale) {
        this.equalsale = equalsale;
    }

    /**
    * 获取-客户类型 0非自然人 1自然人 
    * @return customertype
     */
    public String getCustomertype() {
        return customertype;
    }

    /**
    * 设置-客户类型 0非自然人 1自然人 
    * @paramType java.lang.String
    * @param customertype - 客户类型 0非自然人 1自然人 
     */
    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    /**
    * 获取-代收代付标识：0 否  1 是
    * @return ifagentbusiness
     */
    public String getIfagentbusiness() {
        return ifagentbusiness;
    }

    /**
    * 设置-代收代付标识：0 否  1 是
    * @paramType java.lang.String
    * @param ifagentbusiness - 代收代付标识：0 否  1 是
     */
    public void setIfagentbusiness(String ifagentbusiness) {
        this.ifagentbusiness = ifagentbusiness;
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
    * 获取-纳税人代码
    * @return taxpayercode
     */
    public String getTaxpayercode() {
        return taxpayercode;
    }

    /**
    * 设置-纳税人代码
    * @paramType java.lang.String
    * @param taxpayercode - 纳税人代码
     */
    public void setTaxpayercode(String taxpayercode) {
        this.taxpayercode = taxpayercode;
    }

    /**
    * 获取-纳税人名称
    * @return taxpayername
     */
    public String getTaxpayername() {
        return taxpayername;
    }

    /**
    * 设置-纳税人名称
    * @paramType java.lang.String
    * @param taxpayername - 纳税人名称
     */
    public void setTaxpayername(String taxpayername) {
        this.taxpayername = taxpayername;
    }

    /**
    * 获取-纳税人识别号
    * @return taxpayer
     */
    public String getTaxpayer() {
        return taxpayer;
    }

    /**
    * 设置-纳税人识别号
    * @paramType java.lang.String
    * @param taxpayer - 纳税人识别号
     */
    public void setTaxpayer(String taxpayer) {
        this.taxpayer = taxpayer;
    }

    /**
    * 获取-纳税人地址
    * @return taxesaddress
     */
    public String getTaxesaddress() {
        return taxesaddress;
    }

    /**
    * 设置-纳税人地址
    * @paramType java.lang.String
    * @param taxesaddress - 纳税人地址
     */
    public void setTaxesaddress(String taxesaddress) {
        this.taxesaddress = taxesaddress;
    }

    /**
    * 获取-纳税人电话
    * @return taxesphone
     */
    public String getTaxesphone() {
        return taxesphone;
    }

    /**
    * 设置-纳税人电话
    * @paramType java.lang.String
    * @param taxesphone - 纳税人电话
     */
    public void setTaxesphone(String taxesphone) {
        this.taxesphone = taxesphone;
    }

    /**
    * 获取-纳税人手机号
    * @return taxesmobilephone
     */
    public String getTaxesmobilephone() {
        return taxesmobilephone;
    }

    /**
    * 设置-纳税人手机号
    * @paramType java.lang.String
    * @param taxesmobilephone - 纳税人手机号
     */
    public void setTaxesmobilephone(String taxesmobilephone) {
        this.taxesmobilephone = taxesmobilephone;
    }

    /**
    * 获取-纳税人邮箱
    * @return taxesemail
     */
    public String getTaxesemail() {
        return taxesemail;
    }

    /**
    * 设置-纳税人邮箱
    * @paramType java.lang.String
    * @param taxesemail - 纳税人邮箱
     */
    public void setTaxesemail(String taxesemail) {
        this.taxesemail = taxesemail;
    }

    /**
    * 获取-纳税人开户银行
    * @return taxesbankname
     */
    public String getTaxesbankname() {
        return taxesbankname;
    }

    /**
    * 设置-纳税人开户银行
    * @paramType java.lang.String
    * @param taxesbankname - 纳税人开户银行
     */
    public void setTaxesbankname(String taxesbankname) {
        this.taxesbankname = taxesbankname;
    }

    /**
    * 获取-纳税人开户银行账号
    * @return taxesaccountno
     */
    public String getTaxesaccountno() {
        return taxesaccountno;
    }

    /**
    * 设置-纳税人开户银行账号
    * @paramType java.lang.String
    * @param taxesaccountno - 纳税人开户银行账号
     */
    public void setTaxesaccountno(String taxesaccountno) {
        this.taxesaccountno = taxesaccountno;
    }

    /**
    * 获取-纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
    * @return taxespayertype
     */
    public String getTaxespayertype() {
        return taxespayertype;
    }

    /**
    * 设置-纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
    * @paramType java.lang.String
    * @param taxespayertype - 纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
     */
    public void setTaxespayertype(String taxespayertype) {
        this.taxespayertype = taxespayertype;
    }

    /**
    * 获取-纳税人证件类型 01身份证、02护照、03军官证、04士兵证、05港澳居民来往内地通行证、06台湾居民来往大陆通行证、07其他
    * @return taxescertificatetype
     */
    public String getTaxescertificatetype() {
        return taxescertificatetype;
    }

    /**
    * 设置-纳税人证件类型 01身份证、02护照、03军官证、04士兵证、05港澳居民来往内地通行证、06台湾居民来往大陆通行证、07其他
    * @paramType java.lang.String
    * @param taxescertificatetype - 纳税人证件类型 01身份证、02护照、03军官证、04士兵证、05港澳居民来往内地通行证、06台湾居民来往大陆通行证、07其他
     */
    public void setTaxescertificatetype(String taxescertificatetype) {
        this.taxescertificatetype = taxescertificatetype;
    }

    /**
    * 获取-纳税人证件号
    * @return taxescertificateno
     */
    public String getTaxescertificateno() {
        return taxescertificateno;
    }

    /**
    * 设置-纳税人证件号
    * @paramType java.lang.String
    * @param taxescertificateno - 纳税人证件号
     */
    public void setTaxescertificateno(String taxescertificateno) {
        this.taxescertificateno = taxescertificateno;
    }

    /**
    * 获取-开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
    * @return invoicetype
     */
    public String getInvoicetype() {
        return invoicetype;
    }

    /**
    * 设置-开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
    * @paramType java.lang.String
    * @param invoicetype - 开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
     */
    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    /**
    * 获取-联保类型 0 非联保 1主联方，2从联方
    * @return isjointinsurance
     */
    public String getIsjointinsurance() {
        return isjointinsurance;
    }

    /**
    * 设置-联保类型 0 非联保 1主联方，2从联方
    * @paramType java.lang.String
    * @param isjointinsurance - 联保类型 0 非联保 1主联方，2从联方
     */
    public void setIsjointinsurance(String isjointinsurance) {
        this.isjointinsurance = isjointinsurance;
    }

    /**
    * 获取-联保关联单号
    * @return jointinsuranceno
     */
    public String getJointinsuranceno() {
        return jointinsuranceno;
    }

    /**
    * 设置-联保关联单号
    * @paramType java.lang.String
    * @param jointinsuranceno - 联保关联单号
     */
    public void setJointinsuranceno(String jointinsuranceno) {
        this.jointinsuranceno = jointinsuranceno;
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
    * 获取-发票备注信息
    * @return invoiceremark
     */
    public String getInvoiceremark() {
        return invoiceremark;
    }

    /**
    * 设置-发票备注信息
    * @paramType java.lang.String
    * @param invoiceremark - 发票备注信息
     */
    public void setInvoiceremark(String invoiceremark) {
        this.invoiceremark = invoiceremark;
    }

    /**
    * 获取-代理人类型:0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
    * @return agenttype
     */
    public String getAgenttype() {
        return agenttype;
    }

    /**
    * 设置-代理人类型:0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
    * @paramType java.lang.String
    * @param agenttype - 代理人类型:0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
     */
    public void setAgenttype(String agenttype) {
        this.agenttype = agenttype;
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
    * 获取-年期标志
    * @return periodflag
     */
    public String getPeriodflag() {
        return periodflag;
    }

    /**
    * 设置-年期标志
    * @paramType java.lang.String
    * @param periodflag - 年期标志
     */
    public void setPeriodflag(String periodflag) {
        this.periodflag = periodflag;
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
    * 获取-账单序号
    * @return totalserialno
     */
    public String getTotalserialno() {
        return totalserialno;
    }

    /**
    * 设置-账单序号
    * @paramType java.lang.String
    * @param totalserialno - 账单序号
     */
    public void setTotalserialno(String totalserialno) {
        this.totalserialno = totalserialno;
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
    * 获取-批改序号
    * @return serialno
     */
    public String getSerialno() {
        return serialno;
    }

    /**
    * 设置-批改序号
    * @paramType java.lang.String
    * @param serialno - 批改序号
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
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
    * 获取-发票开具方式0开全额发票 1 开我方份额发票
    * @return invoiceissueway
     */
    public String getInvoiceissueway() {
        return invoiceissueway;
    }

    /**
    * 设置-发票开具方式0开全额发票 1 开我方份额发票
    * @paramType java.lang.String
    * @param invoiceissueway - 发票开具方式0开全额发票 1 开我方份额发票
     */
    public void setInvoiceissueway(String invoiceissueway) {
        this.invoiceissueway = invoiceissueway;
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
    * 获取-挂账兑换人民币汇率
    * @return cnyexchangerate
     */
    public BigDecimal getCnyexchangerate() {
        return cnyexchangerate;
    }

    /**
    * 设置-挂账兑换人民币汇率
    * @paramType java.math.BigDecimal
    * @param cnyexchangerate - 挂账兑换人民币汇率
     */
    public void setCnyexchangerate(BigDecimal cnyexchangerate) {
        this.cnyexchangerate = cnyexchangerate;
    }
}