package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_match_dest_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmMatchDestTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * source数据的物理主键id
     */
    private Long sourceid;

    /**
     * destno数据来源号
     */
    private Long destno;

    /**
     * dest结算类型(1-核销 2转账)
     */
    private String destsettlementtype;

    /**
     * dest数据的datatype
     */
    private String destdatatype;

    /**
     * 本条dest数据对应的货币兑换币种
     */
    private String exchangecurrencycode;

    /**
     * 本条dest数据对应的货币兑换金额
     */
    private BigDecimal exchangeamount;

    /**
     * 本条dest数据的币种
     */
    private String destcurrencycode;

    /**
     * 本条dest数据的本次结算金额
     */
    private BigDecimal destamount;

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
     * 清单号
     */
    private String returnno;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 风险类别
     */
    private String risktype;

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
     * 最后处理时的数据库系统时间，不考虑账期
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
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 结算单号
     */
    private String summaryno;

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
     * 结算单类型 0 非结算单 、 1 保费结算单、 2赔款结算单（暂无）、 3 手续费结算单
     */
    private String summarytype;

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
     * 业务系统对结算信息的额外描述。由前端录入。
     */
    private String description;

    /**
     * 财务险类
     */
    private String segment1;

    /**
     * 具体费用类型
     */
    private String segment2;

    /**
     * 是否做子险拆分 0 不拆分 1拆分
     */
    private String issplitted;

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
    * 获取-source数据的物理主键id
    * @return sourceid
     */
    public Long getSourceid() {
        return sourceid;
    }

    /**
    * 设置-source数据的物理主键id
    * @paramType java.lang.Long
    * @param sourceid - source数据的物理主键id
     */
    public void setSourceid(Long sourceid) {
        this.sourceid = sourceid;
    }

    /**
    * 获取-destno数据来源号
    * @return destno
     */
    public Long getDestno() {
        return destno;
    }

    /**
    * 设置-destno数据来源号
    * @paramType java.lang.Long
    * @param destno - destno数据来源号
     */
    public void setDestno(Long destno) {
        this.destno = destno;
    }

    /**
    * 获取-dest结算类型(1-核销 2转账)
    * @return destsettlementtype
     */
    public String getDestsettlementtype() {
        return destsettlementtype;
    }

    /**
    * 设置-dest结算类型(1-核销 2转账)
    * @paramType java.lang.String
    * @param destsettlementtype - dest结算类型(1-核销 2转账)
     */
    public void setDestsettlementtype(String destsettlementtype) {
        this.destsettlementtype = destsettlementtype;
    }

    /**
    * 获取-dest数据的datatype
    * @return destdatatype
     */
    public String getDestdatatype() {
        return destdatatype;
    }

    /**
    * 设置-dest数据的datatype
    * @paramType java.lang.String
    * @param destdatatype - dest数据的datatype
     */
    public void setDestdatatype(String destdatatype) {
        this.destdatatype = destdatatype;
    }

    /**
    * 获取-本条dest数据对应的货币兑换币种
    * @return exchangecurrencycode
     */
    public String getExchangecurrencycode() {
        return exchangecurrencycode;
    }

    /**
    * 设置-本条dest数据对应的货币兑换币种
    * @paramType java.lang.String
    * @param exchangecurrencycode - 本条dest数据对应的货币兑换币种
     */
    public void setExchangecurrencycode(String exchangecurrencycode) {
        this.exchangecurrencycode = exchangecurrencycode;
    }

    /**
    * 获取-本条dest数据对应的货币兑换金额
    * @return exchangeamount
     */
    public BigDecimal getExchangeamount() {
        return exchangeamount;
    }

    /**
    * 设置-本条dest数据对应的货币兑换金额
    * @paramType java.math.BigDecimal
    * @param exchangeamount - 本条dest数据对应的货币兑换金额
     */
    public void setExchangeamount(BigDecimal exchangeamount) {
        this.exchangeamount = exchangeamount;
    }

    /**
    * 获取-本条dest数据的币种
    * @return destcurrencycode
     */
    public String getDestcurrencycode() {
        return destcurrencycode;
    }

    /**
    * 设置-本条dest数据的币种
    * @paramType java.lang.String
    * @param destcurrencycode - 本条dest数据的币种
     */
    public void setDestcurrencycode(String destcurrencycode) {
        this.destcurrencycode = destcurrencycode;
    }

    /**
    * 获取-本条dest数据的本次结算金额
    * @return destamount
     */
    public BigDecimal getDestamount() {
        return destamount;
    }

    /**
    * 设置-本条dest数据的本次结算金额
    * @paramType java.math.BigDecimal
    * @param destamount - 本条dest数据的本次结算金额
     */
    public void setDestamount(BigDecimal destamount) {
        this.destamount = destamount;
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
    * 获取-清单号
    * @return returnno
     */
    public String getReturnno() {
        return returnno;
    }

    /**
    * 设置-清单号
    * @paramType java.lang.String
    * @param returnno - 清单号
     */
    public void setReturnno(String returnno) {
        this.returnno = returnno;
    }

    /**
    * 获取-险种代码
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种代码
    * @paramType java.lang.String
    * @param classescode - 险种代码
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
    * 获取-结算单号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-结算单号
    * @paramType java.lang.String
    * @param summaryno - 结算单号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
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
    * 获取-结算单类型 0 非结算单 、 1 保费结算单、 2赔款结算单（暂无）、 3 手续费结算单
    * @return summarytype
     */
    public String getSummarytype() {
        return summarytype;
    }

    /**
    * 设置-结算单类型 0 非结算单 、 1 保费结算单、 2赔款结算单（暂无）、 3 手续费结算单
    * @paramType java.lang.String
    * @param summarytype - 结算单类型 0 非结算单 、 1 保费结算单、 2赔款结算单（暂无）、 3 手续费结算单
     */
    public void setSummarytype(String summarytype) {
        this.summarytype = summarytype;
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
    * 获取-财务险类
    * @return segment1
     */
    public String getSegment1() {
        return segment1;
    }

    /**
    * 设置-财务险类
    * @paramType java.lang.String
    * @param segment1 - 财务险类
     */
    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    /**
    * 获取-具体费用类型
    * @return segment2
     */
    public String getSegment2() {
        return segment2;
    }

    /**
    * 设置-具体费用类型
    * @paramType java.lang.String
    * @param segment2 - 具体费用类型
     */
    public void setSegment2(String segment2) {
        this.segment2 = segment2;
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
}