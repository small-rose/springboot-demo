package cn.xiaocai.demo.jsoup.spider.handler;

import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.utils.NetUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;

import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:21
 * @version: v1.0
 */
@Data
@Slf4j
public class CatchHandler {

    private final Integer limitCount = 3;

    /**
     * 抓取页面
     * @param data
     */
    public Document spy(UrlData data){
        Document document  = NetUtil.getDocument(data.getUrl());
        try {
            int index = 0 ;
            while ( document == null && index <= limitCount ) {

                TimeUnit.MILLISECONDS.sleep(300);

                document = NetUtil.getDocument(data.getUrl());

                index++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  document;
    }


    /**
     * 抓取页面
     * @param data
     */
    public Document spyAsync(UrlData data){
        Document document = NetUtil.getDocument(data.getUrl());
        try {
            int index = 0 ;
            while ( document == null && index <= limitCount ) {

                TimeUnit.MILLISECONDS.sleep(300);

                document = NetUtil.getDocument(data.getUrl());

                index++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  document;
    }
}
