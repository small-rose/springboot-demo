package cn.xiaocai.js.data.jszt;

import cn.xiaocai.js.data.uitl.NetUtil;
import com.alibaba.fastjson.JSONObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ WenYouHuiSpiderTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/8/1 17:49
 * @Version ： 1.0
 **/
public class WenYouHuiSpiderTest {

    String URL = "https://www.jianshu.com/c/57cc936b828b";
    String REFERURL = "https://www.jianshu.com/";
    String URL_wen = "https://www.jianshu.com/p/57cc936b828b";
    String URL_zan = "https://www.jianshu.com/shakespeare/notes/${noteId}/comments?page=1&count=100&author_only=false&order_by=desc";


    @Test
    public void test_(){
        String url = "https://www.jianshu.com/p/a3e1f33b787e";
        Document document = NetUtil.getDocument(url, REFERURL);
        System.out.println(document);
        Elements cList = document.select("._1OhGeD");
        for (Element c :cList) {
            String nickName = c.text();
            System.out.println(" nickName " + nickName);
        }
    }

    @Test
    public void test_33() throws UnirestException {

        Document document = NetUtil.getDocument(URL, REFERURL);
        Elements cList = document.select(".note-list > li");
        for (Element c :cList){
            String id = c.attr("data-note-id");
            String title = c.select(".title").text();
            String nickname = c.select(".nickname").text();
            String abstractDesc = c.select(".abstract").text();
            URL_zan = URL_zan.replace("${noteId}", id);
            GetRequest getRequest = Unirest.get(URL_zan);
            HttpResponse<String> stringResult = getRequest.asString();
            int status = stringResult.getStatus();
            System.out.println("Status: " + status);
            //System.out.println("StatusText: " +stringResult.getStatusText());
            //System.out.println("Headers: " +stringResult.getHeaders());
            String body = stringResult.getBody();
            JSONObject responseJson = JSONObject.parseObject(body);
            List<Object> respDate = (List<Object>) responseJson.get("comments");

            System.out.println("id  = " + id);
            System.out.println("title = " + title);
            System.out.println("nickname = " + nickname);
            System.out.println("abstractDesc = " + abstractDesc);
            System.out.println("zanJson = " + responseJson.toJSONString());
        }
        
        System.out.println(document);
    }
}
