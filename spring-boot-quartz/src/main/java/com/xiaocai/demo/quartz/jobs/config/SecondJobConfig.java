package com.xiaocai.demo.quartz.jobs.config;

import com.xiaocai.demo.quartz.jobs.SecondJob;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SecondJobConfig ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/19 10:08
 * @Version ： 1.0
 **/
@Component
public class SecondJobConfig implements ApplicationRunner {

    private static final String ID = "SMALL_ROSE_SECOND_JOB_";

    @Autowired
    private Scheduler scheduler;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        JobDetail jobDetail = JobBuilder.newJob(SecondJob.class)
                .withIdentity(ID + "demo02")
                .storeDurably()
                .build();
        // 使用调度表达式
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/3 * * * * ? *");
        // 创建任务触发器
        Trigger trigger = TriggerBuilder.newTrigger()
                .forJob(jobDetail)
                .withIdentity(ID + "demo02Trigger")
                .withSchedule(scheduleBuilder)
                .startNow() //立即執行一次任務
                .build();
        // 手动将触发器与任务绑定到调度器内
        //scheduler.scheduleJob(jobDetail, trigger);
    }
}
