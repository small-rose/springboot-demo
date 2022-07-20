package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : d_userpower
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class DUserpower {
    /**
     * 主键
     */
    private Long id;

    /**
     * 平台用户代码
     */
    private String userid;

    /**
     * 交易类型
     */
    private String tradetype;

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
    * 获取-交易类型
    * @return tradetype
     */
    public String getTradetype() {
        return tradetype;
    }

    /**
    * 设置-交易类型
    * @paramType java.lang.String
    * @param tradetype - 交易类型
     */
    public void setTradetype(String tradetype) {
        this.tradetype = tradetype;
    }
}