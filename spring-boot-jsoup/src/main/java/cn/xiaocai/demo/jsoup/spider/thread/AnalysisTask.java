package cn.xiaocai.demo.jsoup.spider.thread;

import cn.xiaocai.demo.jsoup.spider.data.DocumentQueue;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.handler.UrlHandler;
import org.jsoup.nodes.Document;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/12 23:51
 * @version: v1.0
 */
public class AnalysisTask implements Callable {

    private DocumentQueue documentQueue ;
    private UrlHandler urlHandler ;

    AnalysisTask(DocumentQueue documentQueue, UrlHandler urlHandler){
        this.documentQueue = documentQueue;
        this.urlHandler = urlHandler;
    }
    AnalysisTask(DocumentQueue documentQueue){
        this.documentQueue = documentQueue;
        this.urlHandler = new UrlHandler();
    }
    @Override
    public String call() throws Exception {


        Document doc = null;
        while ((doc = documentQueue.get())!=null){
            List<UrlData> dataList = urlHandler.drawUrl(doc);
            SpiderThreadManager.getInstance().getUrlDataQueue().add(dataList);
        }
        return "SUCCESS";
    }
}
