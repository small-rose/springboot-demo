package com.xiaocai.demo.quartzdb.config.bean;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * 参考 https://zhuanlan.zhihu.com/p/146060950
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ QuartzConfig ] 说明：无
 * @Function :  功能说明：
 *             解决quartz的bean不能注入（2）创建一个配置类，将自定义的 JobFactory 设置到 Schedule
 * @Date ：2022/1/19 17:46
 * @Version ： 1.0
 **/
public class QuartzConfig {

    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;
    @Autowired
    private CustomJobFactory customJobFactory;

    @Bean
    public Scheduler scheduler(){
        // 想使用默认的
        Scheduler scheduler = schedulerFactoryBean.getScheduler();
        //SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        //Scheduler scheduler = schedulerFactory.getScheduler();
        // 自定义 JobFactory 使得在 Quartz Job 中可以使用 @Autowired
        try {
            scheduler.setJobFactory(customJobFactory);
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

        return scheduler;
    }
}
