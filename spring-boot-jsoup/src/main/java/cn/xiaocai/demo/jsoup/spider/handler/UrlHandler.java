package cn.xiaocai.demo.jsoup.spider.handler;

import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.utils.UrlUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 22:50
 * @version: v1.0
 */
public class UrlHandler {

    // 临时容器
    private List<UrlData>  tmpUrlList ;

    /**
     * 抓取 链接
     * @return
     */
    public List<UrlData> drawUrl(Document document){
        tmpUrlList = new CopyOnWriteArrayList<>();
        urlHandler(document);
        return tmpUrlList;
    }

    /**
     * 解析URL 提取
     * @param document
     */
    private void urlHandler(Document document) {
        String absHref = null;
        Elements links = document.select("a");
        for (Element link : links) {
            String text = link.text();
            absHref = link.attr("abs:href");
            UrlData urlData = new UrlData();
            urlData.setUrl(absHref);
            urlData.setTag(text);

            if (UrlUtils.endsWithMedias(absHref)){
                urlData.setMedia(true);
                urlData.setPage(false);
            }else{
                urlData.setMedia(false);
                urlData.setPage(true);
            }
            tmpUrlList.add(urlData);
        }

    }

}
