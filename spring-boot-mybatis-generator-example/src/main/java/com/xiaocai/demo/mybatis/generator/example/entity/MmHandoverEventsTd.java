package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_handover_events_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmHandoverEventsTd {
    /**
     * 主键
     */
    private Long seqdthandover;

    /**
     * 记录申报单号或结算单号
     */
    private String handoverno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 由mm_taxout_td的createtype字段的值确定写入值；0写入保批单流水号；1写入业务明细流水号listno
     */
    private Long seqpolicy;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 备用
     */
    private String opstatus;

    /**
     * 操作员
     */
    private String opcode;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 此记录被作废的系统时间
     */
    private Date canceldate;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATEVERSION版本号
     */
    private Short hibernateversion;

    /**
     * 待付款表主键
     */
    private Long payableno;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String currencycode;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String vkclass;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String vehkind;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String vehname;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String brand;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String vehvin;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String vehtype;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private BigDecimal grossweight;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private BigDecimal loadcapacity;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private BigDecimal seat;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private BigDecimal curbweight;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String taxpayer;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String idNo;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String payer;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
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
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private Date backdatefrom;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private Date backdateto;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private Date latedatefrom;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private Date latedateto;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private BigDecimal taxpayable;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private BigDecimal backtax;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private BigDecimal latefee;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private BigDecimal taxfree;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private BigDecimal taxtotal;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String taxcertno;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String taxoffice;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private Date taxday;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String insurer;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String insurerno;

    /**
     * 数据发送状态：1初始化；2成功；3失败；
     */
    private String status;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String datasource;

    /**
     * 来自于mm_taxout_td的字段，申报时使用
     */
    private String engine;

    /**
     * 来自于mm_policy_td的字段，申报时使用
     */
    private BigDecimal usedtaxamount;

    /**
     * 来自于mm_policy_td的字段，申报时使用
     */
    private String departmentcode;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 来自于mm_taxdetail_td表
     */
    private String id;

    /**
     * 来自于mm_taxdetail_td表
     */
    private String seqtax;

    /**
     * 来自于mm_taxdetai_tdl表
     */
    private String endorseno;

    /**
     * 来自于mm_taxdetail_td表
     */
    private Date lastopdate;

    /**
     * 来自于mm_policy_td表
     */
    private BigDecimal baserealamount;

    /**
     * 来自于mm_policy_td表
     */
    private BigDecimal accountamount;

    /**
     * 签单日期
     */
    private Date signdate;

    /**
     * 来自于mm_invply_td表
     */
    private String invoiceno;

    /**
     * 来自于mm_invoice_td表
     */
    private BigDecimal taxamount;

    /**
     * 来自于mm_policy_events_td表
     */
    private BigDecimal baseamount;

    /**
     * 燃料种类代码
     */
    private String fueltype;

    /**
     *   燃料种类名称
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
    private Long lateday;

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
     * 保险起期
     */
    private Date policystartdate;

    /**
     * 保险止期
     */
    private Date policyenddate;

    /**
     * 计税单位：辆、吨、排气量、载客人数
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
     * 引擎排量
     */
    private BigDecimal enginecapacity;

    /**
     * 数据发送状态：1初始化；2成功；3失败；
     */
    private String sendstatus;

    /**
     * 错误信息
     */
    private String errormessage;

    /**
     * 车船起始止日期来源于MM_TAXDETAIL_TD.STARTDATE
     */
    private Date taxStartdate;

    /**
     * 安徽分公司 车牌颜色
     */
    private String platecolor;

    /**
     * 被代扣代缴纳税人识别号
     */
    private String applicanttaxpayer;

    /**
     * 开具减免证明税务机关代码
     */
    private String taxofficecode;

    /**
     * 车船税截止日期来源于MM_TAXDETAIL_TD.ENDDATE
     */
    private Date taxEnddate;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 使用性质
     */
    private String useproperty;

    /**
     * 批改序号
     */
    private String serialno;

    /**
    * 获取-主键
    * @return seqdthandover
     */
    public Long getSeqdthandover() {
        return seqdthandover;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqdthandover - 主键
     */
    public void setSeqdthandover(Long seqdthandover) {
        this.seqdthandover = seqdthandover;
    }

    /**
    * 获取-记录申报单号或结算单号
    * @return handoverno
     */
    public String getHandoverno() {
        return handoverno;
    }

    /**
    * 设置-记录申报单号或结算单号
    * @paramType java.lang.String
    * @param handoverno - 记录申报单号或结算单号
     */
    public void setHandoverno(String handoverno) {
        this.handoverno = handoverno;
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
    * 获取-由mm_taxout_td的createtype字段的值确定写入值；0写入保批单流水号；1写入业务明细流水号listno
    * @return seqpolicy
     */
    public Long getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-由mm_taxout_td的createtype字段的值确定写入值；0写入保批单流水号；1写入业务明细流水号listno
    * @paramType java.lang.Long
    * @param seqpolicy - 由mm_taxout_td的createtype字段的值确定写入值；0写入保批单流水号；1写入业务明细流水号listno
     */
    public void setSeqpolicy(Long seqpolicy) {
        this.seqpolicy = seqpolicy;
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
    * 获取-备用
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-备用
    * @paramType java.lang.String
    * @param opstatus - 备用
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-操作员
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-操作员
    * @paramType java.lang.String
    * @param opcode - 操作员
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
    * 获取-此记录被作废的系统时间
    * @return canceldate
     */
    public Date getCanceldate() {
        return canceldate;
    }

    /**
    * 设置-此记录被作废的系统时间
    * @paramType java.util.Date
    * @param canceldate - 此记录被作废的系统时间
     */
    public void setCanceldate(Date canceldate) {
        this.canceldate = canceldate;
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
    * 获取-待付款表主键
    * @return payableno
     */
    public Long getPayableno() {
        return payableno;
    }

    /**
    * 设置-待付款表主键
    * @paramType java.lang.Long
    * @param payableno - 待付款表主键
     */
    public void setPayableno(Long payableno) {
        this.payableno = payableno;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param currencycode - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return vkclass
     */
    public String getVkclass() {
        return vkclass;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param vkclass - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setVkclass(String vkclass) {
        this.vkclass = vkclass;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return vehkind
     */
    public String getVehkind() {
        return vehkind;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param vehkind - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setVehkind(String vehkind) {
        this.vehkind = vehkind;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return vehname
     */
    public String getVehname() {
        return vehname;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param vehname - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setVehname(String vehname) {
        this.vehname = vehname;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param brand - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return vehvin
     */
    public String getVehvin() {
        return vehvin;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param vehvin - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setVehvin(String vehvin) {
        this.vehvin = vehvin;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return vehtype
     */
    public String getVehtype() {
        return vehtype;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param vehtype - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setVehtype(String vehtype) {
        this.vehtype = vehtype;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return grossweight
     */
    public BigDecimal getGrossweight() {
        return grossweight;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.math.BigDecimal
    * @param grossweight - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setGrossweight(BigDecimal grossweight) {
        this.grossweight = grossweight;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return loadcapacity
     */
    public BigDecimal getLoadcapacity() {
        return loadcapacity;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.math.BigDecimal
    * @param loadcapacity - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setLoadcapacity(BigDecimal loadcapacity) {
        this.loadcapacity = loadcapacity;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return seat
     */
    public BigDecimal getSeat() {
        return seat;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.math.BigDecimal
    * @param seat - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setSeat(BigDecimal seat) {
        this.seat = seat;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return curbweight
     */
    public BigDecimal getCurbweight() {
        return curbweight;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.math.BigDecimal
    * @param curbweight - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setCurbweight(BigDecimal curbweight) {
        this.curbweight = curbweight;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return taxpayer
     */
    public String getTaxpayer() {
        return taxpayer;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param taxpayer - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setTaxpayer(String taxpayer) {
        this.taxpayer = taxpayer;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return idNo
     */
    public String getIdNo() {
        return idNo;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param idNo - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return payer
     */
    public String getPayer() {
        return payer;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param payer - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setPayer(String payer) {
        this.payer = payer;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return payeraddress
     */
    public String getPayeraddress() {
        return payeraddress;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param payeraddress - 来自于mm_taxout_td的字段，申报时使用
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
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return backdatefrom
     */
    public Date getBackdatefrom() {
        return backdatefrom;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.util.Date
    * @param backdatefrom - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setBackdatefrom(Date backdatefrom) {
        this.backdatefrom = backdatefrom;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return backdateto
     */
    public Date getBackdateto() {
        return backdateto;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.util.Date
    * @param backdateto - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setBackdateto(Date backdateto) {
        this.backdateto = backdateto;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return latedatefrom
     */
    public Date getLatedatefrom() {
        return latedatefrom;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.util.Date
    * @param latedatefrom - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setLatedatefrom(Date latedatefrom) {
        this.latedatefrom = latedatefrom;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return latedateto
     */
    public Date getLatedateto() {
        return latedateto;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.util.Date
    * @param latedateto - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setLatedateto(Date latedateto) {
        this.latedateto = latedateto;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return taxpayable
     */
    public BigDecimal getTaxpayable() {
        return taxpayable;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.math.BigDecimal
    * @param taxpayable - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setTaxpayable(BigDecimal taxpayable) {
        this.taxpayable = taxpayable;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return backtax
     */
    public BigDecimal getBacktax() {
        return backtax;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.math.BigDecimal
    * @param backtax - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setBacktax(BigDecimal backtax) {
        this.backtax = backtax;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return latefee
     */
    public BigDecimal getLatefee() {
        return latefee;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.math.BigDecimal
    * @param latefee - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setLatefee(BigDecimal latefee) {
        this.latefee = latefee;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return taxfree
     */
    public BigDecimal getTaxfree() {
        return taxfree;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.math.BigDecimal
    * @param taxfree - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setTaxfree(BigDecimal taxfree) {
        this.taxfree = taxfree;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return taxtotal
     */
    public BigDecimal getTaxtotal() {
        return taxtotal;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.math.BigDecimal
    * @param taxtotal - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setTaxtotal(BigDecimal taxtotal) {
        this.taxtotal = taxtotal;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return taxcertno
     */
    public String getTaxcertno() {
        return taxcertno;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param taxcertno - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setTaxcertno(String taxcertno) {
        this.taxcertno = taxcertno;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return taxoffice
     */
    public String getTaxoffice() {
        return taxoffice;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param taxoffice - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setTaxoffice(String taxoffice) {
        this.taxoffice = taxoffice;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return taxday
     */
    public Date getTaxday() {
        return taxday;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.util.Date
    * @param taxday - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setTaxday(Date taxday) {
        this.taxday = taxday;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return insurer
     */
    public String getInsurer() {
        return insurer;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param insurer - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setInsurer(String insurer) {
        this.insurer = insurer;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return insurerno
     */
    public String getInsurerno() {
        return insurerno;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param insurerno - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setInsurerno(String insurerno) {
        this.insurerno = insurerno;
    }

    /**
    * 获取-数据发送状态：1初始化；2成功；3失败；
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-数据发送状态：1初始化；2成功；3失败；
    * @paramType java.lang.String
    * @param status - 数据发送状态：1初始化；2成功；3失败；
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param datasource - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-来自于mm_taxout_td的字段，申报时使用
    * @return engine
     */
    public String getEngine() {
        return engine;
    }

    /**
    * 设置-来自于mm_taxout_td的字段，申报时使用
    * @paramType java.lang.String
    * @param engine - 来自于mm_taxout_td的字段，申报时使用
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
    * 获取-来自于mm_policy_td的字段，申报时使用
    * @return usedtaxamount
     */
    public BigDecimal getUsedtaxamount() {
        return usedtaxamount;
    }

    /**
    * 设置-来自于mm_policy_td的字段，申报时使用
    * @paramType java.math.BigDecimal
    * @param usedtaxamount - 来自于mm_policy_td的字段，申报时使用
     */
    public void setUsedtaxamount(BigDecimal usedtaxamount) {
        this.usedtaxamount = usedtaxamount;
    }

    /**
    * 获取-来自于mm_policy_td的字段，申报时使用
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-来自于mm_policy_td的字段，申报时使用
    * @paramType java.lang.String
    * @param departmentcode - 来自于mm_policy_td的字段，申报时使用
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
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
    * 获取-来自于mm_taxdetail_td表
    * @return id
     */
    public String getId() {
        return id;
    }

    /**
    * 设置-来自于mm_taxdetail_td表
    * @paramType java.lang.String
    * @param id - 来自于mm_taxdetail_td表
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
    * 获取-来自于mm_taxdetail_td表
    * @return seqtax
     */
    public String getSeqtax() {
        return seqtax;
    }

    /**
    * 设置-来自于mm_taxdetail_td表
    * @paramType java.lang.String
    * @param seqtax - 来自于mm_taxdetail_td表
     */
    public void setSeqtax(String seqtax) {
        this.seqtax = seqtax;
    }

    /**
    * 获取-来自于mm_taxdetai_tdl表
    * @return endorseno
     */
    public String getEndorseno() {
        return endorseno;
    }

    /**
    * 设置-来自于mm_taxdetai_tdl表
    * @paramType java.lang.String
    * @param endorseno - 来自于mm_taxdetai_tdl表
     */
    public void setEndorseno(String endorseno) {
        this.endorseno = endorseno;
    }

    /**
    * 获取-来自于mm_taxdetail_td表
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-来自于mm_taxdetail_td表
    * @paramType java.util.Date
    * @param lastopdate - 来自于mm_taxdetail_td表
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-来自于mm_policy_td表
    * @return baserealamount
     */
    public BigDecimal getBaserealamount() {
        return baserealamount;
    }

    /**
    * 设置-来自于mm_policy_td表
    * @paramType java.math.BigDecimal
    * @param baserealamount - 来自于mm_policy_td表
     */
    public void setBaserealamount(BigDecimal baserealamount) {
        this.baserealamount = baserealamount;
    }

    /**
    * 获取-来自于mm_policy_td表
    * @return accountamount
     */
    public BigDecimal getAccountamount() {
        return accountamount;
    }

    /**
    * 设置-来自于mm_policy_td表
    * @paramType java.math.BigDecimal
    * @param accountamount - 来自于mm_policy_td表
     */
    public void setAccountamount(BigDecimal accountamount) {
        this.accountamount = accountamount;
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
    * 获取-来自于mm_invply_td表
    * @return invoiceno
     */
    public String getInvoiceno() {
        return invoiceno;
    }

    /**
    * 设置-来自于mm_invply_td表
    * @paramType java.lang.String
    * @param invoiceno - 来自于mm_invply_td表
     */
    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    /**
    * 获取-来自于mm_invoice_td表
    * @return taxamount
     */
    public BigDecimal getTaxamount() {
        return taxamount;
    }

    /**
    * 设置-来自于mm_invoice_td表
    * @paramType java.math.BigDecimal
    * @param taxamount - 来自于mm_invoice_td表
     */
    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    /**
    * 获取-来自于mm_policy_events_td表
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-来自于mm_policy_events_td表
    * @paramType java.math.BigDecimal
    * @param baseamount - 来自于mm_policy_events_td表
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
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
    * 获取-  燃料种类名称
    * @return fuelname
     */
    public String getFuelname() {
        return fuelname;
    }

    /**
    * 设置-  燃料种类名称
    * @paramType java.lang.String
    * @param fuelname -   燃料种类名称
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
    public Long getLateday() {
        return lateday;
    }

    /**
    * 设置-滞纳天数
    * @paramType java.lang.Long
    * @param lateday - 滞纳天数
     */
    public void setLateday(Long lateday) {
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
    * 获取-保险起期
    * @return policystartdate
     */
    public Date getPolicystartdate() {
        return policystartdate;
    }

    /**
    * 设置-保险起期
    * @paramType java.util.Date
    * @param policystartdate - 保险起期
     */
    public void setPolicystartdate(Date policystartdate) {
        this.policystartdate = policystartdate;
    }

    /**
    * 获取-保险止期
    * @return policyenddate
     */
    public Date getPolicyenddate() {
        return policyenddate;
    }

    /**
    * 设置-保险止期
    * @paramType java.util.Date
    * @param policyenddate - 保险止期
     */
    public void setPolicyenddate(Date policyenddate) {
        this.policyenddate = policyenddate;
    }

    /**
    * 获取-计税单位：辆、吨、排气量、载客人数
    * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
    * 设置-计税单位：辆、吨、排气量、载客人数
    * @paramType java.lang.String
    * @param unit - 计税单位：辆、吨、排气量、载客人数
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
    * 获取-数据发送状态：1初始化；2成功；3失败；
    * @return sendstatus
     */
    public String getSendstatus() {
        return sendstatus;
    }

    /**
    * 设置-数据发送状态：1初始化；2成功；3失败；
    * @paramType java.lang.String
    * @param sendstatus - 数据发送状态：1初始化；2成功；3失败；
     */
    public void setSendstatus(String sendstatus) {
        this.sendstatus = sendstatus;
    }

    /**
    * 获取-错误信息
    * @return errormessage
     */
    public String getErrormessage() {
        return errormessage;
    }

    /**
    * 设置-错误信息
    * @paramType java.lang.String
    * @param errormessage - 错误信息
     */
    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    /**
    * 获取-车船起始止日期来源于MM_TAXDETAIL_TD.STARTDATE
    * @return taxStartdate
     */
    public Date getTaxStartdate() {
        return taxStartdate;
    }

    /**
    * 设置-车船起始止日期来源于MM_TAXDETAIL_TD.STARTDATE
    * @paramType java.util.Date
    * @param taxStartdate - 车船起始止日期来源于MM_TAXDETAIL_TD.STARTDATE
     */
    public void setTaxStartdate(Date taxStartdate) {
        this.taxStartdate = taxStartdate;
    }

    /**
    * 获取-安徽分公司 车牌颜色
    * @return platecolor
     */
    public String getPlatecolor() {
        return platecolor;
    }

    /**
    * 设置-安徽分公司 车牌颜色
    * @paramType java.lang.String
    * @param platecolor - 安徽分公司 车牌颜色
     */
    public void setPlatecolor(String platecolor) {
        this.platecolor = platecolor;
    }

    /**
    * 获取-被代扣代缴纳税人识别号
    * @return applicanttaxpayer
     */
    public String getApplicanttaxpayer() {
        return applicanttaxpayer;
    }

    /**
    * 设置-被代扣代缴纳税人识别号
    * @paramType java.lang.String
    * @param applicanttaxpayer - 被代扣代缴纳税人识别号
     */
    public void setApplicanttaxpayer(String applicanttaxpayer) {
        this.applicanttaxpayer = applicanttaxpayer;
    }

    /**
    * 获取-开具减免证明税务机关代码
    * @return taxofficecode
     */
    public String getTaxofficecode() {
        return taxofficecode;
    }

    /**
    * 设置-开具减免证明税务机关代码
    * @paramType java.lang.String
    * @param taxofficecode - 开具减免证明税务机关代码
     */
    public void setTaxofficecode(String taxofficecode) {
        this.taxofficecode = taxofficecode;
    }

    /**
    * 获取-车船税截止日期来源于MM_TAXDETAIL_TD.ENDDATE
    * @return taxEnddate
     */
    public Date getTaxEnddate() {
        return taxEnddate;
    }

    /**
    * 设置-车船税截止日期来源于MM_TAXDETAIL_TD.ENDDATE
    * @paramType java.util.Date
    * @param taxEnddate - 车船税截止日期来源于MM_TAXDETAIL_TD.ENDDATE
     */
    public void setTaxEnddate(Date taxEnddate) {
        this.taxEnddate = taxEnddate;
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
}