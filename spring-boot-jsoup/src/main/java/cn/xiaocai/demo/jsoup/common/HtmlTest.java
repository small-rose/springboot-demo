package cn.xiaocai.demo.jsoup.common;


import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-06 14:41
 **/
public class HtmlTest {

    static final String dir = "C:\\Users\\Dell-170020\\Desktop\\";
    //static String url = "http://www.xuexi.la/xueke/708076.html";
    static String url = "http://www.xuexi.la/xueke/703349.html";

    static final String FILE_NAME = "";

    public static void main(String[] args) {
        Document document  = NetUtil.getDocument(url);
        Elements eles = document.select("#contentText");
        for (Element ele: eles) {
            String x = ele.select("p").html();
            if (x.contains("strong")){
                x = x.replaceAll("<strong>","");
                x = x.replaceAll("</strong>","");
            }
            System.out.println(x);
        }

    }
}
