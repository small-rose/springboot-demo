package com.example.temp.limit;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/**
 * @author Dell-170020
 */
@Slf4j
public abstract class TokenCooperating {

    public final static Map<String, TokenCooperating> RATE_LIMITER_MAP = new ConcurrentHashMap<>();

    protected final Object lock = new Object();

    /***
     *  令牌操作，协助接口
     * @param executorService
     */
    abstract void cooperating(ExecutorService executorService);

    void waitLock(Object lock, long timeout) {
        synchronized (lock) {
            try {
                log.info(Thread.currentThread().getName()+" will wait ---");
                lock.wait(timeout);
                log.info(Thread.currentThread().getName()+" will start ---");
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
