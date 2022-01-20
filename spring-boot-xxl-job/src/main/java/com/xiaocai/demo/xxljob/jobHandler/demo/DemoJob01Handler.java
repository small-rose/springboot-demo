package com.xiaocai.demo.xxljob.jobHandler.demo;

import com.xiaocai.demo.xxljob.jobHandler.service.DemoService;
import com.xxl.job.core.handler.IJobHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DemoJob01 ] 说明： Bean 模式的任务实现方式1，基于类实现
 * @Function :  功能说明：
 *                       Bean模式任务，支持基于类的开发方式
 * @Date ：2022/1/20 14:29
 * @Version ： 1.0
 **/
@Component
public class DemoJob01Handler extends IJobHandler {

    @Autowired
    private DemoService demoService ;

    @Override
    public void execute() {

        demoService.demoWork01();
    }
}
