package cn.xiaocai.demo.jsoup.spider.catcher;

import cn.xiaocai.demo.jsoup.spider.data.DataManager;
import cn.xiaocai.demo.jsoup.spider.thread.SpiderThreadManager;
import lombok.Data;

import java.util.concurrent.TimeUnit;

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

    private long delayed ;

    private long period ;

    private TimeUnit timeUnit ;


    private SpiderThreadManager spiderThreadManager ;


    @Override
    public void init() {
        spiderThreadManager = new SpiderThreadManager();
    }

    @Override
    public void start() {
        spiderThreadManager.init(doorUrl, delayed, period, timeUnit);
    }

    @Override
    public void save() {

    }

    @Override
    public void stop() {

        DataManager.documentList.clear();
        DataManager.urlDataList.clear();
        DataManager.rubbishList.clear();
    }
}
