package com.xiaocai.demo.event.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ ThreadPoolDemo ] 说明：无
 * @Function :  功能说明：  （四）使用线程的线程池方法
 *
 *                  JAVA通过Executors提供了四种线程池：
 *                      单线程化线程池(newSingleThreadExecutor);
 *                      可控最大并发数线程池(newFixedThreadPool);
 *                      可回收缓存线程池(newCachedThreadPool);
 *                      支持定时与周期性任务的线程池(newScheduledThreadPool)。
 * @Date ：2022/7/22 16:18
 * @Version ： 1.0
 **/
public class ThreadPoolDemo {
    /**
     * 单线程化线程池(newSingleThreadExecutor):优点，串行执行所有任务。
     */
    static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws Exception {

        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("产品经理规划新需求");
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开发人员开发新需求功能");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("测试人员测试新功能");
            }
        });

        System.out.println("早上：");
        System.out.println("产品经理来上班了");
        System.out.println("测试人员来上班了");
        System.out.println("开发人员来上班了");
        System.out.println("领导吩咐:");
        System.out.println("首先，产品经理规划新需求...");
        executorService.submit(thread1);
        System.out.println("然后，开发人员开发新需求功能...");
        executorService.submit(thread2);
        System.out.println("最后，测试人员测试新功能...");
        executorService.submit(thread3);
        executorService.shutdown();
    }
}
