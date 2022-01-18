package com.xiaocai.demo.quartz.tasks.service.impl;

import com.xiaocai.demo.quartz.tasks.emun.JobOperateEnum;
import com.xiaocai.demo.quartz.tasks.model.BuzBatchTask;
import com.xiaocai.demo.quartz.tasks.quartz.QuartzFactory;
import com.xiaocai.demo.quartz.tasks.service.BatchTaskService;
import com.xiaocai.demo.quartz.tasks.service.QuartzService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ QuartzServiceImpl ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/18 17:53
 * @Version ： 1.0
 **/
@Slf4j
@Service
@Transactional
public class QuartzServiceImpl implements QuartzService {

    /**
     * 调度器
     */
    @Autowired
    private Scheduler scheduler;

    @Autowired
    private BatchTaskService batchTaskService;

    @Override
    public void timingTask() {

        //查询数据库是否存在需要定时的任务
        List<BuzBatchTask> scheduleJobs = batchTaskService.listAll();
        if (scheduleJobs != null) {
            scheduleJobs.forEach(this::addJob);
        }
    }

    @Override
    public void addJob(BuzBatchTask job) {
        try {
            //创建触发器
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity(job.getJobName())
                    .withSchedule(CronScheduleBuilder.cronSchedule(job.getCronExpression()))
                    .startNow()
                    .build();

            //创建任务
            JobDetail jobDetail = JobBuilder.newJob(QuartzFactory.class)
                    .withIdentity(job.getJobName())
                    .build();

            //传入调度的数据，在QuartzFactory中需要使用
            jobDetail.getJobDataMap().put("scheduleJob", job);

            //调度作业
            scheduler.scheduleJob(jobDetail, trigger);

        } catch (Exception e) {
            log.error("出错了", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void operateJob(JobOperateEnum jobOperateEnum, BuzBatchTask job) throws SchedulerException {
        JobKey jobKey = new JobKey(job.getJobName());
        JobDetail jobDetail = scheduler.getJobDetail(jobKey);
        if (jobDetail == null) {
            //抛异常
        }
        switch (jobOperateEnum) {
            case START:
                scheduler.resumeJob(jobKey);
                break;
            case PAUSE:
                scheduler.pauseJob(jobKey);
                break;
            case DELETE:
                scheduler.deleteJob(jobKey);
                break;
        }
    }

    @Override
    public void startAllJob() throws SchedulerException {
        scheduler.start();
    }

    @Override
    public void pauseAllJob() throws SchedulerException {
        scheduler.standby();
    }

}
