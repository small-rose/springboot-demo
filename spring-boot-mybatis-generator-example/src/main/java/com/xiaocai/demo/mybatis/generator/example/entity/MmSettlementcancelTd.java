package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_settlementcancel_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmSettlementcancelTd {
    /**
     * 主键
     */
    private Long settlementid;

    /**
     * 流水号
     */
    private Long listno;

    /**
     * 授权人
     */
    private String authorizedperson;

    /**
     * 授权状态
     */
    private String authorizedstate;

    /**
     * 授权类型,0:收款结算取消,1:付款结算取消,2:手续费或赔款,3:内转销取消,4:内转销
     */
    private String authorizedtype;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 银行帐号
     */
    private String custaccountno;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 数据操作员
     */
    private String opcode;

    /**
    * 获取-主键
    * @return settlementid
     */
    public Long getSettlementid() {
        return settlementid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param settlementid - 主键
     */
    public void setSettlementid(Long settlementid) {
        this.settlementid = settlementid;
    }

    /**
    * 获取-流水号
    * @return listno
     */
    public Long getListno() {
        return listno;
    }

    /**
    * 设置-流水号
    * @paramType java.lang.Long
    * @param listno - 流水号
     */
    public void setListno(Long listno) {
        this.listno = listno;
    }

    /**
    * 获取-授权人
    * @return authorizedperson
     */
    public String getAuthorizedperson() {
        return authorizedperson;
    }

    /**
    * 设置-授权人
    * @paramType java.lang.String
    * @param authorizedperson - 授权人
     */
    public void setAuthorizedperson(String authorizedperson) {
        this.authorizedperson = authorizedperson;
    }

    /**
    * 获取-授权状态
    * @return authorizedstate
     */
    public String getAuthorizedstate() {
        return authorizedstate;
    }

    /**
    * 设置-授权状态
    * @paramType java.lang.String
    * @param authorizedstate - 授权状态
     */
    public void setAuthorizedstate(String authorizedstate) {
        this.authorizedstate = authorizedstate;
    }

    /**
    * 获取-授权类型,0:收款结算取消,1:付款结算取消,2:手续费或赔款,3:内转销取消,4:内转销
    * @return authorizedtype
     */
    public String getAuthorizedtype() {
        return authorizedtype;
    }

    /**
    * 设置-授权类型,0:收款结算取消,1:付款结算取消,2:手续费或赔款,3:内转销取消,4:内转销
    * @paramType java.lang.String
    * @param authorizedtype - 授权类型,0:收款结算取消,1:付款结算取消,2:手续费或赔款,3:内转销取消,4:内转销
     */
    public void setAuthorizedtype(String authorizedtype) {
        this.authorizedtype = authorizedtype;
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
    * 获取-银行帐号
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-银行帐号
    * @paramType java.lang.String
    * @param custaccountno - 银行帐号
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
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
    * 获取-版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
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
    * 获取-数据操作员
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-数据操作员
    * @paramType java.lang.String
    * @param opcode - 数据操作员
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }
}