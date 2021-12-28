package cn.xiaocai.demo.spider.thread;

import cn.xiaocai.demo.spider.data.LinkGroupPageQueue;
import cn.xiaocai.demo.spider.data.LinkGroupQueue;
import cn.xiaocai.demo.spider.data.UrlData;
import cn.xiaocai.demo.spider.handler.LinkGroupPageHandler;
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
public class LinkGroupPageTask extends LinkGroupPageHandler implements Callable<String> {

    private String threadName ;

    public LinkGroupPageTask(LinkGroupQueue linkGroupQueue, LinkGroupPageQueue linkGroupPageQueue){

        super(linkGroupQueue, linkGroupPageQueue);
        this.threadName = "-".concat(linkGroupPageQueue.getClass().getSimpleName());
    }


    @Override
    public String call() throws Exception {


        UrlData urlData = null;
        while ((urlData = linkGroupQueue.get())!=null){

            try {
                //数据标记
                urlData.setMark(urlData.getMark().concat(threadName));

                //urlData.setTag(urlData.getName());
                linkGroupPageQueue.add(urlData);//当前组的第一页
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
        log.info("LinkSetPageTask---linkSetQueue size " + linkGroupQueue.size());


        List<UrlData> picList = this.analsysUrlList(urlData);
        log.info("LinkSetPageTask get picList size " + picList.size());
        linkGroupPageQueue.add(picList);
        linkGroupPageQueue.print();
        int size = linkGroupQueue.size();
        log.info("图集链接的抓取剩余 ："+size);
    }
}
