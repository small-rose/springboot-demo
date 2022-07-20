package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_bjapplyfee_errlog
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBjapplyfeeErrlog {
    /**
     * 归属人
     */
    private Long owner;

    /**
     * 关键信息
     */
    private String keyword;

    /**
     * 错误日志
     */
    private String errlog;

    /**
     * 最后操作时间
     */
    private Date lastopdate;

    /**
    * 获取-归属人
    * @return owner
     */
    public Long getOwner() {
        return owner;
    }

    /**
    * 设置-归属人
    * @paramType java.lang.Long
    * @param owner - 归属人
     */
    public void setOwner(Long owner) {
        this.owner = owner;
    }

    /**
    * 获取-关键信息
    * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
    * 设置-关键信息
    * @paramType java.lang.String
    * @param keyword - 关键信息
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
    * 获取-错误日志
    * @return errlog
     */
    public String getErrlog() {
        return errlog;
    }

    /**
    * 设置-错误日志
    * @paramType java.lang.String
    * @param errlog - 错误日志
     */
    public void setErrlog(String errlog) {
        this.errlog = errlog;
    }

    /**
    * 获取-最后操作时间
    * @return lastopdate
     */
    public Date getLastopdate() {
        return lastopdate;
    }

    /**
    * 设置-最后操作时间
    * @paramType java.util.Date
    * @param lastopdate - 最后操作时间
     */
    public void setLastopdate(Date lastopdate) {
        this.lastopdate = lastopdate;
    }
}