package com.xiaocai.demo.quartz.tasks.controller;

import com.xiaocai.demo.quartz.tasks.model.BuzBatchTask;
import com.xiaocai.demo.quartz.tasks.service.ScheduleJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ JobTaskController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/18 17:13
 * @Version ： 1.0
 **/
@RestController
@RequestMapping("/job")
public class JobTaskController {

    @Autowired
    private ScheduleJobService jobService;

    @GetMapping(value = "/hello")
    public String helloSpringBoot() {
        return "Hello quartz!";
    }

    @GetMapping("/add")
    public String add() {
        BuzBatchTask job = new BuzBatchTask();
        job.setJobName("任务02");
        job.setCronExpression("0/2 * * * * ?");
        job.setBeanName("testJob02");
        job.setMethodName("execute");
        jobService.add(job);
        return "新增定时任务成功";
    }

    @GetMapping("/start/{id}")
    public String start(@PathVariable("id") Integer id) {
        jobService.start(id);
        return "启动定时任务成功";
    }

    @GetMapping("/pause/{id}")
    public String pause(@PathVariable("id") Integer id) {
        jobService.pause(id);
        return "暂停定时任务成功";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        jobService.delete(id);
        return "删除定时任务成功";
    }

    @GetMapping("/startAllJob")
    public String startAllJob() {
        jobService.startAllJob();
        return "启动所有定时任务成功";
    }

    @GetMapping("/pauseAllJob")
    public String pauseAllJob() {
        jobService.pauseAllJob();
        return "暂停所有定时任务成功";
    }
}
