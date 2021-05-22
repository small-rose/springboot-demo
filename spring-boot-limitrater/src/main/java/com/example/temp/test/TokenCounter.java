package com.example.temp.test;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/21 22:38
 * @version: v1.0
 */
public class TokenCounter {
    //构造计数对象
    private AtomicLongFieldUpdater<TokenPermit> longFieldUpdater = AtomicLongFieldUpdater.newUpdater(TokenPermit.class,"token");

    public long incrementOne(TokenPermit tokenPermit){
        return this.longFieldUpdater.incrementAndGet(tokenPermit);
    }
    public long decrementOne(TokenPermit tokenPermit){
        return this.longFieldUpdater.decrementAndGet(tokenPermit);
    }

    public static void main(String[] args) throws Exception{
        TokenPermit tokenPermit = new TokenPermit();
        final TokenCounter tokenCounter = new TokenCounter();
        Thread thread1 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("before add : "+tokenPermit.getToken());
                    tokenCounter.incrementOne(tokenPermit);
                    System.out.println("after add : "+tokenPermit.getToken());
                    TimeUnit.MILLISECONDS.sleep(500);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("before decrement : "+tokenPermit.getToken());
                    tokenCounter.decrementOne(tokenPermit);
                    System.out.println("after decrement : "+tokenPermit.getToken());
                    TimeUnit.MILLISECONDS.sleep(500);

                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(tokenPermit.getToken());
    }
}
