package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_reinsurancemirror_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmReinsurancemirrorTd {
    /**
     * 再保切片流水号
     */
    private Long listno;

    /**
     * 切片ID
     */
    private Long mirrorid;

    /**
     * 对应再保表的主键
     */
    private Long seqriinsurence;

    /**
     * 业务表主键
     */
    private Long seqricontracttab;

    /**
     * 业务类型
     */
    private String datatype;

    /**
     * 分公司
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
     * 账单期
     */
    private String tabperiod;

    /**
     * 合同号
     */
    private String contractcode;

    /**
     * 赔案号
     */
    private String claimno;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 机构代码
     */
    private String unitcode;

    /**
     * 机构名称
     */
    private String unitname;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 部门名称
     */
    private String departmentname;

    /**
     * 再保人代码
     */
    private String reinsurercode;

    /**
     * 再保人名称
     */
    private String reinsurername;

    /**
     * 险种代码
     */
    private String classescode;

    /**
     * 险种名称
     */
    private String classescodename;

    /**
     * 是否境外(0,境内,1,境外,)
     */
    private String ifoversea;

    /**
     * 核销状态
     */
    private String opstatus;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 发生额
     */
    private BigDecimal realamount;

    /**
     * 余额
     */
    private BigDecimal remains;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 版本号
     */
    private Long hibernateversion;

    /**
     * 账龄
     */
    private String accountage;

    /**
     * 账龄天数
     */
    private Integer accountday;

    /**
    * 获取-再保切片流水号
    * @return listno
     */
    public Long getListno() {
        return listno;
    }

    /**
    * 设置-再保切片流水号
    * @paramType java.lang.Long
    * @param listno - 再保切片流水号
     */
    public void setListno(Long listno) {
        this.listno = listno;
    }

    /**
    * 获取-切片ID
    * @return mirrorid
     */
    public Long getMirrorid() {
        return mirrorid;
    }

    /**
    * 设置-切片ID
    * @paramType java.lang.Long
    * @param mirrorid - 切片ID
     */
    public void setMirrorid(Long mirrorid) {
        this.mirrorid = mirrorid;
    }

    /**
    * 获取-对应再保表的主键
    * @return seqriinsurence
     */
    public Long getSeqriinsurence() {
        return seqriinsurence;
    }

    /**
    * 设置-对应再保表的主键
    * @paramType java.lang.Long
    * @param seqriinsurence - 对应再保表的主键
     */
    public void setSeqriinsurence(Long seqriinsurence) {
        this.seqriinsurence = seqriinsurence;
    }

    /**
    * 获取-业务表主键
    * @return seqricontracttab
     */
    public Long getSeqricontracttab() {
        return seqricontracttab;
    }

    /**
    * 设置-业务表主键
    * @paramType java.lang.Long
    * @param seqricontracttab - 业务表主键
     */
    public void setSeqricontracttab(Long seqricontracttab) {
        this.seqricontracttab = seqricontracttab;
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
    * 获取-合同号
    * @return contractcode
     */
    public String getContractcode() {
        return contractcode;
    }

    /**
    * 设置-合同号
    * @paramType java.lang.String
    * @param contractcode - 合同号
     */
    public void setContractcode(String contractcode) {
        this.contractcode = contractcode;
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
    * 获取-再保人名称
    * @return reinsurername
     */
    public String getReinsurername() {
        return reinsurername;
    }

    /**
    * 设置-再保人名称
    * @paramType java.lang.String
    * @param reinsurername - 再保人名称
     */
    public void setReinsurername(String reinsurername) {
        this.reinsurername = reinsurername;
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
    * 获取-是否境外(0,境内,1,境外,)
    * @return ifoversea
     */
    public String getIfoversea() {
        return ifoversea;
    }

    /**
    * 设置-是否境外(0,境内,1,境外,)
    * @paramType java.lang.String
    * @param ifoversea - 是否境外(0,境内,1,境外,)
     */
    public void setIfoversea(String ifoversea) {
        this.ifoversea = ifoversea;
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
    * 获取-发生额
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-发生额
    * @paramType java.math.BigDecimal
    * @param realamount - 发生额
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
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
    public Long getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Long
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Long hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-账龄
    * @return accountage
     */
    public String getAccountage() {
        return accountage;
    }

    /**
    * 设置-账龄
    * @paramType java.lang.String
    * @param accountage - 账龄
     */
    public void setAccountage(String accountage) {
        this.accountage = accountage;
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
}