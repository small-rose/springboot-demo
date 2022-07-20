package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : mm_batchtask_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmBatchtaskTd {
    /**
     * 主键
     */
    private Long batchtaskid;

    /**
     * JOB类名
     */
    private String jobclassname;

    /**
     * 任务参数
     */
    private String jobargument;

    /**
     * 任务类型
     */
    private String jobtype;

    /**
     * 开始时间
     */
    private Date starttime;

    /**
     * 结束时间
     */
    private Date endtime;

    /**
     * cron表达式
     */
    private String cronexpression;

    /**
     * 任务名
     */
    private String taskname;

    /**
     * 任务描述
     */
    private String taskdescription;

    /**
     * 任务状态
     */
    private String taskstate;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改时间
     */
    private Date updatetime;

    /**
     * 服务器ip
     */
    private String ip;

    /**
     * 服务器端口
     */
    private String port;

    /**
     * 任务参数
     */
    private String jobparameter;

    /**
     * MOD
     */
    private String mod;

    /**
    * 获取-主键
    * @return batchtaskid
     */
    public Long getBatchtaskid() {
        return batchtaskid;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Long
    * @param batchtaskid - 主键
     */
    public void setBatchtaskid(Long batchtaskid) {
        this.batchtaskid = batchtaskid;
    }

    /**
    * 获取-JOB类名
    * @return jobclassname
     */
    public String getJobclassname() {
        return jobclassname;
    }

    /**
    * 设置-JOB类名
    * @paramType java.lang.String
    * @param jobclassname - JOB类名
     */
    public void setJobclassname(String jobclassname) {
        this.jobclassname = jobclassname;
    }

    /**
    * 获取-任务参数
    * @return jobargument
     */
    public String getJobargument() {
        return jobargument;
    }

    /**
    * 设置-任务参数
    * @paramType java.lang.String
    * @param jobargument - 任务参数
     */
    public void setJobargument(String jobargument) {
        this.jobargument = jobargument;
    }

    /**
    * 获取-任务类型
    * @return jobtype
     */
    public String getJobtype() {
        return jobtype;
    }

    /**
    * 设置-任务类型
    * @paramType java.lang.String
    * @param jobtype - 任务类型
     */
    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    /**
    * 获取-开始时间
    * @return starttime
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
    * 设置-开始时间
    * @paramType java.util.Date
    * @param starttime - 开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
    * 获取-结束时间
    * @return endtime
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
    * 设置-结束时间
    * @paramType java.util.Date
    * @param endtime - 结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
    * 获取-cron表达式
    * @return cronexpression
     */
    public String getCronexpression() {
        return cronexpression;
    }

    /**
    * 设置-cron表达式
    * @paramType java.lang.String
    * @param cronexpression - cron表达式
     */
    public void setCronexpression(String cronexpression) {
        this.cronexpression = cronexpression;
    }

    /**
    * 获取-任务名
    * @return taskname
     */
    public String getTaskname() {
        return taskname;
    }

    /**
    * 设置-任务名
    * @paramType java.lang.String
    * @param taskname - 任务名
     */
    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    /**
    * 获取-任务描述
    * @return taskdescription
     */
    public String getTaskdescription() {
        return taskdescription;
    }

    /**
    * 设置-任务描述
    * @paramType java.lang.String
    * @param taskdescription - 任务描述
     */
    public void setTaskdescription(String taskdescription) {
        this.taskdescription = taskdescription;
    }

    /**
    * 获取-任务状态
    * @return taskstate
     */
    public String getTaskstate() {
        return taskstate;
    }

    /**
    * 设置-任务状态
    * @paramType java.lang.String
    * @param taskstate - 任务状态
     */
    public void setTaskstate(String taskstate) {
        this.taskstate = taskstate;
    }

    /**
    * 获取-创建时间
    * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
    * 设置-创建时间
    * @paramType java.util.Date
    * @param createtime - 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
    * 获取-修改时间
    * @return updatetime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
    * 设置-修改时间
    * @paramType java.util.Date
    * @param updatetime - 修改时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
    * 获取-服务器ip
    * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
    * 设置-服务器ip
    * @paramType java.lang.String
    * @param ip - 服务器ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
    * 获取-服务器端口
    * @return port
     */
    public String getPort() {
        return port;
    }

    /**
    * 设置-服务器端口
    * @paramType java.lang.String
    * @param port - 服务器端口
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
    * 获取-任务参数
    * @return jobparameter
     */
    public String getJobparameter() {
        return jobparameter;
    }

    /**
    * 设置-任务参数
    * @paramType java.lang.String
    * @param jobparameter - 任务参数
     */
    public void setJobparameter(String jobparameter) {
        this.jobparameter = jobparameter;
    }

    /**
    * 获取-MOD
    * @return mod
     */
    public String getMod() {
        return mod;
    }

    /**
    * 设置-MOD
    * @paramType java.lang.String
    * @param mod - MOD
     */
    public void setMod(String mod) {
        this.mod = mod;
    }
}