package cn.xiaocai.demo.jsoup.mutisprider.threads;

import cn.xiaocai.demo.jsoup.mutisprider.queues.CategoryPageQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.CategoryQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.LinkGroupPageQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.LinkGroupQueue;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ QueueCheckThread ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/27 15:41
 * @Version ： 1.0
 **/
@Slf4j
public class QueueCheckThread  implements Runnable {

    @Setter
    private CategoryQueue category ;
    @Setter
    private CategoryPageQueue categoryPage ;
    @Setter
    private LinkGroupQueue linkGroup ;
    @Setter
    private LinkGroupPageQueue linkGroupPage ;

    @Override
    public void run() {
        int size = 1 ;
        while(size > 0 ) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            log.info(time +" CategoryQueue      size : " + category.size());
            log.info(time +" CategoryPageQueue  size : " + categoryPage.size());
            log.info(time +" LinkGroupQueue     size : " + linkGroup.size());
            log.info(time +" LinkGroupPageQueue size : " + linkGroupPage.size());

            size = category.size() + categoryPage.size() + linkGroup.size() + linkGroupPage.size() ;


            try {
                TimeUnit.SECONDS.sleep(5);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" GAME OVER !!! ");

        ThreadsManager.getInstance().stop();
    }
}
