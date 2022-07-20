package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_writeout_to
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmWriteoutTo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 传送批次号
     */
    private String batchId;

    /**
     * 日接单流水号(明细表唯一号)
     */
    private Long seqreportno;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 回写类型：1;承保,2:赔款,3:手续费,4:再保
     */
    private String writeouttype;

    /**
     * 业务唯一号
     */
    private String businessno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 业务部门代码
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
     * 手续费清单号，就是结算单号
     */
    private String applyno;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 业务类型
     */
    private String datatype;

    /**
     * 业务性质,同接口表业务性质datatype
     */
    private String businessattr;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 承保币种
     */
    private String basecurrencycode;

    /**
     * 入帐金额(保单币种)
     */
    private BigDecimal baseaccountamount;

    /**
     * 挂账金额（保单币种）
     */
    private BigDecimal basereceivableamount;

    /**
     * 实收付金额（保单币种）
     */
    private BigDecimal baserealamount;

    /**
     * 记账币种
     */
    private String currencycode;

    /**
     * 入帐金额(记账币种)
     */
    private BigDecimal accountamount;

    /**
     * 挂账金额（记账币种）
     */
    private BigDecimal receivableamount;

    /**
     * 实收付金额（记账币种）
     */
    private BigDecimal realamount;

    /**
     * 赔款=赔案的赔付序号,手续费=手续费序号
     */
    private String serialno;

    /**
     * 一次赔付的多个客户的序号
     */
    private String custseq;

    /**
     * 账单号
     */
    private String accno;

    /**
     * 健康险人意险是否拆分过，0 为未处理；1 已拆分；2 不需拆分；3 需要拆分
     */
    private String issplitted;

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
     * 投保确认码，上传手续费中介平台使用
     */
    private String confirmsequenceno;

    /**
     * 保险中介服务统一发票号码，上传手续费中介平台使用
     */
    private String invoicecode;

    /**
     * 发票开具单位（签章单位），上传手续费中介平台使用
     */
    private String invoicedunit;

    /**
     * 发票金额，上传手续费中介平台使用
     */
    private BigDecimal invoiceamount;

    /**
     * 网银流水号，上传手续费中介平台使用
     */
    private String ebankingsequenceno;

    /**
     * 收款单位名称，上传手续费中介平台使用
     */
    private String receiveunit;

    /**
     * 收付系统凭证号
     */
    private String reference4;

    /**
     * 总账凭证号
     */
    private String voucherno;

    /**
     * 共保期次号
     */
    private Short thisseq;

    /**
     * 错误码
     */
    private String errorcode;

    /**
     * 错误信息
     */
    private String errormsg;

    /**
     * 状态：1实收 2实付 3实收取消 4实付取消 5未付款退票 6资金退票 7网银流水号上传 8凭证回写  9 结算单文件回写
     */
    private String opflag;

    /**
     * 传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误 55为红蓝对冲数据，不需上传平台 66 为回写模板设置错误，不需回写销售系统（eg:107942）
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
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATE版本号
     */
    private Long hibernateversion;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 被保险人代码
     */
    private String insuredcode;

    /**
     * 被保险人名称
     */
    private String insuredname;

    /**
     * 数据生成方式，不同方式seqreportno不一样：0 根据日结单明细生成 、1 根据payablemoney表生成、2 根据交易流水表生成
     */
    private String sourcetype;

    /**
     * inpaymentid,mm_inpayment_td表的id
     */
    private Long inpaymentid;

    /**
     * 此期次应收保费
     */
    private BigDecimal basepayableamount;

    /**
     * 开始时间
     */
    private Date begintime;

    /**
     * 成功时间
     */
    private Date sucesstime;

    /**
     * 单证号
     */
    private String biztype;

    /**
     * 税金金额（记账币种）
     */
    private BigDecimal taxesrealamount;

    /**
     * 税金金额（保单币种）
     */
    private BigDecimal basetaxesrealamount;

    /**
     * 税后实收付金额(人民币币别)
     */
    private BigDecimal realamountrmb;

    /**
     * 税前实收付金额(人民币币别)
     */
    private BigDecimal taxesrealamountrmb;

    /**
     * 汇率
     */
    private BigDecimal exchangerate;

    /**
     * 报案号
     */
    private String reportcaseno;

    /**
     * 共保人代码
     */
    private String masterno;

    /**
     * 共保人名称
     */
    private String mastername;

    /**
     * 投保单号/批改申请单号
     */
    private String applicantno;

    /**
     * 帐单序号
     */
    private String totalserialno;

    /**
     * 农险回写信息
     */
    private String agristatus;

    /**
     * 外部系统来源
     */
    private String outdatasource;

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
    * 获取-传送批次号
    * @return batchId
     */
    public String getBatchId() {
        return batchId;
    }

    /**
    * 设置-传送批次号
    * @paramType java.lang.String
    * @param batchId - 传送批次号
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
    * 获取-日接单流水号(明细表唯一号)
    * @return seqreportno
     */
    public Long getSeqreportno() {
        return seqreportno;
    }

    /**
    * 设置-日接单流水号(明细表唯一号)
    * @paramType java.lang.Long
    * @param seqreportno - 日接单流水号(明细表唯一号)
     */
    public void setSeqreportno(Long seqreportno) {
        this.seqreportno = seqreportno;
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
    * 获取-回写类型：1;承保,2:赔款,3:手续费,4:再保
    * @return writeouttype
     */
    public String getWriteouttype() {
        return writeouttype;
    }

    /**
    * 设置-回写类型：1;承保,2:赔款,3:手续费,4:再保
    * @paramType java.lang.String
    * @param writeouttype - 回写类型：1;承保,2:赔款,3:手续费,4:再保
     */
    public void setWriteouttype(String writeouttype) {
        this.writeouttype = writeouttype;
    }

    /**
    * 获取-业务唯一号
    * @return businessno
     */
    public String getBusinessno() {
        return businessno;
    }

    /**
    * 设置-业务唯一号
    * @paramType java.lang.String
    * @param businessno - 业务唯一号
     */
    public void setBusinessno(String businessno) {
        this.businessno = businessno;
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
    * 获取-手续费清单号，就是结算单号
    * @return applyno
     */
    public String getApplyno() {
        return applyno;
    }

    /**
    * 设置-手续费清单号，就是结算单号
    * @paramType java.lang.String
    * @param applyno - 手续费清单号，就是结算单号
     */
    public void setApplyno(String applyno) {
        this.applyno = applyno;
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
    * 获取-业务类型
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param datatype - 业务类型
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-业务性质,同接口表业务性质datatype
    * @return businessattr
     */
    public String getBusinessattr() {
        return businessattr;
    }

    /**
    * 设置-业务性质,同接口表业务性质datatype
    * @paramType java.lang.String
    * @param businessattr - 业务性质,同接口表业务性质datatype
     */
    public void setBusinessattr(String businessattr) {
        this.businessattr = businessattr;
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
    * 获取-承保币种
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-承保币种
    * @paramType java.lang.String
    * @param basecurrencycode - 承保币种
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
    }

    /**
    * 获取-入帐金额(保单币种)
    * @return baseaccountamount
     */
    public BigDecimal getBaseaccountamount() {
        return baseaccountamount;
    }

    /**
    * 设置-入帐金额(保单币种)
    * @paramType java.math.BigDecimal
    * @param baseaccountamount - 入帐金额(保单币种)
     */
    public void setBaseaccountamount(BigDecimal baseaccountamount) {
        this.baseaccountamount = baseaccountamount;
    }

    /**
    * 获取-挂账金额（保单币种）
    * @return basereceivableamount
     */
    public BigDecimal getBasereceivableamount() {
        return basereceivableamount;
    }

    /**
    * 设置-挂账金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param basereceivableamount - 挂账金额（保单币种）
     */
    public void setBasereceivableamount(BigDecimal basereceivableamount) {
        this.basereceivableamount = basereceivableamount;
    }

    /**
    * 获取-实收付金额（保单币种）
    * @return baserealamount
     */
    public BigDecimal getBaserealamount() {
        return baserealamount;
    }

    /**
    * 设置-实收付金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param baserealamount - 实收付金额（保单币种）
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
    * 获取-入帐金额(记账币种)
    * @return accountamount
     */
    public BigDecimal getAccountamount() {
        return accountamount;
    }

    /**
    * 设置-入帐金额(记账币种)
    * @paramType java.math.BigDecimal
    * @param accountamount - 入帐金额(记账币种)
     */
    public void setAccountamount(BigDecimal accountamount) {
        this.accountamount = accountamount;
    }

    /**
    * 获取-挂账金额（记账币种）
    * @return receivableamount
     */
    public BigDecimal getReceivableamount() {
        return receivableamount;
    }

    /**
    * 设置-挂账金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param receivableamount - 挂账金额（记账币种）
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
    * 获取-账单号
    * @return accno
     */
    public String getAccno() {
        return accno;
    }

    /**
    * 设置-账单号
    * @paramType java.lang.String
    * @param accno - 账单号
     */
    public void setAccno(String accno) {
        this.accno = accno;
    }

    /**
    * 获取-健康险人意险是否拆分过，0 为未处理；1 已拆分；2 不需拆分；3 需要拆分
    * @return issplitted
     */
    public String getIssplitted() {
        return issplitted;
    }

    /**
    * 设置-健康险人意险是否拆分过，0 为未处理；1 已拆分；2 不需拆分；3 需要拆分
    * @paramType java.lang.String
    * @param issplitted - 健康险人意险是否拆分过，0 为未处理；1 已拆分；2 不需拆分；3 需要拆分
     */
    public void setIssplitted(String issplitted) {
        this.issplitted = issplitted;
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
    * 获取-投保确认码，上传手续费中介平台使用
    * @return confirmsequenceno
     */
    public String getConfirmsequenceno() {
        return confirmsequenceno;
    }

    /**
    * 设置-投保确认码，上传手续费中介平台使用
    * @paramType java.lang.String
    * @param confirmsequenceno - 投保确认码，上传手续费中介平台使用
     */
    public void setConfirmsequenceno(String confirmsequenceno) {
        this.confirmsequenceno = confirmsequenceno;
    }

    /**
    * 获取-保险中介服务统一发票号码，上传手续费中介平台使用
    * @return invoicecode
     */
    public String getInvoicecode() {
        return invoicecode;
    }

    /**
    * 设置-保险中介服务统一发票号码，上传手续费中介平台使用
    * @paramType java.lang.String
    * @param invoicecode - 保险中介服务统一发票号码，上传手续费中介平台使用
     */
    public void setInvoicecode(String invoicecode) {
        this.invoicecode = invoicecode;
    }

    /**
    * 获取-发票开具单位（签章单位），上传手续费中介平台使用
    * @return invoicedunit
     */
    public String getInvoicedunit() {
        return invoicedunit;
    }

    /**
    * 设置-发票开具单位（签章单位），上传手续费中介平台使用
    * @paramType java.lang.String
    * @param invoicedunit - 发票开具单位（签章单位），上传手续费中介平台使用
     */
    public void setInvoicedunit(String invoicedunit) {
        this.invoicedunit = invoicedunit;
    }

    /**
    * 获取-发票金额，上传手续费中介平台使用
    * @return invoiceamount
     */
    public BigDecimal getInvoiceamount() {
        return invoiceamount;
    }

    /**
    * 设置-发票金额，上传手续费中介平台使用
    * @paramType java.math.BigDecimal
    * @param invoiceamount - 发票金额，上传手续费中介平台使用
     */
    public void setInvoiceamount(BigDecimal invoiceamount) {
        this.invoiceamount = invoiceamount;
    }

    /**
    * 获取-网银流水号，上传手续费中介平台使用
    * @return ebankingsequenceno
     */
    public String getEbankingsequenceno() {
        return ebankingsequenceno;
    }

    /**
    * 设置-网银流水号，上传手续费中介平台使用
    * @paramType java.lang.String
    * @param ebankingsequenceno - 网银流水号，上传手续费中介平台使用
     */
    public void setEbankingsequenceno(String ebankingsequenceno) {
        this.ebankingsequenceno = ebankingsequenceno;
    }

    /**
    * 获取-收款单位名称，上传手续费中介平台使用
    * @return receiveunit
     */
    public String getReceiveunit() {
        return receiveunit;
    }

    /**
    * 设置-收款单位名称，上传手续费中介平台使用
    * @paramType java.lang.String
    * @param receiveunit - 收款单位名称，上传手续费中介平台使用
     */
    public void setReceiveunit(String receiveunit) {
        this.receiveunit = receiveunit;
    }

    /**
    * 获取-收付系统凭证号
    * @return reference4
     */
    public String getReference4() {
        return reference4;
    }

    /**
    * 设置-收付系统凭证号
    * @paramType java.lang.String
    * @param reference4 - 收付系统凭证号
     */
    public void setReference4(String reference4) {
        this.reference4 = reference4;
    }

    /**
    * 获取-总账凭证号
    * @return voucherno
     */
    public String getVoucherno() {
        return voucherno;
    }

    /**
    * 设置-总账凭证号
    * @paramType java.lang.String
    * @param voucherno - 总账凭证号
     */
    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    /**
    * 获取-共保期次号
    * @return thisseq
     */
    public Short getThisseq() {
        return thisseq;
    }

    /**
    * 设置-共保期次号
    * @paramType java.lang.Short
    * @param thisseq - 共保期次号
     */
    public void setThisseq(Short thisseq) {
        this.thisseq = thisseq;
    }

    /**
    * 获取-错误码
    * @return errorcode
     */
    public String getErrorcode() {
        return errorcode;
    }

    /**
    * 设置-错误码
    * @paramType java.lang.String
    * @param errorcode - 错误码
     */
    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    /**
    * 获取-错误信息
    * @return errormsg
     */
    public String getErrormsg() {
        return errormsg;
    }

    /**
    * 设置-错误信息
    * @paramType java.lang.String
    * @param errormsg - 错误信息
     */
    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    /**
    * 获取-状态：1实收 2实付 3实收取消 4实付取消 5未付款退票 6资金退票 7网银流水号上传 8凭证回写  9 结算单文件回写
    * @return opflag
     */
    public String getOpflag() {
        return opflag;
    }

    /**
    * 设置-状态：1实收 2实付 3实收取消 4实付取消 5未付款退票 6资金退票 7网银流水号上传 8凭证回写  9 结算单文件回写
    * @paramType java.lang.String
    * @param opflag - 状态：1实收 2实付 3实收取消 4实付取消 5未付款退票 6资金退票 7网银流水号上传 8凭证回写  9 结算单文件回写
     */
    public void setOpflag(String opflag) {
        this.opflag = opflag;
    }

    /**
    * 获取-传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误 55为红蓝对冲数据，不需上传平台 66 为回写模板设置错误，不需回写销售系统（eg:107942）
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误 55为红蓝对冲数据，不需上传平台 66 为回写模板设置错误，不需回写销售系统（eg:107942）
    * @paramType java.lang.String
    * @param status - 传送状态：00 初始化状态 10  进入准备处理队列  11 已发送 12 已接受 99 正常处理完毕 Z0 数据准备错误  Z1数据发送错误  Z2 数据写错误 ZZ 错误 55为红蓝对冲数据，不需上传平台 66 为回写模板设置错误，不需回写销售系统（eg:107942）
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
    * 获取-数据生成方式，不同方式seqreportno不一样：0 根据日结单明细生成 、1 根据payablemoney表生成、2 根据交易流水表生成
    * @return sourcetype
     */
    public String getSourcetype() {
        return sourcetype;
    }

    /**
    * 设置-数据生成方式，不同方式seqreportno不一样：0 根据日结单明细生成 、1 根据payablemoney表生成、2 根据交易流水表生成
    * @paramType java.lang.String
    * @param sourcetype - 数据生成方式，不同方式seqreportno不一样：0 根据日结单明细生成 、1 根据payablemoney表生成、2 根据交易流水表生成
     */
    public void setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype;
    }

    /**
    * 获取-inpaymentid,mm_inpayment_td表的id
    * @return inpaymentid
     */
    public Long getInpaymentid() {
        return inpaymentid;
    }

    /**
    * 设置-inpaymentid,mm_inpayment_td表的id
    * @paramType java.lang.Long
    * @param inpaymentid - inpaymentid,mm_inpayment_td表的id
     */
    public void setInpaymentid(Long inpaymentid) {
        this.inpaymentid = inpaymentid;
    }

    /**
    * 获取-此期次应收保费
    * @return basepayableamount
     */
    public BigDecimal getBasepayableamount() {
        return basepayableamount;
    }

    /**
    * 设置-此期次应收保费
    * @paramType java.math.BigDecimal
    * @param basepayableamount - 此期次应收保费
     */
    public void setBasepayableamount(BigDecimal basepayableamount) {
        this.basepayableamount = basepayableamount;
    }

    /**
    * 获取-开始时间
    * @return begintime
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
    * 设置-开始时间
    * @paramType java.util.Date
    * @param begintime - 开始时间
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
    * 获取-成功时间
    * @return sucesstime
     */
    public Date getSucesstime() {
        return sucesstime;
    }

    /**
    * 设置-成功时间
    * @paramType java.util.Date
    * @param sucesstime - 成功时间
     */
    public void setSucesstime(Date sucesstime) {
        this.sucesstime = sucesstime;
    }

    /**
    * 获取-单证号
    * @return biztype
     */
    public String getBiztype() {
        return biztype;
    }

    /**
    * 设置-单证号
    * @paramType java.lang.String
    * @param biztype - 单证号
     */
    public void setBiztype(String biztype) {
        this.biztype = biztype;
    }

    /**
    * 获取-税金金额（记账币种）
    * @return taxesrealamount
     */
    public BigDecimal getTaxesrealamount() {
        return taxesrealamount;
    }

    /**
    * 设置-税金金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param taxesrealamount - 税金金额（记账币种）
     */
    public void setTaxesrealamount(BigDecimal taxesrealamount) {
        this.taxesrealamount = taxesrealamount;
    }

    /**
    * 获取-税金金额（保单币种）
    * @return basetaxesrealamount
     */
    public BigDecimal getBasetaxesrealamount() {
        return basetaxesrealamount;
    }

    /**
    * 设置-税金金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param basetaxesrealamount - 税金金额（保单币种）
     */
    public void setBasetaxesrealamount(BigDecimal basetaxesrealamount) {
        this.basetaxesrealamount = basetaxesrealamount;
    }

    /**
    * 获取-税后实收付金额(人民币币别)
    * @return realamountrmb
     */
    public BigDecimal getRealamountrmb() {
        return realamountrmb;
    }

    /**
    * 设置-税后实收付金额(人民币币别)
    * @paramType java.math.BigDecimal
    * @param realamountrmb - 税后实收付金额(人民币币别)
     */
    public void setRealamountrmb(BigDecimal realamountrmb) {
        this.realamountrmb = realamountrmb;
    }

    /**
    * 获取-税前实收付金额(人民币币别)
    * @return taxesrealamountrmb
     */
    public BigDecimal getTaxesrealamountrmb() {
        return taxesrealamountrmb;
    }

    /**
    * 设置-税前实收付金额(人民币币别)
    * @paramType java.math.BigDecimal
    * @param taxesrealamountrmb - 税前实收付金额(人民币币别)
     */
    public void setTaxesrealamountrmb(BigDecimal taxesrealamountrmb) {
        this.taxesrealamountrmb = taxesrealamountrmb;
    }

    /**
    * 获取-汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
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
    * 获取-投保单号/批改申请单号
    * @return applicantno
     */
    public String getApplicantno() {
        return applicantno;
    }

    /**
    * 设置-投保单号/批改申请单号
    * @paramType java.lang.String
    * @param applicantno - 投保单号/批改申请单号
     */
    public void setApplicantno(String applicantno) {
        this.applicantno = applicantno;
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
    * 获取-农险回写信息
    * @return agristatus
     */
    public String getAgristatus() {
        return agristatus;
    }

    /**
    * 设置-农险回写信息
    * @paramType java.lang.String
    * @param agristatus - 农险回写信息
     */
    public void setAgristatus(String agristatus) {
        this.agristatus = agristatus;
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
}