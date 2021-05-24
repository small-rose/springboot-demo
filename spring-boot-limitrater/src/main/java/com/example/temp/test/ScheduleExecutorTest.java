package com.example.temp.test;

import com.example.temp.limit.factory.NamedThreadFactory;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-24 17:17
 **/
public class ScheduleExecutorTest {

    private final static ScheduledThreadPoolExecutor scheduledCheck = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
            new NamedThreadFactory("token-bucket-group", "token-bucket-factory"));
    public static void main(String[] args) {

    }
}
