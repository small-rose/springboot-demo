package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_taxdetail_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxdetailTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 承保接口主表序号
     */
    private Long seqtax;

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
     * 申报单号
     */
    private String declareno;

    /**
     * 车辆种类类别/机动车类型
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
     * 整备质量/自重吨位
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
     * 纳税人名称/车辆所有(管理)人
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
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 发动机号
     */
    private String engine;

    /**
     * 上期缴纳交强险截止日期
     */
    private Date lastpaydate;

    /**
     * 使用性质
     */
    private String useproperty;

    /**
     * 计税单位
     */
    private String unit;

    /**
     * 计税数量
     */
    private String carnumber;

    /**
     * 车籍地
     */
    private String vehaddress;

    /**
     * 燃料种类代码
     */
    private String fueltype;

    /**
     * 燃料种类名称
     */
    private String fuelname;

    /**
     * 缴税类型
     */
    private String taxtype;

    /**
     * 登记日期
     */
    private Date registerdate;

    /**
     * 税目编码
     */
    private String vehiclestyle;

    /**
     * 税目名称
     */
    private String vehiclestylename;

    /**
     * 减免电子序号/减免凭证号
     */
    private String derateno;

    /**
     * 减免类型代码
     */
    private String deductionduecode;

    /**
     * 减免类型名称
     */
    private String deductionduename;

    /**
     * 厂牌型号
     */
    private String makermodel;

    /**
     * 签单日期
     */
    private Date signdate;

    /**
     * 客户类型
     */
    private String customertype;

    /**
     * 证件类型
     */
    private String certificatetype;

    /**
     * 证件类型名称
     */
    private String certificatetypename;

    /**
     * 年税额标准
     */
    private BigDecimal yeartaxstandard;

    /**
     * 滞纳天数
     */
    private BigDecimal lateday;

    /**
     * 保单填开人员（录单员）
     */
    private String inputorid;

    /**
     * 课税数量（车船数量、吨数、长度）
     */
    private BigDecimal taxnum;

    /**
     * 免征税额
     */
    private BigDecimal freequalitytax;

    /**
     * 是否外地
     */
    private String isnonlocal;

    /**
     * 居住地址
     */
    private String homeaddress;

    /**
     * 邮政编码
     */
    private String zip;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 国籍
     */
    private String national;

    /**
     * 车辆落户地址
     */
    private String settleaddress;

    /**
     * 税款所属期
     */
    private String taxterm;

    /**
     * 微机编码
     */
    private String pccode;

    /**
     * 转籍时间
     */
    private Date changenativedate;

    /**
     * 原车牌照号
     */
    private String oldlicenseno;

    /**
     * 引擎排量
     */
    private BigDecimal enginecapacity;

    /**
     * 税收减免性质代码
     */
    private String reductionnaturecode;

    /**
     * 税收减免性质名称
     */
    private String reductionnaturename;

    /**
     * 减免税证明编号2
     */
    private String derateno2;

    /**
     * 税收减免性质代码2
     */
    private String reductionnaturecode2;

    /**
     * 税收减免性质名称2
     */
    private String reductionnaturename2;

    /**
     * 税款所属年度
     */
    private String taxyear;

    /**
     * 年应缴月份
     */
    private String taxmonth;

    /**
     * 本年减免税额2
     */
    private BigDecimal taxfree2;

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
    * 获取-承保接口主表序号
    * @return seqtax
     */
    public Long getSeqtax() {
        return seqtax;
    }

    /**
    * 设置-承保接口主表序号
    * @paramType java.lang.Long
    * @param seqtax - 承保接口主表序号
     */
    public void setSeqtax(Long seqtax) {
        this.seqtax = seqtax;
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
    * 获取-车辆种类类别/机动车类型
    * @return vkclass
     */
    public String getVkclass() {
        return vkclass;
    }

    /**
    * 设置-车辆种类类别/机动车类型
    * @paramType java.lang.String
    * @param vkclass - 车辆种类类别/机动车类型
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
    * 获取-整备质量/自重吨位
    * @return curbweight
     */
    public BigDecimal getCurbweight() {
        return curbweight;
    }

    /**
    * 设置-整备质量/自重吨位
    * @paramType java.math.BigDecimal
    * @param curbweight - 整备质量/自重吨位
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
    * 获取-纳税人名称/车辆所有(管理)人
    * @return payer
     */
    public String getPayer() {
        return payer;
    }

    /**
    * 设置-纳税人名称/车辆所有(管理)人
    * @paramType java.lang.String
    * @param payer - 纳税人名称/车辆所有(管理)人
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
    * 获取-上期缴纳交强险截止日期
    * @return lastpaydate
     */
    public Date getLastpaydate() {
        return lastpaydate;
    }

    /**
    * 设置-上期缴纳交强险截止日期
    * @paramType java.util.Date
    * @param lastpaydate - 上期缴纳交强险截止日期
     */
    public void setLastpaydate(Date lastpaydate) {
        this.lastpaydate = lastpaydate;
    }

    /**
    * 获取-使用性质
    * @return useproperty
     */
    public String getUseproperty() {
        return useproperty;
    }

    /**
    * 设置-使用性质
    * @paramType java.lang.String
    * @param useproperty - 使用性质
     */
    public void setUseproperty(String useproperty) {
        this.useproperty = useproperty;
    }

    /**
    * 获取-计税单位
    * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
    * 设置-计税单位
    * @paramType java.lang.String
    * @param unit - 计税单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
    * 获取-计税数量
    * @return carnumber
     */
    public String getCarnumber() {
        return carnumber;
    }

    /**
    * 设置-计税数量
    * @paramType java.lang.String
    * @param carnumber - 计税数量
     */
    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    /**
    * 获取-车籍地
    * @return vehaddress
     */
    public String getVehaddress() {
        return vehaddress;
    }

    /**
    * 设置-车籍地
    * @paramType java.lang.String
    * @param vehaddress - 车籍地
     */
    public void setVehaddress(String vehaddress) {
        this.vehaddress = vehaddress;
    }

    /**
    * 获取-燃料种类代码
    * @return fueltype
     */
    public String getFueltype() {
        return fueltype;
    }

    /**
    * 设置-燃料种类代码
    * @paramType java.lang.String
    * @param fueltype - 燃料种类代码
     */
    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    /**
    * 获取-燃料种类名称
    * @return fuelname
     */
    public String getFuelname() {
        return fuelname;
    }

    /**
    * 设置-燃料种类名称
    * @paramType java.lang.String
    * @param fuelname - 燃料种类名称
     */
    public void setFuelname(String fuelname) {
        this.fuelname = fuelname;
    }

    /**
    * 获取-缴税类型
    * @return taxtype
     */
    public String getTaxtype() {
        return taxtype;
    }

    /**
    * 设置-缴税类型
    * @paramType java.lang.String
    * @param taxtype - 缴税类型
     */
    public void setTaxtype(String taxtype) {
        this.taxtype = taxtype;
    }

    /**
    * 获取-登记日期
    * @return registerdate
     */
    public Date getRegisterdate() {
        return registerdate;
    }

    /**
    * 设置-登记日期
    * @paramType java.util.Date
    * @param registerdate - 登记日期
     */
    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    /**
    * 获取-税目编码
    * @return vehiclestyle
     */
    public String getVehiclestyle() {
        return vehiclestyle;
    }

    /**
    * 设置-税目编码
    * @paramType java.lang.String
    * @param vehiclestyle - 税目编码
     */
    public void setVehiclestyle(String vehiclestyle) {
        this.vehiclestyle = vehiclestyle;
    }

    /**
    * 获取-税目名称
    * @return vehiclestylename
     */
    public String getVehiclestylename() {
        return vehiclestylename;
    }

    /**
    * 设置-税目名称
    * @paramType java.lang.String
    * @param vehiclestylename - 税目名称
     */
    public void setVehiclestylename(String vehiclestylename) {
        this.vehiclestylename = vehiclestylename;
    }

    /**
    * 获取-减免电子序号/减免凭证号
    * @return derateno
     */
    public String getDerateno() {
        return derateno;
    }

    /**
    * 设置-减免电子序号/减免凭证号
    * @paramType java.lang.String
    * @param derateno - 减免电子序号/减免凭证号
     */
    public void setDerateno(String derateno) {
        this.derateno = derateno;
    }

    /**
    * 获取-减免类型代码
    * @return deductionduecode
     */
    public String getDeductionduecode() {
        return deductionduecode;
    }

    /**
    * 设置-减免类型代码
    * @paramType java.lang.String
    * @param deductionduecode - 减免类型代码
     */
    public void setDeductionduecode(String deductionduecode) {
        this.deductionduecode = deductionduecode;
    }

    /**
    * 获取-减免类型名称
    * @return deductionduename
     */
    public String getDeductionduename() {
        return deductionduename;
    }

    /**
    * 设置-减免类型名称
    * @paramType java.lang.String
    * @param deductionduename - 减免类型名称
     */
    public void setDeductionduename(String deductionduename) {
        this.deductionduename = deductionduename;
    }

    /**
    * 获取-厂牌型号
    * @return makermodel
     */
    public String getMakermodel() {
        return makermodel;
    }

    /**
    * 设置-厂牌型号
    * @paramType java.lang.String
    * @param makermodel - 厂牌型号
     */
    public void setMakermodel(String makermodel) {
        this.makermodel = makermodel;
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
    * 获取-客户类型
    * @return customertype
     */
    public String getCustomertype() {
        return customertype;
    }

    /**
    * 设置-客户类型
    * @paramType java.lang.String
    * @param customertype - 客户类型
     */
    public void setCustomertype(String customertype) {
        this.customertype = customertype;
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
    * 获取-证件类型名称
    * @return certificatetypename
     */
    public String getCertificatetypename() {
        return certificatetypename;
    }

    /**
    * 设置-证件类型名称
    * @paramType java.lang.String
    * @param certificatetypename - 证件类型名称
     */
    public void setCertificatetypename(String certificatetypename) {
        this.certificatetypename = certificatetypename;
    }

    /**
    * 获取-年税额标准
    * @return yeartaxstandard
     */
    public BigDecimal getYeartaxstandard() {
        return yeartaxstandard;
    }

    /**
    * 设置-年税额标准
    * @paramType java.math.BigDecimal
    * @param yeartaxstandard - 年税额标准
     */
    public void setYeartaxstandard(BigDecimal yeartaxstandard) {
        this.yeartaxstandard = yeartaxstandard;
    }

    /**
    * 获取-滞纳天数
    * @return lateday
     */
    public BigDecimal getLateday() {
        return lateday;
    }

    /**
    * 设置-滞纳天数
    * @paramType java.math.BigDecimal
    * @param lateday - 滞纳天数
     */
    public void setLateday(BigDecimal lateday) {
        this.lateday = lateday;
    }

    /**
    * 获取-保单填开人员（录单员）
    * @return inputorid
     */
    public String getInputorid() {
        return inputorid;
    }

    /**
    * 设置-保单填开人员（录单员）
    * @paramType java.lang.String
    * @param inputorid - 保单填开人员（录单员）
     */
    public void setInputorid(String inputorid) {
        this.inputorid = inputorid;
    }

    /**
    * 获取-课税数量（车船数量、吨数、长度）
    * @return taxnum
     */
    public BigDecimal getTaxnum() {
        return taxnum;
    }

    /**
    * 设置-课税数量（车船数量、吨数、长度）
    * @paramType java.math.BigDecimal
    * @param taxnum - 课税数量（车船数量、吨数、长度）
     */
    public void setTaxnum(BigDecimal taxnum) {
        this.taxnum = taxnum;
    }

    /**
    * 获取-免征税额
    * @return freequalitytax
     */
    public BigDecimal getFreequalitytax() {
        return freequalitytax;
    }

    /**
    * 设置-免征税额
    * @paramType java.math.BigDecimal
    * @param freequalitytax - 免征税额
     */
    public void setFreequalitytax(BigDecimal freequalitytax) {
        this.freequalitytax = freequalitytax;
    }

    /**
    * 获取-是否外地
    * @return isnonlocal
     */
    public String getIsnonlocal() {
        return isnonlocal;
    }

    /**
    * 设置-是否外地
    * @paramType java.lang.String
    * @param isnonlocal - 是否外地
     */
    public void setIsnonlocal(String isnonlocal) {
        this.isnonlocal = isnonlocal;
    }

    /**
    * 获取-居住地址
    * @return homeaddress
     */
    public String getHomeaddress() {
        return homeaddress;
    }

    /**
    * 设置-居住地址
    * @paramType java.lang.String
    * @param homeaddress - 居住地址
     */
    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    /**
    * 获取-邮政编码
    * @return zip
     */
    public String getZip() {
        return zip;
    }

    /**
    * 设置-邮政编码
    * @paramType java.lang.String
    * @param zip - 邮政编码
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
    * 获取-联系电话
    * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
    * 设置-联系电话
    * @paramType java.lang.String
    * @param tel - 联系电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
    * 获取-国籍
    * @return national
     */
    public String getNational() {
        return national;
    }

    /**
    * 设置-国籍
    * @paramType java.lang.String
    * @param national - 国籍
     */
    public void setNational(String national) {
        this.national = national;
    }

    /**
    * 获取-车辆落户地址
    * @return settleaddress
     */
    public String getSettleaddress() {
        return settleaddress;
    }

    /**
    * 设置-车辆落户地址
    * @paramType java.lang.String
    * @param settleaddress - 车辆落户地址
     */
    public void setSettleaddress(String settleaddress) {
        this.settleaddress = settleaddress;
    }

    /**
    * 获取-税款所属期
    * @return taxterm
     */
    public String getTaxterm() {
        return taxterm;
    }

    /**
    * 设置-税款所属期
    * @paramType java.lang.String
    * @param taxterm - 税款所属期
     */
    public void setTaxterm(String taxterm) {
        this.taxterm = taxterm;
    }

    /**
    * 获取-微机编码
    * @return pccode
     */
    public String getPccode() {
        return pccode;
    }

    /**
    * 设置-微机编码
    * @paramType java.lang.String
    * @param pccode - 微机编码
     */
    public void setPccode(String pccode) {
        this.pccode = pccode;
    }

    /**
    * 获取-转籍时间
    * @return changenativedate
     */
    public Date getChangenativedate() {
        return changenativedate;
    }

    /**
    * 设置-转籍时间
    * @paramType java.util.Date
    * @param changenativedate - 转籍时间
     */
    public void setChangenativedate(Date changenativedate) {
        this.changenativedate = changenativedate;
    }

    /**
    * 获取-原车牌照号
    * @return oldlicenseno
     */
    public String getOldlicenseno() {
        return oldlicenseno;
    }

    /**
    * 设置-原车牌照号
    * @paramType java.lang.String
    * @param oldlicenseno - 原车牌照号
     */
    public void setOldlicenseno(String oldlicenseno) {
        this.oldlicenseno = oldlicenseno;
    }

    /**
    * 获取-引擎排量
    * @return enginecapacity
     */
    public BigDecimal getEnginecapacity() {
        return enginecapacity;
    }

    /**
    * 设置-引擎排量
    * @paramType java.math.BigDecimal
    * @param enginecapacity - 引擎排量
     */
    public void setEnginecapacity(BigDecimal enginecapacity) {
        this.enginecapacity = enginecapacity;
    }

    /**
    * 获取-税收减免性质代码
    * @return reductionnaturecode
     */
    public String getReductionnaturecode() {
        return reductionnaturecode;
    }

    /**
    * 设置-税收减免性质代码
    * @paramType java.lang.String
    * @param reductionnaturecode - 税收减免性质代码
     */
    public void setReductionnaturecode(String reductionnaturecode) {
        this.reductionnaturecode = reductionnaturecode;
    }

    /**
    * 获取-税收减免性质名称
    * @return reductionnaturename
     */
    public String getReductionnaturename() {
        return reductionnaturename;
    }

    /**
    * 设置-税收减免性质名称
    * @paramType java.lang.String
    * @param reductionnaturename - 税收减免性质名称
     */
    public void setReductionnaturename(String reductionnaturename) {
        this.reductionnaturename = reductionnaturename;
    }

    /**
    * 获取-减免税证明编号2
    * @return derateno2
     */
    public String getDerateno2() {
        return derateno2;
    }

    /**
    * 设置-减免税证明编号2
    * @paramType java.lang.String
    * @param derateno2 - 减免税证明编号2
     */
    public void setDerateno2(String derateno2) {
        this.derateno2 = derateno2;
    }

    /**
    * 获取-税收减免性质代码2
    * @return reductionnaturecode2
     */
    public String getReductionnaturecode2() {
        return reductionnaturecode2;
    }

    /**
    * 设置-税收减免性质代码2
    * @paramType java.lang.String
    * @param reductionnaturecode2 - 税收减免性质代码2
     */
    public void setReductionnaturecode2(String reductionnaturecode2) {
        this.reductionnaturecode2 = reductionnaturecode2;
    }

    /**
    * 获取-税收减免性质名称2
    * @return reductionnaturename2
     */
    public String getReductionnaturename2() {
        return reductionnaturename2;
    }

    /**
    * 设置-税收减免性质名称2
    * @paramType java.lang.String
    * @param reductionnaturename2 - 税收减免性质名称2
     */
    public void setReductionnaturename2(String reductionnaturename2) {
        this.reductionnaturename2 = reductionnaturename2;
    }

    /**
    * 获取-税款所属年度
    * @return taxyear
     */
    public String getTaxyear() {
        return taxyear;
    }

    /**
    * 设置-税款所属年度
    * @paramType java.lang.String
    * @param taxyear - 税款所属年度
     */
    public void setTaxyear(String taxyear) {
        this.taxyear = taxyear;
    }

    /**
    * 获取-年应缴月份
    * @return taxmonth
     */
    public String getTaxmonth() {
        return taxmonth;
    }

    /**
    * 设置-年应缴月份
    * @paramType java.lang.String
    * @param taxmonth - 年应缴月份
     */
    public void setTaxmonth(String taxmonth) {
        this.taxmonth = taxmonth;
    }

    /**
    * 获取-本年减免税额2
    * @return taxfree2
     */
    public BigDecimal getTaxfree2() {
        return taxfree2;
    }

    /**
    * 设置-本年减免税额2
    * @paramType java.math.BigDecimal
    * @param taxfree2 - 本年减免税额2
     */
    public void setTaxfree2(BigDecimal taxfree2) {
        this.taxfree2 = taxfree2;
    }
}