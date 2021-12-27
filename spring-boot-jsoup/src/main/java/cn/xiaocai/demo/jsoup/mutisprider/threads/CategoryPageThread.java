package cn.xiaocai.demo.jsoup.mutisprider.threads;

import cn.xiaocai.demo.jsoup.mutisprider.data.LinkData;
import cn.xiaocai.demo.jsoup.mutisprider.handlers.BaseHandler;
import cn.xiaocai.demo.jsoup.mutisprider.queues.CategoryPageQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.CategoryQueue;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ CategoryThread ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/27 14:37
 * @Version ： 1.0
 **/
@Slf4j
public class CategoryPageThread extends BaseHandler implements Runnable {

    private CategoryQueue category ;
    private CategoryPageQueue categoryPage ;

    private Thread nowThread;

    public CategoryPageThread(CategoryQueue category, CategoryPageQueue CategoryPageQueue){
        this.category = category ;
        this.categoryPage = CategoryPageQueue ;
    }

    @Override
    public void run() {
        nowThread = Thread.currentThread();

        LinkData linkData = null;
        int n = 1 ;
        while((linkData = category.take())!=null){
            log.info("No."+n+" Category get LinkData ： "+linkData);
            if (linkData==null){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            linkData.setUrl(linkData.getUrl() + "-CategoryPage");
            linkData.setName(linkData.getName() + "-CategoryPage");
            categoryPage.put(linkData);
            log.info("No."+n+" CategoryPage  put LinkData ： "+linkData);
            try {
                n++;
                TimeUnit.SECONDS.sleep(1);
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
