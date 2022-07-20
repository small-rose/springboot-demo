package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_mail_service_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmMailServiceTc {
    /**
     * 邮件模板业务代码
     */
    private String mailcode;

    /**
     * 账户
     */
    private String mailaddr;

    /**
     * 密码
     */
    private String passcode;

    /**
     * 邮件服务地址
     */
    private String hostaddr;

    /**
     * 是否有效
     */
    private String ifvalid;

    /**
     * 描述
     */
    private String description;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 版本号
     */
    private Long hibernateversion;

    /**
    * 获取-邮件模板业务代码
    * @return mailcode
     */
    public String getMailcode() {
        return mailcode;
    }

    /**
    * 设置-邮件模板业务代码
    * @paramType java.lang.String
    * @param mailcode - 邮件模板业务代码
     */
    public void setMailcode(String mailcode) {
        this.mailcode = mailcode;
    }

    /**
    * 获取-账户
    * @return mailaddr
     */
    public String getMailaddr() {
        return mailaddr;
    }

    /**
    * 设置-账户
    * @paramType java.lang.String
    * @param mailaddr - 账户
     */
    public void setMailaddr(String mailaddr) {
        this.mailaddr = mailaddr;
    }

    /**
    * 获取-密码
    * @return passcode
     */
    public String getPasscode() {
        return passcode;
    }

    /**
    * 设置-密码
    * @paramType java.lang.String
    * @param passcode - 密码
     */
    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    /**
    * 获取-邮件服务地址
    * @return hostaddr
     */
    public String getHostaddr() {
        return hostaddr;
    }

    /**
    * 设置-邮件服务地址
    * @paramType java.lang.String
    * @param hostaddr - 邮件服务地址
     */
    public void setHostaddr(String hostaddr) {
        this.hostaddr = hostaddr;
    }

    /**
    * 获取-是否有效
    * @return ifvalid
     */
    public String getIfvalid() {
        return ifvalid;
    }

    /**
    * 设置-是否有效
    * @paramType java.lang.String
    * @param ifvalid - 是否有效
     */
    public void setIfvalid(String ifvalid) {
        this.ifvalid = ifvalid;
    }

    /**
    * 获取-描述
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-描述
    * @paramType java.lang.String
    * @param description - 描述
     */
    public void setDescription(String description) {
        this.description = description;
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
    public Long getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本号
    * @paramType java.lang.Long
    * @param hibernateversion - 版本号
     */
    public void setHibernateversion(Long hibernateversion) {
        this.hibernateversion = hibernateversion;
    }
}