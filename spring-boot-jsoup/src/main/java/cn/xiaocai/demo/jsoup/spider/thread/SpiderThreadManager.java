package cn.xiaocai.demo.jsoup.spider.thread;

import cn.xiaocai.demo.jsoup.spider.data.DocumentQueue;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.data.UrlDataQueue;
import cn.xiaocai.demo.jsoup.spider.thread.factory.NamedThreadFactory;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:01
 * @version: v1.0
 */
public class SpiderThreadManager {

    private static final SpiderThreadManager INSTANCE = new SpiderThreadManager();

    public static  SpiderThreadManager getInstance(){
        return INSTANCE;
    }

    @Setter
    @Getter
    private DocumentQueue documentQueue;
    @Setter
    @Getter
    private UrlDataQueue urlDataQueue;

    // 蜘蛛线程
    private final ThreadPoolExecutor scheduled = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
            new NamedThreadFactory("spider-group", "spider-factory"));

    // 执行URL分析 过滤的线程池
    private final ExecutorService executorService = new ThreadPoolExecutor(5, 200,
            60L, TimeUnit.SECONDS, new SynchronousQueue<>(),
            new NamedThreadFactory("spider-url-group", "spider-url-factory"),
            new ThreadPoolExecutor.DiscardPolicy());



    public void init(String door){
        // 调用入口线程去抓页面
        UrlData urlData = new UrlData();
        urlData.setUrl(door);
        urlDataQueue.add(urlData);

        // 提交抓取页面的任务
        Future<String> res = scheduled.submit(new CatchThread(urlDataQueue));
        // 提交提取URL的任务
        Future<String> res2 = executorService.submit(new AnalysisTask(documentQueue));

        try {
            String result1 = res.get();
            String result2 = res2.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
     }


    public void stop() {
        scheduled.shutdown();
        executorService.shutdown();
    }
}
