package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policylist_legal
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicylistLegal {
    /**
     * 主键
     */
    private Long id;

    /**
     * 关联mm_policy_ti主键
     */
    private Long seqpolicy;

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
     * 业务性质
     */
    private String datatype;

    /**
     * 币种代码
     */
    private String currencycode;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称（中文）
     */
    private String customername;

    /**
     * 客户账号
     */
    private String custaccountno;

    /**
     * 客户开户行名称
     */
    private String bankname;

    /**
     * 客户开户行代码（开户行联行号）
     */
    private String custbankno;

    /**
     * 业务归属部门
     */
    private String departmentcode;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 指定收付款部门
     */
    private String inpaymentdepartment;

    /**
     * 指定收付方式
     */
    private String inpaymentmethod;

    /**
     * 客户序号
     */
    private String custseq;

    /**
     * 1.初始状态.2.落地成功,3.落地失败
     */
    private String status;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 版本控制数字
     */
    private Integer hibernateversion;

    /**
     * 涉农标志      0 自缴 1 中央财政补助 2 省级财政补助 3地市县财政补助  4 其他
     */
    private String farmflag;

    /**
     * 共保人名称
     */
    private String mastername;

    /**
     * 共保人代码
     */
    private String masterno;

    /**
     * 数据错误日志
     */
    private String errmsg;

    /**
     * 共保序号 当datatype为G（应付司外共保代收时），该字段填入其对应的应收共保代收的客户缴费流水号
     */
    private String coinsurno;

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
     * 业务系统对结算信息的额外描述。由前端录入。
     */
    private String description;

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
     * 见费出单流水号
     */
    private String inpaymentno;

    /**
     * 分期缴费次数(是指本次业务是第几期分期付款而不是总共分几期付款的信息)
     */
    private BigDecimal installmentstimes;

    /**
     * 0 政策性-中央政策性、1 政策性-地方政策性、2 商业性
     */
    private String farpolicytype;

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
     * 清算码
     */
    private String recoverycode;

    /**
     * 订单类型
     */
    private String proposalformno;

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
     * 约定汇率
     */
    private BigDecimal excangerate;

    /**
     * 约定结算币种代码
     */
    private String exchangecurrencycode;

    /**
     * 约定结算金额
     */
    private BigDecimal exchangeamount;

    /**
     * 开票汇率
     */
    private BigDecimal invoicerate;

    /**
     * 开票金额
     */
    private BigDecimal invoiceamount;

    /**
     * 健康险是否拆分 1可拆分
     */
    private String issplitted;

    /**
     * 涉农标志代码
     */
    private String farmflagcode;

    /**
     * 车辆使用性质
     */
    private String useporperty;

    /**
     * 涉海标识 01涉海 02非涉海
     */
    private String marineflag;

    /**
     * 保费来源
     */
    private String premiumsource;

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
     * 例外状态,赔款的例外支付状态,0 正常,1 责任保险第三者,2 法院判决,3 共保业务,4 交强险垫/预付,5 车辆过户,6 行政事业单位,7 个体工商户,8 驻粤分支机构,9 统一招标业务,10 法人单位内设部门,11 约定受益人,12 粤港、粤澳两地车,13 保单录入有误,14 外籍人士,15 被保险人死亡,16 其他,24 直赔修理厂,25 垫付抢救费用,26 车辆转让,27 道路交通事故赔偿权利人,28 其他情形,29 经纪公司,30 维修商
     */
    private String exstatus;

    /**
     * 具体例外支付的原因
     */
    private String exceptioncause;

    /**
     * 税金金额(包含在总金额amount中)，对于营改增的必传
     */
    private BigDecimal taxesamount;

    /**
     * 税率，对于正数的金额，营改增必传，批减或者退保时可空
     */
    private BigDecimal taxesrate;

    /**
     * 税收属性：0应税 1 免税 2 零税
     */
    private String classestype;

    /**
     * 进项税额转出
     */
    private BigDecimal taxesamountout;

    /**
     * 纳税人类型
     */
    private String taxpayertype;

    /**
     * 纳税人识别号
     */
    private String taxpayernum;

    /**
     * 纳税登记地址
     */
    private String taxpayeraddr;

    /**
     * 纳税登记开户银行
     */
    private String taxpaybank;

    /**
     * 纳税登记开户银行账号
     */
    private String taxpayeraccountno;

    /**
     * 纳税人登记联系电话
     */
    private String taxpayertel;

    /**
     * 邮寄方式
     */
    private String posttype;

    /**
     * 邮寄收件人
     */
    private String postreceiver;

    /**
     * 邮寄联系电话
     */
    private String postreceivertel;

    /**
     * 邮寄地址
     */
    private String postaddr;

    /**
     * 车辆种类
     */
    private String vehkind;

    /**
     * 代理人类型:0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
     */
    private String agenttype;

    /**
     * 车辆规格特性
     */
    private String characteristics;

    /**
     * 账单序号
     */
    private String totalserialno;

    /**
     * 车辆用途
     */
    private String carusetype;

    /**
     * 税金（保留6位小数）
     */
    private BigDecimal taxesamount1;

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
    * 获取-关联mm_policy_ti主键
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-关联mm_policy_ti主键
    * @paramType java.lang.Long
    * @param seqpolicy - 关联mm_policy_ti主键
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
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
    * 获取-业务性质
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-业务性质
    * @paramType java.lang.String
    * @param datatype - 业务性质
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
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
    * 获取-金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额
    * @paramType java.math.BigDecimal
    * @param amount - 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    * 获取-客户账号
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户账号
    * @paramType java.lang.String
    * @param custaccountno - 客户账号
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
    * 获取-指定收付款部门
    * @return inpaymentdepartment
     */
    public String getInpaymentdepartment() {
        return inpaymentdepartment;
    }

    /**
    * 设置-指定收付款部门
    * @paramType java.lang.String
    * @param inpaymentdepartment - 指定收付款部门
     */
    public void setInpaymentdepartment(String inpaymentdepartment) {
        this.inpaymentdepartment = inpaymentdepartment;
    }

    /**
    * 获取-指定收付方式
    * @return inpaymentmethod
     */
    public String getInpaymentmethod() {
        return inpaymentmethod;
    }

    /**
    * 设置-指定收付方式
    * @paramType java.lang.String
    * @param inpaymentmethod - 指定收付方式
     */
    public void setInpaymentmethod(String inpaymentmethod) {
        this.inpaymentmethod = inpaymentmethod;
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
    * 获取-1.初始状态.2.落地成功,3.落地失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-1.初始状态.2.落地成功,3.落地失败
    * @paramType java.lang.String
    * @param status - 1.初始状态.2.落地成功,3.落地失败
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-最后修改时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后修改时间
    * @paramType java.util.Date
    * @param lastopdate - 最后修改时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-版本控制数字
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本控制数字
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本控制数字
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-涉农标志      0 自缴 1 中央财政补助 2 省级财政补助 3地市县财政补助  4 其他
    * @return farmflag
     */
    public String getFarmflag() {
        return farmflag;
    }

    /**
    * 设置-涉农标志      0 自缴 1 中央财政补助 2 省级财政补助 3地市县财政补助  4 其他
    * @paramType java.lang.String
    * @param farmflag - 涉农标志      0 自缴 1 中央财政补助 2 省级财政补助 3地市县财政补助  4 其他
     */
    public void setFarmflag(String farmflag) {
        this.farmflag = farmflag;
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
    * 获取-共保序号 当datatype为G（应付司外共保代收时），该字段填入其对应的应收共保代收的客户缴费流水号
    * @return coinsurno
     */
    public String getCoinsurno() {
        return coinsurno;
    }

    /**
    * 设置-共保序号 当datatype为G（应付司外共保代收时），该字段填入其对应的应收共保代收的客户缴费流水号
    * @paramType java.lang.String
    * @param coinsurno - 共保序号 当datatype为G（应付司外共保代收时），该字段填入其对应的应收共保代收的客户缴费流水号
     */
    public void setCoinsurno(String coinsurno) {
        this.coinsurno = coinsurno;
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
    * 获取-见费出单流水号
    * @return inpaymentno
     */
    public String getInpaymentno() {
        return inpaymentno;
    }

    /**
    * 设置-见费出单流水号
    * @paramType java.lang.String
    * @param inpaymentno - 见费出单流水号
     */
    public void setInpaymentno(String inpaymentno) {
        this.inpaymentno = inpaymentno;
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
    * 获取-0 政策性-中央政策性、1 政策性-地方政策性、2 商业性
    * @return farpolicytype
     */
    public String getFarpolicytype() {
        return farpolicytype;
    }

    /**
    * 设置-0 政策性-中央政策性、1 政策性-地方政策性、2 商业性
    * @paramType java.lang.String
    * @param farpolicytype - 0 政策性-中央政策性、1 政策性-地方政策性、2 商业性
     */
    public void setFarpolicytype(String farpolicytype) {
        this.farpolicytype = farpolicytype;
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
    * 获取-约定汇率
    * @return excangerate
     */
    public BigDecimal getExcangerate() {
        return excangerate;
    }

    /**
    * 设置-约定汇率
    * @paramType java.math.BigDecimal
    * @param excangerate - 约定汇率
     */
    public void setExcangerate(BigDecimal excangerate) {
        this.excangerate = excangerate;
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
    * 获取-开票汇率
    * @return invoicerate
     */
    public BigDecimal getInvoicerate() {
        return invoicerate;
    }

    /**
    * 设置-开票汇率
    * @paramType java.math.BigDecimal
    * @param invoicerate - 开票汇率
     */
    public void setInvoicerate(BigDecimal invoicerate) {
        this.invoicerate = invoicerate;
    }

    /**
    * 获取-开票金额
    * @return invoiceamount
     */
    public BigDecimal getInvoiceamount() {
        return invoiceamount;
    }

    /**
    * 设置-开票金额
    * @paramType java.math.BigDecimal
    * @param invoiceamount - 开票金额
     */
    public void setInvoiceamount(BigDecimal invoiceamount) {
        this.invoiceamount = invoiceamount;
    }

    /**
    * 获取-健康险是否拆分 1可拆分
    * @return issplitted
     */
    public String getIssplitted() {
        return issplitted;
    }

    /**
    * 设置-健康险是否拆分 1可拆分
    * @paramType java.lang.String
    * @param issplitted - 健康险是否拆分 1可拆分
     */
    public void setIssplitted(String issplitted) {
        this.issplitted = issplitted;
    }

    /**
    * 获取-涉农标志代码
    * @return farmflagcode
     */
    public String getFarmflagcode() {
        return farmflagcode;
    }

    /**
    * 设置-涉农标志代码
    * @paramType java.lang.String
    * @param farmflagcode - 涉农标志代码
     */
    public void setFarmflagcode(String farmflagcode) {
        this.farmflagcode = farmflagcode;
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
    * 获取-涉海标识 01涉海 02非涉海
    * @return marineflag
     */
    public String getMarineflag() {
        return marineflag;
    }

    /**
    * 设置-涉海标识 01涉海 02非涉海
    * @paramType java.lang.String
    * @param marineflag - 涉海标识 01涉海 02非涉海
     */
    public void setMarineflag(String marineflag) {
        this.marineflag = marineflag;
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
    * 获取-例外状态,赔款的例外支付状态,0 正常,1 责任保险第三者,2 法院判决,3 共保业务,4 交强险垫/预付,5 车辆过户,6 行政事业单位,7 个体工商户,8 驻粤分支机构,9 统一招标业务,10 法人单位内设部门,11 约定受益人,12 粤港、粤澳两地车,13 保单录入有误,14 外籍人士,15 被保险人死亡,16 其他,24 直赔修理厂,25 垫付抢救费用,26 车辆转让,27 道路交通事故赔偿权利人,28 其他情形,29 经纪公司,30 维修商
    * @return exstatus
     */
    public String getExstatus() {
        return exstatus;
    }

    /**
    * 设置-例外状态,赔款的例外支付状态,0 正常,1 责任保险第三者,2 法院判决,3 共保业务,4 交强险垫/预付,5 车辆过户,6 行政事业单位,7 个体工商户,8 驻粤分支机构,9 统一招标业务,10 法人单位内设部门,11 约定受益人,12 粤港、粤澳两地车,13 保单录入有误,14 外籍人士,15 被保险人死亡,16 其他,24 直赔修理厂,25 垫付抢救费用,26 车辆转让,27 道路交通事故赔偿权利人,28 其他情形,29 经纪公司,30 维修商
    * @paramType java.lang.String
    * @param exstatus - 例外状态,赔款的例外支付状态,0 正常,1 责任保险第三者,2 法院判决,3 共保业务,4 交强险垫/预付,5 车辆过户,6 行政事业单位,7 个体工商户,8 驻粤分支机构,9 统一招标业务,10 法人单位内设部门,11 约定受益人,12 粤港、粤澳两地车,13 保单录入有误,14 外籍人士,15 被保险人死亡,16 其他,24 直赔修理厂,25 垫付抢救费用,26 车辆转让,27 道路交通事故赔偿权利人,28 其他情形,29 经纪公司,30 维修商
     */
    public void setExstatus(String exstatus) {
        this.exstatus = exstatus;
    }

    /**
    * 获取-具体例外支付的原因
    * @return exceptioncause
     */
    public String getExceptioncause() {
        return exceptioncause;
    }

    /**
    * 设置-具体例外支付的原因
    * @paramType java.lang.String
    * @param exceptioncause - 具体例外支付的原因
     */
    public void setExceptioncause(String exceptioncause) {
        this.exceptioncause = exceptioncause;
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
    * 获取-税收属性：0应税 1 免税 2 零税
    * @return classestype
     */
    public String getClassestype() {
        return classestype;
    }

    /**
    * 设置-税收属性：0应税 1 免税 2 零税
    * @paramType java.lang.String
    * @param classestype - 税收属性：0应税 1 免税 2 零税
     */
    public void setClassestype(String classestype) {
        this.classestype = classestype;
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
    * 获取-纳税人类型
    * @return taxpayertype
     */
    public String getTaxpayertype() {
        return taxpayertype;
    }

    /**
    * 设置-纳税人类型
    * @paramType java.lang.String
    * @param taxpayertype - 纳税人类型
     */
    public void setTaxpayertype(String taxpayertype) {
        this.taxpayertype = taxpayertype;
    }

    /**
    * 获取-纳税人识别号
    * @return taxpayernum
     */
    public String getTaxpayernum() {
        return taxpayernum;
    }

    /**
    * 设置-纳税人识别号
    * @paramType java.lang.String
    * @param taxpayernum - 纳税人识别号
     */
    public void setTaxpayernum(String taxpayernum) {
        this.taxpayernum = taxpayernum;
    }

    /**
    * 获取-纳税登记地址
    * @return taxpayeraddr
     */
    public String getTaxpayeraddr() {
        return taxpayeraddr;
    }

    /**
    * 设置-纳税登记地址
    * @paramType java.lang.String
    * @param taxpayeraddr - 纳税登记地址
     */
    public void setTaxpayeraddr(String taxpayeraddr) {
        this.taxpayeraddr = taxpayeraddr;
    }

    /**
    * 获取-纳税登记开户银行
    * @return taxpaybank
     */
    public String getTaxpaybank() {
        return taxpaybank;
    }

    /**
    * 设置-纳税登记开户银行
    * @paramType java.lang.String
    * @param taxpaybank - 纳税登记开户银行
     */
    public void setTaxpaybank(String taxpaybank) {
        this.taxpaybank = taxpaybank;
    }

    /**
    * 获取-纳税登记开户银行账号
    * @return taxpayeraccountno
     */
    public String getTaxpayeraccountno() {
        return taxpayeraccountno;
    }

    /**
    * 设置-纳税登记开户银行账号
    * @paramType java.lang.String
    * @param taxpayeraccountno - 纳税登记开户银行账号
     */
    public void setTaxpayeraccountno(String taxpayeraccountno) {
        this.taxpayeraccountno = taxpayeraccountno;
    }

    /**
    * 获取-纳税人登记联系电话
    * @return taxpayertel
     */
    public String getTaxpayertel() {
        return taxpayertel;
    }

    /**
    * 设置-纳税人登记联系电话
    * @paramType java.lang.String
    * @param taxpayertel - 纳税人登记联系电话
     */
    public void setTaxpayertel(String taxpayertel) {
        this.taxpayertel = taxpayertel;
    }

    /**
    * 获取-邮寄方式
    * @return posttype
     */
    public String getPosttype() {
        return posttype;
    }

    /**
    * 设置-邮寄方式
    * @paramType java.lang.String
    * @param posttype - 邮寄方式
     */
    public void setPosttype(String posttype) {
        this.posttype = posttype;
    }

    /**
    * 获取-邮寄收件人
    * @return postreceiver
     */
    public String getPostreceiver() {
        return postreceiver;
    }

    /**
    * 设置-邮寄收件人
    * @paramType java.lang.String
    * @param postreceiver - 邮寄收件人
     */
    public void setPostreceiver(String postreceiver) {
        this.postreceiver = postreceiver;
    }

    /**
    * 获取-邮寄联系电话
    * @return postreceivertel
     */
    public String getPostreceivertel() {
        return postreceivertel;
    }

    /**
    * 设置-邮寄联系电话
    * @paramType java.lang.String
    * @param postreceivertel - 邮寄联系电话
     */
    public void setPostreceivertel(String postreceivertel) {
        this.postreceivertel = postreceivertel;
    }

    /**
    * 获取-邮寄地址
    * @return postaddr
     */
    public String getPostaddr() {
        return postaddr;
    }

    /**
    * 设置-邮寄地址
    * @paramType java.lang.String
    * @param postaddr - 邮寄地址
     */
    public void setPostaddr(String postaddr) {
        this.postaddr = postaddr;
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
    * 获取-税金（保留6位小数）
    * @return taxesamount1
     */
    public BigDecimal getTaxesamount1() {
        return taxesamount1;
    }

    /**
    * 设置-税金（保留6位小数）
    * @paramType java.math.BigDecimal
    * @param taxesamount1 - 税金（保留6位小数）
     */
    public void setTaxesamount1(BigDecimal taxesamount1) {
        this.taxesamount1 = taxesamount1;
    }
}