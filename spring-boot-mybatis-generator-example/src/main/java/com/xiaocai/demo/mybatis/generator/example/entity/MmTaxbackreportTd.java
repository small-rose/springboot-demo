package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_taxbackreport_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaxbackreportTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 机构代码
     */
    private String comcode;

    /**
     * 上报日期 YYYYMMDD 格式
     */
    private String datetime;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 访问类型
     */
    private String requesttype;

    /**
     * 返回类型(1成功,其他为失败)
     */
    private String responsecode;

    /**
     * 错误代码(0000为成功,其他为失败)
     */
    private String errorcode;

    /**
     * 错误信息
     */
    private String errormessage;

    /**
     * 具体错误代码
     */
    private String errorcodedetail;

    /**
     * 错误说明
     */
    private String errormessagedetail;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作日期
     */
    private Date lastopdate;

    /**
     * HIBERNATE版本号
     */
    private Integer hibernateversion;

    /**
     * 上传标识 1:初始化 2:上传成功 3:上传失败
     */
    private String ifupload;

    /**
     * 保批单流水号
     */
    private String seqpolicy;

    /**
     * 投保确认码
     */
    private String confirmsequenceno;

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
    * 获取-机构代码
    * @return comcode
     */
    public String getComcode() {
        return comcode;
    }

    /**
    * 设置-机构代码
    * @paramType java.lang.String
    * @param comcode - 机构代码
     */
    public void setComcode(String comcode) {
        this.comcode = comcode;
    }

    /**
    * 获取-上报日期 YYYYMMDD 格式
    * @return datetime
     */
    public String getDatetime() {
        return datetime;
    }

    /**
    * 设置-上报日期 YYYYMMDD 格式
    * @paramType java.lang.String
    * @param datetime - 上报日期 YYYYMMDD 格式
     */
    public void setDatetime(String datetime) {
        this.datetime = datetime;
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
    * 获取-访问类型
    * @return requesttype
     */
    public String getRequesttype() {
        return requesttype;
    }

    /**
    * 设置-访问类型
    * @paramType java.lang.String
    * @param requesttype - 访问类型
     */
    public void setRequesttype(String requesttype) {
        this.requesttype = requesttype;
    }

    /**
    * 获取-返回类型(1成功,其他为失败)
    * @return responsecode
     */
    public String getResponsecode() {
        return responsecode;
    }

    /**
    * 设置-返回类型(1成功,其他为失败)
    * @paramType java.lang.String
    * @param responsecode - 返回类型(1成功,其他为失败)
     */
    public void setResponsecode(String responsecode) {
        this.responsecode = responsecode;
    }

    /**
    * 获取-错误代码(0000为成功,其他为失败)
    * @return errorcode
     */
    public String getErrorcode() {
        return errorcode;
    }

    /**
    * 设置-错误代码(0000为成功,其他为失败)
    * @paramType java.lang.String
    * @param errorcode - 错误代码(0000为成功,其他为失败)
     */
    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    /**
    * 获取-错误信息
    * @return errormessage
     */
    public String getErrormessage() {
        return errormessage;
    }

    /**
    * 设置-错误信息
    * @paramType java.lang.String
    * @param errormessage - 错误信息
     */
    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    /**
    * 获取-具体错误代码
    * @return errorcodedetail
     */
    public String getErrorcodedetail() {
        return errorcodedetail;
    }

    /**
    * 设置-具体错误代码
    * @paramType java.lang.String
    * @param errorcodedetail - 具体错误代码
     */
    public void setErrorcodedetail(String errorcodedetail) {
        this.errorcodedetail = errorcodedetail;
    }

    /**
    * 获取-错误说明
    * @return errormessagedetail
     */
    public String getErrormessagedetail() {
        return errormessagedetail;
    }

    /**
    * 设置-错误说明
    * @paramType java.lang.String
    * @param errormessagedetail - 错误说明
     */
    public void setErrormessagedetail(String errormessagedetail) {
        this.errormessagedetail = errormessagedetail;
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
    * 获取-最后操作日期
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作日期
    * @paramType java.util.Date
    * @param lastopdate - 最后操作日期
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-HIBERNATE版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATE版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATE版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-上传标识 1:初始化 2:上传成功 3:上传失败
    * @return ifupload
     */
    public String getIfupload() {
        return ifupload;
    }

    /**
    * 设置-上传标识 1:初始化 2:上传成功 3:上传失败
    * @paramType java.lang.String
    * @param ifupload - 上传标识 1:初始化 2:上传成功 3:上传失败
     */
    public void setIfupload(String ifupload) {
        this.ifupload = ifupload;
    }

    /**
    * 获取-保批单流水号
    * @return seqpolicy
     */
    public String getSeqpolicy() {
        return seqpolicy;
    }

    /**
    * 设置-保批单流水号
    * @paramType java.lang.String
    * @param seqpolicy - 保批单流水号
     */
    public void setSeqpolicy(String seqpolicy) {
        this.seqpolicy = seqpolicy;
    }

    /**
    * 获取-投保确认码
    * @return confirmsequenceno
     */
    public String getConfirmsequenceno() {
        return confirmsequenceno;
    }

    /**
    * 设置-投保确认码
    * @paramType java.lang.String
    * @param confirmsequenceno - 投保确认码
     */
    public void setConfirmsequenceno(String confirmsequenceno) {
        this.confirmsequenceno = confirmsequenceno;
    }
}