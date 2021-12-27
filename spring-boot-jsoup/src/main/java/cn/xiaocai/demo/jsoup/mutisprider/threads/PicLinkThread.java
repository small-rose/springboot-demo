package cn.xiaocai.demo.jsoup.mutisprider.threads;

import cn.xiaocai.demo.jsoup.mutisprider.data.LinkData;
import cn.xiaocai.demo.jsoup.mutisprider.handlers.BaseHandler;
import cn.xiaocai.demo.jsoup.mutisprider.queues.LinkGroupPageQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.LinkGroupQueue;
import lombok.extern.slf4j.Slf4j;
import sun.nio.ch.Interruptible;

import java.util.concurrent.TimeUnit;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ PicLinkThread ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/27 15:57
 * @Version ： 1.0
 **/
@Slf4j
public class PicLinkThread  extends BaseHandler  implements Runnable , Interruptible {


    private LinkGroupPageQueue linkGroupPage ;

    private Thread nowThread;

    public PicLinkThread(LinkGroupPageQueue linkGroupPageQueue){
         this.linkGroupPage = linkGroupPageQueue ;
    }

    @Override
    public void run() {
        nowThread = Thread.currentThread();

        LinkData linkData = null;
        int n = 1;

        while((linkData = linkGroupPage.take())!=null){
            log.info("No."+n+" linkGroupPage get LinkData ： "+linkData);
            if (linkData==null){
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

             try {
                n++;
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

    @Override
    public void interrupt(Thread thread) {
        setInterrupted();
    }
}
