package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : d_user_bank
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class DUserBank {
    /**
     * 主键
     */
    private Long id;

    /**
     * 平台用户代码
     */
    private String userid;

    /**
     * 银行用户代码
     */
    private String bankid;

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
    * 获取-平台用户代码
    * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
    * 设置-平台用户代码
    * @paramType java.lang.String
    * @param userid - 平台用户代码
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
    * 获取-银行用户代码
    * @return bankid
     */
    public String getBankid() {
        return bankid;
    }

    /**
    * 设置-银行用户代码
    * @paramType java.lang.String
    * @param bankid - 银行用户代码
     */
    public void setBankid(String bankid) {
        this.bankid = bankid;
    }
}