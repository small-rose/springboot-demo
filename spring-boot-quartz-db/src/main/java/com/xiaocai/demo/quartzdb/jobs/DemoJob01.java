package com.xiaocai.demo.quartzdb.jobs;

import com.xiaocai.demo.quartzdb.apps.service.DemoJobService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DemoJob01 ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/19 11:20
 * @Version ： 1.0
 **/
@Slf4j
@DisallowConcurrentExecution //禁止并发执行
public class DemoJob01 extends QuartzJobBean {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DemoJobService demoService;

    @Override
    protected void executeInternal(JobExecutionContext context) {
        logger.info("[DemoJob01][开始执行了...]");
        demoService.doWork01();
    }
}
