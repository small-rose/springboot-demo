package com.xiaocai.demo.xxljob.jobHandler.demo;

import com.xiaocai.demo.xxljob.jobHandler.service.DemoService;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DemoJob01 ] 说明： Bean 模式的任务实现方式1，基于方法和注解的实现
 * @Function :  功能说明：
 *                  Bean模式任务，基于方法的开发方式
 * @Date ：2022/1/20 14:29
 * @Version ： 1.0
 **/

@Slf4j
@Component
public class DemoJob02  {

    @Autowired
    DemoService demoService ;


    @XxlJob("demoJob02")
    public void execute() {
        String param = XxlJobHelper.getJobParam();
        log.info("param == " + param);

        log.info("开始调度 demoJob02 ---");
        demoService.demoWork02();
        log.info("调度结束 demoJob02 ---");

        //-------日志日志返回 begin -----------

        //错误时调用,返回状态码
        XxlJobHelper.handleFail();
        //错误时调用,返回状态码+自定义日志
        XxlJobHelper.handleFail("执行失败的自定义日志.....");

        XxlJobHelper.handleTimeout();
        XxlJobHelper.handleTimeout("执行超时的自定义日志....");

        //成功时调用,返回状态码
        XxlJobHelper.handleSuccess();
        //成功时调用,返回状态码+自定义日志
        XxlJobHelper.handleSuccess("执行成功日志...");

        //-------日志日志返回 begin -----------
    }

}
