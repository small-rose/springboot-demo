package cn.xiaocai.demo.jsoup.test;


import cn.xiaocai.demo.jsoup.spider.utils.NetUtil;
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
    static String url_daodeyufazhi = "https://doc.docsou.com/b75dceb56dc80c10493ba132ab34f4cb12464c0f6.html";

    static final String FILE_NAME = "";

    public static void handle1(){
        String url = "http://www.xuexi.la/xueke/708076.html";
        getDocuent(url);

    }

    private static void getDocuent(String url) {
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

    public static void handle2(String url){
        Document document  = NetUtil.getDocument(url);
        Elements eles = document.select(".pages .next");
        for (Element element :eles){
            String href = element.attr("href");
            System.out.println(element);
            System.out.println(href);
        }
        for (Element ele: eles) {
            String x = ele.select("p").html();
            if (x.contains("strong")){
                x = x.replaceAll("<strong>","");
                x = x.replaceAll("</strong>","");
            }
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        handle2(url_daodeyufazhi);
    }


}
