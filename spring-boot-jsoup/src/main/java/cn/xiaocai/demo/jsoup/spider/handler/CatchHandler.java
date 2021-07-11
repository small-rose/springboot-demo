package cn.xiaocai.demo.jsoup.spider.handler;

import cn.xiaocai.demo.jsoup.common.NetUtil;
import cn.xiaocai.demo.jsoup.spider.data.DataManager;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import lombok.Data;
import org.jsoup.nodes.Document;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:21
 * @version: v1.0
 */
@Data
public class CatchHandler {

    private Integer limitCount = 3;

    /**
     * 抓取页面
     * @param urlList
     */
    public void spy(List<UrlData> urlList){
        int index = 0 ;
        UrlData data = null;
        int counter = 0 ;
        System.out.println( "即将使用 [ " + urlList.size() + " ] 个链接...");
        while (index < urlList.size()){

            try {
                data = urlList.get(index);

                Document document = NetUtil.getDocument(data.getUrl());
                DataManager.documentList.add(document);
                //DataManager.urlDataList.remove(data);

                TimeUnit.MILLISECONDS.sleep(250);
                index += 1;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch (Exception e){
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                counter ++ ;
            }finally {
                if (limitCount <= counter){
                    counter = 0;
                    index++;
                    DataManager.rubbishList.add(data);
                }
            }
        }

        if (index == urlList.size()){
            //DataManager.urlDataList.removeAll(urlList);
        }
    }
}
