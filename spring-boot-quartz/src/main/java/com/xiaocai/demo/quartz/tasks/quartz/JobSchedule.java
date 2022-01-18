package com.xiaocai.demo.quartz.tasks.quartz;

import com.xiaocai.demo.quartz.tasks.service.QuartzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ JobSchedule ] 说明：无
 * @Function :  功能说明： 工程启动之后首次加载任务
 * @Date ：2022/1/18 18:01
 * @Version ： 1.0
 **/
@Component
public class JobSchedule  implements CommandLineRunner {

    @Autowired
    private QuartzService taskService;

    /**
     * 任务调度开始
     * @param strings
     * @throws Exception
     */
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("任务调度开始==============任务调度开始");
        taskService.timingTask();
        System.out.println("任务调度结束==============任务调度结束");
    }
}
