package cn.xiaocai.demo.jsoup.spider.data;

import lombok.Data;
import org.jsoup.nodes.Document;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:32
 * @version: v1.0
 */
@Data
public class DataManager {

    /**
     * 抓取到的页面
     */
    public static final List<Document> documentList = new CopyOnWriteArrayList<>();


    /**
     * 从页面提取到的全部 URL
     */
    public static final List<UrlData>  urlDataList = new CopyOnWriteArrayList<>();


    /**
     * 从页面提取到的 垃圾 URL
     */
    public static final List<UrlData>  rubbishList = new CopyOnWriteArrayList<>();

}
