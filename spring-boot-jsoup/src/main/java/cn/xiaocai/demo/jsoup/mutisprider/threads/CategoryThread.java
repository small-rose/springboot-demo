package cn.xiaocai.demo.jsoup.mutisprider.threads;

import cn.xiaocai.demo.jsoup.mutisprider.data.LinkData;
import cn.xiaocai.demo.jsoup.mutisprider.queues.CategoryQueue;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ CategoryThread ] 说明： 提取全部的分类
 * @Function :  功能说明：无
 * @Date ：2021/12/27 14:37
 * @Version ： 1.0
 **/
@Slf4j
public class CategoryThread implements Runnable {

    String door ;
    private CategoryQueue category ;


    public CategoryThread(String door, CategoryQueue category){
        this.door = door ;
        this.category = category ;
    }

    @Override
    public void run() {
        int x = 1 ;
        while(x < 10){
            LinkData linkData = new LinkData();
            linkData.setUrl("url-0"+x);
            linkData.setName("url-0"+x);
            category.put(linkData);
            log.info("No."+x+" Category  put data :" + linkData);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x++;
        }
    }
}
