package cn.xiaocai.demo.jsoup.spider.rules;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/24 20:58
 * @version: v1.0
 */
@Data
@Slf4j
public abstract class BaseRule {

    /**
     * 元素定位规则
     */
    protected String eleLocation ;

    /**
     * 定义跳过规则
     */
    protected List<String> skipKeys ;


    protected String linkHrefKey = "abs:href"  ;

    protected String imgSrcKey = "abs:src"  ;
    /**
     * 元素后缀规则
     */
    protected String[] suffixes ;


    protected abstract BaseRule getRules();


    public final static String IMG_DATA_ORIGINAL = "abs:data-original" ;
    public final static String NO_ELEMENT_LOCATION = ".abcdefghijklmn" ;



    protected void print(){
        if (skipKeys!=null){
            for (String key : skipKeys){
                log.info("---key: "+key);
            }
        }
    }
}
