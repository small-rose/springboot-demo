package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_inpayment_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInpaymentTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 支付号
     */
    private String inpaymentno;

    /**
     * 银行代码
     */
    private String bankno;

    /**
     * 支付申请日期 
     */
    private Date inpaymentdate;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 时间戳 
     */
    private Date timestamp;

    /**
     * 本批次收款金额
     */
    private BigDecimal amount;

    /**
     * 收款币种 
     */
    private String currencycode;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 标志位 0 待确认 1 已确认未核销 2 已核销 3 确认失败 4 确认失败再提交 5 注销
     */
    private String status;

    /**
     * 保险公司代码
     */
    private String insurancecompanycode;

    /**
     * 商户号
     */
    private String businessno;

    /**
     * 终端号
     */
    private String terminalno;

    /**
     * 银行交易流水号
     */
    private String banktransactionsno;

    /**
     * 交易类型
     */
    private String transactiontype;

    /**
     * 卡号
     */
    private String cardno;

    /**
     * 交易时间
     */
    private String inpaymenttime;

    /**
     * 1 POS  2 支票 3 贷记凭证 4 银行柜面收款 5 银行转账 6 其他  7 微信 8 支付宝
     */
    private String inpaymenttype;

    /**
     * mm_usablemoney_td主键
     */
    private Long useableno;

    /**
     * 对帐文件批次
     */
    private BigDecimal batchid2;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * HIBERNATEVERSION版本号
     */
    private Long hibernateversion;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称（中文）
     */
    private String customername;

    /**
     * 收付交易数据的客户名称（英文
     */
    private String customernameen;

    /**
     * 客户partyno
     */
    private String customerpartyno;

    /**
     * 客户银行名称
     */
    private String bankname;

    /**
     * 客户帐号
     */
    private String custaccountno;

    /**
     * 支付申请确认日期
     */
    private Date paydate;

    /**
     * 支付申请信息确认接口返回信息 100 成功;0 不可控错误，请找承保方联系;1 实收保费和应收保费币别不同，保费确认失败，需走人工确认流程;2 实收保费不足，保费确认失败，请即通知市场部门 ;3  因保单起保日期原因，保费确认失败，请即通知出单部门 ;4  实收保费晚于投保日期10天，保费确认失败，请即通知出单部门;5 保费实际付款人与保单上列明的付款人和投保人不一致, 保费确认失败，请即通知市场部门
     */
    private String returnmsg;

    /**
     * 手续费
     */
    private BigDecimal feeamount;

    /**
     * 操作日期
     */
    private Date opdate;

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
    * 获取-支付号
    * @return inpaymentno
     */
    public String getInpaymentno() {
        return inpaymentno;
    }

    /**
    * 设置-支付号
    * @paramType java.lang.String
    * @param inpaymentno - 支付号
     */
    public void setInpaymentno(String inpaymentno) {
        this.inpaymentno = inpaymentno;
    }

    /**
    * 获取-银行代码
    * @return bankno
     */
    public String getBankno() {
        return bankno;
    }

    /**
    * 设置-银行代码
    * @paramType java.lang.String
    * @param bankno - 银行代码
     */
    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    /**
    * 获取-支付申请日期 
    * @return inpaymentdate
     */
    public Date getInpaymentdate() {
        return inpaymentdate;
    }

    /**
    * 设置-支付申请日期 
    * @paramType java.util.Date
    * @param inpaymentdate - 支付申请日期 
     */
    public void setInpaymentdate(Date inpaymentdate) {
        this.inpaymentdate = inpaymentdate;
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
    * 获取-本批次收款金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-本批次收款金额
    * @paramType java.math.BigDecimal
    * @param amount - 本批次收款金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-收款币种 
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-收款币种 
    * @paramType java.lang.String
    * @param currencycode - 收款币种 
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
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
    * 获取-标志位 0 待确认 1 已确认未核销 2 已核销 3 确认失败 4 确认失败再提交 5 注销
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-标志位 0 待确认 1 已确认未核销 2 已核销 3 确认失败 4 确认失败再提交 5 注销
    * @paramType java.lang.String
    * @param status - 标志位 0 待确认 1 已确认未核销 2 已核销 3 确认失败 4 确认失败再提交 5 注销
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-保险公司代码
    * @return insurancecompanycode
     */
    public String getInsurancecompanycode() {
        return insurancecompanycode;
    }

    /**
    * 设置-保险公司代码
    * @paramType java.lang.String
    * @param insurancecompanycode - 保险公司代码
     */
    public void setInsurancecompanycode(String insurancecompanycode) {
        this.insurancecompanycode = insurancecompanycode;
    }

    /**
    * 获取-商户号
    * @return businessno
     */
    public String getBusinessno() {
        return businessno;
    }

    /**
    * 设置-商户号
    * @paramType java.lang.String
    * @param businessno - 商户号
     */
    public void setBusinessno(String businessno) {
        this.businessno = businessno;
    }

    /**
    * 获取-终端号
    * @return terminalno
     */
    public String getTerminalno() {
        return terminalno;
    }

    /**
    * 设置-终端号
    * @paramType java.lang.String
    * @param terminalno - 终端号
     */
    public void setTerminalno(String terminalno) {
        this.terminalno = terminalno;
    }

    /**
    * 获取-银行交易流水号
    * @return banktransactionsno
     */
    public String getBanktransactionsno() {
        return banktransactionsno;
    }

    /**
    * 设置-银行交易流水号
    * @paramType java.lang.String
    * @param banktransactionsno - 银行交易流水号
     */
    public void setBanktransactionsno(String banktransactionsno) {
        this.banktransactionsno = banktransactionsno;
    }

    /**
    * 获取-交易类型
    * @return transactiontype
     */
    public String getTransactiontype() {
        return transactiontype;
    }

    /**
    * 设置-交易类型
    * @paramType java.lang.String
    * @param transactiontype - 交易类型
     */
    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    /**
    * 获取-卡号
    * @return cardno
     */
    public String getCardno() {
        return cardno;
    }

    /**
    * 设置-卡号
    * @paramType java.lang.String
    * @param cardno - 卡号
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
    * 获取-交易时间
    * @return inpaymenttime
     */
    public String getInpaymenttime() {
        return inpaymenttime;
    }

    /**
    * 设置-交易时间
    * @paramType java.lang.String
    * @param inpaymenttime - 交易时间
     */
    public void setInpaymenttime(String inpaymenttime) {
        this.inpaymenttime = inpaymenttime;
    }

    /**
    * 获取-1 POS  2 支票 3 贷记凭证 4 银行柜面收款 5 银行转账 6 其他  7 微信 8 支付宝
    * @return inpaymenttype
     */
    public String getInpaymenttype() {
        return inpaymenttype;
    }

    /**
    * 设置-1 POS  2 支票 3 贷记凭证 4 银行柜面收款 5 银行转账 6 其他  7 微信 8 支付宝
    * @paramType java.lang.String
    * @param inpaymenttype - 1 POS  2 支票 3 贷记凭证 4 银行柜面收款 5 银行转账 6 其他  7 微信 8 支付宝
     */
    public void setInpaymenttype(String inpaymenttype) {
        this.inpaymenttype = inpaymenttype;
    }

    /**
    * 获取-mm_usablemoney_td主键
    * @return useableno
     */
    public Long getUseableno() {
        return useableno;
    }

    /**
    * 设置-mm_usablemoney_td主键
    * @paramType java.lang.Long
    * @param useableno - mm_usablemoney_td主键
     */
    public void setUseableno(Long useableno) {
        this.useableno = useableno;
    }

    /**
    * 获取-对帐文件批次
    * @return batchid2
     */
    public BigDecimal getBatchid2() {
        return batchid2;
    }

    /**
    * 设置-对帐文件批次
    * @paramType java.math.BigDecimal
    * @param batchid2 - 对帐文件批次
     */
    public void setBatchid2(BigDecimal batchid2) {
        this.batchid2 = batchid2;
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
    * 获取-HIBERNATEVERSION版本号
    * @return hibernateversion
     */
    public Long getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本号
    * @paramType java.lang.Long
    * @param hibernateversion - HIBERNATEVERSION版本号
     */
    public void setHibernateversion(Long hibernateversion) {
        this.hibernateversion = hibernateversion;
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
    * 获取-备注
    * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param remark - 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
    * 获取-客户名称（中文）
    * @return customername
     */
    public String getCustomername() {
        return customername;
    }

    /**
    * 设置-客户名称（中文）
    * @paramType java.lang.String
    * @param customername - 客户名称（中文）
     */
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    /**
    * 获取-收付交易数据的客户名称（英文
    * @return customernameen
     */
    public String getCustomernameen() {
        return customernameen;
    }

    /**
    * 设置-收付交易数据的客户名称（英文
    * @paramType java.lang.String
    * @param customernameen - 收付交易数据的客户名称（英文
     */
    public void setCustomernameen(String customernameen) {
        this.customernameen = customernameen;
    }

    /**
    * 获取-客户partyno
    * @return customerpartyno
     */
    public String getCustomerpartyno() {
        return customerpartyno;
    }

    /**
    * 设置-客户partyno
    * @paramType java.lang.String
    * @param customerpartyno - 客户partyno
     */
    public void setCustomerpartyno(String customerpartyno) {
        this.customerpartyno = customerpartyno;
    }

    /**
    * 获取-客户银行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-客户银行名称
    * @paramType java.lang.String
    * @param bankname - 客户银行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
    * 获取-客户帐号
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户帐号
    * @paramType java.lang.String
    * @param custaccountno - 客户帐号
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    /**
    * 获取-支付申请确认日期
    * @return paydate
     */
    public Date getPaydate() {
        return paydate;
    }

    /**
    * 设置-支付申请确认日期
    * @paramType java.util.Date
    * @param paydate - 支付申请确认日期
     */
    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    /**
    * 获取-支付申请信息确认接口返回信息 100 成功;0 不可控错误，请找承保方联系;1 实收保费和应收保费币别不同，保费确认失败，需走人工确认流程;2 实收保费不足，保费确认失败，请即通知市场部门 ;3  因保单起保日期原因，保费确认失败，请即通知出单部门 ;4  实收保费晚于投保日期10天，保费确认失败，请即通知出单部门;5 保费实际付款人与保单上列明的付款人和投保人不一致, 保费确认失败，请即通知市场部门
    * @return returnmsg
     */
    public String getReturnmsg() {
        return returnmsg;
    }

    /**
    * 设置-支付申请信息确认接口返回信息 100 成功;0 不可控错误，请找承保方联系;1 实收保费和应收保费币别不同，保费确认失败，需走人工确认流程;2 实收保费不足，保费确认失败，请即通知市场部门 ;3  因保单起保日期原因，保费确认失败，请即通知出单部门 ;4  实收保费晚于投保日期10天，保费确认失败，请即通知出单部门;5 保费实际付款人与保单上列明的付款人和投保人不一致, 保费确认失败，请即通知市场部门
    * @paramType java.lang.String
    * @param returnmsg - 支付申请信息确认接口返回信息 100 成功;0 不可控错误，请找承保方联系;1 实收保费和应收保费币别不同，保费确认失败，需走人工确认流程;2 实收保费不足，保费确认失败，请即通知市场部门 ;3  因保单起保日期原因，保费确认失败，请即通知出单部门 ;4  实收保费晚于投保日期10天，保费确认失败，请即通知出单部门;5 保费实际付款人与保单上列明的付款人和投保人不一致, 保费确认失败，请即通知市场部门
     */
    public void setReturnmsg(String returnmsg) {
        this.returnmsg = returnmsg;
    }

    /**
    * 获取-手续费
    * @return feeamount
     */
    public BigDecimal getFeeamount() {
        return feeamount;
    }

    /**
    * 设置-手续费
    * @paramType java.math.BigDecimal
    * @param feeamount - 手续费
     */
    public void setFeeamount(BigDecimal feeamount) {
        this.feeamount = feeamount;
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
}