package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_wxrefund_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmWxrefundTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 扣款申请号
     */
    private String payappno;

    /**
     * 退款唯一流水号
     */
    private String custseq;

    /**
     * 应用id
     */
    private String appid;

    /**
     * 商户号
     */
    private String mchid;

    /**
     * 微信支付订单号
     */
    private String transactionid;

    /**
     * 微信退款单号
     */
    private String refundid;

    /**
     * 商户退款单号
     */
    private String outrefundno;

    /**
     * 商户订单号
     */
    private String outtradeno;

    /**
     * 退款原因
     */
    private String refunddesc;

    /**
     * 投保单号
     */
    private String applicantno;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 批单号
     */
    private String endorseno;

    /**
     * 退款状态 A申请扣款 S扣款成功 F扣款失败
     */
    private String status;

    /**
     * 扣款结果通知地址
     */
    private String notifyurl;

    /**
     * 返回结果
     */
    private String returncode;

    /**
     * 返回结果描述
     */
    private String returnmsg;

    /**
     * 业务结果
     */
    private String resultcode;

    /**
     * 错误代码
     */
    private String errcode;

    /**
     * 错误代码描述
     */
    private String errCodeDes;

    /**
     * 退款笔数
     */
    private String refundcount;

    /**
     * 订单金额
     */
    private String amount;

    /**
     * 退款金额
     */
    private String refundfee;

    /**
     * 交易状态 SUCCESS：退款成功 REFUNDCLOSE：退款关闭 PROCESSING：退款处理中 CHANGE：退款异常
     */
    private String refundstatus;

    /**
     * 退款入账账户
     */
    private String refundRecvAccout;

    /**
     * 退款成功时间
     */
    private Date refundSuccessTime;

    /**
     * 备注
     */
    private String remark;

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
    * 获取-扣款申请号
    * @return payappno
     */
    public String getPayappno() {
        return payappno;
    }

    /**
    * 设置-扣款申请号
    * @paramType java.lang.String
    * @param payappno - 扣款申请号
     */
    public void setPayappno(String payappno) {
        this.payappno = payappno;
    }

    /**
    * 获取-退款唯一流水号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-退款唯一流水号
    * @paramType java.lang.String
    * @param custseq - 退款唯一流水号
     */
    public void setCustseq(String custseq) {
        this.custseq = custseq;
    }

    /**
    * 获取-应用id
    * @return appid
     */
    public String getAppid() {
        return appid;
    }

    /**
    * 设置-应用id
    * @paramType java.lang.String
    * @param appid - 应用id
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
    * 获取-商户号
    * @return mchid
     */
    public String getMchid() {
        return mchid;
    }

    /**
    * 设置-商户号
    * @paramType java.lang.String
    * @param mchid - 商户号
     */
    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    /**
    * 获取-微信支付订单号
    * @return transactionid
     */
    public String getTransactionid() {
        return transactionid;
    }

    /**
    * 设置-微信支付订单号
    * @paramType java.lang.String
    * @param transactionid - 微信支付订单号
     */
    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    /**
    * 获取-微信退款单号
    * @return refundid
     */
    public String getRefundid() {
        return refundid;
    }

    /**
    * 设置-微信退款单号
    * @paramType java.lang.String
    * @param refundid - 微信退款单号
     */
    public void setRefundid(String refundid) {
        this.refundid = refundid;
    }

    /**
    * 获取-商户退款单号
    * @return outrefundno
     */
    public String getOutrefundno() {
        return outrefundno;
    }

    /**
    * 设置-商户退款单号
    * @paramType java.lang.String
    * @param outrefundno - 商户退款单号
     */
    public void setOutrefundno(String outrefundno) {
        this.outrefundno = outrefundno;
    }

    /**
    * 获取-商户订单号
    * @return outtradeno
     */
    public String getOuttradeno() {
        return outtradeno;
    }

    /**
    * 设置-商户订单号
    * @paramType java.lang.String
    * @param outtradeno - 商户订单号
     */
    public void setOuttradeno(String outtradeno) {
        this.outtradeno = outtradeno;
    }

    /**
    * 获取-退款原因
    * @return refunddesc
     */
    public String getRefunddesc() {
        return refunddesc;
    }

    /**
    * 设置-退款原因
    * @paramType java.lang.String
    * @param refunddesc - 退款原因
     */
    public void setRefunddesc(String refunddesc) {
        this.refunddesc = refunddesc;
    }

    /**
    * 获取-投保单号
    * @return applicantno
     */
    public String getApplicantno() {
        return applicantno;
    }

    /**
    * 设置-投保单号
    * @paramType java.lang.String
    * @param applicantno - 投保单号
     */
    public void setApplicantno(String applicantno) {
        this.applicantno = applicantno;
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
    * 获取-退款状态 A申请扣款 S扣款成功 F扣款失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-退款状态 A申请扣款 S扣款成功 F扣款失败
    * @paramType java.lang.String
    * @param status - 退款状态 A申请扣款 S扣款成功 F扣款失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
    * 获取-扣款结果通知地址
    * @return notifyurl
     */
    public String getNotifyurl() {
        return notifyurl;
    }

    /**
    * 设置-扣款结果通知地址
    * @paramType java.lang.String
    * @param notifyurl - 扣款结果通知地址
     */
    public void setNotifyurl(String notifyurl) {
        this.notifyurl = notifyurl;
    }

    /**
    * 获取-返回结果
    * @return returncode
     */
    public String getReturncode() {
        return returncode;
    }

    /**
    * 设置-返回结果
    * @paramType java.lang.String
    * @param returncode - 返回结果
     */
    public void setReturncode(String returncode) {
        this.returncode = returncode;
    }

    /**
    * 获取-返回结果描述
    * @return returnmsg
     */
    public String getReturnmsg() {
        return returnmsg;
    }

    /**
    * 设置-返回结果描述
    * @paramType java.lang.String
    * @param returnmsg - 返回结果描述
     */
    public void setReturnmsg(String returnmsg) {
        this.returnmsg = returnmsg;
    }

    /**
    * 获取-业务结果
    * @return resultcode
     */
    public String getResultcode() {
        return resultcode;
    }

    /**
    * 设置-业务结果
    * @paramType java.lang.String
    * @param resultcode - 业务结果
     */
    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    /**
    * 获取-错误代码
    * @return errcode
     */
    public String getErrcode() {
        return errcode;
    }

    /**
    * 设置-错误代码
    * @paramType java.lang.String
    * @param errcode - 错误代码
     */
    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    /**
    * 获取-错误代码描述
    * @return errCodeDes
     */
    public String getErrCodeDes() {
        return errCodeDes;
    }

    /**
    * 设置-错误代码描述
    * @paramType java.lang.String
    * @param errCodeDes - 错误代码描述
     */
    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }

    /**
    * 获取-退款笔数
    * @return refundcount
     */
    public String getRefundcount() {
        return refundcount;
    }

    /**
    * 设置-退款笔数
    * @paramType java.lang.String
    * @param refundcount - 退款笔数
     */
    public void setRefundcount(String refundcount) {
        this.refundcount = refundcount;
    }

    /**
    * 获取-订单金额
    * @return amount
     */
    public String getAmount() {
        return amount;
    }

    /**
    * 设置-订单金额
    * @paramType java.lang.String
    * @param amount - 订单金额
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
    * 获取-退款金额
    * @return refundfee
     */
    public String getRefundfee() {
        return refundfee;
    }

    /**
    * 设置-退款金额
    * @paramType java.lang.String
    * @param refundfee - 退款金额
     */
    public void setRefundfee(String refundfee) {
        this.refundfee = refundfee;
    }

    /**
    * 获取-交易状态 SUCCESS：退款成功 REFUNDCLOSE：退款关闭 PROCESSING：退款处理中 CHANGE：退款异常
    * @return refundstatus
     */
    public String getRefundstatus() {
        return refundstatus;
    }

    /**
    * 设置-交易状态 SUCCESS：退款成功 REFUNDCLOSE：退款关闭 PROCESSING：退款处理中 CHANGE：退款异常
    * @paramType java.lang.String
    * @param refundstatus - 交易状态 SUCCESS：退款成功 REFUNDCLOSE：退款关闭 PROCESSING：退款处理中 CHANGE：退款异常
     */
    public void setRefundstatus(String refundstatus) {
        this.refundstatus = refundstatus;
    }

    /**
    * 获取-退款入账账户
    * @return refundRecvAccout
     */
    public String getRefundRecvAccout() {
        return refundRecvAccout;
    }

    /**
    * 设置-退款入账账户
    * @paramType java.lang.String
    * @param refundRecvAccout - 退款入账账户
     */
    public void setRefundRecvAccout(String refundRecvAccout) {
        this.refundRecvAccout = refundRecvAccout;
    }

    /**
    * 获取-退款成功时间
    * @return refundSuccessTime
     */
    public Date getRefundSuccessTime() {
        return refundSuccessTime;
    }

    /**
    * 设置-退款成功时间
    * @paramType java.util.Date
    * @param refundSuccessTime - 退款成功时间
     */
    public void setRefundSuccessTime(Date refundSuccessTime) {
        this.refundSuccessTime = refundSuccessTime;
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
}