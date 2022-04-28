package com.xiaocai.demo.mybatisplus.web.entity;



import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("t_account")
public class Account  {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.ID
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.NAME
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.PASS
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    private String pass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.ADD_DATE
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    private Date addDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.LAST_LOGIN
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    private Date lastLogin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.BALANCE
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    private Long balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.DESCRIPTION
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.HEAD_IMAGE
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    private byte[] headImage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.ID
     *
     * @return the value of t_account.ID
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.ID
     *
     * @param id the value for t_account.ID
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.NAME
     *
     * @return the value of t_account.NAME
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.NAME
     *
     * @param name the value for t_account.NAME
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.PASS
     *
     * @return the value of t_account.PASS
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public String getPass() {
        return pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.PASS
     *
     * @param pass the value for t_account.PASS
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.ADD_DATE
     *
     * @return the value of t_account.ADD_DATE
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.ADD_DATE
     *
     * @param addDate the value for t_account.ADD_DATE
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.LAST_LOGIN
     *
     * @return the value of t_account.LAST_LOGIN
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.LAST_LOGIN
     *
     * @param lastLogin the value for t_account.LAST_LOGIN
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.BALANCE
     *
     * @return the value of t_account.BALANCE
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.BALANCE
     *
     * @param balance the value for t_account.BALANCE
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.DESCRIPTION
     *
     * @return the value of t_account.DESCRIPTION
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.DESCRIPTION
     *
     * @param description the value for t_account.DESCRIPTION
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.HEAD_IMAGE
     *
     * @return the value of t_account.HEAD_IMAGE
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public byte[] getHeadImage() {
        return headImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.HEAD_IMAGE
     *
     * @param headImage the value for t_account.HEAD_IMAGE
     *
     * @mbg.generated Tue Mar 01 14:48:45 CST 2022
     */
    public void setHeadImage(byte[] headImage) {
        this.headImage = headImage;
    }

    public Account(){
    }
    public Account(Long id, String name, String pass, Date addDate, Date lastLogin, Long balance, String description) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.addDate = addDate;
        this.lastLogin = lastLogin;
        this.balance = balance;
        this.description = description;
    }
}