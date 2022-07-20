package com.xiaocai.demo.mybatis.generator.example.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  
 * @Table : mm_policycardlist_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmPolicycardlistTi {
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
     * 业务类型（1 保险卡保费 2 保险卡手续费 3 保险卡绩效工资 4 保险卡退卡保费 5 保险卡退卡手续费 6 保险卡退卡绩效工资 7 保险卡失效保费 8 保险卡失效手续费 9 保险卡保费取消 10 保险卡手续费取消 11 保险卡绩效工资取消 ）
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
     * 关联mm_policycard_ti主键
     */
    private String seqpolicycard;

    /**
     * 插入日期
     */
    private Date inputdate;

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
    * 获取-插入日期
    * @return inputdate
     */
    public Date getInputdate() {
        return inputdate;
    }

    /**
    * 设置-插入日期
    * @paramType java.util.Date
    * @param inputdate - 插入日期
     */
    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
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