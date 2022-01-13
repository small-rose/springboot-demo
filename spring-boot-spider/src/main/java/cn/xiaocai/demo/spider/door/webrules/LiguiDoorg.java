package cn.xiaocai.demo.spider.door.webrules;

import cn.xiaocai.demo.spider.door.baserules.BaseWebRule;
import cn.xiaocai.demo.spider.rules.*;

import java.util.Arrays;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/9 17:51
 * @version: v1.0
 */
public class LiguiDoorg  extends BaseWebRule {


    public LiguiDoorg(String doorUrl){
        this.doorUrl = doorUrl;
    }


    @Override
    public void check() {
        checkRules();
    }

    @Override
    protected void loadRule() {
        CategoryRule categoryRule = new CategoryRule();
        categoryRule.setEleLocation(".nav_header > li > a");
        categoryRule.setSkipKeys( Arrays.asList("首页","套图","电影","小说"));
        setCategoryRule(categoryRule);

        CategoryPageRule categoryPageRule = new CategoryPageRule();
        categoryPageRule.setEleLocation("div#pager ul li a");
        setCategoryPageRule(categoryPageRule);

        LinkGroupRule linkSetRule = new LinkGroupRule();
        linkSetRule.setEleLocation("div#container div.post > a");
        setLinkGroupRule(linkSetRule);

        LinkGroupPageRule linkPageRule = new LinkGroupPageRule();
        linkPageRule.setEleLocation("div.pageart > ul > li > a");
        setLinkGroupPageRule(linkPageRule);

        PicLinkRule picLinkRule = new PicLinkRule();
        picLinkRule.setEleLocation("html body div#content  div#bigpic a img");
        setPicLinkRule(picLinkRule);
    }


}
