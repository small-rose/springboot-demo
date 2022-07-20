package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_usablemoney_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmUsablemoneyTd {
    /**
     * 待核销收款流水号
     */
    private Long usableno;

    /**
     * 备用
     */
    private Long useableseq;

    /**
     * 据此可以到配置表中查询可进行的后续操作类型，参见数据字典
     */
    private String datatype;

    /**
     * 比如收款放预收写收款的流水号，待付款转预收写待付款的流水号，如果是多笔转过来则写9999999999即可
     */
    private Long fatherno;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 币种（记账币种）
     */
    private String currencycode;

    /**
     * 金额（记账币种）
     */
    private BigDecimal amount;

    /**
     * 已处理金额（记账币种）
     */
    private BigDecimal usedamount;

    /**
     * 币种（保单币种）
     */
    private String basecurrencycode;

    /**
     * 金额（保单币种）
     */
    private BigDecimal baseamount;

    /**
     * 已处理金额（保单币种）
     */
    private BigDecimal baseusedamount;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 核销状态，0初始 1部分核销 2完全核销 3作废 5已对账
     */
    private String opstatus;

    /**
     * 挂帐日期
     */
    private Date opdate;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 系统时间
     */
    private Date lastopdate;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 摘要
     */
    private String description;

    /**
     * 此记录被作废的系统时间
     */
    private Date canceldate;

    /**
     * 含义改变了，请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history 
     */
    private String datasource;

    /**
     * 取消标志
     */
    private String cancelflag;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 期初迁移的数据在老系统的预收流水号
     */
    private String treatmentno;

    /**
     * 手工修改数据说明，用于标识手工改过的数据；可以通过MODIFYDESC is not null来查手工碰过的数据
     */
    private String modifydesc;

    /**
     * 预约协议号、卡式保单号
     */
    private String protocoltno;

    /**
     * 见费出单已确认投保单或批单金额
     */
    private BigDecimal feeamount;

    /**
     * 客户组代码
     */
    private String customerpartyno;

    /**
     * 客户英文名称
     */
    private String customernameen;

    /**
     * 客户是否日系
     */
    private String custisjapan;

    /**
     * 客户银行代码
     */
    private String custaccountno;

    /**
     * 开户行银行名称
     */
    private String bankname;

    /**
     * 客户开户行代码（开户行联行号）
     */
    private String custbankno;

    /**
     * 经办人信息
     */
    private String transactorinfo;

    /**
     * 是否 预收匹配小额大单：01是，其他都不是
     */
    private String isbatchsettle;

    /**
     * 支付申请号
     */
    private String inpaymentno;

    /**
     * 待确认金额
     */
    private BigDecimal confiramount;

    /**
     * 存储生成方式:0批量导入,1手工录入,2系统接入,3合并流水
     */
    private String createtype;

    /**
     * 对账码
     */
    private String bankabstract;

    /**
     * 客户类型:1对公,2对私
     */
    private String customertype;

    /**
     * 日结状态:0-未日结，1-复核通过
     */
    private String auditstatus;

    /**
     * 收款账户名称
     */
    private String accountname;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 领用人代码（当此字段有值时说明该笔预收款被该操作员领用，其他操作员将无法看到此预收款记录）
     */
    private String processor;

    /**
     * 收款账户id
     */
    private String mmaccountid;

    /**
     * 结算类型
     */
    private String settlementtype;

    /**
     * 认领日期
     */
    private Date claimdate;

    /**
     * 领用状态（0未领用 1已领用）
     */
    private String ifclaim;

    /**
     * 银行账号
     */
    private String accountno;

    /**
     * 状态:1 未导入对账表,2 已导入对账表
     */
    private String status;

    /**
    * 获取-待核销收款流水号
    * @return usableno
     */
    public Long getUsableno() {
        return usableno;
    }

    /**
    * 设置-待核销收款流水号
    * @paramType java.lang.Long
    * @param usableno - 待核销收款流水号
     */
    public void setUsableno(Long usableno) {
        this.usableno = usableno;
    }

    /**
    * 获取-备用
    * @return useableseq
     */
    public Long getUseableseq() {
        return useableseq;
    }

    /**
    * 设置-备用
    * @paramType java.lang.Long
    * @param useableseq - 备用
     */
    public void setUseableseq(Long useableseq) {
        this.useableseq = useableseq;
    }

    /**
    * 获取-据此可以到配置表中查询可进行的后续操作类型，参见数据字典
    * @return datatype
     */
    public String getDatatype() {
        return datatype;
    }

    /**
    * 设置-据此可以到配置表中查询可进行的后续操作类型，参见数据字典
    * @paramType java.lang.String
    * @param datatype - 据此可以到配置表中查询可进行的后续操作类型，参见数据字典
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
    * 获取-比如收款放预收写收款的流水号，待付款转预收写待付款的流水号，如果是多笔转过来则写9999999999即可
    * @return fatherno
     */
    public Long getFatherno() {
        return fatherno;
    }

    /**
    * 设置-比如收款放预收写收款的流水号，待付款转预收写待付款的流水号，如果是多笔转过来则写9999999999即可
    * @paramType java.lang.Long
    * @param fatherno - 比如收款放预收写收款的流水号，待付款转预收写待付款的流水号，如果是多笔转过来则写9999999999即可
     */
    public void setFatherno(Long fatherno) {
        this.fatherno = fatherno;
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
    * 获取-币种（记账币种）
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种（记账币种）
    * @paramType java.lang.String
    * @param currencycode - 币种（记账币种）
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-金额（记账币种）
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param amount - 金额（记账币种）
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-已处理金额（记账币种）
    * @return usedamount
     */
    public BigDecimal getUsedamount() {
        return usedamount;
    }

    /**
    * 设置-已处理金额（记账币种）
    * @paramType java.math.BigDecimal
    * @param usedamount - 已处理金额（记账币种）
     */
    public void setUsedamount(BigDecimal usedamount) {
        this.usedamount = usedamount;
    }

    /**
    * 获取-币种（保单币种）
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-币种（保单币种）
    * @paramType java.lang.String
    * @param basecurrencycode - 币种（保单币种）
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
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
    * 获取-已处理金额（保单币种）
    * @return baseusedamount
     */
    public BigDecimal getBaseusedamount() {
        return baseusedamount;
    }

    /**
    * 设置-已处理金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param baseusedamount - 已处理金额（保单币种）
     */
    public void setBaseusedamount(BigDecimal baseusedamount) {
        this.baseusedamount = baseusedamount;
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
    * 获取-核销状态，0初始 1部分核销 2完全核销 3作废 5已对账
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-核销状态，0初始 1部分核销 2完全核销 3作废 5已对账
    * @paramType java.lang.String
    * @param opstatus - 核销状态，0初始 1部分核销 2完全核销 3作废 5已对账
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-挂帐日期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-挂帐日期
    * @paramType java.util.Date
    * @param opdate - 挂帐日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
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
    * 获取-系统时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-系统时间
    * @paramType java.util.Date
    * @param lastopdate - 系统时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
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
    * 获取-含义改变了，请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history 
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-含义改变了，请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history 
    * @paramType java.lang.String
    * @param datasource - 含义改变了，请参见没有注释的部分 0 系统正常运作产生 1 期初迁入 oracle财务系统:finance 收付系统自己产生:paymentreceive 车险业务系统:auto 非车险业务系统 :core 综合统计：datacenter 期初迁入：history 
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-取消标志
    * @return cancelflag
     */
    public String getCancelflag() {
        return cancelflag;
    }

    /**
    * 设置-取消标志
    * @paramType java.lang.String
    * @param cancelflag - 取消标志
     */
    public void setCancelflag(String cancelflag) {
        this.cancelflag = cancelflag;
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
    * 获取-期初迁移的数据在老系统的预收流水号
    * @return treatmentno
     */
    public String getTreatmentno() {
        return treatmentno;
    }

    /**
    * 设置-期初迁移的数据在老系统的预收流水号
    * @paramType java.lang.String
    * @param treatmentno - 期初迁移的数据在老系统的预收流水号
     */
    public void setTreatmentno(String treatmentno) {
        this.treatmentno = treatmentno;
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
    * 获取-预约协议号、卡式保单号
    * @return protocoltno
     */
    public String getProtocoltno() {
        return protocoltno;
    }

    /**
    * 设置-预约协议号、卡式保单号
    * @paramType java.lang.String
    * @param protocoltno - 预约协议号、卡式保单号
     */
    public void setProtocoltno(String protocoltno) {
        this.protocoltno = protocoltno;
    }

    /**
    * 获取-见费出单已确认投保单或批单金额
    * @return feeamount
     */
    public BigDecimal getFeeamount() {
        return feeamount;
    }

    /**
    * 设置-见费出单已确认投保单或批单金额
    * @paramType java.math.BigDecimal
    * @param feeamount - 见费出单已确认投保单或批单金额
     */
    public void setFeeamount(BigDecimal feeamount) {
        this.feeamount = feeamount;
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
    * 获取-客户是否日系
    * @return custisjapan
     */
    public String getCustisjapan() {
        return custisjapan;
    }

    /**
    * 设置-客户是否日系
    * @paramType java.lang.String
    * @param custisjapan - 客户是否日系
     */
    public void setCustisjapan(String custisjapan) {
        this.custisjapan = custisjapan;
    }

    /**
    * 获取-客户银行代码
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户银行代码
    * @paramType java.lang.String
    * @param custaccountno - 客户银行代码
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    /**
    * 获取-开户行银行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-开户行银行名称
    * @paramType java.lang.String
    * @param bankname - 开户行银行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-客户开户行代码（开户行联行号）
    * @return custbankno
     */
    public String getCustbankno() {
        return custbankno;
    }

    /**
    * 设置-客户开户行代码（开户行联行号）
    * @paramType java.lang.String
    * @param custbankno - 客户开户行代码（开户行联行号）
     */
    public void setCustbankno(String custbankno) {
        this.custbankno = custbankno;
    }

    /**
    * 获取-经办人信息
    * @return transactorinfo
     */
    public String getTransactorinfo() {
        return transactorinfo;
    }

    /**
    * 设置-经办人信息
    * @paramType java.lang.String
    * @param transactorinfo - 经办人信息
     */
    public void setTransactorinfo(String transactorinfo) {
        this.transactorinfo = transactorinfo;
    }

    /**
    * 获取-是否 预收匹配小额大单：01是，其他都不是
    * @return isbatchsettle
     */
    public String getIsbatchsettle() {
        return isbatchsettle;
    }

    /**
    * 设置-是否 预收匹配小额大单：01是，其他都不是
    * @paramType java.lang.String
    * @param isbatchsettle - 是否 预收匹配小额大单：01是，其他都不是
     */
    public void setIsbatchsettle(String isbatchsettle) {
        this.isbatchsettle = isbatchsettle;
    }

    /**
    * 获取-支付申请号
    * @return inpaymentno
     */
    public String getInpaymentno() {
        return inpaymentno;
    }

    /**
    * 设置-支付申请号
    * @paramType java.lang.String
    * @param inpaymentno - 支付申请号
     */
    public void setInpaymentno(String inpaymentno) {
        this.inpaymentno = inpaymentno;
    }

    /**
    * 获取-待确认金额
    * @return confiramount
     */
    public BigDecimal getConfiramount() {
        return confiramount;
    }

    /**
    * 设置-待确认金额
    * @paramType java.math.BigDecimal
    * @param confiramount - 待确认金额
     */
    public void setConfiramount(BigDecimal confiramount) {
        this.confiramount = confiramount;
    }

    /**
    * 获取-存储生成方式:0批量导入,1手工录入,2系统接入,3合并流水
    * @return createtype
     */
    public String getCreatetype() {
        return createtype;
    }

    /**
    * 设置-存储生成方式:0批量导入,1手工录入,2系统接入,3合并流水
    * @paramType java.lang.String
    * @param createtype - 存储生成方式:0批量导入,1手工录入,2系统接入,3合并流水
     */
    public void setCreatetype(String createtype) {
        this.createtype = createtype;
    }

    /**
    * 获取-对账码
    * @return bankabstract
     */
    public String getBankabstract() {
        return bankabstract;
    }

    /**
    * 设置-对账码
    * @paramType java.lang.String
    * @param bankabstract - 对账码
     */
    public void setBankabstract(String bankabstract) {
        this.bankabstract = bankabstract;
    }

    /**
    * 获取-客户类型:1对公,2对私
    * @return customertype
     */
    public String getCustomertype() {
        return customertype;
    }

    /**
    * 设置-客户类型:1对公,2对私
    * @paramType java.lang.String
    * @param customertype - 客户类型:1对公,2对私
     */
    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    /**
    * 获取-日结状态:0-未日结，1-复核通过
    * @return auditstatus
     */
    public String getAuditstatus() {
        return auditstatus;
    }

    /**
    * 设置-日结状态:0-未日结，1-复核通过
    * @paramType java.lang.String
    * @param auditstatus - 日结状态:0-未日结，1-复核通过
     */
    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus;
    }

    /**
    * 获取-收款账户名称
    * @return accountname
     */
    public String getAccountname() {
        return accountname;
    }

    /**
    * 设置-收款账户名称
    * @paramType java.lang.String
    * @param accountname - 收款账户名称
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
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
    * 获取-领用人代码（当此字段有值时说明该笔预收款被该操作员领用，其他操作员将无法看到此预收款记录）
    * @return processor
     */
    public String getProcessor() {
        return processor;
    }

    /**
    * 设置-领用人代码（当此字段有值时说明该笔预收款被该操作员领用，其他操作员将无法看到此预收款记录）
    * @paramType java.lang.String
    * @param processor - 领用人代码（当此字段有值时说明该笔预收款被该操作员领用，其他操作员将无法看到此预收款记录）
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    /**
    * 获取-收款账户id
    * @return mmaccountid
     */
    public String getMmaccountid() {
        return mmaccountid;
    }

    /**
    * 设置-收款账户id
    * @paramType java.lang.String
    * @param mmaccountid - 收款账户id
     */
    public void setMmaccountid(String mmaccountid) {
        this.mmaccountid = mmaccountid;
    }

    /**
    * 获取-结算类型
    * @return settlementtype
     */
    public String getSettlementtype() {
        return settlementtype;
    }

    /**
    * 设置-结算类型
    * @paramType java.lang.String
    * @param settlementtype - 结算类型
     */
    public void setSettlementtype(String settlementtype) {
        this.settlementtype = settlementtype;
    }

    /**
    * 获取-认领日期
    * @return claimdate
     */
    public Date getClaimdate() {
        return claimdate;
    }

    /**
    * 设置-认领日期
    * @paramType java.util.Date
    * @param claimdate - 认领日期
     */
    public void setClaimdate(Date claimdate) {
        this.claimdate = claimdate;
    }

    /**
    * 获取-领用状态（0未领用 1已领用）
    * @return ifclaim
     */
    public String getIfclaim() {
        return ifclaim;
    }

    /**
    * 设置-领用状态（0未领用 1已领用）
    * @paramType java.lang.String
    * @param ifclaim - 领用状态（0未领用 1已领用）
     */
    public void setIfclaim(String ifclaim) {
        this.ifclaim = ifclaim;
    }

    /**
    * 获取-银行账号
    * @return accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
    * 设置-银行账号
    * @paramType java.lang.String
    * @param accountno - 银行账号
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
    * 获取-状态:1 未导入对账表,2 已导入对账表
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态:1 未导入对账表,2 已导入对账表
    * @paramType java.lang.String
    * @param status - 状态:1 未导入对账表,2 已导入对账表
     */
    public void setStatus(String status) {
        this.status = status;
    }
}