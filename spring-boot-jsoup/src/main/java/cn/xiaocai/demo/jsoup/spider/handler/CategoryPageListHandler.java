package cn.xiaocai.demo.jsoup.spider.handler;

import cn.xiaocai.demo.jsoup.spider.data.CategoryQueue;
import cn.xiaocai.demo.jsoup.spider.data.PageListQueue;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/24 21:25
 * @version: v1.0
 */
@Slf4j
public class CategoryPageListHandler extends BaseHandler implements BasePageHandler {


    protected  CategoryQueue categoryQueue ;

    protected  PageListQueue pageListQueue ;

    private static List<UrlData> pageList ;


    public CategoryPageListHandler(CategoryQueue categoryQueue, PageListQueue pageListQueue){
        this.categoryQueue = categoryQueue ;
        this.pageListQueue = pageListQueue ;
        this.rule = pageListQueue.getRules() ;
    }


    @Override
    public List<UrlData> analsysUrlList(UrlData urlData) {
        pageList = new ArrayList<>();
        //List<UrlData> firstList = this.collectUrl(doc);
        //List result = getAllPageListUrl((ArrayList) firstList);
        //log.info("--CategoryPageList--size-----" + result.size());
        //pageListQueue.print();
        //return result;
        return null;
    }



    public List<UrlData> getAllPageListUrl(UrlData urlData) {
        pageList = new ArrayList<>();

        log.info("get page for all list ------------ " + urlData);
        this.collectPageListUrl(urlData);


        pageList = (ArrayList<UrlData>) pageList.stream().filter(distinctByKey(b -> b.getUrl())).collect(Collectors.toList());
        log.info("--All CategoryPageList Size-----" + pageList.size());

        return  pageList;
    }

    @Override
    public List<UrlData> collectPageListUrl(UrlData urlData) {
        boolean boolself = pageList.stream().anyMatch(t -> t.getUrl().equals(urlData.getUrl()));
        if (!boolself){
            pageList.add(urlData);
        }

        Document document = catchHandler.spyAsync(urlData);
        String text = "";
        String absHref = "";

        log.info("category  rule : " + rule.getEleLocation());
        Elements links = document.select(rule.getEleLocation());
        log.info("category links : " + links.size());

        UrlData newUrlData = null;
        for (Element link : links) {
            text = link.text();
            absHref = link.attr(rule.getLinkHrefKey());
            //log.info("link text :"+text +" , link = "+absHref);

            final String finalAbsHref = absHref;
            boolean bool = pageList.stream().anyMatch(t -> t.getUrl().equals(finalAbsHref));
            if (bool){
                continue;
            }
            if (StringUtils.isEmpty(absHref) || "#".equals(absHref)){
                continue;
            }
            if (skipRules(absHref, text)){
                continue;
            }
            newUrlData = new UrlData();
            newUrlData.setReferer(urlData.getReferer());
            newUrlData.setUrl(absHref);
            newUrlData.setName(text);
            newUrlData.setMark(urlData.getMark());

            if (StringUtils.hasText(urlData.getName())){
                newUrlData.setTag(urlData.getName());
            }

            log.info("add a url data : " + newUrlData);
            pageList.add(newUrlData); //pageList 用来结束迭代
            //pageListQueue.print();
            //pageListQueue.add(newUrlData); // 用来进行下一个流程处理
            collectPageListUrl(newUrlData);
        }

        return pageList;
    }

    /**
     * List 对象 按属性去重复
     * @param keyExtractor
     * @param <T>
     * @return
     */
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


    @Override
    protected boolean skipRules(String absHref, String text) {

        boolean skip = false;
        if (rule.getSkipKeys() != null) {
            // 文本关键词过滤 过滤
            for (String key : rule.getSkipKeys()) {
                if (text.contains(key)) {
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
