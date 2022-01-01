package cn.xiaocai.demo.spider.web.vo;

import lombok.Data;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ Rules ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/31 23:43
 * @Version ： 1.0
 **/
@Data
public class Rules {

    private String id ;

    private String door ;
    private Category category ;
    private CategoryPages categoryPages;
    private LinkGroup linkGroup ;
    private LinkGroupPages linkGroupPages ;
    private PicLink picLink ;
}
