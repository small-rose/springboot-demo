package cn.xiaocai.demo.spider.web.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.ToString;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
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
    private String saveLocation = "d:\\download";

    @JSONField(ordinal = 4)
    private Category category ;

    @JSONField(ordinal = 5)
    private CategoryPages categoryPages;

    @JSONField(ordinal = 6)
    private LinkGroup linkGroup ;

    @JSONField(ordinal = 7)
    private LinkGroupPages linkGroupPages ;

    @JSONField(ordinal = 8)
    private PicLink picLink ;

    public String getDoor() {
        return door;
    }

}
