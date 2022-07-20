package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_paymentin_events_tddel
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPaymentinEventsTddel {
    /**
     * 交易流水主键
     */
    private Long listno;

    /**
     * 标识出哪些记录是同一次操作的，用来控制取消的时候必须一起取消的情况，比如收款和对应的汇兑损益
     */
    private BigDecimal tradebatno;

    /**
     * 款项分公司，比如收款录入中账户所在分公司、付款处理中账户所在分公司
     */
    private String subcompany;

    /**
     * 款项财务机构
     */
    private String fromunitcode;

    /**
     * 核销财务机构
     */
    private String tounitcode;

    /**
     * 对应于业务类型1的流水号，暂存收款、预收款、待付款等 对应于businesstwo
     */
    private Long oldno;

    /**
     * 对应于业务类型2的流水号，保批单、预收款、待付款等 对应于businessone
     */
    private Long newno;

    /**
     * 产生此记录的记录流水号
     */
    private Long fatherno;

    /**
     * 此记录产生的记录的流水号
     */
    private Long sonno;

    /**
     * 业务类型1
     */
    private String businessone;

    /**
     * 业务类型2
     */
    private String businesstwo;

    /**
     * 收付标志
     */
    private String inpaymentflag;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 就是当前的操作员，用于记录业务人员做的操作被人审批修改opcode的情况
     */
    private String opcode2;

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
     * 业务部门代码
     */
    private String departmentcode;

    /**
     * 业务部门名称
     */
    private String departmentname;

    /**
     * 币种（记账）
     */
    private String currencycode;

    /**
     * 金额（记账）
     */
    private BigDecimal amount;

    /**
     * 多数情况下都跟记账币种一样，只有款项和匹配的单子币种不同时才记录单子的币种
     */
    private String basecurrencycode;

    /**
     * 多数情况下都跟记账币种金额一样，只有款项和匹配的单子币种不同时才记录单子的币种的金额
     */
    private BigDecimal baseamount;

    /**
     * 柜面帐户唯一编号
     */
    private BigDecimal mmaccountid;

    /**
     * 风险类别
     */
    private String risktype;

    /**
     * 展业方式编号
     */
    private String businesschannel;

    /**
     * 业务险种
     */
    private String classescode;

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
     * 储金返还序号
     */
    private String returnno;

    /**
     * 日结状态 0 未日结 2 已日结 4 已日结复核
     */
    private String auditstatus;

    /**
     * 日结单号
     */
    private String dailyauditno;

    /**
     * 系统时间
     */
    private Date checkdate;

    /**
     * 日结员代码
     */
    private String checkercode;

    /**
     * 系统时间
     */
    private Date auditdate;

    /**
     * 复核人代码
     */
    private String auditercode;

    /**
     * 核销状态 0初始状态 3 作废  4 被红冲  5 红冲
     */
    private String opstatus;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 数据库系统时间
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 被核销业务数据的分公司，比如保单、应付款的分公司
     */
    private String tosubcompany;

    /**
     * 健康险人意险拆分批次号
     */
    private BigDecimal splitbatchid;

    /**
     * 是否做子险拆分 0 可拆分 1已拆分 2 不用做拆分 3 等待拆分
     */
    private String issplitted;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

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
     * 上传标志 0 不上传 1上传 2已回写
     */
    private String ifupload;

    /**
     * 对接资金账单号
     */
    private String billcode;

    /**
     * 见费出单商户号mm_bankinpay_td.businessno;账号mm_account_td.accountno
     */
    private String accountno;

    /**
     * 手续费支付号，和手续费平台交互使用
     */
    private String inpaymentno;

    /**
     * 红冲关联流水号，红冲交易流水和被红冲业务流水记录 相互记录对应的listno
     */
    private BigDecimal coredno;

    /**
     * 结算单号
     */
    private String summaryno;

    /**
     * 一般情况和currencycode一样，当货币兑换时，记录关联的交易流水表记录的currencycode
     */
    private String cocurrencycode;

    /**
     * 一般情况和amount一样，当货币兑换时，记录关联的交易流水表记录的amount
     */
    private BigDecimal coamount;

    /**
     * 挂账汇率（保单、手续费、赔案、再保账单），季度会刷新成季度汇率
     */
    private BigDecimal coarate;

    /**
     * 折本位币汇率
     */
    private BigDecimal accountrate;

    /**
     * 结算方式，source的settlementtype 加上dest的settlementtype，比如收款录入为 1-2
     */
    private String settlementtype;

    /**
     * 取消方式，取消时的操作方式
     */
    private String canceltype;

    /**
     * 结算单类型 0 非结算单 、 1 保费结算单、 2赔款结算单（暂无）、 3 手续费结算单
     */
    private String summarytype;

    /**
     * 对应于业务类型1的明细记录的流水号，用于根据保单明细记录来生成凭证的情况，对应于businessone
     */
    private Long newdetailno;

    /**
     * 对应于业务类型2的明细记录的流水号，用于根据保单明细记录来生成凭证的情况，对应于businesstwo
     */
    private Long olddetailno;

    /**
     * 消费渠道
     */
    private String paychannel;

    /**
     * 批次号
     */
    private String batchno;

    /**
     * 日结单类型
     */
    private String reportkind;

    /**
     * 业务系统传送的描述信息
     */
    private String description;

    /**
     * 是否有缴费计划
     */
    private String hasplan;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 终保日期
     */
    private Date enddate;

    /**
    * 获取-交易流水主键
    * @return listno
     */
    public Long getListno() {
        return listno;
    }

    /**
    * 设置-交易流水主键
    * @paramType java.lang.Long
    * @param listno - 交易流水主键
     */
    public void setListno(Long listno) {
        this.listno = listno;
    }

    /**
    * 获取-标识出哪些记录是同一次操作的，用来控制取消的时候必须一起取消的情况，比如收款和对应的汇兑损益
    * @return tradebatno
     */
    public BigDecimal getTradebatno() {
        return tradebatno;
    }

    /**
    * 设置-标识出哪些记录是同一次操作的，用来控制取消的时候必须一起取消的情况，比如收款和对应的汇兑损益
    * @paramType java.math.BigDecimal
    * @param tradebatno - 标识出哪些记录是同一次操作的，用来控制取消的时候必须一起取消的情况，比如收款和对应的汇兑损益
     */
    public void setTradebatno(BigDecimal tradebatno) {
        this.tradebatno = tradebatno;
    }

    /**
    * 获取-款项分公司，比如收款录入中账户所在分公司、付款处理中账户所在分公司
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-款项分公司，比如收款录入中账户所在分公司、付款处理中账户所在分公司
    * @paramType java.lang.String
    * @param subcompany - 款项分公司，比如收款录入中账户所在分公司、付款处理中账户所在分公司
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
    }

    /**
    * 获取-款项财务机构
    * @return fromunitcode
     */
    public String getFromunitcode() {
        return fromunitcode;
    }

    /**
    * 设置-款项财务机构
    * @paramType java.lang.String
    * @param fromunitcode - 款项财务机构
     */
    public void setFromunitcode(String fromunitcode) {
        this.fromunitcode = fromunitcode;
    }

    /**
    * 获取-核销财务机构
    * @return tounitcode
     */
    public String getTounitcode() {
        return tounitcode;
    }

    /**
    * 设置-核销财务机构
    * @paramType java.lang.String
    * @param tounitcode - 核销财务机构
     */
    public void setTounitcode(String tounitcode) {
        this.tounitcode = tounitcode;
    }

    /**
    * 获取-对应于业务类型1的流水号，暂存收款、预收款、待付款等 对应于businesstwo
    * @return oldno
     */
    public Long getOldno() {
        return oldno;
    }

    /**
    * 设置-对应于业务类型1的流水号，暂存收款、预收款、待付款等 对应于businesstwo
    * @paramType java.lang.Long
    * @param oldno - 对应于业务类型1的流水号，暂存收款、预收款、待付款等 对应于businesstwo
     */
    public void setOldno(Long oldno) {
        this.oldno = oldno;
    }

    /**
    * 获取-对应于业务类型2的流水号，保批单、预收款、待付款等 对应于businessone
    * @return newno
     */
    public Long getNewno() {
        return newno;
    }

    /**
    * 设置-对应于业务类型2的流水号，保批单、预收款、待付款等 对应于businessone
    * @paramType java.lang.Long
    * @param newno - 对应于业务类型2的流水号，保批单、预收款、待付款等 对应于businessone
     */
    public void setNewno(Long newno) {
        this.newno = newno;
    }

    /**
    * 获取-产生此记录的记录流水号
    * @return fatherno
     */
    public Long getFatherno() {
        return fatherno;
    }

    /**
    * 设置-产生此记录的记录流水号
    * @paramType java.lang.Long
    * @param fatherno - 产生此记录的记录流水号
     */
    public void setFatherno(Long fatherno) {
        this.fatherno = fatherno;
    }

    /**
    * 获取-此记录产生的记录的流水号
    * @return sonno
     */
    public Long getSonno() {
        return sonno;
    }

    /**
    * 设置-此记录产生的记录的流水号
    * @paramType java.lang.Long
    * @param sonno - 此记录产生的记录的流水号
     */
    public void setSonno(Long sonno) {
        this.sonno = sonno;
    }

    /**
    * 获取-业务类型1
    * @return businessone
     */
    public String getBusinessone() {
        return businessone;
    }

    /**
    * 设置-业务类型1
    * @paramType java.lang.String
    * @param businessone - 业务类型1
     */
    public void setBusinessone(String businessone) {
        this.businessone = businessone;
    }

    /**
    * 获取-业务类型2
    * @return businesstwo
     */
    public String getBusinesstwo() {
        return businesstwo;
    }

    /**
    * 设置-业务类型2
    * @paramType java.lang.String
    * @param businesstwo - 业务类型2
     */
    public void setBusinesstwo(String businesstwo) {
        this.businesstwo = businesstwo;
    }

    /**
    * 获取-收付标志
    * @return inpaymentflag
     */
    public String getInpaymentflag() {
        return inpaymentflag;
    }

    /**
    * 设置-收付标志
    * @paramType java.lang.String
    * @param inpaymentflag - 收付标志
     */
    public void setInpaymentflag(String inpaymentflag) {
        this.inpaymentflag = inpaymentflag;
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
    * 获取-就是当前的操作员，用于记录业务人员做的操作被人审批修改opcode的情况
    * @return opcode2
     */
    public String getOpcode2() {
        return opcode2;
    }

    /**
    * 设置-就是当前的操作员，用于记录业务人员做的操作被人审批修改opcode的情况
    * @paramType java.lang.String
    * @param opcode2 - 就是当前的操作员，用于记录业务人员做的操作被人审批修改opcode的情况
     */
    public void setOpcode2(String opcode2) {
        this.opcode2 = opcode2;
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
    * 获取-业务部门名称
    * @return departmentname
     */
    public String getDepartmentname() {
        return departmentname;
    }

    /**
    * 设置-业务部门名称
    * @paramType java.lang.String
    * @param departmentname - 业务部门名称
     */
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    /**
    * 获取-币种（记账）
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种（记账）
    * @paramType java.lang.String
    * @param currencycode - 币种（记账）
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-金额（记账）
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额（记账）
    * @paramType java.math.BigDecimal
    * @param amount - 金额（记账）
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-多数情况下都跟记账币种一样，只有款项和匹配的单子币种不同时才记录单子的币种
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-多数情况下都跟记账币种一样，只有款项和匹配的单子币种不同时才记录单子的币种
    * @paramType java.lang.String
    * @param basecurrencycode - 多数情况下都跟记账币种一样，只有款项和匹配的单子币种不同时才记录单子的币种
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
    }

    /**
    * 获取-多数情况下都跟记账币种金额一样，只有款项和匹配的单子币种不同时才记录单子的币种的金额
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-多数情况下都跟记账币种金额一样，只有款项和匹配的单子币种不同时才记录单子的币种的金额
    * @paramType java.math.BigDecimal
    * @param baseamount - 多数情况下都跟记账币种金额一样，只有款项和匹配的单子币种不同时才记录单子的币种的金额
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    /**
    * 获取-柜面帐户唯一编号
    * @return mmaccountid
     */
    public BigDecimal getMmaccountid() {
        return mmaccountid;
    }

    /**
    * 设置-柜面帐户唯一编号
    * @paramType java.math.BigDecimal
    * @param mmaccountid - 柜面帐户唯一编号
     */
    public void setMmaccountid(BigDecimal mmaccountid) {
        this.mmaccountid = mmaccountid;
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
    * 获取-日结状态 0 未日结 2 已日结 4 已日结复核
    * @return auditstatus
     */
    public String getAuditstatus() {
        return auditstatus;
    }

    /**
    * 设置-日结状态 0 未日结 2 已日结 4 已日结复核
    * @paramType java.lang.String
    * @param auditstatus - 日结状态 0 未日结 2 已日结 4 已日结复核
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
    * 获取-系统时间
    * @return checkdate
     */
    public Date getCheckdate() {
        return checkdate;
    }

    /**
    * 设置-系统时间
    * @paramType java.util.Date
    * @param checkdate - 系统时间
     */
    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    /**
    * 获取-日结员代码
    * @return checkercode
     */
    public String getCheckercode() {
        return checkercode;
    }

    /**
    * 设置-日结员代码
    * @paramType java.lang.String
    * @param checkercode - 日结员代码
     */
    public void setCheckercode(String checkercode) {
        this.checkercode = checkercode;
    }

    /**
    * 获取-系统时间
    * @return auditdate
     */
    public Date getAuditdate() {
        return auditdate;
    }

    /**
    * 设置-系统时间
    * @paramType java.util.Date
    * @param auditdate - 系统时间
     */
    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    /**
    * 获取-复核人代码
    * @return auditercode
     */
    public String getAuditercode() {
        return auditercode;
    }

    /**
    * 设置-复核人代码
    * @paramType java.lang.String
    * @param auditercode - 复核人代码
     */
    public void setAuditercode(String auditercode) {
        this.auditercode = auditercode;
    }

    /**
    * 获取-核销状态 0初始状态 3 作废  4 被红冲  5 红冲
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-核销状态 0初始状态 3 作废  4 被红冲  5 红冲
    * @paramType java.lang.String
    * @param opstatus - 核销状态 0初始状态 3 作废  4 被红冲  5 红冲
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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
    * 获取-数据库系统时间
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-数据库系统时间
    * @paramType java.util.Date
    * @param timestamp - 数据库系统时间
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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
    * 获取-被核销业务数据的分公司，比如保单、应付款的分公司
    * @return tosubcompany
     */
    public String getTosubcompany() {
        return tosubcompany;
    }

    /**
    * 设置-被核销业务数据的分公司，比如保单、应付款的分公司
    * @paramType java.lang.String
    * @param tosubcompany - 被核销业务数据的分公司，比如保单、应付款的分公司
     */
    public void setTosubcompany(String tosubcompany) {
        this.tosubcompany = tosubcompany;
    }

    /**
    * 获取-健康险人意险拆分批次号
    * @return splitbatchid
     */
    public BigDecimal getSplitbatchid() {
        return splitbatchid;
    }

    /**
    * 设置-健康险人意险拆分批次号
    * @paramType java.math.BigDecimal
    * @param splitbatchid - 健康险人意险拆分批次号
     */
    public void setSplitbatchid(BigDecimal splitbatchid) {
        this.splitbatchid = splitbatchid;
    }

    /**
    * 获取-是否做子险拆分 0 可拆分 1已拆分 2 不用做拆分 3 等待拆分
    * @return issplitted
     */
    public String getIssplitted() {
        return issplitted;
    }

    /**
    * 设置-是否做子险拆分 0 可拆分 1已拆分 2 不用做拆分 3 等待拆分
    * @paramType java.lang.String
    * @param issplitted - 是否做子险拆分 0 可拆分 1已拆分 2 不用做拆分 3 等待拆分
     */
    public void setIssplitted(String issplitted) {
        this.issplitted = issplitted;
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
    * 获取-上传标志 0 不上传 1上传 2已回写
    * @return ifupload
     */
    public String getIfupload() {
        return ifupload;
    }

    /**
    * 设置-上传标志 0 不上传 1上传 2已回写
    * @paramType java.lang.String
    * @param ifupload - 上传标志 0 不上传 1上传 2已回写
     */
    public void setIfupload(String ifupload) {
        this.ifupload = ifupload;
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
    * 获取-见费出单商户号mm_bankinpay_td.businessno;账号mm_account_td.accountno
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-见费出单商户号mm_bankinpay_td.businessno;账号mm_account_td.accountno
    * @paramType java.lang.String
    * @param accountno - 见费出单商户号mm_bankinpay_td.businessno;账号mm_account_td.accountno
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-手续费支付号，和手续费平台交互使用
    * @return inpaymentno
     */
    public String getInpaymentno() {
        return inpaymentno;
    }

    /**
    * 设置-手续费支付号，和手续费平台交互使用
    * @paramType java.lang.String
    * @param inpaymentno - 手续费支付号，和手续费平台交互使用
     */
    public void setInpaymentno(String inpaymentno) {
        this.inpaymentno = inpaymentno;
    }

    /**
    * 获取-红冲关联流水号，红冲交易流水和被红冲业务流水记录 相互记录对应的listno
    * @return coredno
     */
    public BigDecimal getCoredno() {
        return coredno;
    }

    /**
    * 设置-红冲关联流水号，红冲交易流水和被红冲业务流水记录 相互记录对应的listno
    * @paramType java.math.BigDecimal
    * @param coredno - 红冲关联流水号，红冲交易流水和被红冲业务流水记录 相互记录对应的listno
     */
    public void setCoredno(BigDecimal coredno) {
        this.coredno = coredno;
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
    * 获取-一般情况和currencycode一样，当货币兑换时，记录关联的交易流水表记录的currencycode
    * @return cocurrencycode
     */
    public String getCocurrencycode() {
        return cocurrencycode;
    }

    /**
    * 设置-一般情况和currencycode一样，当货币兑换时，记录关联的交易流水表记录的currencycode
    * @paramType java.lang.String
    * @param cocurrencycode - 一般情况和currencycode一样，当货币兑换时，记录关联的交易流水表记录的currencycode
     */
    public void setCocurrencycode(String cocurrencycode) {
        this.cocurrencycode = cocurrencycode;
    }

    /**
    * 获取-一般情况和amount一样，当货币兑换时，记录关联的交易流水表记录的amount
    * @return coamount
     */
    public BigDecimal getCoamount() {
        return coamount;
    }

    /**
    * 设置-一般情况和amount一样，当货币兑换时，记录关联的交易流水表记录的amount
    * @paramType java.math.BigDecimal
    * @param coamount - 一般情况和amount一样，当货币兑换时，记录关联的交易流水表记录的amount
     */
    public void setCoamount(BigDecimal coamount) {
        this.coamount = coamount;
    }

    /**
    * 获取-挂账汇率（保单、手续费、赔案、再保账单），季度会刷新成季度汇率
    * @return coarate
     */
    public BigDecimal getCoarate() {
        return coarate;
    }

    /**
    * 设置-挂账汇率（保单、手续费、赔案、再保账单），季度会刷新成季度汇率
    * @paramType java.math.BigDecimal
    * @param coarate - 挂账汇率（保单、手续费、赔案、再保账单），季度会刷新成季度汇率
     */
    public void setCoarate(BigDecimal coarate) {
        this.coarate = coarate;
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
    * 获取-结算方式，source的settlementtype 加上dest的settlementtype，比如收款录入为 1-2
    * @return settlementtype
     */
    public String getSettlementtype() {
        return settlementtype;
    }

    /**
    * 设置-结算方式，source的settlementtype 加上dest的settlementtype，比如收款录入为 1-2
    * @paramType java.lang.String
    * @param settlementtype - 结算方式，source的settlementtype 加上dest的settlementtype，比如收款录入为 1-2
     */
    public void setSettlementtype(String settlementtype) {
        this.settlementtype = settlementtype;
    }

    /**
    * 获取-取消方式，取消时的操作方式
    * @return canceltype
     */
    public String getCanceltype() {
        return canceltype;
    }

    /**
    * 设置-取消方式，取消时的操作方式
    * @paramType java.lang.String
    * @param canceltype - 取消方式，取消时的操作方式
     */
    public void setCanceltype(String canceltype) {
        this.canceltype = canceltype;
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
    * 获取-对应于业务类型1的明细记录的流水号，用于根据保单明细记录来生成凭证的情况，对应于businessone
    * @return newdetailno
     */
    public Long getNewdetailno() {
        return newdetailno;
    }

    /**
    * 设置-对应于业务类型1的明细记录的流水号，用于根据保单明细记录来生成凭证的情况，对应于businessone
    * @paramType java.lang.Long
    * @param newdetailno - 对应于业务类型1的明细记录的流水号，用于根据保单明细记录来生成凭证的情况，对应于businessone
     */
    public void setNewdetailno(Long newdetailno) {
        this.newdetailno = newdetailno;
    }

    /**
    * 获取-对应于业务类型2的明细记录的流水号，用于根据保单明细记录来生成凭证的情况，对应于businesstwo
    * @return olddetailno
     */
    public Long getOlddetailno() {
        return olddetailno;
    }

    /**
    * 设置-对应于业务类型2的明细记录的流水号，用于根据保单明细记录来生成凭证的情况，对应于businesstwo
    * @paramType java.lang.Long
    * @param olddetailno - 对应于业务类型2的明细记录的流水号，用于根据保单明细记录来生成凭证的情况，对应于businesstwo
     */
    public void setOlddetailno(Long olddetailno) {
        this.olddetailno = olddetailno;
    }

    /**
    * 获取-消费渠道
    * @return paychannel
     */
    public String getPaychannel() {
        return paychannel;
    }

    /**
    * 设置-消费渠道
    * @paramType java.lang.String
    * @param paychannel - 消费渠道
     */
    public void setPaychannel(String paychannel) {
        this.paychannel = paychannel;
    }

    /**
    * 获取-批次号
    * @return batchno
     */
    public String getBatchno() {
        return batchno;
    }

    /**
    * 设置-批次号
    * @paramType java.lang.String
    * @param batchno - 批次号
     */
    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    /**
    * 获取-日结单类型
    * @return reportkind
     */
    public String getReportkind() {
        return reportkind;
    }

    /**
    * 设置-日结单类型
    * @paramType java.lang.String
    * @param reportkind - 日结单类型
     */
    public void setReportkind(String reportkind) {
        this.reportkind = reportkind;
    }

    /**
    * 获取-业务系统传送的描述信息
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-业务系统传送的描述信息
    * @paramType java.lang.String
    * @param description - 业务系统传送的描述信息
     */
    public void setDescription(String description) {
        this.description = description;
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
}