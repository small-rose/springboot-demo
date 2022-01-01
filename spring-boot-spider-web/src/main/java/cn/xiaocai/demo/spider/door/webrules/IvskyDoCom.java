package cn.xiaocai.demo.spider.door.webrules;


import cn.xiaocai.demo.spider.door.baserules.BaseWebRule;
import cn.xiaocai.demo.spider.rules.*;
import lombok.Data;

import java.util.Arrays;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/25 0:01
 * @version: v1.0
 */
@Data
public class IvskyDoCom extends BaseWebRule {


    public IvskyDoCom(String doorUrl){
        this.doorUrl = doorUrl;
     }


    @Override
    public void check() {
        checkRules();
    }

    @Override
    protected void loadRule() {
        CategoryRule categoryRule = new CategoryRule();
        //categoryRule.setEleLocation("ul.bzmenu > li > a");
        categoryRule.setEleLocation(BaseRule.NO_ELEMENT_LOCATION);
        categoryRule.setSkipKeys( Arrays.asList("所有"));
        setCategoryRule(categoryRule);

        CategoryPageRule categoryPageRule = new CategoryPageRule();
        categoryPageRule.setEleLocation("div.pagelist  > a");
        setCategoryPageRule(categoryPageRule);

        LinkGroupRule linkSetRule = new LinkGroupRule();
        linkSetRule.setEleLocation("ul.il > li > p > a");
        setLinkGroupRule(linkSetRule);

        LinkGroupPageRule linkPageRule = new LinkGroupPageRule();
        linkPageRule.setEleLocation("div#pic_btm > a");
        setLinkGroupPageRule(linkPageRule);

        PicLinkRule picLinkRule = new PicLinkRule();
        picLinkRule.setEleLocation("img#imgis");
        setPicLinkRule(picLinkRule);
    }
}
