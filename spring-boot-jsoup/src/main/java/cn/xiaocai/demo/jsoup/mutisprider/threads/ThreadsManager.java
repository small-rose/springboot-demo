package cn.xiaocai.demo.jsoup.mutisprider.threads;

import cn.xiaocai.demo.jsoup.mutisprider.queues.CategoryPageQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.CategoryQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.LinkGroupPageQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.LinkGroupQueue;
import cn.xiaocai.demo.jsoup.spider.thread.factory.NamedThreadFactory;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.*;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ ThreadsManager ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/27 14:58
 * @Version ： 1.0
 **/
@Slf4j
public class ThreadsManager {

    private static final ThreadsManager INSTANCE = new ThreadsManager();

    public static  ThreadsManager getInstance(){
        return INSTANCE;
    }

    @Setter
    private CategoryQueue category ;
    @Setter
    private CategoryPageQueue categoryPage ;
    @Setter
    private LinkGroupQueue linkGroup ;
    @Setter
    private LinkGroupPageQueue linkGroupPage ;

    // 蜘蛛线程
    private final ThreadPoolExecutor scheduled = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
            new NamedThreadFactory("spider-group", "spider-fetch-"));

    // 执行URL分析 过滤的线程池
    private final ExecutorService executorService = new ThreadPoolExecutor(5, 200,
            60L, TimeUnit.SECONDS, new SynchronousQueue<>(),
            new NamedThreadFactory("spider-url-group", "spider-url-factory"),
            new ThreadPoolExecutor.DiscardPolicy());



    public void start(String door){
        // 调用入口线程去抓页面
        scheduled.submit(new CategoryThread(door, category));

        scheduled.submit(new CategoryPageThread(category, categoryPage));

        scheduled.submit(new LinkGroupThread(categoryPage,linkGroup));

        scheduled.submit(new LinkGroupPageThread(linkGroup, linkGroupPage));

        scheduled.submit(new PicLinkThread(linkGroupPage));

        QueueCheckThread queueCheckThread = new QueueCheckThread();
        queueCheckThread.setCategory(category);
        queueCheckThread.setCategoryPage(categoryPage);
        queueCheckThread.setLinkGroup(linkGroup);
        queueCheckThread.setLinkGroupPage(linkGroupPage);
        scheduled.submit(queueCheckThread);
        log.info("----提交线程任务--- ");


    }


    public void stop() {
        scheduled.shutdownNow();

        executorService.shutdownNow();
    }
}
