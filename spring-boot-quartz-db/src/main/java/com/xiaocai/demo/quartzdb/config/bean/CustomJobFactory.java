package com.xiaocai.demo.quartzdb.config.bean;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.AdaptableJobFactory;

/**
 * 参考 https://zhuanlan.zhihu.com/p/146060950
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CustomJobFactory ] 说明：见 SchedulerFactoryBean 源码
 * @Function :  功能说明：
 *          解决quartz的bean不能注入（1）自定义一个 JobFactory，通过 AutowireCapableBeanFactory 将创建好的 Job 对象交给 Spring 管理
 * @Date ：2022/1/19 17:43
 * @Version ： 1.0
 **/
@Configuration
public class CustomJobFactory extends AdaptableJobFactory {


    @Autowired
    private AutowireCapableBeanFactory autowireCapableBeanFactory;

    /**
     * Create the job instance, populating it with property values taken
     * from the scheduler context, job data map and trigger data map.
     *
     * @param bundle
     */
    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        Object jobInstance = super.createJobInstance(bundle);
        autowireCapableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
    }
}
