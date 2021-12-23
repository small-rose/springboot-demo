package cn.xiaocai.demo.jsoup.spider.data;

import lombok.Getter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/13 0:01
 * @version: v1.0
 */
@Slf4j
public class UrlDataQueue {


    /**
     *  url队列
     */
    @Getter
    private BlockingQueue<UrlData>  urlDataQueue  = new ArrayBlockingQueue<>(100);


    /**
     * 添加元素
     */
    @SneakyThrows
    public void add(UrlData document) {

        urlDataQueue.add(document);
        log.info("加入新的元素，当前 urlDataQueue 长度：" + urlDataQueue.size());

    }


    /**
     * 添加元素
     */
    @SneakyThrows
    public void add(List<UrlData> urlDataList)  {
         for (UrlData urlData : urlDataList) {
             urlDataQueue.put(urlData);
             log.info("加入新的 UrlData ，当前 urlDataQueue 长度：" + urlDataQueue.size());
         }
    }


    /**
     * 获取元素
     *
     * @return
     */
    @SneakyThrows
    public UrlData get() {
        UrlData poll = urlDataQueue.take();
        log.info("移除 UrlData 值: " + poll + " 当前 urlDataQueue 长度：" + urlDataQueue.size());
        return poll;

    }
}
