package cn.xiaocai.demo.jsoup.test;

import org.jsoup.nodes.Document;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/13 0:09
 * @version: v1.0
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<Document> documents  = new ArrayBlockingQueue<>(10);

        System.out.println(documents.size() );
    }
}
