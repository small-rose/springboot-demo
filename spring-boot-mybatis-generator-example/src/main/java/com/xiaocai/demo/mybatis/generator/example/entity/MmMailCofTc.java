package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_mail_cof_tc
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmMailCofTc {
    /**
     * 邮件模板业务代码
     */
    private String mailcode;

    /**
     * 财务机构代码
     */
    private String unitcode;

    /**
     * 业务险种
     */
    private String classescode;

    /**
     * 分公司代码
     */
    private String subcompany;

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
     * 版本
     */
    private Long hibernateversion;

    /**
     * 数据修改说明
     */
    private String modifydesc;

    /**
     * 邮件正文
     */
    private String content;

    /**
     * 邮件标题
     */
    private String subject;

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
    * 获取-财务机构代码
    * @return unitcode
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
    * 设置-财务机构代码
    * @paramType java.lang.String
    * @param unitcode - 财务机构代码
     */
    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
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
    * 获取-分公司代码
    * @return subcompany
     */
    public String getSubcompany() {
        return subcompany;
    }

    /**
    * 设置-分公司代码
    * @paramType java.lang.String
    * @param subcompany - 分公司代码
     */
    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany;
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
    * 获取-版本
    * @return hibernateversion
     */
    public Long getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本
    * @paramType java.lang.Long
    * @param hibernateversion - 版本
     */
    public void setHibernateversion(Long hibernateversion) {
        this.hibernateversion = hibernateversion;
    }

    /**
    * 获取-数据修改说明
    * @return modifydesc
     */
    public String getModifydesc() {
        return modifydesc;
    }

    /**
    * 设置-数据修改说明
    * @paramType java.lang.String
    * @param modifydesc - 数据修改说明
     */
    public void setModifydesc(String modifydesc) {
        this.modifydesc = modifydesc;
    }

    /**
    * 获取-邮件正文
    * @return content
     */
    public String getContent() {
        return content;
    }

    /**
    * 设置-邮件正文
    * @paramType java.lang.String
    * @param content - 邮件正文
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
    * 获取-邮件标题
    * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
    * 设置-邮件标题
    * @paramType java.lang.String
    * @param subject - 邮件标题
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
}