package com.xiaocai.demo.event.threads;

import java.util.concurrent.Semaphore;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ ThreadCzSemaphoreDemo ] 说明：无
 * @Function :  功能说明：(八)
 *              Sephmore(信号量):Semaphore是一个计数信号量,从概念上将，Semaphore包含一组许可证,
 *                  如果有需要的话，每个acquire()方法都会阻塞，直到获取一个可用的许可证,每个release()方法都会释放持有许可证的线程，
 *                  并且归还Semaphore一个可用的许可证。然而，实际上并没有真实的许可证对象供线程使用，Semaphore只是对可用的数量进行管理维护。
 *
 *                  acquire():当前线程尝试去阻塞的获取1个许可证,此过程是阻塞的,当前线程获取了1个可用的许可证，则会停止等待，继续执行。
 *
 *                  release():当前线程释放1个可用的许可证。
 *
 *              应用场景:Semaphore可以用来做流量分流，特别是对公共资源有限的场景，比如数据库连接。
 *                          假设有这个的需求，读取几万个文件的数据到数据库中，由于文件读取是IO密集型任务，可以启动几十个线程并发读取，
 *                          但是数据库连接数只有10个，这时就必须控制最多只有10个线程能够拿到数据库连接进行操作。这个时候，就可以使用Semaphore做流量控制。
 * @Date ：2022/7/22 16:48
 * @Version ： 1.0
 **/
public class ThreadCzSemaphoreDemo {

    private static Semaphore semaphore1 = new Semaphore(1);
    private static Semaphore semaphore2 = new Semaphore(1);

    public static void main(String[] args) {
        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("产品经理规划新需求");
                semaphore1.release();
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore1.acquire();
                    System.out.println("开发人员开发新需求功能");
                    semaphore2.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore2.acquire();
                    thread2.join();
                    semaphore2.release();
                    System.out.println("测试人员测试新功能");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("早上：");
        System.out.println("测试人员来上班了...");
        thread3.start();
        System.out.println("产品经理来上班了...");
        thread1.start();
        System.out.println("开发人员来上班了...");
        thread2.start();
    }
}
