package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : xxl_job_log
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class XxlJobLog {
    /**
     * 主键
     */
    private Long id;

    /**
     * 执行器主键ID
     */
    private Integer jobGroup;

    /**
     * 任务，主键ID
     */
    private Integer jobId;

    /**
     * 执行器地址，本次执行的地址
     */
    private String executorAddress;

    /**
     * 执行器任务handler
     */
    private String executorHandler;

    /**
     * 执行器任务参数
     */
    private String executorParam;

    /**
     * 执行器任务分片参数，格式如 1/2
     */
    private String executorShardingParam;

    /**
     * 失败重试次数
     */
    private Integer executorFailRetryCount;

    /**
     * 调度-时间
     */
    private Date triggerTime;

    /**
     * 调度-结果
     */
    private Integer triggerCode;

    /**
     * 调度-日志
     */
    private String triggerMsg;

    /**
     * 执行-时间
     */
    private Date handleTime;

    /**
     * 执行-状态
     */
    private Integer handleCode;

    /**
     * 执行-日志
     */
    private String handleMsg;

    /**
     * 告警状态：0-默认、1-无需告警、2-告警成功、3-告警失败
     */
    private Byte alarmStatus;

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
    * 获取-任务，主键ID
    * @return jobId
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
    * 设置-任务，主键ID
    * @paramType java.lang.Integer
    * @param jobId - 任务，主键ID
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
    * 获取-执行器地址，本次执行的地址
    * @return executorAddress
     */
    public String getExecutorAddress() {
        return executorAddress;
    }

    /**
    * 设置-执行器地址，本次执行的地址
    * @paramType java.lang.String
    * @param executorAddress - 执行器地址，本次执行的地址
     */
    public void setExecutorAddress(String executorAddress) {
        this.executorAddress = executorAddress;
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
    * 获取-执行器任务分片参数，格式如 1/2
    * @return executorShardingParam
     */
    public String getExecutorShardingParam() {
        return executorShardingParam;
    }

    /**
    * 设置-执行器任务分片参数，格式如 1/2
    * @paramType java.lang.String
    * @param executorShardingParam - 执行器任务分片参数，格式如 1/2
     */
    public void setExecutorShardingParam(String executorShardingParam) {
        this.executorShardingParam = executorShardingParam;
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
    * 获取-调度-时间
    * @return triggerTime
     */
    public Date getTriggerTime() {
        return triggerTime;
    }

    /**
    * 设置-调度-时间
    * @paramType java.util.Date
    * @param triggerTime - 调度-时间
     */
    public void setTriggerTime(Date triggerTime) {
        this.triggerTime = triggerTime;
    }

    /**
    * 获取-调度-结果
    * @return triggerCode
     */
    public Integer getTriggerCode() {
        return triggerCode;
    }

    /**
    * 设置-调度-结果
    * @paramType java.lang.Integer
    * @param triggerCode - 调度-结果
     */
    public void setTriggerCode(Integer triggerCode) {
        this.triggerCode = triggerCode;
    }

    /**
    * 获取-调度-日志
    * @return triggerMsg
     */
    public String getTriggerMsg() {
        return triggerMsg;
    }

    /**
    * 设置-调度-日志
    * @paramType java.lang.String
    * @param triggerMsg - 调度-日志
     */
    public void setTriggerMsg(String triggerMsg) {
        this.triggerMsg = triggerMsg;
    }

    /**
    * 获取-执行-时间
    * @return handleTime
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
    * 设置-执行-时间
    * @paramType java.util.Date
    * @param handleTime - 执行-时间
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
    * 获取-执行-状态
    * @return handleCode
     */
    public Integer getHandleCode() {
        return handleCode;
    }

    /**
    * 设置-执行-状态
    * @paramType java.lang.Integer
    * @param handleCode - 执行-状态
     */
    public void setHandleCode(Integer handleCode) {
        this.handleCode = handleCode;
    }

    /**
    * 获取-执行-日志
    * @return handleMsg
     */
    public String getHandleMsg() {
        return handleMsg;
    }

    /**
    * 设置-执行-日志
    * @paramType java.lang.String
    * @param handleMsg - 执行-日志
     */
    public void setHandleMsg(String handleMsg) {
        this.handleMsg = handleMsg;
    }

    /**
    * 获取-告警状态：0-默认、1-无需告警、2-告警成功、3-告警失败
    * @return alarmStatus
     */
    public Byte getAlarmStatus() {
        return alarmStatus;
    }

    /**
    * 设置-告警状态：0-默认、1-无需告警、2-告警成功、3-告警失败
    * @paramType java.lang.Byte
    * @param alarmStatus - 告警状态：0-默认、1-无需告警、2-告警成功、3-告警失败
     */
    public void setAlarmStatus(Byte alarmStatus) {
        this.alarmStatus = alarmStatus;
    }
}