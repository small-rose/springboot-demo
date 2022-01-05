package cn.xiaocai.demo.async.example1;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ ThreadTask ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/20 13:32
 * @Version ： 1.0
 **/
public class ThreadTask implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "：异步任务");
    }
}
