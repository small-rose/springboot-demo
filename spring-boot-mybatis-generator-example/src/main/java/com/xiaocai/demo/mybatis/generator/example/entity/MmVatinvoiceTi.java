package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_vatinvoice_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmVatinvoiceTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 发票代码
     */
    private String invoicecode;

    /**
     * 发票号
     */
    private String invoiceno;

    /**
     * 币种（发票币种）
     */
    private String currencycode;

    /**
     * 保额（发票币种）
     */
    private BigDecimal amount;

    /**
     * 税额（发票币种）
     */
    private BigDecimal taxesamount;

    /**
     * 0发票开具 1发票作废 2发票红冲 3发票遗失
     */
    private String opstatus;

    /**
     * 状态  1初始状态  2落地成功  3落地失败
     */
    private String status;

    /**
     * 发票打印名称
     */
    private String printname;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * 摘要
     */
    private String description;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 数据源
     */
    private String datasource;

    /**
     * 描述
     */
    private String modifydesc;

    /**
     * 红冲发票代码
     */
    private String coininvoicecode;

    /**
     * 红冲发票号
     */
    private String coininvoiceno;

    /**
     * 发票文件批次号
     */
    private String batchid;

    /**
     * 币种（原币）
     */
    private String basecurrencycode;

    /**
     * 保额（原币）
     */
    private BigDecimal baseamount;

    /**
     * 税额（原币）
     */
    private BigDecimal basetaxesamount;

    /**
     * 发票类型（0销项，1进项）
     */
    private String invoicetype;

    /**
     * 开票时间
     */
    private Date invoicedate;

    /**
     * 税票类型  0增值税专用发票,1海关进口增值税专用缴款书,2农产品收购发票或者销售发票,3代扣代缴税收缴款凭证,4其他,5通行费
     */
    private String taxbilltype;

    /**
     * 税额结构
     */
    private String taxstr;

    /**
     * 所属期间
     */
    private Date period;

    /**
     * 业务单元编码
     */
    private String pkOrg;

    /**
     * 销方税号
     */
    private String outtaxno;

    /**
     * 销货单位名称
     */
    private String outname;

    /**
     * 销方地址
     */
    private String outaddr;

    /**
     * 销方电话
     */
    private String outphone;

    /**
     * 销方开户行
     */
    private String outbankname;

    /**
     * 销方账户
     */
    private String outbankno;

    /**
     * 认证状态 0：未认证 1：已认证 2：已过期
     */
    private String authstatus;

    /**
     * 预留字段
     */
    private String reserve1;

    /**
     * 预留字段
     */
    private String reserve2;

    /**
     * 预留字段
     */
    private String reserve3;

    /**
     * 预留字段
     */
    private Date reserve4;

    /**
     * 失败原因
     */
    private String msg;

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
    * 获取-发票代码
    * @return invoicecode
     */
    public String getInvoicecode() {
        return invoicecode;
    }

    /**
    * 设置-发票代码
    * @paramType java.lang.String
    * @param invoicecode - 发票代码
     */
    public void setInvoicecode(String invoicecode) {
        this.invoicecode = invoicecode;
    }

    /**
    * 获取-发票号
    * @return invoiceno
     */
    public String getInvoiceno() {
        return invoiceno;
    }

    /**
    * 设置-发票号
    * @paramType java.lang.String
    * @param invoiceno - 发票号
     */
    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    /**
    * 获取-币种（发票币种）
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种（发票币种）
    * @paramType java.lang.String
    * @param currencycode - 币种（发票币种）
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-保额（发票币种）
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-保额（发票币种）
    * @paramType java.math.BigDecimal
    * @param amount - 保额（发票币种）
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-税额（发票币种）
    * @return taxesamount
     */
    public BigDecimal getTaxesamount() {
        return taxesamount;
    }

    /**
    * 设置-税额（发票币种）
    * @paramType java.math.BigDecimal
    * @param taxesamount - 税额（发票币种）
     */
    public void setTaxesamount(BigDecimal taxesamount) {
        this.taxesamount = taxesamount;
    }

    /**
    * 获取-0发票开具 1发票作废 2发票红冲 3发票遗失
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-0发票开具 1发票作废 2发票红冲 3发票遗失
    * @paramType java.lang.String
    * @param opstatus - 0发票开具 1发票作废 2发票红冲 3发票遗失
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-状态  1初始状态  2落地成功  3落地失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态  1初始状态  2落地成功  3落地失败
    * @paramType java.lang.String
    * @param status - 状态  1初始状态  2落地成功  3落地失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-发票打印名称
    * @return printname
     */
    public String getPrintname() {
        return printname;
    }

    /**
    * 设置-发票打印名称
    * @paramType java.lang.String
    * @param printname - 发票打印名称
     */
    public void setPrintname(String printname) {
        this.printname = printname;
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
    * 获取-摘要
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-摘要
    * @paramType java.lang.String
    * @param description - 摘要
     */
    public void setDescription(String description) {
        this.description = description;
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
    * 获取-描述
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param modifydesc - 描述
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-红冲发票代码
    * @return coininvoicecode
     */
    public String getCoininvoicecode() {
        return coininvoicecode;
    }

    /**
    * 设置-红冲发票代码
    * @paramType java.lang.String
    * @param coininvoicecode - 红冲发票代码
     */
    public void setCoininvoicecode(String coininvoicecode) {
        this.coininvoicecode = coininvoicecode;
    }

    /**
    * 获取-红冲发票号
    * @return coininvoiceno
     */
    public String getCoininvoiceno() {
        return coininvoiceno;
    }

    /**
    * 设置-红冲发票号
    * @paramType java.lang.String
    * @param coininvoiceno - 红冲发票号
     */
    public void setCoininvoiceno(String coininvoiceno) {
        this.coininvoiceno = coininvoiceno;
    }

    /**
    * 获取-发票文件批次号
    * @return batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
    * 设置-发票文件批次号
    * @paramType java.lang.String
    * @param batchid - 发票文件批次号
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
    * 获取-币种（原币）
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-币种（原币）
    * @paramType java.lang.String
    * @param basecurrencycode - 币种（原币）
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
    }

    /**
    * 获取-保额（原币）
    * @return baseamount
     */
    public BigDecimal getBaseamount() {
        return baseamount;
    }

    /**
    * 设置-保额（原币）
    * @paramType java.math.BigDecimal
    * @param baseamount - 保额（原币）
     */
    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    /**
    * 获取-税额（原币）
    * @return basetaxesamount
     */
    public BigDecimal getBasetaxesamount() {
        return basetaxesamount;
    }

    /**
    * 设置-税额（原币）
    * @paramType java.math.BigDecimal
    * @param basetaxesamount - 税额（原币）
     */
    public void setBasetaxesamount(BigDecimal basetaxesamount) {
        this.basetaxesamount = basetaxesamount;
    }

    /**
    * 获取-发票类型（0销项，1进项）
    * @return invoicetype
     */
    public String getInvoicetype() {
        return invoicetype;
    }

    /**
    * 设置-发票类型（0销项，1进项）
    * @paramType java.lang.String
    * @param invoicetype - 发票类型（0销项，1进项）
     */
    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    /**
    * 获取-开票时间
    * @return invoicedate
     */
    public Date getInvoicedate() {
        return invoicedate;
    }

    /**
    * 设置-开票时间
    * @paramType java.util.Date
    * @param invoicedate - 开票时间
     */
    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
    }

    /**
    * 获取-税票类型  0增值税专用发票,1海关进口增值税专用缴款书,2农产品收购发票或者销售发票,3代扣代缴税收缴款凭证,4其他,5通行费
    * @return taxbilltype
     */
    public String getTaxbilltype() {
        return taxbilltype;
    }

    /**
    * 设置-税票类型  0增值税专用发票,1海关进口增值税专用缴款书,2农产品收购发票或者销售发票,3代扣代缴税收缴款凭证,4其他,5通行费
    * @paramType java.lang.String
    * @param taxbilltype - 税票类型  0增值税专用发票,1海关进口增值税专用缴款书,2农产品收购发票或者销售发票,3代扣代缴税收缴款凭证,4其他,5通行费
     */
    public void setTaxbilltype(String taxbilltype) {
        this.taxbilltype = taxbilltype;
    }

    /**
    * 获取-税额结构
    * @return taxstr
     */
    public String getTaxstr() {
        return taxstr;
    }

    /**
    * 设置-税额结构
    * @paramType java.lang.String
    * @param taxstr - 税额结构
     */
    public void setTaxstr(String taxstr) {
        this.taxstr = taxstr;
    }

    /**
    * 获取-所属期间
    * @return period
     */
    public Date getPeriod() {
        return period;
    }

    /**
    * 设置-所属期间
    * @paramType java.util.Date
    * @param period - 所属期间
     */
    public void setPeriod(Date period) {
        this.period = period;
    }

    /**
    * 获取-业务单元编码
    * @return pkOrg
     */
    public String getPkOrg() {
        return pkOrg;
    }

    /**
    * 设置-业务单元编码
    * @paramType java.lang.String
    * @param pkOrg - 业务单元编码
     */
    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg;
    }

    /**
    * 获取-销方税号
    * @return outtaxno
     */
    public String getOuttaxno() {
        return outtaxno;
    }

    /**
    * 设置-销方税号
    * @paramType java.lang.String
    * @param outtaxno - 销方税号
     */
    public void setOuttaxno(String outtaxno) {
        this.outtaxno = outtaxno;
    }

    /**
    * 获取-销货单位名称
    * @return outname
     */
    public String getOutname() {
        return outname;
    }

    /**
    * 设置-销货单位名称
    * @paramType java.lang.String
    * @param outname - 销货单位名称
     */
    public void setOutname(String outname) {
        this.outname = outname;
    }

    /**
    * 获取-销方地址
    * @return outaddr
     */
    public String getOutaddr() {
        return outaddr;
    }

    /**
    * 设置-销方地址
    * @paramType java.lang.String
    * @param outaddr - 销方地址
     */
    public void setOutaddr(String outaddr) {
        this.outaddr = outaddr;
    }

    /**
    * 获取-销方电话
    * @return outphone
     */
    public String getOutphone() {
        return outphone;
    }

    /**
    * 设置-销方电话
    * @paramType java.lang.String
    * @param outphone - 销方电话
     */
    public void setOutphone(String outphone) {
        this.outphone = outphone;
    }

    /**
    * 获取-销方开户行
    * @return outbankname
     */
    public String getOutbankname() {
        return outbankname;
    }

    /**
    * 设置-销方开户行
    * @paramType java.lang.String
    * @param outbankname - 销方开户行
     */
    public void setOutbankname(String outbankname) {
        this.outbankname = outbankname;
    }

    /**
    * 获取-销方账户
    * @return outbankno
     */
    public String getOutbankno() {
        return outbankno;
    }

    /**
    * 设置-销方账户
    * @paramType java.lang.String
    * @param outbankno - 销方账户
     */
    public void setOutbankno(String outbankno) {
        this.outbankno = outbankno;
    }

    /**
    * 获取-认证状态 0：未认证 1：已认证 2：已过期
    * @return authstatus
     */
    public String getAuthstatus() {
        return authstatus;
    }

    /**
    * 设置-认证状态 0：未认证 1：已认证 2：已过期
    * @paramType java.lang.String
    * @param authstatus - 认证状态 0：未认证 1：已认证 2：已过期
     */
    public void setAuthstatus(String authstatus) {
        this.authstatus = authstatus;
    }

    /**
    * 获取-预留字段
    * @return reserve1
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param reserve1 - 预留字段
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    /**
    * 获取-预留字段
    * @return reserve2
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param reserve2 - 预留字段
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    /**
    * 获取-预留字段
    * @return reserve3
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
    * 设置-预留字段
    * @paramType java.lang.String
    * @param reserve3 - 预留字段
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    /**
    * 获取-预留字段
    * @return reserve4
     */
    public Date getReserve4() {
        return reserve4;
    }

    /**
    * 设置-预留字段
    * @paramType java.util.Date
    * @param reserve4 - 预留字段
     */
    public void setReserve4(Date reserve4) {
        this.reserve4 = reserve4;
    }

    /**
    * 获取-失败原因
    * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
    * 设置-失败原因
    * @paramType java.lang.String
    * @param msg - 失败原因
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}