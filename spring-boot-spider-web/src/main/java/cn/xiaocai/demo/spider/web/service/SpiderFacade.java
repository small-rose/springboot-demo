package cn.xiaocai.demo.spider.web.service;

import cn.xiaocai.demo.spider.catcher.SpiderServer;
import cn.xiaocai.demo.spider.door.webrules.TemplateRule;
import cn.xiaocai.demo.spider.rules.*;
import cn.xiaocai.demo.spider.thread.SpiderThreadManager;
import cn.xiaocai.demo.spider.web.controller.RulesData;
import cn.xiaocai.demo.spider.web.vo.Rules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/9 12:13
 * @version: v1.0
 */

@Component
public class SpiderFacade extends RulesData {

    @Autowired
    private SpiderServer spiderServer ;

    public boolean startTask(Rules rule) {
        TemplateRule runRule = new TemplateRule(rule.getDoor());

        CategoryRule categoryRule = new CategoryRule();
        categoryRule.setEleLocation(rule.getCategory().getEleLocation());
        if (CollectionUtils.isEmpty(rule.getCategory().getSkipKeys())) {
            categoryRule.setSkipKeys(null);
        }else{
            categoryRule.setSkipKeys(rule.getCategory().getSkipKeys());
        }
        runRule.setCategoryRule(categoryRule);

        CategoryPageRule pageListRule = new CategoryPageRule();
        pageListRule.setEleLocation(rule.getCategoryPages().getEleLocation());
        if (CollectionUtils.isEmpty(rule.getCategoryPages().getSkipKeys())) {
            pageListRule.setSkipKeys(null);
        }else{
            pageListRule.setSkipKeys(rule.getCategoryPages().getSkipKeys());
        }
        runRule.setCategoryPageRule(pageListRule);

        LinkGroupRule linkSetRule = new LinkGroupRule();
        linkSetRule.setEleLocation(rule.getLinkGroup().getEleLocation());
        if (CollectionUtils.isEmpty(rule.getLinkGroup().getSkipKeys())) {
            linkSetRule.setSkipKeys(null);
        }else{
            linkSetRule.setSkipKeys(rule.getLinkGroup().getSkipKeys());
        }

        runRule.setLinkGroupRule(linkSetRule);

        LinkGroupPageRule linkGroupPageRule = new LinkGroupPageRule();
        linkGroupPageRule.setEleLocation(rule.getLinkGroupPages().getEleLocation());
        if (CollectionUtils.isEmpty(rule.getLinkGroupPages().getSkipKeys())) {
            linkGroupPageRule.setSkipKeys(null);
        }else{
            linkGroupPageRule.setSkipKeys(rule.getLinkGroupPages().getSkipKeys());
        }
        runRule.setLinkGroupPageRule(linkGroupPageRule);

        PicLinkRule picLinkRule = new PicLinkRule();
        picLinkRule.setEleLocation(rule.getPicLink().getEleLocation());
        if (CollectionUtils.isEmpty(rule.getPicLink().getSkipKeys())) {
            picLinkRule.setSkipKeys(null);
        }else{
            picLinkRule.setSkipKeys(rule.getLinkGroupPages().getSkipKeys());
        }
        runRule.setPicLinkRule(picLinkRule);

        runRule.setCategoryKeys(rule.getCategory().getCategoryName());
        runRule.setDownLoadPath(rule.getSaveLocation());
        runRule.setDoorUrl(rule.getDoor());
        taskList.add(runRule);

        spiderServer.setRuleList(taskList);
        spiderServer.start();
        return  true ;
    }

    public boolean stopTask(Rules rules) {

        SpiderThreadManager.getInstance().stop();
        return true ;
    }
}
