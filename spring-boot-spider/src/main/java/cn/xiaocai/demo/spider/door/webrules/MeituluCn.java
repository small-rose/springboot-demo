package cn.xiaocai.demo.spider.door.webrules;

import cn.xiaocai.demo.spider.door.baserules.BaseWebRule;
import cn.xiaocai.demo.spider.rules.*;

import java.util.Arrays;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/26 0:48
 * @version: v1.0
 */
public class MeituluCn extends BaseWebRule {


    public MeituluCn(String doorUrl){
        super();
        this.doorUrl = doorUrl;
    }


    @Override
    public void check() {
        checkRules();
    }

    @Override
    protected void loadRule() {
        CategoryRule categoryRule = new CategoryRule();
        categoryRule.setEleLocation("body div.header div.top div.nav ul.menu li#tag ul#tag_ul li a");
        //categoryRule.setEleLocation("html.no-js body nav.navbar.navbar-default.navbar-fixed-top div.container-fluid div#bs-example-navbar-collapse-1.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown ul.dropdown-menu li > a");
        categoryRule.setSkipKeys(null);
        setCategoryRule(categoryRule);

        CategoryPageRule pageListRule = new CategoryPageRule();
        pageListRule.setEleLocation("div#pages a");
        setPageListRule(pageListRule);

        LinkGroupRule linkSetRule = new LinkGroupRule();
        linkSetRule.setEleLocation("div.main div.boxs ul.img li p.p_title a");
        linkSetRule.setSkipKeys(Arrays.asList("img.reapi.cn"));
        setLinkSetRule(linkSetRule);

        LinkGroupPageRule linkPageRule = new LinkGroupPageRule();
        linkPageRule.setEleLocation("html body center div#pages a");
        linkPageRule.setSkipKeys(Arrays.asList("上一组","下一组"));
        setLinkPageRule(linkPageRule);

        PicLinkRule picLinkRule = new PicLinkRule();
        picLinkRule.setEleLocation("html body div.content center a img.content_img");
        setPicLinkRule(picLinkRule);

    }
}
