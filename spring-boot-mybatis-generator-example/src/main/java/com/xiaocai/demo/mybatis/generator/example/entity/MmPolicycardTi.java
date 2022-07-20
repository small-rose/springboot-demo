package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policycard_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicycardTi {
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
     * 数据源
     */
    private String datasource;

    /**
     * 业务类型（1 保险卡保费 2 保险卡手续费 3 保险卡绩效工资 4 保险卡退卡保费 5 保险卡退卡手续费 6 保险卡退卡绩效工资 7 保险卡失效保费 8 保险卡失效手续费 9 保险卡保费取消 10 保险卡手续费取消 11 保险卡绩效工资取消 ）
     */
    private String certitype;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 业务部门代码
     */
    private String departmentcode;

    /**
     * 结算单号
     */
    private String summaryno;

    /**
     * 原始结算单号
     */
    private String oldsummarno;

    /**
     * 业务笔数
     */
    private Long businesscount;

    /**
     * 币种代码（CNY 人民币 USD 美元）
     */
    private String currencycode;

    /**
     * 金额（保费：应收+，应付-；手续费：应付+，应收-）
     */
    private BigDecimal amount;

    /**
     * 展业方式
     */
    private String businesschannel;

    /**
     * 涉农标识（91涉农，92非涉农）
     */
    private String farmflag;

    /**
     * 代理点代码
     */
    private String agentcode;

    /**
     * 代理点名称
     */
    private String agentname;

    /**
     * 预售确定时间
     */
    private Date inputdate;

    /**
     * 操作标志（1 正常业务  2 取消业务）
     */
    private String opflag;

    /**
     * 客户代码
     */
    private String customercode;

    /**
     * 客户名称
     */
    private String customername;

    /**
     * 客户银行账户
     */
    private String custaccountno;

    /**
     * 客户开户行名称
     */
    private String bankname;

    /**
     * 客户开户行代码（开户行联行号）
     */
    private String custbankno;

    /**
     * 客户开户行所在市
     */
    private String bankcity;

    /**
     * 客户开户行所在省份
     */
    private String bankprovince;

    /**
     * 客户开户行直联号：ICBC（工行）、ABC(农行）、 BOC（中国银行）、CITICIB(中信银行)、CCB（建行）
     */
    private String banktype;

    /**
     * 银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
     */
    private String ispaypublic;

    /**
     * 批次数
     */
    private Short batchnum;

    /**
     * 是否需要回写（1：是，0，否）
     */
    private String ifreback;

    /**
     * 唯一序号
     */
    private String custseq;

    /**
     * 状态（1.初始状态.2.落地成功,3.落地失败4.作废）
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
     * 保险卡代理协议号
     */
    private String totalprotocoltno;

    /**
     * 客户账户区域，转账付款必填，默认为0,0 - 国内 1 - 国外
     */
    private String custaccountarea;

    /**
     * 指定收付方式 01现金收款、02 POS刷卡、03 客户转账、04 批量扣款、05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、09语音在线支付、10上海平台 付款方式： 51 现金付款、 52 银企直联转账付款、53支票付款、56 线下网银转账 其他情况： 99 净额结算，98营业外收入，97内转销，96内传冲抵
     */
    private String inpaymentmethod;

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
    * 获取-业务类型（1 保险卡保费 2 保险卡手续费 3 保险卡绩效工资 4 保险卡退卡保费 5 保险卡退卡手续费 6 保险卡退卡绩效工资 7 保险卡失效保费 8 保险卡失效手续费 9 保险卡保费取消 10 保险卡手续费取消 11 保险卡绩效工资取消 ）
    * @return certitype
     */
    public String getCertitype() {
        return certitype;
    }

    /**
    * 设置-业务类型（1 保险卡保费 2 保险卡手续费 3 保险卡绩效工资 4 保险卡退卡保费 5 保险卡退卡手续费 6 保险卡退卡绩效工资 7 保险卡失效保费 8 保险卡失效手续费 9 保险卡保费取消 10 保险卡手续费取消 11 保险卡绩效工资取消 ）
    * @paramType java.lang.String
    * @param certitype - 业务类型（1 保险卡保费 2 保险卡手续费 3 保险卡绩效工资 4 保险卡退卡保费 5 保险卡退卡手续费 6 保险卡退卡绩效工资 7 保险卡失效保费 8 保险卡失效手续费 9 保险卡保费取消 10 保险卡手续费取消 11 保险卡绩效工资取消 ）
     */
    public void setCertitype(String certitype) {
        this.certitype = certitype;
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
    * 获取-业务笔数
    * @return businesscount
     */
    public Long getBusinesscount() {
        return businesscount;
    }

    /**
    * 设置-业务笔数
    * @paramType java.lang.Long
    * @param businesscount - 业务笔数
     */
    public void setBusinesscount(Long businesscount) {
        this.businesscount = businesscount;
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
    * 获取-展业方式
    * @return businesschannel
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
    * 设置-展业方式
    * @paramType java.lang.String
    * @param businesschannel - 展业方式
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
    }

    /**
    * 获取-涉农标识（91涉农，92非涉农）
    * @return farmflag
     */
    public String getFarmflag() {
        return farmflag;
    }

    /**
    * 设置-涉农标识（91涉农，92非涉农）
    * @paramType java.lang.String
    * @param farmflag - 涉农标识（91涉农，92非涉农）
     */
    public void setFarmflag(String farmflag) {
        this.farmflag = farmflag;
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
    * 获取-代理点名称
    * @return agentname
     */
    public String getAgentname() {
        return agentname;
    }

    /**
    * 设置-代理点名称
    * @paramType java.lang.String
    * @param agentname - 代理点名称
     */
    public void setAgentname(String agentname) {
        this.agentname = agentname;
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
    * 获取-操作标志（1 正常业务  2 取消业务）
    * @return opflag
     */
    public String getOpflag() {
        return opflag;
    }

    /**
    * 设置-操作标志（1 正常业务  2 取消业务）
    * @paramType java.lang.String
    * @param opflag - 操作标志（1 正常业务  2 取消业务）
     */
    public void setOpflag(String opflag) {
        this.opflag = opflag;
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
    * 获取-客户银行账户
    * @return custaccountno
     */
    public String getCustaccountno() {
        return custaccountno;
    }

    /**
    * 设置-客户银行账户
    * @paramType java.lang.String
    * @param custaccountno - 客户银行账户
     */
    public void setCustaccountno(String custaccountno) {
        this.custaccountno = custaccountno;
    }

    /**
    * 获取-客户开户行名称
    * @return bankname
     */
    public String getBankname() {
        return bankname;
    }

    /**
    * 设置-客户开户行名称
    * @paramType java.lang.String
    * @param bankname - 客户开户行名称
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
    * 获取-银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
    * @return ispaypublic
     */
    public String getIspaypublic() {
        return ispaypublic;
    }

    /**
    * 设置-银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
    * @paramType java.lang.String
    * @param ispaypublic - 银行指令类型1：公对公 0：公对私 (银行银企直连对公接口与对私接口为不同接口)
     */
    public void setIspaypublic(String ispaypublic) {
        this.ispaypublic = ispaypublic;
    }

    /**
    * 获取-批次数
    * @return batchnum
     */
    public Short getBatchnum() {
        return batchnum;
    }

    /**
    * 设置-批次数
    * @paramType java.lang.Short
    * @param batchnum - 批次数
     */
    public void setBatchnum(Short batchnum) {
        this.batchnum = batchnum;
    }

    /**
    * 获取-是否需要回写（1：是，0，否）
    * @return ifreback
     */
    public String getIfreback() {
        return ifreback;
    }

    /**
    * 设置-是否需要回写（1：是，0，否）
    * @paramType java.lang.String
    * @param ifreback - 是否需要回写（1：是，0，否）
     */
    public void setIfreback(String ifreback) {
        this.ifreback = ifreback;
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
    * 获取-状态（1.初始状态.2.落地成功,3.落地失败4.作废）
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态（1.初始状态.2.落地成功,3.落地失败4.作废）
    * @paramType java.lang.String
    * @param status - 状态（1.初始状态.2.落地成功,3.落地失败4.作废）
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
    * 获取-保险卡代理协议号
    * @return totalprotocoltno
     */
    public String getTotalprotocoltno() {
        return totalprotocoltno;
    }

    /**
    * 设置-保险卡代理协议号
    * @paramType java.lang.String
    * @param totalprotocoltno - 保险卡代理协议号
     */
    public void setTotalprotocoltno(String totalprotocoltno) {
        this.totalprotocoltno = totalprotocoltno;
    }

    /**
    * 获取-客户账户区域，转账付款必填，默认为0,0 - 国内 1 - 国外
    * @return custaccountarea
     */
    public String getCustaccountarea() {
        return custaccountarea;
    }

    /**
    * 设置-客户账户区域，转账付款必填，默认为0,0 - 国内 1 - 国外
    * @paramType java.lang.String
    * @param custaccountarea - 客户账户区域，转账付款必填，默认为0,0 - 国内 1 - 国外
     */
    public void setCustaccountarea(String custaccountarea) {
        this.custaccountarea = custaccountarea;
    }

    /**
    * 获取-指定收付方式 01现金收款、02 POS刷卡、03 客户转账、04 批量扣款、05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、09语音在线支付、10上海平台
付款方式： 51 现金付款、 52 银企直联转账付款、53支票付款、56 线下网银转账
其他情况： 99 净额结算，98营业外收入，97内转销，96内传冲抵
    * @return inpaymentmethod
     */
    public String getInpaymentmethod() {
        return inpaymentmethod;
    }

    /**
    * 设置-指定收付方式 01现金收款、02 POS刷卡、03 客户转账、04 批量扣款、05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、09语音在线支付、10上海平台
付款方式： 51 现金付款、 52 银企直联转账付款、53支票付款、56 线下网银转账
其他情况： 99 净额结算，98营业外收入，97内转销，96内传冲抵
    * @paramType java.lang.String
    * @param inpaymentmethod - 指定收付方式 01现金收款、02 POS刷卡、03 客户转账、04 批量扣款、05 银保通、06 支票收款、07 WEB在线支付、08 快钱垫付、09语音在线支付、10上海平台
付款方式： 51 现金付款、 52 银企直联转账付款、53支票付款、56 线下网银转账
其他情况： 99 净额结算，98营业外收入，97内转销，96内传冲抵
     */
    public void setInpaymentmethod(String inpaymentmethod) {
        this.inpaymentmethod = inpaymentmethod;
    }
}