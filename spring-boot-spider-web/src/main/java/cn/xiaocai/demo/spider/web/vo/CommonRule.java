package cn.xiaocai.demo.spider.web.vo;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ CommonRule ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/31 23:48
 * @Version ： 1.0
 **/
public class CommonRule {

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
}
