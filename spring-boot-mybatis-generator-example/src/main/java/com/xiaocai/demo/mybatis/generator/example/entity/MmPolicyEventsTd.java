package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policy_events_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicyEventsTd {
    /**
     * 主键
     */
    private Long listno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 财务机构
     */
    private String unitcode;

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
     * 操作员代码
     */
    private String opcode;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 业务部门代码
     */
    private String departmentcode;

    /**
     * 记账币种
     */
    private String currencycode;

    /**
     * 被保险人代码
     */
    private String insuredcode;

    /**
     * 被保险人名称
     */
    private String insuredname;

    /**
     * 承保数量
     */
    private BigDecimal insurencecount;

    /**
     * 金额（记账币种）
     */
    private BigDecimal amount;

    /**
     * 多数情况下都跟记账币种一样，只有款项和匹配的单子币种不同时才记录单子的币种
     */
    private String basecurrencycode;

    /**
     * 多数情况下都跟记账币种金额一样，只有款项和匹配的单子币种不同时才记录单子的币种的金额）
     */
    private BigDecimal baseamount;

    /**
     * 业务性质 1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源
     */
    private String businessattr;

    /**
     * 展业方式编号
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
     * 经办人代码
     */
    private String transactorcode;

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
     * 储金返还序号
     */
    private String returnno;

    /**
     * 2日结 4日结复核 5进项发票落后初始状态
     */
    private String auditstatus;

    /**
     * 日结单号
     */
    private String dailyauditno;

    /**
     * 日结日期
     */
    private Date checkdate;

    /**
     * 复核日期
     */
    private Date auditdate;

    /**
     * 0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被红冲 5 由于取消其他记录产生的红冲记录  8 可转出生产表 9 未生效待审核（目前只对交易流水明细表有意义）  0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收付款表、各流水表、日结单表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录） 
     */
    private String opstatus;

    /**
     * 含义改变了，请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history 
     */
    private String datasource;

    /**
     * 数据库系统时间
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 业务系统录入日期
     */
    private Date inputdate;

    /**
     * hibernate版本号
     */
    private Integer hibernateversion;

    /**
     * 健康险人意险是否拆分过，0 为不拆分；1 拆分
     */
    private String issplitted;

    /**
     * 记录申报单号
     */
    private String summaryno;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 业务发生机构
     */
    private String tounitcode;

    /**
     * 0分出业务 1分入业务
     */
    private String opttype;

    /**
     * 类别,S:溢额　Q:成数,主要指合同分保的区分
     */
    private String qstype;

    /**
     * 分保类型,1 法定 2 合同 3 超赔 4 临分
     */
    private String contracttype;

    /**
     * 红冲关联流水号，红冲业务流水和被红冲业务流水记录 相互记录对应的listno
     */
    private Long coredno;

    /**
     * 经办人名称
     */
    private String transactorname;

    /**
     * 对应于业务类型1的明细记录的流水号，用于根据保单明细记录来生成凭证的情况，对应于businessone
     */
    private Long newdetailno;

    /**
     * 对应于业务类型2的明细记录的流水号，用于根据保单明细记录来生成凭证的情况，对应于businesstwo
     */
    private Long olddetailno;

    /**
     * 预约协议标示1--预约协议结算单  0--正常结算单
     */
    private String protocolflag;

    /**
     * 预约协议号
     */
    private String totalprotocoltno;

    /**
     * 约定汇率
     */
    private BigDecimal excangerate;

    /**
     * 结转标示：0未结转，1部分结转，2全部结转
     */
    private String taxconfirmstatus;

    /**
     * 进项税转出标示：0未转出，1转出
     */
    private String invatconfirmstatus;

    /**
     * 个团标志
     */
    private String groupflag;

    /**
     * 投保单号/批改申请单号
     */
    private String businessno;

    /**
     * 业务来源
     */
    private String businesssource;

    /**
     * 团队类型
     */
    private String grouptype;

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
     * 代理人类型
     */
    private String agenttype;

    /**
     * 涉农类别
     */
    private String farmflagcode;

    /**
     * 保费补贴来源编码
     */
    private String premiumsource;

    /**
     * 车辆使用性质
     */
    private String useporperty;

    /**
     * 车辆种类
     */
    private String vehkind;

    /**
     * 车辆规格特性
     */
    private String characteristics;

    /**
     * 农险明细分类
     */
    private String farmtypedetail;

    /**
     * 涉农标志
     */
    private String farmflag;

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
     * 批次号
     */
    private String batchno;

    /**
     * 日结单类型
     */
    private String reportkind;

    /**
     * 业务发生分公司
     */
    private String tosubcompany;

    /**
    * 获取-主键
    * @return listno
     */
    public Long getListno() {
        return listno;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param listno - 主键
     */
    public void setListno(Long listno) {
        this.listno = listno;
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
    * 获取-多数情况下都跟记账币种金额一样，只有款项和匹配的单子币种不同时才记录单子的币种的金额）
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-多数情况下都跟记账币种金额一样，只有款项和匹配的单子币种不同时才记录单子的币种的金额）
    * @paramType java.math.BigDecimal
    * @param baseamount - 多数情况下都跟记账币种金额一样，只有款项和匹配的单子币种不同时才记录单子的币种的金额）
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
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
    * 获取-2日结 4日结复核 5进项发票落后初始状态
    * @return auditstatus
     */
    public String getAuditstatus() {
        return auditstatus;
    }

    /**
    * 设置-2日结 4日结复核 5进项发票落后初始状态
    * @paramType java.lang.String
    * @param auditstatus - 2日结 4日结复核 5进项发票落后初始状态
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
    * 获取-日结日期
    * @return checkdate
     */
    public Date getCheckdate() {
        return checkdate;
    }

    /**
    * 设置-日结日期
    * @paramType java.util.Date
    * @param checkdate - 日结日期
     */
    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    /**
    * 获取-复核日期
    * @return auditdate
     */
    public Date getAuditdate() {
        return auditdate;
    }

    /**
    * 设置-复核日期
    * @paramType java.util.Date
    * @param auditdate - 复核日期
     */
    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    /**
    * 获取-0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被红冲 5 由于取消其他记录产生的红冲记录  8 可转出生产表 9 未生效待审核（目前只对交易流水明细表有意义）  0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收付款表、各流水表、日结单表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录） 
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被红冲 5 由于取消其他记录产生的红冲记录  8 可转出生产表 9 未生效待审核（目前只对交易流水明细表有意义）  0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收付款表、各流水表、日结单表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录） 
    * @paramType java.lang.String
    * @param opstatus - 0 未核销 1 部分核销 2 核销完毕 3 被作废 4 被红冲 5 由于取消其他记录产生的红冲记录  8 可转出生产表 9 未生效待审核（目前只对交易流水明细表有意义）  0，1，2是有效的，可进行后续处理 3，4是无效的，不能进行后续处理（包括不能再次取消） 5 不能再次被取消（现有系统中只有收付款表、各流水表、日结单表可能产生包含此标志位的红冲记录，预收表和待付款表不会产生红冲记录） 
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
    * 获取-hibernate版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-hibernate版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - hibernate版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-健康险人意险是否拆分过，0 为不拆分；1 拆分
    * @return issplitted
     */
    public String getIssplitted() {
        return issplitted;
    }

    /**
    * 设置-健康险人意险是否拆分过，0 为不拆分；1 拆分
    * @paramType java.lang.String
    * @param issplitted - 健康险人意险是否拆分过，0 为不拆分；1 拆分
     */
    public void setIssplitted(String issplitted) {
        this.issplitted = issplitted;
    }

    /**
    * 获取-记录申报单号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-记录申报单号
    * @paramType java.lang.String
    * @param summaryno - 记录申报单号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
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
    * 获取-业务发生机构
    * @return tounitcode
     */
    public String getTounitcode() {
        return tounitcode;
    }

    /**
    * 设置-业务发生机构
    * @paramType java.lang.String
    * @param tounitcode - 业务发生机构
     */
    public void setTounitcode(String tounitcode) {
        this.tounitcode = tounitcode;
    }

    /**
    * 获取-0分出业务 1分入业务
    * @return opttype
     */
    public String getOpttype() {
        return opttype;
    }

    /**
    * 设置-0分出业务 1分入业务
    * @paramType java.lang.String
    * @param opttype - 0分出业务 1分入业务
     */
    public void setOpttype(String opttype) {
        this.opttype = opttype;
    }

    /**
    * 获取-类别,S:溢额　Q:成数,主要指合同分保的区分
    * @return qstype
     */
    public String getQstype() {
        return qstype;
    }

    /**
    * 设置-类别,S:溢额　Q:成数,主要指合同分保的区分
    * @paramType java.lang.String
    * @param qstype - 类别,S:溢额　Q:成数,主要指合同分保的区分
     */
    public void setQstype(String qstype) {
        this.qstype = qstype;
    }

    /**
    * 获取-分保类型,1 法定 2 合同 3 超赔 4 临分
    * @return contracttype
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
    * 设置-分保类型,1 法定 2 合同 3 超赔 4 临分
    * @paramType java.lang.String
    * @param contracttype - 分保类型,1 法定 2 合同 3 超赔 4 临分
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }

    /**
    * 获取-红冲关联流水号，红冲业务流水和被红冲业务流水记录 相互记录对应的listno
    * @return coredno
     */
    public Long getCoredno() {
        return coredno;
    }

    /**
    * 设置-红冲关联流水号，红冲业务流水和被红冲业务流水记录 相互记录对应的listno
    * @paramType java.lang.Long
    * @param coredno - 红冲关联流水号，红冲业务流水和被红冲业务流水记录 相互记录对应的listno
     */
    public void setCoredno(Long coredno) {
        this.coredno = coredno;
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
    * 获取-预约协议标示1--预约协议结算单  0--正常结算单
    * @return protocolflag
     */
    public String getProtocolflag() {
        return protocolflag;
    }

    /**
    * 设置-预约协议标示1--预约协议结算单  0--正常结算单
    * @paramType java.lang.String
    * @param protocolflag - 预约协议标示1--预约协议结算单  0--正常结算单
     */
    public void setProtocolflag(String protocolflag) {
        this.protocolflag = protocolflag;
    }

    /**
    * 获取-预约协议号
    * @return totalprotocoltno
     */
    public String getTotalprotocoltno() {
        return totalprotocoltno;
    }

    /**
    * 设置-预约协议号
    * @paramType java.lang.String
    * @param totalprotocoltno - 预约协议号
     */
    public void setTotalprotocoltno(String totalprotocoltno) {
        this.totalprotocoltno = totalprotocoltno;
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
    * 获取-结转标示：0未结转，1部分结转，2全部结转
    * @return taxconfirmstatus
     */
    public String getTaxconfirmstatus() {
        return taxconfirmstatus;
    }

    /**
    * 设置-结转标示：0未结转，1部分结转，2全部结转
    * @paramType java.lang.String
    * @param taxconfirmstatus - 结转标示：0未结转，1部分结转，2全部结转
     */
    public void setTaxconfirmstatus(String taxconfirmstatus) {
        this.taxconfirmstatus = taxconfirmstatus;
    }

    /**
    * 获取-进项税转出标示：0未转出，1转出
    * @return invatconfirmstatus
     */
    public String getInvatconfirmstatus() {
        return invatconfirmstatus;
    }

    /**
    * 设置-进项税转出标示：0未转出，1转出
    * @paramType java.lang.String
    * @param invatconfirmstatus - 进项税转出标示：0未转出，1转出
     */
    public void setInvatconfirmstatus(String invatconfirmstatus) {
        this.invatconfirmstatus = invatconfirmstatus;
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
    * 获取-代理人类型
    * @return agenttype
     */
    public String getAgenttype() {
        return agenttype;
    }

    /**
    * 设置-代理人类型
    * @paramType java.lang.String
    * @param agenttype - 代理人类型
     */
    public void setAgenttype(String agenttype) {
        this.agenttype = agenttype;
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
    * 获取-保费补贴来源编码
    * @return premiumsource
     */
    public String getPremiumsource() {
        return premiumsource;
    }

    /**
    * 设置-保费补贴来源编码
    * @paramType java.lang.String
    * @param premiumsource - 保费补贴来源编码
     */
    public void setPremiumsource(String premiumsource) {
        this.premiumsource = premiumsource;
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
    * 获取-农险明细分类
    * @return farmtypedetail
     */
    public String getFarmtypedetail() {
        return farmtypedetail;
    }

    /**
    * 设置-农险明细分类
    * @paramType java.lang.String
    * @param farmtypedetail - 农险明细分类
     */
    public void setFarmtypedetail(String farmtypedetail) {
        this.farmtypedetail = farmtypedetail;
    }

    /**
    * 获取-涉农标志
    * @return farmflag
     */
    public String getFarmflag() {
        return farmflag;
    }

    /**
    * 设置-涉农标志
    * @paramType java.lang.String
    * @param farmflag - 涉农标志
     */
    public void setFarmflag(String farmflag) {
        this.farmflag = farmflag;
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
    * 获取-业务发生分公司
    * @return tosubcompany
     */
    public String getTosubcompany() {
        return tosubcompany;
    }

    /**
    * 设置-业务发生分公司
    * @paramType java.lang.String
    * @param tosubcompany - 业务发生分公司
     */
    public void setTosubcompany(String tosubcompany) {
        this.tosubcompany = tosubcompany;
    }
}