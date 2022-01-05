package cn.xiaocai.demo.spider.data;

import cn.xiaocai.demo.spider.rules.BaseRule;
import cn.xiaocai.demo.spider.rules.PicLinkRule;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Stream;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ PicQueue ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 10:54
 * @Version ： 1.0
 **/

@Slf4j
@Component
@Scope("prototype")
public class PicLinkQueue {

    @Setter
    private PicLinkRule rule;

    /**
     * pic 队列
     */
    private final BlockingQueue<PicData> queue = new ArrayBlockingQueue<>(200,true);


    /**
     * 添加元素
     */
    public void add(PicData picData)  {

        try {
            queue.put(picData);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * 添加元素
     */
    public void add(List<PicData> urlDataList) {
        for (PicData urlData : urlDataList) {
            try {
                queue.put(urlData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 获取元素
     *
     * @return
     */
    public PicData take1() {
        PicData poll = null;
        try {
            poll =  queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("取出 PicData 值: " + poll );
        return poll;
    }

    /**
     * 获取元素
     *
     * @return
     */
    public PicData poll() {
        PicData poll = null;
        poll =  queue.poll();
        log.info("取出 PicData 值: " + poll );
        return poll;
    }
    public BaseRule getRules() {
        return rule;
    }


    public int size() {
        return  queue.size();
    }


    public void print() {
        System.out.println("============= PicLinkQueue size ================="+ queue.size());
        Stream.iterate(0, i -> i + 1).limit(queue.size()).forEach(i -> {
            System.out.println("[ Pic Link ] No.".concat(String.valueOf(i)).concat(" ") + queue.stream().toArray()[i]);
        });
        System.out.println("=================================================");

    }
}
