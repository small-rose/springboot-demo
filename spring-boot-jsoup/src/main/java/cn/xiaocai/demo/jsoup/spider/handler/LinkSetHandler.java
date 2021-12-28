package cn.xiaocai.demo.jsoup.spider.handler;

import cn.xiaocai.demo.jsoup.spider.data.LinkSetQueue;
import cn.xiaocai.demo.jsoup.spider.data.PageListQueue;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.rules.BaseRule;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 22:50
 * @version: v1.0
 */
@Slf4j
public class LinkSetHandler extends BaseHandler{



    protected final PageListQueue pageListQueue ;

    protected final LinkSetQueue linkSetQueue ;

    // 临时容器
    private List<UrlData>  tmpUrlList = new CopyOnWriteArrayList<>(); ;


    private BaseRule rule ;

    public LinkSetHandler(PageListQueue pageListQueue, LinkSetQueue linkSetQueue){
        this.pageListQueue = pageListQueue ;
        this.linkSetQueue = linkSetQueue ;
        this.rule = linkSetQueue.getRules() ;
    }

    /**
     * 抓取 链接
     * @return
     */
    public List<UrlData> drawUrl(Document document, UrlData urlData){
        tmpUrlList.clear();
        urlHandler(document, urlData);
        return tmpUrlList;
    }

    /**
     * 解析URL 提取
     * @param document
     */
    private void urlHandler(Document document, UrlData paraData) {
        System.out.println("-----------------------");

        String absHref = null;
        log.info("图组rule : " + rule.getEleLocation());
        Elements links = document.select(rule.getEleLocation());
        log.info("图组links : " + links.size());
        for (Element link : links) {
            String text = link.text();
            absHref = link.attr(rule.getLinkHrefKey());
            //log.info("图组Link text :"+text +" , link = "+absHref);
            if (StringUtils.isEmpty(absHref) || "#".equals(absHref)){
                continue;
            }

            if (skipRules(absHref, text)){
                continue;
            }

            UrlData urlData = new UrlData();
            urlData.setUrl(absHref);
            urlData.setMark(paraData.getMark());
            urlData.setName(text);
            urlData.setTag(text);
            if (paraData!=null) {
                urlData.setTag(paraData.getTag());
            }


            log.info("linkSetQueue 加入 图组 data : " + urlData);
            tmpUrlList.add(urlData);
            //linkSetQueue.print();
            //linkSetQueue.add(urlData);
        }

    }



    @Override
    public List<UrlData> analsysUrlList(UrlData urlData) {
        Document doc = catchHandler.spy(urlData);
        return drawUrl(doc, urlData);
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
        }
        return skip;
    }

    @Override
    protected void execute(UrlData urlData) {

    }


}
