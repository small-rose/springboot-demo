package cn.xiaocai.demo.jsoup.spider.data;

import lombok.Getter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ PicQueue ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 10:54
 * @Version ： 1.0
 **/
@Slf4j
public class PicQueue {

    /**
     *  pic 队列
     */
    @Getter
    private BlockingQueue<PicData> picDataQueue  = new ArrayBlockingQueue<>(500);



    /**
     * 添加元素
     */
    public void add(PicData picData) throws InterruptedException {

        picDataQueue.put(picData);
        log.info("加入新的元素，当前 picDataQueue 长度：" + picDataQueue.size());

    }


    /**
     * 添加元素
     */
    @SneakyThrows
    public void add(List<PicData> urlDataList) {
        for (PicData urlData : urlDataList) {
            picDataQueue.put(urlData);
        }
        log.info("加入新的元素，当前 picDataQueue 长度：" + picDataQueue.size());

    }


    /**
     * 获取元素
     *
     * @return
     */
    @SneakyThrows
    public PicData get() {
        PicData poll = (PicData) picDataQueue.take();
        log.info("取出 PicData 值: " + poll + " 当前 picDataQueue 长度：" + picDataQueue.size());
        return poll;
    }
}
