package cn.xiaocai.demo.jsoup.spider.handler;

import cn.xiaocai.demo.jsoup.spider.data.LinkPageQueue;
import cn.xiaocai.demo.jsoup.spider.data.LinkSetQueue;
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
 * @date: 2021/7/11 22:50
 * @version: v1.0
 */
@Slf4j
public class LinkPageListHandler extends BaseHandler implements BasePageHandler{

    protected final LinkSetQueue linkSetQueue ;
    protected final LinkPageQueue linkPageQueue ;


    private List<UrlData> pageList ;



    public LinkPageListHandler(LinkSetQueue linkSetQueue, LinkPageQueue linkPageQueue){
        this.linkSetQueue = linkSetQueue ;
        this.linkPageQueue = linkPageQueue ;
        this.rule = linkPageQueue.getRules() ;
    }



    @Override
    public List<UrlData> analsysUrlList(UrlData urlData) {

        pageList = new ArrayList<>();
        List<UrlData> firstList = this.collectUrl(urlData);
        if (firstList.isEmpty()){
            return firstList ;
        }
        List result = getAllPageListUrl((ArrayList) firstList);
        log.info("--CategoryPageList--size-----" + result.size());
        return result;
     }




    public List<UrlData> getAllPageListUrl(ArrayList<UrlData> list) {

        if (list.isEmpty()){
            return list;
        }
        for (UrlData data : list){
            this.collectPageListUrl(data);
        }
        list.addAll(pageList);
        list = (ArrayList<UrlData>) list.stream().filter(distinctByKey(b -> b.getUrl())).collect(Collectors.toList());
        System.out.println("linkPageList all------------" + list.size());
        pageList.clear();
        return  list;
    }

    @Override
    public List<UrlData> collectPageListUrl(UrlData urlData)  {

        boolean boolself1 = pageList.stream().anyMatch(t -> t.getUrl().equals(urlData.getUrl()));
        if (!boolself1){
            pageList.add(urlData);
        }

        Document document = catchHandler.spyAsync(urlData);
        String text = "";
        String absHref = "";

        log.info("LinkPageList rule : " + rule.getEleLocation());
        Elements links = document.select(rule.getEleLocation());
        log.info("LinkPageList links : " + links.size());

        UrlData newUrlData = null;

        for (Element link : links) {
            text = link.text();
            absHref = link.attr(rule.getLinkHrefKey());
            log.info("LinkPageList Link text :"+text +" , link = "+absHref);

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
            newUrlData.setUrl(absHref);
            newUrlData.setTag(urlData.getTag());
            newUrlData.setMark(urlData.getMark());
            newUrlData.setName(urlData.getTag());
            log.info("add a url data : " + newUrlData);
            pageList.add(newUrlData);
            //linkPageQueue.add(newUrlData);
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
        boolean skip = false ;
        if (rule.getSkipKeys()!=null){
            // 链接关键词过滤 过滤
            for (String key : rule.getSkipKeys()){
                if (absHref.contains(key)){
                    skip = true;;
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

    }
}
