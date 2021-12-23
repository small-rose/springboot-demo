package cn.xiaocai.demo.jsoup.spider.handler;

import cn.xiaocai.demo.jsoup.spider.data.PicData;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.utils.RegexUtil;
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
public class UrlHandler {

    // 临时容器
    private List<UrlData>  tmpUrlList ;
    private List<PicData>  tmpPicList ;

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
        System.out.println("-----------------------");
        //System.out.println(document);
        //System.out.println("-----------------------");
        String absHref = null;
        Elements links = document.select("a");
        for (Element link : links) {
            String text = link.text();
            absHref = link.attr("abs:href");
            if (StringUtils.isEmpty(absHref) || "#".equals(absHref)){
                continue;
            }
            UrlData urlData = new UrlData();
            urlData.setUrl(absHref);
            urlData.setTag(text);

            if (RegexUtil.isEndWithImgSuffix(absHref)){
                urlData.setMedia(true);
                urlData.setPage(false);
            }else{
                urlData.setMedia(false);
                urlData.setPage(true);
            }
            log.info("add a url data : " + urlData);
            tmpUrlList.add(urlData);
        }

    }

    public List<PicData> analysisImgUrl(Document document) {
        tmpPicList = new CopyOnWriteArrayList<>();
        imgUrlHandler(document);
        return tmpPicList;
    }

    private void imgUrlHandler(Document document) {

        Elements imgTags = document.select("img[src]");
        for (Element link : imgTags) {
            String linkName = link.text();
            if(StringUtils.isEmpty(linkName) || "".equals(linkName.trim())){
                linkName = link.attr("alt");
            }

            String absHref = link.attr("abs:src");

            String urlFileName = absHref.substring(absHref.lastIndexOf("/")+1,absHref.length()-4);
            String fileName = linkName.concat(urlFileName);

            PicData urlData = new PicData();
            urlData.setUrl(absHref);
            urlData.setPicName(fileName);
            String suffix = absHref.substring(absHref.lastIndexOf("."));
            urlData.setSuffix(suffix);

            if (RegexUtil.isEndWithImgSuffix(absHref)){
                urlData.setMedia(true);
                urlData.setPage(false);
            }else{
                urlData.setMedia(false);
                urlData.setPage(true);
            }
            log.info("add a pic url data : " + urlData);
            tmpPicList.add(urlData);
        }
    }
}
