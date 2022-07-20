package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : xxl_job_info
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class XxlJobInfo {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 执行器主键ID
     */
    private Integer jobGroup;

    /**
     * 执行器描述
     */
    private String jobDesc;

    /**
     * 增加时间
     */
    private Date addTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 作者
     */
    private String author;

    /**
     * 报警邮件
     */
    private String alarmEmail;

    /**
     * 调度类型
     */
    private String scheduleType;

    /**
     * 调度配置，值含义取决于调度类型
     */
    private String scheduleConf;

    /**
     * 调度过期策略
     */
    private String misfireStrategy;

    /**
     * 执行器路由策略
     */
    private String executorRouteStrategy;

    /**
     * 执行器任务handler
     */
    private String executorHandler;

    /**
     * 执行器任务参数
     */
    private String executorParam;

    /**
     * 阻塞处理策略
     */
    private String executorBlockStrategy;

    /**
     * 任务执行超时时间，单位秒
     */
    private Integer executorTimeout;

    /**
     * 失败重试次数
     */
    private Integer executorFailRetryCount;

    /**
     * GLUE类型
     */
    private String glueType;

    /**
     * GLUE源代码
     */
    private String glueSource;

    /**
     * GLUE备注
     */
    private String glueRemark;

    /**
     * GLUE更新时间
     */
    private Date glueUpdatetime;

    /**
     * 子任务ID，多个逗号分隔
     */
    private String childJobid;

    /**
     * 调度状态：0-停止，1-运行
     */
    private Byte triggerStatus;

    /**
     * 上次调度时间
     */
    private Long triggerLastTime;

    /**
     * 下次调度时间
     */
    private Long triggerNextTime;

    /**
    * 获取-主键
    * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
    * 设置-主键
    * @paramType java.lang.Integer
    * @param id - 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
    * 获取-执行器主键ID
    * @return jobGroup
     */
    public Integer getJobGroup() {
        return jobGroup;
    }

    /**
    * 设置-执行器主键ID
    * @paramType java.lang.Integer
    * @param jobGroup - 执行器主键ID
     */
    public void setJobGroup(Integer jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
    * 获取-执行器描述
    * @return jobDesc
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
    * 设置-执行器描述
    * @paramType java.lang.String
    * @param jobDesc - 执行器描述
     */
    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    /**
    * 获取-增加时间
    * @return addTime
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
    * 设置-增加时间
    * @paramType java.util.Date
    * @param addTime - 增加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
    * 获取-更新时间
    * @return updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
    * 设置-更新时间
    * @paramType java.util.Date
    * @param updateTime - 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
    * 获取-作者
    * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
    * 设置-作者
    * @paramType java.lang.String
    * @param author - 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
    * 获取-报警邮件
    * @return alarmEmail
     */
    public String getAlarmEmail() {
        return alarmEmail;
    }

    /**
    * 设置-报警邮件
    * @paramType java.lang.String
    * @param alarmEmail - 报警邮件
     */
    public void setAlarmEmail(String alarmEmail) {
        this.alarmEmail = alarmEmail;
    }

    /**
    * 获取-调度类型
    * @return scheduleType
     */
    public String getScheduleType() {
        return scheduleType;
    }

    /**
    * 设置-调度类型
    * @paramType java.lang.String
    * @param scheduleType - 调度类型
     */
    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    /**
    * 获取-调度配置，值含义取决于调度类型
    * @return scheduleConf
     */
    public String getScheduleConf() {
        return scheduleConf;
    }

    /**
    * 设置-调度配置，值含义取决于调度类型
    * @paramType java.lang.String
    * @param scheduleConf - 调度配置，值含义取决于调度类型
     */
    public void setScheduleConf(String scheduleConf) {
        this.scheduleConf = scheduleConf;
    }

    /**
    * 获取-调度过期策略
    * @return misfireStrategy
     */
    public String getMisfireStrategy() {
        return misfireStrategy;
    }

    /**
    * 设置-调度过期策略
    * @paramType java.lang.String
    * @param misfireStrategy - 调度过期策略
     */
    public void setMisfireStrategy(String misfireStrategy) {
        this.misfireStrategy = misfireStrategy;
    }

    /**
    * 获取-执行器路由策略
    * @return executorRouteStrategy
     */
    public String getExecutorRouteStrategy() {
        return executorRouteStrategy;
    }

    /**
    * 设置-执行器路由策略
    * @paramType java.lang.String
    * @param executorRouteStrategy - 执行器路由策略
     */
    public void setExecutorRouteStrategy(String executorRouteStrategy) {
        this.executorRouteStrategy = executorRouteStrategy;
    }

    /**
    * 获取-执行器任务handler
    * @return executorHandler
     */
    public String getExecutorHandler() {
        return executorHandler;
    }

    /**
    * 设置-执行器任务handler
    * @paramType java.lang.String
    * @param executorHandler - 执行器任务handler
     */
    public void setExecutorHandler(String executorHandler) {
        this.executorHandler = executorHandler;
    }

    /**
    * 获取-执行器任务参数
    * @return executorParam
     */
    public String getExecutorParam() {
        return executorParam;
    }

    /**
    * 设置-执行器任务参数
    * @paramType java.lang.String
    * @param executorParam - 执行器任务参数
     */
    public void setExecutorParam(String executorParam) {
        this.executorParam = executorParam;
    }

    /**
    * 获取-阻塞处理策略
    * @return executorBlockStrategy
     */
    public String getExecutorBlockStrategy() {
        return executorBlockStrategy;
    }

    /**
    * 设置-阻塞处理策略
    * @paramType java.lang.String
    * @param executorBlockStrategy - 阻塞处理策略
     */
    public void setExecutorBlockStrategy(String executorBlockStrategy) {
        this.executorBlockStrategy = executorBlockStrategy;
    }

    /**
    * 获取-任务执行超时时间，单位秒
    * @return executorTimeout
     */
    public Integer getExecutorTimeout() {
        return executorTimeout;
    }

    /**
    * 设置-任务执行超时时间，单位秒
    * @paramType java.lang.Integer
    * @param executorTimeout - 任务执行超时时间，单位秒
     */
    public void setExecutorTimeout(Integer executorTimeout) {
        this.executorTimeout = executorTimeout;
    }

    /**
    * 获取-失败重试次数
    * @return executorFailRetryCount
     */
    public Integer getExecutorFailRetryCount() {
        return executorFailRetryCount;
    }

    /**
    * 设置-失败重试次数
    * @paramType java.lang.Integer
    * @param executorFailRetryCount - 失败重试次数
     */
    public void setExecutorFailRetryCount(Integer executorFailRetryCount) {
        this.executorFailRetryCount = executorFailRetryCount;
    }

    /**
    * 获取-GLUE类型
    * @return glueType
     */
    public String getGlueType() {
        return glueType;
    }

    /**
    * 设置-GLUE类型
    * @paramType java.lang.String
    * @param glueType - GLUE类型
     */
    public void setGlueType(String glueType) {
        this.glueType = glueType;
    }

    /**
    * 获取-GLUE源代码
    * @return glueSource
     */
    public String getGlueSource() {
        return glueSource;
    }

    /**
    * 设置-GLUE源代码
    * @paramType java.lang.String
    * @param glueSource - GLUE源代码
     */
    public void setGlueSource(String glueSource) {
        this.glueSource = glueSource;
    }

    /**
    * 获取-GLUE备注
    * @return glueRemark
     */
    public String getGlueRemark() {
        return glueRemark;
    }

    /**
    * 设置-GLUE备注
    * @paramType java.lang.String
    * @param glueRemark - GLUE备注
     */
    public void setGlueRemark(String glueRemark) {
        this.glueRemark = glueRemark;
    }

    /**
    * 获取-GLUE更新时间
    * @return glueUpdatetime
     */
    public Date getGlueUpdatetime() {
        return glueUpdatetime;
    }

    /**
    * 设置-GLUE更新时间
    * @paramType java.util.Date
    * @param glueUpdatetime - GLUE更新时间
     */
    public void setGlueUpdatetime(Date glueUpdatetime) {
        this.glueUpdatetime = glueUpdatetime;
    }

    /**
    * 获取-子任务ID，多个逗号分隔
    * @return childJobid
     */
    public String getChildJobid() {
        return childJobid;
    }

    /**
    * 设置-子任务ID，多个逗号分隔
    * @paramType java.lang.String
    * @param childJobid - 子任务ID，多个逗号分隔
     */
    public void setChildJobid(String childJobid) {
        this.childJobid = childJobid;
    }

    /**
    * 获取-调度状态：0-停止，1-运行
    * @return triggerStatus
     */
    public Byte getTriggerStatus() {
        return triggerStatus;
    }

    /**
    * 设置-调度状态：0-停止，1-运行
    * @paramType java.lang.Byte
    * @param triggerStatus - 调度状态：0-停止，1-运行
     */
    public void setTriggerStatus(Byte triggerStatus) {
        this.triggerStatus = triggerStatus;
    }

    /**
    * 获取-上次调度时间
    * @return triggerLastTime
     */
    public Long getTriggerLastTime() {
        return triggerLastTime;
    }

    /**
    * 设置-上次调度时间
    * @paramType java.lang.Long
    * @param triggerLastTime - 上次调度时间
     */
    public void setTriggerLastTime(Long triggerLastTime) {
        this.triggerLastTime = triggerLastTime;
    }

    /**
    * 获取-下次调度时间
    * @return triggerNextTime
     */
    public Long getTriggerNextTime() {
        return triggerNextTime;
    }

    /**
    * 设置-下次调度时间
    * @paramType java.lang.Long
    * @param triggerNextTime - 下次调度时间
     */
    public void setTriggerNextTime(Long triggerNextTime) {
        this.triggerNextTime = triggerNextTime;
    }
}