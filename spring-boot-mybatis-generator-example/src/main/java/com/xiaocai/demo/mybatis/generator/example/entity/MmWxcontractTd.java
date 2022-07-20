package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_wxcontract_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmWxcontractTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 签约申请号
     */
    private String payappno;

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
     * 签约结果通知地址
     */
    private String notifyurl;

    /**
     * 签约完成跳转地址
     */
    private String returnurl;

    /**
     * 投保单号
     */
    private String applicantno;

    /**
     * 委托代扣协议id
     */
    private String contractid;

    /**
     * 用户标识
     */
    private String openid;

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
     * 签约协议号
     */
    private String contactcode;

    /**
     * 签约结果ADD：签约,DELETE:解约
     */
    private String changetype;

    /**
     * 协议解约方式
     */
    private String contracttermination;

    /**
     * 操作时间
     */
    private Date operatetime;

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
    * 获取-签约申请号
    * @return payappno
     */
    public String getPayappno() {
        return payappno;
    }

    /**
    * 设置-签约申请号
    * @paramType java.lang.String
    * @param payappno - 签约申请号
     */
    public void setPayappno(String payappno) {
        this.payappno = payappno;
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
    * 获取-签约结果通知地址
    * @return notifyurl
     */
    public String getNotifyurl() {
        return notifyurl;
    }

    /**
    * 设置-签约结果通知地址
    * @paramType java.lang.String
    * @param notifyurl - 签约结果通知地址
     */
    public void setNotifyurl(String notifyurl) {
        this.notifyurl = notifyurl;
    }

    /**
    * 获取-签约完成跳转地址
    * @return returnurl
     */
    public String getReturnurl() {
        return returnurl;
    }

    /**
    * 设置-签约完成跳转地址
    * @paramType java.lang.String
    * @param returnurl - 签约完成跳转地址
     */
    public void setReturnurl(String returnurl) {
        this.returnurl = returnurl;
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
    * 获取-签约协议号
    * @return contactcode
     */
    public String getContactcode() {
        return contactcode;
    }

    /**
    * 设置-签约协议号
    * @paramType java.lang.String
    * @param contactcode - 签约协议号
     */
    public void setContactcode(String contactcode) {
        this.contactcode = contactcode;
    }

    /**
    * 获取-签约结果ADD：签约,DELETE:解约
    * @return changetype
     */
    public String getChangetype() {
        return changetype;
    }

    /**
    * 设置-签约结果ADD：签约,DELETE:解约
    * @paramType java.lang.String
    * @param changetype - 签约结果ADD：签约,DELETE:解约
     */
    public void setChangetype(String changetype) {
        this.changetype = changetype;
    }

    /**
    * 获取-协议解约方式
    * @return contracttermination
     */
    public String getContracttermination() {
        return contracttermination;
    }

    /**
    * 设置-协议解约方式
    * @paramType java.lang.String
    * @param contracttermination - 协议解约方式
     */
    public void setContracttermination(String contracttermination) {
        this.contracttermination = contracttermination;
    }

    /**
    * 获取-操作时间
    * @return operatetime
     */
    public Date getOperatetime() {
        return operatetime;
    }

    /**
    * 设置-操作时间
    * @paramType java.util.Date
    * @param operatetime - 操作时间
     */
    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
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