package cn.xiaocai.demo.spider.web.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.ToString;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ Rules ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/31 23:43
 * @Version ： 1.0
 **/
@Data
@ToString
public class Rules {

    @JSONField(ordinal = 1)
    private String id ;

    @JSONField(ordinal = 2)
    private String door ;

    @JSONField(ordinal = 3)
    private Category category ;

    @JSONField(ordinal = 4)
    private CategoryPages categoryPages;

    @JSONField(ordinal = 5)
    private LinkGroup linkGroup ;

    @JSONField(ordinal = 6)
    private LinkGroupPages linkGroupPages ;

    @JSONField(ordinal = 7)
    private PicLink picLink ;
}
