package cn.xiaocai.demo.spider.door.webrules;

import cn.xiaocai.demo.spider.door.baserules.BaseWebRule;
import cn.xiaocai.demo.spider.rules.*;

import java.util.Arrays;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/25 17:26
 * @version: v1.0
 */
public class FulituCc extends BaseWebRule {


    public FulituCc(String doorUrl){
        this.doorUrl = doorUrl;
    }


    @Override
    public void check() {
        checkRules();
    }

    @Override
    protected void loadRule() {
        CategoryRule categoryRule = new CategoryRule();
        categoryRule.setEleLocation("div#bs-example-navbar-collapse-1  ul.nav.navbar-nav ul.dropdown-menu li a");
        //categoryRule.setEleLocation("html.no-js body nav.navbar.navbar-default.navbar-fixed-top div.container-fluid div#bs-example-navbar-collapse-1.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown ul.dropdown-menu li > a");
        categoryRule.setSkipKeys(Arrays.asList("所有","admin/login"));
        setCategoryRule(categoryRule);

        CategoryPageRule pageListRule = new CategoryPageRule();
        pageListRule.setEleLocation("html.no-js body div.content ol.page-navigator li a");

        setCategoryPageRule(pageListRule);

        LinkGroupRule linkSetRule = new LinkGroupRule();
        linkSetRule.setEleLocation("div#masonry div.item div.item-title a");
        linkSetRule.setSkipKeys(Arrays.asList("img.reapi.cn"));
        setLinkGroupRule(linkSetRule);

        LinkGroupPageRule linkPageRule = new LinkGroupPageRule();
        linkPageRule.setEleLocation(BaseRule.NO_ELEMENT_LOCATION);
        setLinkGroupPageRule(linkPageRule);

        PicLinkRule picLinkRule = new PicLinkRule();
        picLinkRule.setImgSrcKey(BaseRule.IMG_DATA_ORIGINAL);
        picLinkRule.setEleLocation("div#masonry  div.post-item img");
        setPicLinkRule(picLinkRule);

    }
}
