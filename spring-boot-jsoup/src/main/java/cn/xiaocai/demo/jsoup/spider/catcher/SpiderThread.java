package cn.xiaocai.demo.jsoup.spider.catcher;

import cn.xiaocai.demo.jsoup.spider.data.*;
import lombok.Data;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/25 14:24
 * @version: v1.0
 */
@Data
public class SpiderThread {

    private String keyName = "default";

    private String doorUrl;

    private int threadNums = 3;

    private CategoryQueue categoryQueue;

    private PageListQueue pageListQueue;

    private LinkSetQueue linkSetQueue;

    private LinkPageQueue linkPageQueue ;

    private PicLinkQueue picLinkQueue;
}
