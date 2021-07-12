package cn.xiaocai.demo.jsoup.spider.utils;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/12 0:28
 * @version: v1.0
 */
public class UrlUtils {

    public static final String[] SUFFIXES = {"",""};

    /**
     * 验证是否为媒体类型格式
     * @param absHref
     * @return
     */
    public static boolean endsWithMedias(String absHref) {
        for (String suffix : SUFFIXES){
            if (absHref.contains(suffix)){
                return true;
            }
        }
        return  false ;
    }
}
