package com.xiaocai.demo.quartzdb.listeners;

import com.xiaocai.demo.quartzdb.jobs.work.SecondJob;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.quartz.impl.matchers.KeyMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ FirstJobListener ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/19 14:41
 * @Version ： 1.0
 **/
@Slf4j
@Component
public class FirstJobListener implements JobListener {

    @Autowired
    private SecondJobListener secondJobListener;

    @Override
    public String getName() {
        return "FirstJobListener";
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext jobExecutionContext) {
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        JobKey jobkey = jobDetail.getKey();
        String name = jobkey.getName();
        String group = jobkey.getGroup();
        JobDataMap jobDataMap =jobDetail.getJobDataMap();
        log.info("FirstJobListener says: group-"+ group +", name-"+name+" 作业即将执行. 自定义数据："+ jobDataMap);
     }

    /**
     * 当org.quartz被调度程序调用时。JobDetail即将执行(一个关联的Trigger发生)，但是TriggerListener否决了它的执行。
     * @param jobExecutionContext
     */
    @Override
    public void jobExecutionVetoed(JobExecutionContext jobExecutionContext) {
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        JobKey jobkey = jobDetail.getKey();
        String name = jobkey.getName();
        String group = jobkey.getGroup();
        JobDataMap jobDataMap =jobDetail.getJobDataMap();
        log.info("FirstJobListener jobExecutionVetoed says: group-"+ group +", name-"+name+" 作业即将禁止执行. 自定义数据："+ jobDataMap);

    }

    @Override
    public void jobWasExecuted(JobExecutionContext jobExecutionContext, JobExecutionException e) {
        log.info("FirstJobListener says: 作业已执行." + secondJobListener );
        // SecondJob  #job2
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        String groupName = (String) jobDataMap.get("groupName");

        // jobDataMap 继续和下一个任务关联
        JobDetail job2 = newJob(SecondJob.class).withIdentity("job2").withIdentity(JobKey.jobKey("secondJob", groupName)).setJobData(jobDataMap).build();
        Trigger job2Trigger = newTrigger().forJob(job2) .withIdentity("job2Trigger").startNow().build();

        try {
            Matcher<JobKey> matcher = KeyMatcher.keyEquals(JobKey.jobKey("secondJob", groupName));
            //去执行job2
            jobExecutionContext.getScheduler().getListenerManager().addJobListener(secondJobListener, matcher);

            jobExecutionContext.getScheduler().scheduleJob(job2, job2Trigger);
        } catch (SchedulerException ex) {
            log.info("Unable to schedule job2!");
            ex.printStackTrace();
        }
    }
}
