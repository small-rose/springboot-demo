package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_inpayment_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInpaymentTd {
    /**
     * 收付流水号
     */
    private Long inpaymentid;

    /**
     * 收付批次号
     */
    private BigDecimal inpaymentbatno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 来自账期表
     */
    private Date opdate;

    /**
     * 0 收款 1 付款
     */
    private String inpaymentflag;

    /**
     * 柜面帐户唯一编码
     */
    private Long mmaccountid;

    /**
     * 账户在财务系统中的唯一编码
     */
    private String accountno;

    /**
     * 收付款币种
     */
    private String currencycode;

    /**
     * 收付款金额
     */
    private BigDecimal amount;

    /**
     * 已处理金额
     */
    private BigDecimal usedamount;

    /**
     * 保单币种
     */
    private String basecurrencycode;

    /**
     * 保单币种金额
     */
    private BigDecimal baseamount;

    /**
     * 已处理金额（保单币种）
     */
    private BigDecimal baseusedamount;

    /**
     * 汇率
     */
    private BigDecimal rate;

    /**
     * 0 不是解领款 1 是解领款
     */
    private String saveflag;

    /**
     * 已处理次数
     */
    private BigDecimal operatedtimes;

    /**
     * 核销状态
     */
    private String opstatus;

    /**
     * 客户ID
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 收付方式
     */
    private String inpaymentmethod;

    /**
     * 备用字段(一律写0，目前用核销状态包含了此字段的功能)
     */
    private String cancelflag;

    /**
     * 此记录被作废的系统时间
     */
    private Date canceldate;

    /**
     * 0否, 1是
     */
    private String ifprinted;

    /**
     * 红冲流水号
     */
    private BigDecimal coinpaymentid;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 暂时只会在解领款中用到
     */
    private Long custaccountid;

    /**
     * 客户银行账号
     */
    private String custaccountno;

    /**
     * 客户开户行代码（开户行联行号）
     */
    private String custbankno;

    /**
     * 客户开户行
     */
    private String customerbankname;

    /**
     * 票据类型 1  支票 2  贷记凭证 3  进帐单4  信汇 5  电汇 6  票汇 7  解款单 8  本票 9  网上银行票根 10 无线pos刷卡
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
     * 主要用于打印进账单优先使用出票人信息，如果无出票人信息用客户信息 开出支票的人 B拿着A开出的支票到保险公司缴款，此处记录A
     */
    private String remittername;

    /**
     * 前台录入
     */
    private String inpaymentbatchno;

    /**
     * 日结状态
     */
    private String auditstatus;

    /**
     * 日结单号
     */
    private String dailyauditno;

    /**
     * 0  其他 2  内部缴款 3  批量收款 4  集中付款
     */
    private String incomemethod;

    /**
     * 备用
     */
    private String innerapplybillno;

    /**
     * 产生此记录的记录流水号
     */
    private BigDecimal fatherno;

    /**
     * 此记录产生的记录的流水号
     */
    private BigDecimal sonno;

    /**
     * 摘要
     */
    private String description;

    /**
     * 最后处理时的数据库系统时间，不考虑账期
     */
    private Date lastopdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 状态
     */
    private String status;

    /**
     * 默认值为 0，非集中付款数据写入0或不写入本字段  集中付款写入1 ，表示还未进行报账处理，后续处理状态： 2 数据检查完成,正在打包,程序中间状态 3 数据打包完成,正在报送,程序中间状态 4 数据报送成功 5 回写结果交易成功 6 回写结果交易失败 7 集中付款记录被取消（不通过集中付款接口报送oracle） 8 红冲产生的集中付款记录（不通过集中付款接口报送oracle） 
     */
    private String gatherstatus;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * P07响应时间
     */
    private Date p07responsedate;

    /**
     * P07出错代码
     */
    private String p07errorcode;

    /**
     * P07出错消息
     */
    private String p07errormsg;

    /**
     * P07支付时间
     */
    private Date p07paydate;

    /**
     * 退票原因，退票时录入
     */
    private String coreason;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 客户组代码
     */
    private String customerpartyno;

    /**
     * 客户英文名称
     */
    private String customernameen;

    /**
     * 异地标识
     */
    private String iflocal;

    /**
     * 南京依维柯买车送保险标识
     */
    private String activitytype;

    /**
     * 南京依维柯买车送保险名称
     */
    private String activitytypename;

    /**
     * 收据号，保险公司开给客户的收据的号码
     */
    private String receiptno;

    /**
     * 对账码。银行对账码，资金系统的收款会根据本字段来汇总银行科目的凭证,资金返回支付结果时会返回本字段。
     */
    private String bankabstract;

    /**
     * 交易平台唯一编码
     */
    private String platformid;

    /**
     * 客户账户名称
     */
    private String custaccountname;

    /**
     * 客户开户行所在市
     */
    private String bankcity;

    /**
     * 客户开户行所在省份
     */
    private String bankprovince;

    /**
     * 客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
     */
    private String banktype;

    /**
     * 银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
     */
    private String ispaypublic;

    /**
     * 客户账户的卡折类型：1 存折、2 借记卡、3 贷记卡、4准贷记卡，默认为借记卡
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
     * 加急标志。  "0 - 普通 1 - 加急"
     */
    private String fastflag;

    /**
     * 短信通知标志
     */
    private String smsflag;

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
     * 资金返回的票据号
     */
    private String atsbillno;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 类型
     */
    private String createtype;

    /**
    * 获取-收付流水号
    * @return inpaymentid
     */
    public Long getInpaymentid() {
        return inpaymentid;
    }

    /**
    * 设置-收付流水号
    * @paramType java.lang.Long
    * @param inpaymentid - 收付流水号
     */
    public void setInpaymentid(Long inpaymentid) {
        this.inpaymentid = inpaymentid;
    }

    /**
    * 获取-收付批次号
    * @return inpaymentbatno
     */
    public BigDecimal getInpaymentbatno() {
        return inpaymentbatno;
    }

    /**
    * 设置-收付批次号
    * @paramType java.math.BigDecimal
    * @param inpaymentbatno - 收付批次号
     */
    public void setInpaymentbatno(BigDecimal inpaymentbatno) {
        this.inpaymentbatno = inpaymentbatno;
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
    * 获取-来自账期表
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-来自账期表
    * @paramType java.util.Date
    * @param opdate - 来自账期表
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-0 收款 1 付款
    * @return inpaymentflag
     */
    public String getInpaymentflag() {
        return inpaymentflag;
    }

    /**
    * 设置-0 收款 1 付款
    * @paramType java.lang.String
    * @param inpaymentflag - 0 收款 1 付款
     */
    public void setInpaymentflag(String inpaymentflag) {
        this.inpaymentflag = inpaymentflag;
    }

    /**
    * 获取-柜面帐户唯一编码
    * @return mmaccountid
     */
    public Long getMmaccountid() {
        return mmaccountid;
    }

    /**
    * 设置-柜面帐户唯一编码
    * @paramType java.lang.Long
    * @param mmaccountid - 柜面帐户唯一编码
     */
    public void setMmaccountid(Long mmaccountid) {
        this.mmaccountid = mmaccountid;
    }

    /**
    * 获取-账户在财务系统中的唯一编码
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-账户在财务系统中的唯一编码
    * @paramType java.lang.String
    * @param accountno - 账户在财务系统中的唯一编码
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-收付款币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-收付款币种
    * @paramType java.lang.String
    * @param currencycode - 收付款币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-收付款金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-收付款金额
    * @paramType java.math.BigDecimal
    * @param amount - 收付款金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-已处理金额
    * @return usedamount
     */
    public BigDecimal getUsedamount() {
        return usedamount;
    }

    /**
    * 设置-已处理金额
    * @paramType java.math.BigDecimal
    * @param usedamount - 已处理金额
     */
    public void setUsedamount(BigDecimal usedamount) {
        this.usedamount = usedamount;
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
    * 获取-保单币种金额
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-保单币种金额
    * @paramType java.math.BigDecimal
    * @param baseamount - 保单币种金额
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
    * 获取-汇率
    * @return rate
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
    * 设置-汇率
    * @paramType java.math.BigDecimal
    * @param rate - 汇率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
    * 获取-0 不是解领款 1 是解领款
    * @return saveflag
     */
    public String getSaveflag() {
        return saveflag;
    }

    /**
    * 设置-0 不是解领款 1 是解领款
    * @paramType java.lang.String
    * @param saveflag - 0 不是解领款 1 是解领款
     */
    public void setSaveflag(String saveflag) {
        this.saveflag = saveflag;
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
    * 获取-客户ID
    * @return customercode
     */
    public String getCustomercode() {
        return customercode;
    }

    /**
    * 设置-客户ID
    * @paramType java.lang.String
    * @param customercode - 客户ID
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
    * 获取-收付方式
    * @return inpaymentmethod
     */
    public String getInpaymentmethod() {
        return inpaymentmethod;
    }

    /**
    * 设置-收付方式
    * @paramType java.lang.String
    * @param inpaymentmethod - 收付方式
     */
    public void setInpaymentmethod(String inpaymentmethod) {
        this.inpaymentmethod = inpaymentmethod;
    }

    /**
    * 获取-备用字段(一律写0，目前用核销状态包含了此字段的功能)
    * @return cancelflag
     */
    public String getCancelflag() {
        return cancelflag;
    }

    /**
    * 设置-备用字段(一律写0，目前用核销状态包含了此字段的功能)
    * @paramType java.lang.String
    * @param cancelflag - 备用字段(一律写0，目前用核销状态包含了此字段的功能)
     */
    public void setCancelflag(String cancelflag) {
        this.cancelflag = cancelflag;
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
    * 获取-0否, 1是
    * @return ifprinted
     */
    public String getIfprinted() {
        return ifprinted;
    }

    /**
    * 设置-0否, 1是
    * @paramType java.lang.String
    * @param ifprinted - 0否, 1是
     */
    public void setIfprinted(String ifprinted) {
        this.ifprinted = ifprinted;
    }

    /**
    * 获取-红冲流水号
    * @return coinpaymentid
     */
    public BigDecimal getCoinpaymentid() {
        return coinpaymentid;
    }

    /**
    * 设置-红冲流水号
    * @paramType java.math.BigDecimal
    * @param coinpaymentid - 红冲流水号
     */
    public void setCoinpaymentid(BigDecimal coinpaymentid) {
        this.coinpaymentid = coinpaymentid;
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
    * 获取-暂时只会在解领款中用到
    * @return custaccountid
     */
    public Long getCustaccountid() {
        return custaccountid;
    }

    /**
    * 设置-暂时只会在解领款中用到
    * @paramType java.lang.Long
    * @param custaccountid - 暂时只会在解领款中用到
     */
    public void setCustaccountid(Long custaccountid) {
        this.custaccountid = custaccountid;
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
    * 获取-客户开户行
    * @return customerbankname
     */
    public String getCustomerbankname() {
        return customerbankname;
    }

    /**
    * 设置-客户开户行
    * @paramType java.lang.String
    * @param customerbankname - 客户开户行
     */
    public void setCustomerbankname(String customerbankname) {
        this.customerbankname = customerbankname;
    }

    /**
    * 获取-票据类型 1  支票 2  贷记凭证 3  进帐单4  信汇 5  电汇 6  票汇 7  解款单 8  本票 9  网上银行票根 10 无线pos刷卡
    * @return checktype
     */
    public String getChecktype() {
        return checktype;
    }

    /**
    * 设置-票据类型 1  支票 2  贷记凭证 3  进帐单4  信汇 5  电汇 6  票汇 7  解款单 8  本票 9  网上银行票根 10 无线pos刷卡
    * @paramType java.lang.String
    * @param checktype - 票据类型 1  支票 2  贷记凭证 3  进帐单4  信汇 5  电汇 6  票汇 7  解款单 8  本票 9  网上银行票根 10 无线pos刷卡
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
    * 获取-主要用于打印进账单优先使用出票人信息，如果无出票人信息用客户信息 开出支票的人 B拿着A开出的支票到保险公司缴款，此处记录A
    * @return remittername
     */
    public String getRemittername() {
        return remittername;
    }

    /**
    * 设置-主要用于打印进账单优先使用出票人信息，如果无出票人信息用客户信息 开出支票的人 B拿着A开出的支票到保险公司缴款，此处记录A
    * @paramType java.lang.String
    * @param remittername - 主要用于打印进账单优先使用出票人信息，如果无出票人信息用客户信息 开出支票的人 B拿着A开出的支票到保险公司缴款，此处记录A
     */
    public void setRemittername(String remittername) {
        this.remittername = remittername;
    }

    /**
    * 获取-前台录入
    * @return inpaymentbatchno
     */
    public String getInpaymentbatchno() {
        return inpaymentbatchno;
    }

    /**
    * 设置-前台录入
    * @paramType java.lang.String
    * @param inpaymentbatchno - 前台录入
     */
    public void setInpaymentbatchno(String inpaymentbatchno) {
        this.inpaymentbatchno = inpaymentbatchno;
    }

    /**
    * 获取-日结状态
    * @return auditstatus
     */
    public String getAuditstatus() {
        return auditstatus;
    }

    /**
    * 设置-日结状态
    * @paramType java.lang.String
    * @param auditstatus - 日结状态
     */
    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus;
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
    * 获取-0  其他 2  内部缴款 3  批量收款 4  集中付款
    * @return incomemethod
     */
    public String getIncomemethod() {
        return incomemethod;
    }

    /**
    * 设置-0  其他 2  内部缴款 3  批量收款 4  集中付款
    * @paramType java.lang.String
    * @param incomemethod - 0  其他 2  内部缴款 3  批量收款 4  集中付款
     */
    public void setIncomemethod(String incomemethod) {
        this.incomemethod = incomemethod;
    }

    /**
    * 获取-备用
    * @return innerapplybillno
     */
    public String getInnerapplybillno() {
        return innerapplybillno;
    }

    /**
    * 设置-备用
    * @paramType java.lang.String
    * @param innerapplybillno - 备用
     */
    public void setInnerapplybillno(String innerapplybillno) {
        this.innerapplybillno = innerapplybillno;
    }

    /**
    * 获取-产生此记录的记录流水号
    * @return fatherno
     */
    public BigDecimal getFatherno() {
        return fatherno;
    }

    /**
    * 设置-产生此记录的记录流水号
    * @paramType java.math.BigDecimal
    * @param fatherno - 产生此记录的记录流水号
     */
    public void setFatherno(BigDecimal fatherno) {
        this.fatherno = fatherno;
    }

    /**
    * 获取-此记录产生的记录的流水号
    * @return sonno
     */
    public BigDecimal getSonno() {
        return sonno;
    }

    /**
    * 设置-此记录产生的记录的流水号
    * @paramType java.math.BigDecimal
    * @param sonno - 此记录产生的记录的流水号
     */
    public void setSonno(BigDecimal sonno) {
        this.sonno = sonno;
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
    * 获取-最后处理时的数据库系统时间，不考虑账期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后处理时的数据库系统时间，不考虑账期
    * @paramType java.util.Date
    * @param lastopdate - 最后处理时的数据库系统时间，不考虑账期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
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
    * 获取-状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态
    * @paramType java.lang.String
    * @param status - 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-默认值为 0，非集中付款数据写入0或不写入本字段  集中付款写入1 ，表示还未进行报账处理，后续处理状态： 2 数据检查完成,正在打包,程序中间状态 3 数据打包完成,正在报送,程序中间状态 4 数据报送成功 5 回写结果交易成功 6 回写结果交易失败 7 集中付款记录被取消（不通过集中付款接口报送oracle） 8 红冲产生的集中付款记录（不通过集中付款接口报送oracle） 
    * @return gatherstatus
     */
    public String getGatherstatus() {
        return gatherstatus;
    }

    /**
    * 设置-默认值为 0，非集中付款数据写入0或不写入本字段  集中付款写入1 ，表示还未进行报账处理，后续处理状态： 2 数据检查完成,正在打包,程序中间状态 3 数据打包完成,正在报送,程序中间状态 4 数据报送成功 5 回写结果交易成功 6 回写结果交易失败 7 集中付款记录被取消（不通过集中付款接口报送oracle） 8 红冲产生的集中付款记录（不通过集中付款接口报送oracle） 
    * @paramType java.lang.String
    * @param gatherstatus - 默认值为 0，非集中付款数据写入0或不写入本字段  集中付款写入1 ，表示还未进行报账处理，后续处理状态： 2 数据检查完成,正在打包,程序中间状态 3 数据打包完成,正在报送,程序中间状态 4 数据报送成功 5 回写结果交易成功 6 回写结果交易失败 7 集中付款记录被取消（不通过集中付款接口报送oracle） 8 红冲产生的集中付款记录（不通过集中付款接口报送oracle） 
     */
    public void setGatherstatus(String gatherstatus) {
        this.gatherstatus = gatherstatus;
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
    * 获取-P07响应时间
    * @return p07responsedate
     */
    public Date getP07responsedate() {
        return p07responsedate;
    }

    /**
    * 设置-P07响应时间
    * @paramType java.util.Date
    * @param p07responsedate - P07响应时间
     */
    public void setP07responsedate(Date p07responsedate) {
        this.p07responsedate = p07responsedate;
    }

    /**
    * 获取-P07出错代码
    * @return p07errorcode
     */
    public String getP07errorcode() {
        return p07errorcode;
    }

    /**
    * 设置-P07出错代码
    * @paramType java.lang.String
    * @param p07errorcode - P07出错代码
     */
    public void setP07errorcode(String p07errorcode) {
        this.p07errorcode = p07errorcode;
    }

    /**
    * 获取-P07出错消息
    * @return p07errormsg
     */
    public String getP07errormsg() {
        return p07errormsg;
    }

    /**
    * 设置-P07出错消息
    * @paramType java.lang.String
    * @param p07errormsg - P07出错消息
     */
    public void setP07errormsg(String p07errormsg) {
        this.p07errormsg = p07errormsg;
    }

    /**
    * 获取-P07支付时间
    * @return p07paydate
     */
    public Date getP07paydate() {
        return p07paydate;
    }

    /**
    * 设置-P07支付时间
    * @paramType java.util.Date
    * @param p07paydate - P07支付时间
     */
    public void setP07paydate(Date p07paydate) {
        this.p07paydate = p07paydate;
    }

    /**
    * 获取-退票原因，退票时录入
    * @return coreason
     */
    public String getCoreason() {
        return coreason;
    }

    /**
    * 设置-退票原因，退票时录入
    * @paramType java.lang.String
    * @param coreason - 退票原因，退票时录入
     */
    public void setCoreason(String coreason) {
        this.coreason = coreason;
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
    * 获取-客户组代码
    * @return customerpartyno
     */
    public String getCustomerpartyno() {
        return customerpartyno;
    }

    /**
    * 设置-客户组代码
    * @paramType java.lang.String
    * @param customerpartyno - 客户组代码
     */
    public void setCustomerpartyno(String customerpartyno) {
        this.customerpartyno = customerpartyno;
    }

    /**
    * 获取-客户英文名称
    * @return customernameen
     */
    public String getCustomernameen() {
        return customernameen;
    }

    /**
    * 设置-客户英文名称
    * @paramType java.lang.String
    * @param customernameen - 客户英文名称
     */
    public void setCustomernameen(String customernameen) {
        this.customernameen = customernameen;
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
    * 获取-南京依维柯买车送保险标识
    * @return activitytype
     */
    public String getActivitytype() {
        return activitytype;
    }

    /**
    * 设置-南京依维柯买车送保险标识
    * @paramType java.lang.String
    * @param activitytype - 南京依维柯买车送保险标识
     */
    public void setActivitytype(String activitytype) {
        this.activitytype = activitytype;
    }

    /**
    * 获取-南京依维柯买车送保险名称
    * @return activitytypename
     */
    public String getActivitytypename() {
        return activitytypename;
    }

    /**
    * 设置-南京依维柯买车送保险名称
    * @paramType java.lang.String
    * @param activitytypename - 南京依维柯买车送保险名称
     */
    public void setActivitytypename(String activitytypename) {
        this.activitytypename = activitytypename;
    }

    /**
    * 获取-收据号，保险公司开给客户的收据的号码
    * @return receiptno
     */
    public String getReceiptno() {
        return receiptno;
    }

    /**
    * 设置-收据号，保险公司开给客户的收据的号码
    * @paramType java.lang.String
    * @param receiptno - 收据号，保险公司开给客户的收据的号码
     */
    public void setReceiptno(String receiptno) {
        this.receiptno = receiptno;
    }

    /**
    * 获取-对账码。银行对账码，资金系统的收款会根据本字段来汇总银行科目的凭证,资金返回支付结果时会返回本字段。
    * @return bankabstract
     */
    public String getBankabstract() {
        return bankabstract;
    }

    /**
    * 设置-对账码。银行对账码，资金系统的收款会根据本字段来汇总银行科目的凭证,资金返回支付结果时会返回本字段。
    * @paramType java.lang.String
    * @param bankabstract - 对账码。银行对账码，资金系统的收款会根据本字段来汇总银行科目的凭证,资金返回支付结果时会返回本字段。
     */
    public void setBankabstract(String bankabstract) {
        this.bankabstract = bankabstract;
    }

    /**
    * 获取-交易平台唯一编码
    * @return platformid
     */
    public String getPlatformid() {
        return platformid;
    }

    /**
    * 设置-交易平台唯一编码
    * @paramType java.lang.String
    * @param platformid - 交易平台唯一编码
     */
    public void setPlatformid(String platformid) {
        this.platformid = platformid;
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
    * 获取-客户账户的卡折类型：1 存折、2 借记卡、3 贷记卡、4准贷记卡，默认为借记卡
    * @return cardflag
     */
    public String getCardflag() {
        return cardflag;
    }

    /**
    * 设置-客户账户的卡折类型：1 存折、2 借记卡、3 贷记卡、4准贷记卡，默认为借记卡
    * @paramType java.lang.String
    * @param cardflag - 客户账户的卡折类型：1 存折、2 借记卡、3 贷记卡、4准贷记卡，默认为借记卡
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
    * 获取-加急标志。  "0 - 普通 1 - 加急"
    * @return fastflag
     */
    public String getFastflag() {
        return fastflag;
    }

    /**
    * 设置-加急标志。  "0 - 普通 1 - 加急"
    * @paramType java.lang.String
    * @param fastflag - 加急标志。  "0 - 普通 1 - 加急"
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
    * 获取-资金返回的票据号
    * @return atsbillno
     */
    public String getAtsbillno() {
        return atsbillno;
    }

    /**
    * 设置-资金返回的票据号
    * @paramType java.lang.String
    * @param atsbillno - 资金返回的票据号
     */
    public void setAtsbillno(String atsbillno) {
        this.atsbillno = atsbillno;
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
    * 获取-类型
    * @return createtype
     */
    public String getCreatetype() {
        return createtype;
    }

    /**
    * 设置-类型
    * @paramType java.lang.String
    * @param createtype - 类型
     */
    public void setCreatetype(String createtype) {
        this.createtype = createtype;
    }
}