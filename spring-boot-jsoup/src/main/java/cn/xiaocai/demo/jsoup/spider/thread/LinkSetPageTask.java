package cn.xiaocai.demo.jsoup.spider.thread;

import cn.xiaocai.demo.jsoup.spider.data.LinkPageQueue;
import cn.xiaocai.demo.jsoup.spider.data.LinkSetQueue;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.handler.LinkPageListHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：   第四步 提取图片组中的分页链接集合
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/12 23:51
 * @version: v1.0
 */
@Slf4j
public class LinkSetPageTask extends LinkPageListHandler implements Callable<String> {

    private String threadName ;

    public LinkSetPageTask(LinkSetQueue linkSetQueue, LinkPageQueue linkPageQueue){

        super(linkSetQueue,linkPageQueue);
        this.threadName = "-".concat(linkPageQueue.getClass().getSimpleName());
    }


    @Override
    public String call() throws Exception {


        UrlData urlData = null;
        while ((urlData = linkSetQueue.get())!=null){

            try {
                //数据标记
                urlData.setMark(urlData.getMark().concat(threadName));

                //urlData.setTag(urlData.getName());
                linkPageQueue.add(urlData);//当前组的第一页
                this.execute( urlData);

                TimeUnit.MINUTES.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "SUCCESS";
    }

    @Override
    protected void execute(UrlData urlData) {
        log.info("LinkSetPageTask---linkSetQueue size " +linkSetQueue.size());


        List<UrlData> picList = this.analsysUrlList(urlData);
        log.info("LinkSetPageTask get picList size " + picList.size());
        linkPageQueue.add(picList);
        linkPageQueue.print();
        int size = linkSetQueue.size();
        log.info("图集链接的抓取剩余 ："+size);
    }
}
