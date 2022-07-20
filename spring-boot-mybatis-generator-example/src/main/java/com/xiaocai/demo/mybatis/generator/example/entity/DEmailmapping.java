package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : d_emailmapping
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class DEmailmapping {
    /**
     * 主键
     */
    private Long id;

    /**
     * 邮件地址
     */
    private String email;

    /**
     * 商户号
     */
    private String bussnissno;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 版本
     */
    private Integer hibernate;

    /**
     * 是否有效
     */
    private String ifvalid;

    /**
     * 邮件类型
     */
    private String bussnissname;

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
    * 获取-邮件地址
    * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
    * 设置-邮件地址
    * @paramType java.lang.String
    * @param email - 邮件地址
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
    * 获取-商户号
    * @return bussnissno
     */
    public String getBussnissno() {
        return bussnissno;
    }

    /**
    * 设置-商户号
    * @paramType java.lang.String
    * @param bussnissno - 商户号
     */
    public void setBussnissno(String bussnissno) {
        this.bussnissno = bussnissno;
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
    * @return hibernate
     */
    public Integer getHibernate() {
        return hibernate;
    }

    /**
    * 设置-版本
    * @paramType java.lang.Integer
    * @param hibernate - 版本
     */
    public void setHibernate(Integer hibernate) {
        this.hibernate = hibernate;
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
    * 获取-邮件类型
    * @return bussnissname
     */
    public String getBussnissname() {
        return bussnissname;
    }

    /**
    * 设置-邮件类型
    * @paramType java.lang.String
    * @param bussnissname - 邮件类型
     */
    public void setBussnissname(String bussnissname) {
        this.bussnissname = bussnissname;
    }
}