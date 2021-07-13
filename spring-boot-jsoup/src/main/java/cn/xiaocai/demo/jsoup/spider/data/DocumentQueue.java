package cn.xiaocai.demo.jsoup.spider.data;

import lombok.Getter;
import org.jsoup.nodes.Document;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/13 0:01
 * @version: v1.0
 */
public class DocumentQueue {

    /**
     * 锁
     */
    private Object lock = new Object();

    /**
     *  文档队列
     */
    @Getter
    private Queue<Document>  documentQueue  = new ArrayBlockingQueue<>(10);

    /**
     * 队列的最大长度
     */
    private final static int maxLength = 10;
    /**
     * 元素
     */
    private Integer i = 0;


    /**
     * 添加元素
     */
    public void add(Document document) {
        while (true) {
            // 需要加锁的代码
            synchronized (lock) {

                // 判断队列的队列
                if (documentQueue.size() == maxLength) {
                    System.out.println("队列已满请等待！");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("队列满了当前list长度：" + documentQueue.size());
                        lock.notifyAll();
                    }
                } else {
                    documentQueue.add(document);
                    System.out.println("加入新的元素，当前list长度：" + documentQueue.size());
                    lock.notifyAll();
                    break;
                }
            }
        }
    }

    /**
     * 获取元素
     *
     * @return
     */
    public Document get() {

        while (true) {
            synchronized (lock) {
                if (documentQueue.size() <= 0) {
                    System.out.println("没有元素请等待");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("队列空了当前list长度：" + documentQueue.size());
                        lock.notifyAll();
                    }
                } else {

                    Document poll = documentQueue.poll();
                    System.out.println("移除obj值: " + poll +" 当前list长度：" + documentQueue.size());
                    lock.notifyAll();
                    return poll;
                }
            }
        }

    }
}
