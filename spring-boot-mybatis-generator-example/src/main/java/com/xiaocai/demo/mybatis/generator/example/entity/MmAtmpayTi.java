package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_atmpay_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAtmpayTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 支付号
     */
    private String inpaymentno;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 币种
     */
    private String currencycode;

    /**
     * 本保单收款金额
     */
    private BigDecimal amount;

    /**
     * 业务类型(1车险、4车船税、A车险和车船税)
     */
    private String businessattr;

    /**
     * 收款日期
     */
    private Date inpaymentdate;

    /**
     * 本支付号收款金额
     */
    private BigDecimal inpaymentamount;

    /**
     * 数据来源
     */
    private String datasource;

    /**
     * 备用字段
     */
    private String backone;

    /**
     * 备用字段
     */
    private String backtwo;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 部门代码
     */
    private String departmentcode;

    /**
     * 标志
     */
    private String flag;

    /**
     * 综合统计流水号
     */
    private BigDecimal serialno;

    /**
     * 1 保费到账、2保单数据接入、3已核销（当走在途时，2表示挂在途，3表示销在途），4：7贷的初始状态，5:7贷已核销状态
     */
    private String status;

    /**
     * 业务唯一主键
     */
    private String custseq;

    /**
     * 是否组合销售：0否 1是
     */
    private String isgroup;

    /**
     * 分期缴费期次
     */
    private Integer installmentstimes;

    /**
     * 保险商户号
     */
    private String insuMidno;

    /**
     * 支付类型：1为人 工确认到账，2为自动确认到账，3外部收款平台补传
     */
    private String paytype;

    /**
     * "支付方式01 现金收款、02 POS刷卡、03 客户转账、04 批量扣款、 05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、 09语音在线支付、98上海平台"
     */
    private String payway;

    /**
     * 消费渠道对应d_user表userid
     */
    private String paychannel;

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
    * 获取-本保单收款金额
    * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
    * 设置-本保单收款金额
    * @paramType java.math.BigDecimal
    * @param amount - 本保单收款金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
    * 获取-业务类型(1车险、4车船税、A车险和车船税)
    * @return businessattr
     */
    public String getBusinessattr() {
        return businessattr;
    }

    /**
    * 设置-业务类型(1车险、4车船税、A车险和车船税)
    * @paramType java.lang.String
    * @param businessattr - 业务类型(1车险、4车船税、A车险和车船税)
     */
    public void setBusinessattr(String businessattr) {
        this.businessattr = businessattr;
    }

    /**
    * 获取-收款日期
    * @return inpaymentdate
     */
    public Date getInpaymentdate() {
        return inpaymentdate;
    }

    /**
    * 设置-收款日期
    * @paramType java.util.Date
    * @param inpaymentdate - 收款日期
     */
    public void setInpaymentdate(Date inpaymentdate) {
        this.inpaymentdate = inpaymentdate;
    }

    /**
    * 获取-本支付号收款金额
    * @return inpaymentamount
     */
    public BigDecimal getInpaymentamount() {
        return inpaymentamount;
    }

    /**
    * 设置-本支付号收款金额
    * @paramType java.math.BigDecimal
    * @param inpaymentamount - 本支付号收款金额
     */
    public void setInpaymentamount(BigDecimal inpaymentamount) {
        this.inpaymentamount = inpaymentamount;
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
    * 获取-备用字段
    * @return backone
     */
    public String getBackone() {
        return backone;
    }

    /**
    * 设置-备用字段
    * @paramType java.lang.String
    * @param backone - 备用字段
     */
    public void setBackone(String backone) {
        this.backone = backone;
    }

    /**
    * 获取-备用字段
    * @return backtwo
     */
    public String getBacktwo() {
        return backtwo;
    }

    /**
    * 设置-备用字段
    * @paramType java.lang.String
    * @param backtwo - 备用字段
     */
    public void setBacktwo(String backtwo) {
        this.backtwo = backtwo;
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
    * 获取-标志
    * @return flag
     */
    public String getFlag() {
        return flag;
    }

    /**
    * 设置-标志
    * @paramType java.lang.String
    * @param flag - 标志
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
    * 获取-综合统计流水号
    * @return serialno
     */
    public BigDecimal getSerialno() {
        return serialno;
    }

    /**
    * 设置-综合统计流水号
    * @paramType java.math.BigDecimal
    * @param serialno - 综合统计流水号
     */
    public void setSerialno(BigDecimal serialno) {
        this.serialno = serialno;
    }

    /**
    * 获取-1 保费到账、2保单数据接入、3已核销（当走在途时，2表示挂在途，3表示销在途），4：7贷的初始状态，5:7贷已核销状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-1 保费到账、2保单数据接入、3已核销（当走在途时，2表示挂在途，3表示销在途），4：7贷的初始状态，5:7贷已核销状态
    * @paramType java.lang.String
    * @param status - 1 保费到账、2保单数据接入、3已核销（当走在途时，2表示挂在途，3表示销在途），4：7贷的初始状态，5:7贷已核销状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-业务唯一主键
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-业务唯一主键
    * @paramType java.lang.String
    * @param custseq - 业务唯一主键
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-是否组合销售：0否 1是
    * @return isgroup
     */
    public String getIsgroup() {
        return isgroup;
    }

    /**
    * 设置-是否组合销售：0否 1是
    * @paramType java.lang.String
    * @param isgroup - 是否组合销售：0否 1是
     */
    public void setIsgroup(String isgroup) {
        this.isgroup = isgroup;
    }

    /**
    * 获取-分期缴费期次
    * @return installmentstimes
     */
    public Integer getInstallmentstimes() {
        return installmentstimes;
    }

    /**
    * 设置-分期缴费期次
    * @paramType java.lang.Integer
    * @param installmentstimes - 分期缴费期次
     */
    public void setInstallmentstimes(Integer installmentstimes) {
        this.installmentstimes = installmentstimes;
    }

    /**
    * 获取-保险商户号
    * @return insuMidno
     */
    public String getInsuMidno() {
        return insuMidno;
    }

    /**
    * 设置-保险商户号
    * @paramType java.lang.String
    * @param insuMidno - 保险商户号
     */
    public void setInsuMidno(String insuMidno) {
        this.insuMidno = insuMidno;
    }

    /**
    * 获取-支付类型：1为人 工确认到账，2为自动确认到账，3外部收款平台补传
    * @return paytype
     */
    public String getPaytype() {
        return paytype;
    }

    /**
    * 设置-支付类型：1为人 工确认到账，2为自动确认到账，3外部收款平台补传
    * @paramType java.lang.String
    * @param paytype - 支付类型：1为人 工确认到账，2为自动确认到账，3外部收款平台补传
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
    * 获取-"支付方式01 现金收款、02 POS刷卡、03 客户转账、04 批量扣款、
05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、
09语音在线支付、98上海平台"
    * @return payway
     */
    public String getPayway() {
        return payway;
    }

    /**
    * 设置-"支付方式01 现金收款、02 POS刷卡、03 客户转账、04 批量扣款、
05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、
09语音在线支付、98上海平台"
    * @paramType java.lang.String
    * @param payway - "支付方式01 现金收款、02 POS刷卡、03 客户转账、04 批量扣款、
05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、
09语音在线支付、98上海平台"
     */
    public void setPayway(String payway) {
        this.payway = payway;
    }

    /**
    * 获取-消费渠道对应d_user表userid
    * @return paychannel
     */
    public String getPaychannel() {
        return paychannel;
    }

    /**
    * 设置-消费渠道对应d_user表userid
    * @paramType java.lang.String
    * @param paychannel - 消费渠道对应d_user表userid
     */
    public void setPaychannel(String paychannel) {
        this.paychannel = paychannel;
    }
}