package com.xiaocai.demo.mybatis.datascope.web.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author:fan_dan
 * @description:
 * @date:2019-12-21
 */
public class PayableMoneyResultVO {

    private String unitcode; // 财务机构代码
    private String unitname; // 财务机构名称
    private String policyno; // 保单号
    private String endorseno; // 批单号
    private String claimno; // 赔案号
    private String paytype; // 付款类型
    private String paymentmethod;//指定支付方式
    private String customername; // 客户名称
    private String insuredname; // 被保险人名称（中文）
    private String custaccountno; // 收款人账户
    private String bankname; // 开户行银行名称
    private String currencycode; // 币种（记账币种）
    private BigDecimal baseamount; // 金额（保单币种）
    private String summaryno; // 结算单号
    private String departmentcode; // 业务部门代码
    private String departmentname; // 业务部门名称--
    private String costcentercode;//成本中心代码--
    private String costcentername;//成本中心名称--
    private String opcode; // 操作员代码
    /**雪花算法 js精度*/
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long payableno; // 待付款流水号
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date opdate; // 入账日期
    private String opstatus;// 核销状态
    private String ifbillback;//退票状态 0：未退票 1：已退票
    private String agentnamecn; // 代理点/经纪公司名称（中文）
    private String custaccountarea;//客户所在地区
    private String opname;

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getPolicyno() {
        return policyno;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    public String getEndorseno() {
        return endorseno;
    }

    public void setEndorseno(String endorseno) {
        this.endorseno = endorseno;
    }

    public String getClaimno() {
        return claimno;
    }

    public void setClaimno(String claimno) {
        this.claimno = claimno;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getInsuredname() {
        return insuredname;
    }

    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    public String getCustaccountno() {
        return custaccountno;
    }

    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getCurrencycode() {
        return currencycode;
    }

    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    public BigDecimal getBaseamount() {
        return baseamount;
    }

    public void setBaseamount(BigDecimal baseamount) {
        this.baseamount = baseamount;
    }

    public String getSummaryno() {
        return summaryno;
    }

    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getCostcentercode() {
        return costcentercode;
    }

    public void setCostcentercode(String costcentercode) {
        this.costcentercode = costcentercode;
    }

    public String getCostcentername() {
        return costcentername;
    }

    public void setCostcentername(String costcentername) {
        this.costcentername = costcentername;
    }

    public String getOpcode() {
        return opcode;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public Long getPayableno() {
        return payableno;
    }

    public void setPayableno(Long payableno) {
        this.payableno = payableno;
    }

    public Date getOpdate() {
        return opdate;
    }

    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    public String getOpstatus() {
        return opstatus;
    }

    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    public String getIfbillback() {
        return ifbillback;
    }

    public void setIfbillback(String ifbillback) {
        this.ifbillback = ifbillback;
    }

    public String getAgentnamecn() {
        return agentnamecn;
    }

    public void setAgentnamecn(String agentnamecn) {
        this.agentnamecn = agentnamecn;
    }

    public String getCustaccountarea() {
        return custaccountarea;
    }

    public void setCustaccountarea(String custaccountarea) {
        this.custaccountarea = custaccountarea;
    }

    public String getOpname() {
        return opname;
    }

    public void setOpname(String opname) {
        this.opname = opname;
    }
}
