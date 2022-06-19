package com.xiaocai.demo.mybatis.datascope.web.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * author YXY 2007-8-27 UsableMoneyCondition
 */

@SuppressWarnings("serial")
public class UsableMoneyCondition extends BaseVO implements Serializable {

	private String subcompany;//分公司

	private String customertype; //客户类型   ----新增的


	private String opcode;

	private String usableno;//银行流水号

	private String usablenoList;//银行流水号，输入多个，逗号隔开

	private String currencycode;//币种

	private String departmentcode;

	private String customername;//客户名称

	private String customerpartyno;// 客户组

	private BigDecimal maxamount;//金额

	private BigDecimal minamount;//金额（至）
    @JsonFormat(pattern = "yyyy-MM-dd")
	private Date startdate;//挂账日期

    @JsonFormat(pattern = "yyyy-MM-dd")
	private Date enddate;//挂账日期（至）


	private Date startdate2;
	
	private Date enddate2;

	private String powermark;

	private String paytype;//付款类型

	private String paytypedetail;

	private String policyno;
	private String oldpolicyno;

	private String claimno;

	private String endorseno;

	private String unitcode;//财务机构

	private String opstatus;//核销状态
	private String summaryno;//手续费结算单号

	private String settlementno;
	private String datatype;//数据类型
	private String custseq;

	// add by grace on 2010-04-23
	private String customercode;

	private String isbatchsettle;//小额大单标志,01是预收款匹配结算单(小额大单),其他均不是
	/**雪花算法 js精度*/
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long fatherno;
	private String transactorinfo;
	//by yangdewei 2011-5-4 付款处理、预收并笔转应付添加模糊查询 
	private String description;//摘要
	private String checkstatus;//2012-5-24 chy 审核状态
	
	private String agentnamecn;  //应付款查询页面添加代理人查询条件    2013-11-6
	
	//20150330 
	private String paystatus;//支付状态
	private String sortType;//排序方式
	private String inpaymentmethod;//支付方式
	
	private String ifpayback;//是否支付成功退票
	
	private String value;
	
	private String subcompanyName;

	private String inpaymentno;//支付申请号
	//add by fandan
	private int queryFlag;

	private String businid;//银行流水类型

	public String getBusinid() {
		return businid;
	}

	public void setBusinid(String businid) {
		this.businid = businid;
	}

	public String getInpaymentno() {
		return inpaymentno;
	}

	public void setInpaymentno(String inpaymentno) {
		this.inpaymentno = inpaymentno;
	}


	//批次号
	private String batchid;
	//生成方式
	private String createtype;
	//领用状态（0未领用 1已领用）
	private String ifclaim;
	//批量导入批次号
	private String rcptno;
	//银行账号
	private String accountno;

	private Date lastStartopdate;//最后操作时间

	private Date lastEndopdate;//最后操作时间

	public String getCustomertype() {
		return customertype;
	}

	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}

	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

	public String getCreatetype() {
		return createtype;
	}

	public void setCreatetype(String createtype) {
		this.createtype = createtype;
	}

	public String getSubcompanyName() {
		return subcompanyName;
	}

	public void setSubcompanyName(String subcompanyName) {
		this.subcompanyName = subcompanyName;
	}

	public String getIfpayback() {
		return ifpayback;
	}

	public void setIfpayback(String ifpayback) {
		this.ifpayback = ifpayback;
	}

	public Date getStartdate2() {
		return startdate2;
	}

	public void setStartdate2(Date startdate2) {
		this.startdate2 = startdate2;
	}

	public Date getEnddate2() {
		return enddate2;
	}

	public void setEnddate2(Date enddate2) {
		this.enddate2 = enddate2;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getCustomercode() {
		return customercode;
	}

	public void setCustomercode(String customercode) {
		this.customercode = customercode;
	}

	public String getCustseq() {
		return custseq;
	}

	public void setCustseq(String custseq) {
		this.custseq = custseq;
	}

	public String getCustomerpartyno() {
		return customerpartyno;
	}

	public void setCustomerpartyno(String customerpartyno) {
		this.customerpartyno = customerpartyno;
	}

	public String getSummaryno() {
		return summaryno;
	}

	public void setSummaryno(String summaryno) {
		this.summaryno = summaryno;
	}

	public String getOpstatus() {
		return opstatus;
	}

	public void setOpstatus(String opstatus) {
		this.opstatus = opstatus;
	}

	public String getUnitcode() {
		return unitcode;
	}

	public void setUnitcode(String unitcode) {
		this.unitcode = unitcode;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype == null ? paytype : paytype.trim();
	}

	public String getPaytypedetail() {
		return paytypedetail;
	}

	public void setPaytypedetail(String paytypedetail) {
		this.paytypedetail = paytypedetail == null ? paytypedetail
				: paytypedetail.trim();
	}

	public String getPolicyno() {
		return policyno;
	}

	public void setPolicyno(String policyno) {
		this.policyno = policyno == null ? policyno : policyno.trim();
	}

	public String getClaimno() {
		return claimno;
	}

	public void setClaimno(String claimno) {
		this.claimno = claimno == null ? claimno : claimno.trim();
	}

	public String getEndorseno() {
		return endorseno;
	}

	public void setEndorseno(String endorseno) {
		this.endorseno = endorseno == null ? endorseno : endorseno.trim();
	}

	public String getPowermark() {
		return powermark;
	}

	public void setPowermark(String powermark) {
		this.powermark = powermark == null ? powermark : powermark.trim();
	}

	public String getSubcompany() {
		return subcompany;
	}

	public void setSubcompany(String subcompany) {
		this.subcompany = subcompany == null ? subcompany : subcompany.trim();
	}

	public String getOpcode() {
		return opcode;
	}

	public void setOpcode(String opcode) {
		this.opcode = opcode == null ? opcode : opcode.trim();
	}

	public String getUsableno() {
		return usableno;
	}

	public void setUsableno(String usableno) {
		this.usableno = usableno == null ? usableno : usableno.trim();
	}

	public String getCurrencycode() {
		return currencycode;
	}

	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode == null ? currencycode : currencycode
				.trim();
	}

	public String getDepartmentcode() {
		return departmentcode;
	}

	public void setDepartmentcode(String departmentcode) {
		this.departmentcode = departmentcode == null ? departmentcode
				: departmentcode.trim();
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername == null ? customername : customername
				.trim();
	}

	public BigDecimal getMaxamount() {
		return maxamount;
	}

	public void setMaxamount(BigDecimal maxamount) {
		this.maxamount = maxamount;
	}

	public BigDecimal getMinamount() {
		return minamount;
	}

	public void setMinamount(BigDecimal minamount) {
		this.minamount = minamount;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getIsbatchsettle() {
		return isbatchsettle;
	}

	public void setIsbatchsettle(String isbatchsettle) {
		this.isbatchsettle = isbatchsettle;
	}

	public Long getFatherno() {
		return fatherno;
	}

	public void setFatherno(Long fatherno) {
		this.fatherno = fatherno;
	}

	public String getTransactorinfo() {
		return transactorinfo;
	}

	public void setTransactorinfo(String transactorinfo) {
		this.transactorinfo = transactorinfo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCheckstatus() {
		return checkstatus;
	}

	public void setCheckstatus(String checkstatus) {
		this.checkstatus = checkstatus;
	}

	public String getSettlementno() {
		return settlementno;
	}

	public void setSettlementno(String settlementno) {
		this.settlementno = settlementno;
	}

	public String getAgentnamecn() {
		return agentnamecn;
	}

	public void setAgentnamecn(String agentnamecn) {
		this.agentnamecn = agentnamecn;
	}

	public String getPaystatus() {
		return paystatus;
	}

	public void setPaystatus(String paystatus) {
		this.paystatus = paystatus;
	}

	public String getSortType() {
		return sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public String getInpaymentmethod() {
		return inpaymentmethod;
	}

	public void setInpaymentmethod(String inpaymentmethod) {
		this.inpaymentmethod = inpaymentmethod;
	}

	public String getOldpolicyno() {
		return oldpolicyno;
	}

	public void setOldpolicyno(String oldpolicyno) {
		this.oldpolicyno = oldpolicyno;
	}

	public int getQueryFlag() {
		return queryFlag;
	}

	public void setQueryFlag(int queryFlag) {
		this.queryFlag = queryFlag;
	}

	public String getIfclaim() {
		return ifclaim;
	}

	public void setIfclaim(String ifclaim) {
		this.ifclaim = ifclaim;
	}

	public String getRcptno() {
		return rcptno;
	}

	public void setRcptno(String rcptno) {
		this.rcptno = rcptno;
	}

	public String getUsablenoList() {
		return usablenoList;
	}

	public void setUsablenoList(String usablenoList) {
		this.usablenoList = usablenoList;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public Date getLastStartopdate() {
		return lastStartopdate;
	}

	public void setLastStartopdate(Date lastStartopdate) {
		this.lastStartopdate = lastStartopdate;
	}

	public Date getLastEndopdate() {
		return lastEndopdate;
	}

	public void setLastEndopdate(Date lastEndopdate) {
		this.lastEndopdate = lastEndopdate;
	}
}