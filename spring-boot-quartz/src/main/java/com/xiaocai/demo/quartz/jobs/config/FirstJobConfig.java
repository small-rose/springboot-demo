package com.xiaocai.demo.quartz.jobs.config;

import com.xiaocai.demo.quartz.jobs.FirstJob;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ JobConfig ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/19 10:05
 * @Version ： 1.0
 **/
@Configuration
public class FirstJobConfig {

    private static final String ID = "SMALL_ROSE_FIRST_JOB_";
    @Autowired
    private Scheduler scheduler;


    @Bean
    public JobDetail jobDetailFirstJob() {
        return JobBuilder.newJob(FirstJob.class)
                .withIdentity(ID + "demo01")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger trigger1() {
        // 简单的调度计划的构造器 SimpleScheduleBuilder 自动配置
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(5) // 频率
                .repeatForever(); // 次数
         return TriggerBuilder.newTrigger()
                .forJob(jobDetailFirstJob())
                .withIdentity(ID + "demo01Trigger")
                .withSchedule(scheduleBuilder)
                .build();
    }

   /* @Bean
    public void schedulerFirstJob() throws SchedulerException {
        scheduler.scheduleJob(jobDetailFirstJob(), trigger1());
    }
*/
}
