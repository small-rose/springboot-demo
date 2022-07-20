package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_ftp_jobtask_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmFtpJobtaskTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 商户号
     */
    private String mid;

    /**
     * ftp域名地址
     */
    private String ftprealmname;

    /**
     * ftpIp地址
     */
    private String ftpip;

    /**
     * ftp用户
     */
    private String ftpuser;

    /**
     * ftp密码
     */
    private String ftppassword;

    /**
     * 对账单类型:0为初始状态（目前只有三种：1为银行卡支付对账单，9为线上支付，68为POS机扫顾客）
     */
    private String filetype;

    /**
     * 银联地域
     */
    private String ftpregion;

    /**
     * 获取指定日期对账单
     */
    private Date appointdate;

    /**
     * 本地路径
     */
    private String localpath;

    /**
     * 解析成功移动至此路径
     */
    private String localpathsuc;

    /**
     * 解析失败移动至此路径
     */
    private String localpatherr;

    /**
     * 0初始状态，1成功，2失败
     */
    private String status;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
     * ftp服务器文件路径
     */
    private String ftppath;

    /**
     * 注释
     */
    private String content;

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
    * 获取-商户号
    * @return mid
     */
    public String getMid() {
        return mid;
    }

    /**
    * 设置-商户号
    * @paramType java.lang.String
    * @param mid - 商户号
     */
    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
    * 获取-ftp域名地址
    * @return ftprealmname
     */
    public String getFtprealmname() {
        return ftprealmname;
    }

    /**
    * 设置-ftp域名地址
    * @paramType java.lang.String
    * @param ftprealmname - ftp域名地址
     */
    public void setFtprealmname(String ftprealmname) {
        this.ftprealmname = ftprealmname;
    }

    /**
    * 获取-ftpIp地址
    * @return ftpip
     */
    public String getFtpip() {
        return ftpip;
    }

    /**
    * 设置-ftpIp地址
    * @paramType java.lang.String
    * @param ftpip - ftpIp地址
     */
    public void setFtpip(String ftpip) {
        this.ftpip = ftpip;
    }

    /**
    * 获取-ftp用户
    * @return ftpuser
     */
    public String getFtpuser() {
        return ftpuser;
    }

    /**
    * 设置-ftp用户
    * @paramType java.lang.String
    * @param ftpuser - ftp用户
     */
    public void setFtpuser(String ftpuser) {
        this.ftpuser = ftpuser;
    }

    /**
    * 获取-ftp密码
    * @return ftppassword
     */
    public String getFtppassword() {
        return ftppassword;
    }

    /**
    * 设置-ftp密码
    * @paramType java.lang.String
    * @param ftppassword - ftp密码
     */
    public void setFtppassword(String ftppassword) {
        this.ftppassword = ftppassword;
    }

    /**
    * 获取-对账单类型:0为初始状态（目前只有三种：1为银行卡支付对账单，9为线上支付，68为POS机扫顾客）
    * @return filetype
     */
    public String getFiletype() {
        return filetype;
    }

    /**
    * 设置-对账单类型:0为初始状态（目前只有三种：1为银行卡支付对账单，9为线上支付，68为POS机扫顾客）
    * @paramType java.lang.String
    * @param filetype - 对账单类型:0为初始状态（目前只有三种：1为银行卡支付对账单，9为线上支付，68为POS机扫顾客）
     */
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    /**
    * 获取-银联地域
    * @return ftpregion
     */
    public String getFtpregion() {
        return ftpregion;
    }

    /**
    * 设置-银联地域
    * @paramType java.lang.String
    * @param ftpregion - 银联地域
     */
    public void setFtpregion(String ftpregion) {
        this.ftpregion = ftpregion;
    }

    /**
    * 获取-获取指定日期对账单
    * @return appointdate
     */
    public Date getAppointdate() {
        return appointdate;
    }

    /**
    * 设置-获取指定日期对账单
    * @paramType java.util.Date
    * @param appointdate - 获取指定日期对账单
     */
    public void setAppointdate(Date appointdate) {
        this.appointdate = appointdate;
    }

    /**
    * 获取-本地路径
    * @return localpath
     */
    public String getLocalpath() {
        return localpath;
    }

    /**
    * 设置-本地路径
    * @paramType java.lang.String
    * @param localpath - 本地路径
     */
    public void setLocalpath(String localpath) {
        this.localpath = localpath;
    }

    /**
    * 获取-解析成功移动至此路径
    * @return localpathsuc
     */
    public String getLocalpathsuc() {
        return localpathsuc;
    }

    /**
    * 设置-解析成功移动至此路径
    * @paramType java.lang.String
    * @param localpathsuc - 解析成功移动至此路径
     */
    public void setLocalpathsuc(String localpathsuc) {
        this.localpathsuc = localpathsuc;
    }

    /**
    * 获取-解析失败移动至此路径
    * @return localpatherr
     */
    public String getLocalpatherr() {
        return localpatherr;
    }

    /**
    * 设置-解析失败移动至此路径
    * @paramType java.lang.String
    * @param localpatherr - 解析失败移动至此路径
     */
    public void setLocalpatherr(String localpatherr) {
        this.localpatherr = localpatherr;
    }

    /**
    * 获取-0初始状态，1成功，2失败
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-0初始状态，1成功，2失败
    * @paramType java.lang.String
    * @param status - 0初始状态，1成功，2失败
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-ftp服务器文件路径
    * @return ftppath
     */
    public String getFtppath() {
        return ftppath;
    }

    /**
    * 设置-ftp服务器文件路径
    * @paramType java.lang.String
    * @param ftppath - ftp服务器文件路径
     */
    public void setFtppath(String ftppath) {
        this.ftppath = ftppath;
    }

    /**
    * 获取-注释
    * @return content
     */
    public String getContent() {
        return content;
    }

    /**
    * 设置-注释
    * @paramType java.lang.String
    * @param content - 注释
     */
    public void setContent(String content) {
        this.content = content;
    }
}