package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_centralization_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmCentralizationTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 批次序号
     */
    private String batchserialno;

    /**
     * 数据源
     */
    private String datasource;

    /**
     * 支付类型(3-手续费结算单 4-绩效结算单 5-再保结算单 6-赔款结算单 7-服务费结算单)
     */
    private String payway;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 结算单号
     */
    private String summaryno;

    /**
     * 结算单币种
     */
    private String currencycode;

    /**
     * 结算单金额
     */
    private BigDecimal amount;

    /**
     * 传送日期
     */
    private Date operatetime;

    /**
     * 业务单条数，总笔数
     */
    private Long businesscount;

    /**
     * 操作标志
     */
    private String opflag;

    /**
     * 退票重发次数
     */
    private Short batchnum;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 财务机构
     */
    private String unitcode;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 客户英文名称
     */
    private String customernameen;

    /**
     * 客户组代码
     */
    private String customerpartyno;

    /**
     * 1.初始状态,2落地成功,3.落地失败.4作废
     */
    private String status;

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
     * 客户开户行所在省份
     */
    private String bankprovince;

    /**
     * 客户开户行所在市
     */
    private String bankcity;

    /**
     * 客户开户行直联号
     */
    private String banktype;

    /**
     * 银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
     */
    private String ispaypublic;

    /**
     * 唯一流水号
     */
    private String custseq;

    /**
     * 冲销流水号（备用）
     */
    private String offsetno;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION版本号
     */
    private Short hibernateversion;

    /**
     * 手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
     */
    private String modifydesc;

    /**
     * 数据错误日志
     */
    private String errmsg;

    /**
     * 税金金额
     */
    private BigDecimal taxamount;

    /**
     * 已处理金额
     */
    private BigDecimal usedamount;

    /**
     * 核销状态，0初始状态，1部分核销，2全部核销
     */
    private String opstatus;

    /**
     * 财务险种
     */
    private String classescode;

    /**
     * 展业方式
     */
    private String businesschannel;

    /**
     * 客户手机号
     */
    private String mobilenumber;

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
     * 客户在银行的户名
     */
    private String custaccountname;

    /**
     * 加急标志。  "0 - 普通 1 - 加急"
     */
    private String fastflag;

    /**
     * 短信通知标志
     */
    private String smsflag;

    /**
     * 指定收付方式
     */
    private String inpaymentmethod;

    /**
     * 客户代理银行名称
     */
    private String custagentbankname;

    /**
     * 客户代理银行地址
     */
    private String custagentbankaddr;

    /**
     * 客户银行在代理银行的帐号
     */
    private String custagentaccountno;

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
     * 制单人工号
     */
    private String operatorcode;

    /**
     * 制单人名称
     */
    private String operatorname;

    /**
     * 江苏中介平台凭证登记码
     */
    private String voucherregno;

    /**
     * 江苏中介平台结算单号
     */
    private String agencysummaryno;

    /**
     * 例外支付状态
     */
    private String exstatus;

    /**
     * 例外支付原因
     */
    private String exceptioncause;

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
     * 纳税主体
     */
    private String taxorgtally;

    /**
     * 是否预结手续费，卡单预结手续费时必填，0 否，1 是
     */
    private String ifprecost;

    /**
     * 代理人类型，0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
     */
    private String agenttype;

    /**
     * 结算类型：0 无票支付  1 有票支付 2 先支付后开票
     */
    private String paytype;

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
     * 纳税人身份
     */
    private String taxespayertype;

    /**
     * 纳税人证件类型
     */
    private String taxescertificatetype;

    /**
     * 纳税人证件号码
     */
    private String taxescertificateno;

    /**
     * 开具发票类型
     */
    private String invoicetype;

    /**
     * 发票备注信息
     */
    private String invoiceremark;

    /**
     * 结算的手续费业务归属：0 车险 1 团险 2 个险
     */
    private String businessbelong;

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
    * 获取-批次序号
    * @return batchserialno
     */
    public String getBatchserialno() {
        return batchserialno;
    }

    /**
    * 设置-批次序号
    * @paramType java.lang.String
    * @param batchserialno - 批次序号
     */
    public void setBatchserialno(String batchserialno) {
        this.batchserialno = batchserialno;
    }

    /**
    * 获取-数据源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据源
    * @paramType java.lang.String
    * @param datasource - 数据源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-支付类型(3-手续费结算单 4-绩效结算单 5-再保结算单 6-赔款结算单 7-服务费结算单)
    * @return payway
     */
    public String getPayway() {
        return payway;
    }

    /**
    * 设置-支付类型(3-手续费结算单 4-绩效结算单 5-再保结算单 6-赔款结算单 7-服务费结算单)
    * @paramType java.lang.String
    * @param payway - 支付类型(3-手续费结算单 4-绩效结算单 5-再保结算单 6-赔款结算单 7-服务费结算单)
     */
    public void setPayway(String payway) {
        this.payway = payway;
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
    * 获取-结算单币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-结算单币种
    * @paramType java.lang.String
    * @param currencycode - 结算单币种
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-结算单金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-结算单金额
    * @paramType java.math.BigDecimal
    * @param amount - 结算单金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-传送日期
    * @return operatetime
     */
    public Date getOperatetime() {
        return operatetime;
    }

    /**
    * 设置-传送日期
    * @paramType java.util.Date
    * @param operatetime - 传送日期
     */
    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    /**
    * 获取-业务单条数，总笔数
    * @return businesscount
     */
    public Long getBusinesscount() {
        return businesscount;
    }

    /**
    * 设置-业务单条数，总笔数
    * @paramType java.lang.Long
    * @param businesscount - 业务单条数，总笔数
     */
    public void setBusinesscount(Long businesscount) {
        this.businesscount = businesscount;
    }

    /**
    * 获取-操作标志
    * @return opflag
     */
    public String getOpflag() {
        return opflag;
    }

    /**
    * 设置-操作标志
    * @paramType java.lang.String
    * @param opflag - 操作标志
     */
    public void setOpflag(String opflag) {
        this.opflag = opflag;
    }

    /**
    * 获取-退票重发次数
    * @return batchnum
     */
    public Short getBatchnum() {
        return batchnum;
    }

    /**
    * 设置-退票重发次数
    * @paramType java.lang.Short
    * @param batchnum - 退票重发次数
     */
    public void setBatchnum(Short batchnum) {
        this.batchnum = batchnum;
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
    * 获取-财务机构
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-财务机构
    * @paramType java.lang.String
    * @param unitcode - 财务机构
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
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
    * 获取-1.初始状态,2落地成功,3.落地失败.4作废
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-1.初始状态,2落地成功,3.落地失败.4作废
    * @paramType java.lang.String
    * @param status - 1.初始状态,2落地成功,3.落地失败.4作废
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-客户开户行直联号
    * @return banktype
     */
    public String getBanktype() {
        return banktype;
    }

    /**
    * 设置-客户开户行直联号
    * @paramType java.lang.String
    * @param banktype - 客户开户行直联号
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
    * 获取-唯一流水号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-唯一流水号
    * @paramType java.lang.String
    * @param custseq - 唯一流水号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-冲销流水号（备用）
    * @return offsetno
     */
    public String getOffsetno() {
        return offsetno;
    }

    /**
    * 设置-冲销流水号（备用）
    * @paramType java.lang.String
    * @param offsetno - 冲销流水号（备用）
     */
    public void setOffsetno(String offsetno) {
        this.offsetno = offsetno;
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
    * 获取-最后操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-HIBERNATEVERSION版本号
    * @return hibernateversion
     */
    public Short getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本号
    * @paramType java.lang.Short
    * @param hibernateversion - HIBERNATEVERSION版本号
     */
    public void setHibernateversion(Short hibernateversion) {
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
    * 获取-税金金额
    * @return taxamount
     */
    public BigDecimal getTaxamount() {
        return taxamount;
    }

    /**
    * 设置-税金金额
    * @paramType java.math.BigDecimal
    * @param taxamount - 税金金额
     */
    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
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
    * 获取-核销状态，0初始状态，1部分核销，2全部核销
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-核销状态，0初始状态，1部分核销，2全部核销
    * @paramType java.lang.String
    * @param opstatus - 核销状态，0初始状态，1部分核销，2全部核销
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-财务险种
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-财务险种
    * @paramType java.lang.String
    * @param classescode - 财务险种
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-展业方式
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-展业方式
    * @paramType java.lang.String
    * @param businesschannel - 展业方式
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
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
    * 获取-客户在银行的户名
    * @return custaccountname
     */
    public String getCustaccountname() {
        return custaccountname;
    }

    /**
    * 设置-客户在银行的户名
    * @paramType java.lang.String
    * @param custaccountname - 客户在银行的户名
     */
    public void setCustaccountname(String custaccountname) {
        this.custaccountname = custaccountname;
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
    * 获取-江苏中介平台凭证登记码
    * @return voucherregno
     */
    public String getVoucherregno() {
        return voucherregno;
    }

    /**
    * 设置-江苏中介平台凭证登记码
    * @paramType java.lang.String
    * @param voucherregno - 江苏中介平台凭证登记码
     */
    public void setVoucherregno(String voucherregno) {
        this.voucherregno = voucherregno;
    }

    /**
    * 获取-江苏中介平台结算单号
    * @return agencysummaryno
     */
    public String getAgencysummaryno() {
        return agencysummaryno;
    }

    /**
    * 设置-江苏中介平台结算单号
    * @paramType java.lang.String
    * @param agencysummaryno - 江苏中介平台结算单号
     */
    public void setAgencysummaryno(String agencysummaryno) {
        this.agencysummaryno = agencysummaryno;
    }

    /**
    * 获取-例外支付状态
    * @return exstatus
     */
    public String getExstatus() {
        return exstatus;
    }

    /**
    * 设置-例外支付状态
    * @paramType java.lang.String
    * @param exstatus - 例外支付状态
     */
    public void setExstatus(String exstatus) {
        this.exstatus = exstatus;
    }

    /**
    * 获取-例外支付原因
    * @return exceptioncause
     */
    public String getExceptioncause() {
        return exceptioncause;
    }

    /**
    * 设置-例外支付原因
    * @paramType java.lang.String
    * @param exceptioncause - 例外支付原因
     */
    public void setExceptioncause(String exceptioncause) {
        this.exceptioncause = exceptioncause;
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
    * 获取-代理人类型，0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
    * @return agenttype
     */
    public String getAgenttype() {
        return agenttype;
    }

    /**
    * 设置-代理人类型，0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
    * @paramType java.lang.String
    * @param agenttype - 代理人类型，0 专业代理 1 经纪公司  2 兼业代理 3 个人代理
     */
    public void setAgenttype(String agenttype) {
        this.agenttype = agenttype;
    }

    /**
    * 获取-结算类型：0 无票支付  1 有票支付 2 先支付后开票
    * @return paytype
     */
    public String getPaytype() {
        return paytype;
    }

    /**
    * 设置-结算类型：0 无票支付  1 有票支付 2 先支付后开票
    * @paramType java.lang.String
    * @param paytype - 结算类型：0 无票支付  1 有票支付 2 先支付后开票
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
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
    * 获取-纳税人身份
    * @return taxespayertype
     */
    public String getTaxespayertype() {
        return taxespayertype;
    }

    /**
    * 设置-纳税人身份
    * @paramType java.lang.String
    * @param taxespayertype - 纳税人身份
     */
    public void setTaxespayertype(String taxespayertype) {
        this.taxespayertype = taxespayertype;
    }

    /**
    * 获取-纳税人证件类型
    * @return taxescertificatetype
     */
    public String getTaxescertificatetype() {
        return taxescertificatetype;
    }

    /**
    * 设置-纳税人证件类型
    * @paramType java.lang.String
    * @param taxescertificatetype - 纳税人证件类型
     */
    public void setTaxescertificatetype(String taxescertificatetype) {
        this.taxescertificatetype = taxescertificatetype;
    }

    /**
    * 获取-纳税人证件号码
    * @return taxescertificateno
     */
    public String getTaxescertificateno() {
        return taxescertificateno;
    }

    /**
    * 设置-纳税人证件号码
    * @paramType java.lang.String
    * @param taxescertificateno - 纳税人证件号码
     */
    public void setTaxescertificateno(String taxescertificateno) {
        this.taxescertificateno = taxescertificateno;
    }

    /**
    * 获取-开具发票类型
    * @return invoicetype
     */
    public String getInvoicetype() {
        return invoicetype;
    }

    /**
    * 设置-开具发票类型
    * @paramType java.lang.String
    * @param invoicetype - 开具发票类型
     */
    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
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