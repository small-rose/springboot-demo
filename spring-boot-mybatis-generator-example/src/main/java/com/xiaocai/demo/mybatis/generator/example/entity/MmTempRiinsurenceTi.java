package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_temp_riinsurence_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTempRiinsurenceTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 主表主键
     */
    private Long seqricontracttab;

    /**
     * 类型
     */
    private String datatype;

    /**
     * 账单期
     */
    private String tabperiod;

    /**
     * 合同代码
     */
    private String contractcode;

    /**
     * 合同层次
     */
    private BigDecimal layer;

    /**
     * 类别
     */
    private String qstype;

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
     * listno
     */
    private BigDecimal listno;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 再保人代码
     */
    private String reinsurercode;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 机构
     */
    private String unitcode;

    /**
     * 部门
     */
    private String departmentcode;

    /**
     * 险种
     */
    private String classescode;

    /**
     * 分保类型,1 法定 2 合同 3 超赔(废弃) 4 临分
     */
    private String contracttype;

    /**
     * 实收实付金额
     */
    private BigDecimal ripremium;

    /**
     * 已收金额
     */
    private BigDecimal prmrsvretained;

    /**
     * 代收
     */
    private BigDecimal rsvinterest;

    /**
     * 现金流
     */
    private BigDecimal cashcall;

    /**
     * PORTFOLIOPRM
     */
    private BigDecimal portfolioprm;

    /**
     * PORTFOLIOLOSS
     */
    private BigDecimal portfolioloss;

    /**
     * PRMRSVRELEASE
     */
    private BigDecimal prmrsvrelease;

    /**
     * FACTORAGE
     */
    private BigDecimal factorage;

    /**
     * 税金
     */
    private BigDecimal tax;

    /**
     * PROFITFAC
     */
    private BigDecimal profitfac;

    /**
     * LOSSES
     */
    private BigDecimal losses;

    /**
     * OTHERFEE
     */
    private BigDecimal otherfee;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 实收付金额
     */
    private BigDecimal realamount;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 核销状态
     */
    private String opstatus;

    /**
     * 落地状态
     */
    private String status;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 来源
     */
    private String source;

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
    * 获取-主表主键
    * @return seqricontracttab
     */
    public Long getSeqricontracttab() {
        return seqricontracttab;
    }

    /**
    * 设置-主表主键
    * @paramType java.lang.Long
    * @param seqricontracttab - 主表主键
     */
    public void setSeqricontracttab(Long seqricontracttab) {
        this.seqricontracttab = seqricontracttab;
    }

    /**
    * 获取-类型
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-类型
    * @paramType java.lang.String
    * @param datatype - 类型
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-账单期
    * @return tabperiod
     */
    public String getTabperiod() {
        return tabperiod;
    }

    /**
    * 设置-账单期
    * @paramType java.lang.String
    * @param tabperiod - 账单期
     */
    public void setTabperiod(String tabperiod) {
        this.tabperiod = tabperiod;
    }

    /**
    * 获取-合同代码
    * @return contractcode
     */
    public String getContractcode() {
        return contractcode;
    }

    /**
    * 设置-合同代码
    * @paramType java.lang.String
    * @param contractcode - 合同代码
     */
    public void setContractcode(String contractcode) {
        this.contractcode = contractcode;
    }

    /**
    * 获取-合同层次
    * @return layer
     */
    public BigDecimal getLayer() {
        return layer;
    }

    /**
    * 设置-合同层次
    * @paramType java.math.BigDecimal
    * @param layer - 合同层次
     */
    public void setLayer(BigDecimal layer) {
        this.layer = layer;
    }

    /**
    * 获取-类别
    * @return qstype
     */
    public String getQstype() {
        return qstype;
    }

    /**
    * 设置-类别
    * @paramType java.lang.String
    * @param qstype - 类别
     */
    public void setQstype(String qstype) {
        this.qstype = qstype;
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
    * 获取-listno
    * @return listno
     */
    public BigDecimal getListno() {
        return listno;
    }

    /**
    * 设置-listno
    * @paramType java.math.BigDecimal
    * @param listno - listno
     */
    public void setListno(BigDecimal listno) {
        this.listno = listno;
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
    * 获取-再保人代码
    * @return reinsurercode
     */
    public String getReinsurercode() {
        return reinsurercode;
    }

    /**
    * 设置-再保人代码
    * @paramType java.lang.String
    * @param reinsurercode - 再保人代码
     */
    public void setReinsurercode(String reinsurercode) {
        this.reinsurercode = reinsurercode;
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
    * 获取-机构
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-机构
    * @paramType java.lang.String
    * @param unitcode - 机构
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
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
    * 获取-分保类型,1 法定 2 合同 3 超赔(废弃) 4 临分
    * @return contracttype
     */
    public String getContracttype() {
        return contracttype;
    }

    /**
    * 设置-分保类型,1 法定 2 合同 3 超赔(废弃) 4 临分
    * @paramType java.lang.String
    * @param contracttype - 分保类型,1 法定 2 合同 3 超赔(废弃) 4 临分
     */
    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }

    /**
    * 获取-实收实付金额
    * @return ripremium
     */
    public BigDecimal getRipremium() {
        return ripremium;
    }

    /**
    * 设置-实收实付金额
    * @paramType java.math.BigDecimal
    * @param ripremium - 实收实付金额
     */
    public void setRipremium(BigDecimal ripremium) {
        this.ripremium = ripremium;
    }

    /**
    * 获取-已收金额
    * @return prmrsvretained
     */
    public BigDecimal getPrmrsvretained() {
        return prmrsvretained;
    }

    /**
    * 设置-已收金额
    * @paramType java.math.BigDecimal
    * @param prmrsvretained - 已收金额
     */
    public void setPrmrsvretained(BigDecimal prmrsvretained) {
        this.prmrsvretained = prmrsvretained;
    }

    /**
    * 获取-代收
    * @return rsvinterest
     */
    public BigDecimal getRsvinterest() {
        return rsvinterest;
    }

    /**
    * 设置-代收
    * @paramType java.math.BigDecimal
    * @param rsvinterest - 代收
     */
    public void setRsvinterest(BigDecimal rsvinterest) {
        this.rsvinterest = rsvinterest;
    }

    /**
    * 获取-现金流
    * @return cashcall
     */
    public BigDecimal getCashcall() {
        return cashcall;
    }

    /**
    * 设置-现金流
    * @paramType java.math.BigDecimal
    * @param cashcall - 现金流
     */
    public void setCashcall(BigDecimal cashcall) {
        this.cashcall = cashcall;
    }

    /**
    * 获取-PORTFOLIOPRM
    * @return portfolioprm
     */
    public BigDecimal getPortfolioprm() {
        return portfolioprm;
    }

    /**
    * 设置-PORTFOLIOPRM
    * @paramType java.math.BigDecimal
    * @param portfolioprm - PORTFOLIOPRM
     */
    public void setPortfolioprm(BigDecimal portfolioprm) {
        this.portfolioprm = portfolioprm;
    }

    /**
    * 获取-PORTFOLIOLOSS
    * @return portfolioloss
     */
    public BigDecimal getPortfolioloss() {
        return portfolioloss;
    }

    /**
    * 设置-PORTFOLIOLOSS
    * @paramType java.math.BigDecimal
    * @param portfolioloss - PORTFOLIOLOSS
     */
    public void setPortfolioloss(BigDecimal portfolioloss) {
        this.portfolioloss = portfolioloss;
    }

    /**
    * 获取-PRMRSVRELEASE
    * @return prmrsvrelease
     */
    public BigDecimal getPrmrsvrelease() {
        return prmrsvrelease;
    }

    /**
    * 设置-PRMRSVRELEASE
    * @paramType java.math.BigDecimal
    * @param prmrsvrelease - PRMRSVRELEASE
     */
    public void setPrmrsvrelease(BigDecimal prmrsvrelease) {
        this.prmrsvrelease = prmrsvrelease;
    }

    /**
    * 获取-FACTORAGE
    * @return factorage
     */
    public BigDecimal getFactorage() {
        return factorage;
    }

    /**
    * 设置-FACTORAGE
    * @paramType java.math.BigDecimal
    * @param factorage - FACTORAGE
     */
    public void setFactorage(BigDecimal factorage) {
        this.factorage = factorage;
    }

    /**
    * 获取-税金
    * @return tax
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
    * 设置-税金
    * @paramType java.math.BigDecimal
    * @param tax - 税金
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    /**
    * 获取-PROFITFAC
    * @return profitfac
     */
    public BigDecimal getProfitfac() {
        return profitfac;
    }

    /**
    * 设置-PROFITFAC
    * @paramType java.math.BigDecimal
    * @param profitfac - PROFITFAC
     */
    public void setProfitfac(BigDecimal profitfac) {
        this.profitfac = profitfac;
    }

    /**
    * 获取-LOSSES
    * @return losses
     */
    public BigDecimal getLosses() {
        return losses;
    }

    /**
    * 设置-LOSSES
    * @paramType java.math.BigDecimal
    * @param losses - LOSSES
     */
    public void setLosses(BigDecimal losses) {
        this.losses = losses;
    }

    /**
    * 获取-OTHERFEE
    * @return otherfee
     */
    public BigDecimal getOtherfee() {
        return otherfee;
    }

    /**
    * 设置-OTHERFEE
    * @paramType java.math.BigDecimal
    * @param otherfee - OTHERFEE
     */
    public void setOtherfee(BigDecimal otherfee) {
        this.otherfee = otherfee;
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
    * 获取-实收付金额
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-实收付金额
    * @paramType java.math.BigDecimal
    * @param realamount - 实收付金额
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
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
    * 获取-落地状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-落地状态
    * @paramType java.lang.String
    * @param status - 落地状态
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-来源
    * @return source
     */
    public String getSource() {
        return source;
    }

    /**
    * 设置-来源
    * @paramType java.lang.String
    * @param source - 来源
     */
    public void setSource(String source) {
        this.source = source;
    }
}