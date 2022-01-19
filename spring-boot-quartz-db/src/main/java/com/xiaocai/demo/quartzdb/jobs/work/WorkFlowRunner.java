package com.xiaocai.demo.quartzdb.jobs.work;

import com.xiaocai.demo.quartzdb.listeners.FirstJobListener;
import com.xiaocai.demo.quartzdb.listeners.MySchedulerListener;
import com.xiaocai.demo.quartzdb.listeners.MyTriggerListener;
import com.xiaocai.demo.quartzdb.listeners.WorkFlowListener;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.quartz.impl.matchers.EverythingMatcher;
import org.quartz.impl.matchers.GroupMatcher;
import org.quartz.impl.matchers.KeyMatcher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ WorkFlowConfig ] 说明：无
 * @Function :  功能说明：
 * import static org.quartz.JobKey.*;
 * import static org.quartz.impl.matchers.KeyMatcher.*;
 * import static org.quartz.impl.matchers.GroupMatcher.*;
 * import static org.quartz.impl.matchers.AndMatcher.*;
 * import static org.quartz.impl.matchers.OrMatcher.*;
 * import static org.quartz.impl.matchers.EverythingMatcher.*;
 *
 * @Date ：2022/1/19 14:59
 * @Version ： 1.0
 **/
@Slf4j
//@Component
public class WorkFlowRunner implements CommandLineRunner {

    //@Autowired
    SchedulerFactoryBean SchedulerFactoryBean ;

    //@Bean
    public static JobDetail firstJob01() {
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
    public static Trigger firstJob01Trigger() {
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

    @Override
    public void run(String... args) throws Exception {
        Scheduler zxcScheduler = SchedulerFactoryBean.getScheduler();
        // 调度监听器
        zxcScheduler.getListenerManager().addSchedulerListener(new MySchedulerListener());

        //触发-监听器 匹配所有的任务触发器
        zxcScheduler.getListenerManager().addTriggerListener(new MyTriggerListener(), EverythingMatcher.allTriggers());

        Matcher<JobKey> matcher = KeyMatcher.keyEquals(JobKey.jobKey("firstJob", "WorkFlow"));
        // 任务监听器--关联到指定的任务
        zxcScheduler.getListenerManager().addJobListener(new FirstJobListener(), matcher);

        // 任务监听器按组名关联到任务
        Matcher<JobKey> matcherGroup = GroupMatcher.jobGroupEquals("WorkFlow");
        zxcScheduler.getListenerManager().addJobListener(new WorkFlowListener(), matcherGroup);

        // 开始执行第一个任务
        zxcScheduler.scheduleJob(firstJob01() ,firstJob01Trigger());
        log.info("第一个任务被调度了");
     }
}
