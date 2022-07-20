package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_match_source_td_suc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmMatchSourceTdSuc {
    /**
     * 主键
     */
    private Long id;

    /**
     * 批次号(一次结算多笔source时的批次号)
     */
    private BigDecimal batchid;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * source结算类型
     */
    private String sourcesettlementtype;

    /**
     * source数据来源号
     */
    private BigDecimal sourceno;

    /**
     * source数据类型
     */
    private String sourcedatatype;

    /**
     * 币种
     */
    private String sourcecurrencycode;

    /**
     * 本次结算金额
     */
    private BigDecimal sourceamount;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称（中文）
     */
    private String customername;

    /**
     * 收付交易数据的客户名称（英文）
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
     * 银行账户id
     */
    private Long mmaccountid;

    /**
     * 交易平台id
     */
    private String platformid;

    /**
     * 支付方式
     */
    private String inpaymentmethod;

    /**
     * 客户账户名称
     */
    private String custaccountname;

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
     * 客户开户行所在市
     */
    private String bankcity;

    /**
     * 客户开户行所在省份
     */
    private String bankprovince;

    /**
     * 客户开户行直联号(ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）)
     */
    private String banktype;

    /**
     * 银行指令类型(1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口))
     */
    private String ispaypublic;

    /**
     * 客户账户的卡折类型(1 存折、2 借记卡、3 贷记卡、4准贷记卡，默认为借记卡)
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
     * 加急标志(0 - 普通 1 - 加急")
     */
    private String fastflag;

    /**
     * 短信通知标志
     */
    private String smsflag;

    /**
     * 票据类型(1  支票 2  贷记凭证 3  进帐单4  信汇 5  电汇 6  票汇 7  解款单 8  本票 9  网上银行票根 10 无线pos刷卡)
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
     * 代理人代码
     */
    private String agentcode;

    /**
     * 出票人代码
     */
    private String remittercode;

    /**
     * 主要用于打印进账单优先使用出票人信息
     */
    private String remittername;

    /**
     * 用途
     */
    private String purpose;

    /**
     * 备注
     */
    private String memo;

    /**
     * 业务系统对结算信息的额外描述(由前端录入。)
     */
    private String description;

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
     * 上传标志(0 不上传 1上传 2已回写)
     */
    private String ifupload;

    /**
     * 状态
     */
    private String status;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 最后处理时的数据库系统时间(不考虑账期)
     */
    private Date lastopdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
     */
    private String modifydesc;

    /**
     * 收据号(保险公司开给客户的收据的号码)
     */
    private String receiptno;

    /**
     * 页面标识(区分不同页面的具体操作：1 收款录入、2 扣款页面、3 交易平台付款、4现金付款、5预收款部门调整)
     */
    private String datamark;

    /**
     * 盘片号(对应mm_platformfile的id)
     */
    private String platformfileid;

    /**
     * 盘片明细id(对应MM_PLATFORMFILE_DETAIL_TD的id)
     */
    private BigDecimal platformdetailid;

    /**
     * 支付申请号
     */
    private String inpaymentno;

    /**
     * 客户账户区域(转账付款必填，默认为0。0 - 国内 1 - 国外)
     */
    private String custaccountarea;

    /**
     * 客户银行地址(境外汇款时使用)
     */
    private String custbankaddr;

    /**
     * SwiftCode：即国际银行代码，境外汇款时使用
     */
    private String custbankswiftcode;

    /**
     * 国内外费用承担(1汇款人OUR、2收款人BEN、3共同SHA)
     */
    private String custchargetype;

    /**
     * 存储生成方式(0批量导入,1手工录入,2系统接入,3合并流水)
     */
    private String createtype;

    /**
     * 对账码，银行对账码
     */
    private String bankabstract;

    /**
     * 客户类型
     */
    private String customertype;

    /**
     * 银行账号
     */
    private String accountno;

    /**
     * 折本位币汇率
     */
    private BigDecimal accountrate;

    /**
     * 折本位币金额
     */
    private BigDecimal accountamount;

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
    * 获取-批次号(一次结算多笔source时的批次号)
    * @return batchid
     */
    public BigDecimal getBatchid() {
        return batchid;
    }

    /**
    * 设置-批次号(一次结算多笔source时的批次号)
    * @paramType java.math.BigDecimal
    * @param batchid - 批次号(一次结算多笔source时的批次号)
     */
    public void setBatchid(BigDecimal batchid) {
        this.batchid = batchid;
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
    * 获取-部门代码
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-部门代码
    * @paramType java.lang.String
    * @param departmentcode - 部门代码
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-source结算类型
    * @return sourcesettlementtype
     */
    public String getSourcesettlementtype() {
        return sourcesettlementtype;
    }

    /**
    * 设置-source结算类型
    * @paramType java.lang.String
    * @param sourcesettlementtype - source结算类型
     */
    public void setSourcesettlementtype(String sourcesettlementtype) {
        this.sourcesettlementtype = sourcesettlementtype;
    }

    /**
    * 获取-source数据来源号
    * @return sourceno
     */
    public BigDecimal getSourceno() {
        return sourceno;
    }

    /**
    * 设置-source数据来源号
    * @paramType java.math.BigDecimal
    * @param sourceno - source数据来源号
     */
    public void setSourceno(BigDecimal sourceno) {
        this.sourceno = sourceno;
    }

    /**
    * 获取-source数据类型
    * @return sourcedatatype
     */
    public String getSourcedatatype() {
        return sourcedatatype;
    }

    /**
    * 设置-source数据类型
    * @paramType java.lang.String
    * @param sourcedatatype - source数据类型
     */
    public void setSourcedatatype(String sourcedatatype) {
        this.sourcedatatype = sourcedatatype;
    }

    /**
    * 获取-币种
    * @return sourcecurrencycode
     */
    public String getSourcecurrencycode() {
        return sourcecurrencycode;
    }

    /**
    * 设置-币种
    * @paramType java.lang.String
    * @param sourcecurrencycode - 币种
     */
    public void setSourcecurrencycode(String sourcecurrencycode) {
        this.sourcecurrencycode = sourcecurrencycode;
    }

    /**
    * 获取-本次结算金额
    * @return sourceamount
     */
    public BigDecimal getSourceamount() {
        return sourceamount;
    }

    /**
    * 设置-本次结算金额
    * @paramType java.math.BigDecimal
    * @param sourceamount - 本次结算金额
     */
    public void setSourceamount(BigDecimal sourceamount) {
        this.sourceamount = sourceamount;
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
    * 获取-收付交易数据的客户名称（英文）
    * @return customernameen
     */
    public String getCustomernameen() {
        return customernameen;
    }

    /**
    * 设置-收付交易数据的客户名称（英文）
    * @paramType java.lang.String
    * @param customernameen - 收付交易数据的客户名称（英文）
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
    * 获取-银行账户id
    * @return mmaccountid
     */
    public Long getMmaccountid() {
        return mmaccountid;
    }

    /**
    * 设置-银行账户id
    * @paramType java.lang.Long
    * @param mmaccountid - 银行账户id
     */
    public void setMmaccountid(Long mmaccountid) {
        this.mmaccountid = mmaccountid;
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
    * 获取-支付方式
    * @return inpaymentmethod
     */
    public String getInpaymentmethod() {
        return inpaymentmethod;
    }

    /**
    * 设置-支付方式
    * @paramType java.lang.String
    * @param inpaymentmethod - 支付方式
     */
    public void setInpaymentmethod(String inpaymentmethod) {
        this.inpaymentmethod = inpaymentmethod;
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
    * 获取-客户开户行直联号(ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）)
    * @return banktype
     */
    public String getBanktype() {
        return banktype;
    }

    /**
    * 设置-客户开户行直联号(ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）)
    * @paramType java.lang.String
    * @param banktype - 客户开户行直联号(ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）)
     */
    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    /**
    * 获取-银行指令类型(1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口))
    * @return ispaypublic
     */
    public String getIspaypublic() {
        return ispaypublic;
    }

    /**
    * 设置-银行指令类型(1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口))
    * @paramType java.lang.String
    * @param ispaypublic - 银行指令类型(1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口))
     */
    public void setIspaypublic(String ispaypublic) {
        this.ispaypublic = ispaypublic;
    }

    /**
    * 获取-客户账户的卡折类型(1 存折、2 借记卡、3 贷记卡、4准贷记卡，默认为借记卡)
    * @return cardflag
     */
    public String getCardflag() {
        return cardflag;
    }

    /**
    * 设置-客户账户的卡折类型(1 存折、2 借记卡、3 贷记卡、4准贷记卡，默认为借记卡)
    * @paramType java.lang.String
    * @param cardflag - 客户账户的卡折类型(1 存折、2 借记卡、3 贷记卡、4准贷记卡，默认为借记卡)
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
    * 获取-加急标志(0 - 普通 1 - 加急")
    * @return fastflag
     */
    public String getFastflag() {
        return fastflag;
    }

    /**
    * 设置-加急标志(0 - 普通 1 - 加急")
    * @paramType java.lang.String
    * @param fastflag - 加急标志(0 - 普通 1 - 加急")
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
    * 获取-票据类型(1  支票 2  贷记凭证 3  进帐单4  信汇 5  电汇 6  票汇 7  解款单 8  本票 9  网上银行票根 10 无线pos刷卡)
    * @return checktype
     */
    public String getChecktype() {
        return checktype;
    }

    /**
    * 设置-票据类型(1  支票 2  贷记凭证 3  进帐单4  信汇 5  电汇 6  票汇 7  解款单 8  本票 9  网上银行票根 10 无线pos刷卡)
    * @paramType java.lang.String
    * @param checktype - 票据类型(1  支票 2  贷记凭证 3  进帐单4  信汇 5  电汇 6  票汇 7  解款单 8  本票 9  网上银行票根 10 无线pos刷卡)
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
    * 获取-代理人代码
    * @return agentcode
     */
    public String getAgentcode() {
        return agentcode;
    }

    /**
    * 设置-代理人代码
    * @paramType java.lang.String
    * @param agentcode - 代理人代码
     */
    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    /**
    * 获取-出票人代码
    * @return remittercode
     */
    public String getRemittercode() {
        return remittercode;
    }

    /**
    * 设置-出票人代码
    * @paramType java.lang.String
    * @param remittercode - 出票人代码
     */
    public void setRemittercode(String remittercode) {
        this.remittercode = remittercode;
    }

    /**
    * 获取-主要用于打印进账单优先使用出票人信息
    * @return remittername
     */
    public String getRemittername() {
        return remittername;
    }

    /**
    * 设置-主要用于打印进账单优先使用出票人信息
    * @paramType java.lang.String
    * @param remittername - 主要用于打印进账单优先使用出票人信息
     */
    public void setRemittername(String remittername) {
        this.remittername = remittername;
    }

    /**
    * 获取-用途
    * @return purpose
     */
    public String getPurpose() {
        return purpose;
    }

    /**
    * 设置-用途
    * @paramType java.lang.String
    * @param purpose - 用途
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
    * 获取-备注
    * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param memo - 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
    * 获取-业务系统对结算信息的额外描述(由前端录入。)
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-业务系统对结算信息的额外描述(由前端录入。)
    * @paramType java.lang.String
    * @param description - 业务系统对结算信息的额外描述(由前端录入。)
     */
    public void setDescription(String description) {
        this.description = description;
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
    * 获取-上传标志(0 不上传 1上传 2已回写)
    * @return ifupload
     */
    public String getIfupload() {
        return ifupload;
    }

    /**
    * 设置-上传标志(0 不上传 1上传 2已回写)
    * @paramType java.lang.String
    * @param ifupload - 上传标志(0 不上传 1上传 2已回写)
     */
    public void setIfupload(String ifupload) {
        this.ifupload = ifupload;
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
    * 获取-最后处理时的数据库系统时间(不考虑账期)
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后处理时的数据库系统时间(不考虑账期)
    * @paramType java.util.Date
    * @param lastopdate - 最后处理时的数据库系统时间(不考虑账期)
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
    * 获取-手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-收据号(保险公司开给客户的收据的号码)
    * @return receiptno
     */
    public String getReceiptno() {
        return receiptno;
    }

    /**
    * 设置-收据号(保险公司开给客户的收据的号码)
    * @paramType java.lang.String
    * @param receiptno - 收据号(保险公司开给客户的收据的号码)
     */
    public void setReceiptno(String receiptno) {
        this.receiptno = receiptno;
    }

    /**
    * 获取-页面标识(区分不同页面的具体操作：1 收款录入、2 扣款页面、3 交易平台付款、4现金付款、5预收款部门调整)
    * @return datamark
     */
    public String getDatamark() {
        return datamark;
    }

    /**
    * 设置-页面标识(区分不同页面的具体操作：1 收款录入、2 扣款页面、3 交易平台付款、4现金付款、5预收款部门调整)
    * @paramType java.lang.String
    * @param datamark - 页面标识(区分不同页面的具体操作：1 收款录入、2 扣款页面、3 交易平台付款、4现金付款、5预收款部门调整)
     */
    public void setDatamark(String datamark) {
        this.datamark = datamark;
    }

    /**
    * 获取-盘片号(对应mm_platformfile的id)
    * @return platformfileid
     */
    public String getPlatformfileid() {
        return platformfileid;
    }

    /**
    * 设置-盘片号(对应mm_platformfile的id)
    * @paramType java.lang.String
    * @param platformfileid - 盘片号(对应mm_platformfile的id)
     */
    public void setPlatformfileid(String platformfileid) {
        this.platformfileid = platformfileid;
    }

    /**
    * 获取-盘片明细id(对应MM_PLATFORMFILE_DETAIL_TD的id)
    * @return platformdetailid
     */
    public BigDecimal getPlatformdetailid() {
        return platformdetailid;
    }

    /**
    * 设置-盘片明细id(对应MM_PLATFORMFILE_DETAIL_TD的id)
    * @paramType java.math.BigDecimal
    * @param platformdetailid - 盘片明细id(对应MM_PLATFORMFILE_DETAIL_TD的id)
     */
    public void setPlatformdetailid(BigDecimal platformdetailid) {
        this.platformdetailid = platformdetailid;
    }

    /**
    * 获取-支付申请号
    * @return inpaymentno
     */
    public String getInpaymentno() {
        return inpaymentno;
    }

    /**
    * 设置-支付申请号
    * @paramType java.lang.String
    * @param inpaymentno - 支付申请号
     */
    public void setInpaymentno(String inpaymentno) {
        this.inpaymentno = inpaymentno;
    }

    /**
    * 获取-客户账户区域(转账付款必填，默认为0。0 - 国内 1 - 国外)
    * @return custaccountarea
     */
    public String getCustaccountarea() {
        return custaccountarea;
    }

    /**
    * 设置-客户账户区域(转账付款必填，默认为0。0 - 国内 1 - 国外)
    * @paramType java.lang.String
    * @param custaccountarea - 客户账户区域(转账付款必填，默认为0。0 - 国内 1 - 国外)
     */
    public void setCustaccountarea(String custaccountarea) {
        this.custaccountarea = custaccountarea;
    }

    /**
    * 获取-客户银行地址(境外汇款时使用)
    * @return custbankaddr
     */
    public String getCustbankaddr() {
        return custbankaddr;
    }

    /**
    * 设置-客户银行地址(境外汇款时使用)
    * @paramType java.lang.String
    * @param custbankaddr - 客户银行地址(境外汇款时使用)
     */
    public void setCustbankaddr(String custbankaddr) {
        this.custbankaddr = custbankaddr;
    }

    /**
    * 获取-SwiftCode：即国际银行代码，境外汇款时使用
    * @return custbankswiftcode
     */
    public String getCustbankswiftcode() {
        return custbankswiftcode;
    }

    /**
    * 设置-SwiftCode：即国际银行代码，境外汇款时使用
    * @paramType java.lang.String
    * @param custbankswiftcode - SwiftCode：即国际银行代码，境外汇款时使用
     */
    public void setCustbankswiftcode(String custbankswiftcode) {
        this.custbankswiftcode = custbankswiftcode;
    }

    /**
    * 获取-国内外费用承担(1汇款人OUR、2收款人BEN、3共同SHA)
    * @return custchargetype
     */
    public String getCustchargetype() {
        return custchargetype;
    }

    /**
    * 设置-国内外费用承担(1汇款人OUR、2收款人BEN、3共同SHA)
    * @paramType java.lang.String
    * @param custchargetype - 国内外费用承担(1汇款人OUR、2收款人BEN、3共同SHA)
     */
    public void setCustchargetype(String custchargetype) {
        this.custchargetype = custchargetype;
    }

    /**
    * 获取-存储生成方式(0批量导入,1手工录入,2系统接入,3合并流水)
    * @return createtype
     */
    public String getCreatetype() {
        return createtype;
    }

    /**
    * 设置-存储生成方式(0批量导入,1手工录入,2系统接入,3合并流水)
    * @paramType java.lang.String
    * @param createtype - 存储生成方式(0批量导入,1手工录入,2系统接入,3合并流水)
     */
    public void setCreatetype(String createtype) {
        this.createtype = createtype;
    }

    /**
    * 获取-对账码，银行对账码
    * @return bankabstract
     */
    public String getBankabstract() {
        return bankabstract;
    }

    /**
    * 设置-对账码，银行对账码
    * @paramType java.lang.String
    * @param bankabstract - 对账码，银行对账码
     */
    public void setBankabstract(String bankabstract) {
        this.bankabstract = bankabstract;
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
    * 获取-银行账号
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-银行账号
    * @paramType java.lang.String
    * @param accountno - 银行账号
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-折本位币汇率
    * @return accountrate
     */
    public BigDecimal getAccountrate() {
        return accountrate;
    }

    /**
    * 设置-折本位币汇率
    * @paramType java.math.BigDecimal
    * @param accountrate - 折本位币汇率
     */
    public void setAccountrate(BigDecimal accountrate) {
        this.accountrate = accountrate;
    }

    /**
    * 获取-折本位币金额
    * @return accountamount
     */
    public BigDecimal getAccountamount() {
        return accountamount;
    }

    /**
    * 设置-折本位币金额
    * @paramType java.math.BigDecimal
    * @param accountamount - 折本位币金额
     */
    public void setAccountamount(BigDecimal accountamount) {
        this.accountamount = accountamount;
    }
}