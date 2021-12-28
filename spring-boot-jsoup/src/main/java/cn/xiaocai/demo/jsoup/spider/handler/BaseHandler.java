package cn.xiaocai.demo.jsoup.spider.handler;

import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.rules.BaseRule;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/24 21:25
 * @version: v1.0
 */
@Slf4j
public abstract class BaseHandler<T> {


    protected CatchHandler catchHandler = new CatchHandler();

    protected BaseRule rule ;
    // 临时容器
    protected List<UrlData>  tmpUrlList ;

    protected void init(BaseRule rule){
        this.rule = rule ;
    }


    public abstract List<UrlData> analsysUrlList(UrlData urlData);

     /**
     * 提取链接
     * @param urlData
     * @return
     */
    protected List<UrlData> collectUrl(UrlData urlData){

        Document document = catchHandler.spyAsync(urlData);
        tmpUrlList = new ArrayList<UrlData>();
        String text = "";
        String absHref = "";
        log.info("rule : " + rule.getEleLocation());
        Elements links = document.select(rule.getEleLocation());
        log.info("links : " + links.size());
        UrlData newData = null;
        for (Element link : links) {
            text = link.text();
            absHref = link.attr(rule.getLinkHrefKey());
            log.info("link text :"+text +" , link = "+absHref);

            if (StringUtils.isEmpty(absHref) || "#".equals(absHref)){
                continue;
            }

            if (skipRules(absHref, text)){
                continue;
            }
            newData = new UrlData();
            newData.setReferer(urlData.getReferer());
            newData.setUrl(absHref);

            if(StringUtils.hasText(urlData.getTag())){
                newData.setTag(urlData.getTag());
            }else{
                newData.setTag(text);
            }
            newData.setName(text);
            newData.setMark(urlData.getMark());

            final String finalAbsHref = absHref;
            boolean bool = tmpUrlList.stream().anyMatch(t -> t.getUrl().equals(finalAbsHref));
            if (bool){
                 continue;
            }
            log.info("add a url data : " + newData);
            tmpUrlList.add(newData);
        }
        return tmpUrlList;
    }

    /**
     * 链接过滤规则
     * @param absHref
     * @param text
     * @return
     */
    protected abstract boolean skipRules(String absHref, String text);


    /**
     * 执行处理
     * @param urlData
     * @return
     */
    protected abstract void execute(UrlData urlData);
}
