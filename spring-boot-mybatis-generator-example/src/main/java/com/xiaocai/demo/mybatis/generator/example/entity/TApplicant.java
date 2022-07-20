package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : t_applicant
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class TApplicant {
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
     * 分公司
     */
    private String subcompany;

    /**
     * 部门
     */
    private String departmentcode;

    /**
     * 投保单号
     */
    private String applicantno;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 车牌号
     */
    private String vehicleno;

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
     * 录入日期
     */
    private Date inputdate;

    /**
     * 核保日期
     */
    private Date auditdate;

    /**
     * 平台查询码有效期
     */
    private Date querydate;

    /**
     * 业务员/经办人代码
     */
    private String transactorcode;

    /**
     * 业务员/经办人名称
     */
    private String transactorname;

    /**
     * 核保人代码
     */
    private String auditorcode;

    /**
     * 核保人名称
     */
    private String auditorname;

    /**
     * 业务险类
     */
    private String classeskind;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 币种代码
     */
    private String currencycode;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 批量处理号
     */
    private String summaryno;

    /**
     * 业务唯一流水号
     */
    private String custseq;

    /**
     * 展业方式编码
     */
    private String businesschannel;

    /**
     * 保单上的投保人代码
     */
    private String applicantcode;

    /**
     * 保单上的投保人中文名称
     */
    private String applicantnamecn;

    /**
     * 保单上的投保人英文名称
     */
    private String applicantnameen;

    /**
     * 被保险人代码
     */
    private String insuredcode;

    /**
     * 被保险人名称
     */
    private String insuredname;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 代理点名称（中文）
     */
    private String agentnamecn;

    /**
     * 代理点名称（英文）
     */
    private String agentnameen;

    /**
     * 是否分期
     */
    private String hasplan;

    /**
     * 涉农标志
     */
    private String farmflag;

    /**
     * 见费出单标识
     */
    private String feeflag;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态：0初始化 1部分处理 2已处理 3作废
     */
    private String status;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 平台用户
     */
    private String userid;

    /**
     * 已处理金额
     */
    private BigDecimal processedamount;

    /**
     * 保费来源
     */
    private String premiumsource;

    /**
     * 外部来源系统
     */
    private String outdatasource;

    /**
     * 联保关联单号
     */
    private String coinsurno;

    /**
     * 联保类型
     */
    private String isjointinsurance;

    /**
     * 联共保类型
     */
    private String iscoinsurance;

    /**
     * 是否需要短信通知
     */
    private String issmsverification;

    /**
     * 是否需要实名认证标识
     */
    private String iscertificate;

    /**
     * 电话号码
     */
    private String mobilephone;

    /**
     * 证件号码
     */
    private String certificateno;

    /**
     * 证件类型
     */
    private String certificatetype;

    /**
     * 最晚收款时间
     */
    private Date latesttime;

    /**
     * 出单员名称
     */
    private String operatorname;

    /**
     * 出单员代码
     */
    private String operatorcode;

    /**
     * 批量处理号
     */
    private String summary;

    /**
     * 金额
     */
    private BigDecimal sumamount;

    /**
     * 组合险种
     */
    private String unionclassescode;

    /**
     * 业务类型
     */
    private String businesstype;

    /**
     * 投保单号/批单申请号
     */
    private String businessno;

    /**
     * 交易流水号
     */
    private String rcptno;

    /**
     * 支付申请号
     */
    private String applyno;

    /**
     * 是否人车联动 0否 1 是
     */
    private String ifcarlink;

    /**
     * 人车联动关联投保单号
     */
    private String carlinkbusinessno;

    /**
     * 支付协议号
     */
    private String payprotocolno;

    /**
     * 是否随车行李
     */
    private String ifonboardluggage;

    /**
     * 随车行李关联投保单号
     */
    private String onboardluggageno;

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
    * 获取-部门
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-部门
    * @paramType java.lang.String
    * @param departmentcode - 部门
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    /**
    * 获取-投保单号
    * @return applicantno
     */
    public String getApplicantno() {
        return applicantno;
    }

    /**
    * 设置-投保单号
    * @paramType java.lang.String
    * @param applicantno - 投保单号
     */
    public void setApplicantno(String applicantno) {
        this.applicantno = applicantno;
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
    * 获取-车牌号
    * @return vehicleno
     */
    public String getVehicleno() {
        return vehicleno;
    }

    /**
    * 设置-车牌号
    * @paramType java.lang.String
    * @param vehicleno - 车牌号
     */
    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
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
    * 获取-录入日期
    * @return inputdate
     */
    public Date getInputdate() {
        return inputdate;
    }

    /**
    * 设置-录入日期
    * @paramType java.util.Date
    * @param inputdate - 录入日期
     */
    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    /**
    * 获取-核保日期
    * @return auditdate
     */
    public Date getAuditdate() {
        return auditdate;
    }

    /**
    * 设置-核保日期
    * @paramType java.util.Date
    * @param auditdate - 核保日期
     */
    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    /**
    * 获取-平台查询码有效期
    * @return querydate
     */
    public Date getQuerydate() {
        return querydate;
    }

    /**
    * 设置-平台查询码有效期
    * @paramType java.util.Date
    * @param querydate - 平台查询码有效期
     */
    public void setQuerydate(Date querydate) {
        this.querydate = querydate;
    }

    /**
    * 获取-业务员/经办人代码
    * @return transactorcode
     */
    public String getTransactorcode() {
        return transactorcode;
    }

    /**
    * 设置-业务员/经办人代码
    * @paramType java.lang.String
    * @param transactorcode - 业务员/经办人代码
     */
    public void setTransactorcode(String transactorcode) {
        this.transactorcode = transactorcode;
    }

    /**
    * 获取-业务员/经办人名称
    * @return transactorname
     */
    public String getTransactorname() {
        return transactorname;
    }

    /**
    * 设置-业务员/经办人名称
    * @paramType java.lang.String
    * @param transactorname - 业务员/经办人名称
     */
    public void setTransactorname(String transactorname) {
        this.transactorname = transactorname;
    }

    /**
    * 获取-核保人代码
    * @return auditorcode
     */
    public String getAuditorcode() {
        return auditorcode;
    }

    /**
    * 设置-核保人代码
    * @paramType java.lang.String
    * @param auditorcode - 核保人代码
     */
    public void setAuditorcode(String auditorcode) {
        this.auditorcode = auditorcode;
    }

    /**
    * 获取-核保人名称
    * @return auditorname
     */
    public String getAuditorname() {
        return auditorname;
    }

    /**
    * 设置-核保人名称
    * @paramType java.lang.String
    * @param auditorname - 核保人名称
     */
    public void setAuditorname(String auditorname) {
        this.auditorname = auditorname;
    }

    /**
    * 获取-业务险类
    * @return classeskind
     */
    public String getClasseskind() {
        return classeskind;
    }

    /**
    * 设置-业务险类
    * @paramType java.lang.String
    * @param classeskind - 业务险类
     */
    public void setClasseskind(String classeskind) {
        this.classeskind = classeskind;
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
    * 获取-币种代码
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种代码
    * @paramType java.lang.String
    * @param currencycode - 币种代码
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
    * 获取-批量处理号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-批量处理号
    * @paramType java.lang.String
    * @param summaryno - 批量处理号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    /**
    * 获取-业务唯一流水号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务唯一流水号
    * @paramType java.lang.String
    * @param custseq - 业务唯一流水号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-展业方式编码
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-展业方式编码
    * @paramType java.lang.String
    * @param businesschannel - 展业方式编码
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
    }

    /**
    * 获取-保单上的投保人代码
    * @return applicantcode
     */
    public String getApplicantcode() {
        return applicantcode;
    }

    /**
    * 设置-保单上的投保人代码
    * @paramType java.lang.String
    * @param applicantcode - 保单上的投保人代码
     */
    public void setApplicantcode(String applicantcode) {
        this.applicantcode = applicantcode;
    }

    /**
    * 获取-保单上的投保人中文名称
    * @return applicantnamecn
     */
    public String getApplicantnamecn() {
        return applicantnamecn;
    }

    /**
    * 设置-保单上的投保人中文名称
    * @paramType java.lang.String
    * @param applicantnamecn - 保单上的投保人中文名称
     */
    public void setApplicantnamecn(String applicantnamecn) {
        this.applicantnamecn = applicantnamecn;
    }

    /**
    * 获取-保单上的投保人英文名称
    * @return applicantnameen
     */
    public String getApplicantnameen() {
        return applicantnameen;
    }

    /**
    * 设置-保单上的投保人英文名称
    * @paramType java.lang.String
    * @param applicantnameen - 保单上的投保人英文名称
     */
    public void setApplicantnameen(String applicantnameen) {
        this.applicantnameen = applicantnameen;
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
    * 获取-代理点名称（中文）
    * @return agentnamecn
     */
    public String getAgentnamecn() {
        return agentnamecn;
    }

    /**
    * 设置-代理点名称（中文）
    * @paramType java.lang.String
    * @param agentnamecn - 代理点名称（中文）
     */
    public void setAgentnamecn(String agentnamecn) {
        this.agentnamecn = agentnamecn;
    }

    /**
    * 获取-代理点名称（英文）
    * @return agentnameen
     */
    public String getAgentnameen() {
        return agentnameen;
    }

    /**
    * 设置-代理点名称（英文）
    * @paramType java.lang.String
    * @param agentnameen - 代理点名称（英文）
     */
    public void setAgentnameen(String agentnameen) {
        this.agentnameen = agentnameen;
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
    * 获取-见费出单标识
    * @return feeflag
     */
    public String getFeeflag() {
        return feeflag;
    }

    /**
    * 设置-见费出单标识
    * @paramType java.lang.String
    * @param feeflag - 见费出单标识
     */
    public void setFeeflag(String feeflag) {
        this.feeflag = feeflag;
    }

    /**
    * 获取-备注
    * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param remark - 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
    * 获取-状态：0初始化 1部分处理 2已处理 3作废
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态：0初始化 1部分处理 2已处理 3作废
    * @paramType java.lang.String
    * @param status - 状态：0初始化 1部分处理 2已处理 3作废
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-平台用户
    * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
    * 设置-平台用户
    * @paramType java.lang.String
    * @param userid - 平台用户
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
    * 获取-已处理金额
    * @return processedamount
     */
    public BigDecimal getProcessedamount() {
        return processedamount;
    }

    /**
    * 设置-已处理金额
    * @paramType java.math.BigDecimal
    * @param processedamount - 已处理金额
     */
    public void setProcessedamount(BigDecimal processedamount) {
        this.processedamount = processedamount;
    }

    /**
    * 获取-保费来源
    * @return premiumsource
     */
    public String getPremiumsource() {
        return premiumsource;
    }

    /**
    * 设置-保费来源
    * @paramType java.lang.String
    * @param premiumsource - 保费来源
     */
    public void setPremiumsource(String premiumsource) {
        this.premiumsource = premiumsource;
    }

    /**
    * 获取-外部来源系统
    * @return outdatasource
     */
    public String getOutdatasource() {
        return outdatasource;
    }

    /**
    * 设置-外部来源系统
    * @paramType java.lang.String
    * @param outdatasource - 外部来源系统
     */
    public void setOutdatasource(String outdatasource) {
        this.outdatasource = outdatasource;
    }

    /**
    * 获取-联保关联单号
    * @return coinsurno
     */
    public String getCoinsurno() {
        return coinsurno;
    }

    /**
    * 设置-联保关联单号
    * @paramType java.lang.String
    * @param coinsurno - 联保关联单号
     */
    public void setCoinsurno(String coinsurno) {
        this.coinsurno = coinsurno;
    }

    /**
    * 获取-联保类型
    * @return isjointinsurance
     */
    public String getIsjointinsurance() {
        return isjointinsurance;
    }

    /**
    * 设置-联保类型
    * @paramType java.lang.String
    * @param isjointinsurance - 联保类型
     */
    public void setIsjointinsurance(String isjointinsurance) {
        this.isjointinsurance = isjointinsurance;
    }

    /**
    * 获取-联共保类型
    * @return iscoinsurance
     */
    public String getIscoinsurance() {
        return iscoinsurance;
    }

    /**
    * 设置-联共保类型
    * @paramType java.lang.String
    * @param iscoinsurance - 联共保类型
     */
    public void setIscoinsurance(String iscoinsurance) {
        this.iscoinsurance = iscoinsurance;
    }

    /**
    * 获取-是否需要短信通知
    * @return issmsverification
     */
    public String getIssmsverification() {
        return issmsverification;
    }

    /**
    * 设置-是否需要短信通知
    * @paramType java.lang.String
    * @param issmsverification - 是否需要短信通知
     */
    public void setIssmsverification(String issmsverification) {
        this.issmsverification = issmsverification;
    }

    /**
    * 获取-是否需要实名认证标识
    * @return iscertificate
     */
    public String getIscertificate() {
        return iscertificate;
    }

    /**
    * 设置-是否需要实名认证标识
    * @paramType java.lang.String
    * @param iscertificate - 是否需要实名认证标识
     */
    public void setIscertificate(String iscertificate) {
        this.iscertificate = iscertificate;
    }

    /**
    * 获取-电话号码
    * @return mobilephone
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
    * 设置-电话号码
    * @paramType java.lang.String
    * @param mobilephone - 电话号码
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
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
    * 获取-最晚收款时间
    * @return latesttime
     */
    public Date getLatesttime() {
        return latesttime;
    }

    /**
    * 设置-最晚收款时间
    * @paramType java.util.Date
    * @param latesttime - 最晚收款时间
     */
    public void setLatesttime(Date latesttime) {
        this.latesttime = latesttime;
    }

    /**
    * 获取-出单员名称
    * @return operatorname
     */
    public String getOperatorname() {
        return operatorname;
    }

    /**
    * 设置-出单员名称
    * @paramType java.lang.String
    * @param operatorname - 出单员名称
     */
    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    /**
    * 获取-出单员代码
    * @return operatorcode
     */
    public String getOperatorcode() {
        return operatorcode;
    }

    /**
    * 设置-出单员代码
    * @paramType java.lang.String
    * @param operatorcode - 出单员代码
     */
    public void setOperatorcode(String operatorcode) {
        this.operatorcode = operatorcode;
    }

    /**
    * 获取-批量处理号
    * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
    * 设置-批量处理号
    * @paramType java.lang.String
    * @param summary - 批量处理号
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
    * 获取-金额
    * @return sumamount
     */
    public BigDecimal getSumamount() {
        return sumamount;
    }

    /**
    * 设置-金额
    * @paramType java.math.BigDecimal
    * @param sumamount - 金额
     */
    public void setSumamount(BigDecimal sumamount) {
        this.sumamount = sumamount;
    }

    /**
    * 获取-组合险种
    * @return unionclassescode
     */
    public String getUnionclassescode() {
        return unionclassescode;
    }

    /**
    * 设置-组合险种
    * @paramType java.lang.String
    * @param unionclassescode - 组合险种
     */
    public void setUnionclassescode(String unionclassescode) {
        this.unionclassescode = unionclassescode;
    }

    /**
    * 获取-业务类型
    * @return businesstype
     */
    public String getBusinesstype() {
        return businesstype;
    }

    /**
    * 设置-业务类型
    * @paramType java.lang.String
    * @param businesstype - 业务类型
     */
    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    /**
    * 获取-投保单号/批单申请号
    * @return businessno
     */
    public String getBusinessno() {
        return businessno;
    }

    /**
    * 设置-投保单号/批单申请号
    * @paramType java.lang.String
    * @param businessno - 投保单号/批单申请号
     */
    public void setBusinessno(String businessno) {
        this.businessno = businessno;
    }

    /**
    * 获取-交易流水号
    * @return rcptno
     */
    public String getRcptno() {
        return rcptno;
    }

    /**
    * 设置-交易流水号
    * @paramType java.lang.String
    * @param rcptno - 交易流水号
     */
    public void setRcptno(String rcptno) {
        this.rcptno = rcptno;
    }

    /**
    * 获取-支付申请号
    * @return applyno
     */
    public String getApplyno() {
        return applyno;
    }

    /**
    * 设置-支付申请号
    * @paramType java.lang.String
    * @param applyno - 支付申请号
     */
    public void setApplyno(String applyno) {
        this.applyno = applyno;
    }

    /**
    * 获取-是否人车联动 0否 1 是
    * @return ifcarlink
     */
    public String getIfcarlink() {
        return ifcarlink;
    }

    /**
    * 设置-是否人车联动 0否 1 是
    * @paramType java.lang.String
    * @param ifcarlink - 是否人车联动 0否 1 是
     */
    public void setIfcarlink(String ifcarlink) {
        this.ifcarlink = ifcarlink;
    }

    /**
    * 获取-人车联动关联投保单号
    * @return carlinkbusinessno
     */
    public String getCarlinkbusinessno() {
        return carlinkbusinessno;
    }

    /**
    * 设置-人车联动关联投保单号
    * @paramType java.lang.String
    * @param carlinkbusinessno - 人车联动关联投保单号
     */
    public void setCarlinkbusinessno(String carlinkbusinessno) {
        this.carlinkbusinessno = carlinkbusinessno;
    }

    /**
    * 获取-支付协议号
    * @return payprotocolno
     */
    public String getPayprotocolno() {
        return payprotocolno;
    }

    /**
    * 设置-支付协议号
    * @paramType java.lang.String
    * @param payprotocolno - 支付协议号
     */
    public void setPayprotocolno(String payprotocolno) {
        this.payprotocolno = payprotocolno;
    }

    /**
    * 获取-是否随车行李
    * @return ifonboardluggage
     */
    public String getIfonboardluggage() {
        return ifonboardluggage;
    }

    /**
    * 设置-是否随车行李
    * @paramType java.lang.String
    * @param ifonboardluggage - 是否随车行李
     */
    public void setIfonboardluggage(String ifonboardluggage) {
        this.ifonboardluggage = ifonboardluggage;
    }

    /**
    * 获取-随车行李关联投保单号
    * @return onboardluggageno
     */
    public String getOnboardluggageno() {
        return onboardluggageno;
    }

    /**
    * 设置-随车行李关联投保单号
    * @paramType java.lang.String
    * @param onboardluggageno - 随车行李关联投保单号
     */
    public void setOnboardluggageno(String onboardluggageno) {
        this.onboardluggageno = onboardluggageno;
    }
}