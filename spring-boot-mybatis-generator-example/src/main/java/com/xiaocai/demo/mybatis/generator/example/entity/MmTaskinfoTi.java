package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_taskinfo_ti
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmTaskinfoTi {
    /**
     * 主键
     */
    private Long taskid;

    /**
     * 系统来源
     */
    private String datasource;

    /**
     * 任务类型
     */
    private String tasktype;

    /**
     * 文件名称
     */
    private String filename;

    /**
     * 操作日期
     */
    private Date opdate;

    /**
     * MD5码
     */
    private String md5;

    /**
     * 状态
     */
    private String status;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 最后更新时间
     */
    private Date lastupdate;

    /**
     * 版本
     */
    private Integer hibernateversion;

    /**
    * 获取-主键
    * @return taskid
     */
    public Long getTaskid() {
        return taskid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param taskid - 主键
     */
    public void setTaskid(Long taskid) {
        this.taskid = taskid;
    }

    /**
    * 获取-系统来源
    * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
    * 设置-系统来源
    * @paramType java.lang.String
    * @param datasource - 系统来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
    * 获取-任务类型
    * @return tasktype
     */
    public String getTasktype() {
        return tasktype;
    }

    /**
    * 设置-任务类型
    * @paramType java.lang.String
    * @param tasktype - 任务类型
     */
    public void setTasktype(String tasktype) {
        this.tasktype = tasktype;
    }

    /**
    * 获取-文件名称
    * @return filename
     */
    public String getFilename() {
        return filename;
    }

    /**
    * 设置-文件名称
    * @paramType java.lang.String
    * @param filename - 文件名称
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
    * 获取-操作日期
    * @return opdate
     */
    public Date getOpdate() {
        return opdate;
    }

    /**
    * 设置-操作日期
    * @paramType java.util.Date
    * @param opdate - 操作日期
     */
    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    /**
    * 获取-MD5码
    * @return md5
     */
    public String getMd5() {
        return md5;
    }

    /**
    * 设置-MD5码
    * @paramType java.lang.String
    * @param md5 - MD5码
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
    * 获取-状态
    * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
    * 设置-状态
    * @paramType java.lang.String
    * @param status - 状态
     */
    public void setStatus(String status) {
        this.status = status;
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
    * 获取-最后更新时间
    * @return lastupdate
     */
    public Date getLastupdate() {
        return lastupdate;
    }

    /**
    * 设置-最后更新时间
    * @paramType java.util.Date
    * @param lastupdate - 最后更新时间
     */
    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    /**
    * 获取-版本
    * @return hibernateversion
     */
    public Integer getHibernateversion() {
        return hibernateversion;
    }

    /**
    * 设置-版本
    * @paramType java.lang.Integer
    * @param hibernateversion - 版本
     */
    public void setHibernateversion(Integer hibernateversion) {
        this.hibernateversion = hibernateversion;
    }
}