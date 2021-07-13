package cn.xiaocai.demo.jsoup.spider.data;

import lombok.Getter;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/13 0:01
 * @version: v1.0
 */

public class UrlDataQueue {

    /**
     * 锁
     */
    private Object lock = new Object();

    /**
     *  文档队列
     */
    @Getter
    private Queue<UrlData>  urlDataQueue  = new ArrayBlockingQueue<>(100);

    /**
     * 队列的最大长度
     */
    private final static int maxLength = 100;
    /**
     * 元素
     */
    private Integer i = 0;


    /**
     * 添加元素
     */
    public void add(UrlData document) {
        while (true) {
            // 需要加锁的代码
            synchronized (lock) {

                // 判断队列的队列
                if (urlDataQueue.size() == maxLength) {
                    System.out.println("队列已满请等待！");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("队列满了当前 urlDataQueue 长度：" + urlDataQueue.size());
                        lock.notifyAll();
                    }
                } else {
                    urlDataQueue.add(document);
                    System.out.println("加入新的元素，当前 urlDataQueue 长度：" + urlDataQueue.size());
                    lock.notifyAll();
                    break;
                }
            }
        }
    }


    /**
     * 添加元素
     */
    public void add(List<UrlData> urlDataList) {
        while (true) {
            // 需要加锁的代码
            synchronized (lock) {
                // 如果一次放的进就一次性放进去
                if ( (maxLength - urlDataQueue.size()) > urlDataList.size()){
                    urlDataQueue.addAll(urlDataList);
                    break;
                }
                // 依次放
                for (UrlData urlData : urlDataList) {
                    // 判断队列的队列
                    if (urlDataQueue.size() >= maxLength) {
                        System.out.println("队列已满请等待！");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            System.out.println("队列满了当前 urlDataQueue 长度：" + urlDataQueue.size());
                            lock.notifyAll();
                        }
                    } else {
                        urlDataQueue.add(urlData);
                        System.out.println("加入新的元素，当前 urlDataQueue 长度：" + urlDataQueue.size());
                        lock.notifyAll();
                        break;
                    }
                }
            }
        }
    }


    /**
     * 获取元素
     *
     * @return
     */
    public UrlData get() {

        while (true) {
            synchronized (lock) {
                if (urlDataQueue.size() <= 0) {
                    System.out.println("没有元素请等待");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("队列空了当前list长度：" + urlDataQueue.size());
                        lock.notifyAll();
                    }
                } else {

                    UrlData poll = urlDataQueue.poll();
                    System.out.println("移除obj值: " + poll +" 当前 urlDataQueue 长度：" + urlDataQueue.size());
                    lock.notifyAll();
                    return poll;
                }
            }
        }

    }
}
