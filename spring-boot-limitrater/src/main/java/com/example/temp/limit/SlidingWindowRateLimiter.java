package com.example.temp.limit;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 16:10
 **/
public class SlidingWindowRateLimiter implements IRateLimiter, Runnable{

    /**
     *  默认-每秒最大访问阈值
     */
    private static final Long DEFAULT_ALLOWED_VISIT_PER_SECOND =  1000L;

    /**
     *  每秒最大访问阈值
     */
    private Long maxVisitPerSecond = 0L;


    /**
     * 默认-单位时间（每秒）分多少块
     */
    private static final int DEFAULT_BLOCK = 10;

    /**
     *  单位时间（每秒）分多少块
     */
    private  int block;

    /**
     * 默认的时间单位
     */
    private TimeUnit timeUnit = TimeUnit.SECONDS;

    /**
     * 单位时间内每一块的统计次数
     */
    private AtomicLong[] countPerBlock;

    /**
     * 当前时间所属块的统计
     */
    private AtomicLong count;

    private Long timeWindowPeriod = 10L;

    private Long perBlockLimit ;

    private volatile int index;

    /**
     * 构造方法
     * @param block
     * @param maxVisitPerSecond
     */
    public SlidingWindowRateLimiter(int block, Long maxVisitPerSecond) {
        this.block = block;
        this.maxVisitPerSecond = maxVisitPerSecond;
        countPerBlock = new AtomicLong[block];
        for (int i = 0 ; i< block ; i++) {
            countPerBlock[i] = new AtomicLong();
        }
        count = new AtomicLong(0);
    }

    public SlidingWindowRateLimiter() {
        this(DEFAULT_BLOCK,  DEFAULT_ALLOWED_VISIT_PER_SECOND);
    }

    @Override
    public boolean isOverLimit() {
        System.out.println("maxVisitPerSecond / block = "+maxVisitPerSecond / block);
        return currentQPS() > maxVisitPerSecond / block;
    }

    @Override
    public Long currentQPS() {
        return count.get();
    }

    @Override
    public boolean visit() {

        countPerBlock[index].incrementAndGet();
        count.incrementAndGet();
        return isOverLimit();
    }




    public static void main(String[] args) {
        SlidingWindowRateLimiter slidingWindowRateLimiter = new SlidingWindowRateLimiter(10, 1000L);
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(slidingWindowRateLimiter, 100, 100, TimeUnit.MILLISECONDS);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    slidingWindowRateLimiter.visit();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    slidingWindowRateLimiter.visit();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    @Override
    public void run() {
        System.out.println("isOverLimit() = " +isOverLimit());
        System.out.println("currentQPS() = " + currentQPS());
        System.out.println("index:" + index);
        index = (index + 1) % block;
        long val = countPerBlock[index].getAndSet(0);
        count.addAndGet(-val);
    }
}
