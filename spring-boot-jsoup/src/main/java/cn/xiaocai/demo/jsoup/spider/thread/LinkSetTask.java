package cn.xiaocai.demo.jsoup.spider.thread;

import cn.xiaocai.demo.jsoup.spider.data.LinkSetQueue;
import cn.xiaocai.demo.jsoup.spider.data.PageListQueue;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.handler.LinkSetHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：  第三步 提取每页图片组的图片组链接
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:18
 * @version: v1.0
 */
@Slf4j
public class LinkSetTask extends LinkSetHandler implements Runnable{

    private String threadName ;

    public LinkSetTask(PageListQueue pageListQueue, LinkSetQueue linkSetQueue){
        super(pageListQueue, linkSetQueue);
        this.threadName = "-".concat(linkSetQueue.getClass().getSimpleName());
     }

    @Override
    public void run()  {


        UrlData urlData = null;
        while ( (urlData = pageListQueue.get()) != null){

            try {
                //数据标记
                urlData.setMark(urlData.getMark().concat(threadName));

                execute(urlData);

                log.info("分类的分页的抓取剩余 ："+pageListQueue.size());

                TimeUnit.MINUTES.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
     }

    @Override
    protected void execute(UrlData urlData) {


        List<UrlData> dataList = this.analsysUrlList( urlData);

        linkSetQueue.add(dataList);
        linkSetQueue.print();

    }
}
