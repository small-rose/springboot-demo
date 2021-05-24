package com.example.temp.test;

import lombok.Data;
import lombok.SneakyThrows;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/21 22:52
 * @version: v1.0
 */
@Data
public class AtomicTest {

    private AtomicLong token = new AtomicLong(200);

    private static void test01() throws InterruptedException {
        AtomicTest atomicTest = new AtomicTest();

        Thread thread1 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    long tok = atomicTest.getToken().decrementAndGet();
                    System.out.println(Thread.currentThread().getName() +" after dec "+tok);
                    //TimeUnit.MILLISECONDS.sleep(1000);
                }
            }
        });

        AtomicTest atomicTest2 = new AtomicTest();
        atomicTest2.setToken(new AtomicLong(1000));
        Thread thread2 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    long tok = atomicTest.getToken().decrementAndGet();
                    System.out.println(Thread.currentThread().getName() +" after dec "+tok);
                    //TimeUnit.MILLISECONDS.sleep(1000);

                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(atomicTest.getToken().get());
        System.out.println(atomicTest2.getToken().get());
    }
    public static void main(String[] args) throws Exception {
        //test01();
        AtomicLong atomicLong = new AtomicLong();

    }
}
