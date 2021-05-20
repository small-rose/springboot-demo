package com.example.temp.limit;

import com.example.temp.annotation.LimitStrategy;
import com.example.temp.annotation.LimitTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-18 16:10
 **/
@Slf4j
@Scope( ConfigurableBeanFactory.SCOPE_PROTOTYPE )
@LimitStrategy(value = LimitTypeEnum.RateLimiter)
public class SlidingWindowRateLimiter implements IRateLimiter{

    /**
     *  默认-时间窗口内 最大访问阈值
     */
    private static final long DEFAULT_MAX_LIMIT =  1000L;
    /**
     * 默认时间窗口期 10s
     */
    private static final long DEFAULT_TIME_WINDOW_PERIOD = 10L;
    /**
     *  时间窗口内 最大访问阈值
     */
    private long maxLimit = 0L;


    /**
     * 默认-分多少块
     */
    private static final int DEFAULT_BLOCK = 10;

    /**
     *  单位时间（每秒）分多少块
     */
    private  int block;

    /**
     * 默认的时间单位
     */
    private TimeUnit timeUnit = TimeUnit.SECONDS;;

    /**
     * 默认时间窗口
     */
    private Long timeWindowPeriod ;

    /**
     * 上次移动的位置
     */
    private BlockNode lastNode ;
    /**
     * 每个小block的 时间区间
     */
    private long blockTime ;

    private boolean isBlockAvg  = Boolean.FALSE;

    public SlidingWindowRateLimiter() {
        this(DEFAULT_BLOCK,  DEFAULT_MAX_LIMIT);
    }

    /**
     * 构造方法
     * @param block
     * @param maxLimit
     */
    public SlidingWindowRateLimiter(int block,
                                    long maxLimit,
                                    Long timeWindowPeriod,
                                    TimeUnit timeUnit,
                                    boolean isBlockAvg) {
        this.block = block;
        this.maxLimit = maxLimit;
        this.timeWindowPeriod = timeWindowPeriod;
        this.timeUnit = timeUnit;
        this.isBlockAvg = isBlockAvg;
        init();
    }

    public SlidingWindowRateLimiter(int block, long maxLimit) {
        this(block, maxLimit, false);
    }

    public SlidingWindowRateLimiter(int block, long maxLimit, boolean isBlockAvg) {
        this(block, maxLimit, DEFAULT_TIME_WINDOW_PERIOD, TimeUnit.SECONDS, isBlockAvg);
    }

    public SlidingWindowRateLimiter(int block, long maxLimit,boolean isBlockAvg,long timeWindowPeriod, TimeUnit timeUnit) {
        this(block, maxLimit, timeWindowPeriod, timeUnit, isBlockAvg);
    }

    public SlidingWindowRateLimiter(int block, long maxLimit, long timeWindowPeriod, TimeUnit timeUnit) {
        this(block, maxLimit, false, DEFAULT_TIME_WINDOW_PERIOD, TimeUnit.SECONDS);
    }

    private void init(){
        BlockNode currentNode = null;
        Long current = System.currentTimeMillis();
        for (int i = 0 ; i< block ; i++) {
                if(lastNode == null){
                    lastNode = new BlockNode(i, new AtomicLong(0), current,null);
                    currentNode = lastNode;
                    log.info("init lastNode ==>" + currentNode);
                }else{
                    lastNode.next = new BlockNode(i, new AtomicLong(0), current, null);
                    lastNode = lastNode.next;
                    log.info("init lastNode ==>" + lastNode);
                }
        }
        lastNode.next = currentNode;
        blockTime = timeUnit.toMillis(timeWindowPeriod) / block;
    }


    public synchronized boolean isOverLimit() {
        reset();
        long sum = sum();
        log.info("----- sum = "+sum + " , maxLimit = "+ maxLimit);
        // 判断总流量是否超限
        if (sum >= maxLimit){
            log.info("----- sum = "+sum + " , maxLimit = "+ maxLimit);
            return  true;
        }
        long currentCounter = lastNode.counter.get();
        currentQps();
        log.info("-----lastNode counter = "+ currentCounter + " , blockAv counter = "+ (maxLimit/block));
        if (currentCounter >= (maxLimit/block) && isBlockAvg ){
            log.info("-----BlockNoe counter = "+currentCounter + " , blockAv counter = "+ (maxLimit/block));
            return true;
        }
        log.info("isOverLimit(); before add  currentNode ==> "+lastNode.toString());
        long counter = lastNode.counter.incrementAndGet();
        log.info("isOverLimit(); after  add  currentNode ==> "+lastNode.toString());
        return false;
    }

    private void reset() {
        long currentTimeMillis = System.currentTimeMillis();
        long time = lastNode.getTime();
        int count = (int)( (currentTimeMillis - time) / blockTime);
        log.info("block num is "+count);

        reset(count,  currentTimeMillis);
    }

    /**
     * 让 窗口动起来, 同时重置的数据
     * @param num
     * @param currentTimeMillis
     */
    private void reset(int num, long currentTimeMillis) {
        if (num <= 0 ){
            return;
        }
        int total = num;
        if(num > block){
            num = block ;
            log.info("reset block num is  "+num);
        }

        BlockNode currentNode = lastNode;
        for (int i = 0 ; i< num ; i++) {
            currentNode = currentNode.next;

            //滑动时有重叠就清空不重叠的blockNode 数据
            if ((total > block) && (num <  block <<1) && (i < total % block) && (total % block != 0) ){
                currentNode.counter.set(0);
            }else if (total > block && total > block <<1){//滑动不重叠，全部重置为0
                currentNode.counter.set(0);
            }
            // 不滑动时什么也不做
            log.info("sliding：" + currentNode.toString());
        }
        currentNode.time = currentTimeMillis;
        // currentNode.counter.set(0);
        if (total > block){
            currentNode.counter.set(0);
        }
        lastNode = currentNode;
        log.info("reset lastNode ==> " + currentNode.toString());
    }

    public Long sum() {
        long sum = 0L;
        BlockNode currentNode = lastNode;
        for (int i=0; i< block; i++){
            sum += currentNode.counter.get();
            currentNode = currentNode.next;
        }
        return sum;
    }

    @Override
    public Long currentQps() {
        BlockNode currentNode = lastNode;
        log.info(" currentNode counter " + currentNode.counter.get());
        return currentNode.counter.get();
    }

    @Data
    @AllArgsConstructor
    private class BlockNode {

        private int index ;
        private AtomicLong counter ;
        private long time ;
        private BlockNode next;

        @Override
        public String toString() {
            return "BlockNode{" +
                    "index=" + index +
                    ", counter=" + counter +
                    ", time=" + time +
                    // ", next=" + next +
                    " }";
        }
    }
}
