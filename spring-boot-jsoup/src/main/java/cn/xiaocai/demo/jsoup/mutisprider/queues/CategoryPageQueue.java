package cn.xiaocai.demo.jsoup.mutisprider.queues;

import cn.xiaocai.demo.jsoup.mutisprider.data.LinkData;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ CategoryQueue ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/27 14:29
 * @Version ： 1.0
 **/
@Data
@Slf4j
public class CategoryPageQueue {

    private final BlockingQueue<LinkData> queue = new ArrayBlockingQueue<LinkData>(10, true);

    public void put(LinkData linkData){
        try {
            queue.put(linkData);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public LinkData take() {
        LinkData linkData = null;
        try {

            log.info("CategoryPageQueue size : " + queue.size());
            linkData = queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return linkData;
    }

    public int size() {
        return queue.size();
    }
}
