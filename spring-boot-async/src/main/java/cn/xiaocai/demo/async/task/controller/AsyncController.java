package cn.xiaocai.demo.async.task.controller;

import cn.xiaocai.demo.async.task.service.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ AsyncController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/20 14:00
 * @Version ： 1.0
 **/
@RestController
public class AsyncController {


    @Resource
    private AsyncTaskService asyncTaskService ;

    /**
     * 异步调用，无返回值
     */
    @PostMapping(value ="/asyncTask1")
    public void asyncTask(){
        asyncTaskService.asyncTask();
    }

    /**
     * 异步调用，有返回值
     */
    @PostMapping(value ="/asyncTask2")
    public Map  asyncTask(String s) throws ExecutionException, InterruptedException {
        Map<Object, Object> result = new HashMap<Object, Object>(2);

        Future<String> stringFuture = asyncTaskService.asyncTask(s);

        String s1 = stringFuture.get();
        result.put("code", "200");
        result.put("result", "SUCCESS");
        result.put("data",  s1);

        return result;
    }

    /**
     * 异步调用，无返回值，事务测试
     */
    @PostMapping(value ="/asyncTransaction")
    public void asyncTaskForTransaction(Boolean exFlag){
        asyncTaskService.asyncTaskForTransaction(true);
    }
}
