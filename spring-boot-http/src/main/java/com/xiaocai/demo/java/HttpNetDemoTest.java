package com.xiaocai.demo.java;

import com.xiaocai.demo.http.HttpNetUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ HttpNetDemoTest ] 说明：无
 * @Function :  功能说明：
 *  SchedualedThreadPoolExecutor 接收SchduledFutureTask类型的任务，是线程池调度任务的最小单位，有三种提交任务的方式：
 *
 *      schedule：延迟多长时间之后只执行一次；
 *      scheduledAtFixedRate：延迟指定时间后执行一次，之后按照固定的时长周期执行；
 *      scheduledWithFixedDelay：延迟指定时间后执行一次，之后按照：上一次任务执行时长 + 周期的时长 的时间去周期执行；
 *
 * @Date ：2022/1/13 18:01
 * @Version ： 1.0
 **/
@Slf4j
public class HttpNetDemoTest {



    @Test
    public void http(){
        int threadNumber = 100 ;
        //final CountDownLatch count = new CountDownLatch(threadNumber);//参数为线程个数
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        String url = "https://m.booea.com/news/s_2504950.html";
        String referer = "https://m.booea.com";
        HttpNetUtil http = new HttpNetUtil();
        String resp  = http.httpGet(url, referer, null);
        //log.info(resp);
        Thread task = new Thread(() -> {
            http.httpGet(url, referer, null);
            log.info("----get url --- ");
            //TimeUnit.SECONDS.sleep(2);
            //count.countDown();
        });
        pool.scheduleAtFixedRate(task, 5, 5, TimeUnit.SECONDS);
        /*try {

            //count.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
