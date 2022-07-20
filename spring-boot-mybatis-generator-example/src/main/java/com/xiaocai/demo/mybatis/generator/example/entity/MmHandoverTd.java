package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_handover_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmHandoverTd {
    /**
     * 主键
     */
    private Long seqhandover;

    /**
     * 币种
     */
    private String basecurrencycode;

    /**
     * 结算单号
     */
    private String handoverno;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 代理点
     */
    private String agentcode;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * CHAR(1) 状态
     */
    private String opstatus;

    /**
     * 部门编号
     */
    private String departmentcode;

    /**
     * 操作员代码
     */
    private String opcode;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * DATE Y 结算日期
     */
    private Date settlementdate;

    /**
     * 取消日期
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
     * 险种性质;0－－所有车险，1－－所有车险不含车船税，2－－车船税
     */
    private String insuranceattr;

    /**
     * 结算单类型0－－保批单结算单；1－－手续费结算单
     */
    private String handovertype;

    /**
     * 代理点
     */
    private String agentname;

    /**
     * 手工修改数据描述
     */
    private String modifydesc;

    /**
     * 金额（保单币种）
     */
    private BigDecimal baseamount;

    /**
     * 已核销金额（保单币种）
     */
    private BigDecimal baserealamount;

    /**
     * 客户名称代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 兑换币种
     */
    private String exchangecurrencycode;

    /**
     * 兑换金额
     */
    private BigDecimal exchangeamount;

    /**
     * 兑换汇率
     */
    private BigDecimal exchangerate;

    /**
     * 客户开户行代码（开户行联行号）
     */
    private String custbankno;

    /**
     * 客户银行名称
     */
    private String bankname;

    /**
     * 客户帐号
     */
    private String custaccountno;

    /**
     * 客户账户名称
     */
    private String custaccountname;

    /**
     * 客户开户行所在省份
     */
    private String bankprovince;

    /**
     * 客户开户行所在市
     */
    private String bankcity;

    /**
     * 客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
     */
    private String banktype;

    /**
     * "支付方式： 51 现金付款、 52 银行转账付款、53支票付款 "
     */
    private String paymentmethod;

    /**
    * 获取-主键
    * @return seqhandover
     */
    public Long getSeqhandover() {
        return seqhandover;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param seqhandover - 主键
     */
    public void setSeqhandover(Long seqhandover) {
        this.seqhandover = seqhandover;
    }

    /**
    * 获取-币种
    * @return basecurrencycode
     */
    public String getBasecurrencycode() {
        return basecurrencycode;
    }

    /**
    * 设置-币种
    * @paramType java.lang.String
    * @param basecurrencycode - 币种
     */
    public void setBasecurrencycode(String basecurrencycode) {
        this.basecurrencycode = basecurrencycode;
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
    * 获取-代理点
    * @return agentcode
     */
    public String getAgentcode() {
        return agentcode;
    }

    /**
    * 设置-代理点
    * @paramType java.lang.String
    * @param agentcode - 代理点
     */
    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
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
    * 获取-CHAR(1) 状态
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-CHAR(1) 状态
    * @paramType java.lang.String
    * @param opstatus - CHAR(1) 状态
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-部门编号
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-部门编号
    * @paramType java.lang.String
    * @param departmentcode - 部门编号
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
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
    * 获取-DATE Y 结算日期
    * @return settlementdate
     */
    public Date getSettlementdate() {
        return settlementdate;
    }

    /**
    * 设置-DATE Y 结算日期
    * @paramType java.util.Date
    * @param settlementdate - DATE Y 结算日期
     */
    public void setSettlementdate(Date settlementdate) {
        this.settlementdate = settlementdate;
    }

    /**
    * 获取-取消日期
    * @return canceldate
     */
    public Date getCanceldate() {
        return canceldate;
    }

    /**
    * 设置-取消日期
    * @paramType java.util.Date
    * @param canceldate - 取消日期
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
    * 获取-险种性质;0－－所有车险，1－－所有车险不含车船税，2－－车船税
    * @return insuranceattr
     */
    public String getInsuranceattr() {
        return insuranceattr;
    }

    /**
    * 设置-险种性质;0－－所有车险，1－－所有车险不含车船税，2－－车船税
    * @paramType java.lang.String
    * @param insuranceattr - 险种性质;0－－所有车险，1－－所有车险不含车船税，2－－车船税
     */
    public void setInsuranceattr(String insuranceattr) {
        this.insuranceattr = insuranceattr;
    }

    /**
    * 获取-结算单类型0－－保批单结算单；1－－手续费结算单
    * @return handovertype
     */
    public String getHandovertype() {
        return handovertype;
    }

    /**
    * 设置-结算单类型0－－保批单结算单；1－－手续费结算单
    * @paramType java.lang.String
    * @param handovertype - 结算单类型0－－保批单结算单；1－－手续费结算单
     */
    public void setHandovertype(String handovertype) {
        this.handovertype = handovertype;
    }

    /**
    * 获取-代理点
    * @return agentname
     */
    public String getAgentname() {
        return agentname;
    }

    /**
    * 设置-代理点
    * @paramType java.lang.String
    * @param agentname - 代理点
     */
    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    /**
    * 获取-手工修改数据描述
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-手工修改数据描述
    * @paramType java.lang.String
    * @param modifydesc - 手工修改数据描述
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
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
    * 获取-已核销金额（保单币种）
    * @return baserealamount
     */
    public BigDecimal getBaserealamount() {
        return baserealamount;
    }

    /**
    * 设置-已核销金额（保单币种）
    * @paramType java.math.BigDecimal
    * @param baserealamount - 已核销金额（保单币种）
     */
    public void setBaserealamount(BigDecimal baserealamount) {
        this.baserealamount = baserealamount;
    }

    /**
    * 获取-客户名称代码
    * @return customercode
     */
    public String getCustomercode() {
        return customercode;
    }

    /**
    * 设置-客户名称代码
    * @paramType java.lang.String
    * @param customercode - 客户名称代码
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
    * 获取-兑换币种
    * @return exchangecurrencycode
     */
    public String getExchangecurrencycode() {
        return exchangecurrencycode;
    }

    /**
    * 设置-兑换币种
    * @paramType java.lang.String
    * @param exchangecurrencycode - 兑换币种
     */
    public void setExchangecurrencycode(String exchangecurrencycode) {
        this.exchangecurrencycode = exchangecurrencycode;
    }

    /**
    * 获取-兑换金额
    * @return exchangeamount
     */
    public BigDecimal getExchangeamount() {
        return exchangeamount;
    }

    /**
    * 设置-兑换金额
    * @paramType java.math.BigDecimal
    * @param exchangeamount - 兑换金额
     */
    public void setExchangeamount(BigDecimal exchangeamount) {
        this.exchangeamount = exchangeamount;
    }

    /**
    * 获取-兑换汇率
    * @return exchangerate
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
    * 设置-兑换汇率
    * @paramType java.math.BigDecimal
    * @param exchangerate - 兑换汇率
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
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
    * 获取-客户账户名称
    * @return custaccountname
     */
    public String getCustaccountname() {
        return custaccountname;
    }

    /**
    * 设置-客户账户名称
    * @paramType java.lang.String
    * @param custaccountname - 客户账户名称
     */
    public void setCustaccountname(String custaccountname) {
        this.custaccountname = custaccountname;
    }

    /**
    * 获取-客户开户行所在省份
    * @return bankprovince
     */
    public String getBankprovince() {
        return bankprovince;
    }

    /**
    * 设置-客户开户行所在省份
    * @paramType java.lang.String
    * @param bankprovince - 客户开户行所在省份
     */
    public void setBankprovince(String bankprovince) {
        this.bankprovince = bankprovince;
    }

    /**
    * 获取-客户开户行所在市
    * @return bankcity
     */
    public String getBankcity() {
        return bankcity;
    }

    /**
    * 设置-客户开户行所在市
    * @paramType java.lang.String
    * @param bankcity - 客户开户行所在市
     */
    public void setBankcity(String bankcity) {
        this.bankcity = bankcity;
    }

    /**
    * 获取-客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
    * @return banktype
     */
    public String getBanktype() {
        return banktype;
    }

    /**
    * 设置-客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
    * @paramType java.lang.String
    * @param banktype - 客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
     */
    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    /**
    * 获取-"支付方式： 51 现金付款、 52 银行转账付款、53支票付款
"
    * @return paymentmethod
     */
    public String getPaymentmethod() {
        return paymentmethod;
    }

    /**
    * 设置-"支付方式： 51 现金付款、 52 银行转账付款、53支票付款
"
    * @paramType java.lang.String
    * @param paymentmethod - "支付方式： 51 现金付款、 52 银行转账付款、53支票付款
"
     */
    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }
}