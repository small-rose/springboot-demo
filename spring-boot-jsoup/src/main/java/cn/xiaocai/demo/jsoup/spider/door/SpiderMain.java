package cn.xiaocai.demo.jsoup.spider.door;

import cn.xiaocai.demo.jsoup.spider.catcher.SpiderServer;

import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 22:52
 * @version: v1.0
 */
public class SpiderMain {


    /**
     * 蜘蛛启动入口
     * @param args
     */
    public static void main(String[] args) {
        SpiderServer server = new SpiderServer();
        server.setId(1);
        server.setName("zzy");
        server.setDoorUrl("https://zhangxiaocai.cn");
        server.init();
        server.start();

    }
}