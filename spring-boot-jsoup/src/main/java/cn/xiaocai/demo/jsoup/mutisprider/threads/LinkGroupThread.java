package cn.xiaocai.demo.jsoup.mutisprider.threads;

import cn.xiaocai.demo.jsoup.mutisprider.data.LinkData;
import cn.xiaocai.demo.jsoup.mutisprider.handlers.BaseHandler;
import cn.xiaocai.demo.jsoup.mutisprider.queues.CategoryPageQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.CategoryQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.LinkGroupPageQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.LinkGroupQueue;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ CategoryThread ] 说明： 提取全部的分类
 * @Function :  功能说明：无
 * @Date ：2021/12/27 14:37
 * @Version ： 1.0
 **/
@Slf4j
public class LinkGroupThread extends BaseHandler implements Runnable {

    private CategoryPageQueue categoryPage ;
    private LinkGroupQueue linkGroup ;

    private Thread nowThread;

    public LinkGroupThread(CategoryPageQueue categoryPage, LinkGroupQueue linkGroup){
        this.categoryPage = categoryPage ;
        this.linkGroup = linkGroup ;
    }

    @Override
    public void run() {
        nowThread = Thread.currentThread();

        LinkData linkData = null;
        while((linkData = categoryPage.take())!=null){
            log.info("CategoryPage get LinkData ： "+linkData);
            if (linkData==null){
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            linkData.setUrl(linkData.getUrl() + "-LinkGroup");
            linkData.setName(linkData.getName() + "-LinkGroup");
            linkGroup.put(linkData);
            log.info("LinkGroup size ： "+linkGroup.size());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void setInterrupted() {
        nowThread.interrupt();
    }
}
