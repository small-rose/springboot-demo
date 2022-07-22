package com.xiaocai.demo.event.threads;

import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ ThreadJoinDemo ] 说明：无
 * @Function :  功能说明： (一)使用线程的 join 方法
 * @Date ：2022/7/22 16:03
 * @Version ： 1.0
 **/
public class ThreadJoinDemo {

    @Test
    public  void main() {
        threadTest();
    }





    public void threadTest(){
        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("产品经理规划新需求");
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                    System.out.println("开发人员开发新需求功能");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread2.join();
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
