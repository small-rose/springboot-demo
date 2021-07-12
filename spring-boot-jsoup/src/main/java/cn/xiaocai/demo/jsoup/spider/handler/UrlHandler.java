package cn.xiaocai.demo.jsoup.spider.handler;

import cn.xiaocai.demo.jsoup.spider.data.DataManager;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.utils.UrlUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 22:50
 * @version: v1.0
 */
public class UrlHandler {

    private Integer limitCount = 3;

    // 临时容器
    private List<UrlData>  tmpUrlList = null;

    /**
     * 抓取 链接
     */
    public void drawUrl(List<Document> docList){

        tmpUrlList = new CopyOnWriteArrayList<>();
        //docList = new ArrayList<>();
        //docList.addAll(DataManager.documentList);

        // DataManager.documentList.removeAll(docList);
        int index = 0 ;
        Document document = null;
        int counter = 0 ;
        System.out.println( "抓取到 [ " + docList.size() + " ] 个页面");
        while (index < docList.size()){

            try {
                document = docList.get(index);

                urlHandler(document);

                TimeUnit.MILLISECONDS.sleep(250);
                index += 1;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 提取完成之后，删除已经处理的数据
        if (index == docList.size()){
            DataManager.documentList.removeAll(docList);
            DataManager.urlDataList.addAll(tmpUrlList);
            tmpUrlList.clear();
        }
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
