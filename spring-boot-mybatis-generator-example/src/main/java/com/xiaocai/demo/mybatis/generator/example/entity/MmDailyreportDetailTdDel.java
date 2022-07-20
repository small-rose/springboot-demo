package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_dailyreport_detail_td_del
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmDailyreportDetailTdDel {
    /**
     * 主键
     */
    private Long seqreportno;

    /**
     * 日结单号
     */
    private String dailyauditno;

    /**
     * 日结单类型
     */
    private String reportkind;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 对收款匹配保单而言就是保单数据的财务机构
     */
    private String tounitcode;

    /**
     * 对收款匹配保单而言就是收款数据的财务机构
     */
    private String fromunitcode;

    /**
     * 对应于业务类型(1的流水号，暂存收款、预收款、待付款等 对应于businesstwo)
     */
    private Long oldno;

    /**
     * 对应于业务类型(2的流水号，保批单、预收款、待付款等 对应于businessone)
     */
    private Long newno;

    /**
     * 业务类型1
     */
    private String businessone;

    /**
     * 业务类型2
     */
    private String businesstwo;

    /**
     * p07业务类型
     */
    private String businesstype1;

    /**
     * p07业务类型
     */
    private String businesstype2;

    /**
     * p07业务类型
     */
    private String businesstype3;

    /**
     * p07业务类型
     */
    private String businesstype4;

    /**
     * 收付标志(0 收款 1 付款)
     */
    private String inpaymentflag;

    /**
     * 账户在财务系统中的唯一编码(对应ACCOUNT表的ACCOUNTNO)
     */
    private String accountno;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 操作员名称
     */
    private String opname;

    /**
     * 日结员代码
     */
    private String checkercode;

    /**
     * 日结员名称
     */
    private String checkername;

    /**
     * 日结时的系统时间
     */
    private Date checktime;

    /**
     * 复核人代码
     */
    private String auditercode;

    /**
     * 复核人名称
     */
    private String auditername;

    /**
     * 复核时的系统时间
     */
    private Date audittime;

    /**
     * 报账人代码
     */
    private String reportercode;

    /**
     * 报账人名称
     */
    private String reportername;

    /**
     * 报账日期
     */
    private Date reportdate;

    /**
     * 报账时的系统时间
     */
    private Date reporttime;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 业务部门代码(业务数据的部门)
     */
    private String departmentcode;

    /**
     * 业务部门名称
     */
    private String departmentname;

    /**
     * 承保币种(多数情况下都跟记账币种一样，只有款项和匹配的单子币种不同时才记录单子的币种)
     */
    private String basecurrencycode;

    /**
     * 承保币种金额(多数情况下都跟记账币种金额一样，只有款项和匹配的单子币种不同时才记录单子的币种的金额)
     */
    private BigDecimal baseamount;

    /**
     * 记账币种
     */
    private String currencycode;

    /**
     * 记账币种金额
     */
    private BigDecimal amount;

    /**
     * 承保数量
     */
    private BigDecimal insurencecount;

    /**
     * 业务性质(1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源)
     */
    private String businessattr;

    /**
     * 展业方式编号(业务渠道编号)
     */
    private String businesschannel;

    /**
     * 是否有缴费计划
     */
    private String hasplan;

    /**
     * 业务险种
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
     * 客户名称
     */
    private String customername;

    /**
     * 被保险人代码
     */
    private String insuredcode;

    /**
     * 被保险人名称
     */
    private String insuredname;

    /**
     * 经办人代码
     */
    private String transactorcode;

    /**
     * 经办人名称
     */
    private String transactiorname;

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
     * 立案号
     */
    private String caseno;

    /**
     * 储金返还序号
     */
    private String returnno;

    /**
     * 摘要
     */
    private String description;

    /**
     * 核销状态(0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被红冲 5 由于取消其他记录产生的红冲记录  8 可转出生产表 9 未生效待审核（目前只对交易流水明细表有意义）  0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收付款表、各流水表、日结单表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）)
     */
    private String opstatus;

    /**
     * 插入数据时数据库系统时间
     */
    private Date timestamp;

    /**
     * 最后更新日期
     */
    private Date lastopdate;

    /**
     * 票据类型
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
     * 票据用途(前台录入)
     */
    private String inpaymentbatchno;

    /**
     * 银行名称
     */
    private String bankname;

    /**
     * 客户开户行
     */
    private String customerbankname;

    /**
     * 客户银行账号
     */
    private String custaccountno;

    /**
     * 预收流水号
     */
    private Long usableno;

    /**
     * 收付流水号(数据抽取进来的时候需要根据业务类型判断是否要写这个字段)
     */
    private BigDecimal inpaymentid;

    /**
     * 待付款流水号
     */
    private Long payableno;

    /**
     * 业务系统录入日期
     */
    private Date inputdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 业务数据分公司
     */
    private String tosubcompany;

    /**
     * 记录抽取数据的来源表的流水号(用于回写来源表（来自那个表根据业务类型来判断），目前的来源表包括： 收付款流水表 交易明细流水表 业务明细流水表 跨司内往表？ 汇兑损益表？)
     */
    private BigDecimal sourceno;

    /**
     * 业务数据来源(用于回写的时候区分回写的目的地)
     */
    private String datasource;

    /**
     * 手续费序号(用于回写)
     */
    private String serialno;

    /**
     * 健康险人意险是否拆分过(0 为未处理；1 已拆分；2 不需拆分；3 需要拆分)
     */
    private String issplitted;

    /**
     * 报账清单号(记录P07报账后生成的报账清单号)
     */
    private String renderno;

    /**
     * 备用字段
     */
    private String transtoacc;

    /**
     * 预收流水号2
     */
    private String usableno2;

    /**
     * 备用字段
     */
    private String usableno3;

    /**
     * 备注
     */
    private String modifydesc;

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
    * 获取-主键
    * @return seqreportno
     */
    public Long getSeqreportno() {
        return seqreportno;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqreportno - 主键
     */
    public void setSeqreportno(Long seqreportno) {
        this.seqreportno = seqreportno;
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
    * 获取-对收款匹配保单而言就是保单数据的财务机构
    * @return tounitcode
     */
    public String getTounitcode() {
        return tounitcode;
    }

    /**
    * 设置-对收款匹配保单而言就是保单数据的财务机构
    * @paramType java.lang.String
    * @param tounitcode - 对收款匹配保单而言就是保单数据的财务机构
     */
    public void setTounitcode(String tounitcode) {
        this.tounitcode = tounitcode;
    }

    /**
    * 获取-对收款匹配保单而言就是收款数据的财务机构
    * @return fromunitcode
     */
    public String getFromunitcode() {
        return fromunitcode;
    }

    /**
    * 设置-对收款匹配保单而言就是收款数据的财务机构
    * @paramType java.lang.String
    * @param fromunitcode - 对收款匹配保单而言就是收款数据的财务机构
     */
    public void setFromunitcode(String fromunitcode) {
        this.fromunitcode = fromunitcode;
    }

    /**
    * 获取-对应于业务类型(1的流水号，暂存收款、预收款、待付款等 对应于businesstwo)
    * @return oldno
     */
    public Long getOldno() {
        return oldno;
    }

    /**
    * 设置-对应于业务类型(1的流水号，暂存收款、预收款、待付款等 对应于businesstwo)
    * @paramType java.lang.Long
    * @param oldno - 对应于业务类型(1的流水号，暂存收款、预收款、待付款等 对应于businesstwo)
     */
    public void setOldno(Long oldno) {
        this.oldno = oldno;
    }

    /**
    * 获取-对应于业务类型(2的流水号，保批单、预收款、待付款等 对应于businessone)
    * @return newno
     */
    public Long getNewno() {
        return newno;
    }

    /**
    * 设置-对应于业务类型(2的流水号，保批单、预收款、待付款等 对应于businessone)
    * @paramType java.lang.Long
    * @param newno - 对应于业务类型(2的流水号，保批单、预收款、待付款等 对应于businessone)
     */
    public void setNewno(Long newno) {
        this.newno = newno;
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
    * 获取-p07业务类型
    * @return businesstype1
     */
    public String getBusinesstype1() {
        return businesstype1;
    }

    /**
    * 设置-p07业务类型
    * @paramType java.lang.String
    * @param businesstype1 - p07业务类型
     */
    public void setBusinesstype1(String businesstype1) {
        this.businesstype1 = businesstype1;
    }

    /**
    * 获取-p07业务类型
    * @return businesstype2
     */
    public String getBusinesstype2() {
        return businesstype2;
    }

    /**
    * 设置-p07业务类型
    * @paramType java.lang.String
    * @param businesstype2 - p07业务类型
     */
    public void setBusinesstype2(String businesstype2) {
        this.businesstype2 = businesstype2;
    }

    /**
    * 获取-p07业务类型
    * @return businesstype3
     */
    public String getBusinesstype3() {
        return businesstype3;
    }

    /**
    * 设置-p07业务类型
    * @paramType java.lang.String
    * @param businesstype3 - p07业务类型
     */
    public void setBusinesstype3(String businesstype3) {
        this.businesstype3 = businesstype3;
    }

    /**
    * 获取-p07业务类型
    * @return businesstype4
     */
    public String getBusinesstype4() {
        return businesstype4;
    }

    /**
    * 设置-p07业务类型
    * @paramType java.lang.String
    * @param businesstype4 - p07业务类型
     */
    public void setBusinesstype4(String businesstype4) {
        this.businesstype4 = businesstype4;
    }

    /**
    * 获取-收付标志(0 收款 1 付款)
    * @return inpaymentflag
     */
    public String getInpaymentflag() {
        return inpaymentflag;
    }

    /**
    * 设置-收付标志(0 收款 1 付款)
    * @paramType java.lang.String
    * @param inpaymentflag - 收付标志(0 收款 1 付款)
     */
    public void setInpaymentflag(String inpaymentflag) {
        this.inpaymentflag = inpaymentflag;
    }

    /**
    * 获取-账户在财务系统中的唯一编码(对应ACCOUNT表的ACCOUNTNO)
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-账户在财务系统中的唯一编码(对应ACCOUNT表的ACCOUNTNO)
    * @paramType java.lang.String
    * @param accountno - 账户在财务系统中的唯一编码(对应ACCOUNT表的ACCOUNTNO)
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
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
    * 获取-操作员名称
    * @return opname
     */
    public String getOpname() {
        return opname;
    }

    /**
    * 设置-操作员名称
    * @paramType java.lang.String
    * @param opname - 操作员名称
     */
    public void setOpname(String opname) {
        this.opname = opname;
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
    * 获取-日结员名称
    * @return checkername
     */
    public String getCheckername() {
        return checkername;
    }

    /**
    * 设置-日结员名称
    * @paramType java.lang.String
    * @param checkername - 日结员名称
     */
    public void setCheckername(String checkername) {
        this.checkername = checkername;
    }

    /**
    * 获取-日结时的系统时间
    * @return checktime
     */
    public Date getChecktime() {
        return checktime;
    }

    /**
    * 设置-日结时的系统时间
    * @paramType java.util.Date
    * @param checktime - 日结时的系统时间
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
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
    * 获取-复核人名称
    * @return auditername
     */
    public String getAuditername() {
        return auditername;
    }

    /**
    * 设置-复核人名称
    * @paramType java.lang.String
    * @param auditername - 复核人名称
     */
    public void setAuditername(String auditername) {
        this.auditername = auditername;
    }

    /**
    * 获取-复核时的系统时间
    * @return audittime
     */
    public Date getAudittime() {
        return audittime;
    }

    /**
    * 设置-复核时的系统时间
    * @paramType java.util.Date
    * @param audittime - 复核时的系统时间
     */
    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    /**
    * 获取-报账人代码
    * @return reportercode
     */
    public String getReportercode() {
        return reportercode;
    }

    /**
    * 设置-报账人代码
    * @paramType java.lang.String
    * @param reportercode - 报账人代码
     */
    public void setReportercode(String reportercode) {
        this.reportercode = reportercode;
    }

    /**
    * 获取-报账人名称
    * @return reportername
     */
    public String getReportername() {
        return reportername;
    }

    /**
    * 设置-报账人名称
    * @paramType java.lang.String
    * @param reportername - 报账人名称
     */
    public void setReportername(String reportername) {
        this.reportername = reportername;
    }

    /**
    * 获取-报账日期
    * @return reportdate
     */
    public Date getReportdate() {
        return reportdate;
    }

    /**
    * 设置-报账日期
    * @paramType java.util.Date
    * @param reportdate - 报账日期
     */
    public void setReportdate(Date reportdate) {
        this.reportdate = reportdate;
    }

    /**
    * 获取-报账时的系统时间
    * @return reporttime
     */
    public Date getReporttime() {
        return reporttime;
    }

    /**
    * 设置-报账时的系统时间
    * @paramType java.util.Date
    * @param reporttime - 报账时的系统时间
     */
    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
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
    * 获取-业务部门代码(业务数据的部门)
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-业务部门代码(业务数据的部门)
    * @paramType java.lang.String
    * @param departmentcode - 业务部门代码(业务数据的部门)
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
    * 获取-承保币种(多数情况下都跟记账币种一样，只有款项和匹配的单子币种不同时才记录单子的币种)
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-承保币种(多数情况下都跟记账币种一样，只有款项和匹配的单子币种不同时才记录单子的币种)
    * @paramType java.lang.String
    * @param basecurrencycode - 承保币种(多数情况下都跟记账币种一样，只有款项和匹配的单子币种不同时才记录单子的币种)
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
    }

    /**
    * 获取-承保币种金额(多数情况下都跟记账币种金额一样，只有款项和匹配的单子币种不同时才记录单子的币种的金额)
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-承保币种金额(多数情况下都跟记账币种金额一样，只有款项和匹配的单子币种不同时才记录单子的币种的金额)
    * @paramType java.math.BigDecimal
    * @param baseamount - 承保币种金额(多数情况下都跟记账币种金额一样，只有款项和匹配的单子币种不同时才记录单子的币种的金额)
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
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
    * 获取-记账币种金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-记账币种金额
    * @paramType java.math.BigDecimal
    * @param amount - 记账币种金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    * 获取-业务性质(1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源)
    * @return businessattr
     */
    public String getBusinessattr() {
        return businessattr;
    }

    /**
    * 设置-业务性质(1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源)
    * @paramType java.lang.String
    * @param businessattr - 业务性质(1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源)
     */
    public void setBusinessattr(String businessattr) {
        this.businessattr = businessattr;
    }

    /**
    * 获取-展业方式编号(业务渠道编号)
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-展业方式编号(业务渠道编号)
    * @paramType java.lang.String
    * @param businesschannel - 展业方式编号(业务渠道编号)
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
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
    * 获取-经办人名称
    * @return transactiorname
     */
    public String getTransactiorname() {
        return transactiorname;
    }

    /**
    * 设置-经办人名称
    * @paramType java.lang.String
    * @param transactiorname - 经办人名称
     */
    public void setTransactiorname(String transactiorname) {
        this.transactiorname = transactiorname;
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
    * 获取-核销状态(0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被红冲 5 由于取消其他记录产生的红冲记录  8 可转出生产表 9 未生效待审核（目前只对交易流水明细表有意义）  0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收付款表、各流水表、日结单表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）)
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-核销状态(0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被红冲 5 由于取消其他记录产生的红冲记录  8 可转出生产表 9 未生效待审核（目前只对交易流水明细表有意义）  0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收付款表、各流水表、日结单表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）)
    * @paramType java.lang.String
    * @param opstatus - 核销状态(0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被红冲 5 由于取消其他记录产生的红冲记录  8 可转出生产表 9 未生效待审核（目前只对交易流水明细表有意义）  0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收付款表、各流水表、日结单表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录）)
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-插入数据时数据库系统时间
    * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
    * 设置-插入数据时数据库系统时间
    * @paramType java.util.Date
    * @param timestamp - 插入数据时数据库系统时间
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
    * 获取-最后更新日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后更新日期
    * @paramType java.util.Date
    * @param lastopdate - 最后更新日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-票据类型
    * @return checktype
     */
    public String getChecktype() {
        return checktype;
    }

    /**
    * 设置-票据类型
    * @paramType java.lang.String
    * @param checktype - 票据类型
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
    * 获取-票据用途(前台录入)
    * @return inpaymentbatchno
     */
    public String getInpaymentbatchno() {
        return inpaymentbatchno;
    }

    /**
    * 设置-票据用途(前台录入)
    * @paramType java.lang.String
    * @param inpaymentbatchno - 票据用途(前台录入)
     */
    public void setInpaymentbatchno(String inpaymentbatchno) {
        this.inpaymentbatchno = inpaymentbatchno;
    }

    /**
    * 获取-银行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-银行名称
    * @paramType java.lang.String
    * @param bankname - 银行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
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
    * 获取-预收流水号
    * @return usableno
     */
    public Long getUsableno() {
        return usableno;
    }

    /**
    * 设置-预收流水号
    * @paramType java.lang.Long
    * @param usableno - 预收流水号
     */
    public void setUsableno(Long usableno) {
        this.usableno = usableno;
    }

    /**
    * 获取-收付流水号(数据抽取进来的时候需要根据业务类型判断是否要写这个字段)
    * @return inpaymentid
     */
    public BigDecimal getInpaymentid() {
        return inpaymentid;
    }

    /**
    * 设置-收付流水号(数据抽取进来的时候需要根据业务类型判断是否要写这个字段)
    * @paramType java.math.BigDecimal
    * @param inpaymentid - 收付流水号(数据抽取进来的时候需要根据业务类型判断是否要写这个字段)
     */
    public void setInpaymentid(BigDecimal inpaymentid) {
        this.inpaymentid = inpaymentid;
    }

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
    * 获取-业务数据分公司
    * @return tosubcompany
     */
    public String getTosubcompany() {
        return tosubcompany;
    }

    /**
    * 设置-业务数据分公司
    * @paramType java.lang.String
    * @param tosubcompany - 业务数据分公司
     */
    public void setTosubcompany(String tosubcompany) {
        this.tosubcompany = tosubcompany;
    }

    /**
    * 获取-记录抽取数据的来源表的流水号(用于回写来源表（来自那个表根据业务类型来判断），目前的来源表包括： 收付款流水表 交易明细流水表 业务明细流水表 跨司内往表？ 汇兑损益表？)
    * @return sourceno
     */
    public BigDecimal getSourceno() {
        return sourceno;
    }

    /**
    * 设置-记录抽取数据的来源表的流水号(用于回写来源表（来自那个表根据业务类型来判断），目前的来源表包括： 收付款流水表 交易明细流水表 业务明细流水表 跨司内往表？ 汇兑损益表？)
    * @paramType java.math.BigDecimal
    * @param sourceno - 记录抽取数据的来源表的流水号(用于回写来源表（来自那个表根据业务类型来判断），目前的来源表包括： 收付款流水表 交易明细流水表 业务明细流水表 跨司内往表？ 汇兑损益表？)
     */
    public void setSourceno(BigDecimal sourceno) {
        this.sourceno = sourceno;
    }

    /**
    * 获取-业务数据来源(用于回写的时候区分回写的目的地)
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-业务数据来源(用于回写的时候区分回写的目的地)
    * @paramType java.lang.String
    * @param datasource - 业务数据来源(用于回写的时候区分回写的目的地)
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-手续费序号(用于回写)
    * @return serialno
     */
    public String getSerialno() {
        return serialno;
    }

    /**
    * 设置-手续费序号(用于回写)
    * @paramType java.lang.String
    * @param serialno - 手续费序号(用于回写)
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    /**
    * 获取-健康险人意险是否拆分过(0 为未处理；1 已拆分；2 不需拆分；3 需要拆分)
    * @return issplitted
     */
    public String getIssplitted() {
        return issplitted;
    }

    /**
    * 设置-健康险人意险是否拆分过(0 为未处理；1 已拆分；2 不需拆分；3 需要拆分)
    * @paramType java.lang.String
    * @param issplitted - 健康险人意险是否拆分过(0 为未处理；1 已拆分；2 不需拆分；3 需要拆分)
     */
    public void setIssplitted(String issplitted) {
        this.issplitted = issplitted;
    }

    /**
    * 获取-报账清单号(记录P07报账后生成的报账清单号)
    * @return renderno
     */
    public String getRenderno() {
        return renderno;
    }

    /**
    * 设置-报账清单号(记录P07报账后生成的报账清单号)
    * @paramType java.lang.String
    * @param renderno - 报账清单号(记录P07报账后生成的报账清单号)
     */
    public void setRenderno(String renderno) {
        this.renderno = renderno;
    }

    /**
    * 获取-备用字段
    * @return transtoacc
     */
    public String getTranstoacc() {
        return transtoacc;
    }

    /**
    * 设置-备用字段
    * @paramType java.lang.String
    * @param transtoacc - 备用字段
     */
    public void setTranstoacc(String transtoacc) {
        this.transtoacc = transtoacc;
    }

    /**
    * 获取-预收流水号2
    * @return usableno2
     */
    public String getUsableno2() {
        return usableno2;
    }

    /**
    * 设置-预收流水号2
    * @paramType java.lang.String
    * @param usableno2 - 预收流水号2
     */
    public void setUsableno2(String usableno2) {
        this.usableno2 = usableno2;
    }

    /**
    * 获取-备用字段
    * @return usableno3
     */
    public String getUsableno3() {
        return usableno3;
    }

    /**
    * 设置-备用字段
    * @paramType java.lang.String
    * @param usableno3 - 备用字段
     */
    public void setUsableno3(String usableno3) {
        this.usableno3 = usableno3;
    }

    /**
    * 获取-备注
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param modifydesc - 备注
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
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
}