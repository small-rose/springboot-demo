package cn.xiaocai.demo.jsoup.spider.handler;

import cn.xiaocai.demo.jsoup.common.NetUtil;
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
    // 临时容器
    private List<Document>  tmpUrlList ;

    private Integer limitCount = 3;

    /**
     * 抓取页面
     * @param data
     */
    public Document spy(UrlData data){
        Document document = null;
        try {
            int index = 0 ;
            while (index <= limitCount && document == null) {
                document = NetUtil.getDocument(data.getUrl());

                TimeUnit.MILLISECONDS.sleep(250);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  document;
    }
}
