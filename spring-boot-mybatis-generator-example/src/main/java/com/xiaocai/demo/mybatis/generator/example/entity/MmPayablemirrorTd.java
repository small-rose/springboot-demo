package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_payablemirror_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPayablemirrorTd {
    /**
     * 主键
     */
    private Long listno;

    /**
     * 父单据id
     */
    private Long mirrorid;

    /**
     * 数据类型
     */
    private String datatype;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 业务部门代码
     */
    private String departmentcode;

    /**
     * 待付款流水号
     */
    private String paymoneyno;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 已处理金额
     */
    private BigDecimal usedamount;

    /**
     * 余额
     */
    private BigDecimal remains;

    /**
     * 客户名称
     */
    private String customername;

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
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 财务机构
     */
    private String unitcode;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 险种名称
     */
    private String classescodename;

    /**
     * 财务机构名称
     */
    private String unitname;

    /**
     * 部门名称
     */
    private String departmentname;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 终保日期
     */
    private Date enddate;

    /**
     * 手工修改数据说明(用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据)
     */
    private String modifydesc;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 审核日期
     */
    private Date auditdate;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 经办人代码
     */
    private String transactorcode;

    /**
     * 代理人代码
     */
    private String agentcode;

    /**
     * 账龄区间
     */
    private String accountage;

    /**
     * 代理人代码
     */
    private String agentvcode;

    /**
     * 账龄天数
     */
    private Integer accountday;

    /**
     * 理算号
     */
    private String batchno;

    /**
     * 立案号
     */
    private String caseno;

    /**
     * 结算单号
     */
    private String handoverno;

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
    * 获取-数据类型
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-数据类型
    * @paramType java.lang.String
    * @param datatype - 数据类型
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
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
    * 获取-待付款流水号
    * @return paymoneyno
     */
    public String getPaymoneyno() {
        return paymoneyno;
    }

    /**
    * 设置-待付款流水号
    * @paramType java.lang.String
    * @param paymoneyno - 待付款流水号
     */
    public void setPaymoneyno(String paymoneyno) {
        this.paymoneyno = paymoneyno;
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
    * 获取-财务机构名称
    * @return unitname
     */
    public String getUnitname() {
        return unitname;
    }

    /**
    * 设置-财务机构名称
    * @paramType java.lang.String
    * @param unitname - 财务机构名称
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
    * 获取-审核日期
    * @return auditdate
     */
    public Date getAuditdate() {
        return auditdate;
    }

    /**
    * 设置-审核日期
    * @paramType java.util.Date
    * @param auditdate - 审核日期
     */
    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
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
    * 获取-代理人代码
    * @return agentcode
     */
    public String getAgentcode() {
        return agentcode;
    }

    /**
    * 设置-代理人代码
    * @paramType java.lang.String
    * @param agentcode - 代理人代码
     */
    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    /**
    * 获取-账龄区间
    * @return accountage
     */
    public String getAccountage() {
        return accountage;
    }

    /**
    * 设置-账龄区间
    * @paramType java.lang.String
    * @param accountage - 账龄区间
     */
    public void setAccountage(String accountage) {
        this.accountage = accountage;
    }

    /**
    * 获取-代理人代码
    * @return agentvcode
     */
    public String getAgentvcode() {
        return agentvcode;
    }

    /**
    * 设置-代理人代码
    * @paramType java.lang.String
    * @param agentvcode - 代理人代码
     */
    public void setAgentvcode(String agentvcode) {
        this.agentvcode = agentvcode;
    }

    /**
    * 获取-账龄天数
    * @return accountday
     */
    public Integer getAccountday() {
        return accountday;
    }

    /**
    * 设置-账龄天数
    * @paramType java.lang.Integer
    * @param accountday - 账龄天数
     */
    public void setAccountday(Integer accountday) {
        this.accountday = accountday;
    }

    /**
    * 获取-理算号
    * @return batchno
     */
    public String getBatchno() {
        return batchno;
    }

    /**
    * 设置-理算号
    * @paramType java.lang.String
    * @param batchno - 理算号
     */
    public void setBatchno(String batchno) {
        this.batchno = batchno;
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
    * 获取-结算单号
    * @return handoverno
     */
    public String getHandoverno() {
        return handoverno;
    }

    /**
    * 设置-结算单号
    * @paramType java.lang.String
    * @param handoverno - 结算单号
     */
    public void setHandoverno(String handoverno) {
        this.handoverno = handoverno;
    }
}