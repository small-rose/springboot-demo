package cn.xiaocai.demo.jsoup.test;

import cn.xiaocai.demo.jsoup.spider.utils.HtmlUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * @program: springboot-jsoup
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-07 16:17
 **/
public class XiaoShuoTest {

    public static void main(String[] args) {
        String url = "https://weread.qq.com/web/reader/4de326a0721770aa4de95f4";
        url = "https://weread.qq.com/web/reader/4de326a0721770aa4de95f4kc4c329b011c4ca4238a0201";
        HtmlUtil htmlUtil = new HtmlUtil();
        String html = htmlUtil.getHtml(url);
        // System.out.println(html);
        Document document = Jsoup.parse(html);
        System.out.println(document);
        handlerDoc(document);
    }

    private static void handlerDoc(Document document) {


    }
}
