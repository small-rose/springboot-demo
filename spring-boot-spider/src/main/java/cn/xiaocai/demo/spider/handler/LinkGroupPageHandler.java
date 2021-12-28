package cn.xiaocai.demo.spider.handler;

import cn.xiaocai.demo.spider.data.LinkGroupPageQueue;
import cn.xiaocai.demo.spider.data.LinkGroupQueue;
import cn.xiaocai.demo.spider.data.UrlData;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
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
public class LinkGroupPageHandler extends BaseHandler implements BasePageHandler{

    protected final LinkGroupQueue linkGroupQueue;
    protected final LinkGroupPageQueue linkGroupPageQueue;


    private List<UrlData> pageList = new CopyOnWriteArrayList<>();



    public LinkGroupPageHandler(LinkGroupQueue linkGroupQueue, LinkGroupPageQueue linkGroupPageQueue){
        this.linkGroupQueue = linkGroupQueue;
        this.linkGroupPageQueue = linkGroupPageQueue;
        this.rule = linkGroupPageQueue.getRules() ;
    }



    @Override
    public List<UrlData> analsysUrlList(UrlData urlData) {


        List<UrlData> firstList = this.collectUrl(urlData);
        if (firstList.isEmpty()){
            return firstList ;
        }
        List result = getAllPageListUrl((ArrayList) firstList);
        log.info("--CategoryPageList--size-----" + result.size());
        return result;
     }


    @Override
    protected List<UrlData> collectUrl(UrlData urlData) {
        Document document = catchHandler.spyAsync(urlData);
        tmpUrlList = new ArrayList<>();
        boolean boolself = pageList.stream().anyMatch(t -> t.getUrl().equals(urlData.getUrl()));
        if (!boolself){
            pageList.add(urlData);
        }
        String absHref = "";
        String text = "";
        log.info("link page rule : " + rule.getEleLocation());
        Elements links = document.select(rule.getEleLocation());
        log.info("link page links : " + links.size());
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
            newData.setName(urlData.getName());
            newData.setMark(urlData.getMark());

            final String finalAbsHref = absHref;
            boolean bool = pageList.stream().anyMatch(t -> t.getUrl().equals(finalAbsHref));
            if (bool){
                continue;
            }
            log.info("add a url data : " + newData);
            pageList.add(newData);
            tmpUrlList.add(newData);
        }
        return tmpUrlList;
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
            // log.info("LinkPageList Link text :"+text +" , link = "+absHref);

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
            newUrlData.setReferer(urlData.getReferer());

            newUrlData.setMark(urlData.getMark());
            if(StringUtils.hasText(urlData.getTag())){
                newUrlData.setTag(urlData.getTag());
            }else{
                newUrlData.setTag(text);
            }
            newUrlData.setName(urlData.getName());

            log.info("add a url data : " + newUrlData);
            pageList.add(newUrlData);
            //linkPageQueue.add(newUrlData);
            collectPageListUrl(newUrlData);
        }
        log.info("LinkPageList useful links : " + pageList.size());
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
