package com.xiaocai.demo.quartzdb.listeners;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.stereotype.Component;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ WorkFlowListener ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/19 15:38
 * @Version ： 1.0
 **/
@Slf4j
@Component
public class WorkFlowListener implements JobListener {

    @Override
    public String getName() {
        return "WorkFlowListener";
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext jobExecutionContext) {
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        JobKey jobkey = jobDetail.getKey();
        String name = jobkey.getName();
        String group = jobkey.getGroup();
        JobDataMap jobDataMap =jobDetail.getJobDataMap();
        log.info("WorkFlowListener says: group-"+ group +", name-"+name+" 作业即将执行. 自定义数据："+ jobDataMap);
     }

    @Override
    public void jobExecutionVetoed(JobExecutionContext jobExecutionContext) {
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        JobKey jobkey = jobDetail.getKey();
        String name = jobkey.getName();
        String group = jobkey.getGroup();
        JobDataMap jobDataMap =jobDetail.getJobDataMap();
        log.info("WorkFlowListener says: group-"+ group +", name-"+name+" 作业即将禁止执行. 自定义数据："+ jobDataMap);
    }

    @Override
    public void jobWasExecuted(JobExecutionContext jobExecutionContext, JobExecutionException e) {
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        JobKey jobkey = jobDetail.getKey();
        String name = jobkey.getName();
        String group = jobkey.getGroup();
        JobDataMap jobDataMap =jobDetail.getJobDataMap();
        log.info("WorkFlowListener says: group-"+ group +", name-"+name+" 作业执行完毕. 自定义数据："+ jobDataMap);

        log.info("执行扫尾工作....");
    }
}
