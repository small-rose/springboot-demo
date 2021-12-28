package cn.xiaocai.demo.jsoup.spider.door.baserules;

import cn.xiaocai.demo.jsoup.spider.rules.*;
import lombok.Data;
import tk.mybatis.mapper.util.Assert;

import javax.validation.constraints.NotNull;

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

    @NotNull
    protected CategoryRule categoryRule ;
    @NotNull
    protected CatePageListRule pageListRule ;
    @NotNull
    protected LinkSetRule linkSetRule ;

    @NotNull
    protected LinkPageRule linkPageRule;
    @NotNull
    protected PicLinkRule picLinkRule ;


    public BaseWebRule(){
        loadRule();
    }


    public abstract void check();


    public void checkRules(){

        Assert.notEmpty(doorUrl, "doorUrl is required !");
        Assert.notNull(categoryRule, "categoryRule is required !");
        Assert.notNull(pageListRule, "pageListRule is required !");
        Assert.notNull(linkSetRule, "linkSetRule is required !");
        Assert.notNull(linkPageRule, "linkPageRule is required !");
        Assert.notNull(picLinkRule, "picLinkRule is required !");
        Assert.notEmpty(categoryRule.getEleLocation(), "categoryRule's eleLocation is required !");
        Assert.notEmpty(pageListRule.getEleLocation(), "pageListRule's eleLocation is required !");
        Assert.notEmpty(linkSetRule.getEleLocation(), "linkSetRule's eleLocation is required !");
        Assert.notNull(linkPageRule.getEleLocation(), "linkPageRule's eleLocation is required !");
        Assert.notEmpty(picLinkRule.getEleLocation(), "picLinkRule's eleLocation is required !");
     }


    protected  abstract void loadRule();

}
