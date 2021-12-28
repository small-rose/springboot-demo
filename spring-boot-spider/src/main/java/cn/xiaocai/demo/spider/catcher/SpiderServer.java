package cn.xiaocai.demo.spider.catcher;

import cn.xiaocai.demo.spider.data.*;
import cn.xiaocai.demo.spider.door.baserules.BaseWebRule;
import cn.xiaocai.demo.spider.thread.SpiderThreadManager;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

;

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


    @Autowired
    CategoryPageQueue picLinkQueue ;

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

            CategoryPageQueue pageListQueue = new CategoryPageQueue();
            pageListQueue.setRule(webRule.getPageListRule());
            spiderThread.setPageListQueue(pageListQueue);

            LinkGroupQueue linkGroupQueue = new LinkGroupQueue();
            linkGroupQueue.setRule(webRule.getLinkSetRule());
            spiderThread.setLinkGroupQueue(linkGroupQueue);

            LinkGroupPageQueue linkGroupPageQueue = new LinkGroupPageQueue();
            linkGroupPageQueue.setRule(webRule.getLinkPageRule());
            spiderThread.setLinkGroupPageQueue(linkGroupPageQueue);

            PicLinkQueue picLinkQueue = new PicLinkQueue();
            webRule.getPicLinkRule().setDownLoadPath(webRule.getDownLoadPath());
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
