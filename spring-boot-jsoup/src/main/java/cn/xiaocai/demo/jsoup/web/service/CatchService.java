package cn.xiaocai.demo.jsoup.web.service;


import org.jsoup.nodes.Document;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-06 14:21
 **/
public interface CatchService {
    /**
     *  get html
     * @param url is a web page url
     * @return Document
     */
    public Document catchHtml(String url);


    /**
     * get html content
     * @param doc
     * @return
     */
    public String catchContent(Document doc);
}
