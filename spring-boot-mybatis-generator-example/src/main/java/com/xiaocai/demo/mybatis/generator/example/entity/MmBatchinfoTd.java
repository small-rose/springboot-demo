package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_batchinfo_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBatchinfoTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 接口表主键
     */
    private String seqbatch;

    /**
     * 数据源
     */
    private String datasource;

    /**
     * 业务类型
     */
    private String certitype;

    /**
     * 批号/打包号
     */
    private String summaryno;

    /**
     * 财务机构代码
     */
    private String unitcode;

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
     * 序号
     */
    private String serialno;

    /**
     * 业务性质
     */
    private String datatype;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 核销状态
     */
    private String opstatus;

    /**
     * 实收/实付金额（记账币种）
     */
    private BigDecimal realamount;

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
     * 实际支付币种
     */
    private String actualcurrencycode;

    /**
     * 实际支付币种针对原币种的兑换汇率
     */
    private BigDecimal actualexchangerate;

    /**
     * 实际支付手续费
     */
    private BigDecimal actualcommissionamount;

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
     * 客户开户名称
     */
    private String custaccountname;

    /**
     * 再保系统的账单号
     */
    private String ribillno;

    /**
     * 再保人人代码
     */
    private String reinsurercode;

    /**
     * 手续费支付平台确认码
     */
    private String confirmcode;

    /**
     * 手续费支付平台支付号
     */
    private String inpaymentno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 代理点名称
     */
    private String agentnamecn;

    /**
     * 投保人名称
     */
    private String applicantnamecn;

    /**
     * 渠道代码
     */
    private String businesschannel;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 手续费比例
     */
    private BigDecimal feepercentage;

    /**
     * 被保险人名称
     */
    private String insuredname;

    /**
     * 期次
     */
    private BigDecimal seqno;

    /**
     * 签单保费
     */
    private BigDecimal signamount;

    /**
     * 资金业务单据号
     */
    private String billcode;

    /**
     * 状态
     */
    private String status;

    /**
     * 是否退票0：未退票 1：已退票
     */
    private String ifbillback;

    /**
     * 明细账单条数
     */
    private BigDecimal ribillcount;

    /**
     * 数据标识：0非最后一笔，1表示最后一笔
     */
    private String iffinal;

    /**
     * 业务系统唯一主键
     */
    private String custseq;

    /**
     * 提取年月
     */
    private Date opdate;

    /**
     * 汇率
     */
    private BigDecimal conversionrate;

    /**
     * 车辆使用性质
     */
    private String useporperty;

    /**
     * 业务险种，责任险报表提数使用
     */
    private String classessprod;

    /**
     * 车辆种类
     */
    private String vehkind;

    /**
     * 涉水标识 01 涉水  02非涉水
     */
    private String marineflag;

    /**
     * 产品代码
     */
    private String procudecode;

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
    * 获取-接口表主键
    * @return seqbatch
     */
    public String getSeqbatch() {
        return seqbatch;
    }

    /**
    * 设置-接口表主键
    * @paramType java.lang.String
    * @param seqbatch - 接口表主键
     */
    public void setSeqbatch(String seqbatch) {
        this.seqbatch = seqbatch;
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
    * 获取-业务类型
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param certitype - 业务类型
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
    }

    /**
    * 获取-批号/打包号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-批号/打包号
    * @paramType java.lang.String
    * @param summaryno - 批号/打包号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
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
    * 获取-序号
    * @return serialno
     */
    public String getSerialno() {
        return serialno;
    }

    /**
    * 设置-序号
    * @paramType java.lang.String
    * @param serialno - 序号
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
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
    * 获取-币种
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种
    * @paramType java.lang.String
    * @param currencycode - 币种
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
    * 获取-实际支付币种
    * @return actualcurrencycode
     */
    public String getActualcurrencycode() {
        return actualcurrencycode;
    }

    /**
    * 设置-实际支付币种
    * @paramType java.lang.String
    * @param actualcurrencycode - 实际支付币种
     */
    public void setActualcurrencycode(String actualcurrencycode) {
        this.actualcurrencycode = actualcurrencycode;
    }

    /**
    * 获取-实际支付币种针对原币种的兑换汇率
    * @return actualexchangerate
     */
    public BigDecimal getActualexchangerate() {
        return actualexchangerate;
    }

    /**
    * 设置-实际支付币种针对原币种的兑换汇率
    * @paramType java.math.BigDecimal
    * @param actualexchangerate - 实际支付币种针对原币种的兑换汇率
     */
    public void setActualexchangerate(BigDecimal actualexchangerate) {
        this.actualexchangerate = actualexchangerate;
    }

    /**
    * 获取-实际支付手续费
    * @return actualcommissionamount
     */
    public BigDecimal getActualcommissionamount() {
        return actualcommissionamount;
    }

    /**
    * 设置-实际支付手续费
    * @paramType java.math.BigDecimal
    * @param actualcommissionamount - 实际支付手续费
     */
    public void setActualcommissionamount(BigDecimal actualcommissionamount) {
        this.actualcommissionamount = actualcommissionamount;
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
    * 获取-客户开户名称
    * @return custaccountname
     */
    public String getCustaccountname() {
        return custaccountname;
    }

    /**
    * 设置-客户开户名称
    * @paramType java.lang.String
    * @param custaccountname - 客户开户名称
     */
    public void setCustaccountname(String custaccountname) {
        this.custaccountname = custaccountname;
    }

    /**
    * 获取-再保系统的账单号
    * @return ribillno
     */
    public String getRibillno() {
        return ribillno;
    }

    /**
    * 设置-再保系统的账单号
    * @paramType java.lang.String
    * @param ribillno - 再保系统的账单号
     */
    public void setRibillno(String ribillno) {
        this.ribillno = ribillno;
    }

    /**
    * 获取-再保人人代码
    * @return reinsurercode
     */
    public String getReinsurercode() {
        return reinsurercode;
    }

    /**
    * 设置-再保人人代码
    * @paramType java.lang.String
    * @param reinsurercode - 再保人人代码
     */
    public void setReinsurercode(String reinsurercode) {
        this.reinsurercode = reinsurercode;
    }

    /**
    * 获取-手续费支付平台确认码
    * @return confirmcode
     */
    public String getConfirmcode() {
        return confirmcode;
    }

    /**
    * 设置-手续费支付平台确认码
    * @paramType java.lang.String
    * @param confirmcode - 手续费支付平台确认码
     */
    public void setConfirmcode(String confirmcode) {
        this.confirmcode = confirmcode;
    }

    /**
    * 获取-手续费支付平台支付号
    * @return inpaymentno
     */
    public String getInpaymentno() {
        return inpaymentno;
    }

    /**
    * 设置-手续费支付平台支付号
    * @paramType java.lang.String
    * @param inpaymentno - 手续费支付平台支付号
     */
    public void setInpaymentno(String inpaymentno) {
        this.inpaymentno = inpaymentno;
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
    * 获取-代理点名称
    * @return agentnamecn
     */
    public String getAgentnamecn() {
        return agentnamecn;
    }

    /**
    * 设置-代理点名称
    * @paramType java.lang.String
    * @param agentnamecn - 代理点名称
     */
    public void setAgentnamecn(String agentnamecn) {
        this.agentnamecn = agentnamecn;
    }

    /**
    * 获取-投保人名称
    * @return applicantnamecn
     */
    public String getApplicantnamecn() {
        return applicantnamecn;
    }

    /**
    * 设置-投保人名称
    * @paramType java.lang.String
    * @param applicantnamecn - 投保人名称
     */
    public void setApplicantnamecn(String applicantnamecn) {
        this.applicantnamecn = applicantnamecn;
    }

    /**
    * 获取-渠道代码
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-渠道代码
    * @paramType java.lang.String
    * @param businesschannel - 渠道代码
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
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
    * 获取-手续费比例
    * @return feepercentage
     */
    public BigDecimal getFeepercentage() {
        return feepercentage;
    }

    /**
    * 设置-手续费比例
    * @paramType java.math.BigDecimal
    * @param feepercentage - 手续费比例
     */
    public void setFeepercentage(BigDecimal feepercentage) {
        this.feepercentage = feepercentage;
    }

    /**
    * 获取-被保险人名称
    * @return insuredname
     */
    public String getInsuredname() {
        return insuredname;
    }

    /**
    * 设置-被保险人名称
    * @paramType java.lang.String
    * @param insuredname - 被保险人名称
     */
    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    /**
    * 获取-期次
    * @return seqno
     */
    public BigDecimal getSeqno() {
        return seqno;
    }

    /**
    * 设置-期次
    * @paramType java.math.BigDecimal
    * @param seqno - 期次
     */
    public void setSeqno(BigDecimal seqno) {
        this.seqno = seqno;
    }

    /**
    * 获取-签单保费
    * @return signamount
     */
    public BigDecimal getSignamount() {
        return signamount;
    }

    /**
    * 设置-签单保费
    * @paramType java.math.BigDecimal
    * @param signamount - 签单保费
     */
    public void setSignamount(BigDecimal signamount) {
        this.signamount = signamount;
    }

    /**
    * 获取-资金业务单据号
    * @return billcode
     */
    public String getBillcode() {
        return billcode;
    }

    /**
    * 设置-资金业务单据号
    * @paramType java.lang.String
    * @param billcode - 资金业务单据号
     */
    public void setBillcode(String billcode) {
        this.billcode = billcode;
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
    * 获取-明细账单条数
    * @return ribillcount
     */
    public BigDecimal getRibillcount() {
        return ribillcount;
    }

    /**
    * 设置-明细账单条数
    * @paramType java.math.BigDecimal
    * @param ribillcount - 明细账单条数
     */
    public void setRibillcount(BigDecimal ribillcount) {
        this.ribillcount = ribillcount;
    }

    /**
    * 获取-数据标识：0非最后一笔，1表示最后一笔
    * @return iffinal
     */
    public String getIffinal() {
        return iffinal;
    }

    /**
    * 设置-数据标识：0非最后一笔，1表示最后一笔
    * @paramType java.lang.String
    * @param iffinal - 数据标识：0非最后一笔，1表示最后一笔
     */
    public void setIffinal(String iffinal) {
        this.iffinal = iffinal;
    }

    /**
    * 获取-业务系统唯一主键
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务系统唯一主键
    * @paramType java.lang.String
    * @param custseq - 业务系统唯一主键
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-提取年月
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-提取年月
    * @paramType java.util.Date
    * @param opdate - 提取年月
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-汇率
    * @return conversionrate
     */
    public BigDecimal getConversionrate() {
        return conversionrate;
    }

    /**
    * 设置-汇率
    * @paramType java.math.BigDecimal
    * @param conversionrate - 汇率
     */
    public void setConversionrate(BigDecimal conversionrate) {
        this.conversionrate = conversionrate;
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
    * 获取-业务险种，责任险报表提数使用
    * @return classessprod
     */
    public String getClassessprod() {
        return classessprod;
    }

    /**
    * 设置-业务险种，责任险报表提数使用
    * @paramType java.lang.String
    * @param classessprod - 业务险种，责任险报表提数使用
     */
    public void setClassessprod(String classessprod) {
        this.classessprod = classessprod;
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
    * 获取-涉水标识 01 涉水  02非涉水
    * @return marineflag
     */
    public String getMarineflag() {
        return marineflag;
    }

    /**
    * 设置-涉水标识 01 涉水  02非涉水
    * @paramType java.lang.String
    * @param marineflag - 涉水标识 01 涉水  02非涉水
     */
    public void setMarineflag(String marineflag) {
        this.marineflag = marineflag;
    }

    /**
    * 获取-产品代码
    * @return procudecode
     */
    public String getProcudecode() {
        return procudecode;
    }

    /**
    * 设置-产品代码
    * @paramType java.lang.String
    * @param procudecode - 产品代码
     */
    public void setProcudecode(String procudecode) {
        this.procudecode = procudecode;
    }
}