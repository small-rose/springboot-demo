package cn.xiaocai.demo.jsoup.spider.data;

import lombok.Data;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/11 23:33
 * @version: v1.0
 */
@Data
public class UrlData {

    private String url ;

    private String tag ;

    private boolean isPage ;

    private boolean isMedia ;


    public boolean isPage() {

        return isPage;
    }

    public boolean isMedia() {

        return isMedia;
    }
}
