package cn.xiaocai.demo.jsoup.spider.thread;

import cn.xiaocai.demo.jsoup.spider.data.CategoryQueue;
import cn.xiaocai.demo.jsoup.spider.data.PageListQueue;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.handler.CategoryPageListHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：   第二步 提取图片组的分页
 *
 * TODO 描述： 该任务需要迭代
 * @author: 张小菜
 * @date: 2021/12/24 21:57
 * @version: v1.0
 */
@Slf4j
public class CategoryPageListTask extends CategoryPageListHandler implements Runnable {

    private String threadName ;

    public CategoryPageListTask(CategoryQueue categoryQueue, PageListQueue pageListQueue){
        super(categoryQueue, pageListQueue);
        this.threadName = "-".concat(pageListQueue.getClass().getSimpleName());
    }


    @Override
    public void run() {
        UrlData urlData = null;
        while ( (urlData = categoryQueue.get()) != null){

            try {
                urlData.setMark(urlData.getMark().concat(threadName));
                pageListQueue.add(urlData);// 首页

                this.execute(urlData);

                TimeUnit.SECONDS.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    protected void execute(UrlData urlData) {

            // 将抓取到的页面放到 文档 队列
            //List<UrlData> dataList = this.analsysUrlList(doc);
            List<UrlData> dataList = this.getAllPageListUrl(urlData);

            pageListQueue.add(dataList);
            pageListQueue.print();

            log.info("类别抓取剩余 ："+categoryQueue.size());

    }
}
