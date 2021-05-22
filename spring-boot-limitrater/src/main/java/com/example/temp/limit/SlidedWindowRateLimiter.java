package com.example.temp.limit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: springboot-limiter
 * TODO 描述：  滑动窗口-限流算法
 * @function:
 * @author: zzy
 * @create: 2021-05-18 16:10
 **/
@Slf4j
public class SlidedWindowRateLimiter implements IRateLimiter{

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

    public SlidedWindowRateLimiter() {
        this(DEFAULT_BLOCK,  DEFAULT_MAX_LIMIT);
    }

    /**
     * 构造方法
     * @param block
     * @param maxLimit
     */
    public SlidedWindowRateLimiter(int block,
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

    public SlidedWindowRateLimiter(int block, long maxLimit) {
        this(block, maxLimit, false);
    }

    public SlidedWindowRateLimiter(int block, long maxLimit, boolean isBlockAvg) {
        this(block, maxLimit, DEFAULT_TIME_WINDOW_PERIOD, TimeUnit.SECONDS, isBlockAvg);
    }

    public SlidedWindowRateLimiter(int block, long maxLimit, boolean isBlockAvg, long timeWindowPeriod, TimeUnit timeUnit) {
        this(block, maxLimit, timeWindowPeriod, timeUnit, isBlockAvg);
    }

    public SlidedWindowRateLimiter(int block, long maxLimit, long timeWindowPeriod, TimeUnit timeUnit) {
        this(block, maxLimit, false, DEFAULT_TIME_WINDOW_PERIOD, TimeUnit.SECONDS);
    }

    private void init(){
        BlockNode currentNode = null;
        Long current = System.currentTimeMillis();
        for (int i = 0 ; i< block ; i++) {
                if(lastNode == null){
                    lastNode = new BlockNode(i, new AtomicLong(0), current, null);
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


    @Override
    public  boolean isOverLimit() {
        synchronized(this) {
            reset();
        }
        long sum = sum();
        // 判断总流量是否超限
        if (sum > maxLimit){
            if (log.isDebugEnabled()){
                log.info("----- sum = "+sum + " , maxLimit = "+ maxLimit);
            }
            return  true;
        }
        long currentCounter = currentQps();
        // 判断当前 block 超限
        if (currentCounter > (maxLimit/block) && isBlockAvg ){
            if (log.isDebugEnabled()){
                log.info("-----BlockNoe counter = "+currentCounter + " , block Avg counter = "+ (maxLimit/block));
            }
            return true;
        }
        return false;
    }

    private void reset() {
        long currentTimeMillis = System.currentTimeMillis();
        long time = lastNode.getTime();
        int count = (int)( (currentTimeMillis - time) / blockTime);
        if (log.isDebugEnabled()) {
            log.info("Tips ： {0}  block will slided ! ", count);
        }
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
            if (log.isDebugEnabled()){
                log.info("reset block num is  "+num);
            }
        }

        BlockNode currentNode = lastNode;
        for (int i = 0 ; i< num ; i++) {
            currentNode = currentNode.next;

            //滑动时有重叠就清空不重叠的blockNode 数据
            if (total < block){
                currentNode.counter.set(0);
            }else if (total > block ){
                //滑动且不重叠，全部重置为0
                currentNode.counter.set(0);
            }
            if (log.isDebugEnabled()){
                log.info("sliding ：" + currentNode.toString());
            }
        }
        currentNode.time = currentTimeMillis;
        //这里改动 currentNode .counter. set(0);
        // num 大于 0 表示滑动 block 个数
        if (num > 0){
            currentNode.counter.set(0);
        }
        lastNode = currentNode;
        if (log.isDebugEnabled()) {
            log.info("reset currentNode ==> " + currentNode.toString());
        }
    }

    public Long sum() {
        long sum = 0L;
        BlockNode currentNode = lastNode;
        for (int i=0; i< block; i++){
            if (log.isDebugEnabled()) {
                log.info("Total QPS : " + currentNode.toString());
            }
            sum += currentNode.counter.get();
            currentNode = currentNode.next;
        }
        return sum;
    }

    @Override
    public Long currentQps() {
        BlockNode currentNode = lastNode;
        if (log.isDebugEnabled()) {
            log.info(" currentNode counter " + currentNode.counter.get());
        }
        return currentNode.counter.get();
    }

    @Data
    @AllArgsConstructor
    private static class BlockNode {

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
                    ", next=" + (next==null ? "null" : next.getIndex()) +
                    " }";
        }
    }
}
