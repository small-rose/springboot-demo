package cn.xiaocai.demo.jsoup.spider.catcher;

import cn.xiaocai.demo.jsoup.spider.data.*;
import cn.xiaocai.demo.jsoup.spider.door.baserules.BaseWebRule;
import cn.xiaocai.demo.jsoup.spider.thread.SpiderThreadManager;
import lombok.Data;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:07
 * @version: v1.0
 */
@Data
public class SpiderServer implements Server {

    private List<BaseWebRule> ruleList ;


    /**
     * 图片下载线程数
     */
    private int downloadThreadNumbers = 3;

    private SpiderThreadManager spiderThreadManager ;


    @Override
    public void init() {


        // 校验爬取规则是否为空
        ruleList.forEach(webRule -> webRule.check());

        spiderThreadManager = SpiderThreadManager.getInstance();
        //每个网站创建爬取规则
        ruleList.forEach(webRule ->{

            SpiderThread spiderThread = new SpiderThread();
            CategoryQueue categoryQueue = new CategoryQueue();
            categoryQueue.setCategoryRule(webRule.getCategoryRule());
            spiderThread.setCategoryQueue(categoryQueue);

            PageListQueue pageListQueue = new PageListQueue();
            pageListQueue.setRule(webRule.getPageListRule());
            spiderThread.setPageListQueue(pageListQueue);

            LinkSetQueue linkSetQueue = new LinkSetQueue();
            linkSetQueue.setRule(webRule.getLinkSetRule());
            spiderThread.setLinkSetQueue(linkSetQueue);

            LinkPageQueue linkPageQueue = new LinkPageQueue();
            linkPageQueue.setRule(webRule.getLinkPageRule());
            spiderThread.setLinkPageQueue(linkPageQueue);

            PicLinkQueue picLinkQueue = new PicLinkQueue();
            webRule.getPicLinkRule().setDownLoadPath(webRule.getDownLoadPath());
            webRule.getPicLinkRule().setReferer(webRule.getDoorUrl());
            picLinkQueue.setRule(webRule.getPicLinkRule());

            spiderThread.setPicLinkQueue(picLinkQueue);




            spiderThread.setDoorUrl(webRule.getDoorUrl());
            spiderThread.setThreadNums(webRule.getDownloadThreadNumbers());
            spiderThread.setKeyName(webRule.getThreadNameKey());
            SpiderThreadManager.THREAD_LIST.add(spiderThread);
        });
    }

    @Override
    public void start() {

        init();
        spiderThreadManager.start();
    }



    @Override
    public void stop() {

        spiderThreadManager.stop();
    }
}
