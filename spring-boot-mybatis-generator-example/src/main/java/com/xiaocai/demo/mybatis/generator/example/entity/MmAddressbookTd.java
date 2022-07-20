package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_addressbook_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmAddressbookTd {
    /**
     * 主键
     */
    private Long id;

    /**
     * 邮箱地址
     */
    private String emailaddress;

    /**
     * 联系人姓名
     */
    private String name;

    /**
     * 电话号码
     */
    private String telphone;

    /**
     * 最后修改人
     */
    private String lastopcode;

    /**
     * 创建时间
     */
    private Date createdate;

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
    * 获取-邮箱地址
    * @return emailaddress
     */
    public String getEmailaddress() {
        return emailaddress;
    }

    /**
    * 设置-邮箱地址
    * @paramType java.lang.String
    * @param emailaddress - 邮箱地址
     */
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    /**
    * 获取-联系人姓名
    * @return name
     */
    public String getName() {
        return name;
    }

    /**
    * 设置-联系人姓名
    * @paramType java.lang.String
    * @param name - 联系人姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
    * 获取-电话号码
    * @return telphone
     */
    public String getTelphone() {
        return telphone;
    }

    /**
    * 设置-电话号码
    * @paramType java.lang.String
    * @param telphone - 电话号码
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone;
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
    * 获取-创建时间
    * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
    * 设置-创建时间
    * @paramType java.util.Date
    * @param createdate - 创建时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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