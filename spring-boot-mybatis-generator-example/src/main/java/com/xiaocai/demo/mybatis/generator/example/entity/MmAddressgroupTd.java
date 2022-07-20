package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_addressgroup_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAddressgroupTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 收件人组或收信人组
     */
    private String grouptype;

    /**
     * 分公司
     */
    private String subcompany;

    /**
     * 业务来源
     */
    private String datasource;

    /**
     * 收件人邮箱地址，多个收件人时以 ; 隔开
     */
    private String emailaddress;

    /**
     * 抄送人邮箱地址，多个收件人时以 ; 隔开
     */
    private String ccemailaddress;

    /**
     * 电话号码，当此字段有值时使用，多个人时使用";"隔开
     */
    private String telphone;

    /**
     * 创建人
     */
    private String opcode;

    /**
     * 最后修改人
     */
    private String lastopcode;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后修改时间
     */
    private Date lastopdate;

    /**
     * 版本号
     */
    private Integer hibernateversion;

    /**
     * 备注
     */
    private String description;

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
    * 获取-收件人组或收信人组
    * @return grouptype
     */
    public String getGrouptype() {
        return grouptype;
    }

    /**
    * 设置-收件人组或收信人组
    * @paramType java.lang.String
    * @param grouptype - 收件人组或收信人组
     */
    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype;
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
    * 获取-业务来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-业务来源
    * @paramType java.lang.String
    * @param datasource - 业务来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-收件人邮箱地址，多个收件人时以 ; 隔开
    * @return emailaddress
     */
    public String getEmailaddress() {
        return emailaddress;
    }

    /**
    * 设置-收件人邮箱地址，多个收件人时以 ; 隔开
    * @paramType java.lang.String
    * @param emailaddress - 收件人邮箱地址，多个收件人时以 ; 隔开
     */
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    /**
    * 获取-抄送人邮箱地址，多个收件人时以 ; 隔开
    * @return ccemailaddress
     */
    public String getCcemailaddress() {
        return ccemailaddress;
    }

    /**
    * 设置-抄送人邮箱地址，多个收件人时以 ; 隔开
    * @paramType java.lang.String
    * @param ccemailaddress - 抄送人邮箱地址，多个收件人时以 ; 隔开
     */
    public void setCcemailaddress(String ccemailaddress) {
        this.ccemailaddress = ccemailaddress;
    }

    /**
    * 获取-电话号码，当此字段有值时使用，多个人时使用";"隔开
    * @return telphone
     */
    public String getTelphone() {
        return telphone;
    }

    /**
    * 设置-电话号码，当此字段有值时使用，多个人时使用";"隔开
    * @paramType java.lang.String
    * @param telphone - 电话号码，当此字段有值时使用，多个人时使用";"隔开
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    /**
    * 获取-创建人
    * @return opcode
     */
    public String getOpcode() {
        return opcode;
    }

    /**
    * 设置-创建人
    * @paramType java.lang.String
    * @param opcode - 创建人
     */
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    /**
    * 获取-最后修改人
    * @return lastopcode
     */
    public String getLastopcode() {
        return lastopcode;
    }

    /**
    * 设置-最后修改人
    * @paramType java.lang.String
    * @param lastopcode - 最后修改人
     */
    public void setLastopcode(String lastopcode) {
        this.lastopcode = lastopcode;
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
    * 获取-最后修改时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后修改时间
    * @paramType java.util.Date
    * @param lastopdate - 最后修改时间
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
    * 获取-备注
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param description - 备注
     */
    public void setDescription(String description) {
        this.description = description;
    }
}