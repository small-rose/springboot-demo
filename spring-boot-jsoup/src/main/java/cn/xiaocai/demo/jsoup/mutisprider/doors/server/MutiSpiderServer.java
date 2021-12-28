package cn.xiaocai.demo.jsoup.mutisprider.doors.server;

import cn.xiaocai.demo.jsoup.mutisprider.queues.CategoryPageQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.CategoryQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.LinkGroupPageQueue;
import cn.xiaocai.demo.jsoup.mutisprider.queues.LinkGroupQueue;
import cn.xiaocai.demo.jsoup.mutisprider.threads.ThreadsManager;
import lombok.Data;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:07
 * @version: v1.0
 */
@Data
public class MutiSpiderServer implements Server {

    /**
     * 入口
     */
    private String doorUrl ;


    private ThreadsManager threadsManager ;


    @Override
    public void init() {

        threadsManager = ThreadsManager.getInstance();
        threadsManager.setCategory(new CategoryQueue());
        threadsManager.setCategoryPage(new CategoryPageQueue());
        threadsManager.setLinkGroup(new LinkGroupQueue());
        threadsManager.setLinkGroupPage(new LinkGroupPageQueue());
    }

    @Override
    public void start() {
        init();
        threadsManager.start(doorUrl);
    }


    @Override
    public void stop() {

        threadsManager.stop();
    }
}
