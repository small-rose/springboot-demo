package cn.xiaocai.demo.spider.handler;

import cn.xiaocai.demo.spider.data.CategoryQueue;
import cn.xiaocai.demo.spider.data.UrlData;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/24 21:25
 * @version: v1.0
 */
@Slf4j
public class CategoryHandler extends BaseHandler{

    protected final CategoryQueue categoryQueue ;



    public CategoryHandler(CategoryQueue categoryQueue){
        this.categoryQueue = categoryQueue ;
        this.rule = categoryQueue.getRules() ;
    }

    @Override
    public List<UrlData> analsysUrlList(UrlData urlData) {
        return this.collectUrl(urlData);
    }

    @Override
    protected boolean skipRules(String absHref, String text) {
        boolean skip = false ;
        if (rule.getSkipKeys()!=null){
            // 文本关键词过滤 过滤
            for (String key : rule.getSkipKeys()){
                if (absHref.contains(key)){
                    skip = true;
                    break;
                }
            }
            // 文本关键词过滤 过滤
            for (String key : rule.getSkipKeys()){
                if (text.contains(key)){
                    skip = true;
                    break;
                }
            }
        }
        return skip;
    }

    @Override
    protected void execute(UrlData urlData) {
        log.info("xxxxxxxxxx 不应该被执行的 xxxxxxxxxx");
    }


}
