package cn.xiaocai.demo.spider.thread;

import cn.xiaocai.demo.spider.data.*;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/27 21:12
 * @version: v1.0
 */
@Slf4j
public class QueueCheckTask implements Runnable{

    final int second = 10 ;
    @Setter
    private CategoryQueue categoryQueue;
    @Setter
    private CategoryPageQueue pageListQueue;
    @Setter
    private LinkGroupQueue linkGroupQueue;
    @Setter
    private LinkGroupPageQueue linkGroupPageQueue;
    @Setter
    private PicLinkQueue picLinkQueue;



    @Override
    public void run() {
        String time ;
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int size = 1 ;
        while (size > 0 ){

            try {
                TimeUnit.SECONDS.sleep(second/2);

                time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

                log.info("=+=+=+=+=+=+=+=+=+= >>>>> 监听队列 start <<<<< =+=+=+=+=+=+=+=+=+=+");
                log.info( time + " CategoryQueue size : " + categoryQueue.size());
                log.info(time + " PageListQueue size : " + pageListQueue.size());
                log.info(time + " LinkSetQueue  size : " + linkGroupQueue.size());
                log.info(time + " LinkPageQueue size : " + linkGroupPageQueue.size());
                log.info(time + " PicLinkQueue  size : " + picLinkQueue.size());
                log.info("=+=+=+=+=+=+=+=+=+= >>>>> 监听队列 end  <<<<< =+=+=+=+=+=+=+=+=+=+");


                TimeUnit.SECONDS.sleep(second/2);

                size = categoryQueue.size() + pageListQueue.size() + linkGroupQueue.size() + linkGroupPageQueue.size() + picLinkQueue.size() ;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("=========>>>>>>>>>> GAME OVER <<<<<<<<<<==========");
        SpiderThreadManager.getInstance().stop();
    }
}
