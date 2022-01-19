package com.xiaocai.demo.quartz.jobs;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ FirstJob ] 说明：定时任务的实现方式1 继承 QuartzJobBean 类
 * @Function :  功能说明： 演示demo
 * @Date ：2022/1/19 9:52
 * @Version ： 1.0
 **/
@Slf4j
public class FirstJob  extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) {
        String now = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        log.info("FirstJob 打印当前的时间: " + now);
    }
}
