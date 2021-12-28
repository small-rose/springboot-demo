package cn.xiaocai.demo.spider.door.baserules;

import cn.xiaocai.demo.spider.rules.*;
import lombok.Data;
import org.springframework.util.Assert;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/25 0:03
 * @version: v1.0
 */
@Data
public abstract class BaseWebRule {

    protected String doorUrl ;
    protected String downLoadPath ;
    protected String threadNameKey = "Default";
    protected int DownloadThreadNumbers = 3;


    protected CategoryRule categoryRule ;

    protected CategoryPageRule pageListRule ;

    protected LinkGroupRule linkSetRule ;


    protected LinkGroupPageRule linkPageRule;

    protected PicLinkRule picLinkRule ;


    public BaseWebRule(){
        loadRule();
    }


    public abstract void check();


    public void checkRules(){

        Assert.hasText(doorUrl, "doorUrl is required !");
        Assert.notNull(categoryRule, "categoryRule is required !");
        Assert.notNull(pageListRule, "pageListRule is required !");
        Assert.notNull(linkSetRule, "linkSetRule is required !");
        Assert.notNull(linkPageRule, "linkPageRule is required !");
        Assert.notNull(picLinkRule, "picLinkRule is required !");
        Assert.hasText(categoryRule.getEleLocation(), "categoryRule's eleLocation is required !");
        Assert.hasText(pageListRule.getEleLocation(), "pageListRule's eleLocation is required !");
        Assert.hasText(linkSetRule.getEleLocation(), "linkSetRule's eleLocation is required !");
        Assert.notNull(linkPageRule.getEleLocation(), "linkPageRule's eleLocation is required !");
        Assert.hasText(picLinkRule.getEleLocation(), "picLinkRule's eleLocation is required !");
     }


    protected  abstract void loadRule();

}
