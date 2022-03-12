package com.xiaocai.demo.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CoreSizeDemo ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/16 14:38
 * @Version ： 1.0
 **/
public class CoreSizeDemo {

    @Test
    public void test(){


        // 取得核心数量
        final int numberOfCores = Runtime.getRuntime().availableProcessors();
        // 阻塞系数（计算型为0，IO 型为0~1）
        final double blockingCoefficient = 0;
        // 计算线程池大小
        final int poolSize = (int) (numberOfCores / (1 - blockingCoefficient));

        final List<Callable<String>> partitions = new ArrayList<Callable<String>>();

        ExecutorService executorPool = Executors.newFixedThreadPool(poolSize);

        // 此处循环添加任务
        partitions.add(new Callable<String>(){

            public String call() throws Exception {
                // 业务处理
                return "";
            }
        });


        // 放入线程池
        final List<Future<String>> futures;
        try {
            futures = executorPool.invokeAll(partitions);

            // 对运行结果进行处理
            for(Future<String> future : futures){
                String result=future.get();
            }

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


        // 关闭线程池
        executorPool.shutdown();

    }
}
