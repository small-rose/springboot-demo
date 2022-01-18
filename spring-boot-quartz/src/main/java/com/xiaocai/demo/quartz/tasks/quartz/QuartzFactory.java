package com.xiaocai.demo.quartz.tasks.quartz;

import com.xiaocai.demo.quartz.config.ApplicationContextBean;
import com.xiaocai.demo.quartz.tasks.model.BuzBatchTask;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.lang.reflect.Method;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ QuartzFactory ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/18 17:47
 * @Version ： 1.0
 **/
@Slf4j
public class QuartzFactory  implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        //获取调度数据
        BuzBatchTask scheduleJob = (BuzBatchTask) jobExecutionContext.getMergedJobDataMap().get("scheduleJob");

        //获取对应的Bean
        Object object = ApplicationContextBean.getBean(scheduleJob.getBeanName());
        try {
            //利用反射执行对应方法
            Method method = object.getClass().getMethod(scheduleJob.getMethodName());
            method.invoke(object);
            log.info("----gogogo----");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
