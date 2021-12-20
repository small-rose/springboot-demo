package cn.xiaocai.demo.async.task.service;

import java.util.concurrent.Future;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ AsyncTaskService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/20 13:33
 * @Version ： 1.0
 **/
public interface AsyncTaskService {

    /**
     * 异步调用，无返回值
     */
    public void asyncTask();

    /**
     * 异步调用，有返回值
     */
    public Future<String> asyncTask(String s);

    /**
     * 异步调用，无返回值，事务测试
     */
    public void asyncTaskForTransaction(Boolean exFlag);

}
