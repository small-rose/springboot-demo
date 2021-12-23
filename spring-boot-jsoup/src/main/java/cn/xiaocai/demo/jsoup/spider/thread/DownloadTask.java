package cn.xiaocai.demo.jsoup.spider.thread;

import cn.xiaocai.demo.jsoup.spider.data.*;
import cn.xiaocai.demo.jsoup.spider.handler.CatchHandler;
import cn.xiaocai.demo.jsoup.spider.handler.DownloadHandler;
import org.jsoup.nodes.Document;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ DownloadTask ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 11:17
 * @Version ： 1.0
 **/
public class DownloadTask implements Callable<String> {


     private final PicQueue picQueue ;
    private final DownloadHandler downloadHandler = new DownloadHandler();

    public DownloadTask(PicQueue picQueue ){
        this.picQueue = picQueue;
     }

    @Override
    public String call() throws Exception {
        PicData urlData = null;
        while ((urlData = picQueue.get())!=null){
            downloadHandler.down(urlData);
            TimeUnit.MILLISECONDS.sleep(500);
        }
        return null;
    }
}
