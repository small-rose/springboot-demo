package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_invoice_back_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmInvoiceBackTi {
    /**
     * 主键
     */
    private Long id;

    /**
     * 交易流水号
     */
    private String reqserialno;

    /**
     * 请求类型
     */
    private String requesttype;

    /**
     * 请求服务时间
     */
    private String flowintime;

    /**
     * 票据ID
     */
    private String invoiceid;

    /**
     * 发票代码
     */
    private String invoicecode;

    /**
     * 发票号码
     */
    private String invoiceno;

    /**
     * 发票类型
     */
    private String invoicetype;

    /**
     * 发票状态：0初始状态，01已开具，02已作废，03已红冲
     */
    private String invoicestatus;

    /**
     * 失败原因
     */
    private String reason;

    /**
     * 复核人
     */
    private String reviewperson;

    /**
     * 开票日期
     */
    private Date printdate;

    /**
     * 作废、红冲日期
     */
    private Date returncanldate;

    /**
     * HIBERNATEVERSION版本号
     */
    private Integer hibernateversion;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * 落地状态：0初始状态 2落地成功 3落地失败
     */
    private String landstatus;

    /**
     * 落地信息
     */
    private String landmsg;

    /**
     * 状态：0初始状态 2成功 3作废
     */
    private String opstatus;

    /**
     * 处理信息
     */
    private String opmsg;

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
    * 获取-交易流水号
    * @return reqserialno
     */
    public String getReqserialno() {
        return reqserialno;
    }

    /**
    * 设置-交易流水号
    * @paramType java.lang.String
    * @param reqserialno - 交易流水号
     */
    public void setReqserialno(String reqserialno) {
        this.reqserialno = reqserialno;
    }

    /**
    * 获取-请求类型
    * @return requesttype
     */
    public String getRequesttype() {
        return requesttype;
    }

    /**
    * 设置-请求类型
    * @paramType java.lang.String
    * @param requesttype - 请求类型
     */
    public void setRequesttype(String requesttype) {
        this.requesttype = requesttype;
    }

    /**
    * 获取-请求服务时间
    * @return flowintime
     */
    public String getFlowintime() {
        return flowintime;
    }

    /**
    * 设置-请求服务时间
    * @paramType java.lang.String
    * @param flowintime - 请求服务时间
     */
    public void setFlowintime(String flowintime) {
        this.flowintime = flowintime;
    }

    /**
    * 获取-票据ID
    * @return invoiceid
     */
    public String getInvoiceid() {
        return invoiceid;
    }

    /**
    * 设置-票据ID
    * @paramType java.lang.String
    * @param invoiceid - 票据ID
     */
    public void setInvoiceid(String invoiceid) {
        this.invoiceid = invoiceid;
    }

    /**
    * 获取-发票代码
    * @return invoicecode
     */
    public String getInvoicecode() {
        return invoicecode;
    }

    /**
    * 设置-发票代码
    * @paramType java.lang.String
    * @param invoicecode - 发票代码
     */
    public void setInvoicecode(String invoicecode) {
        this.invoicecode = invoicecode;
    }

    /**
    * 获取-发票号码
    * @return invoiceno
     */
    public String getInvoiceno() {
        return invoiceno;
    }

    /**
    * 设置-发票号码
    * @paramType java.lang.String
    * @param invoiceno - 发票号码
     */
    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    /**
    * 获取-发票类型
    * @return invoicetype
     */
    public String getInvoicetype() {
        return invoicetype;
    }

    /**
    * 设置-发票类型
    * @paramType java.lang.String
    * @param invoicetype - 发票类型
     */
    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    /**
    * 获取-发票状态：0初始状态，01已开具，02已作废，03已红冲
    * @return invoicestatus
     */
    public String getInvoicestatus() {
        return invoicestatus;
    }

    /**
    * 设置-发票状态：0初始状态，01已开具，02已作废，03已红冲
    * @paramType java.lang.String
    * @param invoicestatus - 发票状态：0初始状态，01已开具，02已作废，03已红冲
     */
    public void setInvoicestatus(String invoicestatus) {
        this.invoicestatus = invoicestatus;
    }

    /**
    * 获取-失败原因
    * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
    * 设置-失败原因
    * @paramType java.lang.String
    * @param reason - 失败原因
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
    * 获取-复核人
    * @return reviewperson
     */
    public String getReviewperson() {
        return reviewperson;
    }

    /**
    * 设置-复核人
    * @paramType java.lang.String
    * @param reviewperson - 复核人
     */
    public void setReviewperson(String reviewperson) {
        this.reviewperson = reviewperson;
    }

    /**
    * 获取-开票日期
    * @return printdate
     */
    public Date getPrintdate() {
        return printdate;
    }

    /**
    * 设置-开票日期
    * @paramType java.util.Date
    * @param printdate - 开票日期
     */
    public void setPrintdate(Date printdate) {
        this.printdate = printdate;
    }

    /**
    * 获取-作废、红冲日期
    * @return returncanldate
     */
    public Date getReturncanldate() {
        return returncanldate;
    }

    /**
    * 设置-作废、红冲日期
    * @paramType java.util.Date
    * @param returncanldate - 作废、红冲日期
     */
    public void setReturncanldate(Date returncanldate) {
        this.returncanldate = returncanldate;
    }

    /**
    * 获取-HIBERNATEVERSION版本号
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-HIBERNATEVERSION版本号
    * @paramType java.lang.Integer
    * @param hibernateversion - HIBERNATEVERSION版本号
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
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
    * 获取-最后操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }

    /**
    * 获取-落地状态：0初始状态 2落地成功 3落地失败
    * @return landstatus
     */
    public String getLandstatus() {
        return landstatus;
    }

    /**
    * 设置-落地状态：0初始状态 2落地成功 3落地失败
    * @paramType java.lang.String
    * @param landstatus - 落地状态：0初始状态 2落地成功 3落地失败
     */
    public void setLandstatus(String landstatus) {
        this.landstatus = landstatus;
    }

    /**
    * 获取-落地信息
    * @return landmsg
     */
    public String getLandmsg() {
        return landmsg;
    }

    /**
    * 设置-落地信息
    * @paramType java.lang.String
    * @param landmsg - 落地信息
     */
    public void setLandmsg(String landmsg) {
        this.landmsg = landmsg;
    }

    /**
    * 获取-状态：0初始状态 2成功 3作废
    * @return opstatus
     */
    public String getOpstatus() {
        return opstatus;
    }

    /**
    * 设置-状态：0初始状态 2成功 3作废
    * @paramType java.lang.String
    * @param opstatus - 状态：0初始状态 2成功 3作废
     */
    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus;
    }

    /**
    * 获取-处理信息
    * @return opmsg
     */
    public String getOpmsg() {
        return opmsg;
    }

    /**
    * 设置-处理信息
    * @paramType java.lang.String
    * @param opmsg - 处理信息
     */
    public void setOpmsg(String opmsg) {
        this.opmsg = opmsg;
    }
}