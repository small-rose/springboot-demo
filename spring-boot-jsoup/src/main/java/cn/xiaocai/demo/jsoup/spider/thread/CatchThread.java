package cn.xiaocai.demo.jsoup.spider.thread;

import cn.xiaocai.demo.jsoup.spider.data.DataManager;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.handler.CatchHandler;
import cn.xiaocai.demo.jsoup.spider.handler.UrlHandler;
import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:18
 * @version: v1.0
 */
public class CatchThread implements Runnable{

    private List<UrlData>  urlList = new ArrayList<>();
    private List<Document>  docList = new ArrayList<>();

    public CatchThread(List<UrlData> door){
        this.urlList.addAll(door);
    }

    CatchHandler catchHandler ;

    @Override
    public void run() {
        // 调抓页面
        catchHandler = new CatchHandler();
        catchHandler.spy(urlList);
        // 解析页面的URL
        docList.addAll(DataManager.documentList);
        new UrlHandler().drawUrl(docList);
        urlList.addAll(DataManager.urlDataList);

        printResult();
    }

    private void printResult() {
        docList.stream().forEach(System.out::println);
        urlList.stream().forEach(System.out::println);
        DataManager.rubbishList.stream().forEach(System.out::println);
    }
}
