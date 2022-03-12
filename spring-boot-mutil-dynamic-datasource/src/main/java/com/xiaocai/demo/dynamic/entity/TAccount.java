package com.xiaocai.demo.dynamic.entity;

import java.util.Date;

/**
 *  
 * @Table : t_account
 * @author : zzy
 * @date : 2022-03-12 15:51:51
 * @modify : 
 */
public class TAccount {
    /**
     * id
     */
    private Long id;

    /**
     * 账户名称
     */
    private String name;

    /**
     * 账户密码
     */
    private String pass;

    /**
     * 创建日期
     */
    private Date addDate;

    /**
     * 最后登录时间
     */
    private Date lastLogin;

    /**
     * 账户余额
     */
    private Long balance;

    /**
     * 自我介绍
     */
    private String description;

    /**
     * 个人头像
     */
    private byte[] headImage;

    /**
    * 获取-id
    * @return id
     */
    public Long getId() {
        return id;
    }

    /**
    * 设置-id
    * @paramType java.lang.Long
    * @param id - id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * 获取-账户名称
    * @return name
     */
    public String getName() {
        return name;
    }

    /**
    * 设置-账户名称
    * @paramType java.lang.String
    * @param name - 账户名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
    * 获取-账户密码
    * @return pass
     */
    public String getPass() {
        return pass;
    }

    /**
    * 设置-账户密码
    * @paramType java.lang.String
    * @param pass - 账户密码
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
    * 获取-创建日期
    * @return addDate
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
    * 设置-创建日期
    * @paramType java.util.Date
    * @param addDate - 创建日期
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    /**
    * 获取-最后登录时间
    * @return lastLogin
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
    * 设置-最后登录时间
    * @paramType java.util.Date
    * @param lastLogin - 最后登录时间
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
    * 获取-账户余额
    * @return balance
     */
    public Long getBalance() {
        return balance;
    }

    /**
    * 设置-账户余额
    * @paramType java.lang.Long
    * @param balance - 账户余额
     */
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    /**
    * 获取-自我介绍
    * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
    * 设置-自我介绍
    * @paramType java.lang.String
    * @param description - 自我介绍
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * 获取-个人头像
    * @return headImage
     */
    public byte[] getHeadImage() {
        return headImage;
    }

    /**
    * 设置-个人头像
    * @paramType byte[]
    * @param headImage - 个人头像
     */
    public void setHeadImage(byte[] headImage) {
        this.headImage = headImage;
    }
}