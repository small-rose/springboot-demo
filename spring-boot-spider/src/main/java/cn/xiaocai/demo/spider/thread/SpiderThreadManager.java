package cn.xiaocai.demo.spider.thread;


import cn.xiaocai.demo.spider.catcher.SpiderThread;
import cn.xiaocai.demo.spider.data.UrlData;
import cn.xiaocai.demo.spider.thread.factory.NamedThreadFactory;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:01
 * @version: v1.0
 */
@Slf4j
public class SpiderThreadManager {

    private final static SpiderThreadManager INSTANCE = new SpiderThreadManager();

    public static  SpiderThreadManager getInstance(){
        return INSTANCE;
    }

    public static List<SpiderThread> THREAD_LIST  = new  ArrayList<>();



    // 蜘蛛线程
    private  ThreadPoolExecutor scheduled = null;
    private  ThreadPoolExecutor download = null;
    //private  ThreadPoolExecutor categoryExecutor = null;
    private  ThreadPoolExecutor categoryPageExecutor = null;
    private  ThreadPoolExecutor linkSetExecutor = null;
    private  ThreadPoolExecutor linkSetPageExecutor = null;
    private  ThreadPoolExecutor picLinkExecutor = null;

    // 执行URL分析 过滤的线程池
    private  ExecutorService executorService = null;



    public void start(){


        THREAD_LIST.forEach(spiderThread -> {

            initExecutor(spiderThread.getKeyName());
            // 调用入口线程去抓页面
            UrlData urlData = new UrlData();
            urlData.setReferer(spiderThread.getDoorUrl());
            urlData.setUrl(spiderThread.getDoorUrl());

            // 提交抓取首页的任务
            CategoryTask thread = new CategoryTask(urlData, spiderThread.getCategoryQueue(), spiderThread.getCategoryKeys());
            new Thread(thread).start();

            log.info("----提交 CategoryTask -------- ");

            categoryPageExecutor.submit(new CategoryPageTask(spiderThread.getCategoryQueue(), spiderThread.getPageListQueue()));
            log.info("----提交 CategoryPageListTask -------- ");

            // 提交抓取页面的任务
            //for (int i = 0; i< spiderThread.getThreadNums(); i++) {
                linkSetExecutor.submit(new LinkGroupTask(spiderThread.getPageListQueue(), spiderThread.getLinkGroupQueue()));
                log.info("----提交 LinkSetTask --------- ");
            //}


            // 提交提取URL的任务
            for (int i = 0; i< spiderThread.getThreadNums(); i++) {
                linkSetPageExecutor.submit(new LinkGroupPageTask(spiderThread.getLinkGroupQueue(), spiderThread.getLinkGroupPageQueue()));
                log.info("----提交 LinkSetPageTask ---------- ");
            }
            // 提交提取URL的任务
            picLinkExecutor.submit(new PicLinkTask(spiderThread.getLinkGroupPageQueue(), spiderThread.getPicLinkQueue()));
            log.info("----提交 PictureTask ---------- ");
            // 提交下载图片的任务
            for (int i = 0; i< spiderThread.getThreadNums(); i++){
                scheduled.submit(new PicDownloadTask(spiderThread.getPicLinkQueue()));
            }

            QueueCheckTask queueCheckTask = new QueueCheckTask();
            queueCheckTask.setCategoryQueue(spiderThread.getCategoryQueue());
            queueCheckTask.setPageListQueue(spiderThread.getPageListQueue());
            queueCheckTask.setLinkGroupQueue(spiderThread.getLinkGroupQueue());
            queueCheckTask.setLinkGroupPageQueue(spiderThread.getLinkGroupPageQueue());
            queueCheckTask.setPicLinkQueue(spiderThread.getPicLinkQueue());

            scheduled.submit(queueCheckTask);
            log.info("----提交 document queue --- DownloadTask thread nums :"+spiderThread.getThreadNums());
        });


     }


    public void stop() {
        scheduled.shutdown();
        //categoryExecutor.shutdown();
        categoryPageExecutor.shutdown();
        linkSetExecutor.shutdown();
        linkSetPageExecutor.shutdown();
        picLinkExecutor.shutdown();
        //executorService.shutdown();
    }



    public void initExecutor(String name) {

        scheduled = new ScheduledThreadPoolExecutor(2, new NamedThreadFactory("spider-group-"+name, "scheduled-"+name));

        download = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("spider-group-"+name, "download-pic-"+name));

        //categoryExecutor = new ScheduledThreadPoolExecutor(1,  new NamedThreadFactory("spider-group-"+name, "category-"+name));

        categoryPageExecutor = new ScheduledThreadPoolExecutor(1,
                new NamedThreadFactory("spider-group-"+name, "categoryPage-"+name));

        linkSetExecutor = new ScheduledThreadPoolExecutor(1,
                new NamedThreadFactory("spider-group-"+name, "linkGroup-"+name));

        linkSetPageExecutor = new ScheduledThreadPoolExecutor(1,
                new NamedThreadFactory("spider-group-"+name, "linkGroupPage-"+name));

        picLinkExecutor = new ScheduledThreadPoolExecutor(1,
                new NamedThreadFactory("spider-group-"+name, "picLink-"+name));

        executorService = new ThreadPoolExecutor(1, 200,
                60L, TimeUnit.SECONDS, new SynchronousQueue<>(),
                new NamedThreadFactory("spider-pic-down-group"+name, "pic-down-"+name),
                new ThreadPoolExecutor.DiscardPolicy());
    }


}
