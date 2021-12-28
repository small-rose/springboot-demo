package cn.xiaocai.demo.jsoup.spider.data;

import cn.xiaocai.demo.jsoup.spider.rules.BaseRule;
import cn.xiaocai.demo.jsoup.spider.rules.LinkPageRule;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

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
public class LinkPageQueue {

    @Setter
    private LinkPageRule rule ;


    private final BlockingQueue<UrlData>  queue  = new ArrayBlockingQueue<>(200,true);


    /**
     * 添加元素
     */

     public void add(UrlData document) {

         try {
             queue.put(document);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    }


    /**
     * 添加元素
     */

    public void add(List<UrlData> urlDataList)  {
         for (UrlData urlData : urlDataList) {
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
         log.info("移除 图组分页 值: " + poll );
        return poll;

    }



    public BaseRule getRules() {
        return  rule ;
    }

    public int size() {
        return  queue.size();
    }

    
    public void print(){
        System.out.println("=============LinkPageQueue size ================="+queue.size());

        Stream.iterate(0, i -> i + 1).limit(queue.size()).forEach(i -> {
            System.out.println("[ LinkPageQueue ] No.".concat(String.valueOf(i)).concat(" ") + queue.stream().toArray()[i]);

        });

        System.out.println("=================================================");

    }
}
