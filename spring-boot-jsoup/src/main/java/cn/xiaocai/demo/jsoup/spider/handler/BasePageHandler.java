package cn.xiaocai.demo.jsoup.spider.handler;

import cn.xiaocai.demo.jsoup.spider.data.UrlData;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/25 20:05
 * @version: v1.0
 */
public interface BasePageHandler {

    /**
     * 这个需要自己实现提取
     * @param urlData
     * @return
     */
    public List<UrlData> collectPageListUrl(UrlData urlData);
}
