package cn.xiaocai.demo.spider.data;

import cn.xiaocai.demo.spider.rules.BaseRule;
import cn.xiaocai.demo.spider.rules.CategoryRule;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Stream;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/13 0:01
 * @version: v1.0
 */
@Slf4j
@Component
@Scope("prototype")
public class CategoryQueue {


    @Setter
    private CategoryRule categoryRule ;


    private final BlockingQueue<UrlData> queue  = new ArrayBlockingQueue<>(50, true);


    /**
     * 添加元素
     */
    public void add(UrlData urlData) {
        try {
            queue.put(urlData);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * 添加元素
     */
     public void add(List<UrlData> urlDataList) {
        for (UrlData urlData : urlDataList){
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
    public UrlData get() {

        UrlData poll = null;
        try {
            poll = queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("获取分类 ：" + poll);
        return poll;
    }

    public BaseRule getRules() {
        return  categoryRule ;
    }

    public int size() {
        return  queue.size();
    }


    public void print(){
        System.out.println("=============CategoryQueue size ================="+size());
        Stream.iterate(0, i -> i + 1).limit(queue.size()).forEach(i -> {
            System.out.println("No.".concat(String.valueOf(i)).concat(" ") + queue.stream().toArray()[i]);
        });

        System.out.println("=================================================");

    }
}
