package cn.xiaocai.demo.spider.web.vo;

import lombok.Data;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ PicLink ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/31 23:46
 * @Version ： 1.0
 **/

@Data
public class PicLink extends CommonRule{
    protected String eleLocation ;

    protected List<String> skipKeys ;

    protected String imgSrcKey = "abs:src"  ;
}
