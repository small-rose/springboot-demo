package cn.xiaocai.demo.jsoup.spider.catcher;

import cn.xiaocai.demo.jsoup.spider.data.DocumentQueue;
import cn.xiaocai.demo.jsoup.spider.data.PicQueue;
import cn.xiaocai.demo.jsoup.spider.data.UrlDataQueue;
import cn.xiaocai.demo.jsoup.spider.thread.SpiderThreadManager;
import lombok.Data;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:07
 * @version: v1.0
 */
@Data
public class SpiderServer implements Server {
    /**
     * 编号
     */
    private Integer id;
    /**
     * 别名
     */
    private String name;

    /**
     * 洞口
     */
    private String doorUrl ;

    /**
     * 图片下载线程数
     */
    private int downloadThreadNumbers = 3;

    private SpiderThreadManager spiderThreadManager ;


    @Override
    public void init() {

        spiderThreadManager = SpiderThreadManager.getInstance();
        spiderThreadManager.setDocumentQueue(new DocumentQueue());
        spiderThreadManager.setUrlDataQueue(new UrlDataQueue());
        spiderThreadManager.setPicQueue(new PicQueue());
        spiderThreadManager.setDownThreadNum(this.downloadThreadNumbers);
    }

    @Override
    public void start() {
        spiderThreadManager.start(doorUrl);
    }

    @Override
    public void save() {

    }

    @Override
    public void stop() {

        spiderThreadManager.stop();
    }
}
