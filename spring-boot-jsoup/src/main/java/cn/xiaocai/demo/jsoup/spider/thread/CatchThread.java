package cn.xiaocai.demo.jsoup.spider.thread;

import cn.xiaocai.demo.jsoup.spider.data.DocumentQueue;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.data.UrlDataQueue;
import cn.xiaocai.demo.jsoup.spider.handler.CatchHandler;
import cn.xiaocai.demo.jsoup.spider.handler.UrlHandler;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:18
 * @version: v1.0
 */
@Slf4j
public class CatchThread implements Callable<String> {


    private final UrlDataQueue urlDataQueue ;
    private final CatchHandler catchHandler = new CatchHandler();
    private final UrlHandler urlHandler = new UrlHandler();

    public CatchThread(UrlDataQueue UrlDataQueue){
        this.urlDataQueue = UrlDataQueue;
     }

    @Override
    public String call()  {

        UrlData urlData = null;
        while ((urlData = urlDataQueue.get())!=null){
            Document doc = catchHandler.spy(urlData);
            if (doc!=null){
                // 将抓取到的页面放到 文档 队列
                List<UrlData> dataList = urlHandler.drawUrl(doc);
                if (dataList.size()==0){
                    doc = catchHandler.spyAsync(urlData);
                    dataList = urlHandler.drawUrl(doc);
                 }
                urlDataQueue.add(dataList);
             }
        }
        return "SUCCESS";
    }
}
