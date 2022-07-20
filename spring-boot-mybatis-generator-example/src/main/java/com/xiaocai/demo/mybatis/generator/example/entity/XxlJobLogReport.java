package com.xiaocai.demo.mybatis.generator.example.entity;

import java.util.Date;

/**
 *  
 * @Table : xxl_job_log_report
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class XxlJobLogReport {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 调度-时间
     */
    private Date triggerDay;

    /**
     * 运行中-日志数量
     */
    private Integer runningCount;

    /**
     * 执行成功-日志数量
     */
    private Integer sucCount;

    /**
     * 执行失败-日志数量
     */
    private Integer failCount;

    /**
     * 更新时间
     */
    private Date updateTime;

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
    * 获取-调度-时间
    * @return triggerDay
     */
    public Date getTriggerDay() {
        return triggerDay;
    }

    /**
    * 设置-调度-时间
    * @paramType java.util.Date
    * @param triggerDay - 调度-时间
     */
    public void setTriggerDay(Date triggerDay) {
        this.triggerDay = triggerDay;
    }

    /**
    * 获取-运行中-日志数量
    * @return runningCount
     */
    public Integer getRunningCount() {
        return runningCount;
    }

    /**
    * 设置-运行中-日志数量
    * @paramType java.lang.Integer
    * @param runningCount - 运行中-日志数量
     */
    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    /**
    * 获取-执行成功-日志数量
    * @return sucCount
     */
    public Integer getSucCount() {
        return sucCount;
    }

    /**
    * 设置-执行成功-日志数量
    * @paramType java.lang.Integer
    * @param sucCount - 执行成功-日志数量
     */
    public void setSucCount(Integer sucCount) {
        this.sucCount = sucCount;
    }

    /**
    * 获取-执行失败-日志数量
    * @return failCount
     */
    public Integer getFailCount() {
        return failCount;
    }

    /**
    * 设置-执行失败-日志数量
    * @paramType java.lang.Integer
    * @param failCount - 执行失败-日志数量
     */
    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
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
}