package com.xiaocai.demo.quartz.jobs;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SecondJob ] 说明：定时任务的实现方式2 实现 Job 接口
 * @Function :  功能说明： 演示demo
 * @Date ：2022/1/19 9:54
 * @Version ： 1.0
 **/
@Slf4j
public class SecondJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String now = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        log.info("SecondJob 打印当前的时间: " + now);
    }
}
