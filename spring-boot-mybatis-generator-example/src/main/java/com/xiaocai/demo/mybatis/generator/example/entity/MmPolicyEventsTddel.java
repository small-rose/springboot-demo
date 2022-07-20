package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policy_events_td_del
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicyEventsTdDel {
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
     * 对应于业务类型(1的流水号，暂存收款、预收款、待付款等 对应于businesstwo)
     */
    private Long oldno;

    /**
     * 对应于业务类型(2的流水号，保批单、预收款、待付款等 对应于businessone)
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
     * 多数情况下都跟记账币种一样(只有款项和匹配的单子币种不同时才记录单子的币种)
     */
    private String basecurrencycode;

    /**
     * 多数情况下都跟记账币种金额一样(只有款项和匹配的单子币种不同时才记录单子的币种的金额)
     */
    private BigDecimal baseamount;

    /**
     * 业务性质(1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源)
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
     * 日结状态
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
     * 系统时间
     */
    private Date auditdate;

    /**
     * 核销状态
     */
    private String opstatus;

    /**
     * 业务来源(含义改变了请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history)
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
     * 业务系统录入日期
     */
    private Date inputdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 健康险人意险是否拆分过(0 为未处理；1 已拆分；2 不需拆分；3 需要拆分)
     */
    private String issplitted;

    /**
     * 记录申报单号
     */
    private String summaryno;

    /**
     * 手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
     */
    private String modifydesc;

    /**
     * 业务发生机构
     */
    private String tounitcode;

    /**
     * 记录申报单号
     */
    private String opttype;

    /**
     * 分保类型(1 法定 2 合同 3 超赔 4 临分)
     */
    private String qstype;

    /**
     * CONTRACTTYPE
     */
    private String contracttype;

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
    * 获取-多数情况下都跟记账币种一样(只有款项和匹配的单子币种不同时才记录单子的币种)
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-多数情况下都跟记账币种一样(只有款项和匹配的单子币种不同时才记录单子的币种)
    * @paramType java.lang.String
    * @param basecurrencycode - 多数情况下都跟记账币种一样(只有款项和匹配的单子币种不同时才记录单子的币种)
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
    }

    /**
    * 获取-多数情况下都跟记账币种金额一样(只有款项和匹配的单子币种不同时才记录单子的币种的金额)
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-多数情况下都跟记账币种金额一样(只有款项和匹配的单子币种不同时才记录单子的币种的金额)
    * @paramType java.math.BigDecimal
    * @param baseamount - 多数情况下都跟记账币种金额一样(只有款项和匹配的单子币种不同时才记录单子的币种的金额)
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
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
    * 获取-业务来源(含义改变了请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history)
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-业务来源(含义改变了请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history)
    * @paramType java.lang.String
    * @param datasource - 业务来源(含义改变了请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history)
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
    * 获取-记录申报单号
    * @return opttype
     */
    public String getOpttype() {
        return opttype;
    }

    /**
    * 设置-记录申报单号
    * @paramType java.lang.String
    * @param opttype - 记录申报单号
     */
    public void setOpttype(String opttype) {
        this.opttype = opttype;
    }

    /**
    * 获取-分保类型(1 法定 2 合同 3 超赔 4 临分)
    * @return qstype
     */
    public String getQstype() {
        return qstype;
    }

    /**
    * 设置-分保类型(1 法定 2 合同 3 超赔 4 临分)
    * @paramType java.lang.String
    * @param qstype - 分保类型(1 法定 2 合同 3 超赔 4 临分)
     */
    public void setQstype(String qstype) {
        this.qstype = qstype;
    }

    /**
    * 获取-CONTRACTTYPE
    * @return contracttype
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
    * 设置-CONTRACTTYPE
    * @paramType java.lang.String
    * @param contracttype - CONTRACTTYPE
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }
}