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
 * @Author : small-rose/zhangxiaocai
 * @Description : [ CategoryThread ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/27 14:37
 * @Version ： 1.0
 **/
@Slf4j
public class LinkGroupPageThread extends BaseHandler implements Runnable {

    private LinkGroupQueue linkGroup ;
    private LinkGroupPageQueue linkGroupPage ;

    private Thread nowThread;

    public LinkGroupPageThread(LinkGroupQueue linkGroupQueue, LinkGroupPageQueue linkGroupPageQueue){
        this.linkGroup = linkGroupQueue ;
        this.linkGroupPage = linkGroupPageQueue ;
    }

    @Override
    public void run() {
        nowThread = Thread.currentThread();

        LinkData linkData = null;
        int n = 1;
        while((linkData = linkGroup.take())!=null){
            log.info("No."+n+" LinkGroup get LinkData ： "+linkData);
            if (linkData==null){
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            linkData.setUrl(linkData.getUrl() + "-LinkGroupPage");
            linkData.setName(linkData.getName() + "-LinkGroupPage");
            linkGroupPage.put(linkData);
            log.info("No."+n+" LinkGroupPage  put LinkData ： "+linkData);
            try {
                n++;
                TimeUnit.SECONDS.sleep(3);
                log.info("No."+n+" LinkGroup szie : " +linkGroup.size());

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
