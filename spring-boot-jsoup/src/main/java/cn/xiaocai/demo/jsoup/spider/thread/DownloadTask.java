package cn.xiaocai.demo.jsoup.spider.thread;

import cn.xiaocai.demo.jsoup.spider.data.PicData;
import cn.xiaocai.demo.jsoup.spider.data.PicLinkQueue;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.handler.DownloadHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：   第5步 使用图片链接完成下载
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/23 23:51
 * @version: v1.0
 */
@Slf4j
public class DownloadTask extends DownloadHandler implements Callable<String> {

    private String threadName ;

    static  int number = 1 ;
    public DownloadTask(PicLinkQueue picLinkQueue ){
        super(picLinkQueue);

        this.threadName = "-".concat(picLinkQueue.getClass().getSimpleName()+"-" +number);
        number ++ ;
    }

    @Override
    public String call() {
        log.info("---ThreadName---[ "+threadName+" ]下载任务"  );
        PicData urlData = null;
        while (true){

            urlData = picLinkQueue.poll();
            if (urlData==null){
                try {
                    log.info("PicLinkQueue size is 0 ---Please Waiting some seconds .... ");
                    TimeUnit.SECONDS.sleep(5);
                    continue ;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            log.info("---ThreadName---[ "+threadName+" ]下载 PicData : " +urlData );
            toToDownLoad(urlData);

        }
    }

    private void toToDownLoad(PicData urlData) {
        try {
            //数据标记
            urlData.setMark(urlData.getMark().concat(threadName));


            this.execute(urlData);

            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void execute(UrlData urlData) {
        super.execute(urlData);
    }
}
