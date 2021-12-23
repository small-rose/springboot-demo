package cn.xiaocai.demo.jsoup.spider.thread;

import cn.xiaocai.demo.jsoup.spider.data.*;
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
 * @date: 2021/7/12 23:51
 * @version: v1.0
 */
@Slf4j
public class AnalysisTask implements Callable<String> {

    private PicQueue picQueue ;
    private UrlDataQueue urlDataQueue ;
    private final CatchHandler catchHandler = new CatchHandler();
    private final UrlHandler urlHandler = new UrlHandler();


    AnalysisTask(UrlDataQueue urlDataQueue, PicQueue picQueue){
        this.picQueue = picQueue;
        this.urlDataQueue = urlDataQueue;
    }


    @Override
    public String call() throws Exception {

        UrlData urldata = null;
        while ((urldata = urlDataQueue.get())!=null){

            Document document = catchHandler.spyAsync(urldata);
            List<PicData> picList = urlHandler.analysisImgUrl(document);
            log.info(" AnalysisTask get picList size " + picList.size());
            picQueue.add(picList);
        }
        return "SUCCESS";
    }
}
