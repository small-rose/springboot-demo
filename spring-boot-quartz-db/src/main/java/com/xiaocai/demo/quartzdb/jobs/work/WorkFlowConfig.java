package com.xiaocai.demo.quartzdb.jobs.work;

import com.xiaocai.demo.quartzdb.listeners.FirstJobListener;
import com.xiaocai.demo.quartzdb.listeners.MySchedulerListener;
import com.xiaocai.demo.quartzdb.listeners.WorkFlowListener;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.quartz.impl.matchers.KeyMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ WorkFlowConfig ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/19 16:30
 * @Version ： 1.0
 **/
@Configuration
@Slf4j
public class WorkFlowConfig {
    @Autowired
    FirstJobListener firstJobListener ;



    //@Bean
    public JobDetail firstJob01() {
        JobBuilder jobBuilder = JobBuilder.newJob(FirstJob.class)
                //.withIdentity("firstJob") // 名字为 firstJob
                .withIdentity(JobKey.jobKey("firstJob", "WorkFlow"))
                .storeDurably();// 没有 Trigger 关联的时候任务是否被保留。因为创建 JobDetail 时，还没 Trigger 指向它，所以需要设置为 true ，表示保留。
        ;//.build();

        // JobData 可以放额外的业务数据
        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("groupName", "WorkFlow");
        jobBuilder = jobBuilder.setJobData(jobDataMap);
        return  jobBuilder.setJobData(jobDataMap).build();
    }

    //@Bean
    public Trigger firstJob01Trigger() {
        // 简单的调度计划的构造器
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/30 * * * * ? *");

        //这个定时会记录在 qrtz_cron_triggers 表，  qrtz_triggers表记录所有的
        // Trigger 构造器
        return TriggerBuilder.newTrigger()
                .forJob(firstJob01()) // 对应 Job 为 demoJob02
                .withIdentity("firstJob01Trigger") // 名字为 firstJob01Trigger
                .withSchedule(scheduleBuilder) // 对应 Schedule 为 scheduleBuilder
                .build();
    }


    // 会向spring容器中新增一个beanName为scheduler的Scheduler, 此时容器中变有了两个Scheduler
    @Bean
    public Scheduler zxcScheduler(Scheduler zxcScheduler) throws Exception {
        // 添加Scheduler 监听器
        zxcScheduler.getListenerManager().addSchedulerListener(new MySchedulerListener());

        // 添加JobListener, 精确匹配JobKey
        //KeyMatcher<JobKey> keyMatcher = KeyMatcher.keyEquals(JobKey.jobKey("helloJob", "group1"));
        //scheduler.getListenerManager().addJobListener(new FirstJobListener(), keyMatcher);

        // 添加TriggerListener, 按组匹配
        //GroupMatcher<TriggerKey> groupMatcher = GroupMatcher.groupEquals("group1");
        //scheduler.getListenerManager().addTriggerListener(new MyTriggerListener(), groupMatcher);

        //触发-监听器 匹配所有的任务触发器
        //zxcScheduler.getListenerManager().addTriggerListener(new MyTriggerListener(), EverythingMatcher.allTriggers());

        Matcher<JobKey> matcher = KeyMatcher.keyEquals(JobKey.jobKey("firstJob", "WorkFlow"));
        // 任务监听器--关联到指定的任务--精确匹配JobKey
        log.info("---- " + firstJobListener);
        zxcScheduler.getListenerManager().addJobListener(firstJobListener, matcher);

        // 任务监听器按组名关联到任务
        Matcher<JobKey> matcherGroup = GroupMatcher.jobGroupEquals("WorkFlow");
        zxcScheduler.getListenerManager().addJobListener(new WorkFlowListener(), matcherGroup);

        // 开始执行第一个任务, 首次执行需放开，持久化到数据库之后，可以注释掉
        //zxcScheduler.scheduleJob(firstJob01() , firstJob01Trigger());
        zxcScheduler.start();
        return zxcScheduler;
    }

}
