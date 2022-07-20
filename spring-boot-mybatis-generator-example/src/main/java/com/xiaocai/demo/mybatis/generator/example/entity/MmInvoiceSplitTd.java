package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_invoice_split_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvoiceSplitTd {
    /**
     * 主键
     */
    private Long seqinvoice;

    /**
     * 发票号
     */
    private String invoiceno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 保单币种，系统规定发票币种和保单币种必须一致
     */
    private String currencycode;

    /**
     * 发票金额
     */
    private BigDecimal amount;

    /**
     * 核销状态 0初始状态 1部分核销 2全部核销 3 作废  4 被红冲  5 红冲
     */
    private String opstatus;

    /**
     * 业务部门代码
     */
    private String departmentcode;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 发票类型：1 保单发票、2 赔款发票、 3 共保出单费发票
     */
    private String invoicetype;

    /**
     * 结算单号
     */
    private String handid;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 记录发票打印的次数
     */
    private BigDecimal opcount;

    /**
     * 核保员代码
     */
    private String underwritercode;

    /**
     * 核保员名称，对应datacenter:document.hby
     */
    private String underwritername;

    /**
     * 经办人代码
     */
    private String transactorcode;

    /**
     * 经办人名称，此处应记录汉字名称
     */
    private String transactorname;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * 借发票约定到款日期
     */
    private Date datedate;

    /**
     * 借票人代码
     */
    private String borrowercode;

    /**
     * 计划帐龄天数
     */
    private BigDecimal planterm;

    /**
     * 批准人代码
     */
    private String ratifiercode;

    /**
     * 批准日期
     */
    private Date ratifydate;

    /**
     * 打印人代码
     */
    private String printercode;

    /**
     * 打印日期
     */
    private Date printdate;

    /**
     * 0未打印 1已打印
     */
    private String ifprinted;

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
     * 单证类型id
     */
    private BigDecimal invoicetypeid;

    /**
     * 是否检测 1 是，2否
     */
    private String ischeck;

    /**
     * 期初迁移的数据在老系统的发票流水号
     */
    private String invId;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 客户英文名称
     */
    private String customernameen;

    /**
     * 最后操作员代码
     */
    private String lastopcode;

    /**
     * 红冲发票流水号
     */
    private BigDecimal coseqinvoice;

    /**
     * 客户组代码
     */
    private String customerpartyno;

    /**
     * 打印序号
     */
    private BigDecimal seqprint;

    /**
     * 尚洋系统发票所属网点代码
     */
    private String printdept;

    /**
     * 小币种相关，区分发票保单信息来源，‘1’--来自MM_POLICYSETTLEMENT_TD,0--来自MM_POLICY_TD
     */
    private String sourcetype;

    /**
     * 广东在线发票系统生成的机打发票号
     */
    private String geninvoiceno;

    /**
     * 广东在线发票系统生成的机打发票代码
     */
    private String geninvoicecode;

    /**
     * 客户电话号码
     */
    private String customertel;

    /**
     * 客户证件类型
     */
    private String credittype;

    /**
     * 客户证件号码
     */
    private String creditno;

    /**
     * 发票批次号即印刷流水号中的前7位
     */
    private String invoicebatchno;

    /**
     * 发票打印名称
     */
    private String printname;

    /**
     * 发票红冲时此值对应原发票信息的seqinvoice值
     */
    private BigDecimal fatherno;

    /**
     * 发票红冲时此值对应新生成的负数发票信息的seqinvoice值
     */
    private BigDecimal sonno;

    /**
     * 校验码
     */
    private String securitycode;

    /**
     * 保险条款代码
     */
    private String classesitemcode;

    /**
     * 保险条款名称
     */
    private String classesitemname;

    /**
     * 多险种组合名称
     */
    private String combname;

    /**
     * 第三方发票抬头审核状态 0 表示未审核 1 审核通过 2 审核失败 空 表示不用审核
     */
    private String auditstatus;

    /**
     * 审核意见
     */
    private String auditsugstn;

    /**
     * 是否打印车牌号0不打印，1打印
     */
    private String isbrand;

    /**
     * 约定汇率
     */
    private BigDecimal exchangerate;

    /**
     * 结算单号
     */
    private String handoverno;

    /**
     * 纳税人代码
     */
    private String taxpayercode;

    /**
     * 纳税人识别号
     */
    private String taxpayer;

    /**
     * 纳税人地址
     */
    private String taxesaddress;

    /**
     * 纳税人电话
     */
    private String taxesphone;

    /**
     * 纳税人开户银行
     */
    private String taxesbankname;

    /**
     * 纳税人开户银行账号
     */
    private String taxesaccountno;

    /**
     * 纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
     */
    private String taxespayertype;

    /**
     * 开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
     */
    private String kplx;

    /**
     * 合计金额
     */
    private BigDecimal hjje;

    /**
     * 合计税额
     */
    private BigDecimal hjse;

    /**
     * 发送增值税平台状态 00 初始状态 10 处理中 11发送成功 12 同步短链接成功 ZZ失败
     */
    private String sendstatus;

    /**
     * 返回代码
     */
    private String returncode;

    /**
     * 返回信息
     */
    private String returnmsg;

    /**
     * 不含税条款金额
     */
    private BigDecimal exclusivetaxamount;

    /**
     * 发票代码
     */
    private String invoicecode;

    /**
     * 销货单位税号
     */
    private String xsdwsh;

    /**
     * 联系邮箱
     */
    private String email;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 原发票代码
     */
    private String yfpdm;

    /**
     * 原发票号码
     */
    private String yfphm;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 财务机构名称
     */
    private String unitname;

    /**
     * 购买方名称
     */
    private String taxsalesname;

    /**
     * 购买方税号
     */
    private String taxsales;

    /**
     * 发票税率
     */
    private BigDecimal invoicetaxrate;

    /**
     * 发票校验状态,11成功，00未校验，99失败
     */
    private String invoiceverificationstatus;

    /**
     * 发票失败原因
     */
    private String invoicefailurereason;

    /**
     * 纳税人名称
     */
    private String taxpayername;

    /**
     * 是否打印明细,0不打印，1打印
     */
    private String ifprintsaleslist;

    /**
     * 税金金额，保留2位数
     */
    private BigDecimal taxamount1;

    /**
     * 税金金额，保留6位数
     */
    private BigDecimal taxamount;

    /**
    * 获取-主键
    * @return seqinvoice
     */
    public Long getSeqinvoice() {
        return seqinvoice;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqinvoice - 主键
     */
    public void setSeqinvoice(Long seqinvoice) {
        this.seqinvoice = seqinvoice;
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
    * 获取-保单币种，系统规定发票币种和保单币种必须一致
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-保单币种，系统规定发票币种和保单币种必须一致
    * @paramType java.lang.String
    * @param currencycode - 保单币种，系统规定发票币种和保单币种必须一致
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-发票金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-发票金额
    * @paramType java.math.BigDecimal
    * @param amount - 发票金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-核销状态 0初始状态 1部分核销 2全部核销 3 作废  4 被红冲  5 红冲
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-核销状态 0初始状态 1部分核销 2全部核销 3 作废  4 被红冲  5 红冲
    * @paramType java.lang.String
    * @param opstatus - 核销状态 0初始状态 1部分核销 2全部核销 3 作废  4 被红冲  5 红冲
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
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
    * 获取-发票类型：1 保单发票、2 赔款发票、 3 共保出单费发票
    * @return invoicetype
     */
    public String getInvoicetype() {
        return invoicetype;
    }

    /**
    * 设置-发票类型：1 保单发票、2 赔款发票、 3 共保出单费发票
    * @paramType java.lang.String
    * @param invoicetype - 发票类型：1 保单发票、2 赔款发票、 3 共保出单费发票
     */
    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    /**
    * 获取-结算单号
    * @return handid
     */
    public String getHandid() {
        return handid;
    }

    /**
    * 设置-结算单号
    * @paramType java.lang.String
    * @param handid - 结算单号
     */
    public void setHandid(String handid) {
        this.handid = handid;
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
    * 获取-记录发票打印的次数
    * @return opcount
     */
    public BigDecimal getOpcount() {
        return opcount;
    }

    /**
    * 设置-记录发票打印的次数
    * @paramType java.math.BigDecimal
    * @param opcount - 记录发票打印的次数
     */
    public void setOpcount(BigDecimal opcount) {
        this.opcount = opcount;
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
    * 获取-核保员名称，对应datacenter:document.hby
    * @return underwritername
     */
    public String getUnderwritername() {
        return underwritername;
    }

    /**
    * 设置-核保员名称，对应datacenter:document.hby
    * @paramType java.lang.String
    * @param underwritername - 核保员名称，对应datacenter:document.hby
     */
    public void setUnderwritername(String underwritername) {
        this.underwritername = underwritername;
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
    * 获取-经办人名称，此处应记录汉字名称
    * @return transactorname
     */
    public String getTransactorname() {
        return transactorname;
    }

    /**
    * 设置-经办人名称，此处应记录汉字名称
    * @paramType java.lang.String
    * @param transactorname - 经办人名称，此处应记录汉字名称
     */
    public void setTransactorname(String transactorname) {
        this.transactorname = transactorname;
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
    * 获取-借发票约定到款日期
    * @return datedate
     */
    public Date getDatedate() {
        return datedate;
    }

    /**
    * 设置-借发票约定到款日期
    * @paramType java.util.Date
    * @param datedate - 借发票约定到款日期
     */
    public void setDatedate(Date datedate) {
        this.datedate = datedate;
    }

    /**
    * 获取-借票人代码
    * @return borrowercode
     */
    public String getBorrowercode() {
        return borrowercode;
    }

    /**
    * 设置-借票人代码
    * @paramType java.lang.String
    * @param borrowercode - 借票人代码
     */
    public void setBorrowercode(String borrowercode) {
        this.borrowercode = borrowercode;
    }

    /**
    * 获取-计划帐龄天数
    * @return planterm
     */
    public BigDecimal getPlanterm() {
        return planterm;
    }

    /**
    * 设置-计划帐龄天数
    * @paramType java.math.BigDecimal
    * @param planterm - 计划帐龄天数
     */
    public void setPlanterm(BigDecimal planterm) {
        this.planterm = planterm;
    }

    /**
    * 获取-批准人代码
    * @return ratifiercode
     */
    public String getRatifiercode() {
        return ratifiercode;
    }

    /**
    * 设置-批准人代码
    * @paramType java.lang.String
    * @param ratifiercode - 批准人代码
     */
    public void setRatifiercode(String ratifiercode) {
        this.ratifiercode = ratifiercode;
    }

    /**
    * 获取-批准日期
    * @return ratifydate
     */
    public Date getRatifydate() {
        return ratifydate;
    }

    /**
    * 设置-批准日期
    * @paramType java.util.Date
    * @param ratifydate - 批准日期
     */
    public void setRatifydate(Date ratifydate) {
        this.ratifydate = ratifydate;
    }

    /**
    * 获取-打印人代码
    * @return printercode
     */
    public String getPrintercode() {
        return printercode;
    }

    /**
    * 设置-打印人代码
    * @paramType java.lang.String
    * @param printercode - 打印人代码
     */
    public void setPrintercode(String printercode) {
        this.printercode = printercode;
    }

    /**
    * 获取-打印日期
    * @return printdate
     */
    public Date getPrintdate() {
        return printdate;
    }

    /**
    * 设置-打印日期
    * @paramType java.util.Date
    * @param printdate - 打印日期
     */
    public void setPrintdate(Date printdate) {
        this.printdate = printdate;
    }

    /**
    * 获取-0未打印 1已打印
    * @return ifprinted
     */
    public String getIfprinted() {
        return ifprinted;
    }

    /**
    * 设置-0未打印 1已打印
    * @paramType java.lang.String
    * @param ifprinted - 0未打印 1已打印
     */
    public void setIfprinted(String ifprinted) {
        this.ifprinted = ifprinted;
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
    * 获取-单证类型id
    * @return invoicetypeid
     */
    public BigDecimal getInvoicetypeid() {
        return invoicetypeid;
    }

    /**
    * 设置-单证类型id
    * @paramType java.math.BigDecimal
    * @param invoicetypeid - 单证类型id
     */
    public void setInvoicetypeid(BigDecimal invoicetypeid) {
        this.invoicetypeid = invoicetypeid;
    }

    /**
    * 获取-是否检测 1 是，2否
    * @return ischeck
     */
    public String getIscheck() {
        return ischeck;
    }

    /**
    * 设置-是否检测 1 是，2否
    * @paramType java.lang.String
    * @param ischeck - 是否检测 1 是，2否
     */
    public void setIscheck(String ischeck) {
        this.ischeck = ischeck;
    }

    /**
    * 获取-期初迁移的数据在老系统的发票流水号
    * @return invId
     */
    public String getInvId() {
        return invId;
    }

    /**
    * 设置-期初迁移的数据在老系统的发票流水号
    * @paramType java.lang.String
    * @param invId - 期初迁移的数据在老系统的发票流水号
     */
    public void setInvId(String invId) {
        this.invId = invId;
    }

    /**
    * 获取-数据来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-数据来源
    * @paramType java.lang.String
    * @param datasource - 数据来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
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
    * 获取-客户英文名称
    * @return customernameen
     */
    public String getCustomernameen() {
        return customernameen;
    }

    /**
    * 设置-客户英文名称
    * @paramType java.lang.String
    * @param customernameen - 客户英文名称
     */
    public void setCustomernameen(String customernameen) {
        this.customernameen = customernameen;
    }

    /**
    * 获取-最后操作员代码
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后操作员代码
    * @paramType java.lang.String
    * @param lastopcode - 最后操作员代码
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
    }

    /**
    * 获取-红冲发票流水号
    * @return coseqinvoice
     */
    public BigDecimal getCoseqinvoice() {
        return coseqinvoice;
    }

    /**
    * 设置-红冲发票流水号
    * @paramType java.math.BigDecimal
    * @param coseqinvoice - 红冲发票流水号
     */
    public void setCoseqinvoice(BigDecimal coseqinvoice) {
        this.coseqinvoice = coseqinvoice;
    }

    /**
    * 获取-客户组代码
    * @return customerpartyno
     */
    public String getCustomerpartyno() {
        return customerpartyno;
    }

    /**
    * 设置-客户组代码
    * @paramType java.lang.String
    * @param customerpartyno - 客户组代码
     */
    public void setCustomerpartyno(String customerpartyno) {
        this.customerpartyno = customerpartyno;
    }

    /**
    * 获取-打印序号
    * @return seqprint
     */
    public BigDecimal getSeqprint() {
        return seqprint;
    }

    /**
    * 设置-打印序号
    * @paramType java.math.BigDecimal
    * @param seqprint - 打印序号
     */
    public void setSeqprint(BigDecimal seqprint) {
        this.seqprint = seqprint;
    }

    /**
    * 获取-尚洋系统发票所属网点代码
    * @return printdept
     */
    public String getPrintdept() {
        return printdept;
    }

    /**
    * 设置-尚洋系统发票所属网点代码
    * @paramType java.lang.String
    * @param printdept - 尚洋系统发票所属网点代码
     */
    public void setPrintdept(String printdept) {
        this.printdept = printdept;
    }

    /**
    * 获取-小币种相关，区分发票保单信息来源，‘1’--来自MM_POLICYSETTLEMENT_TD,0--来自MM_POLICY_TD
    * @return sourcetype
     */
    public String getSourcetype() {
        return sourcetype;
    }

    /**
    * 设置-小币种相关，区分发票保单信息来源，‘1’--来自MM_POLICYSETTLEMENT_TD,0--来自MM_POLICY_TD
    * @paramType java.lang.String
    * @param sourcetype - 小币种相关，区分发票保单信息来源，‘1’--来自MM_POLICYSETTLEMENT_TD,0--来自MM_POLICY_TD
     */
    public void setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype;
    }

    /**
    * 获取-广东在线发票系统生成的机打发票号
    * @return geninvoiceno
     */
    public String getGeninvoiceno() {
        return geninvoiceno;
    }

    /**
    * 设置-广东在线发票系统生成的机打发票号
    * @paramType java.lang.String
    * @param geninvoiceno - 广东在线发票系统生成的机打发票号
     */
    public void setGeninvoiceno(String geninvoiceno) {
        this.geninvoiceno = geninvoiceno;
    }

    /**
    * 获取-广东在线发票系统生成的机打发票代码
    * @return geninvoicecode
     */
    public String getGeninvoicecode() {
        return geninvoicecode;
    }

    /**
    * 设置-广东在线发票系统生成的机打发票代码
    * @paramType java.lang.String
    * @param geninvoicecode - 广东在线发票系统生成的机打发票代码
     */
    public void setGeninvoicecode(String geninvoicecode) {
        this.geninvoicecode = geninvoicecode;
    }

    /**
    * 获取-客户电话号码
    * @return customertel
     */
    public String getCustomertel() {
        return customertel;
    }

    /**
    * 设置-客户电话号码
    * @paramType java.lang.String
    * @param customertel - 客户电话号码
     */
    public void setCustomertel(String customertel) {
        this.customertel = customertel;
    }

    /**
    * 获取-客户证件类型
    * @return credittype
     */
    public String getCredittype() {
        return credittype;
    }

    /**
    * 设置-客户证件类型
    * @paramType java.lang.String
    * @param credittype - 客户证件类型
     */
    public void setCredittype(String credittype) {
        this.credittype = credittype;
    }

    /**
    * 获取-客户证件号码
    * @return creditno
     */
    public String getCreditno() {
        return creditno;
    }

    /**
    * 设置-客户证件号码
    * @paramType java.lang.String
    * @param creditno - 客户证件号码
     */
    public void setCreditno(String creditno) {
        this.creditno = creditno;
    }

    /**
    * 获取-发票批次号即印刷流水号中的前7位
    * @return invoicebatchno
     */
    public String getInvoicebatchno() {
        return invoicebatchno;
    }

    /**
    * 设置-发票批次号即印刷流水号中的前7位
    * @paramType java.lang.String
    * @param invoicebatchno - 发票批次号即印刷流水号中的前7位
     */
    public void setInvoicebatchno(String invoicebatchno) {
        this.invoicebatchno = invoicebatchno;
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
    * 获取-发票红冲时此值对应原发票信息的seqinvoice值
    * @return fatherno
     */
    public BigDecimal getFatherno() {
        return fatherno;
    }

    /**
    * 设置-发票红冲时此值对应原发票信息的seqinvoice值
    * @paramType java.math.BigDecimal
    * @param fatherno - 发票红冲时此值对应原发票信息的seqinvoice值
     */
    public void setFatherno(BigDecimal fatherno) {
        this.fatherno = fatherno;
    }

    /**
    * 获取-发票红冲时此值对应新生成的负数发票信息的seqinvoice值
    * @return sonno
     */
    public BigDecimal getSonno() {
        return sonno;
    }

    /**
    * 设置-发票红冲时此值对应新生成的负数发票信息的seqinvoice值
    * @paramType java.math.BigDecimal
    * @param sonno - 发票红冲时此值对应新生成的负数发票信息的seqinvoice值
     */
    public void setSonno(BigDecimal sonno) {
        this.sonno = sonno;
    }

    /**
    * 获取-校验码
    * @return securitycode
     */
    public String getSecuritycode() {
        return securitycode;
    }

    /**
    * 设置-校验码
    * @paramType java.lang.String
    * @param securitycode - 校验码
     */
    public void setSecuritycode(String securitycode) {
        this.securitycode = securitycode;
    }

    /**
    * 获取-保险条款代码
    * @return classesitemcode
     */
    public String getClassesitemcode() {
        return classesitemcode;
    }

    /**
    * 设置-保险条款代码
    * @paramType java.lang.String
    * @param classesitemcode - 保险条款代码
     */
    public void setClassesitemcode(String classesitemcode) {
        this.classesitemcode = classesitemcode;
    }

    /**
    * 获取-保险条款名称
    * @return classesitemname
     */
    public String getClassesitemname() {
        return classesitemname;
    }

    /**
    * 设置-保险条款名称
    * @paramType java.lang.String
    * @param classesitemname - 保险条款名称
     */
    public void setClassesitemname(String classesitemname) {
        this.classesitemname = classesitemname;
    }

    /**
    * 获取-多险种组合名称
    * @return combname
     */
    public String getCombname() {
        return combname;
    }

    /**
    * 设置-多险种组合名称
    * @paramType java.lang.String
    * @param combname - 多险种组合名称
     */
    public void setCombname(String combname) {
        this.combname = combname;
    }

    /**
    * 获取-第三方发票抬头审核状态 0 表示未审核 1 审核通过 2 审核失败 空 表示不用审核
    * @return auditstatus
     */
    public String getAuditstatus() {
        return auditstatus;
    }

    /**
    * 设置-第三方发票抬头审核状态 0 表示未审核 1 审核通过 2 审核失败 空 表示不用审核
    * @paramType java.lang.String
    * @param auditstatus - 第三方发票抬头审核状态 0 表示未审核 1 审核通过 2 审核失败 空 表示不用审核
     */
    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus;
    }

    /**
    * 获取-审核意见
    * @return auditsugstn
     */
    public String getAuditsugstn() {
        return auditsugstn;
    }

    /**
    * 设置-审核意见
    * @paramType java.lang.String
    * @param auditsugstn - 审核意见
     */
    public void setAuditsugstn(String auditsugstn) {
        this.auditsugstn = auditsugstn;
    }

    /**
    * 获取-是否打印车牌号0不打印，1打印
    * @return isbrand
     */
    public String getIsbrand() {
        return isbrand;
    }

    /**
    * 设置-是否打印车牌号0不打印，1打印
    * @paramType java.lang.String
    * @param isbrand - 是否打印车牌号0不打印，1打印
     */
    public void setIsbrand(String isbrand) {
        this.isbrand = isbrand;
    }

    /**
    * 获取-约定汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-约定汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 约定汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
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

    /**
    * 获取-纳税人代码
    * @return taxpayercode
     */
    public String getTaxpayercode() {
        return taxpayercode;
    }

    /**
    * 设置-纳税人代码
    * @paramType java.lang.String
    * @param taxpayercode - 纳税人代码
     */
    public void setTaxpayercode(String taxpayercode) {
        this.taxpayercode = taxpayercode;
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
    * 获取-纳税人地址
    * @return taxesaddress
     */
    public String getTaxesaddress() {
        return taxesaddress;
    }

    /**
    * 设置-纳税人地址
    * @paramType java.lang.String
    * @param taxesaddress - 纳税人地址
     */
    public void setTaxesaddress(String taxesaddress) {
        this.taxesaddress = taxesaddress;
    }

    /**
    * 获取-纳税人电话
    * @return taxesphone
     */
    public String getTaxesphone() {
        return taxesphone;
    }

    /**
    * 设置-纳税人电话
    * @paramType java.lang.String
    * @param taxesphone - 纳税人电话
     */
    public void setTaxesphone(String taxesphone) {
        this.taxesphone = taxesphone;
    }

    /**
    * 获取-纳税人开户银行
    * @return taxesbankname
     */
    public String getTaxesbankname() {
        return taxesbankname;
    }

    /**
    * 设置-纳税人开户银行
    * @paramType java.lang.String
    * @param taxesbankname - 纳税人开户银行
     */
    public void setTaxesbankname(String taxesbankname) {
        this.taxesbankname = taxesbankname;
    }

    /**
    * 获取-纳税人开户银行账号
    * @return taxesaccountno
     */
    public String getTaxesaccountno() {
        return taxesaccountno;
    }

    /**
    * 设置-纳税人开户银行账号
    * @paramType java.lang.String
    * @param taxesaccountno - 纳税人开户银行账号
     */
    public void setTaxesaccountno(String taxesaccountno) {
        this.taxesaccountno = taxesaccountno;
    }

    /**
    * 获取-纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
    * @return taxespayertype
     */
    public String getTaxespayertype() {
        return taxespayertype;
    }

    /**
    * 设置-纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
    * @paramType java.lang.String
    * @param taxespayertype - 纳税人身份：01增值税一般纳税人 02增值税小规模纳税人 03非增值税纳税人 04个人 05其他
     */
    public void setTaxespayertype(String taxespayertype) {
        this.taxespayertype = taxespayertype;
    }

    /**
    * 获取-开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
    * @return kplx
     */
    public String getKplx() {
        return kplx;
    }

    /**
    * 设置-开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
    * @paramType java.lang.String
    * @param kplx - 开具发票类型：004增值税专用发票 007增值税普通发票 026电子发票 000其他或暂不开票
     */
    public void setKplx(String kplx) {
        this.kplx = kplx;
    }

    /**
    * 获取-合计金额
    * @return hjje
     */
    public BigDecimal getHjje() {
        return hjje;
    }

    /**
    * 设置-合计金额
    * @paramType java.math.BigDecimal
    * @param hjje - 合计金额
     */
    public void setHjje(BigDecimal hjje) {
        this.hjje = hjje;
    }

    /**
    * 获取-合计税额
    * @return hjse
     */
    public BigDecimal getHjse() {
        return hjse;
    }

    /**
    * 设置-合计税额
    * @paramType java.math.BigDecimal
    * @param hjse - 合计税额
     */
    public void setHjse(BigDecimal hjse) {
        this.hjse = hjse;
    }

    /**
    * 获取-发送增值税平台状态 00 初始状态 10 处理中 11发送成功 12 同步短链接成功 ZZ失败
    * @return sendstatus
     */
    public String getSendstatus() {
        return sendstatus;
    }

    /**
    * 设置-发送增值税平台状态 00 初始状态 10 处理中 11发送成功 12 同步短链接成功 ZZ失败
    * @paramType java.lang.String
    * @param sendstatus - 发送增值税平台状态 00 初始状态 10 处理中 11发送成功 12 同步短链接成功 ZZ失败
     */
    public void setSendstatus(String sendstatus) {
        this.sendstatus = sendstatus;
    }

    /**
    * 获取-返回代码
    * @return returncode
     */
    public String getReturncode() {
        return returncode;
    }

    /**
    * 设置-返回代码
    * @paramType java.lang.String
    * @param returncode - 返回代码
     */
    public void setReturncode(String returncode) {
        this.returncode = returncode;
    }

    /**
    * 获取-返回信息
    * @return returnmsg
     */
    public String getReturnmsg() {
        return returnmsg;
    }

    /**
    * 设置-返回信息
    * @paramType java.lang.String
    * @param returnmsg - 返回信息
     */
    public void setReturnmsg(String returnmsg) {
        this.returnmsg = returnmsg;
    }

    /**
    * 获取-不含税条款金额
    * @return exclusivetaxamount
     */
    public BigDecimal getExclusivetaxamount() {
        return exclusivetaxamount;
    }

    /**
    * 设置-不含税条款金额
    * @paramType java.math.BigDecimal
    * @param exclusivetaxamount - 不含税条款金额
     */
    public void setExclusivetaxamount(BigDecimal exclusivetaxamount) {
        this.exclusivetaxamount = exclusivetaxamount;
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
    * 获取-销货单位税号
    * @return xsdwsh
     */
    public String getXsdwsh() {
        return xsdwsh;
    }

    /**
    * 设置-销货单位税号
    * @paramType java.lang.String
    * @param xsdwsh - 销货单位税号
     */
    public void setXsdwsh(String xsdwsh) {
        this.xsdwsh = xsdwsh;
    }

    /**
    * 获取-联系邮箱
    * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
    * 设置-联系邮箱
    * @paramType java.lang.String
    * @param email - 联系邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
    * 获取-联系电话
    * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
    * 设置-联系电话
    * @paramType java.lang.String
    * @param phone - 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
    * 获取-原发票代码
    * @return yfpdm
     */
    public String getYfpdm() {
        return yfpdm;
    }

    /**
    * 设置-原发票代码
    * @paramType java.lang.String
    * @param yfpdm - 原发票代码
     */
    public void setYfpdm(String yfpdm) {
        this.yfpdm = yfpdm;
    }

    /**
    * 获取-原发票号码
    * @return yfphm
     */
    public String getYfphm() {
        return yfphm;
    }

    /**
    * 设置-原发票号码
    * @paramType java.lang.String
    * @param yfphm - 原发票号码
     */
    public void setYfphm(String yfphm) {
        this.yfphm = yfphm;
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
    * 获取-购买方名称
    * @return taxsalesname
     */
    public String getTaxsalesname() {
        return taxsalesname;
    }

    /**
    * 设置-购买方名称
    * @paramType java.lang.String
    * @param taxsalesname - 购买方名称
     */
    public void setTaxsalesname(String taxsalesname) {
        this.taxsalesname = taxsalesname;
    }

    /**
    * 获取-购买方税号
    * @return taxsales
     */
    public String getTaxsales() {
        return taxsales;
    }

    /**
    * 设置-购买方税号
    * @paramType java.lang.String
    * @param taxsales - 购买方税号
     */
    public void setTaxsales(String taxsales) {
        this.taxsales = taxsales;
    }

    /**
    * 获取-发票税率
    * @return invoicetaxrate
     */
    public BigDecimal getInvoicetaxrate() {
        return invoicetaxrate;
    }

    /**
    * 设置-发票税率
    * @paramType java.math.BigDecimal
    * @param invoicetaxrate - 发票税率
     */
    public void setInvoicetaxrate(BigDecimal invoicetaxrate) {
        this.invoicetaxrate = invoicetaxrate;
    }

    /**
    * 获取-发票校验状态,11成功，00未校验，99失败
    * @return invoiceverificationstatus
     */
    public String getInvoiceverificationstatus() {
        return invoiceverificationstatus;
    }

    /**
    * 设置-发票校验状态,11成功，00未校验，99失败
    * @paramType java.lang.String
    * @param invoiceverificationstatus - 发票校验状态,11成功，00未校验，99失败
     */
    public void setInvoiceverificationstatus(String invoiceverificationstatus) {
        this.invoiceverificationstatus = invoiceverificationstatus;
    }

    /**
    * 获取-发票失败原因
    * @return invoicefailurereason
     */
    public String getInvoicefailurereason() {
        return invoicefailurereason;
    }

    /**
    * 设置-发票失败原因
    * @paramType java.lang.String
    * @param invoicefailurereason - 发票失败原因
     */
    public void setInvoicefailurereason(String invoicefailurereason) {
        this.invoicefailurereason = invoicefailurereason;
    }

    /**
    * 获取-纳税人名称
    * @return taxpayername
     */
    public String getTaxpayername() {
        return taxpayername;
    }

    /**
    * 设置-纳税人名称
    * @paramType java.lang.String
    * @param taxpayername - 纳税人名称
     */
    public void setTaxpayername(String taxpayername) {
        this.taxpayername = taxpayername;
    }

    /**
    * 获取-是否打印明细,0不打印，1打印
    * @return ifprintsaleslist
     */
    public String getIfprintsaleslist() {
        return ifprintsaleslist;
    }

    /**
    * 设置-是否打印明细,0不打印，1打印
    * @paramType java.lang.String
    * @param ifprintsaleslist - 是否打印明细,0不打印，1打印
     */
    public void setIfprintsaleslist(String ifprintsaleslist) {
        this.ifprintsaleslist = ifprintsaleslist;
    }

    /**
    * 获取-税金金额，保留2位数
    * @return taxamount1
     */
    public BigDecimal getTaxamount1() {
        return taxamount1;
    }

    /**
    * 设置-税金金额，保留2位数
    * @paramType java.math.BigDecimal
    * @param taxamount1 - 税金金额，保留2位数
     */
    public void setTaxamount1(BigDecimal taxamount1) {
        this.taxamount1 = taxamount1;
    }

    /**
    * 获取-税金金额，保留6位数
    * @return taxamount
     */
    public BigDecimal getTaxamount() {
        return taxamount;
    }

    /**
    * 设置-税金金额，保留6位数
    * @paramType java.math.BigDecimal
    * @param taxamount - 税金金额，保留6位数
     */
    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }
}