package com.xiaocai.demo.quartzdb.config;

import org.springframework.context.annotation.Configuration;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  这个类注释是因为只需要启动一次，数据会持久化到数据库，后面就可以注释掉，首次执行需要放开
 * @author: 张小菜
 * @date: 2022/1/19 0:30
 * @version: v1.0
 */
@Configuration
public class QuartzConfiguration {


/*
    public static class DemoJob01Configuration {

        @Bean
        public JobDetail demoJob01() {
            return JobBuilder.newJob(DemoJob01.class)
                    .withIdentity("demoJob01") // 名字为 demoJob01
                    .storeDurably() // 没有 Trigger 关联的时候任务是否被保留。因为创建 JobDetail 时，还没 Trigger 指向它，所以需要设置为 true ，表示保留。
                    .build();
        }

        @Bean
        public Trigger demoJob01Trigger() {
            // 简单的调度计划的构造器
            SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                    .withIntervalInSeconds(5) // 频率。
                    .repeatForever(); // 次数。

            // 这个定时会记录在 qrtz_simple_triggers表 ，  qrtz_triggers表记录所有的
            // Trigger 构造器
            return TriggerBuilder.newTrigger()
                    .forJob(demoJob01()) // 对应 Job 为 demoJob01
                    .withIdentity("demoJob01Trigger") // 名字为 demoJob01Trigger
                    .withSchedule(scheduleBuilder) // 对应 Schedule 为 scheduleBuilder
                    .build();
        }

    }

    public static class DemoJob02Configuration {

        @Bean
        public JobDetail demoJob02() {
            return JobBuilder.newJob(DemoJob02.class)
                    .withIdentity("demoJob02") // 名字为 demoJob02
                    .storeDurably() // 没有 Trigger 关联的时候任务是否被保留。因为创建 JobDetail 时，还没 Trigger 指向它，所以需要设置为 true ，表示保留。
                    .build();
        }

        @Bean
        public Trigger demoJob02Trigger() {
            // 简单的调度计划的构造器
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/10 * * * * ? *");

            //这个定时会记录在 qrtz_cron_triggers 表，  qrtz_triggers表记录所有的
            // Trigger 构造器
            return TriggerBuilder.newTrigger()
                    .forJob(demoJob02()) // 对应 Job 为 demoJob02
                    .withIdentity("demoJob02Trigger") // 名字为 demoJob02Trigger
                    .withSchedule(scheduleBuilder) // 对应 Schedule 为 scheduleBuilder
                    .build();
        }

    }*/
}
