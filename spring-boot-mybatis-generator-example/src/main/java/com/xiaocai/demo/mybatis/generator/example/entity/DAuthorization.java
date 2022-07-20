package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : d_authorization
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class DAuthorization {
    /**
     * 平台用户代码
     */
    private Long userid;

    /**
     * 回写时对应的用户名
     */
    private String authorizationname;

    /**
     * 回写时对应的密码
     */
    private String authorizationpwd;

    /**
     * 备注
     */
    private String note;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
    * 获取-平台用户代码
    * @return userid
     */
    public Long getUserid() {
        return userid;
    }

    /**
    * 设置-平台用户代码
    * @paramType java.lang.Long
    * @param userid - 平台用户代码
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
    * 获取-回写时对应的用户名
    * @return authorizationname
     */
    public String getAuthorizationname() {
        return authorizationname;
    }

    /**
    * 设置-回写时对应的用户名
    * @paramType java.lang.String
    * @param authorizationname - 回写时对应的用户名
     */
    public void setAuthorizationname(String authorizationname) {
        this.authorizationname = authorizationname;
    }

    /**
    * 获取-回写时对应的密码
    * @return authorizationpwd
     */
    public String getAuthorizationpwd() {
        return authorizationpwd;
    }

    /**
    * 设置-回写时对应的密码
    * @paramType java.lang.String
    * @param authorizationpwd - 回写时对应的密码
     */
    public void setAuthorizationpwd(String authorizationpwd) {
        this.authorizationpwd = authorizationpwd;
    }

    /**
    * 获取-备注
    * @return note
     */
    public String getNote() {
        return note;
    }

    /**
    * 设置-备注
    * @paramType java.lang.String
    * @param note - 备注
     */
    public void setNote(String note) {
        this.note = note;
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
}