package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policymirror_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicymirrorTd {
    /**
     * 主键
     */
    private Long listno;

    /**
     * 父单据id
     */
    private Long mirrorid;

    /**
     * 保批单分表流水号
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
     * 记账币种
     */
    private String currencycode;

    /**
     * 余额
     */
    private BigDecimal remains;

    /**
     * 业务性质 1:保费,2:储金,3:储金折保费,4:车船税,5:储金返还,6:储金利息,7:农业险保费中央财政补助,8:农业险保费省级财政补助,9:农业险保费地市县财政补助,A:农业险保费农民缴纳,B:农业险保费其他来源
     */
    private String businessattr;

    /**
     * 是否已起保生效
     */
    private String ifstart;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 业务部门代码
     */
    private String departmentcode;

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
     * 核保员代码
     */
    private String underwritercode;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 风险类别
     */
    private String risktype;

    /**
     * 业务险类
     */
    private String classeskind;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 核销状态
     */
    private String opstatus;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATE版本号
     */
    private Long hibernateversion;

    /**
     * 帐龄
     */
    private String accountage;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 已处理金额
     */
    private BigDecimal realamount;

    /**
     * 保单接口主表主键
     */
    private BigDecimal seqcharge;

    /**
     * 签单日期
     */
    private Date signdate;

    /**
     * 帐龄天数
     */
    private Integer accountday;

    /**
     * 险种名称
     */
    private String classescodename;

    /**
     * 机构名称
     */
    private String unitname;

    /**
     * 部门名称
     */
    private String departmentname;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 折本位币借方金额（在明细表可以不计算）
     */
    private BigDecimal accountedDr;

    /**
     * 汇率
     */
    private BigDecimal exchangerate;

    /**
     * 账龄天数（以起保日期计算）
     */
    private Integer accountday2;

    /**
     * 账龄天数（以起保日期计算）
     */
    private Integer accountday1;

    /**
     * 账龄（以起保日期计算）
     */
    private String accountage1;

    /**
     * 账龄（以起保日期计算）
     */
    private String accountage2;

    /**
     * 唯一业务流水号
     */
    private String custseq;

    /**
     * 已到结算日余额
     */
    private BigDecimal remainsDued;

    /**
     * 未到结算日余额
     */
    private BigDecimal remainsUndued;

    /**
     * 是否有缴费计划
     */
    private String hasplan;

    /**
     * 业务渠道
     */
    private String businesschannel;

    /**
     * 业务渠道名称
     */
    private String businesschannelname;

    /**
     * 共保人代码
     */
    private String masterno;

    /**
     * 共保人名称
     */
    private String mastername;

    /**
     * 操作人代码
     */
    private String optcode;

    /**
     * 操作人名称
     */
    private String optname;

    /**
     * 经办人名称
     */
    private String transactorname;

    /**
     * 消费渠道
     */
    private String paychannel;

    /**
     * 计划缴费日期
     */
    private Date plandate;

    /**
     * 缴费序号
     */
    private Integer serialno;

    /**
     * 财务险种
     */
    private String sapclassescode;

    /**
     * 财务险类
     */
    private String sapclasseskind;

    /**
     * 子险
     */
    private String riskclassescode;

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
    * 获取-父单据id
    * @return mirrorid
     */
    public Long getMirrorid() {
        return mirrorid;
    }

    /**
    * 设置-父单据id
    * @paramType java.lang.Long
    * @param mirrorid - 父单据id
     */
    public void setMirrorid(Long mirrorid) {
        this.mirrorid = mirrorid;
    }

    /**
    * 获取-保批单分表流水号
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-保批单分表流水号
    * @paramType java.lang.Long
    * @param seqpolicy - 保批单分表流水号
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
    * 获取-余额
    * @return remains
     */
    public BigDecimal getRemains() {
        return remains;
    }

    /**
    * 设置-余额
    * @paramType java.math.BigDecimal
    * @param remains - 余额
     */
    public void setRemains(BigDecimal remains) {
        this.remains = remains;
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
    * 获取-是否已起保生效
    * @return ifstart
     */
    public String getIfstart() {
        return ifstart;
    }

    /**
    * 设置-是否已起保生效
    * @paramType java.lang.String
    * @param ifstart - 是否已起保生效
     */
    public void setIfstart(String ifstart) {
        this.ifstart = ifstart;
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
    * 获取-核保员代码
    * @return underwritercode
     */
    public String getUnderwritercode() {
        return underwritercode;
    }

    /**
    * 设置-核保员代码
    * @paramType java.lang.String
    * @param underwritercode - 核保员代码
     */
    public void setUnderwritercode(String underwritercode) {
        this.underwritercode = underwritercode;
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
    * 获取-已处理金额
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-已处理金额
    * @paramType java.math.BigDecimal
    * @param realamount - 已处理金额
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
    }

    /**
    * 获取-保单接口主表主键
    * @return seqcharge
     */
    public BigDecimal getSeqcharge() {
        return seqcharge;
    }

    /**
    * 设置-保单接口主表主键
    * @paramType java.math.BigDecimal
    * @param seqcharge - 保单接口主表主键
     */
    public void setSeqcharge(BigDecimal seqcharge) {
        this.seqcharge = seqcharge;
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
    * 获取-帐龄天数
    * @return accountday
     */
    public Integer getAccountday() {
        return accountday;
    }

    /**
    * 设置-帐龄天数
    * @paramType java.lang.Integer
    * @param accountday - 帐龄天数
     */
    public void setAccountday(Integer accountday) {
        this.accountday = accountday;
    }

    /**
    * 获取-险种名称
    * @return classescodename
     */
    public String getClassescodename() {
        return classescodename;
    }

    /**
    * 设置-险种名称
    * @paramType java.lang.String
    * @param classescodename - 险种名称
     */
    public void setClassescodename(String classescodename) {
        this.classescodename = classescodename;
    }

    /**
    * 获取-机构名称
    * @return unitname
     */
    public String getUnitname() {
        return unitname;
    }

    /**
    * 设置-机构名称
    * @paramType java.lang.String
    * @param unitname - 机构名称
     */
    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    /**
    * 获取-部门名称
    * @return departmentname
     */
    public String getDepartmentname() {
        return departmentname;
    }

    /**
    * 设置-部门名称
    * @paramType java.lang.String
    * @param departmentname - 部门名称
     */
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
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
    * 获取-折本位币借方金额（在明细表可以不计算）
    * @return accountedDr
     */
    public BigDecimal getAccountedDr() {
        return accountedDr;
    }

    /**
    * 设置-折本位币借方金额（在明细表可以不计算）
    * @paramType java.math.BigDecimal
    * @param accountedDr - 折本位币借方金额（在明细表可以不计算）
     */
    public void setAccountedDr(BigDecimal accountedDr) {
        this.accountedDr = accountedDr;
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
    * 获取-账龄天数（以起保日期计算）
    * @return accountday2
     */
    public Integer getAccountday2() {
        return accountday2;
    }

    /**
    * 设置-账龄天数（以起保日期计算）
    * @paramType java.lang.Integer
    * @param accountday2 - 账龄天数（以起保日期计算）
     */
    public void setAccountday2(Integer accountday2) {
        this.accountday2 = accountday2;
    }

    /**
    * 获取-账龄天数（以起保日期计算）
    * @return accountday1
     */
    public Integer getAccountday1() {
        return accountday1;
    }

    /**
    * 设置-账龄天数（以起保日期计算）
    * @paramType java.lang.Integer
    * @param accountday1 - 账龄天数（以起保日期计算）
     */
    public void setAccountday1(Integer accountday1) {
        this.accountday1 = accountday1;
    }

    /**
    * 获取-账龄（以起保日期计算）
    * @return accountage1
     */
    public String getAccountage1() {
        return accountage1;
    }

    /**
    * 设置-账龄（以起保日期计算）
    * @paramType java.lang.String
    * @param accountage1 - 账龄（以起保日期计算）
     */
    public void setAccountage1(String accountage1) {
        this.accountage1 = accountage1;
    }

    /**
    * 获取-账龄（以起保日期计算）
    * @return accountage2
     */
    public String getAccountage2() {
        return accountage2;
    }

    /**
    * 设置-账龄（以起保日期计算）
    * @paramType java.lang.String
    * @param accountage2 - 账龄（以起保日期计算）
     */
    public void setAccountage2(String accountage2) {
        this.accountage2 = accountage2;
    }

    /**
    * 获取-唯一业务流水号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-唯一业务流水号
    * @paramType java.lang.String
    * @param custseq - 唯一业务流水号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-已到结算日余额
    * @return remainsDued
     */
    public BigDecimal getRemainsDued() {
        return remainsDued;
    }

    /**
    * 设置-已到结算日余额
    * @paramType java.math.BigDecimal
    * @param remainsDued - 已到结算日余额
     */
    public void setRemainsDued(BigDecimal remainsDued) {
        this.remainsDued = remainsDued;
    }

    /**
    * 获取-未到结算日余额
    * @return remainsUndued
     */
    public BigDecimal getRemainsUndued() {
        return remainsUndued;
    }

    /**
    * 设置-未到结算日余额
    * @paramType java.math.BigDecimal
    * @param remainsUndued - 未到结算日余额
     */
    public void setRemainsUndued(BigDecimal remainsUndued) {
        this.remainsUndued = remainsUndued;
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
    * 获取-业务渠道
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-业务渠道
    * @paramType java.lang.String
    * @param businesschannel - 业务渠道
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
    }

    /**
    * 获取-业务渠道名称
    * @return businesschannelname
     */
    public String getBusinesschannelname() {
        return businesschannelname;
    }

    /**
    * 设置-业务渠道名称
    * @paramType java.lang.String
    * @param businesschannelname - 业务渠道名称
     */
    public void setBusinesschannelname(String businesschannelname) {
        this.businesschannelname = businesschannelname;
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
    * 获取-操作人代码
    * @return optcode
     */
    public String getOptcode() {
        return optcode;
    }

    /**
    * 设置-操作人代码
    * @paramType java.lang.String
    * @param optcode - 操作人代码
     */
    public void setOptcode(String optcode) {
        this.optcode = optcode;
    }

    /**
    * 获取-操作人名称
    * @return optname
     */
    public String getOptname() {
        return optname;
    }

    /**
    * 设置-操作人名称
    * @paramType java.lang.String
    * @param optname - 操作人名称
     */
    public void setOptname(String optname) {
        this.optname = optname;
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
    * 获取-计划缴费日期
    * @return plandate
     */
    public Date getPlandate() {
        return plandate;
    }

    /**
    * 设置-计划缴费日期
    * @paramType java.util.Date
    * @param plandate - 计划缴费日期
     */
    public void setPlandate(Date plandate) {
        this.plandate = plandate;
    }

    /**
    * 获取-缴费序号
    * @return serialno
     */
    public Integer getSerialno() {
        return serialno;
    }

    /**
    * 设置-缴费序号
    * @paramType java.lang.Integer
    * @param serialno - 缴费序号
     */
    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }

    /**
    * 获取-财务险种
    * @return sapclassescode
     */
    public String getSapclassescode() {
        return sapclassescode;
    }

    /**
    * 设置-财务险种
    * @paramType java.lang.String
    * @param sapclassescode - 财务险种
     */
    public void setSapclassescode(String sapclassescode) {
        this.sapclassescode = sapclassescode;
    }

    /**
    * 获取-财务险类
    * @return sapclasseskind
     */
    public String getSapclasseskind() {
        return sapclasseskind;
    }

    /**
    * 设置-财务险类
    * @paramType java.lang.String
    * @param sapclasseskind - 财务险类
     */
    public void setSapclasseskind(String sapclasseskind) {
        this.sapclasseskind = sapclasseskind;
    }

    /**
    * 获取-子险
    * @return riskclassescode
     */
    public String getRiskclassescode() {
        return riskclassescode;
    }

    /**
    * 设置-子险
    * @paramType java.lang.String
    * @param riskclassescode - 子险
     */
    public void setRiskclassescode(String riskclassescode) {
        this.riskclassescode = riskclassescode;
    }
}