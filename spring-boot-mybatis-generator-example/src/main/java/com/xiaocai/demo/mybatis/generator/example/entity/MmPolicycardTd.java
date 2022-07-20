package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policycard_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicycardTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 批次号
     */
    private String batchid;

    /**
     * 批次序号
     */
    private String batchserialno;

    /**
     * 卡号
     */
    private String bizno;

    /**
     * 结算单号
     */
    private String summaryno;

    /**
     * 原始结算单号
     */
    private String oldsummarno;

    /**
     * "业务类型（1 保险卡保费 2 保险卡手续费 3 保险卡退卡保费 4 保险卡退卡手续费 5 保险卡失效（保费）6 保险卡保费取消 7 保险卡手续费取消 ）"
     */
    private String certitype;

    /**
     * 币种代码（CNY 人民币 USD 美元）
     */
    private String currencycode;

    /**
     * 金额（保费：应收+，应付-；手续费：应付+，应收-）
     */
    private BigDecimal amount;

    /**
     * 终保日期
     */
    private Date enddate;

    /**
     * 唯一序号
     */
    private String custseq;

    /**
     * 冲销流水号
     */
    private String offsetno;

    /**
     * 状态
     */
    private String status;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改日期
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 错误记录
     */
    private String errmsg;

    /**
     * 关联mm_policycard_ti主键
     */
    private String seqpolicycard;

    /**
     * 分公司代码
     */
    private String subcompany;

    /**
     * 业务归属部门
     */
    private String departmentcode;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 实收/实付金额
     */
    private BigDecimal realamount;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 操作员
     */
    private String opcode;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 预售确定时间
     */
    private Date inputdate;

    /**
     * 保险卡操作标识（1正常2取消3退票重发4失效5退卡）
     */
    private String opflag;

    /**
     * 取消/退卡时间
     */
    private Date canceldate;

    /**
     * 激活/失效 时间
     */
    private Date activedate;

    /**
     * 起保日期
     */
    private Date startdate;

    /**
     * 业务险类
     */
    private String classeskind;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 保险卡保费的custseq,用于保险卡手续费差额结算
     */
    private String policyserialno;

    /**
     * 单证类型
     */
    private String biztype;

    /**
     * 送数状态 1：初始 2：中间状态 3：更新成功 4：更新失败
     */
    private String upstatus;

    /**
     * 是否预结手续费，卡单预结手续费时必填，0 否，1 是
     */
    private String ifprecost;

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
    * 获取-批次序号
    * @return batchserialno
     */
    public String getBatchserialno() {
        return batchserialno;
    }

    /**
    * 设置-批次序号
    * @paramType java.lang.String
    * @param batchserialno - 批次序号
     */
    public void setBatchserialno(String batchserialno) {
        this.batchserialno = batchserialno;
    }

    /**
    * 获取-卡号
    * @return bizno
     */
    public String getBizno() {
        return bizno;
    }

    /**
    * 设置-卡号
    * @paramType java.lang.String
    * @param bizno - 卡号
     */
    public void setBizno(String bizno) {
        this.bizno = bizno;
    }

    /**
    * 获取-结算单号
    * @return summaryno
     */
    public String getSummaryno() {
        return summaryno;
    }

    /**
    * 设置-结算单号
    * @paramType java.lang.String
    * @param summaryno - 结算单号
     */
    public void setSummaryno(String summaryno) {
        this.summaryno = summaryno;
    }

    /**
    * 获取-原始结算单号
    * @return oldsummarno
     */
    public String getOldsummarno() {
        return oldsummarno;
    }

    /**
    * 设置-原始结算单号
    * @paramType java.lang.String
    * @param oldsummarno - 原始结算单号
     */
    public void setOldsummarno(String oldsummarno) {
        this.oldsummarno = oldsummarno;
    }

    /**
    * 获取-"业务类型（1 保险卡保费 2 保险卡手续费 3 保险卡退卡保费 4 保险卡退卡手续费 5 保险卡失效（保费）6 保险卡保费取消 7 保险卡手续费取消
）"
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-"业务类型（1 保险卡保费 2 保险卡手续费 3 保险卡退卡保费 4 保险卡退卡手续费 5 保险卡失效（保费）6 保险卡保费取消 7 保险卡手续费取消
）"
    * @paramType java.lang.String
    * @param certitype - "业务类型（1 保险卡保费 2 保险卡手续费 3 保险卡退卡保费 4 保险卡退卡手续费 5 保险卡失效（保费）6 保险卡保费取消 7 保险卡手续费取消
）"
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
    }

    /**
    * 获取-币种代码（CNY 人民币 USD 美元）
    * @return currencycode
     */
    public String getCurrencycode() {
        return currencycode;
    }

    /**
    * 设置-币种代码（CNY 人民币 USD 美元）
    * @paramType java.lang.String
    * @param currencycode - 币种代码（CNY 人民币 USD 美元）
     */
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    /**
    * 获取-金额（保费：应收+，应付-；手续费：应付+，应收-）
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-金额（保费：应收+，应付-；手续费：应付+，应收-）
    * @paramType java.math.BigDecimal
    * @param amount - 金额（保费：应收+，应付-；手续费：应付+，应收-）
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    * 获取-唯一序号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-唯一序号
    * @paramType java.lang.String
    * @param custseq - 唯一序号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-冲销流水号
    * @return offsetno
     */
    public String getOffsetno() {
        return offsetno;
    }

    /**
    * 设置-冲销流水号
    * @paramType java.lang.String
    * @param offsetno - 冲销流水号
     */
    public void setOffsetno(String offsetno) {
        this.offsetno = offsetno;
    }

    /**
    * 获取-状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态
    * @paramType java.lang.String
    * @param status - 状态
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-最后修改日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后修改日期
    * @paramType java.util.Date
    * @param lastopdate - 最后修改日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
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
    * 获取-错误记录
    * @return errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
    * 设置-错误记录
    * @paramType java.lang.String
    * @param errmsg - 错误记录
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    /**
    * 获取-关联mm_policycard_ti主键
    * @return seqpolicycard
     */
    public String getSeqpolicycard() {
        return seqpolicycard;
    }

    /**
    * 设置-关联mm_policycard_ti主键
    * @paramType java.lang.String
    * @param seqpolicycard - 关联mm_policycard_ti主键
     */
    public void setSeqpolicycard(String seqpolicycard) {
        this.seqpolicycard = seqpolicycard;
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
    * 获取-业务归属部门
    * @return departmentcode
     */
    public String getDepartmentcode() {
        return departmentcode;
    }

    /**
    * 设置-业务归属部门
    * @paramType java.lang.String
    * @param departmentcode - 业务归属部门
     */
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
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
    * 获取-实收/实付金额
    * @return realamount
     */
    public BigDecimal getRealamount() {
        return realamount;
    }

    /**
    * 设置-实收/实付金额
    * @paramType java.math.BigDecimal
    * @param realamount - 实收/实付金额
     */
    public void setRealamount(BigDecimal realamount) {
        this.realamount = realamount;
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
    * 获取-预售确定时间
    * @return inputdate
     */
    public Date getInputdate() {
        return inputdate;
    }

    /**
    * 设置-预售确定时间
    * @paramType java.util.Date
    * @param inputdate - 预售确定时间
     */
    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    /**
    * 获取-保险卡操作标识（1正常2取消3退票重发4失效5退卡）
    * @return opflag
     */
    public String getOpflag() {
        return opflag;
    }

    /**
    * 设置-保险卡操作标识（1正常2取消3退票重发4失效5退卡）
    * @paramType java.lang.String
    * @param opflag - 保险卡操作标识（1正常2取消3退票重发4失效5退卡）
     */
    public void setOpflag(String opflag) {
        this.opflag = opflag;
    }

    /**
    * 获取-取消/退卡时间
    * @return canceldate
     */
    public Date getCanceldate() {
        return canceldate;
    }

    /**
    * 设置-取消/退卡时间
    * @paramType java.util.Date
    * @param canceldate - 取消/退卡时间
     */
    public void setCanceldate(Date canceldate) {
        this.canceldate = canceldate;
    }

    /**
    * 获取-激活/失效 时间
    * @return activedate
     */
    public Date getActivedate() {
        return activedate;
    }

    /**
    * 设置-激活/失效 时间
    * @paramType java.util.Date
    * @param activedate - 激活/失效 时间
     */
    public void setActivedate(Date activedate) {
        this.activedate = activedate;
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
    * 获取-业务险类
    * @return classeskind
     */
    public String getClasseskind() {
        return classeskind;
    }

    /**
    * 设置-业务险类
    * @paramType java.lang.String
    * @param classeskind - 业务险类
     */
    public void setClasseskind(String classeskind) {
        this.classeskind = classeskind;
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
    * 获取-保险卡保费的custseq,用于保险卡手续费差额结算
    * @return policyserialno
     */
    public String getPolicyserialno() {
        return policyserialno;
    }

    /**
    * 设置-保险卡保费的custseq,用于保险卡手续费差额结算
    * @paramType java.lang.String
    * @param policyserialno - 保险卡保费的custseq,用于保险卡手续费差额结算
     */
    public void setPolicyserialno(String policyserialno) {
        this.policyserialno = policyserialno;
    }

    /**
    * 获取-单证类型
    * @return biztype
     */
    public String getBiztype() {
        return biztype;
    }

    /**
    * 设置-单证类型
    * @paramType java.lang.String
    * @param biztype - 单证类型
     */
    public void setBiztype(String biztype) {
        this.biztype = biztype;
    }

    /**
    * 获取-送数状态 1：初始 2：中间状态 3：更新成功 4：更新失败
    * @return upstatus
     */
    public String getUpstatus() {
        return upstatus;
    }

    /**
    * 设置-送数状态 1：初始 2：中间状态 3：更新成功 4：更新失败
    * @paramType java.lang.String
    * @param upstatus - 送数状态 1：初始 2：中间状态 3：更新成功 4：更新失败
     */
    public void setUpstatus(String upstatus) {
        this.upstatus = upstatus;
    }

    /**
    * 获取-是否预结手续费，卡单预结手续费时必填，0 否，1 是
    * @return ifprecost
     */
    public String getIfprecost() {
        return ifprecost;
    }

    /**
    * 设置-是否预结手续费，卡单预结手续费时必填，0 否，1 是
    * @paramType java.lang.String
    * @param ifprecost - 是否预结手续费，卡单预结手续费时必填，0 否，1 是
     */
    public void setIfprecost(String ifprecost) {
        this.ifprecost = ifprecost;
    }
}