package com.example.temp.limit.factory;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-24 13:21
 **/
public class NamedThreadFactory  implements ThreadFactory {

    private final AtomicInteger poolNumber = new AtomicInteger(1);
    private final ThreadGroup group;
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String namePrefix;
    private final String factoryName;

    public NamedThreadFactory(String group,String factoryName) {
        this.group = new ThreadGroup(group);
        this.factoryName = factoryName;
        namePrefix = factoryName + "-pool-" +
                poolNumber.getAndIncrement() +
                "-thread-";
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(group, r,
                namePrefix + threadNumber.getAndIncrement(),
                0);
        return t;
    }

}
