package com.xiaocai.demo.quartz.tasks.jobs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TestJob02 ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/18 20:33
 * @Version ： 1.0
 **/

@Slf4j
@Component("testJob02")
@Transactional
public class TestJob02 {



    public void outTime() {
        System.out.println("-------------------TestJob02任务执行开始-------------------");
        log.info("这是Job02 的 outTime 方法 在执行呢 ... ");
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("-------------------TestJob02任务执行结束-------------------");
    }
}
