package com.xiaocai.demo.quartzdb.listeners;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.stereotype.Component;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MySchedulerListener ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/19 16:29
 * @Version ： 1.0
 **/

@Slf4j
@Component
public class MySchedulerListener implements SchedulerListener {
    @Override
    public void jobScheduled(Trigger trigger) {
        //用于部署JobDetail时调用
    }

    @Override
    public void jobUnscheduled(TriggerKey triggerKey) {
        //用于卸载JobDetail时调用
    }

    @Override
    public void triggerFinalized(Trigger trigger) {
        //当一个 Trigger 来到了再也不会触发的状态时调用这个方法。除非这个 Job 已设置成了持久性，否则它就会从 Scheduler 中移除。
    }

    @Override
    public void triggerPaused(TriggerKey triggerKey) {
        //Scheduler 调用这个方法是发生在一个 Trigger 或 Trigger 组被暂停时。假如是 Trigger 组的话，triggerName 参数将为 null。
    }

    @Override
    public void triggersPaused(String s) {
        //Scheduler 调用这个方法是发生在一个 Trigger 或 Trigger 组被暂停时。假如是 Trigger 组的话，triggerName 参数将为 null。
    }

    @Override
    public void triggerResumed(TriggerKey triggerKey) {
        //Scheduler 调用这个方法是发生成一个 Trigger 从暂停中恢复时。假如是 Trigger 组的话，假如是 Trigger 组的话，triggerName 参数将为 null。参数将为 null。

    }

    @Override
    public void triggersResumed(String s) {
        //Scheduler 调用这个方法是发生成一个 Trigger 或 Trigger 组从暂停中恢复时。假如是 Trigger 组的话，假如是 Trigger 组的话，triggerName 参数将为 null。参数将为 null。

    }

    @Override
    public void jobAdded(JobDetail jobDetail) {
        // 添加job
    }

    @Override
    public void jobDeleted(JobKey jobKey) {
        // 删除一个 job 时调用
    }

    @Override
    public void jobPaused(JobKey jobKey) {
        //当一个 JobDetail 暂停时调用这个方法。
    }

    @Override
    public void jobsPaused(String s) {
        //当一个或一组 JobDetail 暂停时调用这个方法。
    }

    @Override
    public void jobResumed(JobKey jobKey) {
            //当一个JobDetail 恢复时调用这个方法。
    }

    @Override
    public void jobsResumed(String s) {
        //当一组 JobDetail 暂停时调用这个方法。
    }

    @Override
    public void schedulerError(String s, SchedulerException e) {
        //在 Scheduler 的正常运行期间产生一个严重错误时调用这个方法。
    }

    @Override
    public void schedulerInStandbyMode() {
        //当Scheduler处于StandBy模式时，调用该方法

    }

    @Override
    public void schedulerStarted() {
        //当Scheduler 开启时，调用该方法
        log.info("Scheduler started ...");
    }

    @Override
    public void schedulerStarting() {
        //当Scheduler 启动过程中调用
        log.info("Scheduler starting ...");
    }

    @Override
    public void schedulerShutdown() {

    }

    @Override
    public void schedulerShuttingdown() {
        //当Scheduler停止时，调用该方法
        log.info("Shutting down scheduler");
    }

    @Override
    public void schedulingDataCleared() {
        //当Scheduler中的数据被清除时，调用该方法。
    }
}
