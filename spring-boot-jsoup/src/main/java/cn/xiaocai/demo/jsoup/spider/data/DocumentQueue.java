package cn.xiaocai.demo.jsoup.spider.data;

import lombok.Getter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;

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
public class DocumentQueue {


    /**
     *  文档队列
     */
    @Getter
    private BlockingQueue<Document> documentQueue  = new ArrayBlockingQueue<>(20);


    /**
     * 添加元素
     */
    @SneakyThrows
    public void add(Document document) {
        documentQueue.put(document);
        log.info("加入了新的文档，当前 documentQueue 长度：" + documentQueue.size());
    }

    /**
     * 获取元素
     *
     * @return
     */
    @SneakyThrows
    public Document get() {

        Document poll = documentQueue.take();
        log.info("获取文档, 当前 documentQueue 长度：" + documentQueue.size());
        return poll;
    }
}
