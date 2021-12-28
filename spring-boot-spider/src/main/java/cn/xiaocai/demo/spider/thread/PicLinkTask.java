package cn.xiaocai.demo.spider.thread;

import cn.xiaocai.demo.spider.data.LinkGroupPageQueue;
import cn.xiaocai.demo.spider.data.PicData;
import cn.xiaocai.demo.spider.data.PicLinkQueue;
import cn.xiaocai.demo.spider.data.UrlData;
import cn.xiaocai.demo.spider.handler.PicLinkHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：   第5步 提取图片链接集合
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/12 23:51
 * @version: v1.0
 */
@Slf4j
public class PicLinkTask extends PicLinkHandler implements Callable<String> {

    private String threadName ;

    public PicLinkTask(LinkGroupPageQueue linkGroupPageQueue, PicLinkQueue picQueue) {

        super(linkGroupPageQueue, picQueue);

        this.threadName = "-".concat(picQueue.getClass().getSimpleName());
    }


    @Override
    public String call()  {

        UrlData urlData = null;
        while ((urlData = linkGroupPageQueue.get()) != null) {

            try {
                if (IS_MARK) {
                    //数据标记
                    urlData.setMark(urlData.getMark().concat(threadName));
                }

                execute( urlData);

                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "SUCCESS";
    }

    @Override
    protected void execute(UrlData urlData) {
        log.info("PictureTask get pic from  " + urlData.getUrl());

        List<PicData> picList = this.analsysUrlList(urlData);

        picLinkQueue.add(picList);
        picLinkQueue.print();
        log.info("图组链接的抓取剩余 ："+ linkGroupPageQueue.size());
    }
}
