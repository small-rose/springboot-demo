package cn.xiaocai.demo.spider.test;

import cn.xiaocai.demo.spider.data.UrlData;
import cn.xiaocai.demo.spider.handler.CatchHandler;
import org.jsoup.nodes.Document;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/9 18:06
 * @version: v1.0
 */
public class UrlTest {


    public static void main(String[] args) {
        UrlData urlData = new UrlData();
        urlData.setUrl("https://www.ligui.org/ligui/3_2.html");
        urlData.setReferer("https://www.ligui.org");
        Document doc = new CatchHandler().spy(urlData);
        System.out.println(doc);

    }
}
