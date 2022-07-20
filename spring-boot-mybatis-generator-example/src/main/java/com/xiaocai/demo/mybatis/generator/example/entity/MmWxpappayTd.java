package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_wxpappay_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmWxpappayTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 扣款申请号
     */
    private String payappno;

    /**
     * 唯一流水号
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
     * 协议模板id
     */
    private String planid;

    /**
     * 委托代扣协议id
     */
    private String contractid;

    /**
     * 商户订单号
     */
    private String outtradeno;

    /**
     * 用户标识
     */
    private String openid;

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
     * 分期缴费期次
     */
    private String installmentstimes;

    /**
     * 扣款状态 A申请扣款 S扣款成功 F扣款失败 G已撤销 
     */
    private String status;

    /**
     * 扣款结果通知地址
     */
    private String notifyurl;

    /**
     * 操作完成跳转地址
     */
    private String returnurl;

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
     * 付款银行
     */
    private String banktype;

    /**
     * 订单金额
     */
    private String amount;

    /**
     * 交易状态
     */
    private String tradestate;

    /**
     * 微信支付订单号
     */
    private String transactionid;

    /**
     * 商家数据包
     */
    private String attach;

    /**
     * 操作时间
     */
    private Date timeend;

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
    * 获取-唯一流水号
    * @return custseq
     */
    public String getCustseq() {
        return custseq;
    }

    /**
    * 设置-唯一流水号
    * @paramType java.lang.String
    * @param custseq - 唯一流水号
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
    * 获取-协议模板id
    * @return planid
     */
    public String getPlanid() {
        return planid;
    }

    /**
    * 设置-协议模板id
    * @paramType java.lang.String
    * @param planid - 协议模板id
     */
    public void setPlanid(String planid) {
        this.planid = planid;
    }

    /**
    * 获取-委托代扣协议id
    * @return contractid
     */
    public String getContractid() {
        return contractid;
    }

    /**
    * 设置-委托代扣协议id
    * @paramType java.lang.String
    * @param contractid - 委托代扣协议id
     */
    public void setContractid(String contractid) {
        this.contractid = contractid;
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
    * 获取-用户标识
    * @return openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
    * 设置-用户标识
    * @paramType java.lang.String
    * @param openid - 用户标识
     */
    public void setOpenid(String openid) {
        this.openid = openid;
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
    * 获取-分期缴费期次
    * @return installmentstimes
     */
    public String getInstallmentstimes() {
        return installmentstimes;
    }

    /**
    * 设置-分期缴费期次
    * @paramType java.lang.String
    * @param installmentstimes - 分期缴费期次
     */
    public void setInstallmentstimes(String installmentstimes) {
        this.installmentstimes = installmentstimes;
    }

    /**
    * 获取-扣款状态 A申请扣款 S扣款成功 F扣款失败 G已撤销 
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-扣款状态 A申请扣款 S扣款成功 F扣款失败 G已撤销 
    * @paramType java.lang.String
    * @param status - 扣款状态 A申请扣款 S扣款成功 F扣款失败 G已撤销 
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
    * 获取-操作完成跳转地址
    * @return returnurl
     */
    public String getReturnurl() {
        return returnurl;
    }

    /**
    * 设置-操作完成跳转地址
    * @paramType java.lang.String
    * @param returnurl - 操作完成跳转地址
     */
    public void setReturnurl(String returnurl) {
        this.returnurl = returnurl;
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
    * 获取-付款银行
    * @return banktype
     */
    public String getBanktype() {
        return banktype;
    }

    /**
    * 设置-付款银行
    * @paramType java.lang.String
    * @param banktype - 付款银行
     */
    public void setBanktype(String banktype) {
        this.banktype = banktype;
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
    * 获取-交易状态
    * @return tradestate
     */
    public String getTradestate() {
        return tradestate;
    }

    /**
    * 设置-交易状态
    * @paramType java.lang.String
    * @param tradestate - 交易状态
     */
    public void setTradestate(String tradestate) {
        this.tradestate = tradestate;
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
    * 获取-商家数据包
    * @return attach
     */
    public String getAttach() {
        return attach;
    }

    /**
    * 设置-商家数据包
    * @paramType java.lang.String
    * @param attach - 商家数据包
     */
    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
    * 获取-操作时间
    * @return timeend
     */
    public Date getTimeend() {
        return timeend;
    }

    /**
    * 设置-操作时间
    * @paramType java.util.Date
    * @param timeend - 操作时间
     */
    public void setTimeend(Date timeend) {
        this.timeend = timeend;
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