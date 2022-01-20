package cn.xiaocai.demo.async.example2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ AsyncTaskDemoService ] 说明：使用线程池对象，来开启异步任务
 * @Function :  功能说明： 使用线程池对象，来开启异步任务
 * @Date ：2021/12/20 14:12
 * @Version ： 1.0
 **/
@Slf4j
@Service
public class AsyncTaskDemoService {

    @Autowired
    AsyncTaskExecutor asyncTaskExecutor;//注入线程池对象

    /**
     * 无返回值
     */
    public void asyncTask(){
        //通过线程池对象提交异步任务
        asyncTaskExecutor.submit(() -> {
            log.info("异步任务开始");

            //省略异步任务业务逻辑...

            log.info("异步任务结束");
        });
    }


    public String asyncTask(String s) throws ExecutionException, InterruptedException {
        //通过线程池对象提交异步任务
        Future<String> s1 = asyncTaskExecutor.submit(() ->{
            return s;
        });
        return s1.get();
    }



}
