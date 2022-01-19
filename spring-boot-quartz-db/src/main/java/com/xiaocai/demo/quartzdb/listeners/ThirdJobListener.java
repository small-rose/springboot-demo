package com.xiaocai.demo.quartzdb.listeners;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
import org.springframework.stereotype.Component;

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
public class ThirdJobListener implements JobListener {
    @Override
    public String getName() {
        return "ThirdJobListener";
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext jobExecutionContext) {
        
        log.info("ThirdJobListener says: 作业即将执行.");
    }

    /**
     * 当org.quartz被调度程序调用时。JobDetail即将执行(一个关联的Trigger发生)，但是TriggerListener否决了它的执行。
     * @param jobExecutionContext
     */
    @Override
    public void jobExecutionVetoed(JobExecutionContext jobExecutionContext) {
        
        log.info("ThirdJobListener says: 作业即将禁止执行.");
    }

    @Override
    public void jobWasExecuted(JobExecutionContext jobExecutionContext, JobExecutionException e) {
        
        log.info("ThirdJobListener says: 作业已执行.");
        Class<? extends Job> jobClass = jobExecutionContext.getJobDetail().getJobClass();
        String jobClassName = jobClass.getName();

        log.info( jobClassName + " 执行完毕，可以做一些收尾工作了...");

    }
}
