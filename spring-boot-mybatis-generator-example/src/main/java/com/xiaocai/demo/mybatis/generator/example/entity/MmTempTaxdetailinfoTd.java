package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_temp_taxdetailinfo_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTempTaxdetailinfoTd {
    /**
     * 保单流水号
     */
    private BigDecimal seqpolicy;

    /**
     * id
     */
    private String id;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 承保接口主表序号
     */
    private String seqtax;

    /**
     * 车辆种类类别
     */
    private String vkclass;

    /**
     * 车辆种类
     */
    private String vehkind;

    /**
     * 车辆种类名称
     */
    private String vehname;

    /**
     * 车牌号码
     */
    private String brand;

    /**
     * 识别代码（车架号）
     */
    private String vehvin;

    /**
     * 车牌型号
     */
    private String vehtype;

    /**
     * 总质量
     */
    private BigDecimal grossweight;

    /**
     * 核定载质量
     */
    private BigDecimal loadcapacity;

    /**
     * 核定载客人数
     */
    private BigDecimal seat;

    /**
     * 整备质量
     */
    private BigDecimal curbweight;

    /**
     * 纳税人识别号
     */
    private String taxpayer;

    /**
     * 身份证号码
     */
    private String idNo;

    /**
     * 纳税人名称
     */
    private String payer;

    /**
     * 纳税人地址
     */
    private String payeraddress;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 终保日期
     */
    private Date enddate;

    /**
     * 补缴起期
     */
    private Date backdatefrom;

    /**
     * 补缴止期
     */
    private Date backdateto;

    /**
     * 滞纳金起期
     */
    private Date latedatefrom;

    /**
     * 滞纳金止期
     */
    private Date latedateto;

    /**
     * 当年应缴
     */
    private BigDecimal taxpayable;

    /**
     * 往年补缴
     */
    private BigDecimal backtax;

    /**
     * 滞纳金
     */
    private BigDecimal latefee;

    /**
     * 减免税额
     */
    private BigDecimal taxfree;

    /**
     * 合计税额
     */
    private BigDecimal taxtotal;

    /**
     * 完税凭证号/免税凭证号
     */
    private String taxcertno;

    /**
     * 开具税务机关/主管地税机关名称
     */
    private String taxoffice;

    /**
     * 缴税日期
     */
    private Date taxday;

    /**
     * 保险机构名称
     */
    private String insurer;

    /**
     * 保险机构组织代码
     */
    private String insurerno;

    /**
     * 转入状态
     */
    private String status;

    /**
     * 业务数据来源
     */
    private String datasource;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 发动机号
     */
    private String engine;

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
     * 金额（保单币种）
     */
    private BigDecimal baseamount;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 部门
     */
    private String departmentcode;

    /**
     * 起保日期
     */
    private Date qbrq;

    /**
     * 终保日期
     */
    private Date zhzhrq;

    /**
     * 申报单号
     */
    private String declareno;

    /**
     * 批次号
     */
    private BigDecimal listno;

    /**
     * 签单日期
     */
    private Date signdate;

    /**
    * 获取-保单流水号
    * @return seqpolicy
     */
    public BigDecimal getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-保单流水号
    * @paramType java.math.BigDecimal
    * @param seqpolicy - 保单流水号
     */
    public void setSeqpolicy(BigDecimal seqpolicy) {
        this.seqpolicy = seqpolicy;
    }

    /**
    * 获取-id
    * @return id
     */
    public String getId() {
        return id;
    }

    /**
    * 设置-id
    * @paramType java.lang.String
    * @param id - id
     */
    public void setId(String id) {
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
    * 获取-承保接口主表序号
    * @return seqtax
     */
    public String getSeqtax() {
        return seqtax;
    }

    /**
    * 设置-承保接口主表序号
    * @paramType java.lang.String
    * @param seqtax - 承保接口主表序号
     */
    public void setSeqtax(String seqtax) {
        this.seqtax = seqtax;
    }

    /**
    * 获取-车辆种类类别
    * @return vkclass
     */
    public String getVkclass() {
        return vkclass;
    }

    /**
    * 设置-车辆种类类别
    * @paramType java.lang.String
    * @param vkclass - 车辆种类类别
     */
    public void setVkclass(String vkclass) {
        this.vkclass = vkclass;
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
    * 获取-车辆种类名称
    * @return vehname
     */
    public String getVehname() {
        return vehname;
    }

    /**
    * 设置-车辆种类名称
    * @paramType java.lang.String
    * @param vehname - 车辆种类名称
     */
    public void setVehname(String vehname) {
        this.vehname = vehname;
    }

    /**
    * 获取-车牌号码
    * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
    * 设置-车牌号码
    * @paramType java.lang.String
    * @param brand - 车牌号码
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
    * 获取-识别代码（车架号）
    * @return vehvin
     */
    public String getVehvin() {
        return vehvin;
    }

    /**
    * 设置-识别代码（车架号）
    * @paramType java.lang.String
    * @param vehvin - 识别代码（车架号）
     */
    public void setVehvin(String vehvin) {
        this.vehvin = vehvin;
    }

    /**
    * 获取-车牌型号
    * @return vehtype
     */
    public String getVehtype() {
        return vehtype;
    }

    /**
    * 设置-车牌型号
    * @paramType java.lang.String
    * @param vehtype - 车牌型号
     */
    public void setVehtype(String vehtype) {
        this.vehtype = vehtype;
    }

    /**
    * 获取-总质量
    * @return grossweight
     */
    public BigDecimal getGrossweight() {
        return grossweight;
    }

    /**
    * 设置-总质量
    * @paramType java.math.BigDecimal
    * @param grossweight - 总质量
     */
    public void setGrossweight(BigDecimal grossweight) {
        this.grossweight = grossweight;
    }

    /**
    * 获取-核定载质量
    * @return loadcapacity
     */
    public BigDecimal getLoadcapacity() {
        return loadcapacity;
    }

    /**
    * 设置-核定载质量
    * @paramType java.math.BigDecimal
    * @param loadcapacity - 核定载质量
     */
    public void setLoadcapacity(BigDecimal loadcapacity) {
        this.loadcapacity = loadcapacity;
    }

    /**
    * 获取-核定载客人数
    * @return seat
     */
    public BigDecimal getSeat() {
        return seat;
    }

    /**
    * 设置-核定载客人数
    * @paramType java.math.BigDecimal
    * @param seat - 核定载客人数
     */
    public void setSeat(BigDecimal seat) {
        this.seat = seat;
    }

    /**
    * 获取-整备质量
    * @return curbweight
     */
    public BigDecimal getCurbweight() {
        return curbweight;
    }

    /**
    * 设置-整备质量
    * @paramType java.math.BigDecimal
    * @param curbweight - 整备质量
     */
    public void setCurbweight(BigDecimal curbweight) {
        this.curbweight = curbweight;
    }

    /**
    * 获取-纳税人识别号
    * @return taxpayer
     */
    public String getTaxpayer() {
        return taxpayer;
    }

    /**
    * 设置-纳税人识别号
    * @paramType java.lang.String
    * @param taxpayer - 纳税人识别号
     */
    public void setTaxpayer(String taxpayer) {
        this.taxpayer = taxpayer;
    }

    /**
    * 获取-身份证号码
    * @return idNo
     */
    public String getIdNo() {
        return idNo;
    }

    /**
    * 设置-身份证号码
    * @paramType java.lang.String
    * @param idNo - 身份证号码
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
    * 获取-纳税人名称
    * @return payer
     */
    public String getPayer() {
        return payer;
    }

    /**
    * 设置-纳税人名称
    * @paramType java.lang.String
    * @param payer - 纳税人名称
     */
    public void setPayer(String payer) {
        this.payer = payer;
    }

    /**
    * 获取-纳税人地址
    * @return payeraddress
     */
    public String getPayeraddress() {
        return payeraddress;
    }

    /**
    * 设置-纳税人地址
    * @paramType java.lang.String
    * @param payeraddress - 纳税人地址
     */
    public void setPayeraddress(String payeraddress) {
        this.payeraddress = payeraddress;
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
    * 获取-补缴起期
    * @return backdatefrom
     */
    public Date getBackdatefrom() {
        return backdatefrom;
    }

    /**
    * 设置-补缴起期
    * @paramType java.util.Date
    * @param backdatefrom - 补缴起期
     */
    public void setBackdatefrom(Date backdatefrom) {
        this.backdatefrom = backdatefrom;
    }

    /**
    * 获取-补缴止期
    * @return backdateto
     */
    public Date getBackdateto() {
        return backdateto;
    }

    /**
    * 设置-补缴止期
    * @paramType java.util.Date
    * @param backdateto - 补缴止期
     */
    public void setBackdateto(Date backdateto) {
        this.backdateto = backdateto;
    }

    /**
    * 获取-滞纳金起期
    * @return latedatefrom
     */
    public Date getLatedatefrom() {
        return latedatefrom;
    }

    /**
    * 设置-滞纳金起期
    * @paramType java.util.Date
    * @param latedatefrom - 滞纳金起期
     */
    public void setLatedatefrom(Date latedatefrom) {
        this.latedatefrom = latedatefrom;
    }

    /**
    * 获取-滞纳金止期
    * @return latedateto
     */
    public Date getLatedateto() {
        return latedateto;
    }

    /**
    * 设置-滞纳金止期
    * @paramType java.util.Date
    * @param latedateto - 滞纳金止期
     */
    public void setLatedateto(Date latedateto) {
        this.latedateto = latedateto;
    }

    /**
    * 获取-当年应缴
    * @return taxpayable
     */
    public BigDecimal getTaxpayable() {
        return taxpayable;
    }

    /**
    * 设置-当年应缴
    * @paramType java.math.BigDecimal
    * @param taxpayable - 当年应缴
     */
    public void setTaxpayable(BigDecimal taxpayable) {
        this.taxpayable = taxpayable;
    }

    /**
    * 获取-往年补缴
    * @return backtax
     */
    public BigDecimal getBacktax() {
        return backtax;
    }

    /**
    * 设置-往年补缴
    * @paramType java.math.BigDecimal
    * @param backtax - 往年补缴
     */
    public void setBacktax(BigDecimal backtax) {
        this.backtax = backtax;
    }

    /**
    * 获取-滞纳金
    * @return latefee
     */
    public BigDecimal getLatefee() {
        return latefee;
    }

    /**
    * 设置-滞纳金
    * @paramType java.math.BigDecimal
    * @param latefee - 滞纳金
     */
    public void setLatefee(BigDecimal latefee) {
        this.latefee = latefee;
    }

    /**
    * 获取-减免税额
    * @return taxfree
     */
    public BigDecimal getTaxfree() {
        return taxfree;
    }

    /**
    * 设置-减免税额
    * @paramType java.math.BigDecimal
    * @param taxfree - 减免税额
     */
    public void setTaxfree(BigDecimal taxfree) {
        this.taxfree = taxfree;
    }

    /**
    * 获取-合计税额
    * @return taxtotal
     */
    public BigDecimal getTaxtotal() {
        return taxtotal;
    }

    /**
    * 设置-合计税额
    * @paramType java.math.BigDecimal
    * @param taxtotal - 合计税额
     */
    public void setTaxtotal(BigDecimal taxtotal) {
        this.taxtotal = taxtotal;
    }

    /**
    * 获取-完税凭证号/免税凭证号
    * @return taxcertno
     */
    public String getTaxcertno() {
        return taxcertno;
    }

    /**
    * 设置-完税凭证号/免税凭证号
    * @paramType java.lang.String
    * @param taxcertno - 完税凭证号/免税凭证号
     */
    public void setTaxcertno(String taxcertno) {
        this.taxcertno = taxcertno;
    }

    /**
    * 获取-开具税务机关/主管地税机关名称
    * @return taxoffice
     */
    public String getTaxoffice() {
        return taxoffice;
    }

    /**
    * 设置-开具税务机关/主管地税机关名称
    * @paramType java.lang.String
    * @param taxoffice - 开具税务机关/主管地税机关名称
     */
    public void setTaxoffice(String taxoffice) {
        this.taxoffice = taxoffice;
    }

    /**
    * 获取-缴税日期
    * @return taxday
     */
    public Date getTaxday() {
        return taxday;
    }

    /**
    * 设置-缴税日期
    * @paramType java.util.Date
    * @param taxday - 缴税日期
     */
    public void setTaxday(Date taxday) {
        this.taxday = taxday;
    }

    /**
    * 获取-保险机构名称
    * @return insurer
     */
    public String getInsurer() {
        return insurer;
    }

    /**
    * 设置-保险机构名称
    * @paramType java.lang.String
    * @param insurer - 保险机构名称
     */
    public void setInsurer(String insurer) {
        this.insurer = insurer;
    }

    /**
    * 获取-保险机构组织代码
    * @return insurerno
     */
    public String getInsurerno() {
        return insurerno;
    }

    /**
    * 设置-保险机构组织代码
    * @paramType java.lang.String
    * @param insurerno - 保险机构组织代码
     */
    public void setInsurerno(String insurerno) {
        this.insurerno = insurerno;
    }

    /**
    * 获取-转入状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-转入状态
    * @paramType java.lang.String
    * @param status - 转入状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-业务数据来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-业务数据来源
    * @paramType java.lang.String
    * @param datasource - 业务数据来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
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
    * 获取-发动机号
    * @return engine
     */
    public String getEngine() {
        return engine;
    }

    /**
    * 设置-发动机号
    * @paramType java.lang.String
    * @param engine - 发动机号
     */
    public void setEngine(String engine) {
        this.engine = engine;
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
    * 获取-金额（保单币种）
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param baseamount - 金额（保单币种）
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
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
    * 获取-起保日期
    * @return qbrq
     */
    public Date getQbrq() {
        return qbrq;
    }

    /**
    * 设置-起保日期
    * @paramType java.util.Date
    * @param qbrq - 起保日期
     */
    public void setQbrq(Date qbrq) {
        this.qbrq = qbrq;
    }

    /**
    * 获取-终保日期
    * @return zhzhrq
     */
    public Date getZhzhrq() {
        return zhzhrq;
    }

    /**
    * 设置-终保日期
    * @paramType java.util.Date
    * @param zhzhrq - 终保日期
     */
    public void setZhzhrq(Date zhzhrq) {
        this.zhzhrq = zhzhrq;
    }

    /**
    * 获取-申报单号
    * @return declareno
     */
    public String getDeclareno() {
        return declareno;
    }

    /**
    * 设置-申报单号
    * @paramType java.lang.String
    * @param declareno - 申报单号
     */
    public void setDeclareno(String declareno) {
        this.declareno = declareno;
    }

    /**
    * 获取-批次号
    * @return listno
     */
    public BigDecimal getListno() {
        return listno;
    }

    /**
    * 设置-批次号
    * @paramType java.math.BigDecimal
    * @param listno - 批次号
     */
    public void setListno(BigDecimal listno) {
        this.listno = listno;
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
}