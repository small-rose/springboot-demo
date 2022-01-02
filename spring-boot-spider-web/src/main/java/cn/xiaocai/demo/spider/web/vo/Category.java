package cn.xiaocai.demo.spider.web.vo;

import lombok.Data;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ Category ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/31 23:44
 * @Version ： 1.0
 **/
@Data
public class Category  {

    /**
     * 元素定位规则
     */
    protected String eleLocation ;
    /**
     * 指定分类
     */
    protected String categoryName ;
    /**
     * 定义跳过规则
     */
    protected List<String> skipKeys ;

    /**
     * 默认连接取值方式
     */
    protected String linkHrefKey = "abs:href"  ;

}
