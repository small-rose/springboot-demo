package cn.xiaocai.demo.spider.thread;

import cn.xiaocai.demo.spider.data.CategoryQueue;
import cn.xiaocai.demo.spider.data.UrlData;
import cn.xiaocai.demo.spider.handler.CategoryHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @description: TODO 功能角色说明：  第一步 提取分类 [可省 ]
 * TODO 描述： 提取分类链接，也可以不提取
 * @author: 张小菜
 * @date: 2021/12/24 21:31
 * @version: v1.0
 */
@Slf4j
public class CategoryTask extends CategoryHandler implements Runnable {

    private String threadName ;

    private UrlData urlData ;

    public CategoryTask(UrlData urlData , CategoryQueue categoryQueue){
        super(categoryQueue);
        this.urlData = urlData;
        this.threadName = "-".concat(categoryQueue.getClass().getSimpleName());

    }

    @Override
    public void run() {
         if (urlData !=null){
             //categoryQueue.add(urlData);
             try {
                 urlData.setMark(threadName);
                 execute(urlData);
             }catch (Exception e){
                 e.printStackTrace();
             }
        }else {
             log.info("---------urlData is null ");
         }
    }

    @Override
    protected void execute(UrlData urlData) {



            // 将抓取到的页面放到 文档 队列
            List<UrlData> dataList = this.analsysUrlList(urlData);

            log.info("CategoryTask 本次抓取分类数量：" +dataList);
            categoryQueue.add(dataList);
            categoryQueue.print();

    }
}
