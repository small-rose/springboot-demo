package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_bad_debts_list
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBadDebtsList {
    /**
     * 主键
     */
    private Long id;

    /**
     * 坏账提取日期
     */
    private Date extractDate;

    /**
     * 切片的ID
     */
    private Long mirrorid;

    /**
     * 保单表主键
     */
    private Long seqpolicy;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 机构代码
     */
    private String unitcode;

    /**
     * 部门代码
     */
    private String departmentcode;

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
     * 复核人代码
     */
    private String underwritercode;

    /**
     * 险种
     */
    private String classescode;

    /**
     * 风险代码
     */
    private String risktype;

    /**
     * 风险类别
     */
    private String classeskind;

    /**
     * 代理点
     */
    private String agentcode;

    /**
     * 状态.0,无实收,1.部分实收
     */
    private String opstatus;

    /**
     * 帐龄
     */
    private String accountage;

    /**
     * 帐龄天数
     */
    private Long accountdate;

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
     * 操作日期
     */
    private Date opdate;

    /**
     * 保单金额
     */
    private BigDecimal amount;

    /**
     * 总实收金额
     */
    private BigDecimal realamount;

    /**
     * 总应收金额
     */
    private BigDecimal remains;

    /**
     * 分期缴费计划日期
     */
    private Date planDate;

    /**
     * 分期序号,0说明无分期
     */
    private BigDecimal planSeq;

    /**
     * 分期金额
     */
    private BigDecimal planAmount;

    /**
     * 是否是勾选的坏账
     */
    private String isBad;

    /**
     * 是否已到缴费期
     */
    private String isStart;

    /**
     * 应收缴费金额
     */
    private BigDecimal thisAmount;

    /**
     * 坏账提取比率
     */
    private BigDecimal badPercent;

    /**
     * 坏账提取金额
     */
    private BigDecimal badAmount;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATEVERSION版本号
     */
    private Short hibernateversion;

    /**
     * 渠道代码
     */
    private String businesschannel;

    /**
     * 流水号
     */
    private BigDecimal listno;

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
    * 获取-坏账提取日期
    * @return extractDate
     */
    public Date getExtractDate() {
        return extractDate;
    }

    /**
    * 设置-坏账提取日期
    * @paramType java.util.Date
    * @param extractDate - 坏账提取日期
     */
    public void setExtractDate(Date extractDate) {
        this.extractDate = extractDate;
    }

    /**
    * 获取-切片的ID
    * @return mirrorid
     */
    public Long getMirrorid() {
        return mirrorid;
    }

    /**
    * 设置-切片的ID
    * @paramType java.lang.Long
    * @param mirrorid - 切片的ID
     */
    public void setMirrorid(Long mirrorid) {
        this.mirrorid = mirrorid;
    }

    /**
    * 获取-保单表主键
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-保单表主键
    * @paramType java.lang.Long
    * @param seqpolicy - 保单表主键
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
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
    * 获取-机构代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-机构代码
    * @paramType java.lang.String
    * @param unitcode - 机构代码
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
    * 获取-复核人代码
    * @return underwritercode
     */
    public String getUnderwritercode() {
        return underwritercode;
    }

    /**
    * 设置-复核人代码
    * @paramType java.lang.String
    * @param underwritercode - 复核人代码
     */
    public void setUnderwritercode(String underwritercode) {
        this.underwritercode = underwritercode;
    }

    /**
    * 获取-险种
    * @return classescode
     */
    public String getClassescode() {
        return classescode;
    }

    /**
    * 设置-险种
    * @paramType java.lang.String
    * @param classescode - 险种
     */
    public void setClassescode(String classescode) {
        this.classescode = classescode;
    }

    /**
    * 获取-风险代码
    * @return risktype
     */
    public String getRisktype() {
        return risktype;
    }

    /**
    * 设置-风险代码
    * @paramType java.lang.String
    * @param risktype - 风险代码
     */
    public void setRisktype(String risktype) {
        this.risktype = risktype;
    }

    /**
    * 获取-风险类别
    * @return classeskind
     */
    public String getClasseskind() {
        return classeskind;
    }

    /**
    * 设置-风险类别
    * @paramType java.lang.String
    * @param classeskind - 风险类别
     */
    public void setClasseskind(String classeskind) {
        this.classeskind = classeskind;
    }

    /**
    * 获取-代理点
    * @return agentcode
     */
    public String getAgentcode() {
        return agentcode;
    }

    /**
    * 设置-代理点
    * @paramType java.lang.String
    * @param agentcode - 代理点
     */
    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    /**
    * 获取-状态.0,无实收,1.部分实收
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-状态.0,无实收,1.部分实收
    * @paramType java.lang.String
    * @param opstatus - 状态.0,无实收,1.部分实收
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-帐龄
    * @return accountage
     */
    public String getAccountage() {
        return accountage;
    }

    /**
    * 设置-帐龄
    * @paramType java.lang.String
    * @param accountage - 帐龄
     */
    public void setAccountage(String accountage) {
        this.accountage = accountage;
    }

    /**
    * 获取-帐龄天数
    * @return accountdate
     */
    public Long getAccountdate() {
        return accountdate;
    }

    /**
    * 设置-帐龄天数
    * @paramType java.lang.Long
    * @param accountdate - 帐龄天数
     */
    public void setAccountdate(Long accountdate) {
        this.accountdate = accountdate;
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
    * 获取-保单金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-保单金额
    * @paramType java.math.BigDecimal
    * @param amount - 保单金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-总实收金额
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-总实收金额
    * @paramType java.math.BigDecimal
    * @param realamount - 总实收金额
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
    }

    /**
    * 获取-总应收金额
    * @return remains
     */
    public BigDecimal getRemains() {
        return remains;
    }

    /**
    * 设置-总应收金额
    * @paramType java.math.BigDecimal
    * @param remains - 总应收金额
     */
    public void setRemains(BigDecimal remains) {
        this.remains = remains;
    }

    /**
    * 获取-分期缴费计划日期
    * @return planDate
     */
    public Date getPlanDate() {
        return planDate;
    }

    /**
    * 设置-分期缴费计划日期
    * @paramType java.util.Date
    * @param planDate - 分期缴费计划日期
     */
    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    /**
    * 获取-分期序号,0说明无分期
    * @return planSeq
     */
    public BigDecimal getPlanSeq() {
        return planSeq;
    }

    /**
    * 设置-分期序号,0说明无分期
    * @paramType java.math.BigDecimal
    * @param planSeq - 分期序号,0说明无分期
     */
    public void setPlanSeq(BigDecimal planSeq) {
        this.planSeq = planSeq;
    }

    /**
    * 获取-分期金额
    * @return planAmount
     */
    public BigDecimal getPlanAmount() {
        return planAmount;
    }

    /**
    * 设置-分期金额
    * @paramType java.math.BigDecimal
    * @param planAmount - 分期金额
     */
    public void setPlanAmount(BigDecimal planAmount) {
        this.planAmount = planAmount;
    }

    /**
    * 获取-是否是勾选的坏账
    * @return isBad
     */
    public String getIsBad() {
        return isBad;
    }

    /**
    * 设置-是否是勾选的坏账
    * @paramType java.lang.String
    * @param isBad - 是否是勾选的坏账
     */
    public void setIsBad(String isBad) {
        this.isBad = isBad;
    }

    /**
    * 获取-是否已到缴费期
    * @return isStart
     */
    public String getIsStart() {
        return isStart;
    }

    /**
    * 设置-是否已到缴费期
    * @paramType java.lang.String
    * @param isStart - 是否已到缴费期
     */
    public void setIsStart(String isStart) {
        this.isStart = isStart;
    }

    /**
    * 获取-应收缴费金额
    * @return thisAmount
     */
    public BigDecimal getThisAmount() {
        return thisAmount;
    }

    /**
    * 设置-应收缴费金额
    * @paramType java.math.BigDecimal
    * @param thisAmount - 应收缴费金额
     */
    public void setThisAmount(BigDecimal thisAmount) {
        this.thisAmount = thisAmount;
    }

    /**
    * 获取-坏账提取比率
    * @return badPercent
     */
    public BigDecimal getBadPercent() {
        return badPercent;
    }

    /**
    * 设置-坏账提取比率
    * @paramType java.math.BigDecimal
    * @param badPercent - 坏账提取比率
     */
    public void setBadPercent(BigDecimal badPercent) {
        this.badPercent = badPercent;
    }

    /**
    * 获取-坏账提取金额
    * @return badAmount
     */
    public BigDecimal getBadAmount() {
        return badAmount;
    }

    /**
    * 设置-坏账提取金额
    * @paramType java.math.BigDecimal
    * @param badAmount - 坏账提取金额
     */
    public void setBadAmount(BigDecimal badAmount) {
        this.badAmount = badAmount;
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
    * 获取-流水号
    * @return listno
     */
    public BigDecimal getListno() {
        return listno;
    }

    /**
    * 设置-流水号
    * @paramType java.math.BigDecimal
    * @param listno - 流水号
     */
    public void setListno(BigDecimal listno) {
        this.listno = listno;
    }
}