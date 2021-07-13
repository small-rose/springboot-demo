package cn.xiaocai.demo.jsoup.spider.thread;

import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.data.UrlDataQueue;
import cn.xiaocai.demo.jsoup.spider.handler.CatchHandler;
import org.jsoup.nodes.Document;

import java.util.concurrent.Callable;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:18
 * @version: v1.0
 */
public class CatchThread implements Callable<String> {

    private final UrlDataQueue urlDataQueue ;
    private final CatchHandler catchHandler ;

    public CatchThread(UrlDataQueue UrlDataQueue){
        this.urlDataQueue = UrlDataQueue;
        this.catchHandler = new CatchHandler();
    }

    @Override
    public String call() {

        UrlData urlData = null;
        while ((urlData = urlDataQueue.get())!=null){
            Document doc = catchHandler.spy(urlData);
            if (doc!=null){
                // 将抓取到的页面放到队列
                SpiderThreadManager.getInstance().getDocumentQueue().add(doc);
            }
        }
        return "SUCCESS";
    }
}
