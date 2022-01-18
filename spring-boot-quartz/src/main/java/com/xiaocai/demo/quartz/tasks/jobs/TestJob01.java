package com.xiaocai.demo.quartz.tasks.jobs;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TestJob01 ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/18 20:32
 * @Version ： 1.0
 **/
@Component("testJob01")
@Transactional
public class TestJob01 {


    public void execute() {
        System.out.println("-------------------TestJob01任务执行开始-------------------");
        System.out.println("这是Job02 的 outTime 方法 在执行呢 ... ");
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("-------------------TestJob01任务执行结束-------------------");
    }
}
