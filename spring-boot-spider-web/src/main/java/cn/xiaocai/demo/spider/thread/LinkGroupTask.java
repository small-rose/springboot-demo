package cn.xiaocai.demo.spider.thread;

import cn.xiaocai.demo.spider.data.CategoryPageQueue;
import cn.xiaocai.demo.spider.data.LinkGroupQueue;
import cn.xiaocai.demo.spider.data.UrlData;
import cn.xiaocai.demo.spider.handler.LinkGroupHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：  第三步 提取每页图片组的图片组链接
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:18
 * @version: v1.0
 */
@Slf4j
public class LinkGroupTask extends LinkGroupHandler implements Runnable{

    private String threadName ;

    public LinkGroupTask(CategoryPageQueue pageListQueue, LinkGroupQueue linkGroupQueue){
        super(pageListQueue, linkGroupQueue);
        this.threadName = "-".concat(linkGroupQueue.getClass().getSimpleName());
     }

    @Override
    public void run()  {


        UrlData urlData = null;
        while ( (urlData = pageListQueue.get()) != null){

            try {
                if (IS_MARK) {
                    //数据标记
                    urlData.setMark(urlData.getMark().concat(threadName));
                }
                execute(urlData);

                log.info("分类的分页的抓取剩余 ："+pageListQueue.size());

                TimeUnit.MINUTES.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
     }

    @Override
    protected void execute(UrlData urlData) {


        List<UrlData> dataList = this.analsysUrlList( urlData);

        linkGroupQueue.add(dataList);
        linkGroupQueue.print();

    }
}
