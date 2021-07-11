package cn.xiaocai.demo.jsoup.spider.thread;

import cn.xiaocai.demo.jsoup.spider.data.DataManager;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.thread.factory.NamedThreadFactory;

import java.util.concurrent.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:01
 * @version: v1.0
 */
public class SpiderThreadManager {

    // 蜘蛛线程
    private final ScheduledThreadPoolExecutor scheduled = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
            new NamedThreadFactory("spider-group", "spider-factory"));

    // 执行URL分析 过滤的线程池
    private final ExecutorService executorService = new ThreadPoolExecutor(5, 200,
            60L, TimeUnit.SECONDS, new SynchronousQueue<>(),
            new NamedThreadFactory("spider-url-group", "spider-url-factory"),
            new ThreadPoolExecutor.DiscardPolicy());


    public void init(String door, long delayed,long period, TimeUnit timeUnit){
        // 调用入口线程去抓页面
        UrlData urlData = new UrlData();
        urlData.setUrl(door);
        DataManager.urlDataList.add(urlData);
        new Thread(new CatchThread(DataManager.urlDataList)).start();

        //new Thread(new Url()).start();
        // 间隔一段时间抓取一次
        //scheduled.scheduleAtFixedRate(new CatchThread(DataManager.urlDataList), delayed, period, timeUnit);
     }

}
